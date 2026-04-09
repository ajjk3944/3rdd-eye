import type { NextConfig } from "next";

const isAndroidBuild = process.env.BUILD_TARGET === 'android';

const nextConfig: NextConfig = {
  /* config options here */
  typescript: {
    ignoreBuildErrors: true,
  },
  reactStrictMode: false,
  eslint: {
    ignoreDuringBuilds: true,
  },
  
  // Performance optimizations
  compiler: {
    removeConsole: isAndroidBuild ? {
      exclude: ['error', 'warn'],
    } : false,
  },
  
  // Optimize bundle size
  experimental: {
    optimizePackageImports: [
      'lucide-react',
      '@radix-ui/react-icons',
      'recharts',
    ],
  },
  
  ...(isAndroidBuild && {
    output: 'export',
    images: {
      unoptimized: true,
    },
    trailingSlash: true,
    
    // Additional Android optimizations
    compress: true,
    poweredByHeader: false,
    generateEtags: false,
  }),
};

export default nextConfig;
