import React from 'react';
import { View, Text, StyleSheet, ScrollView } from 'react-native';
import { useNetwork } from '../contexts/NetworkContext';

export default function ISPDetailScreen() {
  const { ispInfo } = useNetwork();

  return (
    <ScrollView style={styles.container}>
      <View style={styles.section}>
        <Text style={styles.sectionTitle}>ISP Information</Text>
        
        <View style={styles.infoRow}>
          <Text style={styles.label}>Public IP</Text>
          <Text style={styles.value}>{ispInfo?.publicIP || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>ISP</Text>
          <Text style={styles.value}>{ispInfo?.isp || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>ASN</Text>
          <Text style={styles.value}>{ispInfo?.asn || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>City</Text>
          <Text style={styles.value}>{ispInfo?.city || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Country</Text>
          <Text style={styles.value}>{ispInfo?.country || 'Unknown'}</Text>
        </View>

        <View style={styles.infoRow}>
          <Text style={styles.label}>Ping</Text>
          <Text style={styles.value}>
            {ispInfo?.ping ? `${ispInfo.ping}ms` : 'N/A'}
          </Text>
        </View>
      </View>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0A1F1A',
  },
  section: {
    padding: 20,
  },
  sectionTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#FFFFFF',
    marginBottom: 16,
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
    fontSize: 16,
  },
  value: {
    color: '#FFFFFF',
    fontSize: 16,
    fontWeight: '500',
  },
});
