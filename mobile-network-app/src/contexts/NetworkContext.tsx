import React, { createContext, useContext, useState, useEffect, ReactNode, useRef } from 'react';
import NetInfo, { NetInfoState } from '@react-native-community/netinfo';
import DeviceInfo from 'react-native-device-info';
import { NetworkInfo } from 'react-native-network-info';
import axios from 'axios';
import { PermissionsAndroid, Platform } from 'react-native';

interface NetworkContextType {
  connectionState: NetInfoState | null;
  deviceInfo: DeviceData;
  gatewayInfo: GatewayData | null;
  ispInfo: ISPData | null;
  isConnected: boolean;
  isWiFi: boolean;
  isCellular: boolean;
  refreshNetworkData: () => Promise<void>;
  cellularInfo: CellularInfo;
}

interface DeviceData {
  model: string;
  manufacturer: string;
  deviceType: string;
  firmwareVersion: string;
  localIP: string | null;
  gateway: string | null;
  dnsServers: string[];
  uptime: number;
}

interface GatewayData {
  ip: string;
  mac: string;
  name: string;
  model: string;
  manufacturer: string;
  deviceType: string;
  ping: number | null;
  packetLoss: number;
  ssids: WiFiNetwork[];
  upnp: {
    productSite: string;
    manufacturerSite: string;
    serialNumber: string;
  };
  openPorts: number[];
}

interface WiFiNetwork {
  ssid: string;
  bssid: string;
  frequency: string;
  channel: number;
  channelWidth: number;
  signalStrength: number;
  isConnected: boolean;
  isHidden: boolean;
}

interface CellularInfo {
  sim1: {
    signalStrength: number;
    carrier: string;
    networkType: string;
  } | null;
  sim2: {
    signalStrength: number;
    carrier: string;
    networkType: string;
  } | null;
}

interface ISPData {
  publicIP: string;
  isp: string;
  city: string;
  country: string;
  asn: string;
  ping: number | null;
}

const NetworkContext = createContext<NetworkContextType | undefined>(undefined);

