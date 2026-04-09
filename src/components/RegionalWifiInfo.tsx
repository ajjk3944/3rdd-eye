'use client';

import React, { useState, useEffect } from 'react';
import { useI18n } from '@/lib/i18n';
import { X, Wifi, CheckCircle, XCircle, AlertCircle, ChevronDown } from 'lucide-react';
import { REGIONAL_WIFI_DATA, detectCountryFromLocale, getAvailableCountries } from '@/lib/i18n/regional-wifi';

export default function RegionalWifiInfo() {
  const { t } = useI18n();
  const [isOpen, setIsOpen] = useState(false);
  const [selectedCountry, setSelectedCountry] = useState<string>('US');
  const [showCountrySelector, setShowCountrySelector] = useState(false);

  useEffect(() => {
    const detectedCountry = detectCountryFromLocale();
    if (detectedCountry && REGIONAL_WIFI_DATA[detectedCountry]) {
      setSelectedCountry(detectedCountry);
    }
  }, []);

  if (!isOpen) {
    return (
      <button
        onClick={() => setIsOpen(true)}
        className="w-full p-4 bg-white/5 rounded-lg flex items-center justify-between hover:bg-white/10 transition-colors"
      >
        <div className="flex items-center gap-3">
          <Wifi className="w-5 h-5 text-cyan-400" />
          <div className="text-left">
            <div className="text-white font-medium">{t('settings.regionalWifi')}</div>
            <div className="text-sm text-gray-400">{t('settings.regionalDescription')}</div>
          </div>
        </div>
        <ChevronDown className="w-5 h-5 text-gray-400" />
      </button>
    );
  }

  const countryInfo = REGIONAL_WIFI_DATA[selectedCountry];
  const countries = getAvailableCountries();

  const getStatusIcon = (status: string) => {
    switch (status) {
      case 'Allowed':
        return <CheckCircle className="w-5 h-5 text-green-400" />;
      case 'Not Allowed':
        return <XCircle className="w-5 h-5 text-red-400" />;
      case 'Partial':
        return <AlertCircle className="w-5 h-5 text-yellow-400" />;
      default:
        return null;
    }
  };

  const getStatusColor = (status: string) => {
    switch (status) {
      case 'Allowed':
        return 'text-green-400';
      case 'Not Allowed':
        return 'text-red-400';
      case 'Partial':
        return 'text-yellow-400';
      default:
        return 'text-gray-400';
    }
  };

  return (
    <div className="fixed inset-0 bg-black/80 z-50 flex items-center justify-center p-4">
      <div className="bg-[#0d120d] border border-white/10 rounded-xl w-full max-w-2xl max-h-[90vh] overflow-hidden flex flex-col">
        <div className="p-4 border-b border-white/10 flex items-center justify-between">
          <div className="flex items-center gap-3">
            <Wifi className="w-6 h-6 text-cyan-400" />
            <h2 className="text-xl font-bold text-white">{t('regionalWifi.title')}</h2>
          </div>
          <button
            onClick={() => setIsOpen(false)}
            className="p-2 hover:bg-white/10 rounded-lg transition-colors"
          >
            <X className="w-5 h-5 text-gray-400" />
          </button>
        </div>

        <div className="overflow-y-auto flex-1 p-4 space-y-4">
          {/* Country Selector */}
          <div className="relative">
            <button
              onClick={() => setShowCountrySelector(!showCountrySelector)}
              className="w-full p-4 bg-white/5 rounded-lg flex items-center justify-between hover:bg-white/10 transition-colors"
            >
              <div className="text-left">
                <div className="text-sm text-gray-400">{t('regionalWifi.selectCountry')}</div>
                <div className="text-white font-medium text-lg">{countryInfo.country}</div>
              </div>
              <ChevronDown className={`w-5 h-5 text-gray-400 transition-transform ${showCountrySelector ? 'rotate-180' : ''}`} />
            </button>

            {showCountrySelector && (
              <div className="absolute top-full left-0 right-0 mt-2 bg-[#0d120d] border border-white/10 rounded-lg max-h-60 overflow-y-auto z-10">
                {countries.map((country) => (
                  <button
                    key={country.code}
                    onClick={() => {
                      setSelectedCountry(country.code);
                      setShowCountrySelector(false);
                    }}
                    className={`w-full p-3 text-left hover:bg-white/10 transition-colors ${
                      selectedCountry === country.code ? 'bg-cyan-500/20 text-cyan-400' : 'text-white'
                    }`}
                  >
                    {country.name}
                  </button>
                ))}
              </div>
            )}
          </div>

          {/* WiFi Bands */}
          <div className="space-y-3">
            {countryInfo.bands.map((band, index) => (
              <div key={index} className="bg-white/5 rounded-lg p-4 space-y-2">
                <div className="flex items-center justify-between">
                  <h3 className="text-lg font-bold text-white">{band.band} {t('regionalWifi.band')}</h3>
                  <div className="flex items-center gap-2">
                    {getStatusIcon(band.status)}
                    <span className={`font-medium ${getStatusColor(band.status)}`}>
                      {t(`regionalWifi.${band.status.toLowerCase().replace(' ', '')}`)}
                    </span>
                  </div>
                </div>
                <div className="grid grid-cols-2 gap-3 text-sm">
                  <div>
                    <div className="text-gray-400">{t('regionalWifi.channels')}</div>
                    <div className="text-white font-medium">{band.channels}</div>
                  </div>
                  <div>
                    <div className="text-gray-400">{t('regionalWifi.maxPower')}</div>
                    <div className="text-white font-medium">{band.maxPower}</div>
                  </div>
                </div>
              </div>
            ))}
          </div>

          {/* Notes */}
          <div className="bg-blue-500/10 border border-blue-500/30 rounded-lg p-4">
            <div className="text-sm text-gray-400 mb-1">{t('regionalWifi.notes')}</div>
            <p className="text-white text-sm">{countryInfo.notes}</p>
          </div>

          {/* Regulator */}
          <div className="text-center text-sm text-gray-400">
            {t('regionalWifi.regulator')}: <span className="text-white">{countryInfo.regulator}</span>
          </div>
        </div>
      </div>
    </div>
  );
}
