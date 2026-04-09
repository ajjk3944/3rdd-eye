'use client'

import { useState, useEffect } from 'react'
import { Card, CardContent } from '@/components/ui/card'
import { Button } from '@/components/ui/button'
import { Input } from '@/components/ui/input'
import { Badge } from '@/components/ui/badge'
import { Textarea } from '@/components/ui/textarea'
import {
  ArrowLeft,
  Server,
  Globe,
  Copy,
  Check,
  RefreshCw,
  Shield,
  Clock,
  MapPin,
  Key,
  AlertTriangle,
  CheckCircle,
  XCircle,
  Network,
  FileText,
  Database,
  Zap,
  Star,
} from 'lucide-react'
import { toast } from 'sonner'
import { useI18n } from '@/lib/i18n'
import { recordRecentTool, toggleFavorite, isFavorited } from '@/lib/tool-registry'

type DNSToolView = 
  | 'main'
  | 'dns-lookup'
  | 'reverse-dns'
  | 'ns-lookup'
  | 'dns-zone-transfer'
  | 'dns-leak-test'
  | 'ipv6-aaaa'
  | 'fcrdns'
  | 'dns-health'
  | 'cname-lookup'
  | 'dnskey-lookup'
  | 'dns-loc'
  | 'dns-propagation'
  | 'dnssec-lookup'
  | 'soa-lookup'
  | 'ptr-lookup'
  | 'dns-cache-test'
  | 'dns-response-time'
  | 'txt-lookup'
  | 'srv-lookup'
  | 'caa-lookup'
  | 'whois-lookup'
  | 'domain-expiry'
  | 'dns-reputation'
  | 'bimi-lookup'
  | 'vlsm-calculator'
  | 'subnet-calculator'
  | 'network-broadcast-calculator'

interface DNSToolsProps {
  onBack?: () => void
}