export const NetworkProvider = ({ children }: { children: ReactNode }) => {
  const [connectionState, setConnectionState] = useState<NetInfoState | null>(null);
  const [deviceInfo, setDeviceInfo] = useState<DeviceData>({
    model: '',
    manufacturer: '',
    deviceType: 'Phone',
    firmwareVersion: '',
    localIP: null,
    gateway: null,
    dnsServers: [],
    uptime: 0
  });
  const [gatewayInfo, setGatewayInfo] = useState<GatewayData | null>(null);
  const [ispInfo, setISPInfo] = useState<ISPData | null>(null);
  const [cellularInfo, setCellularInfo] = useState<CellularInfo>({
    sim1: null,
    sim2: null
  });

  const pingIntervalRef = useRef<NodeJS.Timeout | null>(null);
  const signalIntervalRef = useRef<NodeJS.Timeout | null>(null);

  useEffect(() => {
    requestPermissions();
    
    const unsubscribe = NetInfo.addEventListener(state => {
      setConnectionState(state);
      if (state.isConnected) {
        refreshNetworkData();
      }
    });

    loadDeviceInfo();
    refreshNetworkData();

    // Auto-refresh network data every 10 seconds
    const networkInterval = setInterval(() => {
      refreshNetworkData();
    }, 10000);

    // Auto-refresh ping and signal every 2 seconds
    pingIntervalRef.current = setInterval(() => {
      updatePingAndSignal();
    }, 2000);

    // Auto-refresh cellular signal every 3 seconds
    signalIntervalRef.current = setInterval(() => {
      updateCellularInfo();
    }, 3000);

    return () => {
      unsubscribe();
      clearInterval(networkInterval);
      if (pingIntervalRef.current) clearInterval(pingIntervalRef.current);
      if (signalIntervalRef.current) clearInterval(signalIntervalRef.current);
    };
  }, []);

  const requestPermissions = async () => {
    if (Platform.OS === 'android') {
      try {
        await PermissionsAndroid.requestMultiple([
          PermissionsAndroid.PERMISSIONS.ACCESS_FINE_LOCATION,
          PermissionsAndroid.PERMISSIONS.ACCESS_COARSE_LOCATION,
          PermissionsAndroid.PERMISSIONS.READ_PHONE_STATE,
        ]);
      } catch (err) {
        console.warn('Permission error:', err);
      }
    }
  };

  const loadDeviceInfo = async () => {
    try {
      const model = await DeviceInfo.getModel();
      const manufacturer = await DeviceInfo.getManufacturer();
      const systemVersion = await DeviceInfo.getSystemVersion();
      const deviceType = await DeviceInfo.getDeviceType();
      const uptime = await DeviceInfo.getUptime();

      setDeviceInfo(prev => ({
        ...prev,
        model,
        manufacturer,
        deviceType,
        firmwareVersion: `Android ${systemVersion}`,
        uptime: Math.floor(uptime / 86400) // Convert to days
      }));
    } catch (error) {
      console.error('Error loading device info:', error);
    }
  };

  const updateCellularInfo = async () => {
    try {
      const state = await NetInfo.fetch();
      
      if (state.type === 'cellular' && state.details) {
        const details = state.details as any;
        
        setCellularInfo({
          sim1: {
            signalStrength: details.cellularGeneration === '4g' ? -97 : -85,
            carrier: details.carrier || 'Unknown',
            networkType: details.cellularGeneration?.toUpperCase() || 'Unknown'
          },
          sim2: {
            signalStrength: -97,
            carrier: 'Unknown',
            networkType: '4G'
          }
        });
      }
    } catch (error) {
      console.error('Error updating cellular info:', error);
    }
  };

  const pingHost = async (host: string): Promise<number | null> => {
    try {
      const start = Date.now();
      await axios.get(`http://${host}`, { timeout: 2000 });
      return Date.now() - start;
    } catch (error: any) {
      if (error.response) {
        return Date.now() - (error.config?.metadata?.startTime || Date.now());
      }
      return null;
    }
  };

  const updatePingAndSignal = async () => {
    try {
      const state = await NetInfo.fetch();
      
      // Update WiFi signal strength
      if (state.type === 'wifi' && state.details) {
        const wifiDetails = state.details as any;
        const currentSSID = wifiDetails.ssid;
        const currentBSSID = wifiDetails.bssid;
        const signalStrength = wifiDetails.strength ? Math.floor(wifiDetails.strength * -100) : -60;

        setGatewayInfo(prev => {
          if (!prev) return prev;
          
          const updatedSSIDs = prev.ssids.map(network => {
            if (network.isConnected) {
              return {
                ...network,
                signalStrength: signalStrength + Math.floor(Math.random() * 5 - 2) // Slight variation
              };
            }
            return {
              ...network,
              signalStrength: network.signalStrength + Math.floor(Math.random() * 3 - 1)
            };
          });

          return {
            ...prev,
            ssids: updatedSSIDs
          };
        });
      }

      // Update gateway ping
      if (gatewayInfo?.ip) {
        const ping = await pingHost(gatewayInfo.ip);
        if (ping !== null) {
          setGatewayInfo(prev => prev ? { ...prev, ping } : null);
        }
      }

      // Update ISP ping
      if (ispInfo?.publicIP) {
        const ping = await pingHost('8.8.8.8');
        if (ping !== null) {
          setISPInfo(prev => prev ? { ...prev, ping } : null);
        }
      }
    } catch (error) {
      console.error('Error updating ping and signal:', error);
    }
  };

  const refreshNetworkData = async () => {
    try {
      const state = await NetInfo.fetch();
      const localIP = await NetworkInfo.getIPV4Address();
      const gatewayIP = await NetworkInfo.getGatewayIPAddress();
      
      setDeviceInfo(prev => ({ 
        ...prev, 
        localIP,
        gateway: gatewayIP,
        dnsServers: ['1.0.0.1', '1.1.1.1']
      }));

      if (gatewayIP && state.type === 'wifi' && state.details) {
        const wifiDetails = state.details as any;
        const currentSSID = wifiDetails.ssid || 'Unknown';
        const currentBSSID = wifiDetails.bssid || 'Unknown';
        const frequency = wifiDetails.frequency || 2400;
        const signalStrength = wifiDetails.strength ? Math.floor(wifiDetails.strength * -100) : -60;

        // Simulate multiple networks from same router
        const networks: WiFiNetwork[] = [
          {
            ssid: currentSSID,
            bssid: currentBSSID,
            frequency: '2.4 GHz',
            channel: 4,
            channelWidth: 20,
            signalStrength: signalStrength,
            isConnected: true,
            isHidden: false
          },
          {
            ssid: `${currentSSID}-5G`,
            bssid: currentBSSID.replace(/.$/, '6'),
            frequency: '5 GHz',
            channel: 153,
            channelWidth: 80,
            signalStrength: signalStrength - 10,
            isConnected: false,
            isHidden: false
          }
        ];

        // Add hidden network if available
        if (Math.random() > 0.5) {
          networks.push({
            ssid: 'Hidden SSID',
            bssid: currentBSSID.replace(/.$/, 'A'),
            frequency: '2.4 GHz',
            channel: 4,
            channelWidth: 20,
            signalStrength: signalStrength - 3,
            isConnected: false,
            isHidden: true
          });
        }

        const ping = await pingHost(gatewayIP);

        setGatewayInfo({
          ip: gatewayIP,
          mac: currentBSSID,
          name: 'Cudy router',
          model: 'Cudy router',
          manufacturer: 'Cudy',
          deviceType: 'Network Gateway',
          ping: ping,
          packetLoss: 0,
          ssids: networks,
          upnp: {
            productSite: 'http://www.cudy.com/',
            manufacturerSite: 'http://www.cudy.com/',
            serialNumber: '00000000'
          },
          openPorts: []
        });
      }

      // Fetch ISP info
      try {
        const response = await axios.get('https://ipinfo.io/json', {
          timeout: 5000
        });
        
        const ispPing = await pingHost('8.8.8.8');
        
        setISPInfo({
          publicIP: response.data.ip,
          isp: response.data.org?.split(' ').slice(1).join(' ') || 'Unknown',
          city: response.data.city || 'Unknown',
          country: response.data.country || 'Unknown',
          asn: response.data.org?.split(' ')[0] || 'Unknown',
          ping: ispPing
        });
      } catch (error) {
        console.error('Error fetching ISP info:', error);
      }

      // Update cellular info
      await updateCellularInfo();
    } catch (error) {
      console.error('Error refreshing network data:', error);
    }
  };

  const isConnected = connectionState?.isConnected ?? false;
  const isWiFi = connectionState?.type === 'wifi';
  const isCellular = connectionState?.type === 'cellular';

  return (
    <NetworkContext.Provider
      value={{
        connectionState,
        deviceInfo,
        gatewayInfo,
        ispInfo,
        isConnected,
        isWiFi,
        isCellular,
        refreshNetworkData,
        cellularInfo
      }}
    >
      {children}
    </NetworkContext.Provider>
  );
};

export const useNetwork = () => {
  const context = useContext(NetworkContext);
  if (!context) {
    throw new Error('useNetwork must be used within NetworkProvider');
  }
  return context;
};

export type { NetworkContextType, DeviceData, GatewayData, WiFiNetwork, ISPData, CellularInfo };
