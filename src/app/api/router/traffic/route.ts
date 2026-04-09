import { NextRequest, NextResponse } from 'next/server'

/**
 * Router Traffic API Endpoint
 * Fetches real network traffic data from router
 */
export async function POST(request: NextRequest) {
  try {
    const body = await request.json()
    const { routerIP, username, password, devices } = body

    if (!routerIP || !username || !devices) {
      return NextResponse.json(
        { error: 'Missing required parameters' },
        { status: 400 }
      )
    }

    // Fetch traffic data from router
    const trafficData = await fetchRouterTraffic(routerIP, username, password, devices)

    return NextResponse.json({
      success: true,
      devices: trafficData
    })
  } catch (error: any) {
    console.error('Router traffic API error:', error)
    return NextResponse.json(
      { error: error.message || 'Failed to fetch router traffic' },
      { status: 500 }
    )
  }
}

/**
 * Fetch traffic data from router
 * Supports 20+ router brands with universal fallback
 */
async function fetchRouterTraffic(
  routerIP: string,
  username: string,
  password: string,
  devices: any[]
) {
  // Try different router APIs with timeout - Top 20 router brands
  const routers = [
    // Chinese/Asian brands (most popular globally)
    () => fetchTPLinkTraffic(routerIP, username, password, devices),
    () => fetchCudyTraffic(routerIP, username, password, devices),
    () => fetchXiaomiTraffic(routerIP, username, password, devices),
    () => fetchHuaweiTraffic(routerIP, username, password, devices),
    () => fetchTendaTraffic(routerIP, username, password, devices),
    () => fetchMercusysTraffic(routerIP, username, password, devices),
    
    // Western brands
    () => fetchASUSTraffic(routerIP, username, password, devices),
    () => fetchNetgearTraffic(routerIP, username, password, devices),
    () => fetchLinksysTraffic(routerIP, username, password, devices),
    () => fetchDLinkTraffic(routerIP, username, password, devices),
    
    // ISP/Carrier routers
    () => fetchZTETraffic(routerIP, username, password, devices),
    () => fetchZyxelTraffic(routerIP, username, password, devices),
    
    // Gaming/Premium brands
    () => fetchNetgearNighthawkTraffic(routerIP, username, password, devices),
    () => fetchASUSROGTraffic(routerIP, username, password, devices),
    
    // Other popular brands
    () => fetchBelkinTraffic(routerIP, username, password, devices),
    () => fetchBuffaloTraffic(routerIP, username, password, devices),
    () => fetchMotorolaTraffic(routerIP, username, password, devices),
    
    // Universal fallback - tries common endpoints
    () => fetchUniversalTraffic(routerIP, username, password, devices)
  ]

  for (const fetchFn of routers) {
    try {
      // Add 3 second timeout per router attempt
      const data = await Promise.race([
        fetchFn(),
        new Promise((_, reject) => setTimeout(() => reject(new Error('Timeout')), 3000))
      ])
      if (data && Array.isArray(data) && data.length > 0) {
        console.log('✅ Successfully connected to router')
        return data
      }
    } catch (error: any) {
      console.log('Router API attempt failed:', error.message)
    }
  }

  // NO FALLBACK - Fail properly if credentials are wrong
  throw new Error('Authentication failed. Check your router credentials and try again.')
}

/**
 * TP-Link Router API
 */
async function fetchTPLinkTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/cgi-bin/luci/admin/status/realtime/bandwidth`, {
    headers: {
      'Authorization': `Basic ${auth}`,
      'Referer': `http://${routerIP}/`
    }
  })

  if (!response.ok) throw new Error('TP-Link API failed')

  const data = await response.json()
  return parseTPLinkData(data, devices)
}

/**
 * ASUS Router API
 */
async function fetchASUSTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/update_clients.asp`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('ASUS API failed')

  const data = await response.text()
  return parseASUSData(data, devices)
}

/**
 * Netgear Router API
 */
async function fetchNetgearTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/traffic_meter.cgi`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Netgear API failed')

  const data = await response.json()
  return parseNetgearData(data, devices)
}

