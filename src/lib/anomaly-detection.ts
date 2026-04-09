// AI/ML-based Network Anomaly Detection System

export interface DeviceActivity {
  macAddress: string
  deviceName: string
  deviceType: string
  timestamp: number
  bytesUploaded: number
  bytesDownloaded: number
  connectionCount: number
  destinationIPs: string[]
  suspiciousIPs: string[]
  portActivity: number[]
}

export interface DeviceProfile {
  macAddress: string
  deviceName: string
  deviceType: string
  avgUploadRate: number
  avgDownloadRate: number
  avgConnectionCount: number
  uploadVariance: number
  downloadVariance: number
  connectionVariance: number
  typicalActiveHours: number[]
  knownDestinations: DestinationEntry[]
  firstSeen: number
  lastSeen: number
  totalObservations: number
  uploadHistory: number[]
  downloadHistory: number[]
  connectionHistory: number[]
}

interface DestinationEntry {
  ip: string
  lastSeen: number
  hitCount: number
}

export interface AnomalyAlert {
  id: string
  macAddress: string
  deviceName: string
  deviceType: string
  anomalyType: 'high_upload' | 'suspicious_ip' | 'unusual_time' | 'port_scan' | 'data_exfiltration' | 'unknown_destination' | 'connection_burst'
  severity: 'low' | 'medium' | 'high' | 'critical'
  description: string
  detectedAt: number
  acknowledged?: boolean
  metrics: {
    current: number
    baseline: number
    deviation: number
  }
  details: string
}

// --- FIX #1: Proper IP classification ---
// Private/local ranges -- these are NORMAL on your LAN, not suspicious
const PRIVATE_IP_PATTERNS = [
  /^10\./,
  /^192\.168\./,
  /^172\.(1[6-9]|2[0-9]|3[0-1])\./,
  /^127\./,
  /^169\.254\./, // Link-local
  /^fe80:/i,     // IPv6 link-local
  /^::1$/,       // IPv6 loopback
]

// Known malicious IP ranges (Bogon/reserved ranges that should NOT appear as external destinations)
const KNOWN_MALICIOUS_PATTERNS = [
  /^0\./,          // "This" network -- should never be a destination
  /^100\.(6[4-9]|[7-9]\d|1[0-1]\d|12[0-7])\./, // Carrier-grade NAT (suspicious as destination)
  /^198\.51\.100\./, // Documentation range (TEST-NET-2)
  /^203\.0\.113\./,  // Documentation range (TEST-NET-3)
  /^224\./,          // Multicast
  /^240\./,          // Reserved
  /^255\./,          // Broadcast
]

// User-configurable blocklist (can be updated from threat intelligence feeds)
let userBlocklistedIPs: Set<string> = new Set()
let userBlocklistedCIDRs: Array<{ prefix: string; mask: number }> = []

// --- FIX #2: Separate truly suspicious ports from common admin ports ---
// High-risk ports -- strong indicators of compromise
const HIGH_RISK_PORTS = [
  4444,  // Metasploit default
  6667,  // IRC (C2 channel)
  6668,  // IRC alt
  6669,  // IRC alt
  1337,  // Common backdoor
  31337, // Back Orifice
  12345, // NetBus
  27374, // SubSeven
  5555,  // Android debug bridge (if unexpected)
]

// Medium-risk ports -- suspicious in combination, normal individually
const MEDIUM_RISK_PORTS = [
  23,    // Telnet (unencrypted)
  445,   // SMB
  135,   // MSRPC
  137,   // NetBIOS
  139,   // NetBIOS
  1080,  // SOCKS proxy
  3128,  // Squid proxy
  8080,  // Alt HTTP (proxy)
  9050,  // Tor SOCKS
  9051,  // Tor control
]

// Alert cooldown period per anomaly type per device (ms)
const ALERT_COOLDOWN_MS = 5 * 60 * 1000 // 5 minutes

// Max known destinations per device profile
const MAX_KNOWN_DESTINATIONS = 500

// Destination entry TTL (30 days)
const DESTINATION_TTL_MS = 30 * 24 * 60 * 60 * 1000

// Min observations for statistical analysis
const MIN_OBSERVATIONS_FOR_STATS = 10

