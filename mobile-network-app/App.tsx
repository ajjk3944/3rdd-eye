import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { createStackNavigator } from '@react-navigation/stack';
import { View, Text, StyleSheet } from 'react-native';
import SpeedScreen from './src/screens/SpeedScreen';
import GatewayDetailScreen from './src/screens/GatewayDetailScreen';
import DeviceDetailScreen from './src/screens/DeviceDetailScreen';
import ISPDetailScreen from './src/screens/ISPDetailScreen';
import { NetworkProvider } from './src/contexts/NetworkContext';

const Tab = createBottomTabNavigator();
const Stack = createStackNavigator();

// Placeholder screens for other tabs
const PlaceholderScreen = ({ name }: { name: string }) => (
  <View style={styles.placeholder}>
    <Text style={styles.placeholderText}>{name} Screen</Text>
  </View>
);

const SpeedStack = () => (
  <Stack.Navigator
    screenOptions={{
      headerStyle: { backgroundColor: '#0F2A20' },
      headerTintColor: '#FFFFFF',
      cardStyle: { backgroundColor: '#0A1F1A' }
    }}
  >
    <Stack.Screen 
      name="SpeedMain" 
      component={SpeedScreen} 
      options={{ headerShown: false }}
    />
    <Stack.Screen 
      name="GatewayDetail" 
      component={GatewayDetailScreen}
      options={{ title: 'Gateway' }}
    />
    <Stack.Screen 
      name="DeviceDetail" 
      component={DeviceDetailScreen}
      options={{ title: 'Me' }}
    />
    <Stack.Screen 
      name="ISPDetail" 
      component={ISPDetailScreen}
      options={{ title: 'ISP' }}
    />
  </Stack.Navigator>
);

export default function App() {
  return (
    <NetworkProvider>
      <NavigationContainer>
        <Tab.Navigator
          screenOptions={{
            tabBarStyle: styles.tabBar,
            tabBarActiveTintColor: '#00BCD4',
            tabBarInactiveTintColor: '#8E8E93',
            headerShown: false
          }}
        >
          <Tab.Screen 
            name="Speed" 
            component={SpeedStack}
            options={{ tabBarLabel: 'Speed' }}
          />
          <Tab.Screen 
            name="Signal" 
            children={() => <PlaceholderScreen name="Signal" />}
          />
          <Tab.Screen 
            name="Scan" 
            children={() => <PlaceholderScreen name="Scan" />}
          />
          <Tab.Screen 
            name="Discovery" 
            children={() => <PlaceholderScreen name="Discovery" />}
          />
          <Tab.Screen 
            name="Teleport" 
            children={() => <PlaceholderScreen name="Teleport" />}
          />
        </Tab.Navigator>
      </NavigationContainer>
    </NetworkProvider>
  );
}

const styles = StyleSheet.create({
  tabBar: {
    backgroundColor: '#0F2A20',
    borderTopColor: '#1A3A2F',
    borderTopWidth: 1,
  },
  placeholder: {
    flex: 1,
    backgroundColor: '#0A1F1A',
    justifyContent: 'center',
    alignItems: 'center',
  },
  placeholderText: {
    color: '#FFFFFF',
    fontSize: 18,
  },
});
