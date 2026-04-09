export default function Loading() {
  return (
    <div className="min-h-screen bg-gradient-to-br from-slate-950 via-slate-900 to-slate-950 flex items-center justify-center">
      <div className="text-center space-y-6">
        {/* Logo */}
        <div className="inline-flex items-center justify-center w-24 h-24 rounded-full bg-slate-800/50 overflow-hidden mb-4 animate-pulse">
          <img 
            src="/3rd_eye.jpeg" 
            alt="ThirdEye Logo" 
            className="w-full h-full object-cover"
          />
        </div>
        
        {/* App Name */}
        <h1 className="text-3xl font-bold text-white">ThirdEye</h1>
        
        {/* Loading Spinner */}
        <div className="flex items-center justify-center gap-2">
          <div className="w-2 h-2 bg-emerald-500 rounded-full animate-bounce" style={{ animationDelay: '0ms' }} />
          <div className="w-2 h-2 bg-emerald-500 rounded-full animate-bounce" style={{ animationDelay: '150ms' }} />
          <div className="w-2 h-2 bg-emerald-500 rounded-full animate-bounce" style={{ animationDelay: '300ms' }} />
        </div>
        
        {/* Loading Text */}
        <p className="text-slate-400 text-sm">Initializing...</p>
      </div>
    </div>
  )
}