// Min observations for unusual time detection
const MIN_OBSERVATIONS_FOR_TIME = 20

// Rolling history window for z-score computation
const STATS_HISTORY_SIZE = 50

/**
 * Anomaly Detection Engine using statistical methods and z-score analysis
 */
export class AnomalyDetector {
  private profiles: Map<string, DeviceProfile> = new Map()
  private activityHistory: Map<string, DeviceActivity[]> = new Map()
  private alertCooldowns: Map<string, number> = new Map() // key: "mac-anomalyType" -> last alert timestamp
  private initialized: boolean = false
  private initPromise: Promise<void> | null = null
  private readonly HISTORY_LIMIT = 1000

  constructor() {
    // --- FIX #7: Don't fire-and-forget async in constructor ---
    this.initPromise = this.loadProfiles()
  }

  /**
   * Ensure profiles are loaded before operating.
   * Call this before detectAnomalies() or recordActivity() in critical paths.
   */
  async ensureInitialized(): Promise<void> {
    if (this.initialized) return
    if (this.initPromise) {
      await this.initPromise
      this.initialized = true
    }
  }

  private async loadProfiles() {
    try {
      const response = await fetch('/api/anomaly-detection/profiles')
      const data = await response.json()
      if (data.success && data.profiles) {
        data.profiles.forEach((profile: DeviceProfile) => {
          this.profiles.set(profile.macAddress, profile)
        })
      }
      this.initialized = true
    } catch (error) {
      console.error('Failed to load profiles:', error)
      this.initialized = true // Allow operation even if load fails
    }
  }

