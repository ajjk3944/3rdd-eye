// Notification Service for Device Alerts

import { toast } from 'sonner'
import { AnomalyAlert } from './anomaly-detection'
import { DeviceAlert } from './device-monitor'

export class NotificationService {
  private static instance: NotificationService | null = null
  private notificationPermission: NotificationPermission = 'default'

  private constructor() {
    this.requestPermission()
  }

  static getInstance(): NotificationService {
    if (!NotificationService.instance) {
      NotificationService.instance = new NotificationService()
    }
    return NotificationService.instance
  }

  /**
   * Request notification permission
   */
  async requestPermission() {
    if ('Notification' in window) {
      try {
        this.notificationPermission = await Notification.requestPermission()
      } catch (error) {
        console.error('Failed to request notification permission:', error)
      }
    }
  }

  /**
   * Show device alert notification (NEW)
   */
  showDeviceAlert(alert: DeviceAlert) {
    const toastConfig = {
      duration: 10000,
      action: {
        label: 'View',
        onClick: () => {
          console.log('View device alert:', alert.id)
        }
      }
    }

    const icon = alert.alertType === 'unknown_device' ? '🚨' : '📊'
    
    switch (alert.severity) {
      case 'critical':
        toast.error(`${icon} ${alert.message}`, {
          ...toastConfig,
          description: alert.details
        })
        break
      case 'high':
        toast.error(`${icon} ${alert.message}`, {
          ...toastConfig,
          description: alert.details
        })
        break
      case 'medium':
        toast.warning(`${icon} ${alert.message}`, {
          ...toastConfig,
          description: alert.details
        })
        break
      case 'low':
        toast.info(`${icon} ${alert.message}`, {
          ...toastConfig,
          description: alert.details
        })
        break
    }

    // Show system notification if permission granted
    if (this.notificationPermission === 'granted' && 'Notification' in window) {
      try {
        const title = alert.alertType === 'unknown_device' 
          ? 'Unknown Device Detected' 
          : 'High Data Usage Alert'
        
        const notification = new Notification(title, {
          body: `${alert.deviceName}: ${alert.message}`,
          icon: '/icon-192.png',
          badge: '/icon-192.png',
          tag: alert.id,
          requireInteraction: alert.severity === 'critical' || alert.severity === 'high',
          data: alert
        })

        notification.onclick = () => {
          window.focus()
          notification.close()
        }
      } catch (error) {
        console.error('Failed to show system notification:', error)
      }
    }
  }

  /**
   * Show anomaly alert notification (LEGACY - kept for compatibility)
   */
  showAnomalyAlert(alert: AnomalyAlert) {
    // Show toast notification
    const toastConfig = {
      duration: 10000,
      action: {
        label: 'View',
        onClick: () => {
          // Navigate to network details or anomaly panel
          console.log('View anomaly:', alert.id)
        }
      }
    }

    switch (alert.severity) {
      case 'critical':
        toast.error(`🚨 ${alert.description}`, {
          ...toastConfig,
          description: alert.details
        })
        break
      case 'high':
        toast.error(`⚠️ ${alert.description}`, {
          ...toastConfig,
          description: alert.details
        })
        break
      case 'medium':
        toast.warning(`⚡ ${alert.description}`, {
          ...toastConfig,
          description: alert.details
        })
        break
      case 'low':
        toast.info(`ℹ️ ${alert.description}`, {
          ...toastConfig,
          description: alert.details
        })
        break
    }

    // Show system notification if permission granted
    if (this.notificationPermission === 'granted' && 'Notification' in window) {
      try {
        const notification = new Notification('Network Anomaly Detected', {
          body: `${alert.deviceName}: ${alert.description}`,
          icon: '/icon-192.png',
          badge: '/icon-192.png',
          tag: alert.id,
          requireInteraction: alert.severity === 'critical' || alert.severity === 'high',
          data: alert
        })

        notification.onclick = () => {
          window.focus()
          notification.close()
        }
      } catch (error) {
        console.error('Failed to show system notification:', error)
      }
    }
  }

  /**
   * Show multiple alerts
   */
  showMultipleAlerts(alerts: AnomalyAlert[]) {
    if (alerts.length === 0) return

    if (alerts.length === 1) {
      this.showAnomalyAlert(alerts[0])
      return
    }

    // Group by severity
    const critical = alerts.filter(a => a.severity === 'critical')
    const high = alerts.filter(a => a.severity === 'high')
    const medium = alerts.filter(a => a.severity === 'medium')
    const low = alerts.filter(a => a.severity === 'low')

    let message = `${alerts.length} anomalies detected`
    let description = ''

    if (critical.length > 0) {
      description += `${critical.length} critical, `
    }
    if (high.length > 0) {
      description += `${high.length} high, `
    }
    if (medium.length > 0) {
      description += `${medium.length} medium, `
    }
    if (low.length > 0) {
      description += `${low.length} low`
    }

    description = description.replace(/, $/, '')

    toast.error(message, {
      description,
      duration: 10000
    })
  }

  /**
   * Show monitoring started notification
   */
  showMonitoringStarted() {
    toast.success('Anomaly Detection Active', {
      description: 'Monitoring network behavior for suspicious activity',
      duration: 5000
    })
  }

  /**
   * Show monitoring stopped notification
   */
  showMonitoringStopped() {
    toast.info('Anomaly Detection Stopped', {
      description: 'Network monitoring has been disabled',
      duration: 3000
    })
  }

  /**
   * Show learning mode notification
   */
  showLearningMode(progress: number) {
    toast.info('Learning Mode', {
      description: `AI is learning normal patterns (${progress}% complete)`,
      duration: 5000
    })
  }
}

// Export singleton instance
export const notificationService = NotificationService.getInstance()
