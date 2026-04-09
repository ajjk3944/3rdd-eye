package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class jz {
    public static final lo0 A;
    public static final lo0 B;

    /* renamed from: a, reason: collision with root package name */
    public static AudioManager f12880a;

    /* renamed from: n, reason: collision with root package name */
    public static final ah f12891n;

    /* renamed from: s, reason: collision with root package name */
    public static final o90 f12896s;

    /* renamed from: v, reason: collision with root package name */
    public static Task f12899v;

    /* renamed from: w, reason: collision with root package name */
    public static AppSetIdClient f12900w;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f12881b = {1, 2, 3, 6};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f12882c = {48000, 44100, 32000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f12883d = {24000, 22050, 16000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f12884e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f12885f = {32, 40, 48, 56, 64, 80, 96, AppLovinMediationAdapter.ERROR_CHILD_USER, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f12886h = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f12887i = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] j = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: k, reason: collision with root package name */
    public static final oa f12888k = new oa("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);

    /* renamed from: l, reason: collision with root package name */
    public static final hl f12889l = new hl(7);

    /* renamed from: m, reason: collision with root package name */
    public static final ah f12890m = new ah(12);

    /* renamed from: o, reason: collision with root package name */
    public static final ah f12892o = new ah(28);

    /* renamed from: p, reason: collision with root package name */
    public static final o90 f12893p = new o90(3);

    /* renamed from: q, reason: collision with root package name */
    public static final o90 f12894q = new o90(11);

    /* renamed from: r, reason: collision with root package name */
    public static final o90 f12895r = new o90(15);

    /* renamed from: t, reason: collision with root package name */
    public static final o90 f12897t = new o90(22);

    /* renamed from: u, reason: collision with root package name */
    public static final lo0 f12898u = new lo0(1);

    /* renamed from: x, reason: collision with root package name */
    public static final Object f12901x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public static final lo0 f12902y = new lo0(9);

    /* renamed from: z, reason: collision with root package name */
    public static final s5 f12903z = new s5(5);
    public static final int[] C = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static {
        int i4 = 19;
        int i10 = 16;
        f12891n = new ah(i10);
        f12896s = new o90(i4);
        A = new lo0(i10);
        B = new lo0(i4);
    }

    public static int a(String str) {
        int i4;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i4 = length & (-4);
            if (i10 >= i4) {
                break;
            }
            int i12 = ((bytes[i10] & 255) | ((bytes[i10 + 1] & 255) << 8) | ((bytes[i10 + 2] & 255) << 16) | (bytes[i10 + 3] << 24)) * (-862048943);
            int i13 = i11 ^ (((i12 >>> 17) | (i12 << 15)) * 461845907);
            i11 = (((i13 >>> 19) | (i13 << 13)) * 5) - 430675100;
            i10 += 4;
        }
        int i14 = length & 3;
        if (i14 == 1) {
            int i15 = ((bytes[i4] & 255) | i) * (-862048943);
            i11 ^= ((i15 >>> 17) | (i15 << 15)) * 461845907;
        } else {
            if (i14 != 2) {
                i = i14 == 3 ? (bytes[i4 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i4 + 1] & 255) << 8;
            int i152 = ((bytes[i4] & 255) | i) * (-862048943);
            i11 ^= ((i152 >>> 17) | (i152 << 15)) * 461845907;
        }
        int i16 = i11 ^ length;
        int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
        int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
        return i18 ^ (i18 >>> 16);
    }

    public static long b(String str) {
        String str2 = bq0.f9768a;
        String[] strArrSplit = str.split("\\.", 2);
        long j8 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j8 = (j8 * 60) + Long.parseLong(str3);
        }
        long j9 = j8 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j9 += Long.parseLong(strTrim);
        }
        return j9 * 1000;
    }

    public static long c(ByteBuffer byteBuffer) {
        long j8 = byteBuffer.getInt();
        return j8 < 0 ? j8 + 4294967296L : j8;
    }

    public static synchronized AudioManager d(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f12880a = null;
            }
            AudioManager audioManager = f12880a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                za0 za0Var = new za0();
                a80.e().execute(new q81(12, applicationContext, za0Var));
                za0Var.d();
                AudioManager audioManager2 = f12880a;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f12880a = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static Object e(l31 l31Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return l31Var.b();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void f(int i4, v8 v8Var, lw1 lw1Var, v8 v8Var2, v8... v8VarArr) {
        if (v8Var2 == null) {
            v8Var2 = new v8(new c8[0]);
        }
        if (v8Var != null) {
            v41 v41Var = x41.f18307b;
            yr1.u(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i10 = 0;
            for (c8 c8Var : v8Var.f17554a) {
                if (qt0.class.isAssignableFrom(c8Var.getClass())) {
                    c8 c8Var2 = (c8) qt0.class.cast(c8Var);
                    c8Var2.getClass();
                    int length = objArrCopyOf.length;
                    int i11 = i10 + 1;
                    int iD = s41.d(length, i11);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i10] = c8Var2;
                    i10 = i11;
                }
            }
            u51 u51VarS = x41.s(objArrCopyOf, i10);
            int i12 = u51VarS.f17098d;
            for (int i13 = 0; i13 < i12; i13++) {
                qt0 qt0Var = (qt0) u51VarS.get(i13);
                if (!qt0Var.f15439a.equals("com.android.capture.fps") || i4 == 2) {
                    v8Var2 = v8Var2.c(qt0Var);
                }
            }
        }
        for (v8 v8Var3 : v8VarArr) {
            v8Var2 = v8Var2.b(v8Var3);
        }
        if (v8Var2.f17554a.length > 0) {
            lw1Var.j = v8Var2;
        }
    }

    public static void g(Context context, boolean z3) {
        synchronized (f12901x) {
            try {
                if (f12900w == null) {
                    f12900w = AppSet.getClient(context);
                }
                Task task = f12899v;
                if (task == null || ((task.isComplete() && !f12899v.isSuccessful()) || (z3 && f12899v.isComplete()))) {
                    try {
                        AppSetIdClient appSetIdClient = f12900w;
                        pb.y.i(appSetIdClient, "the appSetIdClient shouldn't be null");
                        f12899v = appSetIdClient.getAppSetIdInfo();
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 31);
                        sb2.append("Failed to get app set ID info: ");
                        sb2.append(message);
                        ya.a0.m(sb2.toString());
                        f12899v = Tasks.forException(e2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, Object obj, int i4, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i4, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i4 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i4, i10, 33);
    }

    public static void i(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void j(String str) {
        if (((Boolean) cm.f10166a.u()).booleanValue()) {
            za.i.c(str);
        }
    }

    public static float k(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void l(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] m(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jz.m(java.lang.String, boolean):java.lang.String[]");
    }

    public static rt n(sk0 sk0Var) {
        sk0Var.G(1);
        int iO = sk0Var.O();
        long j8 = sk0Var.f16447b;
        long j9 = iO;
        int i4 = iO / 18;
        long[] jArrCopyOf = new long[i4];
        long[] jArrCopyOf2 = new long[i4];
        int i10 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            long jD = sk0Var.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jD;
            jArrCopyOf2[i10] = sk0Var.d();
            sk0Var.G(2);
            i10++;
        }
        sk0Var.G((int) ((j8 + j9) - sk0Var.f16447b));
        return new rt(2, jArrCopyOf, jArrCopyOf2);
    }

    public static u51 o(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i4 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (mq0.B(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strE = mq0.E(xmlPullParser, strConcat2);
                String strE2 = mq0.E(xmlPullParser, strConcat3);
                String strE3 = mq0.E(xmlPullParser, strConcat4);
                String strE4 = mq0.E(xmlPullParser, strConcat5);
                if (strE == null || strE2 == null) {
                    return u51.f17096e;
                }
                s3 s3Var = new s3(strE, strE3 != null ? Long.parseLong(strE3) : 0L, strE4 != null ? Long.parseLong(strE4) : 0L);
                int length = objArrCopyOf.length;
                int i10 = i4 + 1;
                int iD = s41.d(length, i10);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i4] = s3Var;
                i4 = i10;
            }
        } while (!mq0.o(xmlPullParser, str.concat(":Directory")));
        return x41.s(objArrCopyOf, i4);
    }

    public static long p(ByteBuffer byteBuffer) {
        long jC = c(byteBuffer) << 32;
        if (jC >= 0) {
            return c(byteBuffer) + jC;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static l4 q(int i4, String str, sk0 sk0Var) {
        int iB = sk0Var.b();
        if (sk0Var.b() == 1684108385) {
            sk0Var.G(8);
            return new l4(str, null, x41.l(sk0Var.l(iB - 16)));
        }
        ls.t("MetadataUtil", "Failed to parse text attribute: ".concat(mv0.g(i4)));
        return null;
    }

    public static double r(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static TextView s(Context context, String str, int i4, int i10, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        x(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i4);
        textView.setTextColor(i10);
        textView.setText(str);
        return textView;
    }

    public static g4 t(int i4, String str, sk0 sk0Var, boolean z3, boolean z10) {
        int iW = w(sk0Var);
        if (z10) {
            iW = Math.min(1, iW);
        }
        if (iW >= 0) {
            return z3 ? new l4(str, null, x41.l(Integer.toString(iW))) : new d4("und", str, Integer.toString(iW));
        }
        ls.t("MetadataUtil", "Failed to parse uint8 attribute: ".concat(mv0.g(i4)));
        return null;
    }

    public static double u(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }

    public static int v(int i4, int i10) {
        int i11;
        if (i4 < 0 || i4 >= 3 || i10 < 0 || (i11 = i10 >> 1) >= 19) {
            return -1;
        }
        int i12 = f12882c[i4];
        if (i12 == 44100) {
            int i13 = g[i11] + (i10 & 1);
            return i13 + i13;
        }
        int i14 = f12885f[i11];
        return i12 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static int w(sk0 sk0Var) {
        int iB = sk0Var.b();
        if (sk0Var.b() == 1684108385) {
            sk0Var.G(8);
            int i4 = iB - 16;
            if (i4 == 1) {
                return sk0Var.K();
            }
            if (i4 == 2) {
                return sk0Var.L();
            }
            if (i4 == 3) {
                return sk0Var.O();
            }
            if (i4 == 4 && (sk0Var.I() & 128) == 0) {
                return sk0Var.h();
            }
        }
        ls.t("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void x(View view, int i4, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i4;
        layoutParams2.width = i10;
        view.setLayoutParams(layoutParams2);
    }

    public static l4 y(int i4, String str, sk0 sk0Var) {
        int iB = sk0Var.b();
        if (sk0Var.b() == 1684108385 && iB >= 22) {
            sk0Var.G(10);
            int iL = sk0Var.L();
            if (iL > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iL).length());
                sb2.append(iL);
                String string = sb2.toString();
                int iL2 = sk0Var.L();
                if (iL2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iL2);
                    string = sb3.toString();
                }
                return new l4(str, null, x41.l(string));
            }
        }
        ls.t("MetadataUtil", "Failed to parse index/count attribute: ".concat(mv0.g(i4)));
        return null;
    }
}
