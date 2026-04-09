package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
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

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1994v2 implements Q0, InterfaceC2121xL, ZA, InterfaceC1075e0, InterfaceC1507m0, InterfaceC1830s0, InterfaceC2100x0, J2, R2, InterfaceC1080e5, InterfaceC1366jL {

    /* renamed from: c, reason: collision with root package name */
    public static Cipher f17206c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17217a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1994v2 f17205b = new C1994v2(0);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17207d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f17208e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final C1994v2 f17209f = new C1994v2(2);

    /* renamed from: g, reason: collision with root package name */
    public static final C1994v2 f17210g = new C1994v2(3);

    /* renamed from: h, reason: collision with root package name */
    public static final C1994v2 f17211h = new C1994v2(4);
    public static final C1994v2 i = new C1994v2(5);

    /* renamed from: j, reason: collision with root package name */
    public static final C1994v2 f17212j = new C1994v2(7);

    /* renamed from: k, reason: collision with root package name */
    public static final C1994v2 f17213k = new C1994v2(8);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1994v2 f17214l = new C1994v2(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1994v2 f17215m = new C1994v2(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1994v2 f17216n = new C1994v2(14);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1994v2 f17204C = new C1994v2(17);

    public /* synthetic */ C1994v2(int i3) {
        this.f17217a = i3;
    }

    public static /* bridge */ RL C(Object obj) {
        AbstractC1096eL abstractC1096eL = (AbstractC1096eL) obj;
        RL rl = abstractC1096eL.zzt;
        if (rl != RL.f10898f) {
            return rl;
        }
        RL rlA = RL.a();
        abstractC1096eL.zzt = rlA;
        return rlA;
    }

    public static final void E(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append("javascript: ");
                sb.append(str);
                webView.loadUrl(sb.toString());
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public static boolean F(int i3, C1506m c1506m, Object obj) throws C1636oL {
        D5.b bVar = (D5.b) c1506m.f15505d;
        int i6 = c1506m.f15502a;
        int i7 = i6 >>> 3;
        int i8 = i6 & 7;
        if (i8 == 0) {
            c1506m.v(0);
            ((RL) obj).d(i7 << 3, Long.valueOf(bVar.t()));
            return true;
        }
        if (i8 == 1) {
            c1506m.v(1);
            ((RL) obj).d((i7 << 3) | 1, Long.valueOf(bVar.v()));
            return true;
        }
        if (i8 == 2) {
            ((RL) obj).d((i7 << 3) | 2, c1506m.E());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                if (i3 != 0) {
                    return false;
                }
                throw new C1636oL("Protocol message end-group tag did not match expected tag.");
            }
            if (i8 != 5) {
                throw new C1582nL();
            }
            c1506m.v(5);
            ((RL) obj).d(5 | (i7 << 3), Integer.valueOf(bVar.w()));
            return true;
        }
        RL rlA = RL.a();
        int i9 = i7 << 3;
        int i10 = i3 + 1;
        if (i10 >= 100) {
            throw new C1636oL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c1506m.C() != Integer.MAX_VALUE && F(i10, c1506m, rlA)) {
        }
        if ((i9 | 4) != c1506m.f15502a) {
            throw new C1636oL("Protocol message end-group tag did not match expected tag.");
        }
        if (rlA.f10903e) {
            rlA.f10903e = false;
        }
        ((RL) obj).d(i9 | 3, rlA);
        return true;
    }

    public static M3.o n(C4 c42, Map map) {
        String str = c42.f7518c;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(c42.f());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i3 = c42.f7526l.f3349a;
        httpURLConnection.setConnectTimeout(i3);
        httpURLConnection.setReadTimeout(i3);
        boolean z6 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (c42.f7517b != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrG = c42.g();
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
                M3.o oVar = new M3.o(responseCode, v(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return oVar;
            }
            try {
                return new M3.o(responseCode, v(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new O4(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z6 = true;
                if (!z6) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static E5 o(final long j6) {
        return E5.f(new InterfaceC2105x5() { // from class: com.google.android.gms.internal.ads.i5
            public final /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((A5) obj).f6931a.r(E5.b(j6));
                    return Optional.empty();
                } catch (C2051w5 unused) {
                    return Optional.of(EnumC0862a5.f13056b);
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static final C2000v8 p(Context context, C1892t8 c1892t8) {
        A1.s sVar = new A1.s(context);
        C2000v8 c2000v8 = new C2000v8(sVar);
        C1338iu c1338iu = new C1338iu(sVar, c1892t8, c2000v8, 5);
        C0697Ql c0697Ql = new C0697Ql((Object) sVar, (Object) c2000v8, 6, false);
        synchronized (sVar.f125d) {
            C1838s8 c1838s8 = new C1838s8(context, p2.j.f22785C.f22806t.a(), c1338iu, c0697Ql, 0);
            sVar.f123b = c1838s8;
            c1838s8.n();
        }
        return c2000v8;
    }

    public static String q(byte[] bArr, byte[] bArr2) throws M6 {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f17207d) {
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
        } catch (InvalidKeyException e6) {
            throw new M6(e6);
        } catch (NoSuchAlgorithmException e7) {
            throw new M6(e7);
        } catch (BadPaddingException e8) {
            throw new M6(e8);
        } catch (IllegalBlockSizeException e9) {
            throw new M6(e9);
        } catch (NoSuchPaddingException e10) {
            throw new M6(e10);
        }
    }

    public static final void r(K4.c cVar, C1431kf c1431kf) {
        File externalStorageDirectory;
        Context context = (Context) c1431kf.f15175d;
        String str = (String) c1431kf.f15176e;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = (String) c1431kf.f15173b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1431kf.f15174c;
        cVar.f2214g = context;
        cVar.f2215h = str;
        cVar.f2213f = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        cVar.f2211d = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC1103ea.f13908c.v()).booleanValue());
        if (((AtomicBoolean) cVar.f2211d).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            cVar.f2216j = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) cVar.f2212e).put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC0640Nf.f10005a.execute(new RunnableC1883t(12, cVar));
        HashMap map = (HashMap) cVar.f2210c;
        I9 i9 = I9.f9077c;
        map.put("action", i9);
        map.put("ad_format", i9);
        map.put("e", I9.f9078d);
    }

    public static final SharedPreferences t(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e6) {
            u2.k.i("", e6);
            return null;
        }
    }

    public static ArrayList v(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2050w4((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void w(long j6, Rx rx, boolean z6) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j7 = jArr[0];
        long j8 = jArr[1];
        long j9 = jArr[2];
        long j10 = jArr[3];
        long j11 = jArr[4];
        long j12 = jArr[5];
        long j13 = jArr[6];
        long j14 = jArr[7];
        long j15 = (((((~j7) & j8) | j9) + ((j7 & j10) | j11)) - j12) + j13;
        long j16 = j14 % 1629190168;
        long j17 = z6 ? (j6 + j6) ^ (j6 >> 63) : j6;
        int i3 = 1;
        while (true) {
            long j18 = j15 ^ j16;
            long j19 = j17 >>> 7;
            boolean z7 = j19 != 0 || i3 < 0;
            int i6 = (int) (j17 & j18);
            if (z7) {
                i6 = ((i6 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) rx.f11090b).write((byte) i6);
            if (!z7) {
                return;
            }
            i3++;
            j17 = j19;
        }
    }

    public static byte[] y(String str, byte[] bArr) throws M6 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new M6();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f17207d) {
                z().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = z().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e6) {
            throw new M6(e6);
        } catch (InvalidAlgorithmParameterException e7) {
            throw new M6(e7);
        } catch (InvalidKeyException e8) {
            throw new M6(e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new M6(e9);
        } catch (BadPaddingException e10) {
            throw new M6(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new M6(e11);
        } catch (NoSuchPaddingException e12) {
            throw new M6(e12);
        }
    }

    public static final Cipher z() {
        Cipher cipher;
        synchronized (f17208e) {
            try {
                if (f17206c == null) {
                    f17206c = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f17206c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public void A(L0 l02) {
        switch (this.f17217a) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public C1231gt B(Looper looper, Handler.Callback callback) {
        return new C1231gt(new Handler(looper, callback));
    }

    public void D(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sb.append('\"');
                        sb.append(string);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                E(webView, string2);
            } else {
                handler.post(new RunnableC0786Vp(this, webView, string2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1075e0, com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public /* synthetic */ void mo6a() {
    }

    @Override // com.google.android.gms.internal.ads.J2
    public long b(InterfaceC2046w0 interfaceC2046w0) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1075e0
    public /* synthetic */ void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1080e5
    public byte d(C1458l5 c1458l5, int i3) {
        return c1458l5.b(i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1080e5
    /* renamed from: f, reason: collision with other method in class */
    public InterfaceC1080e5 mo14f() {
        return new C1994v2(false);
    }

    @Override // com.google.android.gms.internal.ads.R2
    public boolean h(TP tp) {
        switch (this.f17217a) {
            case 19:
                String str = tp.f11397m;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1080e5
    public C1458l5 i(C1458l5 c1458l5, int i3, int i6) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i3 < 0 || i3 > i6 || i6 > (length = (bArr = c1458l5.f15350a).length) || i3 > i6 || i6 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i7 = i6 - i3;
        if (i7 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr, i3, bArr3, 0, i7);
            bArr2 = bArr3;
        }
        return new C1458l5(bArr2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    @Override // com.google.android.gms.internal.ads.R2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int j(com.google.android.gms.internal.ads.TP r4) {
        /*
            r3 = this;
            int r0 = r3.f17217a
            switch(r0) {
                case 19: goto L7;
                default: goto L5;
            }
        L5:
            r4 = 1
            return r4
        L7:
            java.lang.String r4 = r4.f11397m
            if (r4 == 0) goto L77
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L66;
                case -1248334819: goto L5c;
                case -1026075066: goto L52;
                case -1004728940: goto L48;
                case 691401887: goto L3e;
                case 822864842: goto L34;
                case 1157994102: goto L2a;
                case 1668750253: goto L20;
                case 1693976202: goto L15;
                default: goto L14;
            }
        L14:
            goto L70
        L15:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 8
            goto L71
        L20:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 3
            goto L71
        L2a:
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 6
            goto L71
        L34:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 0
            goto L71
        L3e:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 4
            goto L71
        L48:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = r1
            goto L71
        L52:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = r2
            goto L71
        L5c:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 5
            goto L71
        L66:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L70
            r0 = 7
            goto L71
        L70:
            r0 = -1
        L71:
            switch(r0) {
                case 0: goto L76;
                case 1: goto L76;
                case 2: goto L75;
                case 3: goto L76;
                case 4: goto L75;
                case 5: goto L75;
                case 6: goto L75;
                case 7: goto L75;
                case 8: goto L76;
                default: goto L74;
            }
        L74:
            goto L77
        L75:
            r1 = r2
        L76:
            return r1
        L77:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1994v2.j(com.google.android.gms.internal.ads.TP):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2121xL
    public boolean k(Class cls) {
        return AbstractC1096eL.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    @Override // com.google.android.gms.internal.ads.R2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.S2 l(com.google.android.gms.internal.ads.TP r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1994v2.l(com.google.android.gms.internal.ads.TP):com.google.android.gms.internal.ads.S2");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2121xL
    public GL m(Class cls) {
        if (!AbstractC1096eL.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (GL) AbstractC1096eL.t(cls.asSubclass(AbstractC1096eL.class)).w(3, null);
        } catch (Exception e6) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
        }
    }

    public long s() {
        return SystemClock.elapsedRealtime();
    }

    public String toString() {
        switch (this.f17217a) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public void u() {
        switch (this.f17217a) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public T0 x(int i3, int i6) {
        switch (this.f17217a) {
            case 15:
                throw new UnsupportedOperationException();
            default:
                return new C1938u0();
        }
    }

    public /* synthetic */ C1994v2(boolean z6) {
        this.f17217a = 22;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        int i3 = M.f9789a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1075e0
    /* renamed from: f */
    public /* synthetic */ void mo7f() {
    }

    public C1994v2(C6 c6, Bw bw) {
        this.f17217a = 25;
    }

    @Override // com.google.android.gms.internal.ads.J2
    public L0 f() {
        return new B0(-9223372036854775807L, 0L);
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Constructor a() {
        switch (this.f17217a) {
            case 13:
                int[] iArr = C1884t0.f16832c;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC1992v0.class).getConstructor(null);
            default:
                int[] iArr2 = C1884t0.f16832c;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC1992v0.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }

    private final void G() {
    }

    private final void H(L0 l02) {
    }

    @Override // com.google.android.gms.internal.ads.J2
    public void e(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1507m0
    public long g(long j6) {
        return j6;
    }
}
