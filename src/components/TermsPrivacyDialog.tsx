'use client'

import { Dialog, DialogContent, DialogHeader, DialogTitle } from '@/components/ui/dialog'
import { ScrollArea } from '@/components/ui/scroll-area'
import { Shield, Lock, Eye, Database, Bell, Share2 } from 'lucide-react'
import { useI18n } from '@/lib/i18n'

interface TermsPrivacyDialogProps {
  open: boolean
  onClose: () => void
}

export function TermsPrivacyDialog({ open, onClose }: TermsPrivacyDialogProps) {
  const { t } = useI18n()
  
  return (
    <Dialog open={open} onOpenChange={onClose}>
      <DialogContent className="bg-[#0d120d] border-emerald-900/30 text-white max-w-2xl max-h-[80vh]">
        <DialogHeader>
          <DialogTitle className="flex items-center gap-2 text-white text-xl">
            <Shield className="w-6 h-6 text-emerald-400" />
            {t('wifi.termsOfUse')} & {t('wifi.privacyPolicy')}
          </DialogTitle>
        </DialogHeader>

        <ScrollArea className="h-[60vh] pr-4">
          <div className="space-y-6 text-sm">
            {/* Introduction */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-2">{t('wifi.welcomeToThirdEye')}</h3>
              <p className="text-gray-300 leading-relaxed">
                {t('wifi.welcomeDescription')}
              </p>
            </section>

            {/* Terms of Use */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3 flex items-center gap-2">
                <FileText className="w-5 h-5" />
                {t('wifi.termsOfUse')}
              </h3>
              
              <div className="space-y-3 text-gray-300">
                <div>
                  <h4 className="font-medium text-white mb-1">{t('wifi.acceptableUse')}</h4>
                  <p className="leading-relaxed">
                    {t('wifi.acceptableUseText')}
                  </p>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-1">{t('wifi.prohibitedActivities')}</h4>
                  <ul className="list-disc list-inside space-y-1 ml-2">
                    <li>{t('wifi.unauthorizedAccess')}</li>
                    <li>{t('wifi.maliciousScanning')}</li>
                    <li>{t('wifi.interferenceWithNetwork')}</li>
                    <li>{t('wifi.violationOfPrivacy')}</li>
                    <li>{t('wifi.illegalActivities')}</li>
                  </ul>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-1">{t('wifi.userResponsibility')}</h4>
                  <p className="leading-relaxed">
                    {t('wifi.userResponsibilityText')}
                  </p>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-1">{t('wifi.disclaimerTitle')}</h4>
                  <p className="leading-relaxed">
                    {t('wifi.disclaimerText')}
                  </p>
                </div>
              </div>
            </section>

            {/* Privacy Policy */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3 flex items-center gap-2">
                <Lock className="w-5 h-5" />
                {t('wifi.privacyPolicy')}
              </h3>
              
              <div className="space-y-3 text-gray-300">
                <div className="p-3 rounded-lg bg-emerald-900/10 border border-emerald-900/20">
                  <p className="text-emerald-400 font-medium mb-1">{t('wifi.yourPrivacyMatters')}</p>
                  <p className="text-sm">
                    {t('wifi.privacyDescription')}
                  </p>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-2 flex items-center gap-2">
                    <Database className="w-4 h-4 text-blue-400" />
                    {t('wifi.dataCollection')}
                  </h4>
                  <p className="leading-relaxed mb-2">{t('wifi.dataCollectionText')}</p>
                  <ul className="list-disc list-inside space-y-1 ml-2">
                    <li>{t('wifi.wifiScanResults')}</li>
                    <li>{t('wifi.bluetoothDeviceInfo')}</li>
                    <li>{t('wifi.networkDeviceInventory')}</li>
                    <li>{t('wifi.connectionHistory')}</li>
                    <li>{t('wifi.appSettings')}</li>
                  </ul>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-2 flex items-center gap-2">
                    <Eye className="w-4 h-4 text-purple-400" />
                    {t('wifi.dataUsage')}
                  </h4>
                  <p className="leading-relaxed mb-2">{t('wifi.dataUsageText')}</p>
                  <ul className="list-disc list-inside space-y-1 ml-2">
                    <li>{t('wifi.displayingInfo')}</li>
                    <li>{t('wifi.maintainingScanHistory')}</li>
                    <li>{t('wifi.improvingFunctionality')}</li>
                    <li>{t('wifi.providingSecurityAnalysis')}</li>
                  </ul>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-2 flex items-center gap-2">
                    <Share2 className="w-4 h-4 text-orange-400" />
                    {t('wifi.dataSharing')}
                  </h4>
                  <div className="p-3 rounded-lg bg-emerald-900/10 border border-emerald-900/20">
                    <p className="text-emerald-400 font-medium">{t('wifi.weDoNotShare')}</p>
                    <p className="text-sm mt-1">
                      {t('wifi.dataSharingText')}
                    </p>
                  </div>
                </div>

                <div>
                  <h4 className="font-medium text-white mb-2 flex items-center gap-2">
                    <Bell className="w-4 h-4 text-yellow-400" />
                    {t('wifi.thirdPartyServices')}
                  </h4>
                  <p className="leading-relaxed mb-2">
                    {t('wifi.thirdPartyServicesText')}
                  </p>
                  <ul className="list-disc list-inside space-y-1 ml-2">
                    <li><strong>ISP Detection APIs:</strong> {t('wifi.ispDetectionAPIs')}</li>
                    <li><strong>WiFi Map:</strong> {t('wifi.wifiMapCommunity')}</li>
                  </ul>
                  <p className="text-xs text-gray-500 mt-2">
                    {t('wifi.reviewPolicies')}
                  </p>
                </div>
              </div>
            </section>

            {/* Permissions */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3">{t('wifi.requiredPermissions')}</h3>
              
              <div className="space-y-2 text-gray-300">
                <div className="p-3 rounded-lg bg-blue-900/10 border border-blue-900/20">
                  <p className="font-medium text-white">{t('wifi.locationPermission')}</p>
                  <p className="text-xs mt-1">{t('wifi.locationPermissionDesc')}</p>
                </div>
                
                <div className="p-3 rounded-lg bg-blue-900/10 border border-blue-900/20">
                  <p className="font-medium text-white">{t('wifi.wifiPermission')}</p>
                  <p className="text-xs mt-1">{t('wifi.wifiPermissionDesc')}</p>
                </div>
                
                <div className="p-3 rounded-lg bg-blue-900/10 border border-blue-900/20">
                  <p className="font-medium text-white">{t('wifi.bluetoothPermission')}</p>
                  <p className="text-xs mt-1">{t('wifi.bluetoothPermissionDesc')}</p>
                </div>
                
                <div className="p-3 rounded-lg bg-blue-900/10 border border-blue-900/20">
                  <p className="font-medium text-white">{t('wifi.internetPermission')}</p>
                  <p className="text-xs mt-1">{t('wifi.internetPermissionDesc')}</p>
                </div>
              </div>
            </section>

            {/* Data Security */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3">{t('wifi.dataSecurity')}</h3>
              <div className="text-gray-300 space-y-2">
                <p className="leading-relaxed">
                  {t('wifi.dataSecurityText')}
                </p>
                <ul className="list-disc list-inside space-y-1 ml-2">
                  <li>{t('wifi.allDataLocal')}</li>
                  <li>{t('wifi.noCloudStorage')}</li>
                  <li>{t('wifi.clearDataAnytime')}</li>
                  <li>{t('wifi.dataDeletedOnUninstall')}</li>
                </ul>
              </div>
            </section>

            {/* Your Rights */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3">{t('wifi.yourRights')}</h3>
              <div className="text-gray-300 space-y-2">
                <p className="leading-relaxed">{t('wifi.yourRightsText')}</p>
                <ul className="list-disc list-inside space-y-1 ml-2">
                  <li>{t('wifi.accessYourData')}</li>
                  <li>{t('wifi.deleteYourData')}</li>
                  <li>{t('wifi.controlDataCollection')}</li>
                  <li>{t('wifi.stopUsingApp')}</li>
                </ul>
              </div>
            </section>

            {/* Updates */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3">{t('wifi.policyUpdates')}</h3>
              <p className="text-gray-300 leading-relaxed">
                {t('wifi.policyUpdatesText')}
              </p>
            </section>

            {/* Contact */}
            <section>
              <h3 className="text-lg font-semibold text-emerald-400 mb-3">{t('wifi.contactInfo')}</h3>
              <p className="text-gray-300 leading-relaxed">
                {t('wifi.contactInfoText')}
              </p>
            </section>

            {/* Footer */}
            <section className="pt-4 border-t border-emerald-900/30">
              <p className="text-xs text-gray-500 text-center">
                {t('wifi.lastUpdatedDate')}<br />
                {t('wifi.appVersion')}
              </p>
            </section>
          </div>
        </ScrollArea>
      </DialogContent>
    </Dialog>
  )
}

// Missing import for FileText icon
import { FileText } from 'lucide-react'