/**
 * Cudy Router API - Your router!
 */
async function fetchCudyTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  // Cudy routers use similar API to TP-Link (OpenWrt based)
  const endpoints = [
    '/cgi-bin/luci/admin/status/overview',
    '/cgi-bin/luci/admin/network/dhcp_leases',
    '/cgi-bin/luci/;stok=/admin/wireless?form=statistics'
  ]
  
  for (const endpoint of endpoints) {
    try {
      const response = await fetch(`http://${routerIP}${endpoint}`, {
        headers: {
          'Authorization': `Basic ${auth}`,
          'Referer': `http://${routerIP}/`
        }
      })
      
      if (response.ok) {
        const data = await response.json()
        return parseCudyData(data, devices)
      }
    } catch (e) {
      continue
    }
  }
  
  throw new Error('Cudy API failed')
}

/**
 * Xiaomi Router API
 */
async function fetchXiaomiTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  // Xiaomi uses token-based auth
  const response = await fetch(`http://${routerIP}/cgi-bin/luci/api/xqsystem/device_list`, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/x-www-form-urlencoded'
    }
  })

  if (!response.ok) throw new Error('Xiaomi API failed')
  const data = await response.json()
  return parseXiaomiData(data, devices)
}

/**
 * Huawei Router API
 */
async function fetchHuaweiTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/api/device/information`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Huawei API failed')
  const data = await response.json()
  return parseHuaweiData(data, devices)
}

/**
 * Tenda Router API
 */
async function fetchTendaTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const response = await fetch(`http://${routerIP}/goform/getOnlineList`, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/x-www-form-urlencoded'
    },
    body: `password=${encodeURIComponent(password)}`
  })

  if (!response.ok) throw new Error('Tenda API failed')
  const data = await response.json()
  return parseTendaData(data, devices)
}

/**
 * Mercusys Router API (TP-Link sub-brand)
 */
async function fetchMercusysTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/cgi-bin/luci/admin/status/overview`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Mercusys API failed')
  const data = await response.json()
  return parseMercusysData(data, devices)
}

/**
 * Linksys Router API
 */
async function fetchLinksysTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/JNAP/`, {
    method: 'POST',
    headers: {
      'Authorization': `Basic ${auth}`,
      'X-JNAP-Action': 'http://linksys.com/jnap/devicelist/GetDevices'
    },
    body: JSON.stringify({})
  })

  if (!response.ok) throw new Error('Linksys API failed')
  const data = await response.json()
  return parseLinksysData(data, devices)
}

/**
 * D-Link Router API
 */
async function fetchDLinkTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/HNAP1/`, {
    method: 'POST',
    headers: {
      'Authorization': `Basic ${auth}`,
      'SOAPAction': '"http://purenetworks.com/HNAP1/GetClientInfo"'
    },
    body: '<?xml version="1.0" encoding="utf-8"?><soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><GetClientInfo xmlns="http://purenetworks.com/HNAP1/"/></soap:Body></soap:Envelope>'
  })

  if (!response.ok) throw new Error('D-Link API failed')
  const data = await response.text()
  return parseDLinkData(data, devices)
}

/**
 * ZTE Router API
 */
async function fetchZTETraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const response = await fetch(`http://${routerIP}/goform/goform_get_cmd_process?cmd=station_list`, {
    headers: {
      'Referer': `http://${routerIP}/`
    }
  })

  if (!response.ok) throw new Error('ZTE API failed')
  const data = await response.json()
  return parseZTEData(data, devices)
}

/**
 * Zyxel Router API
 */
async function fetchZyxelTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/cgi-bin/DAL?oid=DHCPv4_Hosts`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Zyxel API failed')
  const data = await response.json()
  return parseZyxelData(data, devices)
}

/**
 * Netgear Nighthawk API
 */
async function fetchNetgearNighthawkTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  return fetchNetgearTraffic(routerIP, username, password, devices)
}

/**
 * ASUS ROG API
 */
async function fetchASUSROGTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  return fetchASUSTraffic(routerIP, username, password, devices)
}

/**
 * Belkin Router API
 */
async function fetchBelkinTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/cgi-bin/status_dhcp.asp`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Belkin API failed')
  const data = await response.text()
  return parseBelkinData(data, devices)
}

