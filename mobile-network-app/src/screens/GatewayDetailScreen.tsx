import React from 'react';
import { View, Text, StyleSheet, ScrollView, TouchableOpacity } from 'react-native';
import { useNetwork } from '../contexts/NetworkContext';

export default function GatewayDetailScreen() {
  const { gatewayInfo } = useNetwork();

  const getSignalColor = (strength: number) => {
    if (strength > -50) return '#4CAF50';
    if (strength > -60) return '#8BC34A';
    if (strength > -70) return '#FFC107';
    return '#F44336';
  };

  const getSignalBars = (strength: number) => {
    const percentage = Math.min(100, Math.max(0, (strength + 100) * 2));
    return percentage;
  };

  return (
    <ScrollView style={styles.container}>
      <View style={styles.tabContainer}>
        <View style={[styles.tab, styles.activeTab]}>
          <Text style={styles.activeTabText}>Gateway</Text>
        </View>
        <View style={styles.tab}>
          <Text style={styles.tabText}>AP</Text>
        </View>
      </View>

      <View style={styles.section}>
        <View style={styles.infoRow}>
          <Text style={styles.label}>MAC</Text>
          <Text style={styles.value}>{gatewayInfo?.mac || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Model</Text>
          <Text style={styles.value}>{gatewayInfo?.model || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Manufacturer</Text>
          <Text style={styles.value}>{gatewayInfo?.manufacturer || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Device Type</Text>
          <Text style={styles.value}>{gatewayInfo?.deviceType || 'Unknown'}</Text>
        </View>
      </View>

      <View style={styles.section}>
        <Text style={styles.sectionTitle}>Network</Text>
        
        <View style={styles.infoRow}>
          <Text style={styles.label}>IP Address</Text>
          <Text style={[styles.value, styles.blueText]}>{gatewayInfo?.ip || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Ping</Text>
          <Text style={[styles.value, styles.greenText]}>
            {gatewayInfo?.ping ? `${gatewayInfo.ping} ms` : 'N/A'}
          </Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Packet Loss</Text>
          <Text style={styles.value}>
            {gatewayInfo?.packetLoss === 0 ? 'No Packet Loss' : `${gatewayInfo?.packetLoss}%`}
          </Text>
        </View>
      </View>

      {gatewayInfo?.ssids && gatewayInfo.ssids.length > 0 && (
        <View style={styles.section}>
          <Text style={styles.sectionTitle}>WiFi Networks</Text>
          {gatewayInfo.ssids.map((network, index) => (
            <TouchableOpacity key={index} style={styles.networkCard}>
              <View style={styles.networkHeader}>
                <View style={styles.networkInfo}>
                  <Text style={styles.networkName}>
                    {network.isHidden ? 'Hidden SSID' : network.ssid}
                  </Text>
                  <Text style={styles.networkFrequency}>{network.frequency}</Text>
                  {network.isConnected && (
                    <View style={styles.connectedBadge}>
                      <Text style={styles.connectedText}>CONNECTED</Text>
                    </View>
                  )}
                </View>
                <View style={styles.signalInfo}>
                  <Text style={[styles.signalStrength, { color: getSignalColor(network.signalStrength) }]}>
                    {network.signalStrength} dBm
                  </Text>
                  <Text style={styles.channelInfo}>
                    Ch: {network.channel} ({network.channelWidth} MHz)
                  </Text>
                </View>
              </View>
              <Text style={styles.bssid}>{network.bssid}</Text>
              <View style={styles.signalBar}>
                <View 
                  style={[
                    styles.signalBarFill, 
                    { 
                      width: `${getSignalBars(network.signalStrength)}%`,
                      backgroundColor: getSignalColor(network.signalStrength)
                    }
                  ]} 
                />
              </View>
            </TouchableOpacity>
          ))}
        </View>
      )}

      <View style={styles.section}>
        <Text style={styles.sectionTitle}>UPNP</Text>
        
        <View style={styles.infoRow}>
          <Text style={styles.label}>Product Site</Text>
          <Text style={[styles.value, styles.blueText]}>{gatewayInfo?.upnp.productSite || 'N/A'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Manufacturer Site</Text>
          <Text style={[styles.value, styles.blueText]}>{gatewayInfo?.upnp.manufacturerSite || 'N/A'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Serial Number</Text>
          <Text style={styles.value}>{gatewayInfo?.upnp.serialNumber || 'N/A'}</Text>
        </View>
      </View>

      <View style={styles.section}>
        <Text style={styles.sectionTitle}>Open Ports</Text>
        <TouchableOpacity style={styles.scanButton}>
          <Text style={styles.scanButtonText}>Scan Ports</Text>
        </TouchableOpacity>
      </View>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0A1F1A',
  },
  tabContainer: {
    flexDirection: 'row',
    backgroundColor: '#0F2A20',
    marginHorizontal: 20,
    marginTop: 20,
    borderRadius: 8,
    padding: 4,
  },
  tab: {
    flex: 1,
    paddingVertical: 8,
    alignItems: 'center',
  },
  activeTab: {
    backgroundColor: '#2C5CC5',
    borderRadius: 6,
  },
  tabText: {
    color: '#8E8E93',
    fontSize: 14,
    fontWeight: '500',
  },
  activeTabText: {
    color: '#FFFFFF',
    fontSize: 14,
    fontWeight: '600',
  },
  section: {
    paddingHorizontal: 20,
    paddingTop: 20,
  },
  sectionTitle: {
    fontSize: 16,
    fontWeight: 'bold',
    color: '#FFFFFF',
    marginBottom: 12,
  },
  infoRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    paddingVertical: 12,
    borderBottomWidth: 1,
    borderBottomColor: '#1A3A2F',
  },
  label: {
    color: '#8E8E93',
    fontSize: 15,
  },
  value: {
    color: '#FFFFFF',
    fontSize: 15,
    fontWeight: '400',
  },
  blueText: {
    color: '#2C5CC5',
  },
  greenText: {
    color: '#4CAF50',
  },
  networkCard: {
    backgroundColor: '#0F2A20',
    borderRadius: 8,
    padding: 16,
    marginBottom: 12,
    borderWidth: 1,
    borderColor: '#1A3A2F',
  },
  networkHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: 8,
  },
  networkInfo: {
    flex: 1,
  },
  networkName: {
    color: '#FFFFFF',
    fontSize: 16,
    fontWeight: '600',
    marginBottom: 4,
  },
  networkFrequency: {
    color: '#8E8E93',
    fontSize: 13,
    marginBottom: 4,
  },
  connectedBadge: {
    backgroundColor: '#4CAF50',
    paddingHorizontal: 8,
    paddingVertical: 2,
    borderRadius: 4,
    alignSelf: 'flex-start',
  },
  connectedText: {
    color: '#FFFFFF',
    fontSize: 10,
    fontWeight: '600',
  },
  signalInfo: {
    alignItems: 'flex-end',
  },
  signalStrength: {
    fontSize: 15,
    fontWeight: '600',
    marginBottom: 2,
  },
  channelInfo: {
    color: '#8E8E93',
    fontSize: 12,
  },
  bssid: {
    color: '#8E8E93',
    fontSize: 13,
    marginBottom: 8,
  },
  signalBar: {
    height: 4,
    backgroundColor: '#1A3A2F',
    borderRadius: 2,
    overflow: 'hidden',
  },
  signalBarFill: {
    height: '100%',
    borderRadius: 2,
  },
  scanButton: {
    backgroundColor: '#2C5CC5',
    paddingVertical: 12,
    borderRadius: 8,
    alignItems: 'center',
    marginTop: 8,
  },
  scanButtonText: {
    color: '#FFFFFF',
    fontSize: 15,
    fontWeight: '600',
  },
});
