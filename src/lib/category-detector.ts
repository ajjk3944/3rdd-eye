// Network Category Detection System

export type NetworkCategory = 
  | 'Food & Drinks'
  | 'Hotels'
  | 'Cafes'
  | 'Public'
  | 'Transport'
  | 'Shopping'
  | 'Healthcare'
  | 'Education'
  | 'Entertainment'
  | 'Other'

export interface CategoryInfo {
  category: NetworkCategory
  icon: string
  color: string
}

const CATEGORY_KEYWORDS: Record<NetworkCategory, string[]> = {
  'Food & Drinks': ['restaurant', 'cafe', 'coffee', 'bar', 'food', 'dining', 'pizza', 'burger', 'kitchen', 'grill', 'bistro', 'eatery', 'diner'],
  'Hotels': ['hotel', 'motel', 'resort', 'inn', 'lodge', 'hostel', 'guest house', 'accommodation'],
  'Cafes': ['cafe', 'coffee', 'starbucks', 'costa', 'espresso', 'latte', 'cappuccino', 'tea house'],
  'Public': ['library', 'park', 'plaza', 'square', 'public', 'municipal', 'city', 'government', 'hall'],
  'Transport': ['airport', 'station', 'terminal', 'bus', 'train', 'metro', 'railway', 'transit'],
  'Shopping': ['mall', 'shop', 'store', 'market', 'retail', 'plaza', 'center', 'outlet', 'bazaar'],
  'Healthcare': ['hospital', 'clinic', 'medical', 'health', 'doctor', 'pharmacy', 'dental'],
  'Education': ['school', 'university', 'college', 'library', 'academy', 'institute', 'campus'],
  'Entertainment': ['cinema', 'theater', 'museum', 'gallery', 'club', 'gym', 'sports', 'stadium'],
  'Other': []
}

const CATEGORY_ICONS: Record<NetworkCategory, string> = {
  'Food & Drinks': '🍽️',
  'Hotels': '🏨',
  'Cafes': '☕',
  'Public': '🏛️',
  'Transport': '🚉',
  'Shopping': '🛍️',
  'Healthcare': '🏥',
  'Education': '🎓',
  'Entertainment': '🎭',
  'Other': '📍'
}

const CATEGORY_COLORS: Record<NetworkCategory, string> = {
  'Food & Drinks': '#f97316',
  'Hotels': '#3b82f6',
  'Cafes': '#a855f7',
  'Public': '#22c55e',
  'Transport': '#06b6d4',
  'Shopping': '#ec4899',
  'Healthcare': '#ef4444',
  'Education': '#eab308',
  'Entertainment': '#8b5cf6',
  'Other': '#6b7280'
}

export function detectCategory(address: string, ssid: string, location?: string): CategoryInfo {
  const searchText = `${address} ${ssid} ${location || ''}`.toLowerCase()
  
  for (const [category, keywords] of Object.entries(CATEGORY_KEYWORDS)) {
    if (keywords.some(keyword => searchText.includes(keyword))) {
      return {
        category: category as NetworkCategory,
        icon: CATEGORY_ICONS[category as NetworkCategory],
        color: CATEGORY_COLORS[category as NetworkCategory]
      }
    }
  }
  
  return {
    category: 'Other',
    icon: CATEGORY_ICONS.Other,
    color: CATEGORY_COLORS.Other
  }
}

export function getCategoryIcon(category: NetworkCategory): string {
  return CATEGORY_ICONS[category] || CATEGORY_ICONS.Other
}

export function getCategoryColor(category: NetworkCategory): string {
  return CATEGORY_COLORS[category] || CATEGORY_COLORS.Other
}

export function getAllCategories(): NetworkCategory[] {
  return Object.keys(CATEGORY_KEYWORDS) as NetworkCategory[]
}
