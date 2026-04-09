// Complete registry of all sub-tools across all categories
// This is used for Favorites and Recently Used tracking

import {
  Globe,
  MapPin,
  Network,
  RefreshCw,
  Check,
  Cpu,
  Calculator,
  Server,
  Shield,
  AlertTriangle,
  Wifi,
  Activity,
  Lock,
  Eye,
  Search,
  FileText,
  Link,
  Code,
  ShoppingBag,
  Bluetooth,
  Camera,
  Zap,
  Thermometer,
  Route,
  Target,
  TrendingUp,
} from 'lucide-react'

export interface SubTool {
  id: string
  name: string
  icon: any
  category: string
  path: string
  color: string
}

export const ALL_SUB_TOOLS: SubTool[] = [
  // IP Tools
  { id: 'ip-tracker', name: 'IP Tracker', icon: MapPin, category: 'IP Tools', path: '/tools/ip-tools/ip-tracker', color: 'cyan' },
  { id: 'ip-to-hostname', name: 'IP to Hostname', icon: Globe, category: 'IP Tools', path: '/tools/ip-tools/ip-to-hostname', color: 'cyan' },
  { id: 'hostname-to-ip', name: 'Hostname to IP', icon: Network, category: 'IP Tools', path: '/tools/ip-tools/hostname-to-ip', color: 'blue' },
  { id: 'ipv4-to-ipv6', name: 'IPv4 to IPv6', icon: RefreshCw, category: 'IP Tools', path: '/tools/ip-tools/ipv4-to-ipv6', color: 'purple' },
  { id: 'ipv6-compression', name: 'IPv6 Compress', icon: Network, category: 'IP Tools', path: '/tools/ip-tools/ipv6-compression', color: 'green' },
  { id: 'ipv6-compatibility', name: 'IPv6 Test', icon: Check, category: 'IP Tools', path: '/tools/ip-tools/ipv6-compatibility', color: 'yellow' },
  { id: 'ipv6-cidr', name: 'IPv6 CIDR', icon: Network, category: 'IP Tools', path: '/tools/ip-tools/ipv6-cidr', color: 'indigo' },
  { id: 'mac-vendor', name: 'MAC Vendor', icon: Network, category: 'IP Tools', path: '/tools/ip-tools/mac-vendor', color: 'pink' },
  { id: 'mac-address-lookup', name: 'MAC Lookup', icon: Cpu, category: 'IP Tools', path: '/tools/ip-tools/mac-address-lookup', color: 'fuchsia' },
  { id: 'ip-calculator', name: 'IP Calculator', icon: Calculator, category: 'IP Tools', path: '/tools/ip-tools/ip-calculator', color: 'emerald' },
  { id: 'ip-range-expander', name: 'IP Range', icon: Network, category: 'IP Tools', path: '/tools/ip-tools/ip-range-expander', color: 'orange' },
  { id: 'ip-address-converter', name: 'IP Converter', icon: RefreshCw, category: 'IP Tools', path: '/tools/ip-tools/ip-address-converter', color: 'teal' },

  // DNS Tools
  { id: 'dns-lookup', name: 'DNS Lookup', icon: Globe, category: 'DNS Tools', path: '/tools/dns-tools/dns-lookup', color: 'cyan' },
  { id: 'reverse-dns', name: 'Reverse DNS', icon: RefreshCw, category: 'DNS Tools', path: '/tools/dns-tools/reverse-dns', color: 'purple' },
  { id: 'whois', name: 'WHOIS', icon: Search, category: 'DNS Tools', path: '/tools/dns-tools/whois', color: 'blue' },
  { id: 'vlsm-calculator', name: 'VLSM Calculator', icon: Calculator, category: 'DNS Tools', path: '/tools/dns-tools/vlsm-calculator', color: 'green' },
  { id: 'subnet-calculator', name: 'Subnet Calculator', icon: Network, category: 'DNS Tools', path: '/tools/dns-tools/subnet-calculator', color: 'indigo' },
  { id: 'network-broadcast', name: 'Network/Broadcast', icon: Server, category: 'DNS Tools', path: '/tools/dns-tools/network-broadcast', color: 'pink' },
  { id: 'fcrdns', name: 'FCrDNS Lookup', icon: RefreshCw, category: 'DNS Tools', path: '/tools/dns-tools/fcrdns', color: 'purple' },

  // WiFi Security Tools
  { id: 'vulnerability-scan', name: 'WiFi Scanner', icon: Wifi, category: 'WiFi Security', path: '/tools/wifi-security/vulnerability-scan', color: 'red' },
  { id: 'arp-spoofing', name: 'ARP Spoofing', icon: AlertTriangle, category: 'WiFi Security', path: '/tools/wifi-security/arp-spoofing', color: 'pink' },
  { id: 'channel-analyzer', name: 'Channel Analyzer', icon: Activity, category: 'WiFi Security', path: '/tools/wifi-security/channel-analyzer', color: 'cyan' },
  { id: 'bandwidth-throttle', name: 'Throttle Detector', icon: TrendingUp, category: 'WiFi Security', path: '/tools/wifi-security/bandwidth-throttle', color: 'orange' },
  { id: 'packet-analyzer', name: 'Packet Analyzer', icon: Activity, category: 'WiFi Security', path: '/tools/wifi-security/packet-analyzer', color: 'purple' },
  { id: 'evil-twin-shield', name: 'Evil Twin Shield', icon: Shield, category: 'WiFi Security', path: '/tools/wifi-security/evil-twin-shield', color: 'red' },
  { id: 'signal-analyzer', name: 'Signal Analyzer', icon: Activity, category: 'WiFi Security', path: '/tools/wifi-security/signal-analyzer', color: 'cyan' },
  { id: 'wps-test', name: 'WPS Test', icon: Lock, category: 'WiFi Security', path: '/tools/wifi-security/wps-test', color: 'yellow' },
  { id: 'vpn-test', name: 'VPN Test', icon: Shield, category: 'WiFi Security', path: '/tools/wifi-security/vpn-test', color: 'green' },
  { id: 'dns-leak-test', name: 'DNS Leak Test', icon: Eye, category: 'WiFi Security', path: '/tools/wifi-security/dns-leak-test', color: 'blue' },
  { id: 'ssl-inspector', name: 'SSL Inspector', icon: Lock, category: 'WiFi Security', path: '/tools/wifi-security/ssl-inspector', color: 'green' },
  { id: 'router-audit', name: 'Router Audit', icon: Server, category: 'WiFi Security', path: '/tools/wifi-security/router-audit', color: 'red' },
  { id: 'port-scanner', name: 'Port Scanner', icon: Target, category: 'WiFi Security', path: '/tools/wifi-security/port-scanner', color: 'purple' },
  { id: 'network-topology', name: 'Network Topology', icon: Network, category: 'WiFi Security', path: '/tools/wifi-security/network-topology', color: 'cyan' },

  // Web Tools
  { id: 'seo-browser', name: 'SEO Browser', icon: Search, category: 'Web Tools', path: '/tools/web-tools/seo-browser', color: 'blue' },
  { id: 'is-it-down', name: 'Is It Down?', icon: Globe, category: 'Web Tools', path: '/tools/web-tools/is-it-down', color: 'red' },
  { id: 'url-redirect', name: 'URL Redirect', icon: Link, category: 'Web Tools', path: '/tools/web-tools/url-redirect', color: 'purple' },
  { id: 'html-viewer', name: 'HTML Viewer', icon: Code, category: 'Web Tools', path: '/tools/web-tools/html-viewer', color: 'green' },
  { id: 'url-encode', name: 'URL Encode', icon: Code, category: 'Web Tools', path: '/tools/web-tools/url-encode', color: 'cyan' },
  { id: 'shopify-detector', name: 'Shopify Theme', icon: ShoppingBag, category: 'Web Tools', path: '/tools/web-tools/shopify-detector', color: 'green' },
  { id: 'is-wordpress', name: 'Is WordPress?', icon: FileText, category: 'Web Tools', path: '/tools/web-tools/is-wordpress', color: 'blue' },
  { id: 'wp-theme-detector', name: 'WP Theme', icon: FileText, category: 'Web Tools', path: '/tools/web-tools/wp-theme-detector', color: 'indigo' },
  { id: 'meta-tags', name: 'Meta Tags', icon: Code, category: 'Web Tools', path: '/tools/web-tools/meta-tags', color: 'purple' },
  { id: 'ssl-lookup', name: 'SSL Lookup', icon: Lock, category: 'Web Tools', path: '/tools/web-tools/ssl-lookup', color: 'green' },

  // Other Tools
  { id: 'bluetooth-scanner', name: 'Bluetooth Scanner', icon: Bluetooth, category: 'Other Tools', path: '/tools/other-tools/bluetooth-scanner', color: 'blue' },
  { id: 'camera-detector', name: 'Camera Detector', icon: Camera, category: 'Other Tools', path: '/tools/other-tools/camera-detector', color: 'red' },
  { id: 'api-tester', name: 'API Tester', icon: Zap, category: 'Other Tools', path: '/tools/other-tools/api-tester', color: 'purple' },
  { id: 'speed-meter', name: 'Speed Meter', icon: Activity, category: 'Other Tools', path: '/tools/other-tools/speed-meter', color: 'cyan' },
  { id: 'temperature', name: 'Temperature', icon: Thermometer, category: 'Other Tools', path: '/tools/other-tools/temperature', color: 'orange' },
  { id: 'traceroute', name: 'Traceroute', icon: Route, category: 'Other Tools', path: '/tools/other-tools/traceroute', color: 'green' },
  { id: 'ping', name: 'Ping', icon: Activity, category: 'Other Tools', path: '/tools/other-tools/ping', color: 'blue' },
]

