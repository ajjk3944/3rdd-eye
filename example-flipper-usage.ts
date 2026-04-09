// Example: How to use Flipper-IRDB in your app

// ============================================
// 1. PARSE FLIPPER IR FILE
// ============================================

interface IRCommand {
  name: string;
  type: 'parsed' | 'raw';
  protocol?: string;
  address?: string;
  command?: string;
  frequency?: number;
  data?: number[];
}

function parseFlipperIR(content: string): IRCommand[] {
  const lines = content.split('\n');
  const commands: IRCommand[] = [];
  let current: Partial<IRCommand> = {};

  for (const line of lines) {
    const trimmed = line.trim();
    if (trimmed.startsWith('#') || !trimmed) continue;

    if (trimmed.startsWith('name:')) {
      if (current.name) commands.push(current as IRCommand);
      current = { name: trimmed.substring(5).trim() };
    } else if (trimmed.startsWith('type:')) {
      current.type = trimmed.substring(5).trim() as 'parsed' | 'raw';
    } else if (trimmed.startsWith('protocol:')) {
      current.protocol = trimmed.substring(9).trim();
    } else if (trimmed.startsWith('address:')) {
      current.address = trimmed.substring(8).trim();
    } else if (trimmed.startsWith('command:')) {
      current.command = trimmed.substring(8).trim();
    } else if (trimmed.startsWith('frequency:')) {
      current.frequency = parseInt(trimmed.substring(10).trim());
    } else if (trimmed.startsWith('data:')) {
      const dataStr = trimmed.substring(5).trim();
      current.data = dataStr.split(/\s+/).map(n => parseInt(n));
    }
  }

  if (current.name) commands.push(current as IRCommand);
  return commands;
}

// ============================================
// 2. CONVERT TO ANDROID FORMAT
// ============================================

function convertToAndroidPattern(cmd: IRCommand): { frequency: number; pattern: number[] } {
  // RAW format - already compatible!
  if (cmd.type === 'raw' && cmd.data) {
    return {
      frequency: cmd.frequency || 38000,
      pattern: cmd.data
    };
  }

  // PARSED format - convert protocol to raw
  if (cmd.type === 'parsed' && cmd.protocol) {
    return convertProtocol(cmd.protocol, cmd.address!, cmd.command!);
  }

  throw new Error('Invalid command format');
}

function convertProtocol(protocol: string, address: string, command: string) {
  if (protocol === 'Samsung32') {
    return convertSamsung32(address, command);
  }
  if (protocol === 'NEC') {
    return convertNEC(address, command);
  }
  throw new Error(`Unsupported protocol: ${protocol}`);
}

function convertSamsung32(address: string, command: string) {
  const addr = parseInt(address.split(' ')[0], 16);
  const cmd = parseInt(command.split(' ')[0], 16);
  
  const pattern = [4500, 4500]; // Header
  
  // Address bits (8 bits)
  for (let i = 7; i >= 0; i--) {
    pattern.push(560, (addr & (1 << i)) ? 1690 : 560);
  }
  
  // Command bits (8 bits)
  for (let i = 7; i >= 0; i--) {
    pattern.push(560, (cmd & (1 << i)) ? 1690 : 560);
  }
  
  pattern.push(560); // Stop bit
  
  return { frequency: 38000, pattern };
}

function convertNEC(address: string, command: string) {
  const addr = parseInt(address, 16);
  const cmd = parseInt(command, 16);
  
  const pattern = [9000, 4500]; // NEC header
  
  // Address + inverse
  for (let i = 0; i < 8; i++) {
    pattern.push(560, (addr & (1 << i)) ? 1690 : 560);
  }
  for (let i = 0; i < 8; i++) {
    pattern.push(560, (~addr & (1 << i)) ? 1690 : 560);
  }
  
  // Command + inverse
  for (let i = 0; i < 8; i++) {
    pattern.push(560, (cmd & (1 << i)) ? 1690 : 560);
  }
  for (let i = 0; i < 8; i++) {
    pattern.push(560, (~cmd & (1 << i)) ? 1690 : 560);
  }
  
  pattern.push(560);
  
  return { frequency: 38000, pattern };
}

// ============================================
// 3. USAGE EXAMPLE
// ============================================

async function example() {
  // Load Samsung TV IR file
  const response = await fetch('/ir-database/TVs/Samsung/Samsung_AA59-00602A.ir');
  const content = await response.text();
  
  // Parse commands
  const commands = parseFlipperIR(content);
  console.log('Available commands:', commands.map(c => c.name));
  // Output: ['Sams_02', 'Volup', 'Voldown']
  
  // Find Power button
  const powerCmd = commands.find(c => c.name === 'Sams_02');
  if (!powerCmd) throw new Error('Power command not found');
  
  // Convert to Android format
  const { frequency, pattern } = convertToAndroidPattern(powerCmd);
  
  console.log('Frequency:', frequency); // 38000
  console.log('Pattern:', pattern);     // [4500, 4500, 560, 560, ...]
  
  // Send via Capacitor IR plugin
  // await IRBlaster.transmit({ frequency, pattern });
}

// ============================================
// 4. COMPLETE REMOTE CONTROL EXAMPLE
// ============================================

class FlipperRemote {
  private commands: Map<string, IRCommand> = new Map();
  
  async loadDevice(category: string, brand: string, model: string) {
    const url = `/ir-database/${category}/${brand}/${model}.ir`;
    const response = await fetch(url);
    const content = await response.text();
    
    const commands = parseFlipperIR(content);
    commands.forEach(cmd => {
      this.commands.set(cmd.name.toLowerCase(), cmd);
    });
    
    console.log(`Loaded ${commands.length} commands for ${brand} ${model}`);
  }
  
  async sendCommand(buttonName: string) {
    const cmd = this.commands.get(buttonName.toLowerCase());
    if (!cmd) {
      throw new Error(`Command '${buttonName}' not found`);
    }
    
    const { frequency, pattern } = convertToAndroidPattern(cmd);
    
    // Send via your IR blaster plugin
    console.log(`Sending ${buttonName}: freq=${frequency}, pattern length=${pattern.length}`);
    // await IRBlaster.transmit({ frequency, pattern });
  }
  
  getAvailableButtons(): string[] {
    return Array.from(this.commands.keys());
  }
}

// Usage:
async function useRemote() {
  const remote = new FlipperRemote();
  
  // Load Samsung TV
  await remote.loadDevice('TVs', 'Samsung', 'Samsung_AA59-00602A');
  
  // See available buttons
  console.log('Buttons:', remote.getAvailableButtons());
  // Output: ['sams_02', 'volup', 'voldown']
  
  // Send commands
  await remote.sendCommand('volup');
  await remote.sendCommand('voldown');
}

// ============================================
// 5. BUILD DEVICE INDEX
// ============================================

interface DeviceIndex {
  [category: string]: {
    [brand: string]: string[]; // model names
  };
}

async function buildDeviceIndex(): Promise<DeviceIndex> {
  // This would scan your ir-database folder
  // For now, example structure:
  return {
    TVs: {
      Samsung: ['Samsung_AA59-00602A', 'Samsung_AA59-00741A'],
      LG: ['LG_AKB75095307', 'LG_Magic_Remote'],
      Sony: ['Sony_RM-ED047', 'Sony_RM-YD103']
    },
    ACs: {
      Daikin: ['Daikin_ARC433A1', 'Daikin_ARC452A1'],
      LG: ['LG_6711A20096A']
    }
  };
}

export {
  parseFlipperIR,
  convertToAndroidPattern,
  FlipperRemote,
  buildDeviceIndex
};
