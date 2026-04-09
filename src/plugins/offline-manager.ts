import { registerPlugin } from '@capacitor/core';

export interface OfflineManagerPlugin {
  /**
   * Check if device is online
   */
  isOnline(): Promise<{
    isOnline: boolean;
    connectionType: string;
    isWiFiConnected: boolean;
    isMobileDataConnected: boolean;
  }>;

  /**
   * Get connection type
   */
  getConnectionType(): Promise<{
    connectionType: string;
  }>;

  /**
   * Check if feature is available offline
   */
  checkFeatureAvailability(options: { feature: string }): Promise<{
    feature: string;
    isAvailable: boolean;
    isOnline: boolean;
    message?: string;
  }>;

  /**
   * Get mobile carrier information
   */
  getCarrierInfo(): Promise<{
    success: boolean;
    carrierName?: string;
    networkType?: string;
    simState?: string;
    hasSim?: boolean;
    networkOperator?: string;
    signalStrength?: number;
    error?: string;
  }>;
}

const OfflineManager = registerPlugin<OfflineManagerPlugin>('OfflineManager');

export default OfflineManager;
