# ARP Spoofing & Packet Analyzer - Frontend Code

এই file এ ARP Spoofing Detector এবং Packet Analyzer এর সম্পূর্ণ frontend code আছে।

## File Location
`src/components/WiFiSecurity.tsx`

---

## 1. ARP Spoofing Detector

### Function: `scanArpTable()`
**Location**: Line 2056-2220

```typescript
const scanArpTable = async () => {
  console.log('scanArpTable called')
  console.log('isCapacitor:', isCapacitor)
  
  if (scanningArp) {
    toast.info('Scan already in progress...')
    return
  }

  setScanningArp(true)
  setArpDevices([])
  setArpSpoofing(false)
  toast.info('Scanning ARP table for anomalies...')
  
  try {
    const netScanner = getNetworkScanner()
    console.log('netScanner:', netScanner)
    
    if (netScanner && isCapacitor) {
      // Native Android scan
      try {
        const arpResult = await netScanner.getArpTable()
        const devices = arpResult.devices || []
        
        if (devices.length === 0) {
          toast.warning('No devices found in ARP table')
          setScanningArp(false)
          return
        }
        
        // Check for suspicious patterns
        const ipMap = new Map()
        const macMap = new Map()
        let spoofingDetected = false
        
        devices.forEach((device: any) => {
          // Check duplicate IPs
          if (ipMap.has(device.ipAddress)) {
            device.suspicious = true
            device.reason = 'Duplicate IP address detected'
            spoofingDetected = true
          } else {
            ipMap.set(device.ipAddress, device)
          }
          
          // Check duplicate MACs
          if (device.macAddress && macMap.has(device.macAddress)) {
            device.suspicious = true
            device.reason = 'Duplicate MAC address detected'
            spoofingDetected = true
          } else if (device.macAddress) {
            macMap.set(device.macAddress, device)
          }
          
          // Check locally administered MACs (possible spoofing)
          if (device.macAddress) {
            const firstOctet = parseInt(device.macAddress.substring(0, 2), 16)
            if ((firstOctet & 0x02) !== 0) {
              device.suspicious = true
              device.reason = 'Locally administered MAC (possible spoofing)'
              spoofingDetected = true
            }
          }
        })
        
        setArpDevices(devices)
        setArpSpoofing(spoofingDetected)
        
        if (spoofingDetected) {
          toast.error(`⚠️ Potential ARP spoofing detected! Found ${devices.filter((d: any) => d.suspicious).length} suspicious entries`)
        } else {
          toast.success(`✓ No ARP spoofing detected - ${devices.length} devices scanned`)
        }
        
        setScanningArp(false)
        return
        
      } catch (nativeError) {
        console.error('Native ARP scan failed:', nativeError)
        toast.error(`Native scan failed: ${nativeError}`)
        setScanningArp(false)
        return
      }
    }
    
    // Demo mode (web/browser)
    toast.warning('Running in demo mode - Native plugin not available')
    await new Promise(resolve => setTimeout(resolve, 2000))
    
    const demoDevices = [
      { ipAddress: '192.168.1.1', macAddress: '00:1A:2B:3C:4D:5E', deviceName: 'Router', suspicious: false },
      { ipAddress: '192.168.1.100', macAddress: 'AA:BB:CC:DD:EE:FF', deviceName: 'Phone', suspicious: false },
      { ipAddress: '192.168.1.101', macAddress: '11:22:33:44:55:66', deviceName: 'Laptop', suspicious: false },
      { ipAddress: '192.168.1.102', macAddress: '77:88:99:AA:BB:CC', deviceName: 'Smart TV', suspicious: false },
      { ipAddress: '192.168.1.103', macAddress: 'DD:EE:FF:00:11:22', deviceName: 'Tablet', suspicious: false }
    ]
    
    // Randomly add suspicious device
    if (Math.random() > 0.5) {
      demoDevices.push({
        ipAddress: '192.168.1.104',
        macAddress: '02:00:00:00:00:01',
        deviceName: 'Unknown Device',
        suspicious: true
      } as any)
      
      const suspiciousDevice = demoDevices[demoDevices.length - 1] as any
      suspiciousDevice.reason = 'Locally administered MAC (possible spoofing)'
    }
    
    const spoofingDetected = demoDevices.some(d => d.suspicious)
    
    setArpDevices(demoDevices)
    setArpSpoofing(spoofingDetected)
    
    if (spoofingDetected) {
      toast.error(`⚠️ Potential ARP spoofing detected!`)
    } else {
      toast.success(`✓ No ARP spoofing detected - ${demoDevices.length} devices scanned`)
    }
    
  } catch (err: any) {
    console.error('Error scanning ARP:', err)
    toast.error(`Failed to scan ARP table: ${err?.message || 'Unknown error'}`)
  } finally {
    setScanningArp(false)
  }
}
```