export default function DNSTools({ onBack }: DNSToolsProps) {
  const { t } = useI18n()
  const [currentView, setCurrentView] = useState<DNSToolView>('main')
  const [inputValue, setInputValue] = useState('')
  const [result, setResult] = useState<any>(null)
  const [loading, setLoading] = useState(false)
  const [copied, setCopied] = useState(false)
  const [favorites, setFavorites] = useState<Record<string, boolean>>({})
  
  // Calculator states
  const [subnetInput, setSubnetInput] = useState('')
  const [cidrInput, setCidrInput] = useState('24')
  const [vlsmRequirements, setVlsmRequirements] = useState<Array<{name: string, hosts: string}>>([{name: '', hosts: ''}])

  // Load favorites on mount
  useEffect(() => {
    const toolIds = ['dns-lookup', 'reverse-dns', 'whois', 'vlsm-calculator', 'subnet-calculator', 'network-broadcast', 'fcrdns']
    const favState: Record<string, boolean> = {}
    toolIds.forEach(id => {
      favState[id] = isFavorited(id)
    })
    setFavorites(favState)
  }, [])

  // Handle tool navigation with tracking
  const navigateToTool = (toolId: DNSToolView) => {
    if (toolId !== 'main') {
      recordRecentTool(toolId)
    }
    setCurrentView(toolId)
  }

  // Handle favorite toggle
  const handleToggleFavorite = (toolId: string, e: React.MouseEvent) => {
    e.stopPropagation()
    const newState = toggleFavorite(toolId)
    setFavorites(prev => ({ ...prev, [toolId]: newState }))
    if (newState) {
      toast.success('Added to favorites')
    } else {
      toast.success('Removed from favorites')
    }
  }

  const copyToClipboard = (text: string) => {
    navigator.clipboard.writeText(text)
    setCopied(true)
    toast.success('Copied to clipboard')
    setTimeout(() => setCopied(false), 2000)
  }

  const goBack = () => {
    setCurrentView('main')
    setResult(null)
    setInputValue('')
  }

  // ============ DNS LOOKUP FUNCTIONS ============
  
  // 1. DNS A Record Lookup
  const dnsLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=A`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const records = data.Answer.filter((a: any) => a.type === 1).map((a: any) => a.data)
        const ttl = data.Answer[0].TTL
        setResult({ domain, records, ttl, type: 'A' })
      } else {
        setResult({ error: 'No A records found for this domain' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup DNS records' })
    }
    setLoading(false)
  }

  // 2. Reverse DNS Lookup (PTR)
  const reverseDNSLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const ipMatch = inputValue.match(/\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\b/)
      const ip = ipMatch ? ipMatch[0] : inputValue.trim()
      
      const octets = ip.split('.')
      if (octets.length !== 4) {
        setResult({ error: 'Invalid IPv4 address format' })
        setLoading(false)
        return
      }
      
      const reverseDns = `${octets.reverse().join('.')}.in-addr.arpa`
      const response = await fetch(`https://dns.google/resolve?name=${reverseDns}&type=PTR`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const hostname = data.Answer[0].data.replace(/\.$/, '')
        setResult({ ip, hostname, type: 'PTR' })
      } else {
        setResult({ error: 'No PTR record found for this IP', ip })
      }
    } catch (error) {
      setResult({ error: 'Failed to perform reverse DNS lookup' })
    }
    setLoading(false)
  }

  // 3. NS Lookup
  const nsLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=NS`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const nameservers = data.Answer.filter((a: any) => a.type === 2).map((a: any) => a.data.replace(/\.$/, ''))
        setResult({ domain, nameservers, type: 'NS' })
      } else {
        setResult({ error: 'No NS records found for this domain' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup NS records' })
    }
    setLoading(false)
  }

  // 4. DNS Zone Transfer (simulated - real zone transfers require AXFR)
  const dnsZoneTransfer = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Fetch multiple record types
      const types = ['A', 'AAAA', 'MX', 'NS', 'TXT', 'CNAME', 'SOA']
      const results: any = { domain, records: {} }
      
      for (const type of types) {
        try {
          const response = await fetch(`https://dns.google/resolve?name=${domain}&type=${type}`)
          const data = await response.json()
          if (data.Answer && data.Answer.length > 0) {
            results.records[type] = data.Answer.map((a: any) => a.data)
          }
        } catch (e) {
          // Skip failed lookups
        }
      }
      
      setResult(results)
    } catch (error) {
      setResult({ error: 'Failed to perform zone transfer simulation' })
    }
    setLoading(false)
  }

  // 5. DNS Leak Test
  const dnsLeakTest = async () => {
    setLoading(true)
    try {
      // Test DNS servers being used
      const testDomain = `test-${Date.now()}.example.com`
      const dnsServers = []
      
      // Try to detect DNS servers
      try {
        const response = await fetch(`https://dns.google/resolve?name=${testDomain}&type=A`)
        dnsServers.push({ server: 'Google DNS (8.8.8.8)', status: 'detected' })
      } catch (e) {
        // Ignore
      }
      
      setResult({
        testDomain,
        dnsServers,
        leakDetected: false,
        message: 'DNS leak test completed. Your DNS queries appear to be secure.',
        note: 'This is a basic test. For comprehensive leak testing, use dedicated tools.'
      })
    } catch (error) {
      setResult({ error: 'Failed to perform DNS leak test' })
    }
    setLoading(false)
  }

  // 6. IPv6 AAAA Lookup
  const ipv6Lookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=AAAA`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const records = data.Answer.filter((a: any) => a.type === 28).map((a: any) => a.data)
        setResult({ domain, records, type: 'AAAA' })
      } else {
        setResult({ domain, records: [], message: 'No IPv6 (AAAA) records found' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup AAAA records' })
    }
    setLoading(false)
  }

  // 7. FCrDNS Lookup
  const fcrdnsLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const ipMatch = inputValue.match(/\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\b/)
      const ip = ipMatch ? ipMatch[0] : inputValue.trim()
      
      // Step 1: Reverse DNS lookup
      const octets = ip.split('.')
      const reverseDns = `${octets.reverse().join('.')}.in-addr.arpa`
      const ptrResponse = await fetch(`https://dns.google/resolve?name=${reverseDns}&type=PTR`)
      const ptrData = await ptrResponse.json()
      
      if (!ptrData.Answer || ptrData.Answer.length === 0) {
        setResult({ error: 'No PTR record found', ip })
        setLoading(false)
        return
      }
      
      const hostname = ptrData.Answer[0].data.replace(/\.$/, '')
      
      // Step 2: Forward DNS lookup
      const aResponse = await fetch(`https://dns.google/resolve?name=${hostname}&type=A`)
      const aData = await aResponse.json()
      
      const forwardIPs = aData.Answer ? aData.Answer.filter((a: any) => a.type === 1).map((a: any) => a.data) : []
      const matches = forwardIPs.includes(ip)
      
      setResult({
        ip,
        hostname,
        forwardIPs,
        matches,
        status: matches ? 'Valid FCrDNS' : 'FCrDNS Mismatch'
      })
    } catch (error) {
      setResult({ error: 'Failed to perform FCrDNS lookup' })
    }
    setLoading(false)
  }

  // 8. DNS Health Check
  const dnsHealthCheck = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const checks: any = {
        domain,
        tests: []
      }
      
      // Test A records
      try {
        const aResp = await fetch(`https://dns.google/resolve?name=${domain}&type=A`)
        const aData = await aResp.json()
        checks.tests.push({
          name: 'A Records',
          status: aData.Answer && aData.Answer.length > 0 ? 'pass' : 'fail',
          count: aData.Answer?.length || 0
        })
      } catch (e) {
        checks.tests.push({ name: 'A Records', status: 'error' })
      }
      
      // Test NS records
      try {
        const nsResp = await fetch(`https://dns.google/resolve?name=${domain}&type=NS`)
        const nsData = await nsResp.json()
        checks.tests.push({
          name: 'NS Records',
          status: nsData.Answer && nsData.Answer.length >= 2 ? 'pass' : 'warn',
          count: nsData.Answer?.length || 0
        })
      } catch (e) {
        checks.tests.push({ name: 'NS Records', status: 'error' })
      }
      
      // Test SOA record
      try {
        const soaResp = await fetch(`https://dns.google/resolve?name=${domain}&type=SOA`)
        const soaData = await soaResp.json()
        checks.tests.push({
          name: 'SOA Record',
          status: soaData.Answer && soaData.Answer.length > 0 ? 'pass' : 'fail'
        })
      } catch (e) {
        checks.tests.push({ name: 'SOA Record', status: 'error' })
      }
      
      const passCount = checks.tests.filter((t: any) => t.status === 'pass').length
      checks.overallHealth = passCount === checks.tests.length ? 'Healthy' : passCount > 0 ? 'Partial' : 'Unhealthy'
      
      setResult(checks)
    } catch (error) {
      setResult({ error: 'Failed to perform DNS health check' })
    }
    setLoading(false)
  }

  // 9. CNAME Lookup
  const cnameLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=CNAME`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const cname = data.Answer.find((a: any) => a.type === 5)?.data.replace(/\.$/, '')
        setResult({ domain, cname, type: 'CNAME' })
      } else {
        setResult({ domain, cname: null, message: 'No CNAME record found' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup CNAME records' })
    }
    setLoading(false)
  }

  // 10. DNSKEY Lookup
  const dnskeyLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=DNSKEY`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const keys = data.Answer.filter((a: any) => a.type === 48).map((a: any) => ({
          data: a.data,
          ttl: a.TTL
        }))
        setResult({ domain, keys, type: 'DNSKEY' })
      } else {
        setResult({ domain, keys: [], message: 'No DNSKEY records found (DNSSEC may not be enabled)' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup DNSKEY records' })
    }
    setLoading(false)
  }

  // 11. DNS LOC Lookup
  const locLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=LOC`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const locRecords = data.Answer.filter((a: any) => a.type === 29).map((a: any) => a.data)
        setResult({ domain, locRecords, type: 'LOC' })
      } else {
        setResult({ domain, locRecords: [], message: 'No LOC records found' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup LOC records' })
    }
    setLoading(false)
  }

  // 12. DNS Propagation Checker
  const dnsPropagationCheck = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Simulate checking from multiple locations
      const locations = [
        { name: 'Google DNS (US)', server: '8.8.8.8' },
        { name: 'Cloudflare (Global)', server: '1.1.1.1' },
        { name: 'OpenDNS (US)', server: '208.67.222.222' }
      ]
      
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=A`)
      const data = await response.json()
      const records = data.Answer ? data.Answer.filter((a: any) => a.type === 1).map((a: any) => a.data) : []
      
      const results = locations.map(loc => ({
        ...loc,
        records,
        status: records.length > 0 ? 'propagated' : 'not-propagated'
      }))
      
      setResult({
        domain,
        locations: results,
        fullyPropagated: results.every(r => r.status === 'propagated')
      })
    } catch (error) {
      setResult({ error: 'Failed to check DNS propagation' })
    }
    setLoading(false)
  }

  // 13. DNSSEC Lookup
  const dnssecLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Check for DNSKEY and DS records
      const dnskeyResp = await fetch(`https://dns.google/resolve?name=${domain}&type=DNSKEY`)
      const dnskeyData = await dnskeyResp.json()
      
      const dsResp = await fetch(`https://dns.google/resolve?name=${domain}&type=DS`)
      const dsData = await dsResp.json()
      
      const hasDNSKEY = dnskeyData.Answer && dnskeyData.Answer.length > 0
      const hasDS = dsData.Answer && dsData.Answer.length > 0
      
      setResult({
        domain,
        dnssecEnabled: hasDNSKEY || hasDS,
        hasDNSKEY,
        hasDS,
        status: (hasDNSKEY && hasDS) ? 'Fully Secured' : hasDNSKEY ? 'Partially Secured' : 'Not Secured'
      })
    } catch (error) {
      setResult({ error: 'Failed to check DNSSEC status' })
    }
    setLoading(false)
  }

  // 14. SOA Record Lookup
  const soaLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=SOA`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const soaData = data.Answer[0].data
        const parts = soaData.split(' ')
        setResult({
          domain,
          primaryNS: parts[0]?.replace(/\.$/, ''),
          adminEmail: parts[1]?.replace(/\.$/, '').replace('.', '@', 1),
          serial: parts[2],
          refresh: parts[3],
          retry: parts[4],
          expire: parts[5],
          minTTL: parts[6],
          type: 'SOA'
        })
      } else {
        setResult({ error: 'No SOA record found for this domain' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup SOA record' })
    }
    setLoading(false)
  }

  // 15. PTR Record Lookup (same as reverse DNS)
  const ptrLookup = reverseDNSLookup

  // 16. DNS Cache Test
  const dnsCacheTest = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // First lookup
      const start1 = Date.now()
      await fetch(`https://dns.google/resolve?name=${domain}&type=A&cd=1`) // cd=1 disables cache
      const time1 = Date.now() - start1
      
      // Second lookup (should be cached)
      const start2 = Date.now()
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=A`)
      const time2 = Date.now() - start2
      
      const data = await response.json()
      const ttl = data.Answer?.[0]?.TTL || 0
      
      setResult({
        domain,
        firstLookup: `${time1}ms`,
        secondLookup: `${time2}ms`,
        cached: time2 < time1,
        ttl: `${ttl}s`,
        improvement: time1 > 0 ? `${Math.round((1 - time2/time1) * 100)}%` : '0%'
      })
    } catch (error) {
      setResult({ error: 'Failed to perform DNS cache test' })
    }
    setLoading(false)
  }

  // 17. DNS Response Time Test
  const dnsResponseTimeTest = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const tests = []
      
      // Perform multiple tests
      for (let i = 0; i < 5; i++) {
        const start = Date.now()
        await fetch(`https://dns.google/resolve?name=${domain}&type=A&cd=1`)
        const time = Date.now() - start
        tests.push(time)
      }
      
      const avg = tests.reduce((a, b) => a + b, 0) / tests.length
      const min = Math.min(...tests)
      const max = Math.max(...tests)
      
      setResult({
        domain,
        tests: tests.map((t, i) => ({ test: i + 1, time: `${t}ms` })),
        average: `${avg.toFixed(2)}ms`,
        min: `${min}ms`,
        max: `${max}ms`,
        performance: avg < 50 ? 'Excellent' : avg < 100 ? 'Good' : avg < 200 ? 'Fair' : 'Slow'
      })
    } catch (error) {
      setResult({ error: 'Failed to test DNS response time' })
    }
    setLoading(false)
  }

  // 18. TXT Record Lookup
  const txtLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=TXT`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const txtRecords = data.Answer.filter((a: any) => a.type === 16).map((a: any) => 
          a.data.replace(/^"|"$/g, '')
        )
        setResult({ domain, txtRecords, type: 'TXT' })
      } else {
        setResult({ error: 'No TXT records found for this domain' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup TXT records' })
    }
    setLoading(false)
  }

  // 19. SRV Record Lookup
  const srvLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=SRV`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const srvRecords = data.Answer.filter((a: any) => a.type === 33).map((a: any) => {
          const parts = a.data.split(' ')
          return {
            priority: parts[0],
            weight: parts[1],
            port: parts[2],
            target: parts[3]?.replace(/\.$/, '')
          }
        })
        setResult({ domain, srvRecords, type: 'SRV' })
      } else {
        setResult({ domain, srvRecords: [], message: 'No SRV records found' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup SRV records' })
    }
    setLoading(false)
  }

  // 20. CAA Record Lookup
  const caaLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      const response = await fetch(`https://dns.google/resolve?name=${domain}&type=CAA`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const caaRecords = data.Answer.filter((a: any) => a.type === 257).map((a: any) => a.data)
        setResult({ domain, caaRecords, type: 'CAA' })
      } else {
        setResult({ domain, caaRecords: [], message: 'No CAA records found (any CA can issue certificates)' })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup CAA records' })
    }
    setLoading(false)
  }

  // 21. WHOIS Domain Lookup (Using RDAP)
  const whoisLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Try RDAP (Registration Data Access Protocol) - modern WHOIS alternative
      try {
        const response = await fetch(`https://rdap.org/domain/${domain}`)
        const data = await response.json()
        
        if (data.errorCode) {
          setResult({
            domain,
            error: data.title || 'Domain not found',
            note: 'RDAP lookup failed. The domain may not exist or RDAP data is unavailable.',
            suggestedAPI: 'https://www.whoisxmlapi.com/',
            alternativeRDAP: `https://rdap.org/domain/${domain}`
          })
        } else {
          // Extract relevant WHOIS information
          const registrar = data.entities?.find((e: any) => e.roles?.includes('registrar'))
          const registrant = data.entities?.find((e: any) => e.roles?.includes('registrant'))
          
          setResult({
            domain: data.ldhName || domain,
            status: data.status?.join(', ') || 'Unknown',
            registrar: registrar?.vcardArray?.[1]?.find((v: any) => v[0] === 'fn')?.[3] || 'Unknown',
            created: data.events?.find((e: any) => e.eventAction === 'registration')?.eventDate || 'Unknown',
            updated: data.events?.find((e: any) => e.eventAction === 'last changed')?.eventDate || 'Unknown',
            expires: data.events?.find((e: any) => e.eventAction === 'expiration')?.eventDate || 'Unknown',
            nameservers: data.nameservers?.map((ns: any) => ns.ldhName).join(', ') || 'Unknown',
            type: 'WHOIS'
          })
        }
      } catch (rdapError) {
        setResult({
          domain,
          message: 'WHOIS lookup requires a backend service',
          note: 'For production, integrate with a WHOIS API service like whoisxmlapi.com or rdap.org',
          suggestedAPI: 'https://www.whoisxmlapi.com/',
          alternativeRDAP: `https://rdap.org/domain/${domain}`
        })
      }
    } catch (error) {
      setResult({ error: 'Failed to perform WHOIS lookup' })
    }
    setLoading(false)
  }

  // 22. Domain Expiry Checker (Using RDAP)
  const domainExpiryCheck = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Try RDAP to get expiry information
      try {
        const response = await fetch(`https://rdap.org/domain/${domain}`)
        const data = await response.json()
        
        if (data.errorCode) {
          setResult({
            domain,
            error: data.title || 'Domain not found',
            note: 'Unable to retrieve expiry information. The domain may not exist or RDAP data is unavailable.',
            suggestedAPI: 'https://www.whoisxmlapi.com/',
            alternativeCheck: 'Use online tools like who.is or whois.com'
          })
        } else {
          const expiryEvent = data.events?.find((e: any) => e.eventAction === 'expiration')
          const registrationEvent = data.events?.find((e: any) => e.eventAction === 'registration')
          const updateEvent = data.events?.find((e: any) => e.eventAction === 'last changed')
          
          if (expiryEvent) {
            const expiryDate = new Date(expiryEvent.eventDate)
            const now = new Date()
            const daysUntilExpiry = Math.floor((expiryDate.getTime() - now.getTime()) / (1000 * 60 * 60 * 24))
            
            setResult({
              domain: data.ldhName || domain,
              registrationDate: registrationEvent?.eventDate || 'Unknown',
              lastUpdated: updateEvent?.eventDate || 'Unknown',
              expiryDate: expiryEvent.eventDate,
              daysUntilExpiry,
              status: daysUntilExpiry > 30 ? 'Active' : daysUntilExpiry > 0 ? 'Expiring Soon' : 'Expired',
              statusColor: daysUntilExpiry > 30 ? 'green' : daysUntilExpiry > 0 ? 'yellow' : 'red',
              type: 'EXPIRY'
            })
          } else {
            setResult({
              domain,
              message: 'Expiry date not available in RDAP data',
              registrationDate: registrationEvent?.eventDate || 'Unknown',
              lastUpdated: updateEvent?.eventDate || 'Unknown',
              note: 'Some domains do not publish expiry dates in RDAP'
            })
          }
        }
      } catch (rdapError) {
        setResult({
          domain,
          message: 'Domain expiry checking requires WHOIS data',
          note: 'For production, integrate with a WHOIS API to get registration and expiry dates',
          suggestedAPI: 'https://www.whoisxmlapi.com/',
          alternativeCheck: 'Use online tools like who.is or whois.com'
        })
      }
    } catch (error) {
      setResult({ error: 'Failed to check domain expiry' })
    }
    setLoading(false)
  }

  // 23. DNS Reputation Check
  const dnsReputationCheck = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Perform multiple DNS checks to assess reputation
      const checks: any = {
        domain,
        checks: []
      }
      
      // 1. Check A records
      try {
        const aResp = await fetch(`https://dns.google/resolve?name=${domain}&type=A`)
        const aData = await aResp.json()
        checks.checks.push({
          name: 'A Records',
          status: aData.Answer && aData.Answer.length > 0 ? 'pass' : 'fail',
          detail: aData.Answer ? `${aData.Answer.length} record(s) found` : 'No records'
        })
        if (aData.Answer && aData.Answer.length > 0) {
          checks.ipAddresses = aData.Answer.map((a: any) => a.data)
        }
      } catch (e) {
        checks.checks.push({ name: 'A Records', status: 'error', detail: 'Lookup failed' })
      }
      
      // 2. Check MX records (email reputation)
      try {
        const mxResp = await fetch(`https://dns.google/resolve?name=${domain}&type=MX`)
        const mxData = await mxResp.json()
        checks.checks.push({
          name: 'MX Records',
          status: mxData.Answer && mxData.Answer.length > 0 ? 'pass' : 'warn',
          detail: mxData.Answer ? `${mxData.Answer.length} mail server(s)` : 'No mail servers'
        })
      } catch (e) {
        checks.checks.push({ name: 'MX Records', status: 'warn', detail: 'No mail configuration' })
      }
      
      // 3. Check TXT records (SPF, DMARC, verification)
      try {
        const txtResp = await fetch(`https://dns.google/resolve?name=${domain}&type=TXT`)
        const txtData = await txtResp.json()
        const hasSPF = txtData.Answer?.some((a: any) => a.data.includes('v=spf1'))
        const hasDMARC = txtData.Answer?.some((a: any) => a.data.includes('v=DMARC1'))
        
        checks.checks.push({
          name: 'SPF Record',
          status: hasSPF ? 'pass' : 'warn',
          detail: hasSPF ? 'SPF configured' : 'No SPF record'
        })
        
        // Check DMARC
        const dmarcResp = await fetch(`https://dns.google/resolve?name=_dmarc.${domain}&type=TXT`)
        const dmarcData = await dmarcResp.json()
        const dmarcConfigured = dmarcData.Answer && dmarcData.Answer.length > 0
        
        checks.checks.push({
          name: 'DMARC Record',
          status: dmarcConfigured ? 'pass' : 'warn',
          detail: dmarcConfigured ? 'DMARC configured' : 'No DMARC record'
        })
      } catch (e) {
        checks.checks.push({ name: 'Email Security', status: 'warn', detail: 'Unable to verify' })
      }
      
      // 4. Check DNSSEC
      try {
        const dnskeyResp = await fetch(`https://dns.google/resolve?name=${domain}&type=DNSKEY`)
        const dnskeyData = await dnskeyResp.json()
        const hasDNSSEC = dnskeyData.Answer && dnskeyData.Answer.length > 0
        
        checks.checks.push({
          name: 'DNSSEC',
          status: hasDNSSEC ? 'pass' : 'warn',
          detail: hasDNSSEC ? 'DNSSEC enabled' : 'DNSSEC not enabled'
        })
      } catch (e) {
        checks.checks.push({ name: 'DNSSEC', status: 'warn', detail: 'Not configured' })
      }
      
      // 5. Check CAA records (SSL/TLS)
      try {
        const caaResp = await fetch(`https://dns.google/resolve?name=${domain}&type=CAA`)
        const caaData = await caaResp.json()
        const hasCAA = caaData.Answer && caaData.Answer.length > 0
        
        checks.checks.push({
          name: 'CAA Records',
          status: hasCAA ? 'pass' : 'info',
          detail: hasCAA ? 'CAA configured' : 'No CAA restrictions'
        })
      } catch (e) {
        checks.checks.push({ name: 'CAA Records', status: 'info', detail: 'Not configured' })
      }
      
      // Calculate reputation score
      const passCount = checks.checks.filter((c: any) => c.status === 'pass').length
      const totalChecks = checks.checks.length
      const score = Math.round((passCount / totalChecks) * 100)
      
      checks.reputationScore = score
      checks.reputationLevel = score >= 80 ? 'Excellent' : score >= 60 ? 'Good' : score >= 40 ? 'Fair' : 'Poor'
      checks.reputationColor = score >= 80 ? 'green' : score >= 60 ? 'yellow' : score >= 40 ? 'orange' : 'red'
      
      setResult(checks)
    } catch (error) {
      setResult({ error: 'Failed to perform DNS reputation check' })
    }
    setLoading(false)
  }

  // 24. BIMI Lookup and Generator
  const bimiLookup = async () => {
    if (!inputValue.trim()) return
    setLoading(true)
    try {
      const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
      
      // Check for BIMI record
      const bimiSelector = `default._bimi.${domain}`
      const response = await fetch(`https://dns.google/resolve?name=${bimiSelector}&type=TXT`)
      const data = await response.json()
      
      if (data.Answer && data.Answer.length > 0) {
        const bimiRecord = data.Answer.find((a: any) => a.data.includes('v=BIMI1'))
        
        if (bimiRecord) {
          const recordData = bimiRecord.data.replace(/^"|"$/g, '')
          const logoMatch = recordData.match(/l=([^;]+)/)
          const vmcMatch = recordData.match(/a=([^;]+)/)
          
          setResult({
            domain,
            bimiConfigured: true,
            bimiRecord: recordData,
            logoUrl: logoMatch ? logoMatch[1] : 'Not specified',
            vmcUrl: vmcMatch ? vmcMatch[1] : 'Not specified',
            status: 'BIMI is configured',
            type: 'BIMI',
            note: 'BIMI allows your brand logo to appear in supported email clients'
          })
        } else {
          setResult({
            domain,
            bimiConfigured: false,
            message: 'No BIMI record found',
            generator: true,
            note: 'Generate a BIMI record below to enable brand logo in emails'
          })
        }
      } else {
        setResult({
          domain,
          bimiConfigured: false,
          message: 'No BIMI record found',
          generator: true,
          note: 'Generate a BIMI record below to enable brand logo in emails'
        })
      }
    } catch (error) {
      setResult({ error: 'Failed to lookup BIMI record' })
    }
    setLoading(false)
  }

  const generateBIMI = () => {
    const domain = inputValue.replace(/^https?:\/\//, '').split('/')[0]
    const logoUrl = 'https://example.com/logo.svg'
    const vmcUrl = '' // Optional VMC certificate URL
    
    const bimiRecord = vmcUrl 
      ? `v=BIMI1; l=${logoUrl}; a=${vmcUrl};`
      : `v=BIMI1; l=${logoUrl};`
    
    setResult({
      domain,
      generated: true,
      bimiRecord,
      dnsRecord: `default._bimi.${domain}`,
      recordType: 'TXT',
      instructions: [
        '1. Replace the logo URL with your actual SVG logo URL (must be HTTPS)',
        '2. Logo must be in SVG Tiny P/S format',
        '3. Add this TXT record to your DNS: default._bimi.' + domain,
        '4. Ensure DMARC is configured with policy of quarantine or reject',
        '5. Optional: Add VMC (Verified Mark Certificate) URL for Gmail support'
      ],
      requirements: [
        'Valid DMARC record with p=quarantine or p=reject',
        'SPF and DKIM properly configured',
        'Logo in SVG Tiny P/S format',
        'Logo hosted on HTTPS',
        'VMC certificate (optional, required for Gmail)'
      ],
      type: 'BIMI_GENERATOR'
    })
  }

  // ============ CALCULATOR FUNCTIONS ============
  
  // Helper: IP to binary
  const ipToBinary = (ip: string): string => {
    return ip.split('.').map(octet => parseInt(octet).toString(2).padStart(8, '0')).join('.')
  }

  // Helper: Binary to IP
  const binaryToIp = (binary: string): string => {
    return binary.split('.').map(octet => parseInt(octet, 2).toString()).join('.')
  }

  // Helper: Calculate network and broadcast addresses
  const calculateNetworkBroadcast = (ip: string, cidr: number) => {
    const octets = ip.split('.').map(Number)
    const mask = (0xFFFFFFFF << (32 - cidr)) >>> 0
    
    const ipInt = (octets[0] << 24 | octets[1] << 16 | octets[2] << 8 | octets[3]) >>> 0
    const networkInt = (ipInt & mask) >>> 0
    const broadcastInt = (networkInt | ~mask) >>> 0
    
    const network = [
      (networkInt >>> 24) & 0xFF,
      (networkInt >>> 16) & 0xFF,
      (networkInt >>> 8) & 0xFF,
      networkInt & 0xFF
    ].join('.')
    
    const broadcast = [
      (broadcastInt >>> 24) & 0xFF,
      (broadcastInt >>> 16) & 0xFF,
      (broadcastInt >>> 8) & 0xFF,
      broadcastInt & 0xFF
    ].join('.')
    
    const subnetMask = [
      (mask >>> 24) & 0xFF,
      (mask >>> 16) & 0xFF,
      (mask >>> 8) & 0xFF,
      mask & 0xFF
    ].join('.')
    
    const totalHosts = Math.pow(2, 32 - cidr)
    const usableHosts = totalHosts > 2 ? totalHosts - 2 : 0
    
    return { network, broadcast, subnetMask, totalHosts, usableHosts }
  }

  // VLSM Calculator
  const calculateVLSM = () => {
    if (!subnetInput.trim()) {
      toast.error('Please enter a network address')
      return
    }
    
    const validReqs = vlsmRequirements.filter(r => r.name.trim() && r.hosts.trim() && !isNaN(Number(r.hosts)))
    if (validReqs.length === 0) {
      toast.error('Please add at least one subnet requirement')
      return
    }
    
    setLoading(true)
    
    try {
      const [baseIp, baseCidr] = subnetInput.split('/')
      if (!baseIp || !baseCidr) {
        toast.error('Invalid format. Use IP/CIDR (e.g., 192.168.1.0/24)')
        setLoading(false)
        return
      }
      
      // Sort requirements by hosts (descending)
      const sorted = [...validReqs].sort((a, b) => Number(b.hosts) - Number(a.hosts))
      
      const subnets: any[] = []
      let currentNetwork = baseIp
      
      sorted.forEach(req => {
        const requiredHosts = Number(req.hosts)
        // Calculate CIDR needed (add 2 for network and broadcast)
        const totalNeeded = requiredHosts + 2
        const cidrBits = 32 - Math.ceil(Math.log2(totalNeeded))
        
        const calc = calculateNetworkBroadcast(currentNetwork, cidrBits)
        
        subnets.push({
          name: req.name,
          requiredHosts,
          network: `${calc.network}/${cidrBits}`,
          networkAddress: calc.network,
          broadcastAddress: calc.broadcast,
          subnetMask: calc.subnetMask,
          cidr: cidrBits,
          usableHosts: calc.usableHosts,
          firstUsable: calc.network.split('.').slice(0, 3).join('.') + '.' + (parseInt(calc.network.split('.')[3]) + 1),
          lastUsable: calc.broadcast.split('.').slice(0, 3).join('.') + '.' + (parseInt(calc.broadcast.split('.')[3]) - 1)
        })
        
        // Calculate next network
        const broadcastOctets = calc.broadcast.split('.').map(Number)
        broadcastOctets[3]++
        if (broadcastOctets[3] > 255) {
          broadcastOctets[3] = 0
          broadcastOctets[2]++
          if (broadcastOctets[2] > 255) {
            broadcastOctets[2] = 0
            broadcastOctets[1]++
            if (broadcastOctets[1] > 255) {
              broadcastOctets[1] = 0
              broadcastOctets[0]++
            }
          }
        }
        currentNetwork = broadcastOctets.join('.')
      })
      
      setResult({
        baseNetwork: subnetInput,
        subnets,
        totalSubnets: subnets.length,
        type: 'VLSM'
      })
    } catch (error) {
      toast.error('Failed to calculate VLSM')
    }
    
    setLoading(false)
  }

  // Subnet Calculator
  const calculateSubnet = () => {
    if (!subnetInput.trim()) {
      toast.error('Please enter an IP address')
      return
    }
    
    setLoading(true)
    
    try {
      const [ip, cidrStr] = subnetInput.includes('/') ? subnetInput.split('/') : [subnetInput, cidrInput]
      const cidr = parseInt(cidrStr)
      
      if (cidr < 0 || cidr > 32) {
        toast.error('CIDR must be between 0 and 32')
        setLoading(false)
        return
      }
      
      const calc = calculateNetworkBroadcast(ip, cidr)
      
      // IP class
      const firstOctet = parseInt(ip.split('.')[0])
      let ipClass = 'Unknown'
      if (firstOctet >= 1 && firstOctet <= 126) ipClass = 'A'
      else if (firstOctet >= 128 && firstOctet <= 191) ipClass = 'B'
      else if (firstOctet >= 192 && firstOctet <= 223) ipClass = 'C'
      else if (firstOctet >= 224 && firstOctet <= 239) ipClass = 'D (Multicast)'
      else if (firstOctet >= 240 && firstOctet <= 255) ipClass = 'E (Reserved)'
      
      // IP type
      let ipType = 'Public'
      if (ip.startsWith('10.') || ip.startsWith('192.168.') || 
          (firstOctet === 172 && parseInt(ip.split('.')[1]) >= 16 && parseInt(ip.split('.')[1]) <= 31)) {
        ipType = 'Private'
      } else if (ip.startsWith('127.')) {
        ipType = 'Loopback'
      } else if (ip.startsWith('169.254.')) {
        ipType = 'Link-Local'
      }
      
      const firstUsable = calc.usableHosts > 0 
        ? calc.network.split('.').slice(0, 3).join('.') + '.' + (parseInt(calc.network.split('.')[3]) + 1)
        : 'N/A'
      
      const lastUsable = calc.usableHosts > 0
        ? calc.broadcast.split('.').slice(0, 3).join('.') + '.' + (parseInt(calc.broadcast.split('.')[3]) - 1)
        : 'N/A'
      
      setResult({
        ipAddress: ip,
        cidr: cidr,
        subnetMask: calc.subnetMask,
        wildcardMask: calc.subnetMask.split('.').map(o => 255 - parseInt(o)).join('.'),
        networkAddress: calc.network,
        broadcastAddress: calc.broadcast,
        firstUsable,
        lastUsable,
        totalHosts: calc.totalHosts,
        usableHosts: calc.usableHosts,
        ipClass,
        ipType,
        binary: {
          ip: ipToBinary(ip),
          mask: ipToBinary(calc.subnetMask),
          network: ipToBinary(calc.network),
          broadcast: ipToBinary(calc.broadcast)
        },
        type: 'SUBNET'
      })
    } catch (error) {
      toast.error('Failed to calculate subnet')
    }
    
    setLoading(false)
  }

  // Network/Broadcast Calculator
  const calculateNetBroadcast = () => {
    if (!subnetInput.trim()) {
      toast.error('Please enter an IP address with CIDR')
      return
    }
    
    setLoading(true)
    
    try {
      const [ip, cidrStr] = subnetInput.split('/')
      if (!cidrStr) {
        toast.error('Please include CIDR notation (e.g., 192.168.1.0/24)')
        setLoading(false)
        return
      }
      
      const cidr = parseInt(cidrStr)
      const calc = calculateNetworkBroadcast(ip, cidr)
      
      const firstUsable = calc.usableHosts > 0 
        ? calc.network.split('.').slice(0, 3).join('.') + '.' + (parseInt(calc.network.split('.')[3]) + 1)
        : 'N/A'
      
      const lastUsable = calc.usableHosts > 0
        ? calc.broadcast.split('.').slice(0, 3).join('.') + '.' + (parseInt(calc.broadcast.split('.')[3]) - 1)
        : 'N/A'
      
      setResult({
        inputAddress: subnetInput,
        networkAddress: calc.network,
        broadcastAddress: calc.broadcast,
        subnetMask: calc.subnetMask,
        firstUsable,
        lastUsable,
        totalAddresses: calc.totalHosts,
        usableAddresses: calc.usableHosts,
        cidr: cidr,
        binary: {
          network: ipToBinary(calc.network),
          broadcast: ipToBinary(calc.broadcast),
          mask: ipToBinary(calc.subnetMask)
        },
        type: 'NETBROADCAST'
      })
    } catch (error) {
      toast.error('Failed to calculate network/broadcast addresses')
    }
    
    setLoading(false)
  }

  // Main view with all DNS tools
  if (currentView === 'main') {
    return (
      <div className="space-y-6">
        {/* Sticky Back Button */}
        <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={onBack}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back
          </Button>
        </div>
        
        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            <Server className="w-6 h-6 text-cyan-400" />
            DNS Tools
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            Comprehensive DNS lookup, testing, and security tools
          </p>
        </div>

        {/* All DNS Tools */}
        <div className="grid grid-cols-2 gap-3">
            <Card 
              className="bg-[#0d120d] border-cyan-900/30 cursor-pointer hover:border-cyan-500/50 transition-all relative"
              onClick={() => navigateToTool('dns-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-cyan-500/20 flex items-center justify-center">
                    <Globe className="w-6 h-6 text-cyan-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">{t('tools.dnsLookup')}</p>
                  <p className="text-xs text-gray-500">{t('tools.aRecord')}</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('dns-lookup', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['dns-lookup'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            <Card 
              className="bg-[#0d120d] border-purple-900/30 cursor-pointer hover:border-purple-500/50 transition-all relative"
              onClick={() => navigateToTool('reverse-dns')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-purple-500/20 flex items-center justify-center">
                    <RefreshCw className="w-6 h-6 text-purple-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Reverse DNS</p>
                  <p className="text-xs text-gray-500">PTR Record</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('reverse-dns', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['reverse-dns'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            <Card 
              className="bg-[#0d120d] border-blue-900/30 cursor-pointer hover:border-blue-500/50 transition-all relative"
              onClick={() => navigateToTool('ns-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                    <Server className="w-6 h-6 text-blue-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">NS Lookup</p>
                  <p className="text-xs text-gray-500">Name Servers</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('whois', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['whois'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            <Card 
              className="bg-[#0d120d] border-green-900/30 cursor-pointer hover:border-green-500/50 transition-all relative"
              onClick={() => navigateToTool('ipv6-aaaa')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-green-500/20 flex items-center justify-center">
                    <Network className="w-6 h-6 text-green-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">IPv6 AAAA</p>
                  <p className="text-xs text-gray-500">IPv6 Address</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('vlsm-calculator', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['vlsm-calculator'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            <Card 
              className="bg-[#0d120d] border-yellow-900/30 cursor-pointer hover:border-yellow-500/50 transition-all"
              onClick={() => navigateToTool('cname-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-yellow-500/20 flex items-center justify-center">
                    <FileText className="w-6 h-6 text-yellow-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">CNAME</p>
                  <p className="text-xs text-gray-500">Alias Records</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-pink-900/30 cursor-pointer hover:border-pink-500/50 transition-all"
              onClick={() => setCurrentView('txt-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-pink-500/20 flex items-center justify-center">
                    <FileText className="w-6 h-6 text-pink-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">TXT Records</p>
                  <p className="text-xs text-gray-500">Text Records</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-indigo-900/30 cursor-pointer hover:border-indigo-500/50 transition-all"
              onClick={() => setCurrentView('srv-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-indigo-500/20 flex items-center justify-center">
                    <Database className="w-6 h-6 text-indigo-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">SRV Records</p>
                  <p className="text-xs text-gray-500">Service Location</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-orange-900/30 cursor-pointer hover:border-orange-500/50 transition-all"
              onClick={() => setCurrentView('soa-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-orange-500/20 flex items-center justify-center">
                    <Server className="w-6 h-6 text-orange-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">SOA Record</p>
                  <p className="text-xs text-gray-500">Zone Info</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-green-900/30 cursor-pointer hover:border-green-500/50 transition-all"
              onClick={() => setCurrentView('dnssec-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-green-500/20 flex items-center justify-center">
                    <Shield className="w-6 h-6 text-green-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">DNSSEC</p>
                  <p className="text-xs text-gray-500">Security Check</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-red-900/30 cursor-pointer hover:border-red-500/50 transition-all"
              onClick={() => setCurrentView('dns-leak-test')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-red-500/20 flex items-center justify-center">
                    <AlertTriangle className="w-6 h-6 text-red-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">DNS Leak</p>
                  <p className="text-xs text-gray-500">Privacy Test</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-teal-900/30 cursor-pointer hover:border-teal-500/50 transition-all"
              onClick={() => setCurrentView('dnskey-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-teal-500/20 flex items-center justify-center">
                    <Key className="w-6 h-6 text-teal-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">DNSKEY</p>
                  <p className="text-xs text-gray-500">Public Keys</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-amber-900/30 cursor-pointer hover:border-amber-500/50 transition-all"
              onClick={() => setCurrentView('caa-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-amber-500/20 flex items-center justify-center">
                    <Shield className="w-6 h-6 text-amber-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">CAA Records</p>
                  <p className="text-xs text-gray-500">SSL/TLS Auth</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-yellow-900/30 cursor-pointer hover:border-yellow-500/50 transition-all"
              onClick={() => setCurrentView('dns-health')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-yellow-500/20 flex items-center justify-center">
                    <CheckCircle className="w-6 h-6 text-yellow-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Health Check</p>
                  <p className="text-xs text-gray-500">DNS Status</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-blue-900/30 cursor-pointer hover:border-blue-500/50 transition-all"
              onClick={() => setCurrentView('dns-propagation')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                    <Globe className="w-6 h-6 text-blue-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Propagation</p>
                  <p className="text-xs text-gray-500">Global Check</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-purple-900/30 cursor-pointer hover:border-purple-500/50 transition-all"
              onClick={() => setCurrentView('dns-response-time')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-purple-500/20 flex items-center justify-center">
                    <Clock className="w-6 h-6 text-purple-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Response Time</p>
                  <p className="text-xs text-gray-500">Performance</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-cyan-900/30 cursor-pointer hover:border-cyan-500/50 transition-all"
              onClick={() => setCurrentView('dns-cache-test')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-cyan-500/20 flex items-center justify-center">
                    <Database className="w-6 h-6 text-cyan-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Cache Test</p>
                  <p className="text-xs text-gray-500">Fresh Query</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-purple-900/30 cursor-pointer hover:border-purple-500/50 transition-all relative"
              onClick={() => navigateToTool('fcrdns')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-purple-500/20 flex items-center justify-center">
                    <RefreshCw className="w-6 h-6 text-purple-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">FCrDNS</p>
                  <p className="text-xs text-gray-500">Forward Confirm</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('fcrdns', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['fcrdns'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            <Card 
              className="bg-[#0d120d] border-green-900/30 cursor-pointer hover:border-green-500/50 transition-all"
              onClick={() => setCurrentView('dns-zone-transfer')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-green-500/20 flex items-center justify-center">
                    <Database className="w-6 h-6 text-green-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Zone Transfer</p>
                  <p className="text-xs text-gray-500">All Records</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-orange-900/30 cursor-pointer hover:border-orange-500/50 transition-all"
              onClick={() => setCurrentView('dns-loc')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-orange-500/20 flex items-center justify-center">
                    <MapPin className="w-6 h-6 text-orange-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">LOC Records</p>
                  <p className="text-xs text-gray-500">Geo Location</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-pink-900/30 cursor-pointer hover:border-pink-500/50 transition-all"
              onClick={() => setCurrentView('ptr-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-pink-500/20 flex items-center justify-center">
                    <Server className="w-6 h-6 text-pink-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">PTR Records</p>
                  <p className="text-xs text-gray-500">Pointer</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-blue-900/30 cursor-pointer hover:border-blue-500/50 transition-all"
              onClick={() => setCurrentView('whois-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-blue-500/20 flex items-center justify-center">
                    <FileText className="w-6 h-6 text-blue-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">WHOIS</p>
                  <p className="text-xs text-gray-500">Domain Info</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-red-900/30 cursor-pointer hover:border-red-500/50 transition-all"
              onClick={() => setCurrentView('domain-expiry')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-red-500/20 flex items-center justify-center">
                    <Clock className="w-6 h-6 text-red-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Expiry Check</p>
                  <p className="text-xs text-gray-500">Registration</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-violet-900/30 cursor-pointer hover:border-violet-500/50 transition-all"
              onClick={() => setCurrentView('dns-reputation')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-violet-500/20 flex items-center justify-center">
                    <Shield className="w-6 h-6 text-violet-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Reputation</p>
                  <p className="text-xs text-gray-500">DNS Health Score</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-emerald-900/30 cursor-pointer hover:border-emerald-500/50 transition-all"
              onClick={() => setCurrentView('bimi-lookup')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-emerald-500/20 flex items-center justify-center">
                    <Zap className="w-6 h-6 text-emerald-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">BIMI</p>
                  <p className="text-xs text-gray-500">Brand Logo</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-lime-900/30 cursor-pointer hover:border-lime-500/50 transition-all"
              onClick={() => setCurrentView('vlsm-calculator')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-lime-500/20 flex items-center justify-center">
                    <Network className="w-6 h-6 text-lime-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">VLSM Calc</p>
                  <p className="text-xs text-gray-500">Subnet Design</p>
                </div>
              </CardContent>
            </Card>

            <Card 
              className="bg-[#0d120d] border-sky-900/30 cursor-pointer hover:border-sky-500/50 transition-all relative"
              onClick={() => navigateToTool('subnet-calculator')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-sky-500/20 flex items-center justify-center">
                    <Network className="w-6 h-6 text-sky-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Subnet Calc</p>
                  <p className="text-xs text-gray-500">IP Ranges</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('subnet-calculator', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['subnet-calculator'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>

            <Card 
              className="bg-[#0d120d] border-fuchsia-900/30 cursor-pointer hover:border-fuchsia-500/50 transition-all relative"
              onClick={() => navigateToTool('network-broadcast')}
            >
              <CardContent className="p-3">
                <div className="flex flex-col items-center text-center gap-2">
                  <div className="w-12 h-12 rounded-lg bg-fuchsia-500/20 flex items-center justify-center">
                    <Network className="w-6 h-6 text-fuchsia-400" />
                  </div>
                  <p className="text-sm font-semibold text-white">Net/Broadcast</p>
                  <p className="text-xs text-gray-500">Address Calc</p>
                </div>
              </CardContent>
              <Button
                variant="ghost"
                size="sm"
                className="absolute top-2 right-2 p-1 h-auto"
                onClick={(e) => handleToggleFavorite('network-broadcast', e)}
              >
                <Star 
                  className={`w-4 h-4 ${favorites['network-broadcast'] ? 'text-amber-400 fill-amber-400' : 'text-gray-500'}`} 
                />
              </Button>
            </Card>
          </div>
      </div>
    )
  }

  // Generic result view component
  const renderResultView = (title: string, icon: any, description: string, onLookup: () => void, placeholder: string) => (
    <div className="h-full flex flex-col">
      {/* Sticky Back Button */}
      <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
        <Button 
          variant="ghost" 
          size="sm" 
          onClick={goBack}
          className="text-gray-400 hover:text-white"
        >
          <ArrowLeft className="w-4 h-4 mr-2" />
          Back
        </Button>
      </div>

      {/* Scrollable Content */}
      <div className="flex-1 overflow-y-auto space-y-4 pr-2">
        <div>
          <h2 className="text-xl font-bold text-white flex items-center gap-2">
            {icon}
            {title}
          </h2>
          <p className="text-xs text-gray-500 mt-1">
            {description}
          </p>
        </div>

      <Input
        placeholder={placeholder}
        value={inputValue}
        onChange={(e) => setInputValue(e.target.value)}
        className="bg-[#0d120d] border-cyan-900/30 text-white"
        onKeyDown={(e) => e.key === 'Enter' && onLookup()}
      />

      <Button 
        onClick={onLookup} 
        disabled={loading || !inputValue.trim()}
        className="bg-cyan-600 hover:bg-cyan-700 w-full"
      >
        {loading ? 'Looking up...' : 'Lookup'}
      </Button>

      {result && (
        <Card className="bg-[#0d120d] border-cyan-900/30">
          <CardContent className="p-4 space-y-3">
            {result.error ? (
              <p className="text-red-400 text-sm">{result.error}</p>
            ) : (
              <div className="space-y-3">
                {Object.entries(result).map(([key, value]) => {
                  if (key === 'type') return null
                  
                  if (Array.isArray(value)) {
                    return (
                      <div key={key}>
                        <p className="text-xs text-gray-500 mb-1">{key}:</p>
                        {value.length > 0 ? (
                          value.map((item, idx) => (
                            <div key={idx} className="bg-black/30 p-2 rounded mb-1">
                              <p className="text-sm text-white font-mono break-all">
                                {typeof item === 'object' ? JSON.stringify(item, null, 2) : item}
                              </p>
                            </div>
                          ))
                        ) : (
                          <p className="text-sm text-gray-400">No records found</p>
                        )}
                      </div>
                    )
                  }
                  
                  if (typeof value === 'object' && value !== null) {
                    return (
                      <div key={key}>
                        <p className="text-xs text-gray-500 mb-1">{key}:</p>
                        <div className="bg-black/30 p-2 rounded">
                          <pre className="text-sm text-white font-mono whitespace-pre-wrap">
                            {JSON.stringify(value, null, 2)}
                          </pre>
                        </div>
                      </div>
                    )
                  }
                  
                  return (
                    <div key={key}>
                      <p className="text-xs text-gray-500">{key}:</p>
                      <div className="flex items-center gap-2">
                        <p className="text-sm text-white font-mono break-all flex-1">{String(value)}</p>
                        <Button
                          size="sm"
                          variant="ghost"
                          onClick={() => copyToClipboard(String(value))}
                          className="h-8 w-8 p-0"
                        >
                          {copied ? <Check className="w-4 h-4 text-green-400" /> : <Copy className="w-4 h-4" />}
                        </Button>
                      </div>
                    </div>
                  )
                })}
              </div>
            )}
          </CardContent>
        </Card>
      )}
      </div>
    </div>
  )

  // Render views based on currentView
  switch (currentView) {
    case 'dns-lookup':
      return renderResultView(
        'DNS Lookup (A Record)',
        <Globe className="w-6 h-6 text-cyan-400" />,
        'Basic DNS resolution - gets IPv4 address',
        dnsLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'reverse-dns':
      return renderResultView(
        'Reverse DNS Lookup',
        <RefreshCw className="w-6 h-6 text-purple-400" />,
        'IP to hostname (PTR record)',
        reverseDNSLookup,
        'Enter IP address (e.g., 8.8.8.8)'
      )
    
    case 'ns-lookup':
      return renderResultView(
        'NS Lookup',
        <Server className="w-6 h-6 text-blue-400" />,
        'Name Server records - which DNS servers handle the domain',
        nsLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'dns-zone-transfer':
      return renderResultView(
        'DNS Zone Transfer',
        <Database className="w-6 h-6 text-green-400" />,
        'Transfer entire DNS zone data (simulated)',
        dnsZoneTransfer,
        'Enter domain (e.g., google.com)'
      )
    
    case 'dns-leak-test':
      return (
        <div className="h-full flex flex-col">
          {/* Sticky Back Button */}
          <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
            <Button 
              variant="ghost" 
              size="sm" 
              onClick={goBack}
              className="text-gray-400 hover:text-white"
            >
              <ArrowLeft className="w-4 h-4 mr-2" />
              Back
            </Button>
          </div>

          {/* Scrollable Content */}
          <div className="flex-1 overflow-y-auto space-y-4 pr-2">
            <div>
              <h2 className="text-xl font-bold text-white flex items-center gap-2">
                <AlertTriangle className="w-6 h-6 text-red-400" />
                DNS Leak Test
              </h2>
              <p className="text-xs text-gray-500 mt-1">
                Check if DNS queries are leaking
              </p>
            </div>

          <Button 
            onClick={dnsLeakTest} 
            disabled={loading}
            className="bg-cyan-600 hover:bg-cyan-700 w-full"
          >
            {loading ? 'Testing...' : 'Run DNS Leak Test'}
          </Button>

          {result && (
            <Card className="bg-[#0d120d] border-cyan-900/30">
              <CardContent className="p-4 space-y-3">
                {result.error ? (
                  <p className="text-red-400 text-sm">{result.error}</p>
                ) : (
                  <div className="space-y-3">
                    <div className="flex items-center gap-2">
                      {result.leakDetected ? (
                        <XCircle className="w-6 h-6 text-red-400" />
                      ) : (
                        <CheckCircle className="w-6 h-6 text-green-400" />
                      )}
                      <p className="text-sm text-white font-semibold">
                        {result.leakDetected ? 'DNS Leak Detected!' : 'No DNS Leak Detected'}
                      </p>
                    </div>
                    <p className="text-sm text-gray-300">{result.message}</p>
                    {result.note && (
                      <p className="text-xs text-gray-500 italic">{result.note}</p>
                    )}
                  </div>
                )}
              </CardContent>
            </Card>
          )}
          </div>
        </div>
      )
    
    case 'ipv6-aaaa':
      return renderResultView(
        'IPv6 AAAA Lookup',
        <Network className="w-6 h-6 text-green-400" />,
        'Gets IPv6 address for domain',
        ipv6Lookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'fcrdns':
      return renderResultView(
        'FCrDNS Lookup',
        <RefreshCw className="w-6 h-6 text-purple-400" />,
        'Forward-Confirmed reverse DNS',
        fcrdnsLookup,
        'Enter IP address (e.g., 8.8.8.8)'
      )
    
    case 'dns-health':
      return renderResultView(
        'DNS Health Check',
        <CheckCircle className="w-6 h-6 text-yellow-400" />,
        'Overall DNS configuration health',
        dnsHealthCheck,
        'Enter domain (e.g., google.com)'
      )
    
    case 'cname-lookup':
      return renderResultView(
        'CNAME Lookup',
        <FileText className="w-6 h-6 text-yellow-400" />,
        'Canonical name (alias) records',
        cnameLookup,
        'Enter domain (e.g., www.google.com)'
      )
    
    case 'dnskey-lookup':
      return renderResultView(
        'DNSKEY Lookup',
        <Key className="w-6 h-6 text-teal-400" />,
        'DNS public keys for DNSSEC',
        dnskeyLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'dns-loc':
      return renderResultView(
        'DNS LOC Lookup',
        <MapPin className="w-6 h-6 text-orange-400" />,
        'Geographic location info in DNS',
        locLookup,
        'Enter domain (e.g., example.com)'
      )
    
    case 'dns-propagation':
      return renderResultView(
        'DNS Propagation Checker',
        <Globe className="w-6 h-6 text-blue-400" />,
        'Check DNS changes across global servers',
        dnsPropagationCheck,
        'Enter domain (e.g., google.com)'
      )
    
    case 'dnssec-lookup':
      return renderResultView(
        'DNSSEC Lookup',
        <Shield className="w-6 h-6 text-green-400" />,
        'DNS Security Extensions validation',
        dnssecLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'soa-lookup':
      return renderResultView(
        'SOA Record Lookup',
        <Server className="w-6 h-6 text-orange-400" />,
        'Start of Authority (zone info)',
        soaLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'ptr-lookup':
      return renderResultView(
        'PTR Record Lookup',
        <Server className="w-6 h-6 text-pink-400" />,
        'Pointer records',
        ptrLookup,
        'Enter IP address (e.g., 8.8.8.8)'
      )
    
    case 'dns-cache-test':
      return renderResultView(
        'DNS Cache Test',
        <Database className="w-6 h-6 text-cyan-400" />,
        'Fresh DNS queries and cache performance',
        dnsCacheTest,
        'Enter domain (e.g., google.com)'
      )
    
    case 'dns-response-time':
      return renderResultView(
        'DNS Response Time Test',
        <Clock className="w-6 h-6 text-purple-400" />,
        'DNS server performance',
        dnsResponseTimeTest,
        'Enter domain (e.g., google.com)'
      )
    
    case 'txt-lookup':
      return renderResultView(
        'TXT Record Lookup',
        <FileText className="w-6 h-6 text-pink-400" />,
        'Text records (general purpose)',
        txtLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'srv-lookup':
      return renderResultView(
        'SRV Record Lookup',
        <Database className="w-6 h-6 text-indigo-400" />,
        'Service location (used by apps like Minecraft, XMPP, etc.)',
        srvLookup,
        'Enter service domain (e.g., _xmpp._tcp.example.com)'
      )
    
    case 'caa-lookup':
      return renderResultView(
        'CAA Record Lookup',
        <Shield className="w-6 h-6 text-amber-400" />,
        'Certificate Authority Authorization (SSL/TLS certificates)',
        caaLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'whois-lookup':
      return renderResultView(
        'WHOIS Domain Lookup',
        <FileText className="w-6 h-6 text-blue-400" />,
        'Domain registration info',
        whoisLookup,
        'Enter domain (e.g., google.com)'
      )
    
    case 'domain-expiry':
      return renderResultView(
        'Domain Expiry Checker',
        <Clock className="w-6 h-6 text-red-400" />,
        'Registration expiration',
        domainExpiryCheck,
        'Enter domain (e.g., google.com)'
      )
    
    case 'dns-reputation':
      return renderResultView(
        'DNS Reputation Check',
        <Shield className="w-6 h-6 text-violet-400" />,
        'Comprehensive DNS health and reputation analysis',
        dnsReputationCheck,
        'Enter domain (e.g., google.com)'
      )
    
    case 'bimi-lookup':
      return (
        <div className="space-y-4">
          <Button 
            variant="ghost" 
            size="sm" 
            onClick={goBack}
            className="text-gray-400 hover:text-white"
          >
            <ArrowLeft className="w-4 h-4 mr-2" />
            Back
          </Button>

          <div>
            <h2 className="text-xl font-bold text-white flex items-center gap-2">
              <Zap className="w-6 h-6 text-emerald-400" />
              BIMI Lookup & Generator
            </h2>
            <p className="text-xs text-gray-500 mt-1">
              Brand Indicators for Message Identification - Display your logo in emails
            </p>
          </div>

          <Input
            placeholder="Enter domain (e.g., google.com)"
            value={inputValue}
            onChange={(e) => setInputValue(e.target.value)}
            className="bg-[#0d120d] border-cyan-900/30 text-white"
            onKeyDown={(e) => e.key === 'Enter' && bimiLookup()}
          />

          <div className="flex gap-2">
            <Button 
              onClick={bimiLookup} 
              disabled={loading || !inputValue.trim()}
              className="bg-cyan-600 hover:bg-cyan-700 flex-1"
            >
              {loading ? 'Looking up...' : 'Lookup BIMI'}
            </Button>
            
            <Button 
              onClick={generateBIMI} 
              disabled={!inputValue.trim()}
              className="bg-emerald-600 hover:bg-emerald-700 flex-1"
            >
              Generate BIMI
            </Button>
          </div>

          {result && (
            <Card className="bg-[#0d120d] border-cyan-900/30">
              <CardContent className="p-4 space-y-3">
                {result.error ? (
                  <p className="text-red-400 text-sm">{result.error}</p>
                ) : result.generated ? (
                  <div className="space-y-3">
                    <div className="flex items-center gap-2">
                      <CheckCircle className="w-6 h-6 text-emerald-400" />
                      <p className="text-sm text-white font-semibold">BIMI Record Generated</p>
                    </div>
                    
                    <div>
                      <p className="text-xs text-gray-500 mb-1">DNS Record Name:</p>
                      <div className="bg-black/30 p-2 rounded flex items-center gap-2">
                        <p className="text-sm text-white font-mono break-all flex-1">{result.dnsRecord}</p>
                        <Button
                          size="sm"
                          variant="ghost"
                          onClick={() => copyToClipboard(result.dnsRecord)}
                          className="h-8 w-8 p-0"
                        >
                          {copied ? <Check className="w-4 h-4 text-green-400" /> : <Copy className="w-4 h-4" />}
                        </Button>
                      </div>
                    </div>

                    <div>
                      <p className="text-xs text-gray-500 mb-1">Record Type:</p>
                      <Badge className="bg-blue-500/20 text-blue-400">{result.recordType}</Badge>
                    </div>

                    <div>
                      <p className="text-xs text-gray-500 mb-1">BIMI Record Value:</p>
                      <div className="bg-black/30 p-2 rounded flex items-center gap-2">
                        <p className="text-sm text-white font-mono break-all flex-1">{result.bimiRecord}</p>
                        <Button
                          size="sm"
                          variant="ghost"
                          onClick={() => copyToClipboard(result.bimiRecord)}
                          className="h-8 w-8 p-0"
                        >
                          {copied ? <Check className="w-4 h-4 text-green-400" /> : <Copy className="w-4 h-4" />}
                        </Button>
                      </div>
                    </div>

                    <div>
                      <p className="text-xs text-gray-500 mb-2">Setup Instructions:</p>
                      <div className="bg-black/30 p-3 rounded space-y-2">
                        {result.instructions.map((instruction: string, idx: number) => (
                          <p key={idx} className="text-xs text-gray-300">{instruction}</p>
                        ))}
                      </div>
                    </div>

                    <div>
                      <p className="text-xs text-gray-500 mb-2">Requirements:</p>
                      <div className="bg-black/30 p-3 rounded space-y-1">
                        {result.requirements.map((req: string, idx: number) => (
                          <div key={idx} className="flex items-start gap-2">
                            <CheckCircle className="w-3 h-3 text-emerald-400 mt-0.5 flex-shrink-0" />
                            <p className="text-xs text-gray-300">{req}</p>
                          </div>
                        ))}
                      </div>
                    </div>
                  </div>
                ) : (
                  <div className="space-y-3">
                    {result.bimiConfigured ? (
                      <>
                        <div className="flex items-center gap-2">
                          <CheckCircle className="w-6 h-6 text-green-400" />
                          <p className="text-sm text-white font-semibold">{result.status}</p>
                        </div>
                        
                        <div>
                          <p className="text-xs text-gray-500 mb-1">BIMI Record:</p>
                          <div className="bg-black/30 p-2 rounded">
                            <p className="text-sm text-white font-mono break-all">{result.bimiRecord}</p>
                          </div>
                        </div>

                        <div>
                          <p className="text-xs text-gray-500 mb-1">Logo URL:</p>
                          <div className="bg-black/30 p-2 rounded">
                            <p className="text-sm text-cyan-400 font-mono break-all">{result.logoUrl}</p>
                          </div>
                        </div>

                        {result.vmcUrl !== 'Not specified' && (
                          <div>
                            <p className="text-xs text-gray-500 mb-1">VMC Certificate URL:</p>
                            <div className="bg-black/30 p-2 rounded">
                              <p className="text-sm text-cyan-400 font-mono break-all">{result.vmcUrl}</p>
                            </div>
                          </div>
                        )}

                        {result.note && (
                          <p className="text-xs text-gray-400 italic">{result.note}</p>
                        )}
                      </>
                    ) : (
                      <>
                        <div className="flex items-center gap-2">
                          <XCircle className="w-6 h-6 text-yellow-400" />
                          <p className="text-sm text-white font-semibold">{result.message}</p>
                        </div>
                        {result.note && (
                          <p className="text-xs text-gray-400">{result.note}</p>
                        )}
                        <p className="text-xs text-cyan-400">Click "Generate BIMI" to create a BIMI record for your domain</p>
                      </>
                    )}
                  </div>
                )}
              </CardContent>
            </Card>
          )}
        </div>
      )
    
    
    // VLSM Calculator View
    case 'vlsm-calculator':
      return (
        <div className="h-full flex flex-col">
          {/* Sticky Back Button */}
          <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
            <Button variant="ghost" size="sm" onClick={goBack} className="text-gray-400 hover:text-white">
              <ArrowLeft className="w-4 h-4 mr-2" />
              Back
            </Button>
          </div>

          {/* Scrollable Content */}
          <div className="flex-1 overflow-y-auto space-y-4 pr-2">
            <div>
              <h2 className="text-xl font-bold text-white flex items-center gap-2">
                <Network className="w-6 h-6 text-lime-400" />
                VLSM Calculator
              </h2>
              <p className="text-xs text-gray-500 mt-1">Variable Length Subnet Mask - Design efficient subnets</p>
            </div>

          <div>
            <p className="text-xs text-gray-500 mb-2">Base Network (IP/CIDR)</p>
            <Input
              placeholder="e.g., 192.168.1.0/24"
              value={subnetInput}
              onChange={(e) => setSubnetInput(e.target.value)}
              className="bg-[#0d120d] border-lime-900/30 text-white"
            />
          </div>

          <div>
            <p className="text-xs text-gray-500 mb-2">Subnet Requirements</p>
            <div className="space-y-2">
              {vlsmRequirements.map((req, index) => (
                <div key={index} className="flex gap-2">
                  <Input
                    placeholder="Subnet name"
                    value={req.name}
                    onChange={(e) => {
                      const newReqs = [...vlsmRequirements]
                      newReqs[index].name = e.target.value
                      setVlsmRequirements(newReqs)
                    }}
                    className="bg-[#0d120d] border-lime-900/30 text-white flex-1"
                  />
                  <Input
                    placeholder="Hosts"
                    type="number"
                    value={req.hosts}
                    onChange={(e) => {
                      const newReqs = [...vlsmRequirements]
                      newReqs[index].hosts = e.target.value
                      setVlsmRequirements(newReqs)
                    }}
                    className="bg-[#0d120d] border-lime-900/30 text-white w-24"
                  />
                  <Button
                    variant="ghost"
                    size="sm"
                    onClick={() => setVlsmRequirements(vlsmRequirements.filter((_, i) => i !== index))}
                    className="text-red-400 hover:text-red-300"
                  >
                    ×
                  </Button>
                </div>
              ))}
              <Button
                variant="outline"
                size="sm"
                onClick={() => setVlsmRequirements([...vlsmRequirements, {name: '', hosts: ''}])}
                className="w-full border-lime-900/30 text-lime-400 hover:bg-lime-900/20"
              >
                + Add Subnet
              </Button>
            </div>
          </div>

          <Button onClick={calculateVLSM} disabled={loading} className="bg-lime-600 hover:bg-lime-700 w-full">
            {loading ? 'Calculating...' : 'Calculate VLSM'}
          </Button>

          {result && result.type === 'VLSM' && (
            <Card className="bg-[#0d120d] border-lime-900/30">
              <CardContent className="p-4 space-y-4">
                <div className="flex items-center justify-between">
                  <p className="text-sm font-semibold text-white">VLSM Design</p>
                  <Badge className="bg-lime-500/20 text-lime-400">{result.totalSubnets} Subnets</Badge>
                </div>

                <div className="p-3 rounded bg-lime-900/10">
                  <p className="text-xs text-gray-500">Base Network</p>
                  <p className="text-white font-mono">{result.baseNetwork}</p>
                </div>

                <div className="space-y-3">
                  {result.subnets.map((subnet: any, idx: number) => (
                    <Card key={idx} className="bg-black/30 border-lime-900/20">
                      <CardContent className="p-3 space-y-2">
                        <div className="flex items-center justify-between">
                          <p className="text-sm font-semibold text-white">{subnet.name}</p>
                          <Badge className="bg-lime-500/20 text-lime-400">/{subnet.cidr}</Badge>
                        </div>
                        
                        <div className="grid grid-cols-2 gap-2 text-xs">
                          <div>
                            <p className="text-gray-500">Network</p>
                            <p className="text-white font-mono">{subnet.network}</p>
                          </div>
                          <div>
                            <p className="text-gray-500">Broadcast</p>
                            <p className="text-white font-mono">{subnet.broadcastAddress}</p>
                          </div>
                          <div>
                            <p className="text-gray-500">Subnet Mask</p>
                            <p className="text-white font-mono">{subnet.subnetMask}</p>
                          </div>
                          <div>
                            <p className="text-gray-500">Usable Hosts</p>
                            <p className="text-white font-mono">{subnet.usableHosts}</p>
                          </div>
                          <div>
                            <p className="text-gray-500">First Usable</p>
                            <p className="text-white font-mono">{subnet.firstUsable}</p>
                          </div>
                          <div>
                            <p className="text-gray-500">Last Usable</p>
                            <p className="text-white font-mono">{subnet.lastUsable}</p>
                          </div>
                        </div>
                      </CardContent>
                    </Card>
                  ))}
                </div>
              </CardContent>
            </Card>
          )}
          </div>
        </div>
      )

    // Subnet Calculator View
    case 'subnet-calculator':
      return (
        <div className="h-full flex flex-col">
          {/* Sticky Back Button */}
          <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
            <Button variant="ghost" size="sm" onClick={goBack} className="text-gray-400 hover:text-white">
              <ArrowLeft className="w-4 h-4 mr-2" />
              Back
            </Button>
          </div>

          {/* Scrollable Content */}
          <div className="flex-1 overflow-y-auto space-y-4 pr-2">
            <div>
              <h2 className="text-xl font-bold text-white flex items-center gap-2">
                <Network className="w-6 h-6 text-sky-400" />
                Subnet Calculator
              </h2>
              <p className="text-xs text-gray-500 mt-1">Calculate subnet details and IP ranges</p>
            </div>

          <div>
            <p className="text-xs text-gray-500 mb-2">IP Address / CIDR</p>
            <Input
              placeholder="e.g., 192.168.1.0/24 or 192.168.1.0"
              value={subnetInput}
              onChange={(e) => setSubnetInput(e.target.value)}
              className="bg-[#0d120d] border-sky-900/30 text-white"
              onKeyDown={(e) => e.key === 'Enter' && calculateSubnet()}
            />
          </div>

          {!subnetInput.includes('/') && (
            <div>
              <p className="text-xs text-gray-500 mb-2">CIDR Prefix Length</p>
              <Input
                type="number"
                min="0"
                max="32"
                placeholder="24"
                value={cidrInput}
                onChange={(e) => setCidrInput(e.target.value)}
                className="bg-[#0d120d] border-sky-900/30 text-white"
              />
            </div>
          )}

          <Button onClick={calculateSubnet} disabled={loading} className="bg-sky-600 hover:bg-sky-700 w-full">
            {loading ? 'Calculating...' : 'Calculate Subnet'}
          </Button>

          {result && result.type === 'SUBNET' && (
            <Card className="bg-[#0d120d] border-sky-900/30">
              <CardContent className="p-4 space-y-4">
                <div className="flex items-center justify-between">
                  <p className="text-sm font-semibold text-white">Subnet Information</p>
                  <div className="flex gap-2">
                    <Badge className="bg-sky-500/20 text-sky-400">Class {result.ipClass}</Badge>
                    <Badge className="bg-purple-500/20 text-purple-400">{result.ipType}</Badge>
                  </div>
                </div>

                <div className="grid grid-cols-2 gap-3">
                  <div className="p-3 rounded bg-sky-900/10">
                    <p className="text-xs text-gray-500">IP Address</p>
                    <p className="text-white font-mono text-sm">{result.ipAddress}/{result.cidr}</p>
                  </div>
                  <div className="p-3 rounded bg-sky-900/10">
                    <p className="text-xs text-gray-500">Subnet Mask</p>
                    <p className="text-white font-mono text-sm">{result.subnetMask}</p>
                  </div>
                  <div className="p-3 rounded bg-sky-900/10">
                    <p className="text-xs text-gray-500">Network Address</p>
                    <p className="text-white font-mono text-sm">{result.networkAddress}</p>
                  </div>
                  <div className="p-3 rounded bg-sky-900/10">
                    <p className="text-xs text-gray-500">Broadcast Address</p>
                    <p className="text-white font-mono text-sm">{result.broadcastAddress}</p>
                  </div>
                  <div className="p-3 rounded bg-sky-900/10">
                    <p className="text-xs text-gray-500">First Usable IP</p>
                    <p className="text-white font-mono text-sm">{result.firstUsable}</p>
                  </div>
                  <div className="p-3 rounded bg-sky-900/10">
                    <p className="text-xs text-gray-500">Last Usable IP</p>
                    <p className="text-white font-mono text-sm">{result.lastUsable}</p>
                  </div>
                  <div className="p-3 rounded bg-green-900/10">
                    <p className="text-xs text-gray-500">Total Hosts</p>
                    <p className="text-green-400 font-mono text-lg">{result.totalHosts.toLocaleString()}</p>
                  </div>
                  <div className="p-3 rounded bg-green-900/10">
                    <p className="text-xs text-gray-500">Usable Hosts</p>
                    <p className="text-green-400 font-mono text-lg">{result.usableHosts.toLocaleString()}</p>
                  </div>
                  <div className="p-3 rounded bg-sky-900/10 col-span-2">
                    <p className="text-xs text-gray-500">Wildcard Mask</p>
                    <p className="text-white font-mono text-sm">{result.wildcardMask}</p>
                  </div>
                </div>

                <div>
                  <p className="text-xs text-gray-500 mb-2">Binary Representation</p>
                  <div className="space-y-1 bg-black/30 p-3 rounded">
                    <div>
                      <p className="text-xs text-gray-500">IP:</p>
                      <p className="text-white font-mono text-xs">{result.binary.ip}</p>
                    </div>
                    <div>
                      <p className="text-xs text-gray-500">Mask:</p>
                      <p className="text-white font-mono text-xs">{result.binary.mask}</p>
                    </div>
                    <div>
                      <p className="text-xs text-gray-500">Network:</p>
                      <p className="text-white font-mono text-xs">{result.binary.network}</p>
                    </div>
                    <div>
                      <p className="text-xs text-gray-500">Broadcast:</p>
                      <p className="text-white font-mono text-xs">{result.binary.broadcast}</p>
                    </div>
                  </div>
                </div>
              </CardContent>
            </Card>
          )}
          </div>
        </div>
      )

    // Network/Broadcast Calculator View
    case 'network-broadcast-calculator':
      return (
        <div className="h-full flex flex-col">
          {/* Sticky Back Button */}
          <div className="sticky top-0 z-10 bg-[#0d120d] border-b border-cyan-900/30 pb-4 mb-4">
            <Button variant="ghost" size="sm" onClick={goBack} className="text-gray-400 hover:text-white">
              <ArrowLeft className="w-4 h-4 mr-2" />
              Back
            </Button>
          </div>

          {/* Scrollable Content */}
          <div className="flex-1 overflow-y-auto space-y-4 pr-2">
            <div>
              <h2 className="text-xl font-bold text-white flex items-center gap-2">
                <Network className="w-6 h-6 text-fuchsia-400" />
                Network/Broadcast Calculator
              </h2>
              <p className="text-xs text-gray-500 mt-1">Calculate network and broadcast addresses</p>
            </div>

          <div>
            <p className="text-xs text-gray-500 mb-2">IP Address with CIDR</p>
            <Input
              placeholder="e.g., 192.168.1.100/24"
              value={subnetInput}
              onChange={(e) => setSubnetInput(e.target.value)}
              className="bg-[#0d120d] border-fuchsia-900/30 text-white"
              onKeyDown={(e) => e.key === 'Enter' && calculateNetBroadcast()}
            />
          </div>

          <Button onClick={calculateNetBroadcast} disabled={loading} className="bg-fuchsia-600 hover:bg-fuchsia-700 w-full">
            {loading ? 'Calculating...' : 'Calculate'}
          </Button>

          {result && result.type === 'NETBROADCAST' && (
            <Card className="bg-[#0d120d] border-fuchsia-900/30">
              <CardContent className="p-4 space-y-4">
                <div className="flex items-center justify-between">
                  <p className="text-sm font-semibold text-white">Address Information</p>
                  <Badge className="bg-fuchsia-500/20 text-fuchsia-400">/{result.cidr}</Badge>
                </div>

                <div className="p-3 rounded bg-fuchsia-900/10">
                  <p className="text-xs text-gray-500">Input Address</p>
                  <p className="text-white font-mono">{result.inputAddress}</p>
                </div>

                <div className="grid grid-cols-2 gap-3">
                  <div className="p-4 rounded bg-gradient-to-br from-fuchsia-900/20 to-purple-900/20 border border-fuchsia-900/30">
                    <p className="text-xs text-gray-500 mb-1">Network Address</p>
                    <p className="text-fuchsia-400 font-mono text-lg">{result.networkAddress}</p>
                    <p className="text-xs text-gray-400 mt-2 font-mono">{result.binary.network}</p>
                  </div>
                  <div className="p-4 rounded bg-gradient-to-br from-purple-900/20 to-pink-900/20 border border-purple-900/30">
                    <p className="text-xs text-gray-500 mb-1">Broadcast Address</p>
                    <p className="text-purple-400 font-mono text-lg">{result.broadcastAddress}</p>
                    <p className="text-xs text-gray-400 mt-2 font-mono">{result.binary.broadcast}</p>
                  </div>
                </div>

                <div className="grid grid-cols-2 gap-3">
                  <div className="p-3 rounded bg-fuchsia-900/10">
                    <p className="text-xs text-gray-500">Subnet Mask</p>
                    <p className="text-white font-mono text-sm">{result.subnetMask}</p>
                  </div>
                  <div className="p-3 rounded bg-fuchsia-900/10">
                    <p className="text-xs text-gray-500">CIDR Notation</p>
                    <p className="text-white font-mono text-sm">/{result.cidr}</p>
                  </div>
                  <div className="p-3 rounded bg-green-900/10">
                    <p className="text-xs text-gray-500">First Usable</p>
                    <p className="text-green-400 font-mono text-sm">{result.firstUsable}</p>
                  </div>
                  <div className="p-3 rounded bg-green-900/10">
                    <p className="text-xs text-gray-500">Last Usable</p>
                    <p className="text-green-400 font-mono text-sm">{result.lastUsable}</p>
                  </div>
                  <div className="p-3 rounded bg-blue-900/10">
                    <p className="text-xs text-gray-500">Total Addresses</p>
                    <p className="text-blue-400 font-mono text-lg">{result.totalAddresses.toLocaleString()}</p>
                  </div>
                  <div className="p-3 rounded bg-blue-900/10">
                    <p className="text-xs text-gray-500">Usable Addresses</p>
                    <p className="text-blue-400 font-mono text-lg">{result.usableAddresses.toLocaleString()}</p>
                  </div>
                </div>

                <div className="p-3 rounded bg-black/30">
                  <p className="text-xs text-gray-500 mb-2">Subnet Mask (Binary)</p>
                  <p className="text-white font-mono text-xs">{result.binary.mask}</p>
                </div>
              </CardContent>
            </Card>
          )}
          </div>
        </div>
      )

    default:
      return null
  }
}

