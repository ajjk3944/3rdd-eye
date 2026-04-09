import React, { useState } from 'react';
import { View, Text, StyleSheet, TouchableOpacity, ScrollView } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { useNetwork } from '../contexts/NetworkContext';

export default function SpeedScreen() {
  const navigation = useNavigation();
  const { deviceInfo, gatewayInfo, ispInfo, isConnected, isWiFi, connectionState, cellularInfo } = useNetwork();
  const [selectedDevice, setSelectedDevice] = useState<'isp' | 'gateway' | 'device'>('gateway');

  const getConnectionQuality = () => {
    if (!gatewayInfo?.ssids || gatewayInfo.ssids.length === 0) return 'Unknown';
    const connectedNetwork = gatewayInfo.ssids.find(n => n.isConnected);
    if (!connectedNetwork) return 'Unknown';
    
    const signal = connectedNetwork.signalStrength;
    if (signal > -50) return 'Excellent';
    if (signal > -60) return 'Good';
    if (signal > -70) return 'Fair';
    return 'Poor';
  };

  const getSignalPercentage = () => {
    if (!gatewayInfo?.ssids || gatewayInfo.ssids.length === 0) return 0;
    const connectedNetwork = gatewayInfo.ssids.find(n => n.isConnected);
    if (!connectedNetwork) return 0;
    return Math.min(100, Math.max(0, (connectedNetwork.signalStrength + 100) * 2));
  };

  const getLinkSpeed = () => {
    const state = connectionState as any;
    if (state?.details?.linkSpeed) return `${state.details.linkSpeed} Mbps`;
    return '260 Mbps';
  };

  return (
    <ScrollView style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <Text style={styles.headerTitle}>
          {gatewayInfo?.ssids?.find(n => n.isConnected)?.ssid || 'Not Connected'}
        </Text>
        {isWiFi && (
          <View style={styles.liveBadge}>
            <Text style={styles.liveText}>LIVE</Text>
          </View>
        )}
      </View>

      {/* Network Topology */}
      <View style={styles.topologyContainer}>
        <TouchableOpacity 
          style={styles.nodeContainer}
          onPress={() => {
            setSelectedDevice('isp');
            navigation.navigate('ISPDetail' as never);
          }}
        >
          <View style={[styles.node, selectedDevice === 'isp' && styles.nodeSelected]}>
            <Text style={styles.nodeIcon}>🌐</Text>
          </View>
          <Text style={styles.nodeLabel}>{ispInfo?.asn || 'ISP'}</Text>
          <Text style={styles.nodeSubtext}>{ispInfo?.publicIP || '...'}</Text>
          <View style={styles.statusBadge}>
            <Text style={styles.statusText}>Available</Text>
          </View>
        </TouchableOpacity>

        <View style={styles.connector}>
          <Text style={styles.connectorDots}>····</Text>
        </View>

        <TouchableOpacity 
          style={styles.nodeContainer}
          onPress={() => {
            setSelectedDevice('gateway');
            navigation.navigate('GatewayDetail' as never);
          }}
        >
          <View style={[styles.node, styles.nodeGateway, selectedDevice === 'gateway' && styles.nodeSelected]}>
            <Text style={styles.nodeIcon}>📡</Text>
          </View>
          <Text style={styles.nodeLabel}>{gatewayInfo?.ssids?.find(n => n.isConnected)?.ssid || 'Gateway'}</Text>
          <Text style={styles.nodeSubtext}>{gatewayInfo?.ip || '...'}</Text>
        </TouchableOpacity>

        <View style={styles.connector}>
          <Text style={styles.connectorDots}>····</Text>
        </View>

        <TouchableOpacity 
          style={styles.nodeContainer}
          onPress={() => {
            setSelectedDevice('device');
            navigation.navigate('DeviceDetail' as never);
          }}
        >
          <View style={[styles.node, selectedDevice === 'device' && styles.nodeSelected]}>
            <Text style={styles.nodeIcon}>📱</Text>
          </View>
          <Text style={styles.nodeLabel}>This Device</Text>
          <Text style={styles.nodeSubtext}>{deviceInfo.localIP || '...'}</Text>
        </TouchableOpacity>
      </View>

      {/* Device Details */}
      {selectedDevice === 'gateway' && gatewayInfo && (
        <View style={styles.detailsContainer}>
          <View style={styles.detailsHeader}>
            <Text style={styles.detailsIcon}>⚙️</Text>
            <Text style={styles.detailsTitle}>{gatewayInfo.name}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Model:</Text>
            <Text style={styles.detailValue}>{gatewayInfo.model}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Manufacturer:</Text>
            <Text style={styles.detailValue}>{gatewayInfo.manufacturer}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Network Name (SSID):</Text>
            <Text style={styles.detailValue}>
              {gatewayInfo.ssids?.find(n => n.isConnected)?.ssid || 'Unknown'}
            </Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Gateway IP:</Text>
            <Text style={styles.detailValue}>{gatewayInfo.ip}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>BSSID:</Text>
            <Text style={styles.detailValue}>{gatewayInfo.mac}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Security:</Text>
            <Text style={styles.detailValue}>WPA2</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Frequency:</Text>
            <Text style={styles.detailValue}>
              {gatewayInfo.ssids?.find(n => n.isConnected)?.frequency || '5 GHz'}
            </Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Channel:</Text>
            <Text style={styles.detailValue}>
              CH_{gatewayInfo.ssids?.find(n => n.isConnected)?.channel || 153}
            </Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Signal:</Text>
            <Text style={styles.detailValue}>{Math.round(getSignalPercentage())}%</Text>
          </View>
        </View>
      )}

      {selectedDevice === 'device' && (
        <View style={styles.detailsContainer}>
          <View style={styles.detailsHeader}>
            <Text style={styles.detailsIcon}>📱</Text>
            <Text style={styles.detailsTitle}>This Device</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>IP Address:</Text>
            <Text style={styles.detailValue}>{deviceInfo.localIP || 'Unknown'}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Subnet Mask:</Text>
            <Text style={styles.detailValue}>0.0.0.0</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>DNS:</Text>
            <Text style={styles.detailValue}>{deviceInfo.dnsServers[0] || '1.1.1.1'}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Link Speed:</Text>
            <Text style={styles.detailValue}>{getLinkSpeed()}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Connection:</Text>
            <Text style={styles.detailValue}>WiFi</Text>
          </View>
        </View>
      )}

      {selectedDevice === 'isp' && ispInfo && (
        <View style={styles.detailsContainer}>
          <View style={styles.detailsHeader}>
            <Text style={styles.detailsIcon}>🌐</Text>
            <Text style={styles.detailsTitle}>ISP Information</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Public IP:</Text>
            <Text style={styles.detailValue}>{ispInfo.publicIP}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>ISP:</Text>
            <Text style={styles.detailValue}>{ispInfo.isp}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>Location:</Text>
            <Text style={styles.detailValue}>{ispInfo.city}, {ispInfo.country}</Text>
          </View>

          <View style={styles.detailRow}>
            <Text style={styles.detailLabel}>ASN:</Text>
            <Text style={styles.detailValue}>{ispInfo.asn}</Text>
          </View>
        </View>
      )}

      {/* WiFi Connection Details */}
      <View style={styles.wifiDetailsContainer}>
        <View style={styles.wifiHeader}>
          <Text style={styles.wifiTitle}>📶 WiFi Connection Details</Text>
          <Text style={[styles.wifiQuality, getConnectionQuality() === 'Fair' && styles.qualityFair]}>
            {getConnectionQuality()}
          </Text>
        </View>

        {gatewayInfo?.ssids?.find(n => n.isConnected) && (
          <>
            <View style={styles.wifiCard}>
              <View style={styles.wifiCardHeader}>
                <Text style={styles.wifiCardTitle}>Spectrum</Text>
                <Text style={styles.wifiCardIcon}>✓</Text>
              </View>
              <View style={styles.wifiCardContent}>
                <Text style={styles.wifiCardLabel}>WiFi Band <Text style={styles.wifiCardValue}>
                  {gatewayInfo.ssids.find(n => n.isConnected)?.frequency}
                </Text></Text>
                <Text style={styles.wifiCardLabel}>Channel Width <Text style={styles.wifiCardValue}>
                  {gatewayInfo.ssids.find(n => n.isConnected)?.channelWidth} MHz
                </Text></Text>
              </View>
            </View>

            <View style={[styles.wifiCard, styles.wifiCardWarning]}>
              <View style={styles.wifiCardHeader}>
                <Text style={styles.wifiCardTitle}>Radio Potential</Text>
                <View style={styles.warningBadge}>
                  <Text style={styles.warningText}>1 ⚠</Text>
                </View>
              </View>
              <View style={styles.wifiCardContent}>
                <Text style={styles.wifiCardLabel}>Standard <Text style={styles.wifiCardValue}>WiFi 4</Text></Text>
                <Text style={styles.wifiCardLabel}>MIMO <Text style={styles.wifiCardValue}>2x2</Text></Text>
                <Text style={styles.wifiCardLabel}>Signal <Text style={styles.wifiCardValue}>
                  {gatewayInfo.ssids.find(n => n.isConnected)?.signalStrength} dBm
                </Text></Text>
              </View>
            </View>

            <View style={styles.wifiCard}>
              <View style={styles.wifiCardHeader}>
                <Text style={styles.wifiCardTitle}>Channel Health</Text>
                <Text style={styles.wifiCardIcon}>✓</Text>
              </View>
              <View style={styles.wifiCardContent}>
                <Text style={styles.wifiCardLabel}>Channel <Text style={styles.wifiCardValue}>
                  {gatewayInfo.ssids.find(n => n.isConnected)?.channel}
                </Text></Text>
                <Text style={styles.wifiCardLabel}>Utilization <Text style={styles.wifiCardValue}>N/A</Text></Text>
              </View>
            </View>
          </>
        )}
      </View>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0A1F1A',
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: 20,
    paddingTop: 60,
  },
  headerTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#FFFFFF',
  },
  liveBadge: {
    backgroundColor: '#4CAF50',
    paddingHorizontal: 12,
    paddingVertical: 4,
    borderRadius: 4,
  },
  liveText: {
    color: '#FFFFFF',
    fontSize: 12,
    fontWeight: 'bold',
  },
  topologyContainer: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    alignItems: 'center',
    paddingVertical: 30,
    paddingHorizontal: 20,
  },
  nodeContainer: {
    alignItems: 'center',
    flex: 1,
  },
  node: {
    width: 70,
    height: 70,
    borderRadius: 12,
    backgroundColor: '#1A3A2F',
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 2,
    borderColor: '#2A4A3F',
    marginBottom: 8,
  },
  nodeGateway: {
    backgroundColor: '#1A4A3F',
    borderColor: '#2A5A4F',
  },
  nodeSelected: {
    borderColor: '#4CAF50',
    borderWidth: 3,
  },
  nodeIcon: {
    fontSize: 32,
  },
  nodeLabel: {
    color: '#FFFFFF',
    fontSize: 12,
    fontWeight: '600',
    marginTop: 4,
    textAlign: 'center',
  },
  nodeSubtext: {
    color: '#8E8E93',
    fontSize: 10,
    marginTop: 2,
    textAlign: 'center',
  },
  statusBadge: {
    backgroundColor: '#4CAF50',
    paddingHorizontal: 8,
    paddingVertical: 2,
    borderRadius: 4,
    marginTop: 4,
  },
  statusText: {
    color: '#FFFFFF',
    fontSize: 10,
    fontWeight: '600',
  },
  connector: {
    width: 30,
    alignItems: 'center',
    marginBottom: 40,
  },
  connectorDots: {
    color: '#4CAF50',
    fontSize: 20,
    letterSpacing: 2,
  },
  detailsContainer: {
    backgroundColor: '#0F2A20',
    marginHorizontal: 20,
    marginBottom: 20,
    borderRadius: 12,
    padding: 16,
    borderWidth: 1,
    borderColor: '#1A3A2F',
  },
  detailsHeader: {
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 16,
    paddingBottom: 12,
    borderBottomWidth: 1,
    borderBottomColor: '#1A3A2F',
  },
  detailsIcon: {
    fontSize: 24,
    marginRight: 12,
  },
  detailsTitle: {
    color: '#FFFFFF',
    fontSize: 18,
    fontWeight: 'bold',
  },
  detailRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    paddingVertical: 10,
    borderBottomWidth: 1,
    borderBottomColor: '#1A3A2F',
  },
  detailLabel: {
    color: '#8E8E93',
    fontSize: 14,
    flex: 1,
  },
  detailValue: {
    color: '#FFFFFF',
    fontSize: 14,
    fontWeight: '500',
    textAlign: 'right',
    flex: 1,
  },
  wifiDetailsContainer: {
    paddingHorizontal: 20,
    paddingBottom: 30,
  },
  wifiHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: 16,
  },
  wifiTitle: {
    color: '#FFFFFF',
    fontSize: 16,
    fontWeight: '600',
  },
  wifiQuality: {
    color: '#4CAF50',
    fontSize: 14,
    fontWeight: '600',
  },
  qualityFair: {
    color: '#FFC107',
  },
  wifiCard: {
    backgroundColor: '#0F2A20',
    borderRadius: 12,
    padding: 16,
    marginBottom: 12,
    borderWidth: 1,
    borderColor: '#1A3A2F',
  },
  wifiCardWarning: {
    borderColor: '#8B6914',
    backgroundColor: '#1A1A0F',
  },
  wifiCardHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: 12,
  },
  wifiCardTitle: {
    color: '#FFFFFF',
    fontSize: 16,
    fontWeight: '600',
  },
  wifiCardIcon: {
    color: '#4CAF50',
    fontSize: 18,
  },
  warningBadge: {
    backgroundColor: '#8B6914',
    paddingHorizontal: 10,
    paddingVertical: 4,
    borderRadius: 4,
  },
  warningText: {
    color: '#FFFFFF',
    fontSize: 12,
    fontWeight: 'bold',
  },
  wifiCardContent: {
    gap: 8,
  },
  wifiCardLabel: {
    color: '#8E8E93',
    fontSize: 14,
  },
  wifiCardValue: {
    color: '#FFFFFF',
    fontWeight: '600',
  },
});

