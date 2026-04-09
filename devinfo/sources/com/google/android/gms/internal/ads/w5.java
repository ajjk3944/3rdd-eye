package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w5 implements r2, ko1, l31, h1, p1, u1, z1, j6, r6, kb, vn1 {

    /* renamed from: c, reason: collision with root package name */
    public static Cipher f17891c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17902a;

    /* renamed from: b, reason: collision with root package name */
    public static final w5 f17890b = new w5(0);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17892d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f17893e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final w5 f17894f = new w5(2);
    public static final w5 g = new w5(3);

    /* renamed from: h, reason: collision with root package name */
    public static final w5 f17895h = new w5(4);

    /* renamed from: i, reason: collision with root package name */
    public static final w5 f17896i = new w5(5);
    public static final w5 j = new w5(7);

    /* renamed from: k, reason: collision with root package name */
    public static final w5 f17897k = new w5(8);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ w5 f17898l = new w5(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w5 f17899m = new w5(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w5 f17900n = new w5(14);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w5 f17901o = new w5(17);

    public /* synthetic */ w5(int i4) {
        this.f17902a = i4;
    }

    public static /* bridge */ dp1 B(Object obj) {
        qn1 qn1Var = (qn1) obj;
        dp1 dp1Var = qn1Var.zzt;
        if (dp1Var != dp1.f10535f) {
            return dp1Var;
        }
        dp1 dp1VarA = dp1.a();
        qn1Var.zzt = dp1VarA;
        return dp1VarA;
    }

    public static final void D(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                sb2.append("javascript: ");
                sb2.append(str);
                webView.loadUrl(sb2.toString());
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static boolean E(int i4, androidx.datastore.preferences.protobuf.k kVar, Object obj) throws ao1 {
        en1 en1Var = (en1) kVar.f1003d;
        int i10 = kVar.f1000a;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            kVar.Y(0);
            ((dp1) obj).d(i11 << 3, Long.valueOf(en1Var.n()));
            return true;
        }
        if (i12 == 1) {
            kVar.Y(1);
            ((dp1) obj).d((i11 << 3) | 1, Long.valueOf(en1Var.p()));
            return true;
        }
        if (i12 == 2) {
            ((dp1) obj).d((i11 << 3) | 2, kVar.h0());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i4 != 0) {
                    return false;
                }
                throw new ao1("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zn1();
            }
            kVar.Y(5);
            ((dp1) obj).d(5 | (i11 << 3), Integer.valueOf(en1Var.q()));
            return true;
        }
        dp1 dp1VarA = dp1.a();
        int i13 = i11 << 3;
        int i14 = i4 + 1;
        if (i14 >= 100) {
            throw new ao1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.f0() != Integer.MAX_VALUE && E(i14, kVar, dp1VarA)) {
        }
        if ((i13 | 4) != kVar.f1000a) {
            throw new ao1("Protocol message end-group tag did not match expected tag.");
        }
        if (dp1VarA.f10540e) {
            dp1VarA.f10540e = false;
        }
        ((dp1) obj).d(i13 | 3, dp1VarA);
        return true;
    }

    public static k5 p(ha haVar, Map map) throws Throwable {
        String str = haVar.f11782c;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(haVar.f());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i4 = haVar.f11789l.f1563a;
        httpURLConnection.setConnectTimeout(i4);
        httpURLConnection.setReadTimeout(i4);
        boolean z3 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (haVar.f11781b != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrG = haVar.g();
                if (bArrG != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrG);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                k5 k5Var = new k5(responseCode, w(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return k5Var;
            }
            try {
                return new k5(responseCode, w(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new ta(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z3 = true;
                if (!z3) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static lc q(final long j8) {
        return lc.f(new ec() { // from class: com.google.android.gms.internal.ads.ob
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((hc) obj).f11824a.d(lc.b(j8));
                    return Optional.empty();
                } catch (cc unused) {
                    return Optional.of(gb.f11451b);
                }
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static final gi r(Context context, ei eiVar) {
        b5.i0 i0Var = new b5.i0();
        i0Var.f1823d = new Object();
        i0Var.f1822c = context;
        gi giVar = new gi(i0Var);
        pq0 pq0Var = new pq0(i0Var, eiVar, giVar, 4);
        ce1 ce1Var = new ce1(4, i0Var, giVar);
        synchronized (i0Var.f1823d) {
            di diVar = new di(context, ua.j.C.f35276t.f(), pq0Var, ce1Var, 0);
            i0Var.f1821b = diVar;
            diVar.n();
        }
        return giVar;
    }

    public static String s(byte[] bArr, byte[] bArr2) throws ue {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f17892d) {
                z().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = z().doFinal(bArr2);
                iv = z().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e2) {
            throw new ue(e2);
        } catch (NoSuchAlgorithmException e10) {
            throw new ue(e10);
        } catch (BadPaddingException e11) {
            throw new ue(e11);
        } catch (IllegalBlockSizeException e12) {
            throw new ue(e12);
        } catch (NoSuchPaddingException e13) {
            throw new ue(e13);
        }
    }

    public static final void t(com.google.android.gms.internal.consent_sdk.d dVar, aw awVar) {
        File externalStorageDirectory;
        Context context = (Context) awVar.f9453d;
        String str = (String) awVar.f9454e;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = (String) awVar.f9451b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) awVar.f9452c;
        dVar.f19299e = context;
        dVar.f19300f = str;
        dVar.f19298d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dVar.f19301h = atomicBoolean;
        atomicBoolean.set(((Boolean) pl.f15036c.u()).booleanValue());
        if (((AtomicBoolean) dVar.f19301h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            dVar.f19302i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) dVar.f19296b).put((String) entry.getKey(), (String) entry.getValue());
        }
        fx.f11274a.execute(new s(11, dVar));
        HashMap map = (HashMap) dVar.f19297c;
        tk tkVar = tk.f16835c;
        map.put("action", tkVar);
        map.put("ad_format", tkVar);
        map.put("e", tk.f16836d);
    }

    public static final SharedPreferences v(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e2) {
            za.i.i("", e2);
            return null;
        }
    }

    public static ArrayList w(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ba((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void x(long j8, fk0 fk0Var, boolean z3) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = (((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - j14) + j15;
        long j18 = j16 % 1629190168;
        long j19 = z3 ? (j8 + j8) ^ (j8 >> 63) : j8;
        int i4 = 1;
        while (true) {
            long j20 = j17 ^ j18;
            long j21 = j19 >>> 7;
            boolean z10 = j21 != 0 || i4 < 0;
            int i10 = (int) (j19 & j20);
            if (z10) {
                i10 = ((i10 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) fk0Var.f11194b).write((byte) i10);
            if (!z10) {
                return;
            }
            i4++;
            j19 = j21;
        }
    }

    public static byte[] y(String str, byte[] bArr) throws ue {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new ue();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f17892d) {
                z().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = z().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e2) {
            throw new ue(e2);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new ue(e10);
        } catch (InvalidKeyException e11) {
            throw new ue(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new ue(e12);
        } catch (BadPaddingException e13) {
            throw new ue(e13);
        } catch (IllegalBlockSizeException e14) {
            throw new ue(e14);
        } catch (NoSuchPaddingException e15) {
            throw new ue(e15);
        }
    }

    public static final Cipher z() {
        Cipher cipher;
        synchronized (f17893e) {
            try {
                if (f17891c == null) {
                    f17891c = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f17891c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public no0 A(Looper looper, Handler.Callback callback) {
        return new no0(new Handler(looper, callback));
    }

    public void C(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb2.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append('\"');
                        sb2.append(string);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(")}");
            String string2 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                D(webView, string2);
            } else {
                handler.post(new uh0(this, webView, string2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h1, com.google.android.gms.internal.ads.n00, com.google.android.gms.internal.ads.pm
    /* renamed from: b */
    public /* synthetic */ void mo169b() {
    }

    @Override // com.google.android.gms.internal.ads.j6
    public long c(y1 y1Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ko1
    public boolean d(Class cls) {
        return qn1.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.ko1
    public to1 e(Class cls) {
        if (!qn1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (to1) qn1.t(cls.asSubclass(qn1.class)).w(3, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kb
    public byte f(rb rbVar, int i4) {
        return rbVar.b(i4);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public void i() {
        switch (this.f17902a) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r6
    public boolean j(mx1 mx1Var) {
        switch (this.f17902a) {
            case 19:
                String str = mx1Var.f14052m;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb
    public rb k(rb rbVar, int i4, int i10) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i4 < 0 || i4 > i10 || i10 > (length = (bArr = rbVar.f15610a).length) || i4 > i10 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i11 = i10 - i4;
        if (i11 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr, i4, bArr3, 0, i11);
            bArr2 = bArr3;
        }
        return new rb(bArr2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r4.equals("application/vobsub") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r4.equals("application/x-quicktime-tx3g") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r4.equals("application/x-mp4-vtt") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r4.equals("application/pgs") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r4.equals("application/dvbsubs") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        return 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.r6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int l(com.google.android.gms.internal.ads.mx1 r4) {
        /*
            r3 = this;
            int r0 = r3.f17902a
            switch(r0) {
                case 19: goto L7;
                default: goto L5;
            }
        L5:
            r4 = 1
            return r4
        L7:
            java.lang.String r4 = r4.f14052m
            if (r4 == 0) goto L68
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L5e;
                case -1248334819: goto L55;
                case -1026075066: goto L4c;
                case -1004728940: goto L43;
                case 691401887: goto L3a;
                case 822864842: goto L31;
                case 1157994102: goto L27;
                case 1668750253: goto L1e;
                case 1693976202: goto L15;
                default: goto L14;
            }
        L14:
            goto L68
        L15:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L1e:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L27:
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
        L2f:
            r1 = r2
            goto L67
        L31:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L3a:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L43:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L4c:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L55:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L5e:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L67:
            return r1
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w5.l(com.google.android.gms.internal.ads.mx1):int");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public u2 m(int i4, int i10) {
        switch (this.f17902a) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return new w1();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.android.gms.internal.ads.r6
    public s6 n(mx1 mx1Var) {
        s6 s7Var;
        switch (this.f17902a) {
            case 19:
                String str = mx1Var.f14052m;
                List list = mx1Var.f14055p;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                b7 b7Var = new b7();
                                sk0 sk0Var = new sk0((byte[]) list.get(0));
                                int iL = sk0Var.L();
                                int iL2 = sk0Var.L();
                                Paint paint = new Paint();
                                b7Var.f9605a = paint;
                                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                                paint.setPathEffect(null);
                                Paint paint2 = new Paint();
                                b7Var.f9606b = paint2;
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                                paint2.setPathEffect(null);
                                b7Var.f9607c = new Canvas();
                                int i4 = 719;
                                b7Var.f9608d = new v6(i4, 575, 0, i4, 0, 575);
                                b7Var.f9609e = new u6(0, new int[]{0, -1, -16777216, -8421505}, b7.g(), b7.j());
                                b7Var.f9610f = new a7(iL, iL2);
                                s7Var = b7Var;
                                return s7Var;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                return new aw(1);
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                return new fk0(5);
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                return new rt(3);
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                s7Var = new s7(list);
                                return s7Var;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                s7Var = new e7(list);
                                return s7Var;
                            }
                            break;
                        case 1157994102:
                            if (str.equals("application/vobsub")) {
                                s7Var = new aw(list);
                                return s7Var;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                return new i7();
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                return new o7();
                            }
                            break;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public void o(m2 m2Var) {
        switch (this.f17902a) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f17902a) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public long u() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.kb
    public kb zzc() {
        return new w5(false);
    }

    public /* synthetic */ w5(boolean z3) {
        this.f17902a = 22;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        int i4 = n0.f14096a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.h1
    /* renamed from: zzc, reason: collision with other method in class */
    public /* synthetic */ void mo174zzc() {
    }

    public w5(je jeVar, fv0 fv0Var) {
        this.f17902a = 25;
    }

    @Override // com.google.android.gms.internal.ads.j6
    /* renamed from: zzc, reason: collision with other method in class */
    public m2 mo173zzc() {
        return new d2(-9223372036854775807L, 0L);
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Constructor b() {
        switch (this.f17902a) {
            case 13:
                int[] iArr = v1.f17416c;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(x1.class).getConstructor(null);
            default:
                int[] iArr2 = v1.f17416c;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(x1.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }

    private final void F() {
    }

    @Override // com.google.android.gms.internal.ads.h1
    public /* synthetic */ void a() {
    }

    private final void G(m2 m2Var) {
    }

    @Override // com.google.android.gms.internal.ads.p1
    public long g(long j8) {
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.j6
    public void h(long j8) {
    }
}
