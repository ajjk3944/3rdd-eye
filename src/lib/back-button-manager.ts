// Global back button manager to prevent conflicts between pages
// Only the most recently registered handler will be active

let currentHandler: (() => void) | null = null;
let listenerHandle: any = null;

export const registerBackButtonHandler = async (handler: () => void) => {
  // Import dynamically to avoid SSR issues
  if (typeof window === 'undefined') return null;
  
  const { getApp } = await import('@/lib/native-plugins');
  const app = getApp();
  if (!app) return null;

  // Remove previous listener if exists
  if (listenerHandle) {
    listenerHandle.remove();
    listenerHandle = null;
  }

  // Set new handler
  currentHandler = handler;

  // Register new listener
  listenerHandle = await app.addListener('backButton', () => {
    if (currentHandler) {
      currentHandler();
    }
  });

  // Return cleanup function
  return () => {
    if (listenerHandle) {
      listenerHandle.remove();
      listenerHandle = null;
    }
    currentHandler = null;
  };
};