// Utility functions for tool tracking
const FAVORITES_KEY = 'thirdeye-favorite-tools'
const RECENT_KEY = 'thirdeye-recent-tools'

export function recordRecentTool(toolId: string) {
  if (typeof window === 'undefined') return
  
  try {
    const MAX_RECENT = 6
    let recent = JSON.parse(localStorage.getItem(RECENT_KEY) || '[]')
    
    // Remove if already exists
    recent = recent.filter((id: string) => id !== toolId)
    
    // Add to front
    recent.unshift(toolId)
    
    // Keep only last 6
    recent = recent.slice(0, MAX_RECENT)
    
    localStorage.setItem(RECENT_KEY, JSON.stringify(recent))
    
    // Dispatch custom event to notify other components
    window.dispatchEvent(new Event('localStorageUpdated'))
  } catch (error) {
    console.error('Error recording recent tool:', error)
  }
}

export function toggleFavorite(toolId: string): boolean {
  if (typeof window === 'undefined') return false
  
  try {
    let favorites = JSON.parse(localStorage.getItem(FAVORITES_KEY) || '[]')
    const index = favorites.findIndex((id: string) => id === toolId)
    
    if (index >= 0) {
      // Remove
      favorites.splice(index, 1)
      localStorage.setItem(FAVORITES_KEY, JSON.stringify(favorites))
      
      // Dispatch custom event to notify other components
      window.dispatchEvent(new Event('localStorageUpdated'))
      return false
    } else {
      // Add (max 6)
      if (favorites.length >= 6) {
        return false // Already at max
      }
      favorites.push(toolId)
      localStorage.setItem(FAVORITES_KEY, JSON.stringify(favorites))
      
      // Dispatch custom event to notify other components
      window.dispatchEvent(new Event('localStorageUpdated'))
      return true
    }
  } catch (error) {
    console.error('Error toggling favorite:', error)
    return false
  }
}

export function isFavorited(toolId: string): boolean {
  if (typeof window === 'undefined') return false
  
  try {
    const favorites = JSON.parse(localStorage.getItem(FAVORITES_KEY) || '[]')
    return favorites.includes(toolId)
  } catch (error) {
    return false
  }
}

export function getFavorites(): string[] {
  if (typeof window === 'undefined') return []
  
  try {
    return JSON.parse(localStorage.getItem(FAVORITES_KEY) || '[]')
  } catch (error) {
    return []
  }
}

export function getRecentTools(): string[] {
  if (typeof window === 'undefined') return []
  
  try {
    return JSON.parse(localStorage.getItem(RECENT_KEY) || '[]')
  } catch (error) {
    return []
  }
}

export function getToolById(toolId: string): SubTool | undefined {
  return ALL_SUB_TOOLS.find(tool => tool.id === toolId)
}