### UI Component: ARP Spoofing View
**Location**: Line 4306-4500

```typescript
if (currentView === 'arp-spoofing') {
  return (
    <div className="space-y-4">
      {/* Back Button */}
      <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-pink-900/30 pb-4 mb-4">
        <div className="flex items-center justify-between">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => navigateToTool('main')}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back
          </Button>
          <Button 
            onClick={scanArpTable} 
            disabled={scanningArp}
            className="bg-pink-600 hover:bg-pink-700"
          >
            {scanningArp ? (
              <><Activity className="w-4 h-4 mr-2 animate-spin" /> Scanning...</>
            ) : (
              <><Play className="w-4 h-4 mr-2" /> Scan ARP</>
            )}
          </Button>
        </div>
      </div>

      {/* Title */}
      <div>
        <h2 className="text-xl font-bold text-white flex items-center gap-2">
          <AlertTriangle className="w-5 h-5 text-pink-400" />
          ARP Spoofing Detector
        </h2>
        <p className="text-xs text-gray-500 mt-1">
          Detect Man-in-the-Middle attacks on your network
        </p>
      </div>

      {/* Info Card */}
      <Card className="bg-pink-900/20 border-pink-500/30">
        <CardContent className="p-4">
          <div className="flex items-start gap-3">
            <Info className="w-5 h-5 text-pink-400 flex-shrink-0" />
            <div>
              <p className="text-sm font-medium text-pink-400">What is ARP Spoofing?</p>
              <p className="text-xs text-gray-400 mt-1">
                Attackers can intercept network traffic by poisoning the ARP table, 
                redirecting data through their device.
              </p>
            </div>
          </div>
        </CardContent>
      </Card>

      {/* Warning if spoofing detected */}
      {arpSpoofing && (
        <Card className="bg-red-900/20 border-red-500/30">
          <CardContent className="p-4">
            <div className="flex items-start gap-3">
              <AlertTriangle className="w-5 h-5 text-red-400 flex-shrink-0" />
              <div>
                <p className="text-sm font-medium text-red-400">
                  ⚠️ Potential ARP Spoofing Detected!
                </p>
                <p className="text-xs text-gray-400 mt-1">
                  Suspicious activity found in ARP table. Check devices below.
                </p>
              </div>
            </div>
          </CardContent>
        </Card>
      )}

      {/* Device List */}
      {arpDevices.length > 0 && (
        <Card className="bg-[#0d120d] border-pink-900/30">
          <CardHeader>
            <CardTitle className="text-white text-sm">
              ARP Table ({arpDevices.length} entries)
            </CardTitle>
          </CardHeader>
          <CardContent>
            <ScrollArea className="h-[400px]">
              <div className="space-y-3">
                {arpDevices.map((device: any, idx: number) => (
                  <div 
                    key={idx} 
                    className={`p-3 rounded border ${
                      device.suspicious 
                        ? 'bg-red-900/10 border-red-500/30' 
                        : 'bg-cyan-900/10 border-cyan-500/30'
                    }`}
                  >
                    <div className="flex items-start justify-between mb-2">
                      <div>
                        <p className="text-sm font-medium text-white">
                          {device.ipAddress}
                        </p>
                        <p className="text-xs text-gray-500">
                          {device.macAddress || 'Unknown MAC'}
                        </p>
                      </div>
                      {device.suspicious && (
                        <Badge className="bg-red-500/20 text-red-400">
                          SUSPICIOUS
                        </Badge>
                      )}
                    </div>
                    {device.reason && (
                      <p className="text-xs text-red-400 mt-2">
                        ⚠️ {device.reason}
                      </p>
                    )}
                  </div>
                ))}
              </div>
            </ScrollArea>
          </CardContent>
        </Card>
      )}

      {/* Empty State */}
      {arpDevices.length === 0 && !scanningArp && (
        <Card className="bg-[#0d120d] border-pink-900/30">
          <CardContent className="p-8 text-center">
            <AlertTriangle className="w-12 h-12 mx-auto text-gray-600 mb-3" />
            <p className="text-gray-400">No scan results</p>
            <p className="text-xs text-gray-600 mt-1">
              Tap 'Scan ARP' to check for spoofing
            </p>
          </CardContent>
        </Card>
      )}
    </div>
  )
}
```

