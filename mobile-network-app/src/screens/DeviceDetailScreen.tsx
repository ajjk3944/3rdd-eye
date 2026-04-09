import React from 'react';
import { View, Text, StyleSheet, ScrollView } from 'react-native';
import { useNetwork } from '../contexts/NetworkContext';

export default function DeviceDetailScreen() {
  const { deviceInfo, cellularInfo, connectionState } = useNetwork();

  const getSignalColor = (strength: number) => {
    if (strength > -70) return '#4CAF50';
    if (strength > -85) return '#FFC107';
    return '#F44336';
  };

  const getLinkSpeed = () => {
    const state = connectionState as any;
    if (state?.details?.linkSpeed) return `${state.details.linkSpeed} Mbps`;
    return '260 Mbps';
  };

  return (
    <ScrollView style={styles.container}>
      <View style={styles.header}>
        <View style={styles.deviceIcon}>
          <Text style={styles.deviceIconText}>📱</Text>
        </View>
        <Text style={styles.deviceName}>{deviceInfo.model || 'Unknown Device'}</Text>
        <Text style={styles.deviceModel}>{deviceInfo.model || 'Unknown'}</Text>
        <View style={styles.badge}>
          <Text style={styles.badgeText}>Me</Text>
        </View>
      </View>

      <View style={styles.section}>
        <View style={styles.infoRow}>
          <Text style={styles.label}>Model</Text>
          <Text style={styles.value}>{deviceInfo.model || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Manufacturer</Text>
          <Text style={styles.value}>{deviceInfo.manufacturer || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Device Type</Text>
          <Text style={styles.value}>{deviceInfo.deviceType || 'Phone'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Firmware Version</Text>
          <Text style={styles.value}>{deviceInfo.firmwareVersion || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Uptime</Text>
          <Text style={styles.value}>{deviceInfo.uptime} days</Text>
        </View>
      </View>

      <View style={styles.section}>
        <Text style={styles.sectionTitle}>Network</Text>
        
        <View style={styles.infoRow}>
          <Text style={styles.label}>IP Address</Text>
          <Text style={[styles.value, styles.blueText]}>{deviceInfo.localIP || 'Not connected'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Subnet Mask</Text>
          <Text style={styles.value}>0.0.0.0</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>DNS</Text>
          <Text style={[styles.value, styles.blueText]}>
            {deviceInfo.dnsServers[0] || '1.1.1.1'}
          </Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Link Speed</Text>
          <Text style={styles.value}>{getLinkSpeed()}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Connection</Text>
          <Text style={styles.value}>WiFi</Text>
        </View>
      </View>

      {(cellularInfo.sim1 || cellularInfo.sim2) && (
        <View style={styles.section}>
          <Text style={styles.sectionTitle}>Cellular</Text>
          
          {cellularInfo.sim1 && (
            <View style={styles.infoRow}>
              <Text style={styles.label}>SIM 1</Text>
              <Text style={[styles.value, { color: getSignalColor(cellularInfo.sim1.signalStrength) }]}>
                {cellularInfo.sim1.signalStrength} dBm
              </Text>
            </View>
          )}

          {cellularInfo.sim2 && (
            <View style={styles.infoRow}>
              <Text style={styles.label}>SIM 2</Text>
              <Text style={[styles.value, { color: getSignalColor(cellularInfo.sim2.signalStrength) }]}>
                {cellularInfo.sim2.signalStrength} dBm
              </Text>
            </View>
          )}
        </View>
      )}
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0A1F1A',
  },
  header: {
    alignItems: 'center',
    paddingVertical: 30,
    borderBottomWidth: 1,
    borderBottomColor: '#1A3A2F',
    backgroundColor: '#0F2A20',
  },
  deviceIcon: {
    width: 80,
    height: 80,
    borderRadius: 40,
    backgroundColor: '#1A3A2F',
    justifyContent: 'center',
    alignItems: 'center',
    marginBottom: 12,
  },
  deviceIconText: {
    fontSize: 40,
  },
  deviceName: {
    fontSize: 22,
    fontWeight: 'bold',
    color: '#FFFFFF',
    marginBottom: 4,
  },
  deviceModel: {
    fontSize: 14,
    color: '#8E8E93',
    marginBottom: 12,
  },
  badge: {
    backgroundColor: '#2C5CC5',
    paddingHorizontal: 16,
    paddingVertical: 4,
    borderRadius: 12,
  },
  badgeText: {
    color: '#FFFFFF',
    fontSize: 12,
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
    textAlign: 'right',
    flex: 1,
    marginLeft: 16,
  },
  blueText: {
    color: '#2C5CC5',
  },
});