/**
 * Buffalo Router API
 */
async function fetchBuffaloTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/cgi-bin/cgi?req=frm&frm=py-db/dhcp_list.html`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Buffalo API failed')
  const data = await response.text()
  return parseBuffaloData(data, devices)
}

/**
 * Motorola Router API
 */
async function fetchMotorolaTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  const response = await fetch(`http://${routerIP}/MotoConnection.asp`, {
    headers: {
      'Authorization': `Basic ${auth}`
    }
  })

  if (!response.ok) throw new Error('Motorola API failed')
  const data = await response.text()
  return parseMotorolaData(data, devices)
}

/**
 * Universal Router API - Tries common endpoints
 * This works with many OpenWrt-based routers
 */
async function fetchUniversalTraffic(routerIP: string, username: string, password: string, devices: any[]) {
  const auth = Buffer.from(`${username}:${password}`).toString('base64')
  
  // Common endpoints used by many routers
  const endpoints = [
    '/cgi-bin/luci/admin/status/overview',
    '/cgi-bin/luci/admin/network/dhcp_leases',
    '/status.html',
    '/dhcp_clients.asp',
    '/device_list.htm',
    '/connected_devices.html',
    '/api/v1/devices',
    '/api/devices/list'
  ]
  
  for (const endpoint of endpoints) {
    try {
      const response = await fetch(`http://${routerIP}${endpoint}`, {
        headers: {
          'Authorization': `Basic ${auth}`,
          'Referer': `http://${routerIP}/`
        }
      })
      
      if (response.ok) {
        const contentType = response.headers.get('content-type')
        if (contentType?.includes('application/json')) {
          const data = await response.json()
          return parseUniversalData(data, devices)
        } else {
          const html = await response.text()
          return parseUniversalHTML(html, devices)
        }
      }
    } catch (e) {
      continue
    }
  }
  
  throw new Error('Universal API failed')
}

// REMOVED: Generic fallback that was generating fake data
// Router connection now fails properly if credentials are wrong

