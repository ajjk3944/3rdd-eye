'use client';

import React, { createContext, useContext, useState, useEffect, ReactNode } from 'react';

interface ThemeColors {
  id: string;
  name: string;
  primary: string;
  secondary: string;
  bg_accent: string;
}

interface ThemeContextType {
  theme: ThemeColors;
  setTheme: (themeId: string) => void;
  availableThemes: ThemeColors[];
}

const THEME_OPTIONS: ThemeColors[] = [
  { id: 'emerald', name: 'Emerald (Default)', primary: '#10b981', secondary: '#059669', bg_accent: 'rgba(16,185,129,0.1)' },
  { id: 'cyan', name: 'Cyan', primary: '#22d3ee', secondary: '#0891b2', bg_accent: 'rgba(34,211,238,0.1)' },
  { id: 'green', name: 'Green', primary: '#4ade80', secondary: '#16a34a', bg_accent: 'rgba(74,222,128,0.1)' },
  { id: 'purple', name: 'Purple', primary: '#a78bfa', secondary: '#7c3aed', bg_accent: 'rgba(167,139,250,0.1)' },
  { id: 'blue', name: 'Blue', primary: '#60a5fa', secondary: '#2563eb', bg_accent: 'rgba(96,165,250,0.1)' },
  { id: 'red', name: 'Red', primary: '#f87171', secondary: '#dc2626', bg_accent: 'rgba(248,113,113,0.1)' },
  { id: 'orange', name: 'Orange', primary: '#fb923c', secondary: '#ea580c', bg_accent: 'rgba(251,146,60,0.1)' },
  { id: 'pink', name: 'Pink', primary: '#f472b6', secondary: '#db2777', bg_accent: 'rgba(244,114,182,0.1)' },
];

const DEFAULT_THEME_ID = 'emerald';
const STORAGE_KEY = 'thirdeye_theme';

const ThemeContext = createContext<ThemeContextType | undefined>(undefined);

export function ThemeProvider({ children }: { children: ReactNode }) {
  const [theme, setThemeState] = useState<ThemeColors>(
    THEME_OPTIONS.find(t => t.id === DEFAULT_THEME_ID)!
  );

  useEffect(() => {
    // Load saved theme from localStorage
    try {
      const saved = localStorage.getItem(STORAGE_KEY);
      if (saved) {
        const savedTheme = THEME_OPTIONS.find(t => t.id === saved);
        if (savedTheme) {
          setThemeState(savedTheme);
          applyTheme(savedTheme);
        }
      }
    } catch (error) {
      console.error('Error loading theme:', error);
    }
  }, []);

  const applyTheme = (newTheme: ThemeColors) => {
    // Set CSS custom properties
    if (typeof document !== 'undefined') {
      document.documentElement.style.setProperty('--theme-primary', newTheme.primary);
      document.documentElement.style.setProperty('--theme-secondary', newTheme.secondary);
      document.documentElement.style.setProperty('--theme-accent-bg', newTheme.bg_accent);
    }
  };

  const setTheme = (themeId: string) => {
    const newTheme = THEME_OPTIONS.find(t => t.id === themeId);
    if (newTheme) {
      setThemeState(newTheme);
      applyTheme(newTheme);
      try {
        localStorage.setItem(STORAGE_KEY, themeId);
      } catch (error) {
        console.error('Error saving theme:', error);
      }
    }
  };

  return (
    <ThemeContext.Provider value={{ theme, setTheme, availableThemes: THEME_OPTIONS }}>
      {children}
    </ThemeContext.Provider>
  );
}

export function useTheme() {
  const context = useContext(ThemeContext);
  if (context === undefined) {
    throw new Error('useTheme must be used within a ThemeProvider');
  }
  return context;
}
