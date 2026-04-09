package h9;

import android.R;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.TelephonyDisplayInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.y3;
import com.survicate.surveys.infrastructure.network.URLRequest;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r2 implements bf.d, dt.b, dt.e {
    public static HashSet B;

    /* renamed from: a, reason: collision with root package name */
    public Object f10470a;

    /* renamed from: d, reason: collision with root package name */
    public Object f10471d;

    /* renamed from: g, reason: collision with root package name */
    public Object f10472g;

    /* renamed from: r, reason: collision with root package name */
    public Object f10473r;

    /* renamed from: x, reason: collision with root package name */
    public Object f10474x;

    /* renamed from: y, reason: collision with root package name */
    public Object f10475y;

    public /* synthetic */ r2(Object obj) {
        this.f10470a = obj;
    }

    public static lf.j2 A(lf.p0 p0Var, p.v2 v2Var) {
        List listB = ((kf.n) v2Var.B).b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            kf.m mVar = (kf.m) listB.get(i10);
            mVar.getClass();
            lf.d1 d1Var = new lf.d1();
            kf.b bVar = (kf.b) mVar;
            String str = bVar.f14302e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f14299b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            d1Var.f15221a = new lf.f1(str2, str);
            String str3 = bVar.f14300c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            d1Var.f15222b = str3;
            String str4 = bVar.f14301d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            d1Var.f15223c = str4;
            d1Var.f15224d = bVar.f14303f;
            d1Var.f15225e = (byte) (d1Var.f15225e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        lf.o0 o0VarA = p0Var.a();
        o0VarA.f15383f = new lf.g1(arrayList);
        return o0VarA.a();
    }

    public static boolean B0(i1 i1Var, long j) {
        return (i1Var.f10358a & j) != 0;
    }

    public static boolean C(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static f1.a E(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new f1.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix G(f1.a r9, f1.a r10, h9.x r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L91
            h9.v r1 = r11.f10510a
            if (r1 != 0) goto Ld
            goto L91
        Ld:
            float r2 = r9.f8400d
            float r3 = r10.f8400d
            float r2 = r2 / r3
            float r3 = r9.f8401e
            float r4 = r10.f8401e
            float r3 = r3 / r4
            float r4 = r10.f8398b
            float r4 = -r4
            float r5 = r10.f8399c
            float r5 = -r5
            h9.x r6 = h9.x.f10508c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f8398b
            float r9 = r9.f8399c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            h9.w r11 = r11.f10511b
            h9.w r6 = h9.w.slice
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.f8400d
            float r2 = r2 / r11
            float r3 = r9.f8401e
            float r3 = r3 / r11
            int[] r6 = h9.i2.f10373a
            int r7 = r1.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L56;
                case 6: goto L56;
                default: goto L55;
            }
        L55:
            goto L60
        L56:
            float r7 = r10.f8400d
            float r7 = r7 - r2
        L59:
            float r4 = r4 - r7
            goto L60
        L5b:
            float r7 = r10.f8400d
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L59
        L60:
            int r1 = r1.ordinal()
            r1 = r6[r1]
            r2 = 2
            if (r1 == r2) goto L7f
            r2 = 3
            if (r1 == r2) goto L7a
            r2 = 5
            if (r1 == r2) goto L7f
            r2 = 6
            if (r1 == r2) goto L7a
            r2 = 7
            if (r1 == r2) goto L7f
            r2 = 8
            if (r1 == r2) goto L7a
            goto L84
        L7a:
            float r10 = r10.f8401e
            float r10 = r10 - r3
        L7d:
            float r5 = r5 - r10
            goto L84
        L7f:
            float r10 = r10.f8401e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L7d
        L84:
            float r10 = r9.f8398b
            float r9 = r9.f8399c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.G(f1.a, f1.a, h9.x):android.graphics.Matrix");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface J(java.lang.String r5, java.lang.Integer r6, h9.a1 r7) {
        /*
            h9.a1 r0 = h9.a1.Italic
            r1 = 0
            r2 = 1
            if (r7 != r0) goto L8
            r7 = r2
            goto L9
        L8:
            r7 = r1
        L9:
            int r6 = r6.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 2
            r4 = 3
            if (r6 <= r0) goto L19
            if (r7 == 0) goto L17
            r6 = r4
            goto L1e
        L17:
            r6 = r2
            goto L1e
        L19:
            if (r7 == 0) goto L1d
            r6 = r3
            goto L1e
        L1d:
            r6 = r1
        L1e:
            r5.getClass()
            int r7 = r5.hashCode()
            r0 = -1
            switch(r7) {
                case -1536685117: goto L57;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L60
        L2b:
            java.lang.String r7 = "cursive"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L60
        L36:
            java.lang.String r7 = "serif"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L3f
            goto L29
        L3f:
            r1 = r4
            goto L60
        L41:
            java.lang.String r7 = "fantasy"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L4a
            goto L29
        L4a:
            r1 = r3
            goto L60
        L4c:
            java.lang.String r7 = "monospace"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L55
            goto L29
        L55:
            r1 = r2
            goto L60
        L57:
            java.lang.String r7 = "sans-serif"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L60
            goto L29
        L60:
            switch(r1) {
                case 0: goto L81;
                case 1: goto L7a;
                case 2: goto L73;
                case 3: goto L6c;
                case 4: goto L65;
                default: goto L63;
            }
        L63:
            r5 = 0
            return r5
        L65:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L6c:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L73:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L7a:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L81:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.J(java.lang.String, java.lang.Integer, h9.a1):android.graphics.Typeface");
    }

    public static Path J0(u0 u0Var) {
        Path path = new Path();
        float[] fArr = u0Var.f10497o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = u0Var.f10497o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (u0Var instanceof v0) {
            path.close();
        }
        if (u0Var.f10422h == null) {
            u0Var.f10422h = E(path);
        }
        return path;
    }

    public static int K(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    public static String L(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static r2 M(Context context, hf.x xVar, of.b bVar, a8.f fVar, kf.e eVar, p.v2 v2Var, om.f fVar2, al.b bVar2, io.sentry.internal.debugmeta.c cVar, hf.i iVar, jf.d dVar) {
        hf.r rVar = new hf.r(context, xVar, fVar, fVar2, bVar2);
        of.a aVar = new of.a(bVar, bVar2, iVar);
        mf.a aVar2 = pf.a.f20466b;
        m9.o.b(context);
        pf.a aVar3 = new pf.a(new pf.c(m9.o.a().c(new k9.a(pf.a.f20467c, pf.a.f20468d)).a("FIREBASE_CRASHLYTICS_REPORT", new j9.c("json"), pf.a.f20469e), bVar2.h(), cVar));
        r2 r2Var = new r2();
        r2Var.f10470a = rVar;
        r2Var.f10471d = aVar;
        r2Var.f10472g = aVar3;
        r2Var.f10473r = eVar;
        r2Var.f10474x = v2Var;
        r2Var.f10475y = xVar;
        return r2Var;
    }

    public static ColorStateList N(Context context, int i10) {
        int iC = p.h2.c(context, h.a.colorControlHighlight);
        int iB = p.h2.b(context, h.a.colorButtonNormal);
        int[] iArr = p.h2.f20067b;
        int[] iArr2 = p.h2.f20069d;
        int iB2 = k3.c.b(iC, i10);
        return new ColorStateList(new int[][]{iArr, iArr2, p.h2.f20068c, p.h2.f20071f}, new int[]{iB, iB2, k3.c.b(iC, i10), i10});
    }

    public static void T(String str, Object... objArr) {
        io.sentry.android.core.e0.d("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void W(f0 f0Var, String str) {
        o1 o1VarN = f0Var.f10461a.N(str);
        if (o1VarN == null) {
            io.sentry.android.core.e0.p("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(o1VarN instanceof f0)) {
            T("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (o1VarN == f0Var) {
            T("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        f0 f0Var2 = (f0) o1VarN;
        if (f0Var.f10336i == null) {
            f0Var.f10336i = f0Var2.f10336i;
        }
        if (f0Var.j == null) {
            f0Var.j = f0Var2.j;
        }
        if (f0Var.k == null) {
            f0Var.k = f0Var2.k;
        }
        if (f0Var.f10335h.isEmpty()) {
            f0Var.f10335h = f0Var2.f10335h;
        }
        try {
            if (f0Var instanceof p1) {
                p1 p1Var = (p1) f0Var;
                p1 p1Var2 = (p1) o1VarN;
                if (p1Var.f10445m == null) {
                    p1Var.f10445m = p1Var2.f10445m;
                }
                if (p1Var.f10446n == null) {
                    p1Var.f10446n = p1Var2.f10446n;
                }
                if (p1Var.f10447o == null) {
                    p1Var.f10447o = p1Var2.f10447o;
                }
                if (p1Var.f10448p == null) {
                    p1Var.f10448p = p1Var2.f10448p;
                }
            } else {
                X((t1) f0Var, (t1) o1VarN);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = f0Var2.f10337l;
        if (str2 != null) {
            W(f0Var, str2);
        }
    }

    public static void X(t1 t1Var, t1 t1Var2) {
        if (t1Var.f10487m == null) {
            t1Var.f10487m = t1Var2.f10487m;
        }
        if (t1Var.f10488n == null) {
            t1Var.f10488n = t1Var2.f10488n;
        }
        if (t1Var.f10489o == null) {
            t1Var.f10489o = t1Var2.f10489o;
        }
        if (t1Var.f10490p == null) {
            t1Var.f10490p = t1Var2.f10490p;
        }
        if (t1Var.f10491q == null) {
            t1Var.f10491q = t1Var2.f10491q;
        }
    }

    public static void Y(t0 t0Var, String str) {
        o1 o1VarN = t0Var.f10461a.N(str);
        if (o1VarN == null) {
            io.sentry.android.core.e0.p("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(o1VarN instanceof t0)) {
            T("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (o1VarN == t0Var) {
            T("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        t0 t0Var2 = (t0) o1VarN;
        if (t0Var.f10479p == null) {
            t0Var.f10479p = t0Var2.f10479p;
        }
        if (t0Var.f10480q == null) {
            t0Var.f10480q = t0Var2.f10480q;
        }
        if (t0Var.f10481r == null) {
            t0Var.f10481r = t0Var2.f10481r;
        }
        if (t0Var.f10482s == null) {
            t0Var.f10482s = t0Var2.f10482s;
        }
        if (t0Var.f10483t == null) {
            t0Var.f10483t = t0Var2.f10483t;
        }
        if (t0Var.f10484u == null) {
            t0Var.f10484u = t0Var2.f10484u;
        }
        if (t0Var.f10485v == null) {
            t0Var.f10485v = t0Var2.f10485v;
        }
        if (t0Var.f10401i.isEmpty()) {
            t0Var.f10401i = t0Var2.f10401i;
        }
        if (t0Var.f10498o == null) {
            t0Var.f10498o = t0Var2.f10498o;
        }
        if (t0Var.f10476n == null) {
            t0Var.f10476n = t0Var2.f10476n;
        }
        String str2 = t0Var2.f10486w;
        if (str2 != null) {
            Y(t0Var, str2);
        }
    }

    public static /* synthetic */ List a0(r2 r2Var, dt.w wVar, js.s sVar, Boolean bool, boolean z10, int i10) {
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return r2Var.Z(wVar, sVar, z11, false, bool, (i10 & 32) != 0 ? false : z10);
    }

    public static js.s g0(rs.b bVar, ns.f fVar, h7.h0 h0Var, dt.a aVar, boolean z10) {
        br.l.e(bVar, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(aVar, "kind");
        if (bVar instanceof ls.l) {
            rs.g gVar = ps.i.f20642a;
            ps.e eVarA = ps.i.a((ls.l) bVar, fVar, h0Var);
            if (eVarA != null) {
                return e5.w(eVarA);
            }
        } else if (bVar instanceof ls.y) {
            rs.g gVar2 = ps.i.f20642a;
            ps.e eVarC = ps.i.c((ls.y) bVar, fVar, h0Var);
            if (eVarC != null) {
                return e5.w(eVarC);
            }
        } else if (bVar instanceof ls.g0) {
            rs.o oVar = os.k.f19781d;
            br.l.d(oVar, "propertySignature");
            os.e eVar = (os.e) a.a.o((rs.m) bVar, oVar);
            if (eVar != null) {
                int i10 = js.d.f13795a[aVar.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        if ((eVar.f19753d & 8) != 8) {
                            return null;
                        }
                        os.c cVar = eVar.f19757y;
                        br.l.d(cVar, "signature.setter");
                        return new js.s(fVar.getString(cVar.f19743g).concat(fVar.getString(cVar.f19744r)));
                    }
                    if (i10 == 3) {
                        return y3.w((ls.g0) bVar, fVar, h0Var, true, true, z10);
                    }
                } else if ((eVar.f19753d & 4) == 4) {
                    os.c cVar2 = eVar.f19756x;
                    br.l.d(cVar2, "signature.getter");
                    return new js.s(fVar.getString(cVar2.f19743g).concat(fVar.getString(cVar2.f19744r)));
                }
            }
        }
        return null;
    }

    public static void g1(p2 p2Var, boolean z10, r1 r1Var) {
        int i10;
        i1 i1Var = p2Var.f10449a;
        float fFloatValue = (z10 ? i1Var.f10370r : i1Var.f10372y).floatValue();
        if (r1Var instanceof b0) {
            i10 = ((b0) r1Var).f10308a;
        } else if (!(r1Var instanceof c0)) {
            return;
        } else {
            i10 = p2Var.f10449a.J.f10308a;
        }
        int iK = K(i10, fFloatValue);
        if (z10) {
            p2Var.f10452d.setColor(iK);
        } else {
            p2Var.f10453e.setColor(iK);
        }
    }

    public static void h1(Drawable drawable, int i10, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p.p.f20130b;
        }
        drawableMutate.setColorFilter(p.p.c(i10, mode));
    }

    public static void i1(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setRequestMethod(URLRequest.METHOD_POST);
        httpsURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpsURLConnection.setRequestProperty("Authorization", "GomgeesEdMyijrotepjinUjOycsottiahajKafpi");
        httpsURLConnection.setRequestProperty("ENCTYPE", "multipart/form-data");
        httpsURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
    }

    public static boolean o1(hk.h hVar) {
        Object next;
        Iterator it = hVar.f10810g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (br.l.a(((vj.b) next).f(), "SEND_MLVIS_LOGS")) {
                break;
            }
        }
        return next != null;
    }

    public static LayerDrawable p0(p.a2 a2Var, Context context, int i10) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable drawableC = a2Var.c(context, h.e.abc_star_black_48dp);
        Drawable drawableC2 = a2Var.c(context, h.e.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void s(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, s0 s0Var) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            s0Var.f(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(f14 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d6 = (f10 - f15) / 2.0d;
        double d10 = (f11 - f16) / 2.0d;
        double d11 = (dSin * d10) + (dCos * d6);
        double d12 = (dCos * d10) + ((-dSin) * d6);
        double d13 = fAbs * fAbs;
        double d14 = fAbs2 * fAbs2;
        double d15 = d11 * d11;
        double d16 = d12 * d12;
        double d17 = (d16 / d14) + (d15 / d13);
        if (d17 > 0.99999d) {
            double dSqrt = Math.sqrt(d17) * 1.00001d;
            fAbs = (float) (fAbs * dSqrt);
            fAbs2 = (float) (dSqrt * fAbs2);
            d13 = fAbs * fAbs;
            d14 = fAbs2 * fAbs2;
        }
        double d18 = z10 == z11 ? -1.0d : 1.0d;
        double d19 = d13 * d14;
        double d20 = d13 * d16;
        double d21 = d14 * d15;
        double d22 = ((d19 - d20) - d21) / (d20 + d21);
        if (d22 < 0.0d) {
            d22 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d22) * d18;
        double d23 = fAbs;
        double d24 = fAbs2;
        double d25 = ((d23 * d12) / d24) * dSqrt2;
        double d26 = dSqrt2 * (-((d24 * d11) / d23));
        double d27 = ((dCos * d25) - (dSin * d26)) + ((f10 + f15) / 2.0d);
        double d28 = (dCos * d26) + (dSin * d25) + ((f11 + f16) / 2.0d);
        double d29 = (d11 - d25) / d23;
        double d30 = (d12 - d26) / d24;
        double d31 = ((-d11) - d25) / d23;
        double d32 = ((-d12) - d26) / d24;
        double d33 = (d30 * d30) + (d29 * d29);
        double dAcos = Math.acos(d29 / Math.sqrt(d33)) * (d30 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d30 * d32) + (d29 * d31)) / Math.sqrt(((d32 * d32) + (d31 * d31)) * d33);
        double dAcos2 = ((d29 * d32) - (d30 * d31) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z11 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z11 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d34 = dAcos2 % 6.283185307179586d;
        double d35 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d34) * 2.0d) / 3.141592653589793d);
        double d36 = d34 / iCeil;
        double d37 = d36 / 2.0d;
        double dSin2 = (Math.sin(d37) * 1.3333333333333333d) / (Math.cos(d37) + 1.0d);
        int i10 = iCeil * 6;
        float[] fArr = new float[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d38 = d35;
            double d39 = (i11 * d36) + d38;
            double dCos2 = Math.cos(d39);
            double dSin3 = Math.sin(d39);
            int i13 = i11;
            int i14 = i12;
            fArr[i14] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i12 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d40 = d39 + d36;
            double dCos3 = Math.cos(d40);
            double dSin4 = Math.sin(d40);
            fArr[i14 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i14 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i14 + 4] = (float) dCos3;
            i12 = i14 + 6;
            fArr[i14 + 5] = (float) dSin4;
            i11 = i13 + 1;
            d35 = d38;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d27, (float) d28);
        matrix.mapPoints(fArr);
        fArr[i10 - 2] = f15;
        fArr[i10 - 1] = f16;
        for (int i15 = 0; i15 < i10; i15 += 6) {
            s0Var.d(fArr[i15], fArr[i15 + 1], fArr[i15 + 2], fArr[i15 + 3], fArr[i15 + 4], fArr[i15 + 5]);
        }
    }

    public static final vs.g u(r2 r2Var, qs.g gVar, Object obj) {
        vs.g gVarB = vs.h.b(obj, (ur.a0) r2Var.f10472g);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + gVar;
        br.l.e(str, "message");
        return new vs.j(str);
    }

    public static List u0(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new lf.f0(str, str2));
        }
        Collections.sort(arrayList, new androidx.media3.exoplayer.trackselection.d(14));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:20:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object v(h9.r2 r11, java.util.LinkedHashSet r12, ar.a r13, rq.c r14) {
        /*
            boolean r0 = r14 instanceof cq.g
            if (r0 == 0) goto L13
            r0 = r14
            cq.g r0 = (cq.g) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            cq.g r0 = new cq.g
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.E
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            long r11 = r0.D
            long r4 = r0.B
            java.util.Iterator r13 = r0.f6624y
            ar.a r2 = r0.f6623x
            h9.r2 r6 = r0.f6622r
            lf.t1.G(r14)
            r9 = r11
            r11 = r6
            r6 = r9
            r12 = r2
            goto L8d
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            lf.t1.G(r14)
            java.util.List r12 = mq.o.L0(r12)
            java.util.Iterator r12 = r12.iterator()
            r4 = 0
            r9 = r13
            r13 = r12
            r12 = r9
        L4d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L9b
            java.lang.Object r14 = r13.next()
            java.lang.Number r14 = (java.lang.Number) r14
            long r6 = r14.longValue()
            long r6 = r6 - r4
            java.lang.Object r14 = r11.f10471d
            no.b r14 = (no.b) r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Scheduling screen delay: "
            r2.<init>(r8)
            r2.append(r6)
            java.lang.String r8 = " ms"
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            sm.f r14 = (sm.f) r14
            r14.M(r2)
            r0.f6622r = r11
            r0.f6623x = r12
            r0.f6624y = r13
            r0.B = r4
            r0.D = r6
            r0.G = r3
            java.lang.Object r14 = wt.w.h(r6, r0)
            if (r14 != r1) goto L8d
            return r1
        L8d:
            java.lang.Object r14 = r11.f10471d
            no.b r14 = (no.b) r14
            sm.f r14 = (sm.f) r14
            r14.getClass()
            r12.c()
            long r4 = r4 + r6
            goto L4d
        L9b:
            lq.b0 r11 = lq.b0.f15562a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.v(h9.r2, java.util.LinkedHashSet, ar.a, rq.c):java.lang.Object");
    }

    public static void x(DataOutputStream dataOutputStream, String str, String str2) throws IOException {
        dataOutputStream.writeBytes("--*****\r\n");
        dataOutputStream.writeBytes(String.format(Locale.ENGLISH, "Content-Disposition: form-data; name=\"%s\"%s", Arrays.copyOf(new Object[]{str, "\r\n"}, 2)));
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes(str2);
        dataOutputStream.writeBytes("\r\n");
    }

    public static void y(DataOutputStream dataOutputStream, FileInputStream fileInputStream, String str, File file) throws IOException {
        br.l.e(fileInputStream, "fileInputStream");
        dataOutputStream.writeBytes("--*****\r\n");
        dataOutputStream.writeBytes(String.format(Locale.ENGLISH, "Content-Disposition: form-data; name=\"%s\";filename=\"%s\"%s", Arrays.copyOf(new Object[]{"uploadedfilelocation", str, "\r\n"}, 3)));
        dataOutputStream.writeBytes("\r\n");
        int iPow = (int) Math.pow(2.0d, 20.0d);
        int length = file.length() > 2147483647L ? Integer.MAX_VALUE : (int) file.length();
        byte[] bArr = new byte[length];
        int i10 = fileInputStream.read(bArr, 0, length);
        while (i10 > 0) {
            dataOutputStream.write(bArr, 0, i10);
            int iAvailable = fileInputStream.available();
            if (iAvailable > iPow) {
                iAvailable = iPow;
            }
            i10 = fileInputStream.read(bArr, 0, iAvailable);
        }
        dataOutputStream.writeBytes("\r\n");
    }

    public static lf.p0 z(lf.p0 p0Var, kf.e eVar, p.v2 v2Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        lf.o0 o0VarA = p0Var.a();
        String strE = ((kf.c) eVar.f14309d).e();
        if (strE != null) {
            o0VarA.f15382e = new lf.c1(strE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        d8.a aVar = (d8.a) v2Var.f20204x;
        if (map.isEmpty()) {
            kf.d dVar = (kf.d) ((AtomicMarkableReference) aVar.f7149c).getReference();
            synchronized (dVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(dVar.f14304a));
            }
        } else {
            kf.d dVar2 = (kf.d) ((AtomicMarkableReference) aVar.f7149c).getReference();
            synchronized (dVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar2.f14304a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = kf.d.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, kf.d.a(1024, (String) entry.getValue()));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                io.sentry.android.core.e0.q("FirebaseCrashlytics", "Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listU0 = u0(mapUnmodifiableMap2);
        kf.d dVar3 = (kf.d) ((AtomicMarkableReference) ((d8.a) v2Var.f20205y).f7149c).getReference();
        synchronized (dVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(dVar3.f14304a));
        }
        List listU02 = u0(mapUnmodifiableMap3);
        if (!listU0.isEmpty() || !listU02.isEmpty()) {
            lf.q0 q0Var = (lf.q0) p0Var.f15391c;
            o0VarA.f15380c = new lf.q0(q0Var.f15401a, listU0, listU02, q0Var.f15404d, q0Var.f15405e, q0Var.f15406f, q0Var.f15407g);
        }
        return o0VarA.a();
    }

    public boolean A0(qs.b bVar) {
        wr.b bVarL;
        if (bVar.f() != null && br.l.a(bVar.i().b(), "Container") && (bVarL = i4.l((p.l2) this.f10470a, bVar, (ps.f) this.f10475y)) != null) {
            LinkedHashSet linkedHashSet = nr.a.f18517a;
            Class cls = bVarL.f24588a;
            br.l.e(cls, "klass");
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            br.l.d(declaredAnnotations, "klass.declaredAnnotations");
            boolean z10 = false;
            for (Annotation annotation : declaredAnnotations) {
                br.l.d(annotation, "annotation");
                if (xr.d.a(ir.f0.D(ir.f0.z(annotation))).equals(as.z.f2264b)) {
                    z10 = true;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void B(hk.h hVar) {
        br.l.e(hVar, "task");
        ch.n.b("DiskTaskRepository", "addScheduledTask() called with: task = " + hVar.f10805b);
        synchronized (((qj.a) this.f10470a)) {
            V0(hVar);
            ((qj.a) this.f10470a).k((hi.a) this.f10473r, ((hi.a) this.f10473r).k((rj.f) ((xj.i) this.f10471d).g(hVar)));
        }
    }

    public boolean C0(hk.h hVar) {
        boolean z10;
        br.l.e(hVar, "task");
        hi.a aVar = (hi.a) this.f10473r;
        synchronized (((qj.a) this.f10470a)) {
            qj.a aVar2 = (qj.a) this.f10470a;
            mq.w wVar = mq.w.f16945a;
            ArrayList arrayListJ = aVar2.j(aVar, wVar, wVar);
            z10 = false;
            if (!arrayListJ.isEmpty()) {
                Iterator it = arrayListJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (br.l.a(((rj.f) it.next()).f21592b, hVar.f10805b)) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        return z10;
    }

    public Path D(n1 n1Var, f1.a aVar) {
        Path pathQ0;
        o1 o1VarN = n1Var.f10461a.N(((p2) this.f10472g).f10449a.f10359a0);
        if (o1VarN == null) {
            T("ClipPath reference '%s' not found", ((p2) this.f10472g).f10449a.f10359a0);
            return null;
        }
        a0 a0Var = (a0) o1VarN;
        ((Stack) this.f10473r).push((p2) this.f10472g);
        this.f10472g = b0(a0Var);
        Boolean bool = a0Var.f10301o;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(aVar.f8398b, aVar.f8399c);
            matrix.preScale(aVar.f8400d, aVar.f8401e);
        }
        Matrix matrix2 = a0Var.f10357n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (q1 q1Var : a0Var.f10401i) {
            if ((q1Var instanceof n1) && (pathQ0 = Q0((n1) q1Var, true)) != null) {
                path.op(pathQ0, Path.Op.UNION);
            }
        }
        if (((p2) this.f10472g).f10449a.f10359a0 != null) {
            if (a0Var.f10422h == null) {
                a0Var.f10422h = E(path);
            }
            Path pathD = D(a0Var, a0Var.f10422h);
            if (pathD != null) {
                path.op(pathD, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f10472g = (p2) ((Stack) this.f10473r).pop();
        return path;
    }

    public of.b D0(qs.b bVar, rr.o0 o0Var, List list) {
        br.l.e(list, "result");
        return new of.b(this, rr.w.f((ur.a0) this.f10472g, bVar, (js.e) this.f10473r), bVar, list, o0Var);
    }

    public of.b E0(qs.b bVar, wr.a aVar, List list) {
        br.l.e(list, "result");
        if (nr.a.f18517a.contains(bVar)) {
            return null;
        }
        return D0(bVar, aVar, list);
    }

    public float F(b2 b2Var) {
        q2 q2Var = new q2(this);
        S(b2Var, q2Var);
        return q2Var.f10463c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object F0(dt.w r9, ls.g0 r10, dt.a r11, ht.x r12, ar.n r13) {
        /*
            r8 = this;
            ns.b r0 = ns.e.A
            int r1 = r10.f15783r
            java.lang.Boolean r6 = r0.e(r1)
            boolean r7 = ps.i.d(r10)
            r4 = 1
            r5 = 1
            r2 = r8
            r3 = r9
            wr.b r9 = r2.v0(r3, r4, r5, r6, r7)
            r0 = 0
            if (r9 != 0) goto L30
            boolean r9 = r3 instanceof dt.u
            if (r9 == 0) goto L2f
            r9 = r3
            dt.u r9 = (dt.u) r9
            java.lang.Object r9 = r9.f7549d
            rr.o0 r9 = (rr.o0) r9
            boolean r1 = r9 instanceof js.r
            if (r1 == 0) goto L29
            js.r r9 = (js.r) r9
            goto L2a
        L29:
            r9 = r0
        L2a:
            if (r9 == 0) goto L2f
            wr.b r9 = r9.f13825a
            goto L30
        L2f:
            r9 = r0
        L30:
            if (r9 != 0) goto L33
            goto L67
        L33:
            ks.c r1 = r9.f24589b
            java.lang.Object r1 = r1.f14490d
            ps.f r1 = (ps.f) r1
            ps.f r4 = js.g.f13805e
            java.lang.String r5 = "version"
            br.l.e(r4, r5)
            int r5 = r4.f18520b
            int r6 = r4.f18521c
            int r4 = r4.f18522d
            boolean r1 = r1.a(r5, r6, r4)
            java.lang.Object r4 = r3.f7547b
            ns.f r4 = (ns.f) r4
            java.lang.Object r3 = r3.f7548c
            h7.h0 r3 = (h7.h0) r3
            js.s r10 = g0(r10, r4, r3, r11, r1)
            if (r10 != 0) goto L59
            goto L67
        L59:
            java.lang.Object r11 = r2.f10471d
            gt.e r11 = (gt.e) r11
            java.lang.Object r9 = r11.a(r9)
            java.lang.Object r9 = r13.w(r9, r10)
            if (r9 != 0) goto L68
        L67:
            return r0
        L68:
            boolean r10 = or.s.a(r12)
            if (r10 == 0) goto Lc0
            vs.g r9 = (vs.g) r9
            boolean r10 = r9 instanceof vs.d
            if (r10 == 0) goto L84
            vs.a0 r10 = new vs.a0
            vs.d r9 = (vs.d) r9
            java.lang.Object r9 = r9.f23957a
            java.lang.Number r9 = (java.lang.Number) r9
            byte r9 = r9.byteValue()
            r10.<init>(r9)
            return r10
        L84:
            boolean r10 = r9 instanceof vs.x
            if (r10 == 0) goto L98
            vs.a0 r10 = new vs.a0
            vs.x r9 = (vs.x) r9
            java.lang.Object r9 = r9.f23957a
            java.lang.Number r9 = (java.lang.Number) r9
            short r9 = r9.shortValue()
            r10.<init>(r9)
            return r10
        L98:
            boolean r10 = r9 instanceof vs.k
            if (r10 == 0) goto Lac
            vs.a0 r10 = new vs.a0
            vs.k r9 = (vs.k) r9
            java.lang.Object r9 = r9.f23957a
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10.<init>(r9)
            return r10
        Lac:
            boolean r10 = r9 instanceof vs.v
            if (r10 == 0) goto Lc0
            vs.a0 r10 = new vs.a0
            vs.v r9 = (vs.v) r9
            java.lang.Object r9 = r9.f23957a
            java.lang.Number r9 = (java.lang.Number) r9
            long r11 = r9.longValue()
            r10.<init>(r11)
            return r10
        Lc0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.F0(dt.w, ls.g0, dt.a, ht.x, ar.n):java.lang.Object");
    }

    public List G0(dt.w wVar, ls.g0 g0Var, js.c cVar) {
        h7.h0 h0Var = (h7.h0) wVar.f7548c;
        ns.f fVar = (ns.f) wVar.f7547b;
        Boolean boolE = ns.e.A.e(g0Var.f15783r);
        boolean zD = ps.i.d(g0Var);
        if (cVar == js.c.PROPERTY) {
            js.s sVarW = y3.w(g0Var, fVar, h0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (sVarW != null) {
                return a0(this, wVar, sVarW, boolE, zD, 8);
            }
        } else {
            js.s sVarW2 = y3.w(g0Var, fVar, h0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (sVarW2 != null) {
                if (tt.l.q0(sVarW2.f13826a, "$delegate", false) == (cVar == js.c.DELEGATE_FIELD)) {
                    return Z(wVar, sVarW2, true, true, boolE, zD);
                }
            }
        }
        return mq.w.f16945a;
    }

    public void H(n1 n1Var, f1.a aVar) {
        Path pathD;
        if (((p2) this.f10472g).f10449a.f10359a0 == null || (pathD = D(n1Var, aVar)) == null) {
            return;
        }
        ((Canvas) this.f10470a).clipPath(pathD);
    }

    public Path H0(z zVar) {
        l0 l0Var = zVar.f10519o;
        float fD = l0Var != null ? l0Var.d(this) : 0.0f;
        l0 l0Var2 = zVar.f10520p;
        float fE = l0Var2 != null ? l0Var2.e(this) : 0.0f;
        float fA = zVar.f10521q.a(this);
        float f10 = fD - fA;
        float f11 = fE - fA;
        float f12 = fD + fA;
        float f13 = fE + fA;
        if (zVar.f10422h == null) {
            float f14 = 2.0f * fA;
            zVar.f10422h = new f1.a(f10, f11, f14, f14);
        }
        float f15 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f11);
        float f16 = fD + f15;
        float f17 = fE - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fE);
        float f18 = fE + f15;
        path.cubicTo(f12, f18, f16, f13, fD, f13);
        float f19 = fD - f15;
        path.cubicTo(f19, f13, f10, f18, f10, fE);
        path.cubicTo(f10, f17, f19, f11, fD, f11);
        path.close();
        return path;
    }

    public void I(n1 n1Var) {
        r1 r1Var = ((p2) this.f10472g).f10449a.f10362d;
        if (r1Var instanceof q0) {
            O(true, n1Var.f10422h, (q0) r1Var);
        }
        r1 r1Var2 = ((p2) this.f10472g).f10449a.f10371x;
        if (r1Var2 instanceof q0) {
            O(false, n1Var.f10422h, (q0) r1Var2);
        }
    }

    public Path I0(e0 e0Var) {
        l0 l0Var = e0Var.f10330o;
        float fD = l0Var != null ? l0Var.d(this) : 0.0f;
        l0 l0Var2 = e0Var.f10331p;
        float fE = l0Var2 != null ? l0Var2.e(this) : 0.0f;
        float fD2 = e0Var.f10332q.d(this);
        float fE2 = e0Var.f10333r.e(this);
        float f10 = fD - fD2;
        float f11 = fE - fE2;
        float f12 = fD + fD2;
        float f13 = fE + fE2;
        if (e0Var.f10422h == null) {
            e0Var.f10422h = new f1.a(f10, f11, fD2 * 2.0f, 2.0f * fE2);
        }
        float f14 = fD2 * 0.5522848f;
        float f15 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f11);
        float f16 = fD + f14;
        float f17 = fE - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fE);
        float f18 = fE + f15;
        path.cubicTo(f12, f18, f16, f13, fD, f13);
        float f19 = fD - f14;
        path.cubicTo(f19, f13, f10, f18, f10, fE);
        path.cubicTo(f10, f17, f19, f11, fD, f11);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Path K0(h9.w0 r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.K0(h9.w0):android.graphics.Path");
    }

    public f1.a L0(l0 l0Var, l0 l0Var2, l0 l0Var3, l0 l0Var4) {
        float fD = l0Var != null ? l0Var.d(this) : 0.0f;
        float fE = l0Var2 != null ? l0Var2.e(this) : 0.0f;
        p2 p2Var = (p2) this.f10472g;
        f1.a aVar = p2Var.f10455g;
        if (aVar == null) {
            aVar = p2Var.f10454f;
        }
        return new f1.a(fD, fE, l0Var3 != null ? l0Var3.d(this) : aVar.f8400d, l0Var4 != null ? l0Var4.e(this) : aVar.f8401e);
    }

    public JSONObject M0(CellIdentity cellIdentity) {
        return cellIdentity instanceof CellIdentityLte ? ((yj.a) this.f10470a).d((CellIdentityLte) cellIdentity) : cellIdentity instanceof CellIdentityGsm ? ((yj.a) this.f10471d).c((CellIdentityGsm) cellIdentity) : cellIdentity instanceof CellIdentityWcdma ? ((yj.a) this.f10472g).g((CellIdentityWcdma) cellIdentity) : fh.b.w(cellIdentity) ? ((yj.a) this.f10473r).f(fh.b.i(cellIdentity)) : cellIdentity instanceof CellIdentityCdma ? ((yj.a) this.f10474x).b((CellIdentityCdma) cellIdentity) : a2.b.z(cellIdentity) ? ((yj.a) this.f10475y).e(a2.b.h(cellIdentity)) : new JSONObject();
    }

    public void N0(String str) {
        ch.n.b("LegacyDataMigrator", "migrateField() called with: fieldKey = ".concat(str));
        String strN = ((om.f) this.f10472g).n(str, null);
        if (strN != null) {
            ((om.f) this.f10473r).u(str, strN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void O(boolean z10, f1.a aVar, q0 q0Var) {
        float f10;
        float fB;
        float f11;
        float f12;
        float fB2;
        float f13;
        float fB3;
        float f14;
        o1 o1VarN = ((bm.d) this.f10471d).N(q0Var.f10459a);
        if (o1VarN == null) {
            T("%s reference '%s' not found", z10 ? "Fill" : "Stroke", q0Var.f10459a);
            r1 r1Var = q0Var.f10460d;
            if (r1Var != null) {
                g1((p2) this.f10472g, z10, r1Var);
                return;
            } else if (z10) {
                ((p2) this.f10472g).f10450b = false;
                return;
            } else {
                ((p2) this.f10472g).f10451c = false;
                return;
            }
        }
        boolean z11 = o1VarN instanceof p1;
        b0 b0Var = b0.f10306d;
        if (z11) {
            p1 p1Var = (p1) o1VarN;
            String str = p1Var.f10337l;
            if (str != null) {
                W(p1Var, str);
            }
            Boolean bool = p1Var.f10336i;
            byte b2 = bool != null && bool.booleanValue();
            p2 p2Var = (p2) this.f10472g;
            Paint paint = z10 ? p2Var.f10452d : p2Var.f10453e;
            if (b2 == true) {
                p2 p2Var2 = (p2) this.f10472g;
                f1.a aVar2 = p2Var2.f10455g;
                if (aVar2 == null) {
                    aVar2 = p2Var2.f10454f;
                }
                l0 l0Var = p1Var.f10445m;
                float fD = l0Var != null ? l0Var.d(this) : 0.0f;
                l0 l0Var2 = p1Var.f10446n;
                fB2 = l0Var2 != null ? l0Var2.e(this) : 0.0f;
                f12 = 256.0f;
                l0 l0Var3 = p1Var.f10447o;
                float fD2 = l0Var3 != null ? l0Var3.d(this) : aVar2.f8400d;
                l0 l0Var4 = p1Var.f10448p;
                f14 = fD2;
                f13 = fD;
                fB3 = l0Var4 != null ? l0Var4.e(this) : 0.0f;
            } else {
                f12 = 256.0f;
                l0 l0Var5 = p1Var.f10445m;
                float fB4 = l0Var5 != null ? l0Var5.b(this, 1.0f) : 0.0f;
                l0 l0Var6 = p1Var.f10446n;
                fB2 = l0Var6 != null ? l0Var6.b(this, 1.0f) : 0.0f;
                l0 l0Var7 = p1Var.f10447o;
                float fB5 = l0Var7 != null ? l0Var7.b(this, 1.0f) : 1.0f;
                l0 l0Var8 = p1Var.f10448p;
                f13 = fB4;
                fB3 = l0Var8 != null ? l0Var8.b(this, 1.0f) : 0.0f;
                f14 = fB5;
            }
            float f15 = fB2;
            l1();
            this.f10472g = b0(p1Var);
            Matrix matrix = new Matrix();
            if (b2 == false) {
                matrix.preTranslate(aVar.f8398b, aVar.f8399c);
                matrix.preScale(aVar.f8400d, aVar.f8401e);
            }
            Matrix matrix2 = p1Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = p1Var.f10335h.size();
            if (size == 0) {
                k1();
                if (z10) {
                    ((p2) this.f10472g).f10450b = false;
                    return;
                } else {
                    ((p2) this.f10472g).f10451c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = p1Var.f10335h.iterator();
            int i10 = 0;
            float f16 = -1.0f;
            while (it.hasNext()) {
                y0 y0Var = (y0) ((q1) it.next());
                Float f17 = y0Var.f10516h;
                float fFloatValue = f17 != null ? f17.floatValue() : 0.0f;
                if (i10 == 0 || fFloatValue >= f16) {
                    fArr[i10] = fFloatValue;
                    f16 = fFloatValue;
                } else {
                    fArr[i10] = f16;
                }
                l1();
                u1((p2) this.f10472g, y0Var);
                i1 i1Var = ((p2) this.f10472g).f10449a;
                b0 b0Var2 = (b0) i1Var.Y;
                if (b0Var2 == null) {
                    b0Var2 = b0Var;
                }
                iArr[i10] = K(b0Var2.f10308a, i1Var.Z.floatValue());
                i10++;
                k1();
            }
            if ((f13 == f14 && f15 == fB3) || size == 1) {
                k1();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            g0 g0Var = p1Var.k;
            if (g0Var != null) {
                if (g0Var == g0.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (g0Var == g0.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            k1();
            LinearGradient linearGradient = new LinearGradient(f13, f15, f14, fB3, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((p2) this.f10472g).f10449a.f10370r.floatValue() * f12);
            paint.setAlpha(iFloatValue >= 0 ? iFloatValue > 255 ? 255 : iFloatValue : 0);
            return;
        }
        if (!(o1VarN instanceof t1)) {
            if (o1VarN instanceof x0) {
                x0 x0Var = (x0) o1VarN;
                if (z10) {
                    if (B0(x0Var.f10435e, 2147483648L)) {
                        p2 p2Var3 = (p2) this.f10472g;
                        i1 i1Var2 = p2Var3.f10449a;
                        r1 r1Var2 = x0Var.f10435e.f10363d0;
                        i1Var2.f10362d = r1Var2;
                        p2Var3.f10450b = r1Var2 != null;
                    }
                    if (B0(x0Var.f10435e, 4294967296L)) {
                        ((p2) this.f10472g).f10449a.f10370r = x0Var.f10435e.f10364e0;
                    }
                    if (B0(x0Var.f10435e, 6442450944L)) {
                        p2 p2Var4 = (p2) this.f10472g;
                        g1(p2Var4, z10, p2Var4.f10449a.f10362d);
                        return;
                    }
                    return;
                }
                if (B0(x0Var.f10435e, 2147483648L)) {
                    p2 p2Var5 = (p2) this.f10472g;
                    i1 i1Var3 = p2Var5.f10449a;
                    r1 r1Var3 = x0Var.f10435e.f10363d0;
                    i1Var3.f10371x = r1Var3;
                    p2Var5.f10451c = r1Var3 != null;
                }
                if (B0(x0Var.f10435e, 4294967296L)) {
                    ((p2) this.f10472g).f10449a.f10372y = x0Var.f10435e.f10364e0;
                }
                if (B0(x0Var.f10435e, 6442450944L)) {
                    p2 p2Var6 = (p2) this.f10472g;
                    g1(p2Var6, z10, p2Var6.f10449a.f10371x);
                    return;
                }
                return;
            }
            return;
        }
        t1 t1Var = (t1) o1VarN;
        String str2 = t1Var.f10337l;
        if (str2 != null) {
            W(t1Var, str2);
        }
        Boolean bool2 = t1Var.f10336i;
        byte b10 = bool2 != null && bool2.booleanValue();
        p2 p2Var7 = (p2) this.f10472g;
        Paint paint2 = z10 ? p2Var7.f10452d : p2Var7.f10453e;
        if (b10 == true) {
            l0 l0Var9 = new l0(50.0f, f2.percent);
            l0 l0Var10 = t1Var.f10487m;
            float fD3 = l0Var10 != null ? l0Var10.d(this) : l0Var9.d(this);
            l0 l0Var11 = t1Var.f10488n;
            float fE = l0Var11 != null ? l0Var11.e(this) : l0Var9.e(this);
            l0 l0Var12 = t1Var.f10489o;
            fB = l0Var12 != null ? l0Var12.a(this) : l0Var9.a(this);
            f10 = fD3;
            f11 = fE;
        } else {
            l0 l0Var13 = t1Var.f10487m;
            float fB6 = l0Var13 != null ? l0Var13.b(this, 1.0f) : 0.5f;
            l0 l0Var14 = t1Var.f10488n;
            float fB7 = l0Var14 != null ? l0Var14.b(this, 1.0f) : 0.5f;
            l0 l0Var15 = t1Var.f10489o;
            f10 = fB6;
            fB = l0Var15 != null ? l0Var15.b(this, 1.0f) : 0.5f;
            f11 = fB7;
        }
        l1();
        this.f10472g = b0(t1Var);
        Matrix matrix3 = new Matrix();
        if (b10 == false) {
            matrix3.preTranslate(aVar.f8398b, aVar.f8399c);
            matrix3.preScale(aVar.f8400d, aVar.f8401e);
        }
        Matrix matrix4 = t1Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = t1Var.f10335h.size();
        if (size2 == 0) {
            k1();
            if (z10) {
                ((p2) this.f10472g).f10450b = false;
                return;
            } else {
                ((p2) this.f10472g).f10451c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = t1Var.f10335h.iterator();
        int i11 = 0;
        float f18 = -1.0f;
        while (it2.hasNext()) {
            y0 y0Var2 = (y0) ((q1) it2.next());
            Float f19 = y0Var2.f10516h;
            float fFloatValue2 = f19 != null ? f19.floatValue() : 0.0f;
            if (i11 == 0 || fFloatValue2 >= f18) {
                fArr2[i11] = fFloatValue2;
                f18 = fFloatValue2;
            } else {
                fArr2[i11] = f18;
            }
            l1();
            u1((p2) this.f10472g, y0Var2);
            i1 i1Var4 = ((p2) this.f10472g).f10449a;
            b0 b0Var3 = (b0) i1Var4.Y;
            if (b0Var3 == null) {
                b0Var3 = b0Var;
            }
            iArr2[i11] = K(b0Var3.f10308a, i1Var4.Z.floatValue());
            i11++;
            k1();
        }
        if (fB == 0.0f || size2 == 1) {
            k1();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        g0 g0Var2 = t1Var.k;
        if (g0Var2 != null) {
            if (g0Var2 == g0.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (g0Var2 == g0.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        k1();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fB, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((p2) this.f10472g).f10449a.f10370r.floatValue() * 256.0f);
        paint2.setAlpha(iFloatValue2 >= 0 ? iFloatValue2 > 255 ? 255 : iFloatValue2 : 0);
    }

    public void O0() {
        N0("sdk_secret");
        N0("DEVICE_ID_TIME");
        N0("gdpr_consent_given");
        N0("last_public_ip");
        N0("last_public_ip_time");
        N0("last_public_ips");
        N0("key_last_location");
        N0("sdk_config_json-back");
        N0("last_intensive_task_run_time");
        N0("last_wifi_bssid");
        N0("last_wifi_bssid_timestamp");
        N0("device_connection_list");
        N0("back");
    }

    public boolean P() {
        Boolean bool = ((p2) this.f10472g).f10449a.W;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void P0() {
        ArrayList arrayList;
        io.sentry.k kVar = (io.sentry.k) this.f10470a;
        synchronized (((fi.h) kVar.f12397d)) {
            fi.h hVar = (fi.h) kVar.f12397d;
            hi.a aVar = (hi.a) kVar.f12399r;
            mq.w wVar = mq.w.f16945a;
            ArrayList arrayListJ = hVar.j(aVar, wVar, wVar);
            arrayList = new ArrayList(mq.p.a0(arrayListJ, 10));
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                arrayList.add((hk.h) ((xj.i) kVar.f12398g).a((rj.f) it.next()));
            }
        }
        ch.n.b("LegacyDataMigrator", "Legacy Task list: " + arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((r2) this.f10471d).B((hk.h) it2.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q(h9.n1 r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.Q(h9.n1, android.graphics.Path):void");
    }

    public Path Q0(n1 n1Var, boolean z10) {
        Path pathK0;
        Path pathD;
        ((Stack) this.f10473r).push((p2) this.f10472g);
        p2 p2Var = new p2((p2) this.f10472g);
        this.f10472g = p2Var;
        u1(p2Var, n1Var);
        if (!P() || !y1()) {
            this.f10472g = (p2) ((Stack) this.f10473r).pop();
            return null;
        }
        if (n1Var instanceof g2) {
            if (!z10) {
                T("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            g2 g2Var = (g2) n1Var;
            o1 o1VarN = n1Var.f10461a.N(g2Var.f10343o);
            if (o1VarN == null) {
                T("Use reference '%s' not found", g2Var.f10343o);
                this.f10472g = (p2) ((Stack) this.f10473r).pop();
                return null;
            }
            if (!(o1VarN instanceof n1)) {
                this.f10472g = (p2) ((Stack) this.f10473r).pop();
                return null;
            }
            pathK0 = Q0((n1) o1VarN, false);
            if (pathK0 != null) {
                if (g2Var.f10422h == null) {
                    g2Var.f10422h = E(pathK0);
                }
                Matrix matrix = g2Var.f10357n;
                if (matrix != null) {
                    pathK0.transform(matrix);
                }
                if (((p2) this.f10472g).f10449a.f10359a0 != null && (pathD = D(n1Var, n1Var.f10422h)) != null) {
                    pathK0.op(pathD, Path.Op.INTERSECT);
                }
                this.f10472g = (p2) ((Stack) this.f10473r).pop();
                return pathK0;
            }
            return null;
        }
        if (n1Var instanceof h0) {
            h0 h0Var = (h0) n1Var;
            if (n1Var instanceof r0) {
                l2 l2Var = new l2(((r0) n1Var).f10469o);
                f1.a aVar = n1Var.f10422h;
                Path path = l2Var.f10404a;
                if (aVar == null) {
                    n1Var.f10422h = E(path);
                }
                pathK0 = path;
            } else {
                pathK0 = n1Var instanceof w0 ? K0((w0) n1Var) : n1Var instanceof z ? H0((z) n1Var) : n1Var instanceof e0 ? I0((e0) n1Var) : n1Var instanceof u0 ? J0((u0) n1Var) : null;
            }
            if (pathK0 != null) {
                if (h0Var.f10422h == null) {
                    h0Var.f10422h = E(pathK0);
                }
                Matrix matrix2 = h0Var.f10351n;
                if (matrix2 != null) {
                    pathK0.transform(matrix2);
                }
                pathK0.setFillType(h0());
            }
            return null;
        }
        if (!(n1Var instanceof z1)) {
            T("Invalid %s element found in clipPath definition", n1Var.o());
            return null;
        }
        z1 z1Var = (z1) n1Var;
        ArrayList arrayList = z1Var.f10326n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((l0) z1Var.f10326n.get(0)).d(this);
        ArrayList arrayList2 = z1Var.f10327o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((l0) z1Var.f10327o.get(0)).e(this);
        ArrayList arrayList3 = z1Var.f10328p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((l0) z1Var.f10328p.get(0)).d(this);
        ArrayList arrayList4 = z1Var.f10329q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((l0) z1Var.f10329q.get(0)).e(this);
        }
        if (((p2) this.f10472g).f10449a.Q != e1.Start) {
            float F = F(z1Var);
            if (((p2) this.f10472g).f10449a.Q == e1.Middle) {
                F /= 2.0f;
            }
            fD -= F;
        }
        if (z1Var.f10422h == null) {
            o2 o2Var = new o2(this, fD, fE2);
            S(z1Var, o2Var);
            RectF rectF = (RectF) o2Var.f10442g;
            z1Var.f10422h = new f1.a(rectF.left, rectF.top, rectF.width(), ((RectF) o2Var.f10442g).height());
        }
        Path path2 = new Path();
        S(z1Var, new o2(this, fD + fD2, fE2 + fE, path2));
        Matrix matrix3 = z1Var.f10522r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        path2.setFillType(h0());
        pathK0 = path2;
        if (((p2) this.f10472g).f10449a.f10359a0 != null) {
            pathK0.op(pathD, Path.Op.INTERSECT);
        }
        this.f10472g = (p2) ((Stack) this.f10473r).pop();
        return pathK0;
    }

    public void R(Path path) {
        Canvas canvas = (Canvas) this.f10470a;
        p2 p2Var = (p2) this.f10472g;
        if (p2Var.f10449a.f10368h0 != h1.NonScalingStroke) {
            canvas.drawPath(path, p2Var.f10453e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((p2) this.f10472g).f10453e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((p2) this.f10472g).f10453e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void R0(f1.a aVar) {
        Canvas canvas = (Canvas) this.f10470a;
        if (((p2) this.f10472g).f10449a.f10361c0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            o0 o0Var = (o0) ((bm.d) this.f10471d).N(((p2) this.f10472g).f10449a.f10361c0);
            b1(o0Var, aVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            b1(o0Var, aVar);
            canvas.restore();
            canvas.restore();
        }
        k1();
    }

    public void S(b2 b2Var, se.b bVar) {
        float f10;
        float fE;
        float fD;
        e1 e1VarE0;
        if (P()) {
            Iterator it = b2Var.f10401i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                q1 q1Var = (q1) it.next();
                if (q1Var instanceof e2) {
                    bVar.N(p1(((e2) q1Var).f10334c, z10, !it.hasNext()));
                } else if (bVar.s((b2) q1Var)) {
                    if (q1Var instanceof c2) {
                        l1();
                        c2 c2Var = (c2) q1Var;
                        u1((p2) this.f10472g, c2Var);
                        if (P() && y1()) {
                            o1 o1VarN = c2Var.f10461a.N(c2Var.f10314n);
                            if (o1VarN == null) {
                                T("TextPath reference '%s' not found", c2Var.f10314n);
                            } else {
                                r0 r0Var = (r0) o1VarN;
                                l2 l2Var = new l2(r0Var.f10469o);
                                Matrix matrix = r0Var.f10351n;
                                Path path = l2Var.f10404a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                l0 l0Var = c2Var.f10315o;
                                fE = l0Var != null ? l0Var.b(this, pathMeasure.getLength()) : 0.0f;
                                e1 e1VarE02 = e0();
                                if (e1VarE02 != e1.Start) {
                                    float F = F(c2Var);
                                    if (e1VarE02 == e1.Middle) {
                                        F /= 2.0f;
                                    }
                                    fE -= F;
                                }
                                I(c2Var.f10316p);
                                boolean zS0 = S0();
                                S(c2Var, new m2(this, path, fE));
                                if (zS0) {
                                    R0(c2Var.f10422h);
                                }
                            }
                        }
                        k1();
                    } else if (q1Var instanceof y1) {
                        l1();
                        y1 y1Var = (y1) q1Var;
                        u1((p2) this.f10472g, y1Var);
                        if (P()) {
                            ArrayList arrayList = y1Var.f10326n;
                            boolean z11 = arrayList != null && arrayList.size() > 0;
                            boolean z12 = bVar instanceof n2;
                            if (z12) {
                                float fD2 = !z11 ? ((n2) bVar).f10423c : ((l0) y1Var.f10326n.get(0)).d(this);
                                ArrayList arrayList2 = y1Var.f10327o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((n2) bVar).f10424d : ((l0) y1Var.f10327o.get(0)).e(this);
                                ArrayList arrayList3 = y1Var.f10328p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((l0) y1Var.f10328p.get(0)).d(this);
                                ArrayList arrayList4 = y1Var.f10329q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE = ((l0) y1Var.f10329q.get(0)).e(this);
                                }
                                float f11 = fD2;
                                f10 = fE;
                                fE = f11;
                            } else {
                                f10 = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z11 && (e1VarE0 = e0()) != e1.Start) {
                                float F2 = F(y1Var);
                                if (e1VarE0 == e1.Middle) {
                                    F2 /= 2.0f;
                                }
                                fE -= F2;
                            }
                            I(y1Var.f10517r);
                            if (z12) {
                                n2 n2Var = (n2) bVar;
                                n2Var.f10423c = fE + fD;
                                n2Var.f10424d = fE + f10;
                            }
                            boolean zS02 = S0();
                            S(y1Var, bVar);
                            if (zS02) {
                                R0(y1Var.f10422h);
                            }
                        }
                        k1();
                    } else if (q1Var instanceof x1) {
                        l1();
                        x1 x1Var = (x1) q1Var;
                        u1((p2) this.f10472g, x1Var);
                        if (P()) {
                            I(x1Var.f10513o);
                            o1 o1VarN2 = q1Var.f10461a.N(x1Var.f10512n);
                            if (o1VarN2 == null || !(o1VarN2 instanceof b2)) {
                                T("Tref reference '%s' not found", x1Var.f10512n);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                U((b2) o1VarN2, sb2);
                                if (sb2.length() > 0) {
                                    bVar.N(sb2.toString());
                                }
                            }
                        }
                        k1();
                    }
                }
                z10 = false;
            }
        }
    }

    public boolean S0() {
        o1 o1VarN;
        int i10 = 0;
        if (((p2) this.f10472g).f10449a.I.floatValue() >= 1.0f && ((p2) this.f10472g).f10449a.f10361c0 == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.f10470a;
        int iFloatValue = (int) (((p2) this.f10472g).f10449a.I.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i10 = 255;
            if (iFloatValue <= 255) {
                i10 = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i10, 31);
        ((Stack) this.f10473r).push((p2) this.f10472g);
        p2 p2Var = new p2((p2) this.f10472g);
        this.f10472g = p2Var;
        String str = p2Var.f10449a.f10361c0;
        if (str != null && ((o1VarN = ((bm.d) this.f10471d).N(str)) == null || !(o1VarN instanceof o0))) {
            T("Mask reference '%s' not found", ((p2) this.f10472g).f10449a.f10361c0);
            ((p2) this.f10472g).f10449a.f10361c0 = null;
        }
        return true;
    }

    public boolean T0(hk.h hVar) {
        boolean zE0;
        br.l.e(hVar, "task");
        ch.n.b("DiskTaskRepository", "removeCurrentlyRunningTask() called with: task = " + hVar.f10805b);
        if (o1(hVar)) {
            ((AtomicBoolean) this.f10475y).set(false);
        }
        p pVar = (p) this.f10472g;
        synchronized (pVar.f10444b) {
            zE0 = mq.t.e0(pVar.f10444b, new mk.f(2, hVar));
        }
        return zE0;
    }

    public void U(b2 b2Var, StringBuilder sb2) {
        Iterator it = b2Var.f10401i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            q1 q1Var = (q1) it.next();
            if (q1Var instanceof b2) {
                U((b2) q1Var, sb2);
            } else if (q1Var instanceof e2) {
                sb2.append(p1(((e2) q1Var).f10334c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public void U0(long j) {
        synchronized (((HashMap) this.f10470a)) {
        }
        synchronized (((HashMap) this.f10471d)) {
        }
        synchronized (((HashMap) this.f10472g)) {
        }
        synchronized (((HashMap) this.f10473r)) {
        }
        synchronized (((HashMap) this.f10474x)) {
        }
        synchronized (((HashMap) this.f10475y)) {
        }
    }

    public dd.r V(dd.r rVar) {
        return rVar.e(new e7.d(0), new io.sentry.android.core.u0(this));
    }

    public void V0(hk.h hVar) {
        br.l.e(hVar, "task");
        ch.n.b("DiskTaskRepository", "removeScheduledTask() called with: task = " + hVar.f10805b);
        synchronized (((qj.a) this.f10470a)) {
            ((qj.a) this.f10470a).o((hi.a) this.f10473r, "name", e5.H(hVar.f10805b));
        }
    }

    public void W0(j1 j1Var, f1.a aVar, f1.a aVar2, x xVar) {
        Canvas canvas = (Canvas) this.f10470a;
        if (aVar.f8400d == 0.0f || aVar.f8401e == 0.0f) {
            return;
        }
        if (xVar == null && (xVar = j1Var.f10476n) == null) {
            xVar = x.f10509d;
        }
        u1((p2) this.f10472g, j1Var);
        if (P()) {
            p2 p2Var = (p2) this.f10472g;
            p2Var.f10454f = aVar;
            if (!p2Var.f10449a.R.booleanValue()) {
                f1.a aVar3 = ((p2) this.f10472g).f10454f;
                e1(aVar3.f8398b, aVar3.f8399c, aVar3.f8400d, aVar3.f8401e);
            }
            H(j1Var, ((p2) this.f10472g).f10454f);
            if (aVar2 != null) {
                canvas.concat(G(((p2) this.f10472g).f10454f, aVar2, xVar));
                ((p2) this.f10472g).f10455g = j1Var.f10498o;
            } else {
                f1.a aVar4 = ((p2) this.f10472g).f10454f;
                canvas.translate(aVar4.f8398b, aVar4.f8399c);
            }
            boolean zS0 = S0();
            x1();
            Y0(j1Var, true);
            if (zS0) {
                R0(j1Var.f10422h);
            }
            r1(j1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void X0(q1 q1Var) {
        l0 l0Var;
        String str;
        int iIndexOf;
        Set setA;
        l0 l0Var2;
        Boolean bool;
        if (q1Var instanceof p0) {
            return;
        }
        l1();
        if ((q1Var instanceof o1) && (bool = ((o1) q1Var).f10434d) != null) {
            ((p2) this.f10472g).f10456h = bool.booleanValue();
        }
        if (q1Var instanceof j1) {
            j1 j1Var = (j1) q1Var;
            W0(j1Var, L0(j1Var.f10377p, j1Var.f10378q, j1Var.f10379r, j1Var.f10380s), j1Var.f10498o, j1Var.f10476n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            if (q1Var instanceof g2) {
                g2 g2Var = (g2) q1Var;
                Canvas canvas = (Canvas) this.f10470a;
                l0 l0Var3 = g2Var.f10346r;
                if ((l0Var3 == null || !l0Var3.g()) && ((l0Var2 = g2Var.f10347s) == null || !l0Var2.g())) {
                    u1((p2) this.f10472g, g2Var);
                    if (P()) {
                        q1 q1VarN = g2Var.f10461a.N(g2Var.f10343o);
                        if (q1VarN == null) {
                            T("Use reference '%s' not found", g2Var.f10343o);
                        } else {
                            Matrix matrix = g2Var.f10357n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            l0 l0Var4 = g2Var.f10344p;
                            float fD = l0Var4 != null ? l0Var4.d(this) : 0.0f;
                            l0 l0Var5 = g2Var.f10345q;
                            canvas.translate(fD, l0Var5 != null ? l0Var5.e(this) : 0.0f);
                            H(g2Var, g2Var.f10422h);
                            boolean zS0 = S0();
                            ((Stack) this.f10474x).push(g2Var);
                            ((Stack) this.f10475y).push(((Canvas) this.f10470a).getMatrix());
                            if (q1VarN instanceof j1) {
                                j1 j1Var2 = (j1) q1VarN;
                                f1.a aVarL0 = L0(null, null, g2Var.f10346r, g2Var.f10347s);
                                l1();
                                W0(j1Var2, aVarL0, j1Var2.f10498o, j1Var2.f10476n);
                                k1();
                            } else if (q1VarN instanceof w1) {
                                l0 l0Var6 = g2Var.f10346r;
                                if (l0Var6 == null) {
                                    l0Var6 = new l0(100.0f, f2.percent);
                                }
                                l0 l0Var7 = g2Var.f10347s;
                                if (l0Var7 == null) {
                                    l0Var7 = new l0(100.0f, f2.percent);
                                }
                                f1.a aVarL02 = L0(null, null, l0Var6, l0Var7);
                                l1();
                                w1 w1Var = (w1) q1VarN;
                                if (aVarL02.f8400d != 0.0f && aVarL02.f8401e != 0.0f) {
                                    x xVar = w1Var.f10476n;
                                    if (xVar == null) {
                                        xVar = x.f10509d;
                                    }
                                    u1((p2) this.f10472g, w1Var);
                                    p2 p2Var = (p2) this.f10472g;
                                    p2Var.f10454f = aVarL02;
                                    if (!p2Var.f10449a.R.booleanValue()) {
                                        f1.a aVar = ((p2) this.f10472g).f10454f;
                                        e1(aVar.f8398b, aVar.f8399c, aVar.f8400d, aVar.f8401e);
                                    }
                                    f1.a aVar2 = w1Var.f10498o;
                                    if (aVar2 != null) {
                                        canvas.concat(G(((p2) this.f10472g).f10454f, aVar2, xVar));
                                        ((p2) this.f10472g).f10455g = w1Var.f10498o;
                                    } else {
                                        f1.a aVar3 = ((p2) this.f10472g).f10454f;
                                        canvas.translate(aVar3.f8398b, aVar3.f8399c);
                                    }
                                    boolean zS02 = S0();
                                    Y0(w1Var, true);
                                    if (zS02) {
                                        R0(w1Var.f10422h);
                                    }
                                    r1(w1Var);
                                }
                                k1();
                            } else {
                                X0(q1VarN);
                            }
                            ((Stack) this.f10474x).pop();
                            ((Stack) this.f10475y).pop();
                            if (zS0) {
                                R0(g2Var.f10422h);
                            }
                            r1(g2Var);
                        }
                    }
                }
            } else if (q1Var instanceof v1) {
                v1 v1Var = (v1) q1Var;
                u1((p2) this.f10472g, v1Var);
                if (P()) {
                    Matrix matrix2 = v1Var.f10357n;
                    if (matrix2 != null) {
                        ((Canvas) this.f10470a).concat(matrix2);
                    }
                    H(v1Var, v1Var.f10422h);
                    boolean zS03 = S0();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = v1Var.f10401i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        q1 q1Var2 = (q1) it.next();
                        if (q1Var2 instanceof k1) {
                            k1 k1Var = (k1) q1Var2;
                            if (k1Var.b() == null && ((setA = k1Var.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                                Set setE = k1Var.e();
                                if (setE != null) {
                                    if (B == null) {
                                        synchronized (r2.class) {
                                            HashSet hashSet = new HashSet();
                                            B = hashSet;
                                            hashSet.add("Structure");
                                            B.add("BasicStructure");
                                            B.add("ConditionalProcessing");
                                            B.add("Image");
                                            B.add("Style");
                                            B.add("ViewportAttribute");
                                            B.add("Shape");
                                            B.add("BasicText");
                                            B.add("PaintAttribute");
                                            B.add("BasicPaintAttribute");
                                            B.add("OpacityAttribute");
                                            B.add("BasicGraphicsAttribute");
                                            B.add("Marker");
                                            B.add("Gradient");
                                            B.add("Pattern");
                                            B.add("Clip");
                                            B.add("BasicClip");
                                            B.add("Mask");
                                            B.add("View");
                                        }
                                    }
                                    if (setE.isEmpty() || !B.containsAll(setE)) {
                                    }
                                }
                                Set setL = k1Var.l();
                                if (setL == null) {
                                    Set setN = k1Var.n();
                                    if (setN == null) {
                                        X0(q1Var2);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zS03) {
                        R0(v1Var.f10422h);
                    }
                    r1(v1Var);
                }
            } else if (q1Var instanceof i0) {
                i0 i0Var = (i0) q1Var;
                u1((p2) this.f10472g, i0Var);
                if (P()) {
                    Matrix matrix3 = i0Var.f10357n;
                    if (matrix3 != null) {
                        ((Canvas) this.f10470a).concat(matrix3);
                    }
                    H(i0Var, i0Var.f10422h);
                    boolean zS04 = S0();
                    Y0(i0Var, true);
                    if (zS04) {
                        R0(i0Var.f10422h);
                    }
                    r1(i0Var);
                }
            } else {
                if (q1Var instanceof k0) {
                    k0 k0Var = (k0) q1Var;
                    Canvas canvas2 = (Canvas) this.f10470a;
                    l0 l0Var8 = k0Var.f10390r;
                    if (l0Var8 != null && !l0Var8.g() && (l0Var = k0Var.f10391s) != null && !l0Var.g() && (str = k0Var.f10387o) != null) {
                        x xVar2 = k0Var.f10476n;
                        if (xVar2 == null) {
                            xVar2 = x.f10509d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e4) {
                                io.sentry.android.core.e0.c("SVGAndroidRenderer", "Could not decode bad Data URL", e4);
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            f1.a aVar4 = new f1.a(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            u1((p2) this.f10472g, k0Var);
                            if (P() && y1()) {
                                Matrix matrix4 = k0Var.f10392t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                l0 l0Var9 = k0Var.f10388p;
                                float fD2 = l0Var9 != null ? l0Var9.d(this) : 0.0f;
                                l0 l0Var10 = k0Var.f10389q;
                                float fE = l0Var10 != null ? l0Var10.e(this) : 0.0f;
                                float fD3 = k0Var.f10390r.d(this);
                                float fD4 = k0Var.f10391s.d(this);
                                p2 p2Var2 = (p2) this.f10472g;
                                p2Var2.f10454f = new f1.a(fD2, fE, fD3, fD4);
                                if (!p2Var2.f10449a.R.booleanValue()) {
                                    f1.a aVar5 = ((p2) this.f10472g).f10454f;
                                    e1(aVar5.f8398b, aVar5.f8399c, aVar5.f8400d, aVar5.f8401e);
                                }
                                k0Var.f10422h = ((p2) this.f10472g).f10454f;
                                r1(k0Var);
                                H(k0Var, k0Var.f10422h);
                                boolean zS05 = S0();
                                x1();
                                canvas2.save();
                                canvas2.concat(G(((p2) this.f10472g).f10454f, aVar4, xVar2));
                                canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((p2) this.f10472g).f10449a.f10369i0 != d1.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (zS05) {
                                    R0(k0Var.f10422h);
                                }
                            }
                        }
                    }
                } else if (q1Var instanceof r0) {
                    r0 r0Var = (r0) q1Var;
                    if (r0Var.f10469o != null) {
                        u1((p2) this.f10472g, r0Var);
                        if (P() && y1()) {
                            p2 p2Var3 = (p2) this.f10472g;
                            if (p2Var3.f10451c || p2Var3.f10450b) {
                                Matrix matrix5 = r0Var.f10351n;
                                if (matrix5 != null) {
                                    ((Canvas) this.f10470a).concat(matrix5);
                                }
                                Path path = new l2(r0Var.f10469o).f10404a;
                                if (r0Var.f10422h == null) {
                                    r0Var.f10422h = E(path);
                                }
                                r1(r0Var);
                                I(r0Var);
                                H(r0Var, r0Var.f10422h);
                                boolean zS06 = S0();
                                p2 p2Var4 = (p2) this.f10472g;
                                if (p2Var4.f10450b) {
                                    z0 z0Var = p2Var4.f10449a.f10366g;
                                    path.setFillType((z0Var == null || z0Var != z0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    Q(r0Var, path);
                                }
                                if (((p2) this.f10472g).f10451c) {
                                    R(path);
                                }
                                a1(r0Var);
                                if (zS06) {
                                    R0(r0Var.f10422h);
                                }
                            }
                        }
                    }
                } else if (q1Var instanceof w0) {
                    w0 w0Var = (w0) q1Var;
                    l0 l0Var11 = w0Var.f10503q;
                    if (l0Var11 != null && w0Var.f10504r != null && !l0Var11.g() && !w0Var.f10504r.g()) {
                        u1((p2) this.f10472g, w0Var);
                        if (P() && y1()) {
                            Matrix matrix6 = w0Var.f10351n;
                            if (matrix6 != null) {
                                ((Canvas) this.f10470a).concat(matrix6);
                            }
                            Path pathK0 = K0(w0Var);
                            r1(w0Var);
                            I(w0Var);
                            H(w0Var, w0Var.f10422h);
                            boolean zS07 = S0();
                            if (((p2) this.f10472g).f10450b) {
                                Q(w0Var, pathK0);
                            }
                            if (((p2) this.f10472g).f10451c) {
                                R(pathK0);
                            }
                            if (zS07) {
                                R0(w0Var.f10422h);
                            }
                        }
                    }
                } else if (q1Var instanceof z) {
                    z zVar = (z) q1Var;
                    l0 l0Var12 = zVar.f10521q;
                    if (l0Var12 != null && !l0Var12.g()) {
                        u1((p2) this.f10472g, zVar);
                        if (P() && y1()) {
                            Matrix matrix7 = zVar.f10351n;
                            if (matrix7 != null) {
                                ((Canvas) this.f10470a).concat(matrix7);
                            }
                            Path pathH0 = H0(zVar);
                            r1(zVar);
                            I(zVar);
                            H(zVar, zVar.f10422h);
                            boolean zS08 = S0();
                            if (((p2) this.f10472g).f10450b) {
                                Q(zVar, pathH0);
                            }
                            if (((p2) this.f10472g).f10451c) {
                                R(pathH0);
                            }
                            if (zS08) {
                                R0(zVar.f10422h);
                            }
                        }
                    }
                } else if (q1Var instanceof e0) {
                    e0 e0Var = (e0) q1Var;
                    l0 l0Var13 = e0Var.f10332q;
                    if (l0Var13 != null && e0Var.f10333r != null && !l0Var13.g() && !e0Var.f10333r.g()) {
                        u1((p2) this.f10472g, e0Var);
                        if (P() && y1()) {
                            Matrix matrix8 = e0Var.f10351n;
                            if (matrix8 != null) {
                                ((Canvas) this.f10470a).concat(matrix8);
                            }
                            Path pathI0 = I0(e0Var);
                            r1(e0Var);
                            I(e0Var);
                            H(e0Var, e0Var.f10422h);
                            boolean zS09 = S0();
                            if (((p2) this.f10472g).f10450b) {
                                Q(e0Var, pathI0);
                            }
                            if (((p2) this.f10472g).f10451c) {
                                R(pathI0);
                            }
                            if (zS09) {
                                R0(e0Var.f10422h);
                            }
                        }
                    }
                } else if (q1Var instanceof m0) {
                    m0 m0Var = (m0) q1Var;
                    u1((p2) this.f10472g, m0Var);
                    if (P() && y1() && ((p2) this.f10472g).f10451c) {
                        Matrix matrix9 = m0Var.f10351n;
                        if (matrix9 != null) {
                            ((Canvas) this.f10470a).concat(matrix9);
                        }
                        l0 l0Var14 = m0Var.f10408o;
                        float fD5 = l0Var14 == null ? 0.0f : l0Var14.d(this);
                        l0 l0Var15 = m0Var.f10409p;
                        float fE2 = l0Var15 == null ? 0.0f : l0Var15.e(this);
                        l0 l0Var16 = m0Var.f10410q;
                        float fD6 = l0Var16 == null ? 0.0f : l0Var16.d(this);
                        l0 l0Var17 = m0Var.f10411r;
                        fE = l0Var17 != null ? l0Var17.e(this) : 0.0f;
                        if (m0Var.f10422h == null) {
                            m0Var.f10422h = new f1.a(Math.min(fD5, fD6), Math.min(fE2, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE2));
                        }
                        Path path2 = new Path();
                        path2.moveTo(fD5, fE2);
                        path2.lineTo(fD6, fE);
                        r1(m0Var);
                        I(m0Var);
                        H(m0Var, m0Var.f10422h);
                        boolean zS010 = S0();
                        R(path2);
                        a1(m0Var);
                        if (zS010) {
                            R0(m0Var.f10422h);
                        }
                    }
                } else if (q1Var instanceof v0) {
                    v0 v0Var = (v0) q1Var;
                    u1((p2) this.f10472g, v0Var);
                    if (P() && y1()) {
                        p2 p2Var5 = (p2) this.f10472g;
                        if (p2Var5.f10451c || p2Var5.f10450b) {
                            Matrix matrix10 = v0Var.f10351n;
                            if (matrix10 != null) {
                                ((Canvas) this.f10470a).concat(matrix10);
                            }
                            if (v0Var.f10497o.length >= 2) {
                                Path pathJ0 = J0(v0Var);
                                r1(v0Var);
                                I(v0Var);
                                H(v0Var, v0Var.f10422h);
                                boolean zS011 = S0();
                                if (((p2) this.f10472g).f10450b) {
                                    Q(v0Var, pathJ0);
                                }
                                if (((p2) this.f10472g).f10451c) {
                                    R(pathJ0);
                                }
                                a1(v0Var);
                                if (zS011) {
                                    R0(v0Var.f10422h);
                                }
                            }
                        }
                    }
                } else if (q1Var instanceof u0) {
                    u0 u0Var = (u0) q1Var;
                    u1((p2) this.f10472g, u0Var);
                    if (P() && y1()) {
                        p2 p2Var6 = (p2) this.f10472g;
                        if (p2Var6.f10451c || p2Var6.f10450b) {
                            Matrix matrix11 = u0Var.f10351n;
                            if (matrix11 != null) {
                                ((Canvas) this.f10470a).concat(matrix11);
                            }
                            if (u0Var.f10497o.length >= 2) {
                                Path pathJ02 = J0(u0Var);
                                r1(u0Var);
                                z0 z0Var2 = ((p2) this.f10472g).f10449a.f10366g;
                                pathJ02.setFillType((z0Var2 == null || z0Var2 != z0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                I(u0Var);
                                H(u0Var, u0Var.f10422h);
                                boolean zS012 = S0();
                                if (((p2) this.f10472g).f10450b) {
                                    Q(u0Var, pathJ02);
                                }
                                if (((p2) this.f10472g).f10451c) {
                                    R(pathJ02);
                                }
                                a1(u0Var);
                                if (zS012) {
                                    R0(u0Var.f10422h);
                                }
                            }
                        }
                    }
                } else if (q1Var instanceof z1) {
                    z1 z1Var = (z1) q1Var;
                    u1((p2) this.f10472g, z1Var);
                    if (P()) {
                        Matrix matrix12 = z1Var.f10522r;
                        if (matrix12 != null) {
                            ((Canvas) this.f10470a).concat(matrix12);
                        }
                        ArrayList arrayList = z1Var.f10326n;
                        float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((l0) z1Var.f10326n.get(0)).d(this);
                        ArrayList arrayList2 = z1Var.f10327o;
                        float fE3 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((l0) z1Var.f10327o.get(0)).e(this);
                        ArrayList arrayList3 = z1Var.f10328p;
                        float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((l0) z1Var.f10328p.get(0)).d(this);
                        ArrayList arrayList4 = z1Var.f10329q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            fE = ((l0) z1Var.f10329q.get(0)).e(this);
                        }
                        e1 e1VarE0 = e0();
                        if (e1VarE0 != e1.Start) {
                            float F = F(z1Var);
                            if (e1VarE0 == e1.Middle) {
                                F /= 2.0f;
                            }
                            fD7 -= F;
                        }
                        if (z1Var.f10422h == null) {
                            o2 o2Var = new o2(this, fD7, fE3);
                            S(z1Var, o2Var);
                            RectF rectF = (RectF) o2Var.f10442g;
                            z1Var.f10422h = new f1.a(rectF.left, rectF.top, rectF.width(), ((RectF) o2Var.f10442g).height());
                        }
                        r1(z1Var);
                        I(z1Var);
                        H(z1Var, z1Var.f10422h);
                        boolean zS013 = S0();
                        S(z1Var, new n2(this, fD7 + fD8, fE3 + fE));
                        if (zS013) {
                            R0(z1Var.f10422h);
                        }
                    }
                }
            }
        }
        k1();
    }

    public void Y0(l1 l1Var, boolean z10) {
        if (z10) {
            ((Stack) this.f10474x).push(l1Var);
            ((Stack) this.f10475y).push(((Canvas) this.f10470a).getMatrix());
        }
        Iterator it = l1Var.f10401i.iterator();
        while (it.hasNext()) {
            X0((q1) it.next());
        }
        if (z10) {
            ((Stack) this.f10474x).pop();
            ((Stack) this.f10475y).pop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List Z(dt.w r7, js.s r8, boolean r9, boolean r10, java.lang.Boolean r11, boolean r12) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            wr.b r7 = r0.v0(r1, r2, r3, r4, r5)
            if (r7 != 0) goto L26
            boolean r7 = r1 instanceof dt.u
            r9 = 0
            if (r7 == 0) goto L25
            r7 = r1
            dt.u r7 = (dt.u) r7
            java.lang.Object r7 = r7.f7549d
            rr.o0 r7 = (rr.o0) r7
            boolean r10 = r7 instanceof js.r
            if (r10 == 0) goto L1f
            js.r r7 = (js.r) r7
            goto L20
        L1f:
            r7 = r9
        L20:
            if (r7 == 0) goto L25
            wr.b r7 = r7.f13825a
            goto L26
        L25:
            r7 = r9
        L26:
            if (r7 != 0) goto L29
            goto L3d
        L29:
            java.lang.Object r9 = r0.f10471d
            gt.e r9 = (gt.e) r9
            java.lang.Object r7 = r9.a(r7)
            js.a r7 = (js.a) r7
            java.util.HashMap r7 = r7.f13789a
            java.lang.Object r7 = r7.get(r8)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L3f
        L3d:
            mq.w r7 = mq.w.f16945a
        L3f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.Z(dt.w, js.s, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z0(h9.n0 r13, h9.k2 r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.Z0(h9.n0, h9.k2):void");
    }

    @Override // bf.d
    public Object a(Class cls) {
        if (!((Set) this.f10470a).contains(bf.u.a(cls))) {
            throw new bf.n("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((bf.d) this.f10475y).a(cls);
        if (!cls.equals(bg.b.class)) {
            return objA;
        }
        return new bf.v();
    }

    public void a1(h0 h0Var) {
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        int i10;
        float f10;
        float f11;
        float f12;
        ArrayList arrayList;
        int size;
        i1 i1Var = ((p2) this.f10472g).f10449a;
        String str = i1Var.T;
        if (str == null && i1Var.U == null && i1Var.V == null) {
            return;
        }
        if (str == null) {
            n0Var = null;
        } else {
            o1 o1VarN = h0Var.f10461a.N(str);
            if (o1VarN != null) {
                n0Var = (n0) o1VarN;
            } else {
                T("Marker reference '%s' not found", ((p2) this.f10472g).f10449a.T);
                n0Var = null;
            }
        }
        String str2 = ((p2) this.f10472g).f10449a.U;
        if (str2 == null) {
            n0Var2 = null;
        } else {
            o1 o1VarN2 = h0Var.f10461a.N(str2);
            if (o1VarN2 != null) {
                n0Var2 = (n0) o1VarN2;
            } else {
                T("Marker reference '%s' not found", ((p2) this.f10472g).f10449a.U);
                n0Var2 = null;
            }
        }
        String str3 = ((p2) this.f10472g).f10449a.V;
        if (str3 == null) {
            n0Var3 = null;
        } else {
            o1 o1VarN3 = h0Var.f10461a.N(str3);
            if (o1VarN3 != null) {
                n0Var3 = (n0) o1VarN3;
            } else {
                T("Marker reference '%s' not found", ((p2) this.f10472g).f10449a.V);
                n0Var3 = null;
            }
        }
        float f13 = 0.0f;
        if (h0Var instanceof r0) {
            arrayList = new j2(this, ((r0) h0Var).f10469o).f10381a;
            f11 = 0.0f;
            i10 = 1;
        } else if (h0Var instanceof m0) {
            m0 m0Var = (m0) h0Var;
            l0 l0Var = m0Var.f10408o;
            float fD = l0Var != null ? l0Var.d(this) : 0.0f;
            l0 l0Var2 = m0Var.f10409p;
            float fE = l0Var2 != null ? l0Var2.e(this) : 0.0f;
            l0 l0Var3 = m0Var.f10410q;
            float fD2 = l0Var3 != null ? l0Var3.d(this) : 0.0f;
            l0 l0Var4 = m0Var.f10411r;
            float fE2 = l0Var4 != null ? l0Var4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f14 = fD2 - fD;
            i10 = 1;
            float f15 = fE2 - fE;
            arrayList2.add(new k2(fD, fE, f14, f15));
            arrayList2.add(new k2(fD2, fE2, f14, f15));
            f11 = 0.0f;
            arrayList = arrayList2;
        } else {
            i10 = 1;
            u0 u0Var = (u0) h0Var;
            int length = u0Var.f10497o.length;
            if (length < 2) {
                arrayList = null;
                f11 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = u0Var.f10497o;
                k2 k2Var = new k2(fArr[0], fArr[1], 0.0f, 0.0f);
                int i11 = 2;
                float f16 = 0.0f;
                float f17 = 0.0f;
                while (true) {
                    f10 = k2Var.f10394b;
                    f11 = f13;
                    f12 = k2Var.f10393a;
                    if (i11 >= length) {
                        break;
                    }
                    float[] fArr2 = u0Var.f10497o;
                    float f18 = fArr2[i11];
                    float f19 = fArr2[i11 + 1];
                    k2Var.a(f18, f19);
                    arrayList3.add(k2Var);
                    k2Var = new k2(f18, f19, f18 - f12, f19 - f10);
                    i11 += 2;
                    f17 = f19;
                    f16 = f18;
                    f13 = f11;
                }
                if (u0Var instanceof v0) {
                    float[] fArr3 = u0Var.f10497o;
                    float f20 = fArr3[0];
                    if (f16 != f20) {
                        float f21 = fArr3[1];
                        if (f17 != f21) {
                            k2Var.a(f20, f21);
                            arrayList3.add(k2Var);
                            k2 k2Var2 = new k2(f20, f21, f20 - f12, f21 - f10);
                            k2Var2.b((k2) arrayList3.get(0));
                            arrayList3.add(k2Var2);
                            arrayList3.set(0, k2Var2);
                        }
                    }
                } else {
                    arrayList3.add(k2Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        i1 i1Var2 = ((p2) this.f10472g).f10449a;
        i1Var2.V = null;
        i1Var2.U = null;
        i1Var2.T = null;
        if (n0Var != null) {
            Z0(n0Var, (k2) arrayList.get(0));
        }
        if (n0Var2 != null && arrayList.size() > 2) {
            k2 k2Var3 = (k2) arrayList.get(0);
            k2 k2Var4 = (k2) arrayList.get(i10);
            int i12 = 1;
            while (i12 < size - 1) {
                i12++;
                k2 k2Var5 = (k2) arrayList.get(i12);
                if (k2Var4.f10397e) {
                    float f22 = k2Var4.f10395c;
                    float f23 = k2Var4.f10396d;
                    float f24 = k2Var4.f10393a;
                    float f25 = f24 - k2Var3.f10393a;
                    float f26 = k2Var4.f10394b;
                    float f27 = ((f26 - k2Var3.f10394b) * f23) + (f25 * f22);
                    if (f27 == f11) {
                        f27 = ((k2Var5.f10393a - f24) * f22) + ((k2Var5.f10394b - f26) * f23);
                    }
                    if (f27 <= f11 && (f27 != f11 || (f22 <= f11 && f23 < f11))) {
                        k2Var4.f10395c = -f22;
                        k2Var4.f10396d = -f23;
                    }
                }
                Z0(n0Var2, k2Var4);
                k2Var3 = k2Var4;
                k2Var4 = k2Var5;
            }
        }
        if (n0Var3 != null) {
            Z0(n0Var3, (k2) arrayList.get(size - 1));
        }
    }

    @Override // dt.b
    public Object b(dt.w wVar, ls.g0 g0Var, ht.x xVar) {
        br.l.e(g0Var, "proto");
        return F0(wVar, g0Var, dt.a.PROPERTY_GETTER, xVar, js.b.f13792g);
    }

    public p2 b0(o1 o1Var) {
        p2 p2Var = new p2();
        t1(p2Var, i1.a());
        c0(o1Var, p2Var);
        return p2Var;
    }

    public void b1(o0 o0Var, f1.a aVar) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.f10470a;
        Boolean bool = o0Var.f10429n;
        if (bool == null || !bool.booleanValue()) {
            l0 l0Var = o0Var.f10431p;
            float fB = l0Var != null ? l0Var.b(this, 1.0f) : 1.2f;
            l0 l0Var2 = o0Var.f10432q;
            float fB2 = l0Var2 != null ? l0Var2.b(this, 1.0f) : 1.2f;
            fD = fB * aVar.f8400d;
            fE = fB2 * aVar.f8401e;
        } else {
            l0 l0Var3 = o0Var.f10431p;
            fD = l0Var3 != null ? l0Var3.d(this) : aVar.f8400d;
            l0 l0Var4 = o0Var.f10432q;
            fE = l0Var4 != null ? l0Var4.e(this) : aVar.f8401e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        l1();
        p2 p2VarB0 = b0(o0Var);
        this.f10472g = p2VarB0;
        p2VarB0.f10449a.I = Float.valueOf(1.0f);
        boolean zS0 = S0();
        canvas.save();
        Boolean bool2 = o0Var.f10430o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(aVar.f8398b, aVar.f8399c);
            canvas.scale(aVar.f8400d, aVar.f8401e);
        }
        Y0(o0Var, false);
        canvas.restore();
        if (zS0) {
            R0(aVar);
        }
        k1();
    }

    @Override // dt.e
    public List c(dt.w wVar, rs.b bVar, dt.a aVar) {
        br.l.e(bVar, "proto");
        br.l.e(aVar, "kind");
        if (aVar == dt.a.PROPERTY) {
            return G0(wVar, (ls.g0) bVar, js.c.PROPERTY);
        }
        js.s sVarG0 = g0(bVar, (ns.f) wVar.f7547b, (h7.h0) wVar.f7548c, aVar, false);
        return sVarG0 == null ? mq.w.f16945a : a0(this, wVar, sVarG0, null, false, 60);
    }

    public void c0(q1 q1Var, p2 p2Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (q1Var instanceof o1) {
                arrayList.add(0, (o1) q1Var);
            }
            Object obj = q1Var.f10462b;
            if (obj == null) {
                break;
            } else {
                q1Var = (q1) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u1(p2Var, (o1) it.next());
        }
        p2 p2Var2 = (p2) this.f10472g;
        p2Var.f10455g = p2Var2.f10455g;
        p2Var.f10454f = p2Var2.f10454f;
    }

    public void c1() {
        String str = "DiskTaskRepository";
        ch.n.b("DiskTaskRepository", "resetRunningScheduledTasks() called");
        qj.a aVar = (qj.a) this.f10470a;
        hi.a aVar2 = (hi.a) this.f10473r;
        ArrayList arrayListJ = aVar.j(aVar2, e5.H("state"), e5.H("STARTED"));
        ch.n.b("DiskTaskRepository", arrayListJ.size() + " tasks to be reset.");
        Iterator it = arrayListJ.iterator();
        while (it.hasNext()) {
            rj.f fVar = (rj.f) it.next();
            ch.n.b(str, "Resetting task " + fVar.f21592b);
            long j = fVar.f21591a;
            String str2 = fVar.f21592b;
            String str3 = fVar.f21593c;
            String str4 = fVar.f21594d;
            String str5 = fVar.f21595e;
            long j7 = fVar.f21596f;
            long j10 = fVar.f21597g;
            long j11 = fVar.f21598h;
            int i10 = fVar.f21599i;
            String str6 = fVar.j;
            String str7 = str;
            gk.f fVar2 = fVar.k;
            long j12 = fVar.f21600l;
            long j13 = fVar.f21601m;
            long j14 = fVar.f21602n;
            long j15 = fVar.f21603o;
            Iterator it2 = it;
            int i11 = fVar.f21604p;
            boolean z10 = fVar.f21606r;
            boolean z11 = fVar.f21607s;
            boolean z12 = fVar.f21608t;
            boolean z13 = fVar.f21609u;
            boolean z14 = fVar.f21610v;
            String str8 = fVar.f21611w;
            String str9 = fVar.f21612x;
            boolean z15 = fVar.f21613y;
            long j16 = fVar.f21614z;
            long j17 = fVar.A;
            boolean z16 = fVar.B;
            int i12 = fVar.C;
            String str10 = fVar.D;
            int i13 = fVar.E;
            String str11 = fVar.F;
            String str12 = fVar.G;
            boolean z17 = fVar.H;
            boolean z18 = fVar.I;
            br.l.e(str2, "name");
            br.l.e(str3, "dataEndpoint");
            br.l.e(str4, "executeTriggers");
            br.l.e(str5, "interruptionTriggers");
            br.l.e(str6, "jobs");
            br.l.e(fVar2, "scheduleType");
            br.l.e(str8, "rescheduleOnFailFromThisJobOnwards");
            br.l.e(str9, "rescheduleOnInterruptFromThisJobOnwards");
            br.l.e(str10, "crossTaskDelayGroups");
            br.l.e(str11, "lastLocation");
            aVar.g(aVar2, aVar2.k(new rj.f(j, str2, str3, str4, str5, j7, j10, j11, i10, str6, fVar2, j12, j13, j14, j15, i11, "WAITING_FOR_TRIGGERS", z10, z11, z12, z13, z14, str8, str9, z15, j16, j17, z16, i12, str10, i13, str11, str12, z17, z18)), j);
            str = str7;
            it = it2;
        }
    }

    @Override // bf.d
    public bf.s d(bf.u uVar) {
        if (((Set) this.f10472g).contains(uVar)) {
            return ((bf.d) this.f10475y).d(uVar);
        }
        throw new bf.n("Attempting to request an undeclared dependency Deferred<" + uVar + ">.");
    }

    public ArrayList d0() {
        ArrayList arrayList;
        synchronized (((qj.a) this.f10470a)) {
            qj.a aVar = (qj.a) this.f10470a;
            hi.a aVar2 = (hi.a) this.f10473r;
            mq.w wVar = mq.w.f16945a;
            ArrayList arrayListJ = aVar.j(aVar2, wVar, wVar);
            arrayList = new ArrayList(mq.p.a0(arrayListJ, 10));
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                arrayList.add((hk.h) ((xj.i) this.f10471d).a((rj.f) it.next()));
            }
        }
        return arrayList;
    }

    public dd.r d1(String str, Executor executor) {
        dd.h hVar;
        ArrayList arrayListB = ((of.a) this.f10471d).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                mf.a aVar = of.a.f19414g;
                String strE = of.a.e(file);
                aVar.getClass();
                arrayList.add(new hf.a(mf.a.i(strE), file.getName(), file));
            } catch (IOException e4) {
                io.sentry.android.core.e0.q("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e4);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hf.a aVar2 = (hf.a) it2.next();
            if (str == null || str.equals(aVar2.f10637b)) {
                pf.a aVar3 = (pf.a) this.f10472g;
                lf.b0 b0Var = aVar2.f10636a;
                if (b0Var.f15176f == null || b0Var.f15177g == null) {
                    hf.w wVarB = ((hf.x) this.f10475y).b(true);
                    lf.b0 b0Var2 = aVar2.f10636a;
                    String str2 = wVarB.f10722a;
                    lf.a0 a0VarA = b0Var2.a();
                    a0VarA.f15149e = str2;
                    lf.b0 b0VarA = a0VarA.a();
                    String str3 = wVarB.f10723b;
                    lf.a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f15150f = str3;
                    aVar2 = new hf.a(a0VarA2.a(), aVar2.f10637b, aVar2.f10638c);
                }
                boolean z10 = str != null;
                pf.c cVar = aVar3.f20470a;
                synchronized (cVar.f20480f) {
                    try {
                        hVar = new dd.h();
                        if (z10) {
                            ((AtomicInteger) cVar.f20483i.f12353d).getAndIncrement();
                            if (cVar.f20480f.size() < cVar.f20479e) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                cVar.f20480f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                cVar.f20481g.execute(new bc.e0(cVar, aVar2, hVar, 4));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                hVar.c(aVar2);
                            } else {
                                cVar.a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                ((AtomicInteger) cVar.f20483i.f12354g).getAndIncrement();
                                hVar.c(aVar2);
                            }
                        } else {
                            cVar.b(aVar2, hVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(hVar.f7294a.e(executor, new d5.v(this)));
            }
        }
        return e5.U(arrayList2);
    }

    @Override // bf.d
    public eg.b e(bf.u uVar) {
        if (((Set) this.f10474x).contains(uVar)) {
            return ((bf.d) this.f10475y).e(uVar);
        }
        throw new bf.n("Attempting to request an undeclared dependency Provider<Set<" + uVar + ">>.");
    }

    public e1 e0() {
        e1 e1Var;
        i1 i1Var = ((p2) this.f10472g).f10449a;
        if (i1Var.P == g1.LTR || (e1Var = i1Var.Q) == e1.Middle) {
            return i1Var.Q;
        }
        e1 e1Var2 = e1.Start;
        return e1Var == e1Var2 ? e1.End : e1Var2;
    }

    public void e1(float f10, float f11, float f12, float f13) {
        float fD = f12 + f10;
        float fE = f13 + f11;
        kg.r rVar = ((p2) this.f10472g).f10449a.S;
        if (rVar != null) {
            f10 += ((l0) rVar.f14398r).d(this);
            f11 += ((l0) ((p2) this.f10472g).f10449a.S.f14395a).e(this);
            fD -= ((l0) ((p2) this.f10472g).f10449a.S.f14396d).d(this);
            fE -= ((l0) ((p2) this.f10472g).f10449a.S.f14397g).e(this);
        }
        ((Canvas) this.f10470a).clipRect(f10, f11, fD, fE);
    }

    @Override // dt.e
    public ArrayList f(ls.v0 v0Var, ns.f fVar) {
        br.l.e(v0Var, "proto");
        br.l.e(fVar, "nameResolver");
        Object objK = v0Var.k(os.k.f19785h);
        br.l.d(objK, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ls.g> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        for (ls.g gVar : iterable) {
            br.l.d(gVar, "it");
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f10474x).e(gVar, fVar));
        }
        return arrayList;
    }

    public Integer f0() {
        UsageStatsManager usageStatsManager = (UsageStatsManager) this.f10472g;
        if (usageStatsManager == null || !((ch.f) this.f10475y).d()) {
            return null;
        }
        return Integer.valueOf(usageStatsManager.getAppStandbyBucket());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f1(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.f1(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    @Override // bf.d
    public eg.b g(Class cls) {
        return k(bf.u.a(cls));
    }

    @Override // dt.e
    public ArrayList h(ls.q0 q0Var, ns.f fVar) {
        br.l.e(q0Var, "proto");
        br.l.e(fVar, "nameResolver");
        Object objK = q0Var.k(os.k.f19783f);
        br.l.d(objK, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ls.g> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
        for (ls.g gVar : iterable) {
            br.l.d(gVar, "it");
            arrayList.add(((io.sentry.internal.debugmeta.c) this.f10474x).e(gVar, fVar));
        }
        return arrayList;
    }

    public Path.FillType h0() {
        z0 z0Var = ((p2) this.f10472g).f10449a.f10360b0;
        return (z0Var == null || z0Var != z0.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    @Override // bf.d
    public Object i(bf.u uVar) {
        if (((Set) this.f10470a).contains(uVar)) {
            return ((bf.d) this.f10475y).i(uVar);
        }
        throw new bf.n("Attempting to request an undeclared dependency " + uVar + ".");
    }

    public String i0(long j) {
        String str;
        synchronized (((HashMap) this.f10471d)) {
            str = (String) ((HashMap) this.f10471d).get(Long.valueOf(j));
        }
        return str;
    }

    @Override // dt.e
    public List j(dt.w wVar, ls.g0 g0Var) {
        br.l.e(g0Var, "proto");
        return G0(wVar, g0Var, js.c.DELEGATE_FIELD);
    }

    public ArrayList j0() {
        ArrayList arrayList;
        synchronized (((qj.a) this.f10470a)) {
            ArrayList arrayListJ = ((qj.a) this.f10470a).j((hi.a) this.f10473r, e5.H("schedule_type"), e5.H("EVENT_BASED"));
            arrayList = new ArrayList(mq.p.a0(arrayListJ, 10));
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                arrayList.add((hk.h) ((xj.i) this.f10471d).a((rj.f) it.next()));
            }
        }
        return arrayList;
    }

    public dd.r j1(String str, String str2, Bundle bundle) {
        int i10;
        try {
            f1(str, str2, bundle);
            yb.a aVar = (yb.a) this.f10472g;
            yb.f fVar = yb.f.f26219g;
            com.squareup.picasso.s sVar = aVar.f26207c;
            if (sVar.s() < 12000000) {
                return sVar.t() != 0 ? aVar.a(bundle).f(fVar, new xr.a(aVar, 3, bundle)) : e5.t(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            yb.k kVarG = yb.k.g(aVar.f26206b);
            synchronized (kVarG) {
                i10 = kVarG.f26240a;
                kVarG.f26240a = i10 + 1;
            }
            return kVarG.h(new yb.j(i10, 1, bundle, 1)).e(fVar, yb.c.f26213d);
        } catch (InterruptedException | ExecutionException e4) {
            return e5.t(e4);
        }
    }

    @Override // bf.d
    public eg.b k(bf.u uVar) {
        if (((Set) this.f10471d).contains(uVar)) {
            return ((bf.d) this.f10475y).k(uVar);
        }
        throw new bf.n("Attempting to request an undeclared dependency Provider<" + uVar + ">.");
    }

    public int k0(hk.h hVar) {
        int i10;
        ch.n.b("DiskTaskRepository", "getExecutionCount() called with: task = " + hVar.f10805b);
        synchronized (((qj.a) this.f10470a)) {
            rj.f fVar = (rj.f) ((qj.a) this.f10470a).d((hi.a) this.f10473r, hVar.f10804a);
            i10 = fVar != null ? fVar.f21604p : -1;
        }
        return i10;
    }

    public void k1() {
        ((Canvas) this.f10470a).restore();
        this.f10472g = (p2) ((Stack) this.f10473r).pop();
    }

    @Override // dt.b
    public Object l(dt.w wVar, ls.g0 g0Var, ht.x xVar) {
        br.l.e(g0Var, "proto");
        return F0(wVar, g0Var, dt.a.PROPERTY, xVar, js.b.f13793r);
    }

    public String l0(long j) {
        String str;
        synchronized (((HashMap) this.f10472g)) {
            str = (String) ((HashMap) this.f10472g).get(Long.valueOf(j));
        }
        return str;
    }

    public void l1() {
        ((Canvas) this.f10470a).save();
        ((Stack) this.f10473r).push((p2) this.f10472g);
        this.f10472g = new p2((p2) this.f10472g);
    }

    @Override // bf.d
    public Set m(bf.u uVar) {
        if (((Set) this.f10473r).contains(uVar)) {
            return ((bf.d) this.f10475y).m(uVar);
        }
        throw new bf.n("Attempting to request an undeclared dependency Set<" + uVar + ">.");
    }

    public Boolean m0() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) this.f10471d;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals((String) this.f10473r)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void m1(long j, String str) {
        if (str == null || tt.l.D0(str)) {
            return;
        }
        synchronized (((HashMap) this.f10471d)) {
            ((HashMap) this.f10471d).put(Long.valueOf(j), str);
        }
    }

    @Override // dt.e
    public ArrayList n(dt.u uVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        br.l.e(uVar, "container");
        rr.o0 o0Var = (rr.o0) uVar.f7549d;
        js.r rVar = o0Var instanceof js.r ? (js.r) o0Var : null;
        wr.b bVar = rVar != null ? rVar.f13825a : null;
        if (bVar == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + uVar.f7542g.b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = bVar.f24588a;
        br.l.e(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        br.l.d(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            br.l.d(annotation, "annotation");
            Class clsD = ir.f0.D(ir.f0.z(annotation));
            of.b bVarE0 = E0(xr.d.a(clsD), new wr.a(annotation), arrayList);
            if (bVarE0 != null) {
                ir.f0.S(bVarE0, annotation, clsD);
            }
        }
        return arrayList;
    }

    public Integer n0() {
        com.opensignal.sdk.common.measurements.base.e eVar = (com.opensignal.sdk.common.measurements.base.e) this.f10471d;
        fj.n nVar = (fj.n) this.f10470a;
        Integer numB = eVar.b(nVar != null ? nVar.N : null, ((ak.g) ((q3.a) this.f10472g).f20680g).f529f.f449a.f472a);
        if (numB == null || numB.intValue() < 0) {
            return ((com.opensignal.sdk.common.measurements.base.f) this.f10474x).B(nVar != null ? nVar.N : null);
        }
        return numB;
    }

    public void n1(long j, String str) {
        if (str == null || tt.l.D0(str)) {
            return;
        }
        synchronized (((HashMap) this.f10472g)) {
            ((HashMap) this.f10472g).put(Long.valueOf(j), str);
        }
    }

    @Override // dt.e
    public List o(dt.w wVar, ls.g0 g0Var) {
        br.l.e(g0Var, "proto");
        return G0(wVar, g0Var, js.c.BACKING_FIELD);
    }

    public nj.b o0(int i10) {
        TelephonyDisplayInfo telephonyDisplayInfo;
        ch.n.b("NetworkGenerationChecker", h0.b.h(i10, "connection type checker: "));
        if (br.l.a(n0(), com.opensignal.sdk.common.measurements.base.d.CONNECTED.getValue())) {
            return nj.b.FIVE_G;
        }
        fj.n nVar = (fj.n) this.f10470a;
        Integer numValueOf = (nVar == null || (telephonyDisplayInfo = nVar.R) == null) ? null : Integer.valueOf(telephonyDisplayInfo.getOverrideNetworkType());
        if ((numValueOf != null && numValueOf.intValue() == 5) || ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 4))) {
            return nj.b.FIVE_G;
        }
        switch (i10) {
        }
        return nj.b.FIVE_G;
    }

    @Override // dt.e
    public List p(dt.w wVar, ls.t tVar) {
        br.l.e(wVar, "container");
        String string = ((ns.f) wVar.f7547b).getString(tVar.f15881r);
        String strB = ps.b.b(((dt.u) wVar).f7542g.c());
        br.l.e(strB, "desc");
        return a0(this, wVar, new js.s(string + '#' + strB), null, false, 60);
    }

    public String p1(String str, boolean z10, boolean z11) {
        if (((p2) this.f10472g).f10456h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // dt.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List q(dt.w r10, rs.b r11, dt.a r12, int r13, ls.y0 r14) {
        /*
            r9 = this;
            java.lang.String r14 = "callableProto"
            br.l.e(r11, r14)
            java.lang.String r14 = "kind"
            br.l.e(r12, r14)
            java.lang.Object r14 = r10.f7547b
            ns.f r14 = (ns.f) r14
            java.lang.Object r0 = r10.f7548c
            h7.h0 r0 = (h7.h0) r0
            r1 = 0
            js.s r12 = g0(r11, r14, r0, r12, r1)
            if (r12 == 0) goto L92
            boolean r14 = r11 instanceof ls.y
            r0 = 32
            r2 = 64
            r3 = 1
            if (r14 == 0) goto L30
            ls.y r11 = (ls.y) r11
            int r11 = r11.f15916g
            r14 = r11 & 32
            if (r14 != r0) goto L2b
            goto L2e
        L2b:
            r11 = r11 & r2
            if (r11 != r2) goto L55
        L2e:
            r1 = r3
            goto L55
        L30:
            boolean r14 = r11 instanceof ls.g0
            if (r14 == 0) goto L41
            ls.g0 r11 = (ls.g0) r11
            int r11 = r11.f15782g
            r14 = r11 & 32
            if (r14 != r0) goto L3d
            goto L40
        L3d:
            r11 = r11 & r2
            if (r11 != r2) goto L55
        L40:
            goto L2e
        L41:
            boolean r14 = r11 instanceof ls.l
            if (r14 == 0) goto L7a
            r11 = r10
            dt.u r11 = (dt.u) r11
            ls.i r14 = r11.f7543h
            ls.i r0 = ls.i.ENUM_CLASS
            if (r14 != r0) goto L50
            r1 = 2
            goto L55
        L50:
            boolean r11 = r11.f7544i
            if (r11 == 0) goto L55
            goto L2e
        L55:
            int r13 = r13 + r1
            js.s r5 = new js.s
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.f13826a
            r11.append(r12)
            r11.append(r2)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r5.<init>(r11)
            r7 = 0
            r8 = 60
            r6 = 0
            r3 = r9
            r4 = r10
            java.util.List r10 = a0(r3, r4, r5, r6, r7, r8)
            return r10
        L7a:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unsupported message: "
            r12.<init>(r13)
            java.lang.Class r11 = r11.getClass()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L92:
            mq.w r10 = mq.w.f16945a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.r2.q(dt.w, rs.b, dt.a, int, ls.y0):java.util.List");
    }

    public ScanResult q0() {
        try {
            List<ScanResult> scanResults = ((WifiManager) this.f10470a).getScanResults();
            WifiInfo wifiInfoZ0 = z0();
            String bssid = wifiInfoZ0 != null ? wifiInfoZ0.getBSSID() : null;
            if (scanResults != null) {
                for (ScanResult scanResult : scanResults) {
                    if (scanResult.BSSID.equals(bssid)) {
                        return scanResult;
                    }
                }
            }
            return null;
        } catch (SecurityException e4) {
            ch.n.d("CurrentWifiStatus", "getScanResult() SecurityException, some condition were not met please refer to https://developer.android.com/guide/topics/connectivity/wifi-scan#wifi-scan-restrictions. This might be ok if the missing permission is ACCESS_WIFI_STATE. See ANDC-2614 for details.", e4);
            return null;
        }
    }

    public void q1(Set set, ar.a aVar) {
        Object next;
        int i10;
        br.l.e(set, "activeScreens");
        wt.z zVar = (wt.z) this.f10474x;
        if (zVar != null) {
            zVar.h(null);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cq.b bVar = (cq.b) it.next();
            Iterator it2 = ((Set) this.f10473r).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (br.l.a(((cq.i) next).f6627a, bVar.f6610a)) {
                        break;
                    }
                }
            }
            cq.i iVar = (cq.i) next;
            if (iVar != null && (i10 = iVar.f6628b) > 0) {
                ((io.sentry.android.core.u0) ((iq.f) this.f10470a)).getClass();
                long jCurrentTimeMillis = (i10 * 1000) - (System.currentTimeMillis() - bVar.f6611b);
                if (jCurrentTimeMillis > 0) {
                    linkedHashSet.add(Long.valueOf(jCurrentTimeMillis));
                }
            }
        }
        this.f10474x = wt.w.s((bu.c) this.f10472g, null, null, new au.e(this, linkedHashSet, aVar, (pq.c) null), 3);
    }

    @Override // bf.d
    public bf.s r(Class cls) {
        return d(bf.u.a(cls));
    }

    public hk.h r0(hk.h hVar) {
        hk.h hVar2;
        ch.n.b("DiskTaskRepository", "getScheduledTask() called with: task = " + hVar.f10805b);
        synchronized (((qj.a) this.f10470a)) {
            ArrayList arrayListJ = ((qj.a) this.f10470a).j((hi.a) this.f10473r, e5.H("name"), e5.H(hVar.f10805b));
            hVar2 = arrayListJ.isEmpty() ? null : (hk.h) ((xj.i) this.f10471d).a(mq.o.r0(arrayListJ));
        }
        return hVar2;
    }

    public void r1(n1 n1Var) {
        if (n1Var.f10462b == null || n1Var.f10422h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f10475y).peek()).invert(matrix)) {
            f1.a aVar = n1Var.f10422h;
            float f10 = aVar.f8398b;
            float f11 = aVar.f8399c;
            float fC = aVar.c();
            f1.a aVar2 = n1Var.f10422h;
            float f12 = aVar2.f8399c;
            float fC2 = aVar2.c();
            float fD = n1Var.f10422h.d();
            f1.a aVar3 = n1Var.f10422h;
            float[] fArr = {f10, f11, fC, f12, fC2, fD, aVar3.f8398b, aVar3.d()};
            matrix.preConcat(((Canvas) this.f10470a).getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            n1 n1Var2 = (n1) ((Stack) this.f10474x).peek();
            f1.a aVar4 = n1Var2.f10422h;
            if (aVar4 == null) {
                float f17 = rectF.left;
                float f18 = rectF.top;
                n1Var2.f10422h = new f1.a(f17, f18, rectF.right - f17, rectF.bottom - f18);
                return;
            }
            float f19 = rectF.left;
            float f20 = rectF.top;
            float f21 = rectF.right - f19;
            float f22 = rectF.bottom - f20;
            if (f19 < aVar4.f8398b) {
                aVar4.f8398b = f19;
            }
            if (f20 < aVar4.f8399c) {
                aVar4.f8399c = f20;
            }
            if (f19 + f21 > aVar4.c()) {
                aVar4.f8400d = (f19 + f21) - aVar4.f8398b;
            }
            if (f20 + f22 > aVar4.d()) {
                aVar4.f8401e = (f20 + f22) - aVar4.f8399c;
            }
        }
    }

    public hk.h s0(String str) {
        Object next;
        synchronized (((qj.a) this.f10470a)) {
            try {
                qj.a aVar = (qj.a) this.f10470a;
                hi.a aVar2 = (hi.a) this.f10473r;
                mq.w wVar = mq.w.f16945a;
                Iterator it = aVar.j(aVar2, wVar, wVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (br.l.a(((rj.f) next).f21592b, str)) {
                        break;
                    }
                }
                rj.f fVar = (rj.f) next;
                if (fVar == null) {
                    return null;
                }
                return (hk.h) ((xj.i) this.f10471d).a(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public hk.h s1(hk.h hVar, boolean z10) {
        hk.h hVarB;
        ch.n.b("DiskTaskRepository", "updateScheduleInPipelineFlag() called with: task = " + hVar.f10805b + ", isScheduledInPipeline = " + z10);
        synchronized (((qj.a) this.f10470a)) {
            try {
                if (r0(hVar) != null) {
                    hVarB = hk.h.b(hVar, 0L, null, null, null, null, z10, null, -131073);
                    rj.f fVar = (rj.f) ((xj.i) this.f10471d).g(hVarB);
                    ((qj.a) this.f10470a).g((hi.a) this.f10473r, ((hi.a) this.f10473r).k(fVar), fVar.f21591a);
                } else {
                    ch.n.g("DiskTaskRepository", "Task " + hVar.f10804a + " is not present in schedule task table. Returning.");
                    hVarB = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVarB;
    }

    @Override // dt.e
    public List t(dt.w wVar, rs.b bVar, dt.a aVar) {
        br.l.e(bVar, "proto");
        br.l.e(aVar, "kind");
        js.s sVarG0 = g0(bVar, (ns.f) wVar.f7547b, (h7.h0) wVar.f7548c, aVar, false);
        return sVarG0 != null ? a0(this, wVar, new js.s(w.g.j(new StringBuilder(), sVarG0.f13826a, "@0")), null, false, 60) : mq.w.f16945a;
    }

    public ArrayList t0() {
        ArrayList arrayList;
        synchronized (((qj.a) this.f10470a)) {
            try {
                qj.a aVar = (qj.a) this.f10470a;
                hi.a aVar2 = (hi.a) this.f10473r;
                mq.w wVar = mq.w.f16945a;
                ArrayList arrayListJ = aVar.j(aVar2, wVar, wVar);
                ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayListJ, 10));
                Iterator it = arrayListJ.iterator();
                while (it.hasNext()) {
                    arrayList2.add((hk.h) ((xj.i) this.f10471d).a((rj.f) it.next()));
                }
                arrayList = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((hk.h) next).f10809f.f9615a != gk.f.EVENT_BASED) {
                        arrayList.add(next);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void t1(p2 p2Var, i1 i1Var) {
        if (B0(i1Var, 4096L)) {
            p2Var.f10449a.J = i1Var.J;
        }
        if (B0(i1Var, 2048L)) {
            p2Var.f10449a.I = i1Var.I;
        }
        boolean zB0 = B0(i1Var, 1L);
        b0 b0Var = b0.f10307g;
        if (zB0) {
            p2Var.f10449a.f10362d = i1Var.f10362d;
            r1 r1Var = i1Var.f10362d;
            p2Var.f10450b = (r1Var == null || r1Var == b0Var) ? false : true;
        }
        if (B0(i1Var, 4L)) {
            p2Var.f10449a.f10370r = i1Var.f10370r;
        }
        if (B0(i1Var, 6149L)) {
            g1(p2Var, true, p2Var.f10449a.f10362d);
        }
        if (B0(i1Var, 2L)) {
            p2Var.f10449a.f10366g = i1Var.f10366g;
        }
        if (B0(i1Var, 8L)) {
            p2Var.f10449a.f10371x = i1Var.f10371x;
            r1 r1Var2 = i1Var.f10371x;
            p2Var.f10451c = (r1Var2 == null || r1Var2 == b0Var) ? false : true;
        }
        if (B0(i1Var, 16L)) {
            p2Var.f10449a.f10372y = i1Var.f10372y;
        }
        if (B0(i1Var, 6168L)) {
            g1(p2Var, false, p2Var.f10449a.f10371x);
        }
        if (B0(i1Var, 34359738368L)) {
            p2Var.f10449a.f10368h0 = i1Var.f10368h0;
        }
        if (B0(i1Var, 32L)) {
            i1 i1Var2 = p2Var.f10449a;
            l0 l0Var = i1Var.B;
            i1Var2.B = l0Var;
            p2Var.f10453e.setStrokeWidth(l0Var.a(this));
        }
        if (B0(i1Var, 64L)) {
            i1 i1Var3 = p2Var.f10449a;
            Paint paint = p2Var.f10453e;
            i1Var3.D = i1Var.D;
            int i10 = i2.f10374b[i1Var.D.ordinal()];
            if (i10 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (B0(i1Var, 128L)) {
            i1 i1Var4 = p2Var.f10449a;
            Paint paint2 = p2Var.f10453e;
            i1Var4.E = i1Var.E;
            int i11 = i2.f10375c[i1Var.E.ordinal()];
            if (i11 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (B0(i1Var, 256L)) {
            p2Var.f10449a.F = i1Var.F;
            p2Var.f10453e.setStrokeMiter(i1Var.F.floatValue());
        }
        if (B0(i1Var, 512L)) {
            p2Var.f10449a.G = i1Var.G;
        }
        if (B0(i1Var, 1024L)) {
            p2Var.f10449a.H = i1Var.H;
        }
        Typeface typefaceJ = null;
        if (B0(i1Var, 1536L)) {
            i1 i1Var5 = p2Var.f10449a;
            Paint paint3 = p2Var.f10453e;
            l0[] l0VarArr = i1Var5.G;
            if (l0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = l0VarArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fA = i1Var5.G[i13 % length].a(this);
                    fArr[i13] = fA;
                    f10 += fA;
                }
                if (f10 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = i1Var5.H.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f10) + f10;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (B0(i1Var, 16384L)) {
            float textSize = ((p2) this.f10472g).f10452d.getTextSize();
            p2Var.f10449a.L = i1Var.L;
            p2Var.f10452d.setTextSize(i1Var.L.b(this, textSize));
            p2Var.f10453e.setTextSize(i1Var.L.b(this, textSize));
        }
        if (B0(i1Var, 8192L)) {
            p2Var.f10449a.K = i1Var.K;
        }
        if (B0(i1Var, 32768L)) {
            if (i1Var.M.intValue() == -1 && p2Var.f10449a.M.intValue() > 100) {
                i1 i1Var6 = p2Var.f10449a;
                i1Var6.M = Integer.valueOf(i1Var6.M.intValue() - 100);
            } else if (i1Var.M.intValue() != 1 || p2Var.f10449a.M.intValue() >= 900) {
                p2Var.f10449a.M = i1Var.M;
            } else {
                i1 i1Var7 = p2Var.f10449a;
                i1Var7.M = Integer.valueOf(i1Var7.M.intValue() + 100);
            }
        }
        if (B0(i1Var, 65536L)) {
            p2Var.f10449a.N = i1Var.N;
        }
        if (B0(i1Var, 106496L)) {
            i1 i1Var8 = p2Var.f10449a;
            ArrayList arrayList = i1Var8.K;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceJ = J((String) it.next(), i1Var8.M, i1Var8.N)) == null) {
                }
            }
            if (typefaceJ == null) {
                typefaceJ = J("serif", i1Var8.M, i1Var8.N);
            }
            p2Var.f10452d.setTypeface(typefaceJ);
            p2Var.f10453e.setTypeface(typefaceJ);
        }
        if (B0(i1Var, 131072L)) {
            i1 i1Var9 = p2Var.f10449a;
            Paint paint4 = p2Var.f10453e;
            Paint paint5 = p2Var.f10452d;
            i1Var9.O = i1Var.O;
            f1 f1Var = i1Var.O;
            f1 f1Var2 = f1.LineThrough;
            paint5.setStrikeThruText(f1Var == f1Var2);
            f1 f1Var3 = i1Var.O;
            f1 f1Var4 = f1.Underline;
            paint5.setUnderlineText(f1Var3 == f1Var4);
            paint4.setStrikeThruText(i1Var.O == f1Var2);
            paint4.setUnderlineText(i1Var.O == f1Var4);
        }
        if (B0(i1Var, 68719476736L)) {
            p2Var.f10449a.P = i1Var.P;
        }
        if (B0(i1Var, 262144L)) {
            p2Var.f10449a.Q = i1Var.Q;
        }
        if (B0(i1Var, 524288L)) {
            p2Var.f10449a.R = i1Var.R;
        }
        if (B0(i1Var, 2097152L)) {
            p2Var.f10449a.T = i1Var.T;
        }
        if (B0(i1Var, 4194304L)) {
            p2Var.f10449a.U = i1Var.U;
        }
        if (B0(i1Var, 8388608L)) {
            p2Var.f10449a.V = i1Var.V;
        }
        if (B0(i1Var, 16777216L)) {
            p2Var.f10449a.W = i1Var.W;
        }
        if (B0(i1Var, 33554432L)) {
            p2Var.f10449a.X = i1Var.X;
        }
        if (B0(i1Var, 1048576L)) {
            p2Var.f10449a.S = i1Var.S;
        }
        if (B0(i1Var, 268435456L)) {
            p2Var.f10449a.f10359a0 = i1Var.f10359a0;
        }
        if (B0(i1Var, 536870912L)) {
            p2Var.f10449a.f10360b0 = i1Var.f10360b0;
        }
        if (B0(i1Var, 1073741824L)) {
            p2Var.f10449a.f10361c0 = i1Var.f10361c0;
        }
        if (B0(i1Var, 67108864L)) {
            p2Var.f10449a.Y = i1Var.Y;
        }
        if (B0(i1Var, 134217728L)) {
            p2Var.f10449a.Z = i1Var.Z;
        }
        if (B0(i1Var, 8589934592L)) {
            p2Var.f10449a.f10365f0 = i1Var.f10365f0;
        }
        if (B0(i1Var, 17179869184L)) {
            p2Var.f10449a.f10367g0 = i1Var.f10367g0;
        }
        if (B0(i1Var, 137438953472L)) {
            p2Var.f10449a.f10369i0 = i1Var.f10369i0;
        }
    }

    public void u1(p2 p2Var, o1 o1Var) {
        boolean z10 = o1Var.f10462b == null;
        i1 i1Var = p2Var.f10449a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        i1Var.W = bool;
        if (!z10) {
            bool = Boolean.FALSE;
        }
        i1Var.R = bool;
        i1Var.S = null;
        i1Var.f10359a0 = null;
        i1Var.I = fValueOf;
        i1Var.Y = b0.f10306d;
        i1Var.Z = fValueOf;
        i1Var.f10361c0 = null;
        i1Var.f10363d0 = null;
        i1Var.f10364e0 = fValueOf;
        i1Var.f10365f0 = null;
        i1Var.f10367g0 = fValueOf;
        i1Var.f10368h0 = h1.None;
        i1 i1Var2 = o1Var.f10435e;
        if (i1Var2 != null) {
            t1(p2Var, i1Var2);
        }
        ArrayList arrayList = ((p) ((bm.d) this.f10471d).f2827g).f10444b;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = ((p) ((bm.d) this.f10471d).f2827g).f10444b.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (h4.h(oVar.f10426a, o1Var)) {
                    t1(p2Var, oVar.f10427b);
                }
            }
        }
        i1 i1Var3 = o1Var.f10436f;
        if (i1Var3 != null) {
            t1(p2Var, i1Var3);
        }
    }

    public wr.b v0(dt.w wVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        dt.u uVar;
        ls.i iVar;
        p.l2 l2Var = (p.l2) this.f10470a;
        br.l.e(wVar, "container");
        rr.o0 o0Var = (rr.o0) wVar.f7549d;
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + wVar + ')').toString());
            }
            if (wVar instanceof dt.u) {
                dt.u uVar2 = (dt.u) wVar;
                if (uVar2.f7543h == ls.i.INTERFACE) {
                    return i4.l(l2Var, uVar2.f7542g.d(qs.g.e("DefaultImpls")), (ps.f) this.f10475y);
                }
            }
            if (bool.booleanValue() && (wVar instanceof dt.v)) {
                js.i iVar2 = o0Var instanceof js.i ? (js.i) o0Var : null;
                ys.b bVar = iVar2 != null ? iVar2.f13811d : null;
                if (bVar != null) {
                    String strE = bVar.e();
                    br.l.d(strE, "facadeClassName.internalName");
                    return i4.l(l2Var, qs.b.j(new qs.c(tt.s.k0(strE, '/', '.'))), (ps.f) this.f10475y);
                }
            }
        }
        if (z11 && (wVar instanceof dt.u)) {
            dt.u uVar3 = (dt.u) wVar;
            if (uVar3.f7543h == ls.i.COMPANION_OBJECT && (uVar = uVar3.f7541f) != null && ((iVar = uVar.f7543h) == ls.i.CLASS || iVar == ls.i.ENUM_CLASS || (z12 && (iVar == ls.i.INTERFACE || iVar == ls.i.ANNOTATION_CLASS)))) {
                rr.o0 o0Var2 = (rr.o0) uVar.f7549d;
                js.r rVar = o0Var2 instanceof js.r ? (js.r) o0Var2 : null;
                if (rVar != null) {
                    return rVar.f13825a;
                }
                return null;
            }
        }
        if (!(wVar instanceof dt.v) || !(o0Var instanceof js.i)) {
            return null;
        }
        js.i iVar3 = (js.i) o0Var;
        wr.b bVar2 = iVar3.f13812g;
        return bVar2 == null ? i4.l(l2Var, iVar3.a(), (ps.f) this.f10475y) : bVar2;
    }

    public void v1(hk.h hVar) {
        br.l.e(hVar, "task");
        ch.n.b("DiskTaskRepository", "updateTask() called with: task = " + hVar.f10805b);
        synchronized (((qj.a) this.f10470a)) {
            V0(hVar);
            ((qj.a) this.f10470a).k((hi.a) this.f10473r, ((hi.a) this.f10473r).k((rj.f) ((xj.i) this.f10471d).g(hVar)));
        }
    }

    public void w(hk.h hVar) {
        br.l.e(hVar, "task");
        ch.n.b("DiskTaskRepository", "addCurrentlyRunningTask() called with: task = " + hVar.f10805b);
        ch.n.b("DiskTaskRepository", c7.a.o(hVar, new StringBuilder(), " Adding to currently running tasks"));
        if (o1(hVar)) {
            ((AtomicBoolean) this.f10475y).set(true);
        }
        p pVar = (p) this.f10472g;
        synchronized (pVar.f10444b) {
            try {
                Iterator it = pVar.f10444b.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    } else if (((hk.h) it.next()).f10804a == hVar.f10804a) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    pVar.f10444b.set(i10, hVar);
                } else {
                    pVar.f10444b.add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ch.n.b("DiskTaskRepository", "addCurrentlyRunningTask() task added with result: = 1");
    }

    public String w0() {
        WifiInfo wifiInfoZ0 = z0();
        String ssid = wifiInfoZ0 != null ? wifiInfoZ0.getSSID() : null;
        Charset charset = zh.f.f27419a;
        return (ssid == null || ssid.length() == 0 || ssid.charAt(0) != '\"' || ssid.charAt(ssid.length() - 1) != '\"') ? ssid : ssid.substring(1, ssid.length() - 1);
    }

    public void w1(File file) throws IOException {
        ic.b bVar = (ic.b) this.f10474x;
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f10473r;
        FileInputStream fileInputStreamJ = null;
        try {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                br.l.d(threadCurrentThread, "currentThread(...)");
                cVar.b(threadCurrentThread);
                ak.t tVarI = ((hk.k) this.f10472g).i();
                String str = tVarI.f703h;
                File fileG = bVar.g(file);
                zc.d dVar = (zc.d) this.f10475y;
                String str2 = tVarI.k;
                dVar.getClass();
                String strA = zc.d.a(fileG, str2, str);
                ak.d0 d0Var = ((ak.g) ((q3.a) this.f10471d).f20680g).f529f.f463q;
                URLConnection uRLConnectionOpenConnection = new URL(d0Var.f501f).openConnection();
                br.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                i1(httpsURLConnection);
                DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                fileInputStreamJ = xu.d.j(fileG, new FileInputStream(fileG));
                y(dataOutputStream, fileInputStreamJ, fileG.getAbsolutePath(), fileG);
                x(dataOutputStream, "resettableid", str);
                x(dataOutputStream, "packagename", ((Context) this.f10470a).getPackageName());
                x(dataOutputStream, "report", d0Var.f497b);
                x(dataOutputStream, "hash", strA);
                dataOutputStream.writeBytes("--*****--\r\n");
                if (httpsURLConnection.getResponseCode() == 200) {
                    fileG.delete();
                }
                httpsURLConnection.getResponseCode();
            } catch (Exception e4) {
                cj.a.E(e4, "Failed to upload mlvis zip file");
            }
            ic.a.v(fileInputStreamJ);
            Thread threadCurrentThread2 = Thread.currentThread();
            br.l.d(threadCurrentThread2, "currentThread(...)");
            cVar.B(threadCurrentThread2);
        } catch (Throwable th2) {
            ic.a.v(fileInputStreamJ);
            Thread threadCurrentThread3 = Thread.currentThread();
            br.l.d(threadCurrentThread3, "currentThread(...)");
            cVar.B(threadCurrentThread3);
            throw th2;
        }
    }

    public ColorStateList x0(Context context, int i10) {
        if (i10 == h.e.abc_edit_text_material) {
            return h3.c.c(context, h.c.abc_tint_edittext);
        }
        if (i10 == h.e.abc_switch_track_mtrl_alpha) {
            return h3.c.c(context, h.c.abc_tint_switch_track);
        }
        if (i10 != h.e.abc_switch_thumb_material) {
            if (i10 == h.e.abc_btn_default_mtrl_shape) {
                return N(context, p.h2.c(context, h.a.colorButtonNormal));
            }
            if (i10 == h.e.abc_btn_borderless_material) {
                return N(context, 0);
            }
            if (i10 == h.e.abc_btn_colored_material) {
                return N(context, p.h2.c(context, h.a.colorAccent));
            }
            if (i10 == h.e.abc_spinner_mtrl_am_alpha || i10 == h.e.abc_spinner_textfield_background_material) {
                return h3.c.c(context, h.c.abc_tint_spinner);
            }
            if (C((int[]) this.f10471d, i10)) {
                return p.h2.d(context, h.a.colorControlNormal);
            }
            if (C((int[]) this.f10474x, i10)) {
                return h3.c.c(context, h.c.abc_tint_default);
            }
            if (C((int[]) this.f10475y, i10)) {
                return h3.c.c(context, h.c.abc_tint_btn_checkable);
            }
            if (i10 == h.e.abc_seekbar_thumb_material) {
                return h3.c.c(context, h.c.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = p.h2.d(context, h.a.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = p.h2.f20067b;
            iArr2[0] = p.h2.b(context, h.a.colorSwitchThumbNormal);
            iArr[1] = p.h2.f20070e;
            iArr2[1] = p.h2.c(context, h.a.colorControlActivated);
            iArr[2] = p.h2.f20071f;
            iArr2[2] = p.h2.c(context, h.a.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = p.h2.f20067b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = p.h2.f20070e;
            iArr2[1] = p.h2.c(context, h.a.colorControlActivated);
            iArr[2] = p.h2.f20071f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void x1() {
        int iK;
        i1 i1Var = ((p2) this.f10472g).f10449a;
        r1 r1Var = i1Var.f10365f0;
        if (r1Var instanceof b0) {
            iK = ((b0) r1Var).f10308a;
        } else if (!(r1Var instanceof c0)) {
            return;
        } else {
            iK = i1Var.J.f10308a;
        }
        Float f10 = i1Var.f10367g0;
        if (f10 != null) {
            iK = K(iK, f10.floatValue());
        }
        ((Canvas) this.f10470a).drawColor(iK);
    }

    public int y0(List list, ik.a aVar) {
        int i10;
        int i11;
        synchronized (((qj.a) this.f10470a)) {
            try {
                Iterator it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    hk.h hVar = (hk.h) it.next();
                    List list2 = hVar.f10807d;
                    int i12 = 1;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (br.l.a((ik.a) it2.next(), aVar)) {
                                i11 = 1;
                                break;
                            }
                        }
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                    int i13 = i10 + i11;
                    List list3 = hVar.f10808e;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            if (br.l.a((ik.a) it3.next(), aVar)) {
                                break;
                            }
                        }
                        i12 = 0;
                    } else {
                        i12 = 0;
                    }
                    i10 = i13 + i12;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public boolean y1() {
        Boolean bool = ((p2) this.f10472g).f10449a.X;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public WifiInfo z0() {
        WifiManager wifiManager;
        if (!((ag.b) this.f10471d).i("android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) this.f10470a) == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f10470a = obj;
        this.f10471d = obj2;
        this.f10472g = obj3;
        this.f10473r = obj4;
        this.f10474x = obj5;
        this.f10475y = obj6;
    }

    public r2(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f10470a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f10472g = str;
        this.f10473r = str2;
        this.f10474x = ad.a.f337b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f10471d = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw w.g.d(it);
    }

    public r2(qj.a aVar, xj.i iVar, p pVar, hi.a aVar2, om.f fVar) {
        this.f10470a = aVar;
        this.f10471d = iVar;
        this.f10472g = pVar;
        this.f10473r = aVar2;
        this.f10474x = fVar;
        this.f10475y = new AtomicBoolean(false);
        ch.n.b("DiskTaskRepository", "init");
        synchronized (aVar) {
            c1();
        }
    }

    public r2(int i10) {
        switch (i10) {
            case 19:
                this.f10470a = new HashMap();
                this.f10471d = new HashMap();
                this.f10472g = new HashMap();
                this.f10473r = new HashMap();
                this.f10474x = new HashMap();
                this.f10475y = new HashMap();
                break;
            default:
                this.f10470a = new int[]{h.e.abc_textfield_search_default_mtrl_alpha, h.e.abc_textfield_default_mtrl_alpha, h.e.abc_ab_share_pack_mtrl_alpha};
                this.f10471d = new int[]{h.e.abc_ic_commit_search_api_mtrl_alpha, h.e.abc_seekbar_tick_mark_material, h.e.abc_ic_menu_share_mtrl_alpha, h.e.abc_ic_menu_copy_mtrl_am_alpha, h.e.abc_ic_menu_cut_mtrl_alpha, h.e.abc_ic_menu_selectall_mtrl_alpha, h.e.abc_ic_menu_paste_mtrl_am_alpha};
                this.f10472g = new int[]{h.e.abc_textfield_activated_mtrl_alpha, h.e.abc_textfield_search_activated_mtrl_alpha, h.e.abc_cab_background_top_mtrl_alpha, h.e.abc_text_cursor_material, h.e.abc_text_select_handle_left_mtrl, h.e.abc_text_select_handle_middle_mtrl, h.e.abc_text_select_handle_right_mtrl};
                this.f10473r = new int[]{h.e.abc_popup_background_mtrl_mult, h.e.abc_cab_background_internal_bg, h.e.abc_menu_hardkey_panel_mtrl_mult};
                this.f10474x = new int[]{h.e.abc_tab_indicator_material, h.e.abc_textfield_search_material};
                this.f10475y = new int[]{h.e.abc_btn_check_material, h.e.abc_btn_radio_material, h.e.abc_btn_check_material_anim, h.e.abc_btn_radio_material_anim};
                break;
        }
    }
}
