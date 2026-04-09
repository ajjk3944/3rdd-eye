package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q2.C2841s;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0709Rg {

    /* renamed from: A, reason: collision with root package name */
    public static final C1122et f10915A;

    /* renamed from: B, reason: collision with root package name */
    public static final C1122et f10916B;

    /* renamed from: a, reason: collision with root package name */
    public static AudioManager f10918a;

    /* renamed from: n, reason: collision with root package name */
    public static final P7 f10930n;

    /* renamed from: s, reason: collision with root package name */
    public static final C0748Tl f10935s;

    /* renamed from: v, reason: collision with root package name */
    public static c3.j f10938v;

    /* renamed from: w, reason: collision with root package name */
    public static V2.h f10939w;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10919b = {1, 2, 3, 6};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10920c = {48000, 44100, 32000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10921d = {24000, 22050, 16000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10922e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f10923f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f10924g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f10925h = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] i = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f10926j = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: k, reason: collision with root package name */
    public static final J4 f10927k = new J4(4, "https://csi.gstatic.com/csi", "gads:sdk_csi_server");

    /* renamed from: l, reason: collision with root package name */
    public static final W9 f10928l = new W9(7);

    /* renamed from: m, reason: collision with root package name */
    public static final P7 f10929m = new P7(12);

    /* renamed from: o, reason: collision with root package name */
    public static final P7 f10931o = new P7(28);

    /* renamed from: p, reason: collision with root package name */
    public static final C0748Tl f10932p = new C0748Tl(3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0748Tl f10933q = new C0748Tl(11);

    /* renamed from: r, reason: collision with root package name */
    public static final C0748Tl f10934r = new C0748Tl(15);

    /* renamed from: t, reason: collision with root package name */
    public static final C0748Tl f10936t = new C0748Tl(22);

    /* renamed from: u, reason: collision with root package name */
    public static final C1122et f10937u = new C1122et(1);

    /* renamed from: x, reason: collision with root package name */
    public static final Object f10940x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final C1122et f10941y = new C1122et(9);

    /* renamed from: z, reason: collision with root package name */
    public static final C1778r2 f10942z = new C1778r2(5);

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f10917C = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static {
        int i3 = 19;
        int i6 = 16;
        f10930n = new P7(i6);
        f10935s = new C0748Tl(i3);
        f10915A = new C1122et(i6);
        f10916B = new C1122et(i3);
    }

    public static String A(byte[] bArr, int i3, int i6, Charset charset) {
        return (i6 <= i3 || i6 > bArr.length) ? "" : new String(bArr, i3, i6 - i3, charset);
    }

    public static long a(ByteBuffer byteBuffer) {
        long j6 = byteBuffer.getInt();
        return j6 < 0 ? j6 + 4294967296L : j6;
    }

    public static synchronized AudioManager b(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f10918a = null;
            }
            AudioManager audioManager = f10918a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                C0494Em c0494Em = new C0494Em();
                AbstractC1114el.e().execute(new CD(applicationContext, 13, c0494Em));
                c0494Em.d();
                AudioManager audioManager2 = f10918a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f10918a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Bundle c(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8565B2)).booleanValue()) {
            for (int i3 = 0; i3 < 2; i3++) {
                Pair pair = pairArr[i3];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static C1672p3 d(C1672p3 c1672p3, String[] strArr, Map map) {
        int length;
        int i3 = 0;
        if (c1672p3 == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (C1672p3) map.get(strArr[0]);
            }
            if (length2 > 1) {
                C1672p3 c1672p32 = new C1672p3();
                while (i3 < length2) {
                    c1672p32.c((C1672p3) map.get(strArr[i3]));
                    i3++;
                }
                return c1672p32;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c1672p3.c((C1672p3) map.get(strArr[0]));
                return c1672p3;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i3 < length) {
                    c1672p3.c((C1672p3) map.get(strArr[i3]));
                    i3++;
                }
            }
        }
        return c1672p3;
    }

    public static String e(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        PD pd = new PD();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new PackageManagerOnChecksumsReadyListenerC1836s6(1, pd));
        return (String) pd.get();
    }

    public static void f(S2.a aVar, Throwable th, String str) {
        C1053de.a((Context) S2.b.n1(aVar)).f(th, str, ((Double) AbstractC1857sa.f16754f.v()).floatValue());
    }

    public static void g(Context context, boolean z6) {
        synchronized (f10940x) {
            try {
                if (f10939w == null) {
                    f10939w = new V2.h(context);
                }
                c3.j jVar = f10938v;
                if (jVar == null || ((jVar.d() && !f10938v.e()) || (z6 && f10938v.d()))) {
                    try {
                        V2.h hVar = f10939w;
                        M2.u.f(hVar, "the appSetIdClient shouldn't be null");
                        f10938v = hVar.b();
                    } catch (ArrayIndexOutOfBoundsException e6) {
                        String message = e6.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31);
                        sb.append("Failed to get app set ID info: ");
                        sb.append(message);
                        AbstractC2907C.m(sb.toString());
                        f10938v = com.bumptech.glide.d.r(e6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static boolean i(C2036vr c2036vr, C0 c02, int i3, A0 a02) {
        boolean z6;
        long jP = c2036vr.P();
        long j6 = jP >>> 16;
        if (j6 != i3) {
            return false;
        }
        boolean z7 = (j6 & 1) == 1;
        long j7 = jP >> 12;
        long j8 = jP >> 8;
        long j9 = jP >> 4;
        long j10 = jP >> 1;
        long j11 = jP & 1;
        int i6 = (int) (j9 & 15);
        if (i6 <= 7) {
            z6 = true;
            if (i6 != c02.f7485g - 1) {
                return false;
            }
        } else {
            z6 = true;
            if (i6 > 10 || c02.f7485g != 2) {
                return false;
            }
        }
        int i7 = (int) (j10 & 7);
        if (!(i7 == 0 || i7 == c02.i) || j11 == 1) {
            return false;
        }
        try {
            long jO = c2036vr.o();
            if (!z7) {
                jO *= c02.f7480b;
            }
            long j12 = c02.f7487j;
            if (j12 != 0 && jO > j12) {
                return false;
            }
            a02.f6910a = jO;
            int iL = l((int) (j7 & 15), c2036vr);
            long j13 = c02.f7487j;
            boolean z8 = (j13 == 0 || jO + ((long) iL) >= j13) ? z6 : false;
            if (iL == -1) {
                return false;
            }
            if ((!z8 && iL < c02.f7479a) || iL > c02.f7480b) {
                return false;
            }
            int i8 = c02.f7483e;
            int i9 = (int) (j8 & 15);
            if (i9 != 0) {
                if (i9 <= 11) {
                    if (i9 != c02.f7484f) {
                        return false;
                    }
                } else if (i9 != 12) {
                    if (i9 > 14) {
                        return false;
                    }
                    int iL2 = c2036vr.L();
                    if (i9 == 14) {
                        iL2 *= 10;
                    }
                    if (iL2 != i8) {
                        return false;
                    }
                } else if (c2036vr.K() * TTAdConstant.STYLE_SIZE_RADIO_1_1 != i8) {
                    return false;
                }
            }
            int iK = c2036vr.K();
            int i10 = c2036vr.f17355b;
            byte[] bArr = c2036vr.f17354a;
            int i11 = i10 - 1;
            int i12 = 0;
            for (int i13 = c2036vr.f17355b; i13 < i11; i13++) {
                i12 = Vt.i[i12 ^ (bArr[i13] & 255)];
            }
            String str = Vt.f12096a;
            if (iK != i12) {
                return false;
            }
            if (c2036vr.B() != 0) {
                int I6 = c2036vr.I();
                if ((I6 & 128) != 0) {
                    return false;
                }
                int i14 = (I6 & 126) >> 1;
                if ((i14 >= 2 && i14 <= 7) || (i14 >= 13 && i14 <= 31)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 57);
                    sb.append("Ignoring frame where first subframe has a reserved type: ");
                    sb.append(i14);
                    AbstractC2022vd.p("FlacFrameReader", sb.toString());
                    return false;
                }
            }
            return z6;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void j(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k(com.google.android.gms.internal.ads.C2036vr r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.f17355b
        L6:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.P()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.L()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.O()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.O()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.B()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.G(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.E(r2)
            return r4
        La9:
            r1.E(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0709Rg.k(com.google.android.gms.internal.ads.vr, int, int, boolean):boolean");
    }

    public static int l(int i3, C2036vr c2036vr) {
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i3 - 2);
            case 6:
                return c2036vr.K() + 1;
            case 7:
                return c2036vr.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i3 - 8);
            default:
                return -1;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0297 A[Catch: all -> 0x0130, Exception -> 0x0255, OutOfMemoryError -> 0x025a, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c2 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0300 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0303 A[Catch: all -> 0x0130, Exception -> 0x02bc, OutOfMemoryError -> 0x02bf, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:166:0x0297, B:168:0x02a0, B:180:0x02e4, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:176:0x02c2, B:178:0x02de, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.F1 m(int r33, com.google.android.gms.internal.ads.C2036vr r34, boolean r35, com.google.android.gms.internal.ads.C1994v2 r36) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC0709Rg.m(int, com.google.android.gms.internal.ads.vr, boolean, com.google.android.gms.internal.ads.v2):com.google.android.gms.internal.ads.F1");
    }

    public static C1197gC n(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC0582Jp.B(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strF = AbstractC0582Jp.F(xmlPullParser, strConcat2);
                String strF2 = AbstractC0582Jp.F(xmlPullParser, strConcat3);
                String strF3 = AbstractC0582Jp.F(xmlPullParser, strConcat4);
                String strF4 = AbstractC0582Jp.F(xmlPullParser, strConcat5);
                if (strF == null || strF2 == null) {
                    return C1197gC.f14227e;
                }
                C1777r1 c1777r1 = new C1777r1(strF3 != null ? Long.parseLong(strF3) : 0L, strF4 != null ? Long.parseLong(strF4) : 0L, strF);
                int length = objArrCopyOf.length;
                int i6 = i3 + 1;
                int iD = GB.d(length, i6);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i3] = c1777r1;
                i3 = i6;
            }
        } while (!AbstractC0582Jp.o(xmlPullParser, str.concat(":Directory")));
        return LB.o(i3, objArrCopyOf);
    }

    public static void o(ArrayList arrayList, J4 j42) {
        String str = (String) j42.v();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static long p(ByteBuffer byteBuffer) {
        long jA = a(byteBuffer) << 32;
        if (jA >= 0) {
            return a(byteBuffer) + jA;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static C1197gC q(int i3, int i6, byte[] bArr) {
        if (i6 >= bArr.length) {
            return LB.i("");
        }
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iX = x(i6, i3, bArr);
        int i7 = 0;
        while (i6 < iX) {
            String str = new String(bArr, i6, iX - i6, v(i3));
            int length = objArrCopyOf.length;
            int i8 = i7 + 1;
            int iD = GB.d(length, i8);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i7] = str;
            i6 = z(i3) + iX;
            iX = x(i6, i3, bArr);
            i7 = i8;
        }
        C1197gC c1197gCO = LB.o(i7, objArrCopyOf);
        return c1197gCO.isEmpty() ? LB.i("") : c1197gCO;
    }

    public static double r(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static int s(int i3, C2036vr c2036vr) {
        byte[] bArr = c2036vr.f17354a;
        int i6 = c2036vr.f17355b;
        int i7 = i6;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i6 + i3) {
                return i3;
            }
            if ((bArr[i7] & 255) == 255 && bArr[i8] == 0) {
                System.arraycopy(bArr, i7 + 2, bArr, i8, (i3 - (i7 - i6)) - 2);
                i3--;
            }
            i7 = i8;
        }
    }

    public static double t(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static int u(int i3, int i6) {
        int i7;
        if (i3 < 0 || i3 >= 3 || i6 < 0 || (i7 = i6 >> 1) >= 19) {
            return -1;
        }
        int i8 = f10920c[i3];
        if (i8 == 44100) {
            int i9 = f10924g[i7] + (i6 & 1);
            return i9 + i9;
        }
        int i10 = f10923f[i7];
        return i8 == 32000 ? i10 * 6 : i10 * 4;
    }

    public static Charset v(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String w(int i3, int i6, int i7, int i8, int i9) {
        return i3 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static int x(int i3, int i6, byte[] bArr) {
        int iY = y(i3, bArr);
        if (i6 == 0 || i6 == 3) {
            return iY;
        }
        while (true) {
            int length = bArr.length;
            if (iY >= length - 1) {
                return length;
            }
            int i7 = iY + 1;
            if ((iY - i3) % 2 == 0 && bArr[i7] == 0) {
                return iY;
            }
            iY = y(i7, bArr);
        }
    }

    public static int y(int i3, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i3 >= length) {
                return length;
            }
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
    }

    public static int z(int i3) {
        return (i3 == 0 || i3 == 3) ? 1 : 2;
    }
}