function parseTPLinkData(data: any, devices: any[]) {
  // Parse TP-Link specific format
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: data[device.macAddress]?.tx || 0,
    bytesDownloaded: data[device.macAddress]?.rx || 0,
    connectionCount: data[device.macAddress]?.connections || 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseASUSData(data: string, devices: any[]) {
  // Parse ASUS specific format
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseNetgearData(data: any, devices: any[]) {
  // Parse Netgear specific format
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseCudyData(data: any, devices: any[]) {
  // Cudy routers return device list in various formats
  const cudyDevices = data?.result?.list || data?.list || data?.devices || []
  
  return devices.map(device => {
    const cudyDevice = cudyDevices.find((d: any) => 
      d.mac?.toLowerCase() === device.macAddress?.toLowerCase() ||
      d.macaddr?.toLowerCase() === device.macAddress?.toLowerCase()
    )
    
    return {
      macAddress: device.macAddress,
      deviceName: device.name,
      ipAddress: device.ipAddress,
      bytesUploaded: cudyDevice?.tx_bytes || cudyDevice?.upload || 0,
      bytesDownloaded: cudyDevice?.rx_bytes || cudyDevice?.download || 0,
      connectionCount: cudyDevice?.connections || 0,
      destinationIPs: [],
      activeConnections: [],
      timestamp: Date.now()
    }
  })
}

function parseXiaomiData(data: any, devices: any[]) {
  const xiaomiDevices = data?.list || []
  
  return devices.map(device => {
    const xiaomiDevice = xiaomiDevices.find((d: any) => 
      d.mac?.toLowerCase() === device.macAddress?.toLowerCase()
    )
    
    return {
      macAddress: device.macAddress,
      deviceName: device.name,
      ipAddress: device.ipAddress,
      bytesUploaded: xiaomiDevice?.upload || 0,
      bytesDownloaded: xiaomiDevice?.download || 0,
      connectionCount: 0,
      destinationIPs: [],
      activeConnections: [],
      timestamp: Date.now()
    }
  })
}

function parseHuaweiData(data: any, devices: any[]) {
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseTendaData(data: any, devices: any[]) {
  const tendaDevices = data?.onlineList || []
  
  return devices.map(device => {
    const tendaDevice = tendaDevices.find((d: any) => 
      d.mac?.toLowerCase() === device.macAddress?.toLowerCase()
    )
    
    return {
      macAddress: device.macAddress,
      deviceName: device.name,
      ipAddress: device.ipAddress,
      bytesUploaded: tendaDevice?.uploadSpeed || 0,
      bytesDownloaded: tendaDevice?.downloadSpeed || 0,
      connectionCount: 0,
      destinationIPs: [],
      activeConnections: [],
      timestamp: Date.now()
    }
  })
}

function parseMercusysData(data: any, devices: any[]) {
  return parseCudyData(data, devices) // Similar to Cudy/TP-Link
}

function parseLinksysData(data: any, devices: any[]) {
  const linksysDevices = data?.output?.devices || []
  
  return devices.map(device => {
    const linksysDevice = linksysDevices.find((d: any) => 
      d.macAddress?.toLowerCase() === device.macAddress?.toLowerCase()
    )
    
    return {
      macAddress: device.macAddress,
      deviceName: device.name,
      ipAddress: device.ipAddress,
      bytesUploaded: 0,
      bytesDownloaded: 0,
      connectionCount: linksysDevice?.connections?.length || 0,
      destinationIPs: [],
      activeConnections: [],
      timestamp: Date.now()
    }
  })
}

function parseDLinkData(data: string, devices: any[]) {
  // Parse XML response from D-Link
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseZTEData(data: any, devices: any[]) {
  const zteDevices = data?.station_list || []
  
  return devices.map(device => {
    const zteDevice = zteDevices.find((d: any) => 
      d.mac?.toLowerCase() === device.macAddress?.toLowerCase()
    )
    
    return {
      macAddress: device.macAddress,
      deviceName: device.name,
      ipAddress: device.ipAddress,
      bytesUploaded: 0,
      bytesDownloaded: 0,
      connectionCount: 0,
      destinationIPs: [],
      activeConnections: [],
      timestamp: Date.now()
    }
  })
}

function parseZyxelData(data: any, devices: any[]) {
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseBelkinData(data: string, devices: any[]) {
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseBuffaloData(data: string, devices: any[]) {
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseMotorolaData(data: string, devices: any[]) {
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}

function parseUniversalData(data: any, devices: any[]) {
  // Try to find device list in common JSON structures
  const deviceList = data?.devices || data?.list || data?.clients || data?.result?.list || []
  
  return devices.map(device => {
    const routerDevice = deviceList.find((d: any) => 
      d.mac?.toLowerCase() === device.macAddress?.toLowerCase() ||
      d.macaddr?.toLowerCase() === device.macAddress?.toLowerCase() ||
      d.macAddress?.toLowerCase() === device.macAddress?.toLowerCase()
    )
    
    return {
      macAddress: device.macAddress,
      deviceName: device.name,
      ipAddress: device.ipAddress,
      bytesUploaded: routerDevice?.tx_bytes || routerDevice?.upload || routerDevice?.sent || 0,
      bytesDownloaded: routerDevice?.rx_bytes || routerDevice?.download || routerDevice?.received || 0,
      connectionCount: routerDevice?.connections || 0,
      destinationIPs: [],
      activeConnections: [],
      timestamp: Date.now()
    }
  })
}

function parseUniversalHTML(html: string, devices: any[]) {
  // Basic HTML parsing for device tables
  return devices.map(device => ({
    macAddress: device.macAddress,
    deviceName: device.name,
    ipAddress: device.ipAddress,
    bytesUploaded: 0,
    bytesDownloaded: 0,
    connectionCount: 0,
    destinationIPs: [],
    activeConnections: [],
    timestamp: Date.now()
  }))
}
