/**
 * Offline Authentication System
 * Falls back to local storage when Firebase is unavailable
 */

export interface OfflineUser {
  uid: string;
  email: string | null;
  username: string;
  isGuest: boolean;
  isOffline: boolean;
  createdAt: string;
  updatedAt: string;
}

const OFFLINE_USER_KEY = 'thirdeye_offline_user';
const OFFLINE_CREDENTIALS_KEY = 'thirdeye_offline_credentials';

/**
 * Check if device is online
 */
export async function isOnline(): Promise<boolean> {
  if (!navigator.onLine) {
    return false;
  }
  
  // Try to reach Firebase
  try {
    const controller = new AbortController();
    const timeoutId = setTimeout(() => controller.abort(), 3000);
    
    await fetch('https://www.google.com/favicon.ico', {
      mode: 'no-cors',
      signal: controller.signal
    });
    
    clearTimeout(timeoutId);
    return true;
  } catch {
    return false;
  }
}

/**
 * Hash password for offline storage
 */
async function hashPassword(password: string): Promise<string> {
  const encoder = new TextEncoder();
  const data = encoder.encode(password);
  const hashBuffer = await crypto.subtle.digest('SHA-256', data);
  const hashArray = Array.from(new Uint8Array(hashBuffer));
  return hashArray.map(b => b.toString(16).padStart(2, '0')).join('');
}

/**
 * Sign in offline with stored credentials
 */
export async function signInOffline(email: string, password: string): Promise<OfflineUser | null> {
  const stored = localStorage.getItem(OFFLINE_CREDENTIALS_KEY);
  if (!stored) {
    throw new Error('No offline account found. Please connect to internet to sign up.');
  }
  
  const credentials = JSON.parse(stored);
  const passwordHash = await hashPassword(password);
  
  if (credentials.email === email && credentials.passwordHash === passwordHash) {
    const user: OfflineUser = {
      uid: credentials.uid,
      email: credentials.email,
      username: credentials.username,
      isGuest: false,
      isOffline: true,
      createdAt: credentials.createdAt,
      updatedAt: new Date().toISOString()
    };
    
    localStorage.setItem(OFFLINE_USER_KEY, JSON.stringify(user));
    return user;
  }
  
  throw new Error('Invalid email or password');
}

/**
 * Sign up offline (store credentials locally)
 */
export async function signUpOffline(email: string, password: string, username: string): Promise<OfflineUser> {
  const existing = localStorage.getItem(OFFLINE_CREDENTIALS_KEY);
  if (existing) {
    throw new Error('Account already exists. Please sign in.');
  }
  
  const uid = `offline_${Date.now()}_${Math.random().toString(36).substr(2, 9)}`;
  const passwordHash = await hashPassword(password);
  
  const credentials = {
    uid,
    email,
    username,
    passwordHash,
    createdAt: new Date().toISOString()
  };
  
  const user: OfflineUser = {
    uid,
    email,
    username,
    isGuest: false,
    isOffline: true,
    createdAt: credentials.createdAt,
    updatedAt: credentials.createdAt
  };
  
  localStorage.setItem(OFFLINE_CREDENTIALS_KEY, JSON.stringify(credentials));
  localStorage.setItem(OFFLINE_USER_KEY, JSON.stringify(user));
  
  return user;
}

/**
 * Sign in as guest offline
 */
export function signInAsGuestOffline(): OfflineUser {
  const uid = `guest_${Date.now()}_${Math.random().toString(36).substr(2, 9)}`;
  
  const user: OfflineUser = {
    uid,
    email: null,
    username: `Guest_${uid.slice(6, 12)}`,
    isGuest: true,
    isOffline: true,
    createdAt: new Date().toISOString(),
    updatedAt: new Date().toISOString()
  };
  
  localStorage.setItem(OFFLINE_USER_KEY, JSON.stringify(user));
  return user;
}

/**
 * Get current offline user
 */
export function getOfflineUser(): OfflineUser | null {
  const stored = localStorage.getItem(OFFLINE_USER_KEY);
  if (!stored) return null;
  
  try {
    return JSON.parse(stored) as OfflineUser;
  } catch {
    return null;
  }
}

/**
 * Sign out offline
 */
export function signOutOffline(): void {
  localStorage.removeItem(OFFLINE_USER_KEY);
}

/**
 * Check if user has offline credentials stored
 */
export function hasOfflineCredentials(): boolean {
  return !!localStorage.getItem(OFFLINE_CREDENTIALS_KEY);
}

/**
 * Sync offline user to Firebase when online
 */
export async function syncOfflineUserToFirebase(
  offlineUser: OfflineUser,
  firebaseSignUp: (email: string, password: string, username: string) => Promise<void>
): Promise<void> {
  if (!offlineUser.isOffline || offlineUser.isGuest) {
    return; // Nothing to sync
  }
  
  const credentials = localStorage.getItem(OFFLINE_CREDENTIALS_KEY);
  if (!credentials) {
    return;
  }
  
  try {
    const { email, username } = JSON.parse(credentials);
    // Note: We can't recover the original password, user needs to set a new one
    // This is a limitation of offline-first auth
    console.log('Offline user needs to be synced to Firebase manually');
  } catch (error) {
    console.error('Failed to sync offline user:', error);
  }
}