---

## 2. Packet Analyzer

### Function: `startPacketAnalysis()`
**Location**: Line 2222-2365

```typescript
const startPacketAnalysis = async () => {
  console.log('startPacketAnalysis called')
  console.log('isCapacitor:', isCapacitor)
  
  setAnalyzingPackets(true)
  setPacketStats(null)
  toast.info('Starting packet analysis...')
  
  try {
    const packetSniffer = getPacketSniffer()
    console.log('packetSniffer:', packetSniffer)
    
    if (packetSniffer && isCapacitor) {
      // Native Android analysis
      try {
        // Check if Traffic Monitor is running
        const status = await packetSniffer.isCapturing()
        console.log('Capture status:', status)
        
        if (!status.capturing) {
          toast.error('Packet Sniffer not running. Please start Traffic Monitor first.')
          setAnalyzingPackets(false)
          return
        }
        
        // Get live stats and connections
        const stats = await packetSniffer.getLiveStats()
        const connections = await packetSniffer.getRecentConnections({ limit: 100 })
        
        console.log('Stats:', stats)
        console.log('Connections:', connections)
        
        if (stats.success && connections.success) {
          // Analyze protocols
          const protocols: any = { TCP: 0, UDP: 0, ICMP: 0, Other: 0 }
          connections.connections.forEach((conn: any) => {
            if (protocols[conn.protocol] !== undefined) {
              protocols[conn.protocol]++
            } else {
              protocols.Other++
            }
          })
          
          // Get top IPs
          const ipCounts: any = {}
          connections.connections.forEach((conn: any) => {
            ipCounts[conn.destinationIP] = (ipCounts[conn.destinationIP] || 0) + 1
          })
          const topIPs = Object.entries(ipCounts)
            .sort((a: any, b: any) => b[1] - a[1])
            .slice(0, 10)
            .map(([ip, count]: any) => ({ ip, count, service: 'Unknown' }))
          
          // Get top ports
          const portCounts: any = {}
          const portServices: any = {
            80: 'HTTP', 443: 'HTTPS', 53: 'DNS', 22: 'SSH', 21: 'FTP',
            25: 'SMTP', 110: 'POP3', 143: 'IMAP', 3306: 'MySQL', 5432: 'PostgreSQL',
            8080: 'HTTP-Alt', 8443: 'HTTPS-Alt'
          }
          connections.connections.forEach((conn: any) => {
            portCounts[conn.destinationPort] = (portCounts[conn.destinationPort] || 0) + 1
          })
          const topPorts = Object.entries(portCounts)
            .sort((a: any, b: any) => b[1] - a[1])
            .slice(0, 10)
            .map(([port, count]: any) => ({
              port: parseInt(port),
              service: portServices[port] || 'Unknown',
              count
            }))
          
          setPacketStats({
            protocols,
            topIPs,
            topPorts,
            packetsPerSecond: Math.round(stats.stats.totalPackets / (stats.stats.duration || 1)),
            totalPackets: stats.stats.totalPackets
          })
          
          toast.success('Packet analysis complete')
          setAnalyzingPackets(false)
          return
          
        } else {
          throw new Error('Failed to get packet statistics')
        }
      } catch (nativeError) {
        console.error('Native packet analysis failed:', nativeError)
        toast.error(`Native analysis failed: ${nativeError}`)
        setAnalyzingPackets(false)
        return
      }
    }
    
    // Demo mode (web/browser)
    toast.warning('Running in demo mode - Native plugin not available')
    await new Promise(resolve => setTimeout(resolve, 3000))
    
    const demoStats = {
      protocols: {
        TCP: Math.floor(Math.random() * 40) + 50,
        UDP: Math.floor(Math.random() * 30) + 15,
        ICMP: Math.floor(Math.random() * 10) + 2,
        Other: Math.floor(Math.random() * 8) + 1
      },
      topIPs: [
        { ip: '142.250.185.46', count: Math.floor(Math.random() * 200) + 100, service: 'Google' },
        { ip: '31.13.64.35', count: Math.floor(Math.random() * 150) + 80, service: 'Facebook' },
        { ip: '151.101.1.140', count: Math.floor(Math.random() * 120) + 60, service: 'Reddit' },
        { ip: '104.244.42.1', count: Math.floor(Math.random() * 100) + 50, service: 'Twitter' },
        { ip: '13.107.42.14', count: Math.floor(Math.random() * 80) + 40, service: 'Microsoft' },
        { ip: '172.217.14.110', count: Math.floor(Math.random() * 70) + 30, service: 'YouTube' },
        { ip: '52.84.223.104', count: Math.floor(Math.random() * 60) + 25, service: 'Amazon' }
      ],
      topPorts: [
        { port: 443, service: 'HTTPS', count: Math.floor(Math.random() * 800) + 400 },
        { port: 80, service: 'HTTP', count: Math.floor(Math.random() * 300) + 150 },
        { port: 53, service: 'DNS', count: Math.floor(Math.random() * 200) + 100 },
        { port: 8080, service: 'HTTP-Alt', count: Math.floor(Math.random() * 80) + 40 },
        { port: 22, service: 'SSH', count: Math.floor(Math.random() * 30) + 10 },
        { port: 25, service: 'SMTP', count: Math.floor(Math.random() * 20) + 5 },
        { port: 993, service: 'IMAPS', count: Math.floor(Math.random() * 15) + 3 }
      ],
      packetsPerSecond: Math.floor(Math.random() * 50) + 20,
      totalPackets: Math.floor(Math.random() * 2000) + 1000
    }
    
    setPacketStats(demoStats)
    toast.success('Packet analysis complete (demo data)')
    
  } catch (err: any) {
    console.error('Error analyzing packets:', err)
    toast.error(`Failed to analyze packets: ${err?.message || 'Unknown error'}`)
  } finally {
    setAnalyzingPackets(false)
  }
}
```

