'use client';

import React, { useState } from 'react';
import { useI18n } from '@/lib/i18n';
import { X, Check, Globe } from 'lucide-react';

export default function LanguageSelector() {
  const { locale, setLocale, availableLanguages, t } = useI18n();
  const [isOpen, setIsOpen] = useState(false);

  const currentLanguage = availableLanguages.find(lang => lang.code === locale);

  const handleLanguageSelect = (code: string) => {
    setLocale(code);
    setIsOpen(false);
  };

  if (!isOpen) {
    return (
      <button
        onClick={() => setIsOpen(true)}
        className="w-full p-4 bg-white/5 rounded-lg flex items-center justify-between hover:bg-white/10 transition-colors"
      >
        <div className="flex items-center gap-3">
          <Globe className="w-5 h-5 text-cyan-400" />
          <div className="text-left">
            <div className="text-sm text-gray-400">{t('settings.appLanguage')}</div>
            <div className="text-white font-medium">
              {currentLanguage?.nativeName || 'English'}
            </div>
          </div>
        </div>
        <div className="text-2xl">{currentLanguage?.flag || '🇬🇧'}</div>
      </button>
    );
  }

  return (
    <div className="fixed inset-0 bg-black/80 z-50 flex items-center justify-center p-4">
      <div className="bg-[#0d120d] border border-white/10 rounded-xl w-full max-w-md max-h-[80vh] overflow-hidden flex flex-col">
        <div className="p-4 border-b border-white/10 flex items-center justify-between">
          <h2 className="text-xl font-bold text-white">{t('settings.selectLanguage')}</h2>
          <button
            onClick={() => setIsOpen(false)}
            className="p-2 hover:bg-white/10 rounded-lg transition-colors"
          >
            <X className="w-5 h-5 text-gray-400" />
          </button>
        </div>

        <div className="overflow-y-auto flex-1 p-4 space-y-2">
          {availableLanguages.map((lang) => {
            const isSelected = locale === lang.code;
            return (
              <button
                key={lang.code}
                onClick={() => handleLanguageSelect(lang.code)}
                className={`w-full p-4 rounded-lg flex items-center justify-between transition-colors ${
                  isSelected
                    ? 'bg-cyan-500/20 border border-cyan-500/50'
                    : 'bg-white/5 hover:bg-white/10'
                }`}
              >
                <div className="flex items-center gap-3">
                  <span className="text-2xl">{lang.flag}</span>
                  <div className="text-left">
                    <div className="text-white font-medium">{lang.nativeName}</div>
                    <div className="text-sm text-gray-400">{lang.name}</div>
                  </div>
                </div>
                {isSelected && <Check className="w-5 h-5 text-cyan-400" />}
              </button>
            );
          })}
        </div>

        <div className="p-4 border-t border-white/10 text-sm text-gray-400 text-center">
          {t('settings.languageChangeNote')}
        </div>
      </div>
    </div>
  );
}
