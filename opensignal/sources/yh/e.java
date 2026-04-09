package yh;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import bc.y;
import io.sentry.t;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static long f26264a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static long f26265b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static String f26266c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f26267d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f26268e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public static final Random f26269f = new Random();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f26270g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final int f26271h = p.f26354a;

    /* renamed from: i, reason: collision with root package name */
    public static double f26272i = 0.0d;
    public static volatile boolean j = false;
    public static boolean k = false;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f26273l = true;

    /* renamed from: m, reason: collision with root package name */
    public static Process f26274m = null;

    /* renamed from: n, reason: collision with root package name */
    public static volatile Handler f26275n = null;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f26276o = false;

    /* renamed from: p, reason: collision with root package name */
    public static volatile int f26277p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static volatile long f26278q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static volatile long f26279r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static volatile int f26280s = -1;

    /* renamed from: t, reason: collision with root package name */
    public static volatile long f26281t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static volatile long f26282u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static volatile ArrayList f26283v = null;

    /* renamed from: w, reason: collision with root package name */
    public static volatile long f26284w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final y f26285x = new y(3);

    /* renamed from: y, reason: collision with root package name */
    public static final y f26286y = new y(4);

    /* renamed from: z, reason: collision with root package name */
    public static final y f26287z = new y(5);
    public static final Object A = new Object();

    public static void a(long j7, long j10, long j11, int i10, int i11, int i12, int i13, o oVar) {
        double d6 = (j10 - j7) / 1000000.0d;
        long jE = e(i10, true, i11);
        if (jE == -32768) {
            oVar.f26337h = m.ERROR_RETRIEVING_BYTECOUNT.getValue();
            return;
        }
        double d10 = jE - j11;
        double d11 = i12;
        if (d10 < d11) {
            d10 = d11;
        }
        double d12 = d6 / 1000.0d;
        if (d12 == 0.0d) {
            oVar.f26337h = m.TEST_LENGTH_IS_ZERO.getValue();
            return;
        }
        oVar.f26331b = ((d10 / 1000.0d) / d12) * 8.0d;
        oVar.f26345r = ((i13 / 1000.0d) / d12) * 8.0d;
        oVar.f26337h = m.COMPLETED.getValue();
    }

    public static void b(o oVar, long j7, long j10, long j11, int i10, HttpURLConnection httpURLConnection, mi.f fVar) {
        ch.n.b("TTQoSFileIO", "Time Taken : " + ((f26265b - j10) / 1000000));
        if (j7 != 200) {
            oVar.f26338i = m.SERVER_ERROR.getValue();
            return;
        }
        double d6 = (f26265b - j10) / 1.0E9d;
        if (d6 <= 0.0d) {
            oVar.f26338i = m.TEST_LENGTH_IS_ZERO.getValue();
            return;
        }
        double d10 = (((f26264a - j11) * 8.0d) / 1000.0d) / d6;
        double d11 = ((i10 * 8.0d) / 1000.0d) / d6;
        if (d10 <= 0.0d) {
            oVar.f26338i = m.ERROR_RETRIEVING_BYTECOUNT.getValue();
        } else {
            oVar.f26338i = m.COMPLETED.getValue();
            oVar.f26332c = d10;
            oVar.f26346s = d11;
            fVar.q("THROUGHPUT_UPLOAD_TEST_COMPLETED", new fh.d[]{new fh.d(Double.valueOf(d6 * 1000.0d), "THROUGHPUT_UPLOAD_TEST_TIME_TAKEN_MS"), new fh.d(f26266c, "THROUGHPUT_UPLOAD_TEST_TIME_METHOD"), new fh.d(Long.valueOf(f26264a - j11), "THROUGHPUT_UPLOAD_TEST_TRAFFIC_STATS_BYTES")});
        }
        try {
            ic.a.v(httpURLConnection.getInputStream());
        } catch (Exception unused) {
        }
    }

    public static String c(String str) {
        String strGroup;
        try {
            Matcher matcher = Pattern.compile("from.*\\((.*)\\):\\sicmp_seq", 2).matcher(str);
            if (!matcher.find(0)) {
                matcher = Pattern.compile("from\\s(.*):.icmp_seq", 2).matcher(str);
            }
            if (!matcher.find(0)) {
                matcher = Pattern.compile("from\\s([0123456789].*[0123456789])\\sicmp_seq", 2).matcher(str);
            }
            if (!matcher.find(0)) {
                matcher = Pattern.compile("from\\s(.*?)\\sicmp_seq", 2).matcher(str);
            }
            return (!matcher.find(0) || (strGroup = matcher.group(1)) == null) ? "-32768" : InetAddress.getByName(strGroup).getHostAddress();
        } catch (Exception e4) {
            ch.n.d("TTQoSFileIO", "Ex during node address lookup: ".concat(str), e4);
            return "-32768";
        }
    }

    public static int d(int i10, String str) throws NumberFormatException {
        String strGroup;
        try {
            Matcher matcher = Pattern.compile("from.*?icmp_seq=(.*?)\\s", 2).matcher(str);
            if (matcher.find(0) && (strGroup = matcher.group(1)) != null && !strGroup.isEmpty()) {
                int i11 = Integer.parseInt(strGroup);
                if (i11 > i10) {
                    return i11;
                }
            }
            return i10;
        } catch (Exception e4) {
            ch.n.d("TTQoSFileIO", "Ex during packet number parsing: ".concat(str), e4);
            return i10;
        }
    }

    public static long e(int i10, boolean z10, int i11) {
        if (i10 == 1) {
            return z10 ? TrafficStats.getUidRxBytes(i11) : TrafficStats.getUidTxBytes(i11);
        }
        if (i10 != 2) {
            return -32768L;
        }
        return z10 ? TrafficStats.getTotalRxBytes() : TrafficStats.getTotalTxBytes();
    }

    public static void f(Runnable runnable, t tVar) {
        try {
            f26276o = true;
            HandlerThread handlerThreadL = tVar.l("TUBC_16");
            handlerThreadL.setPriority(1);
            handlerThreadL.start();
            f26275n = new Handler(handlerThreadL.getLooper());
            f26275n.post(runnable);
        } catch (Exception e4) {
            f26276o = false;
            ch.n.d("TTQoSFileIO", "Error initializing handler for Byte Count.", e4);
        }
    }

    public static byte[][] g(int i10) {
        int i11 = i10 / p.f26354a;
        int i12 = f26271h;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i12);
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr2 = new byte[i12];
            f26269f.nextBytes(bArr2);
            bArr[i13] = bArr2;
        }
        return bArr;
    }

    public static boolean h(l lVar) {
        return lVar == l.CONTINUOUS_TEST || lVar == l.CONTINUOUS_TEST_100_50 || lVar == l.CONTINUOUS_TEST_1000_50;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.lang.String r12, mi.f r13) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "TTQoSFileIO"
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L77 java.security.KeyManagementException -> L79 java.security.NoSuchAlgorithmException -> L7c java.io.IOException -> L7f
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L77 java.security.KeyManagementException -> L79 java.security.NoSuchAlgorithmException -> L7c java.io.IOException -> L7f
            java.net.URLConnection r12 = r2.openConnection()     // Catch: java.lang.Throwable -> L77 java.security.KeyManagementException -> L79 java.security.NoSuchAlgorithmException -> L7c java.io.IOException -> L7f
            java.net.HttpURLConnection r12 = l(r12)     // Catch: java.lang.Throwable -> L77 java.security.KeyManagementException -> L79 java.security.NoSuchAlgorithmException -> L7c java.io.IOException -> L7f
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r12.connect()     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            int r6 = r12.getResponseCode()     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r9 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_STARTED"
            fh.d r10 = new fh.d     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r11 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_START_TIME_MS"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r10.<init>(r2, r11)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            fh.d[] r2 = new fh.d[]{r10}     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r13.q(r9, r2)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r2 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_CONNECTED"
            fh.d r3 = new fh.d     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r9 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_CONNECTED_TIME_MS"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r3.<init>(r4, r9)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            fh.d[] r3 = new fh.d[]{r3}     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r13.q(r2, r3)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r2 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_RESPONSE_RECEIVED"
            fh.d r3 = new fh.d     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r4 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_RESPONSE_RECEIVED_TIME_MS"
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            fh.d r4 = new fh.d     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            java.lang.String r5 = "THROUGHPUT_UPLOAD_HEAD_REQUEST_RESPONSE_RECEIVED_CODE"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            fh.d[] r3 = new fh.d[]{r3, r4}     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r13.q(r2, r3)     // Catch: java.lang.Throwable -> L6e java.security.KeyManagementException -> L71 java.security.NoSuchAlgorithmException -> L73 java.io.IOException -> L75
            r12.disconnect()
            return
        L6e:
            r13 = move-exception
            r1 = r12
            goto Lb3
        L71:
            r2 = move-exception
            goto L82
        L73:
            r2 = move-exception
            goto L94
        L75:
            r2 = move-exception
            goto La3
        L77:
            r13 = move-exception
            goto Lb3
        L79:
            r2 = move-exception
            r12 = r1
            goto L82
        L7c:
            r2 = move-exception
            r12 = r1
            goto L94
        L7f:
            r2 = move-exception
            r12 = r1
            goto La3
        L82:
            java.lang.String r3 = "KeyManagementException while performing HEAD request"
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L6e
            ch.n.b(r0, r3)     // Catch: java.lang.Throwable -> L6e
            r13.r(r2, r1)     // Catch: java.lang.Throwable -> L6e
            if (r12 == 0) goto Lb2
        L90:
            r12.disconnect()
            goto Lb2
        L94:
            java.lang.String r3 = "NoSuchAlgorithmException while performing HEAD request"
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L6e
            ch.n.b(r0, r3)     // Catch: java.lang.Throwable -> L6e
            r13.r(r2, r1)     // Catch: java.lang.Throwable -> L6e
            if (r12 == 0) goto Lb2
            goto L90
        La3:
            java.lang.String r3 = "IOException while performing HEAD request"
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L6e
            ch.n.b(r0, r3)     // Catch: java.lang.Throwable -> L6e
            r13.r(r2, r1)     // Catch: java.lang.Throwable -> L6e
            if (r12 == 0) goto Lb2
            goto L90
        Lb2:
            return
        Lb3:
            if (r1 == 0) goto Lb8
            r1.disconnect()
        Lb8:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.e.i(java.lang.String, mi.f):void");
    }

    public static void j(boolean z10) {
        synchronized (A) {
            try {
                try {
                    int i10 = f26277p;
                    long jElapsedRealtimeNanos = f26278q > 0 ? (SystemClock.elapsedRealtimeNanos() - f26278q) / 1000 : 0L;
                    if ((f26280s != i10 && f26276o) || z10) {
                        if (f26281t > 0 && f26281t != f26282u && !z10) {
                            f26283v.add(new n(f26281t, f26280s));
                        }
                        f26283v.add(new n(jElapsedRealtimeNanos, i10));
                        f26280s = i10;
                        f26282u = jElapsedRealtimeNanos;
                    }
                    f26281t = jElapsedRealtimeNanos;
                } catch (Exception e4) {
                    n(f26287z);
                    ch.n.g("TTQoSFileIO", "Ex in Process Byte Counts.", e4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void k() {
        f26277p = 0;
        f26280s = -1;
        f26281t = 0L;
        f26282u = 0L;
        f26283v = null;
        f26278q = 0L;
        f26284w = 0L;
        f26270g = false;
    }

    public static HttpURLConnection l(URLConnection uRLConnection) throws ProtocolException, NoSuchAlgorithmException, KeyManagementException {
        HttpURLConnection httpURLConnection;
        if (uRLConnection instanceof HttpsURLConnection) {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpURLConnection = httpsURLConnection;
        } else {
            httpURLConnection = (HttpURLConnection) uRLConnection;
        }
        httpURLConnection.setRequestMethod("HEAD");
        httpURLConnection.setConnectTimeout(10000);
        return httpURLConnection;
    }

    public static HttpURLConnection m(URLConnection uRLConnection, int i10, String str) throws ProtocolException, NoSuchAlgorithmException, KeyManagementException {
        HttpURLConnection httpURLConnection;
        if (uRLConnection instanceof HttpsURLConnection) {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpURLConnection = httpsURLConnection;
        } else {
            httpURLConnection = (HttpURLConnection) uRLConnection;
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setRequestProperty("Content-Type", "text/plain");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i10));
        httpURLConnection.setFixedLengthStreamingMode(i10);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        return httpURLConnection;
    }

    public static void n(Runnable runnable) {
        try {
            f26276o = false;
            if (f26275n != null) {
                f26275n.removeCallbacks(runnable);
                f26275n.getLooper().quitSafely();
                f26275n = null;
            }
        } catch (Exception e4) {
            ch.n.d("TTQoSFileIO", "Error shutting down byte count collector.", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
    
        r12.removeCallbacks(yh.e.f26286y);
        r0 = yh.e.f26274m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0140, code lost:
    
        r0.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0158, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015e, code lost:
    
        if (r5.equals("-32768") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0162, code lost:
    
        if (yh.e.j == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0165, code lost:
    
        yh.e.j = r16;
        r1 = new yh.q(r21, r5, r4, r22, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0170, code lost:
    
        r12.removeCallbacks(yh.e.f26286y);
        r0 = yh.e.f26274m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
    
        if (r0 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0179, code lost:
    
        r0.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        ch.n.d("TTQoSFileIO", "Ex while destroying ping process.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018a, code lost:
    
        yh.e.j = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018c, code lost:
    
        r12.removeCallbacks(yh.e.f26286y);
        r0 = yh.e.f26274m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0195, code lost:
    
        r0.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0199, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148 A[EXC_TOP_SPLITTER, PHI: r13
  0x0148: PHI (r13v4 java.io.BufferedReader) = 
  (r13v3 java.io.BufferedReader)
  (r13v8 java.io.BufferedReader)
  (r13v8 java.io.BufferedReader)
  (r13v8 java.io.BufferedReader)
  (r13v8 java.io.BufferedReader)
  (r13v8 java.io.BufferedReader)
 binds: [B:103:0x01dd, B:68:0x0193, B:69:0x0195, B:42:0x0145, B:38:0x013e, B:39:0x0140] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yh.q o(java.lang.String r18, boolean r19, ak.x r20, int r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.e.o(java.lang.String, boolean, ak.x, int, boolean):yh.q");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x06fe: MOVE (r17 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]) (LINE:1791), block:B:354:0x06fc */
    /* JADX WARN: Not initialized variable reg: 36, insn: 0x0184: MOVE (r1 I:??[OBJECT, ARRAY]) = (r36 I:??[OBJECT, ARRAY]) (LINE:389), block:B:53:0x017a */
    public static void p(int r39, java.lang.String r40, int r41, int r42, ak.b1 r43, yh.o r44, io.sentry.internal.debugmeta.c r45, io.sentry.t r46, mi.f r47) {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yh.e.p(int, java.lang.String, int, int, ak.b1, yh.o, io.sentry.internal.debugmeta.c, io.sentry.t, mi.f):void");
    }
}