### UI Component: Packet Analyzer View
**Location**: Line 5019-5170

```typescript
if (currentView === 'packet-analyzer') {
  return (
    <div className="space-y-4">
      {/* Back Button */}
      <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-violet-900/30 pb-4 mb-4">
        <div className="flex items-center justify-between">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={() => navigateToTool('main')}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back
          </Button>
          <Button 
            onClick={startPacketAnalysis} 
            disabled={analyzingPackets}
            className="bg-violet-600 hover:bg-violet-700"
          >
            {analyzingPackets ? (
              <><Loader2 className="w-4 h-4 mr-2 animate-spin" /> Analyzing...</>
            ) : (
              <><Play className="w-4 h-4 mr-2" /> Analyze</>
            )}
          </Button>
        </div>
      </div>

      {/* Title */}
      <div>
        <h2 className="text-xl font-bold text-white flex items-center gap-2">
          <Terminal className="w-5 h-5 text-violet-400" />
          Packet Analyzer
          <Badge className="bg-violet-600 text-white text-[10px] px-2 py-0.5">
            Advanced
          </Badge>
        </h2>
        <p className="text-xs text-gray-500 mt-1">
          Analyze network traffic patterns and protocols
        </p>
      </div>

      {/* Warning Card */}
      <Card className="bg-violet-900/20 border-violet-500/30">
        <CardContent className="p-4">
          <div className="flex items-start gap-3">
            <AlertTriangle className="w-5 h-5 text-violet-400 flex-shrink-0" />
            <div>
              <p className="text-sm font-medium text-violet-400">
                Advanced Users Only
              </p>
              <p className="text-xs text-gray-400 mt-1">
                This tool requires the ThirdEye VPN service to be running. 
                Start it from the Traffic Monitor tab.
              </p>
            </div>
          </div>
        </CardContent>
      </Card>

      {/* Results */}
      {packetStats && (
        <>
          {/* Protocol Distribution */}
          <Card className="bg-[#0d120d] border-violet-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">
                Protocol Distribution
              </CardTitle>
            </CardHeader>
            <CardContent>
              <div className="space-y-3">
                {Object.entries(packetStats.protocols).map(([protocol, count]: any) => {
                  const total = Object.values(packetStats.protocols)
                    .reduce((a: any, b: any) => a + b, 0) as number
                  const percentage = total > 0 ? (count / total) * 100 : 0
                  return (
                    <div key={protocol}>
                      <div className="flex justify-between text-xs mb-1">
                        <span className="text-gray-400">{protocol}</span>
                        <span className="text-white">
                          {percentage.toFixed(1)}% ({count})
                        </span>
                      </div>
                      <Progress value={percentage} className="h-2" />
                    </div>
                  )
                })}
              </div>
            </CardContent>
          </Card>

          {/* Top Destination IPs */}
          <Card className="bg-[#0d120d] border-violet-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">
                Top 10 Destination IPs
              </CardTitle>
            </CardHeader>
            <CardContent>
              <ScrollArea className="h-[200px]">
                <div className="space-y-2">
                  {packetStats.topIPs.map((item: any, idx: number) => (
                    <div 
                      key={idx} 
                      className="flex items-center justify-between p-2 rounded 
                                 bg-violet-900/10 border border-violet-900/30"
                    >
                      <div>
                        <p className="text-sm text-white font-mono">{item.ip}</p>
                        <p className="text-xs text-gray-500">{item.service}</p>
                      </div>
                      <Badge className="bg-violet-600 text-white">
                        {item.count}
                      </Badge>
                    </div>
                  ))}
                </div>
              </ScrollArea>
            </CardContent>
          </Card>

          {/* Top Ports */}
          <Card className="bg-[#0d120d] border-violet-900/30">
            <CardHeader>
              <CardTitle className="text-white text-sm">
                Top 10 Destination Ports
              </CardTitle>
            </CardHeader>
            <CardContent>
              <ScrollArea className="h-[200px]">
                <div className="space-y-2">
                  {packetStats.topPorts.map((item: any, idx: number) => (
                    <div 
                      key={idx} 
                      className="flex items-center justify-between p-2 rounded 
                                 bg-violet-900/10 border border-violet-900/30"
                    >
                      <div>
                        <p className="text-sm text-white font-mono">
                          Port {item.port}
                        </p>
                        <p className="text-xs text-gray-500">{item.service}</p>
                      </div>
                      <Badge className="bg-violet-600 text-white">
                        {item.count}
                      </Badge>
                    </div>
                  ))}
                </div>
              </ScrollArea>
            </CardContent>
          </Card>

          {/* Stats Summary */}
          <Card className="bg-[#0d120d] border-cyan-900/30">
            <CardContent className="p-4">
              <div className="grid grid-cols-2 gap-4">
                <div>
                  <p className="text-xs text-gray-500">Packets/Second</p>
                  <p className="text-2xl font-bold text-cyan-400">
                    {packetStats.packetsPerSecond}
                  </p>
                </div>
                <div>
                  <p className="text-xs text-gray-500">Total Packets</p>
                  <p className="text-2xl font-bold text-cyan-400">
                    {packetStats.totalPackets.toLocaleString()}
                  </p>
                </div>
              </div>
            </CardContent>
          </Card>
        </>
      )}

      {/* Empty State */}
      {!packetStats && !analyzingPackets && (
        <Card className="bg-[#0d120d] border-violet-900/30">
          <CardContent className="p-8 text-center">
            <Terminal className="w-12 h-12 mx-auto text-gray-600 mb-3" />
            <p className="text-gray-400">No analysis data</p>
            <p className="text-xs text-gray-600 mt-1">
              Tap 'Analyze' to start packet analysis
            </p>
          </CardContent>
        </Card>
      )}
    </div>
  )
}
```

---

## State Variables

```typescript
// ARP Spoofing
const [scanningArp, setScanningArp] = useState(false)
const [arpDevices, setArpDevices] = useState<any[]>([])
const [arpSpoofing, setArpSpoofing] = useState(false)

// Packet Analyzer
const [analyzingPackets, setAnalyzingPackets] = useState(false)
const [packetStats, setPacketStats] = useState<any>(null)
```

---

## Imports Required

```typescript
import { getNetworkScanner, getPacketSniffer, isCapacitor } from '@/lib/native-plugins'
import { toast } from 'sonner'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Badge } from '@/components/ui/badge'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Progress } from '@/components/ui/progress'
import { 
  AlertTriangle, 
  Info, 
  Play, 
  Activity, 
  ArrowLeft, 
  Terminal, 
  Loader2 
} from 'lucide-react'
```

---

## Summary

- **ARP Spoofing Detector**: Network এ Man-in-the-Middle attack detect করে
- **Packet Analyzer**: Network traffic analyze করে (protocols, IPs, ports)
- উভয়ই Android এ native plugin ব্যবহার করে
- Web/browser এ demo mode চলে
- Real-time data দেখায় Android এ

এই code গুলো `src/components/WiFiSecurity.tsx` file এ আছে।
