'use client';

import React, { createContext, useContext, useState, useEffect, ReactNode, useCallback } from 'react';
import en, { TranslationKeys } from './en';

export const LANGUAGES = [
  { code: 'en', name: 'English', nativeName: 'English', flag: '🇬🇧' },
  { code: 'hi', name: 'Hindi', nativeName: 'हिन्दी', flag: '🇮🇳' },
  { code: 'bn', name: 'Bengali', nativeName: 'বাংলা', flag: '🇧🇩' },
  { code: 'es', name: 'Spanish', nativeName: 'Español', flag: '🇪🇸' },
  { code: 'fr', name: 'French', nativeName: 'Français', flag: '🇫🇷' },
  { code: 'de', name: 'German', nativeName: 'Deutsch', flag: '🇩🇪' },
  { code: 'ar', name: 'Arabic', nativeName: 'العربية', flag: '🇸🇦' },
  { code: 'pt', name: 'Portuguese', nativeName: 'Português', flag: '🇧🇷' },
];

interface I18nContextType {
  locale: string;
  t: (path: string) => string;
  setLocale: (code: string) => void;
  availableLanguages: typeof LANGUAGES;
}

const I18nContext = createContext<I18nContextType | undefined>(undefined);

const STORAGE_KEY = 'thirdeye_language';

function getNestedValue(obj: any, path: string): string | undefined {
  return path.split('.').reduce((acc, part) => acc?.[part], obj);
}

function createTranslator(translations: any, fallback: any) {
  return (path: string): string => {
    return getNestedValue(translations, path) || getNestedValue(fallback, path) || path;
  };
}

async function loadLanguage(code: string): Promise<any> {
  switch (code) {
    case 'en': return en;
    case 'hi': return (await import('./hi')).default;
    case 'bn': return (await import('./bn')).default;
    case 'es': return (await import('./es')).default;
    case 'fr': return (await import('./fr')).default;
    case 'de': return (await import('./de')).default;
    case 'ar': return (await import('./ar')).default;
    case 'pt': return (await import('./pt')).default;
    default: return en;
  }
}

export function I18nProvider({ children }: { children: ReactNode }) {
  const [locale, setLocaleState] = useState('en');
  const [translations, setTranslations] = useState<any>(en);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    const savedLocale = localStorage.getItem(STORAGE_KEY);
    if (savedLocale && LANGUAGES.some(lang => lang.code === savedLocale)) {
      setLocaleState(savedLocale);
      loadLanguage(savedLocale).then(trans => {
        setTranslations(trans);
        setIsLoading(false);
      });
    } else {
      setIsLoading(false);
    }
  }, []);

  useEffect(() => {
    if (locale === 'ar') {
      document.documentElement.dir = 'rtl';
      document.documentElement.lang = 'ar';
    } else {
      document.documentElement.dir = 'ltr';
      document.documentElement.lang = locale;
    }
  }, [locale]);

  const setLocale = useCallback((code: string) => {
    setLocaleState(code);
    localStorage.setItem(STORAGE_KEY, code);
    loadLanguage(code).then(trans => {
      setTranslations(trans);
    });
  }, []);

  const t = useCallback(createTranslator(translations, en), [translations]);

  const value: I18nContextType = {
    locale,
    t,
    setLocale,
    availableLanguages: LANGUAGES,
  };

  if (isLoading) {
    return null;
  }

  return <I18nContext.Provider value={value}>{children}</I18nContext.Provider>;
}

export function useI18n() {
  const context = useContext(I18nContext);
  if (!context) {
    throw new Error('useI18n must be used within I18nProvider');
  }
  return context;
}
