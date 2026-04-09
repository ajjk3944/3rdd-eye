package com.lefan.signal.tracroute;

import android.util.Log;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class LDNetTraceRoute {
    private static final String MATCH_PING_IP = "(?<=from ).*(?=: icmp_seq=1 ttl=)";
    private static final String MATCH_PING_TIME = "(?<=time=).*?ms";
    private static final String MATCH_TRACE_IP = "(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";
    private static LDNetTraceRoute instance;
    static boolean loaded;
    private final String LOG_TAG = "LDNetTraceRoute";
    public boolean isCTrace = true;
    a listener;

    static {
        try {
            System.loadLibrary("tracepath");
            loaded = true;
        } catch (Exception e6) {
            e6.printStackTrace();
        } catch (UnsatisfiedLinkError e7) {
            e7.printStackTrace();
        }
    }

    private LDNetTraceRoute() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[EXC_TOP_SPLITTER, PHI: r0 r1 r7
  0x004c: PHI (r0v3 java.io.BufferedReader) = (r0v2 java.io.BufferedReader), (r0v8 java.io.BufferedReader) binds: [B:31:0x0069, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v10 java.lang.String) binds: [B:31:0x0069, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r7v9 java.lang.Process) = (r7v13 java.lang.Process), (r7v14 java.lang.Process) binds: [B:31:0x0069, B:14:0x0046] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Process] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String execPing(com.lefan.signal.tracroute.b r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "ping -c 1 "
            java.lang.String r1 = ""
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            java.lang.String r7 = r7.f18858a     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            r4.append(r7)     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            java.lang.Process r7 = r3.exec(r7)     // Catch: java.lang.Throwable -> L5c java.lang.InterruptedException -> L5f java.io.IOException -> L64
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L53 java.lang.InterruptedException -> L55 java.io.IOException -> L5a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L53 java.lang.InterruptedException -> L55 java.io.IOException -> L5a
            java.io.InputStream r4 = r7.getInputStream()     // Catch: java.lang.Throwable -> L53 java.lang.InterruptedException -> L55 java.io.IOException -> L5a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L53 java.lang.InterruptedException -> L55 java.io.IOException -> L5a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L53 java.lang.InterruptedException -> L55 java.io.IOException -> L5a
        L29:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            if (r2 == 0) goto L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            r3.append(r1)     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            r3.append(r2)     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            goto L29
        L3f:
            r1 = move-exception
            r2 = r0
            goto L6d
        L42:
            r2 = move-exception
            goto L66
        L44:
            r2 = move-exception
            goto L66
        L46:
            r0.close()     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
            r7.waitFor()     // Catch: java.lang.Throwable -> L3f java.lang.InterruptedException -> L42 java.io.IOException -> L44
        L4c:
            r0.close()     // Catch: java.lang.Exception -> L6c
        L4f:
            r7.destroy()     // Catch: java.lang.Exception -> L6c
            goto L6c
        L53:
            r1 = move-exception
            goto L6d
        L55:
            r0 = move-exception
        L56:
            r5 = r2
            r2 = r0
            r0 = r5
            goto L66
        L5a:
            r0 = move-exception
            goto L56
        L5c:
            r1 = move-exception
            r7 = r2
            goto L6d
        L5f:
            r7 = move-exception
        L60:
            r0 = r2
            r2 = r7
            r7 = r0
            goto L66
        L64:
            r7 = move-exception
            goto L60
        L66:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L4f
            goto L4c
        L6c:
            return r1
        L6d:
            if (r2 == 0) goto L72
            r2.close()     // Catch: java.lang.Exception -> L75
        L72:
            r7.destroy()     // Catch: java.lang.Exception -> L75
        L75:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.tracroute.LDNetTraceRoute.execPing(com.lefan.signal.tracroute.b):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00db A[EXC_TOP_SPLITTER, PHI: r5 r6
  0x00db: PHI (r5v2 java.lang.Process) = (r5v1 java.lang.Process), (r5v5 java.lang.Process) binds: [B:51:0x00eb, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r6v2 java.io.BufferedReader) = (r6v1 java.io.BufferedReader), (r6v4 java.io.BufferedReader) binds: [B:51:0x00eb, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void execTrace(com.lefan.signal.tracroute.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.tracroute.LDNetTraceRoute.execTrace(com.lefan.signal.tracroute.c):void");
    }

    public static LDNetTraceRoute getInstance() {
        if (instance == null) {
            instance = new LDNetTraceRoute();
        }
        return instance;
    }

    public void initListenter(a aVar) {
    }

    public void printTraceInfo(String str) {
        throw null;
    }

    public void resetInstance() {
        if (instance != null) {
            instance = null;
            loaded = false;
        }
    }

    public native void startJNICTraceRoute(String str);

    public void startTraceRoute(String str) throws Throwable {
        if (!this.isCTrace || !loaded) {
            execTrace(new c(str));
            return;
        }
        try {
            startJNICTraceRoute(str);
        } catch (UnsatisfiedLinkError e6) {
            e6.printStackTrace();
            Log.i("LDNetTraceRoute", "调用java模拟traceRoute");
            execTrace(new c(str));
        }
    }
}