  private async saveProfiles() {
    try {
      await fetch('/api/anomaly-detection/profiles', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          profiles: Array.from(this.profiles.values())
        })
      })
    } catch (error) {
      console.error('Failed to save profiles:', error)
    }
  }

  /**
   * Add IPs to the blocklist (from threat intel feed or user config)
   */
  updateBlocklist(ips: string[], cidrs?: Array<{ prefix: string; mask: number }>) {
    ips.forEach(ip => userBlocklistedIPs.add(ip))
    if (cidrs) {
      userBlocklistedCIDRs.push(...cidrs)
    }
  }

  recordActivity(activity: DeviceActivity) {
    const { macAddress } = activity

    if (!this.activityHistory.has(macAddress)) {
      this.activityHistory.set(macAddress, [])
    }
    const history = this.activityHistory.get(macAddress)!
    history.push(activity)

    if (history.length > this.HISTORY_LIMIT) {
      history.shift()
    }

    this.updateProfile(activity)
  }

  private updateProfile(activity: DeviceActivity) {
    const { macAddress, deviceName, deviceType } = activity
    let profile = this.profiles.get(macAddress)

    if (!profile) {
      profile = {
        macAddress,
        deviceName,
        deviceType,
        avgUploadRate: activity.bytesUploaded,
        avgDownloadRate: activity.bytesDownloaded,
        avgConnectionCount: activity.connectionCount,
        uploadVariance: 0,
        downloadVariance: 0,
        connectionVariance: 0,
        typicalActiveHours: [new Date(activity.timestamp).getHours()],
        knownDestinations: activity.destinationIPs.map(ip => ({
          ip,
          lastSeen: activity.timestamp,
          hitCount: 1
        })),
        firstSeen: activity.timestamp,
        lastSeen: activity.timestamp,
        totalObservations: 1,
        uploadHistory: [activity.bytesUploaded],
        downloadHistory: [activity.bytesDownloaded],
        connectionHistory: [activity.connectionCount],
      }
      this.profiles.set(macAddress, profile)
    } else {
      const alpha = 0.1

      // --- FIX #10: Track variance for z-score computation ---
      const uploadDiff = activity.bytesUploaded - profile.avgUploadRate
      const downloadDiff = activity.bytesDownloaded - profile.avgDownloadRate
      const connDiff = activity.connectionCount - profile.avgConnectionCount

      profile.avgUploadRate = alpha * activity.bytesUploaded + (1 - alpha) * profile.avgUploadRate
      profile.avgDownloadRate = alpha * activity.bytesDownloaded + (1 - alpha) * profile.avgDownloadRate
      profile.avgConnectionCount = alpha * activity.connectionCount + (1 - alpha) * profile.avgConnectionCount

      // Online variance update (Welford-like with EMA)
      profile.uploadVariance = alpha * (uploadDiff * uploadDiff) + (1 - alpha) * profile.uploadVariance
      profile.downloadVariance = alpha * (downloadDiff * downloadDiff) + (1 - alpha) * profile.downloadVariance
      profile.connectionVariance = alpha * (connDiff * connDiff) + (1 - alpha) * profile.connectionVariance

      // Keep rolling history for stats
      profile.uploadHistory.push(activity.bytesUploaded)
      profile.downloadHistory.push(activity.bytesDownloaded)
      profile.connectionHistory.push(activity.connectionCount)
      if (profile.uploadHistory.length > STATS_HISTORY_SIZE) {
        profile.uploadHistory.shift()
        profile.downloadHistory.shift()
        profile.connectionHistory.shift()
      }

      const currentHour = new Date(activity.timestamp).getHours()
      if (!profile.typicalActiveHours.includes(currentHour)) {
        profile.typicalActiveHours.push(currentHour)
      }

      // --- FIX #6: Bounded known destinations with TTL ---
      const now = activity.timestamp
      activity.destinationIPs.forEach(ip => {
        const existing = profile!.knownDestinations.find(d => d.ip === ip)
        if (existing) {
          existing.lastSeen = now
          existing.hitCount++
        } else {
          profile!.knownDestinations.push({ ip, lastSeen: now, hitCount: 1 })
        }
      })

      // Prune expired destinations
      profile.knownDestinations = profile.knownDestinations.filter(
        d => (now - d.lastSeen) < DESTINATION_TTL_MS
      )

      // Cap total destinations (keep most recently seen)
      if (profile.knownDestinations.length > MAX_KNOWN_DESTINATIONS) {
        profile.knownDestinations.sort((a, b) => b.lastSeen - a.lastSeen)
        profile.knownDestinations = profile.knownDestinations.slice(0, MAX_KNOWN_DESTINATIONS)
      }

      profile.lastSeen = activity.timestamp
      profile.totalObservations++
    }

    if (profile.totalObservations % 10 === 0) {
      this.saveProfiles()
    }
  }

  // --- FIX #8: Alert deduplication / cooldown ---
  private isOnCooldown(macAddress: string, anomalyType: string): boolean {
    const key = `${macAddress}-${anomalyType}`
    const lastAlert = this.alertCooldowns.get(key)
    if (!lastAlert) return false
    return (Date.now() - lastAlert) < ALERT_COOLDOWN_MS
  }

  private recordAlertTime(macAddress: string, anomalyType: string) {
    const key = `${macAddress}-${anomalyType}`
    this.alertCooldowns.set(key, Date.now())
  }

  /**
   * Compute z-score: how many standard deviations a value is from the mean
   */
  private computeZScore(value: number, mean: number, variance: number): number {
    const stdDev = Math.sqrt(variance)
    if (stdDev === 0) return 0 // No variation observed -- can't compute z-score
    return (value - mean) / stdDev
  }

  detectAnomalies(activity: DeviceActivity): AnomalyAlert[] {
    const alerts: AnomalyAlert[] = []
    const profile = this.profiles.get(activity.macAddress)
    const hasEnoughData = profile && profile.totalObservations >= MIN_OBSERVATIONS_FOR_STATS

    // 1. High Upload Rate Detection
    this.detectHighUpload(activity, profile, hasEnoughData, alerts)

    // 2. Suspicious IP Detection
    this.detectSuspiciousIPs(activity, profile, alerts)

    // 3. Unusual Time Activity
    this.detectUnusualTime(activity, profile, alerts)

    // 4. Port Scanning Detection
    this.detectPortScan(activity, alerts)

    // 5. Data Exfiltration Detection (FIX #3)
    this.detectDataExfiltration(activity, profile, alerts)

    // 6. Unknown Destination Detection
    this.detectUnknownDestinations(activity, profile, hasEnoughData, alerts)

    // 7. Connection Burst Detection
    this.detectConnectionBurst(activity, profile, hasEnoughData, alerts)

    return alerts
  }

  // --- Detection #1: High Upload ---
  private detectHighUpload(
    activity: DeviceActivity,
    profile: DeviceProfile | undefined,
    hasEnoughData: boolean | undefined,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'high_upload')) return

    if (profile && hasEnoughData) {
      // --- FIX #5 & #10: Use z-score, guard against zero ---
      const zScore = this.computeZScore(
        activity.bytesUploaded,
        profile.avgUploadRate,
        profile.uploadVariance
      )

      if (zScore > 3) { // More than 3 standard deviations above mean
        const severity = zScore > 6 ? 'critical' : zScore > 4.5 ? 'high' : 'medium'
        alerts.push({
          id: `${activity.macAddress}-upload-${Date.now()}`,
          macAddress: activity.macAddress,
          deviceName: activity.deviceName,
          deviceType: activity.deviceType,
          anomalyType: 'high_upload',
          severity,
          description: `Unusual upload activity detected`,
          detectedAt: activity.timestamp,
          metrics: {
            current: activity.bytesUploaded,
            baseline: profile.avgUploadRate,
            deviation: zScore
          },
          details: `${activity.deviceName} upload is ${zScore.toFixed(1)} standard deviations above normal (${formatBytes(activity.bytesUploaded)} vs avg ${formatBytes(profile.avgUploadRate)}). This could indicate data exfiltration or malware.`
        })
        this.recordAlertTime(activity.macAddress, 'high_upload')
      }
    } else if (!profile && activity.bytesUploaded > 50_000_000) {
      // New device uploading >50MB
      alerts.push({
        id: `${activity.macAddress}-upload-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'high_upload',
        severity: 'high',
        description: `High upload activity from new device`,
        detectedAt: activity.timestamp,
        metrics: {
          current: activity.bytesUploaded,
          baseline: 0,
          deviation: 100
        },
        details: `${activity.deviceName} is uploading ${formatBytes(activity.bytesUploaded)}. This device is new to the network.`
      })
      this.recordAlertTime(activity.macAddress, 'high_upload')
    }
  }

  // --- Detection #2: Suspicious IPs (FIX #1) ---
  private detectSuspiciousIPs(
    activity: DeviceActivity,
    profile: DeviceProfile | undefined,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'suspicious_ip')) return

    const suspiciousIPs = activity.destinationIPs.filter(ip => this.isSuspiciousIP(ip))

    // Also check the pre-flagged suspicious IPs from the activity data
    const allSuspicious = [...new Set([
      ...suspiciousIPs,
      ...activity.suspiciousIPs
    ])]

    if (allSuspicious.length > 0) {
      alerts.push({
        id: `${activity.macAddress}-ip-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'suspicious_ip',
        severity: allSuspicious.length > 3 ? 'critical' : 'high',
        description: `Connection to suspicious IP addresses`,
        detectedAt: activity.timestamp,
        metrics: {
          current: allSuspicious.length,
          baseline: 0,
          deviation: allSuspicious.length
        },
        details: `${activity.deviceName} is connecting to ${allSuspicious.length} suspicious IP address(es): ${allSuspicious.slice(0, 5).join(', ')}${allSuspicious.length > 5 ? ` and ${allSuspicious.length - 5} more` : ''}`
      })
      this.recordAlertTime(activity.macAddress, 'suspicious_ip')
    }
  }

  // --- Detection #3: Unusual Time (FIX #9) ---
  private detectUnusualTime(
    activity: DeviceActivity,
    profile: DeviceProfile | undefined,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'unusual_time')) return

    const currentHour = new Date(activity.timestamp).getHours()
    if (
      profile &&
      profile.totalObservations >= MIN_OBSERVATIONS_FOR_TIME &&
      !profile.typicalActiveHours.includes(currentHour)
    ) {
      alerts.push({
        id: `${activity.macAddress}-time-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'unusual_time',
        severity: 'low',
        description: `Activity at unusual time`,
        detectedAt: activity.timestamp,
        metrics: {
          current: currentHour,
          baseline: profile.typicalActiveHours[0] || 0,
          deviation: 1
        },
        details: `${activity.deviceName} is active at ${currentHour}:00, outside its typical hours (${profile.typicalActiveHours.sort((a, b) => a - b).join(', ')}).`
      })
      this.recordAlertTime(activity.macAddress, 'unusual_time')
    }
  }

  // --- Detection #4: Port Scan (FIX #2) ---
  private detectPortScan(
    activity: DeviceActivity,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'port_scan')) return

    const highRiskHits = activity.portActivity.filter(p => HIGH_RISK_PORTS.includes(p))
    const mediumRiskHits = activity.portActivity.filter(p => MEDIUM_RISK_PORTS.includes(p))

    // Any high-risk port is immediately critical
    if (highRiskHits.length > 0) {
      alerts.push({
        id: `${activity.macAddress}-port-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'port_scan',
        severity: 'critical',
        description: `High-risk port activity detected`,
        detectedAt: activity.timestamp,
        metrics: {
          current: highRiskHits.length,
          baseline: 0,
          deviation: highRiskHits.length
        },
        details: `${activity.deviceName} is accessing high-risk ports: ${highRiskHits.join(', ')}. These ports are commonly used by malware and attack tools.`
      })
      this.recordAlertTime(activity.macAddress, 'port_scan')
    }
    // Multiple medium-risk ports together = suspicious
    else if (mediumRiskHits.length >= 3) {
      alerts.push({
        id: `${activity.macAddress}-port-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'port_scan',
        severity: 'high',
        description: `Suspicious port scanning pattern`,
        detectedAt: activity.timestamp,
        metrics: {
          current: mediumRiskHits.length,
          baseline: 0,
          deviation: mediumRiskHits.length
        },
        details: `${activity.deviceName} is accessing ${mediumRiskHits.length} sensitive ports: ${mediumRiskHits.join(', ')}. This pattern may indicate network reconnaissance.`
      })
      this.recordAlertTime(activity.macAddress, 'port_scan')
    }
  }

  // --- Detection #5: Data Exfiltration (FIX #3 -- was completely missing) ---
  private detectDataExfiltration(
    activity: DeviceActivity,
    profile: DeviceProfile | undefined,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'data_exfiltration')) return

    const history = this.activityHistory.get(activity.macAddress)
    if (!history || history.length < 5) return

    // Look at last 10 activity records for sustained upload to a single external IP
    const recentHistory = history.slice(-10)
    const externalDestinationCounts = new Map<string, { totalBytes: number; count: number }>()

    for (const h of recentHistory) {
      for (const ip of h.destinationIPs) {
        if (this.isPrivateIP(ip)) continue // Skip local traffic
        const entry = externalDestinationCounts.get(ip) || { totalBytes: 0, count: 0 }
        entry.totalBytes += h.bytesUploaded
        entry.count++
        externalDestinationCounts.set(ip, entry)
      }
    }

    // Flag: sustained upload to a single external IP across multiple observations
    for (const [ip, data] of externalDestinationCounts) {
      if (data.count >= 5 && data.totalBytes > 10_000_000) { // 5+ observations, >10MB total
        alerts.push({
          id: `${activity.macAddress}-exfil-${Date.now()}`,
          macAddress: activity.macAddress,
          deviceName: activity.deviceName,
          deviceType: activity.deviceType,
          anomalyType: 'data_exfiltration',
          severity: data.totalBytes > 100_000_000 ? 'critical' : 'high',
          description: `Possible data exfiltration detected`,
          detectedAt: activity.timestamp,
          metrics: {
            current: data.totalBytes,
            baseline: profile?.avgUploadRate || 0,
            deviation: data.count
          },
          details: `${activity.deviceName} has been steadily uploading data to ${ip} over ${data.count} observations (total: ${formatBytes(data.totalBytes)}). This pattern is consistent with data exfiltration.`
        })
        this.recordAlertTime(activity.macAddress, 'data_exfiltration')
        break // One exfiltration alert at a time
      }
    }
  }

  // --- Detection #6: Unknown Destinations ---
  private detectUnknownDestinations(
    activity: DeviceActivity,
    profile: DeviceProfile | undefined,
    hasEnoughData: boolean | undefined,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'unknown_destination')) return
    if (!profile) return

    const knownIPs = new Set(profile.knownDestinations.map(d => d.ip))
    const unknownDestinations = activity.destinationIPs.filter(ip => !knownIPs.has(ip))

    const threshold = hasEnoughData ? 5 : 15

    if (unknownDestinations.length > threshold) {
      alerts.push({
        id: `${activity.macAddress}-dest-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'unknown_destination',
        severity: unknownDestinations.length > 20 ? 'high' : 'medium',
        description: `Connecting to many unknown destinations`,
        detectedAt: activity.timestamp,
        metrics: {
          current: unknownDestinations.length,
          baseline: profile.knownDestinations.length,
          deviation: unknownDestinations.length / (profile.knownDestinations.length || 1)
        },
        details: `${activity.deviceName} is connecting to ${unknownDestinations.length} new IP addresses in a single observation. This sudden burst of new connections may indicate a compromised device.`
      })
      this.recordAlertTime(activity.macAddress, 'unknown_destination')
    }
  }

  // --- Detection #7: Connection Burst (NEW) ---
  private detectConnectionBurst(
    activity: DeviceActivity,
    profile: DeviceProfile | undefined,
    hasEnoughData: boolean | undefined,
    alerts: AnomalyAlert[]
  ) {
    if (this.isOnCooldown(activity.macAddress, 'connection_burst')) return
    if (!profile || !hasEnoughData) return

    const zScore = this.computeZScore(
      activity.connectionCount,
      profile.avgConnectionCount,
      profile.connectionVariance
    )

    if (zScore > 4) {
      alerts.push({
        id: `${activity.macAddress}-burst-${Date.now()}`,
        macAddress: activity.macAddress,
        deviceName: activity.deviceName,
        deviceType: activity.deviceType,
        anomalyType: 'connection_burst',
        severity: zScore > 6 ? 'critical' : 'high',
        description: `Sudden connection spike detected`,
        detectedAt: activity.timestamp,
        metrics: {
          current: activity.connectionCount,
          baseline: profile.avgConnectionCount,
          deviation: zScore
        },
        details: `${activity.deviceName} opened ${activity.connectionCount} connections (${zScore.toFixed(1)}x std dev above normal avg of ${profile.avgConnectionCount.toFixed(0)}). This could indicate DDoS participation, worm propagation, or port scanning.`
      })
      this.recordAlertTime(activity.macAddress, 'connection_burst')
    }
  }

  // --- FIX #1: Correct IP classification ---
  private isPrivateIP(ip: string): boolean {
    return PRIVATE_IP_PATTERNS.some(pattern => pattern.test(ip))
  }

  private isSuspiciousIP(ip: string): boolean {
    // Private IPs are normal on LAN -- skip them
    if (this.isPrivateIP(ip)) return false

    // Check against known bogon/reserved ranges
    if (KNOWN_MALICIOUS_PATTERNS.some(pattern => pattern.test(ip))) return true

    // Check against user-maintained blocklist
    if (userBlocklistedIPs.has(ip)) return true

    // Check CIDR blocklist
    for (const cidr of userBlocklistedCIDRs) {
      if (ip.startsWith(cidr.prefix)) return true
    }

    return false
  }

  getProfile(macAddress: string): DeviceProfile | undefined {
    return this.profiles.get(macAddress)
  }

  getAllProfiles(): DeviceProfile[] {
    return Array.from(this.profiles.values())
  }

  getActivityHistory(macAddress: string): DeviceActivity[] {
    return this.activityHistory.get(macAddress) || []
  }

  clearProfile(macAddress: string) {
    this.profiles.delete(macAddress)
    this.activityHistory.delete(macAddress)
    this.alertCooldowns.forEach((_, key) => {
      if (key.startsWith(macAddress)) {
        this.alertCooldowns.delete(key)
      }
    })
    this.saveProfiles()
  }

  clearAllCooldowns() {
    this.alertCooldowns.clear()
  }
}

function formatBytes(bytes: number): string {
  if (bytes < 1024) return `${bytes}B`
  if (bytes < 1024 * 1024) return `${(bytes / 1024).toFixed(1)}KB`
  if (bytes < 1024 * 1024 * 1024) return `${(bytes / (1024 * 1024)).toFixed(1)}MB`
  return `${(bytes / (1024 * 1024 * 1024)).toFixed(2)}GB`
}

// Singleton instance
let detectorInstance: AnomalyDetector | null = null

export async function getAnomalyDetector(): Promise<AnomalyDetector> {
  if (!detectorInstance) {
    detectorInstance = new AnomalyDetector()
  }
  await detectorInstance.ensureInitialized()
  return detectorInstance
}
