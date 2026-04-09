'use client'

import { useRouter, useSearchParams } from 'next/navigation';
import ARNetworkMapper from '@/components/ARNetworkMapper';

export default function ARSignalPage() {
  const router = useRouter();
  const searchParams = useSearchParams();
  const returnTo = searchParams.get('returnTo');

  return (
    <ARNetworkMapper
      onClose={() => {
        // If returnTo parameter exists, navigate to that specific view
        if (returnTo === 'signal-analyzer') {
          // Navigate back to the main app with tools tab active
          // The WiFiSecurity component will need to handle the signal-analyzer view
          router.push('/?tab=tools&tool=wifi-security&view=signal-analyzer');
        } else {
          // Default behavior: go back in history
          router.back();
        }
      }}
    />
  );
}
