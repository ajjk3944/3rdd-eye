package ic;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import at.j;
import at.n;
import bc.f0;
import br.l;
import ca.p;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.measurement.y3;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase;
import com.staircase3.opensignal.utils.d;
import com.staircase3.opensignal.utils.e;
import fb.f;
import g1.r;
import h2.b0;
import h2.j0;
import ht.x;
import i7.k;
import io.sentry.g4;
import io.sentry.u0;
import io.sentry.z4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Proxy;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js.h;
import js.m;
import lq.q;
import org.json.JSONException;
import org.json.JSONObject;
import ou.z;
import p.a2;
import p.q0;
import t2.i;
import tt.s;
import y3.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f11321a;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f11322d;

    public static final long A(long j, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j : r.b(j, r.d(j) * f10);
    }

    public static f0 D(String str) throws ProtocolException, NumberFormatException {
        z zVar;
        int i10;
        String strSubstring;
        l.e(str, "statusLine");
        if (s.n0(str, "HTTP/1.", false)) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                zVar = z.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                zVar = z.HTTP_1_1;
            }
        } else {
            if (!s.n0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            zVar = z.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i10, i11);
            l.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i12 = Integer.parseInt(strSubstring2);
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
                l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new f0(zVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static Metadata E(ca.l lVar, boolean z10) {
        p5.b bVar = z10 ? null : ua.b.f23506r;
        f fVar = new f(10);
        Metadata metadataS = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.p(fVar.f8800a, 0, 10);
                fVar.y(0);
                if (fVar.q() != 4801587) {
                    break;
                }
                fVar.z(3);
                int iN = fVar.n();
                int i11 = iN + 10;
                if (metadataS == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(fVar.f8800a, 0, bArr, 0, 10);
                    lVar.p(bArr, 10, iN);
                    metadataS = new ua.b(bVar).S(i11, bArr);
                } else {
                    lVar.g(iN);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.l();
        lVar.g(i10);
        if (metadataS == null || metadataS.f4241a.length == 0) {
            return null;
        }
        return metadataS;
    }

    public static final void F(Bundle bundle, String str, Enum r22) {
        bundle.putString(str, r22 != null ? r22.name() : null);
    }

    public static p G(f fVar) {
        fVar.z(1);
        int iQ = fVar.q();
        long j = fVar.f8801b + iQ;
        int i10 = iQ / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long j7 = fVar.j();
            if (j7 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = j7;
            jArrCopyOf2[i11] = fVar.j();
            fVar.z(2);
            i11++;
        }
        fVar.z((int) (j - fVar.f8801b));
        return new p(jArrCopyOf, jArrCopyOf2);
    }

    public static final ds.c H(cj.a aVar, hs.b bVar) {
        l.e(aVar, "<this>");
        l.e(bVar, "annotationsOwner");
        return new ds.c(aVar, bVar, false);
    }

    public static final long I(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void J(g4 g4Var, i4.b bVar, u0 u0Var) {
        if (g4Var.f12268a != null) {
            bVar.I("event_id");
            bVar.S(u0Var, g4Var.f12268a);
        }
        bVar.I("contexts");
        bVar.S(u0Var, g4Var.f12269d);
        if (g4Var.f12270g != null) {
            bVar.I("sdk");
            bVar.S(u0Var, g4Var.f12270g);
        }
        if (g4Var.f12271r != null) {
            bVar.I("request");
            bVar.S(u0Var, g4Var.f12271r);
        }
        AbstractMap abstractMap = g4Var.f12272x;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            bVar.I("tags");
            bVar.S(u0Var, g4Var.f12272x);
        }
        if (g4Var.f12273y != null) {
            bVar.I("release");
            bVar.V(g4Var.f12273y);
        }
        if (g4Var.B != null) {
            bVar.I("environment");
            bVar.V(g4Var.B);
        }
        if (g4Var.D != null) {
            bVar.I("platform");
            bVar.V(g4Var.D);
        }
        if (g4Var.E != null) {
            bVar.I("user");
            bVar.S(u0Var, g4Var.E);
        }
        if (g4Var.G != null) {
            bVar.I("server_name");
            bVar.V(g4Var.G);
        }
        if (g4Var.H != null) {
            bVar.I("dist");
            bVar.V(g4Var.H);
        }
        List list = g4Var.I;
        if (list != null && !list.isEmpty()) {
            bVar.I("breadcrumbs");
            bVar.S(u0Var, g4Var.I);
        }
        if (g4Var.J != null) {
            bVar.I("debug_meta");
            bVar.S(u0Var, g4Var.J);
        }
        AbstractMap abstractMap2 = g4Var.K;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        bVar.I("extra");
        bVar.S(u0Var, g4Var.K);
    }

    public static void K(TextView textView, int i10) {
        se.b.l(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            i3.a.o(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void L(TextView textView, int i10) {
        se.b.l(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void M(TextView textView, int i10) {
        se.b.l(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public static void N(View view, com.staircase3.opensignal.utils.f fVar, e eVar, d dVar) {
        view.setVisibility(0);
        boolean z10 = true;
        ObjectAnimator objectAnimatorOfFloat = null;
        if (fVar == com.staircase3.opensignal.utils.f.TOP) {
            int i10 = com.staircase3.opensignal.utils.c.f6179a[eVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", (-view.getHeight()) * 2, 0.0f);
                }
                z10 = false;
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, (-view.getHeight()) * 2);
            }
        } else if (fVar != com.staircase3.opensignal.utils.f.BOTTOM) {
            z10 = false;
        } else {
            int i11 = com.staircase3.opensignal.utils.c.f6179a[eVar.ordinal()];
            if (i11 == 1) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getHeight() * 2, 0.0f);
            } else if (i11 == 2) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight() * 2);
            }
            z10 = false;
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.addListener(new com.staircase3.opensignal.utils.b(z10, view, dVar, 0));
        }
        objectAnimatorOfFloat.setDuration(200L).start();
    }

    public static final long O(long j, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final String P(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static ActionMode.Callback Q(ActionMode.Callback callback) {
        return (!(callback instanceof g) || Build.VERSION.SDK_INT < 26) ? callback : ((g) callback).f25833a;
    }

    public static ActionMode.Callback R(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }

    public static void b(String str) {
        z4.d().a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.lifecycle.o r6, rq.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof q8.c
            if (r0 == 0) goto L13
            r0 = r7
            q8.c r0 = (q8.c) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            q8.c r0 = new q8.c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20729y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            br.w r6 = r0.f20728x
            androidx.lifecycle.o r0 = r0.f20727r
            lf.t1.G(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            lf.t1.G(r7)
            androidx.lifecycle.n r7 = r6.e1()
            androidx.lifecycle.n r2 = androidx.lifecycle.n.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L47
            goto L7a
        L47:
            br.w r7 = new br.w
            r7.<init>()
            r0.f20727r = r6     // Catch: java.lang.Throwable -> L7b
            r0.f20728x = r7     // Catch: java.lang.Throwable -> L7b
            r0.B = r4     // Catch: java.lang.Throwable -> L7b
            wt.g r2 = new wt.g     // Catch: java.lang.Throwable -> L7b
            pq.c r0 = xu.l.D(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.v()     // Catch: java.lang.Throwable -> L7b
            q8.d r0 = new q8.d     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            r7.f2917a = r0     // Catch: java.lang.Throwable -> L7b
            r6.V0(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.u()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f2917a
            androidx.lifecycle.u r6 = (androidx.lifecycle.u) r6
            if (r6 == 0) goto L7a
            r0.m1(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f2917a
            androidx.lifecycle.u r6 = (androidx.lifecycle.u) r6
            if (r6 == 0) goto L89
            r0.m1(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a.c(androidx.lifecycle.o, rq.c):java.lang.Object");
    }

    public static final Object e(Object obj, boolean z10) {
        ys.c cVar;
        l.e(obj, "possiblyPrimitiveType");
        if (!z10) {
            return obj;
        }
        m mVar = (m) obj;
        if (!(mVar instanceof js.l) || (cVar = ((js.l) mVar).f13815i) == null) {
            return mVar;
        }
        String strE = ys.b.c(cVar.getWrapperFqName()).e();
        l.d(strE, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return h.d(strE);
    }

    public static final void g(Closeable closeable, Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                ir.f0.c(th2, th3);
            }
        }
    }

    public static ou.s i(ou.s sVar, ou.s sVar2) {
        fh.f fVar = new fh.f(2);
        int size = sVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strB = sVar.b(i10);
            String strD = sVar.d(i10);
            if ((!"Warning".equalsIgnoreCase(strB) || !s.n0(strD, "1", false)) && ("Content-Length".equalsIgnoreCase(strB) || "Content-Encoding".equalsIgnoreCase(strB) || "Content-Type".equalsIgnoreCase(strB) || !w(strB) || sVar2.a(strB) == null)) {
                fVar.d(strB, strD);
            }
        }
        int size2 = sVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strB2 = sVar2.b(i11);
            if (!"Content-Length".equalsIgnoreCase(strB2) && !"Content-Encoding".equalsIgnoreCase(strB2) && !"Content-Type".equalsIgnoreCase(strB2) && w(strB2)) {
                fVar.d(strB2, sVar2.d(i11));
            }
        }
        return fVar.f();
    }

    public static n j(String str, Collection collection) {
        l.e(str, "message");
        l.e(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(mq.p.a0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x) it.next()).W());
        }
        rt.f fVarE = y3.E(arrayList);
        int i10 = fVarE.f21790a;
        n aVar = i10 != 0 ? i10 != 1 ? new at.a(str, (n[]) fVarE.toArray(new n[0])) : (n) fVarE.get(0) : at.m.f2303b;
        return fVarE.f21790a <= 1 ? aVar : new j(aVar);
    }

    public static final Object k(Class cls, Map map, List list) throws IllegalArgumentException {
        l.e(cls, "annotationClass");
        l.e(list, "methods");
        q qVarF = kc.f.F(new ht.g(27, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new mr.d(cls, map, kc.f.F(new ah.d(cls, 29, map)), qVarF, list));
        l.c(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static void n(View view) {
        view.setVisibility(0);
        ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(300).start();
    }

    public static g0.b o(g0.b bVar, i iVar, j0 j0Var, t2.c cVar, k2.g gVar) {
        if (bVar != null && iVar == bVar.f9126a && b0.e(j0Var, iVar).equals(bVar.f9127b) && cVar.getDensity() == bVar.f9128c.f22382b && gVar == bVar.f9129d) {
            return bVar;
        }
        g0.b bVar2 = g0.b.f9125h;
        if (bVar2 != null && iVar == bVar2.f9126a && b0.e(j0Var, iVar).equals(bVar2.f9127b) && cVar.getDensity() == bVar2.f9128c.f22382b && gVar == bVar2.f9129d) {
            return bVar2;
        }
        g0.b bVar3 = new g0.b(iVar, b0.e(j0Var, iVar), new t2.d(cVar.getDensity(), cVar.y()), gVar);
        g0.b.f9125h = bVar3;
        return bVar3;
    }

    public static ni.r p(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("EsimStatusCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ni.r(xu.d.r("esim_is_enabled", jSONObject), xu.d.K("esim_os_version", jSONObject), xu.d.y("esim_card_id_for_default_euicc", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("EsimStatusCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String q(java.lang.Object[] r8) {
        /*
            int r0 = r8.length
            if (r0 != 0) goto L4
            goto L42
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            r5 = r2
            r6 = r4
        L12:
            if (r5 >= r1) goto L3b
            r7 = r8[r5]
            r0.append(r6)
            if (r7 == 0) goto L32
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "null"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L32
            java.lang.String r7 = "(?s).*[\\[,\\]].*"
            boolean r7 = r6.matches(r7)
            if (r7 == 0) goto L30
            goto L32
        L30:
            r3 = r2
            goto L33
        L32:
            r6 = r4
        L33:
            r0.append(r6)
            int r5 = r5 + 1
            java.lang.String r6 = ","
            goto L12
        L3b:
            java.lang.String r8 = "]"
            r0.append(r8)
            if (r3 == 0) goto L44
        L42:
            r8 = 0
            return r8
        L44:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.a.q(java.lang.Object[]):java.lang.String");
    }

    public static Drawable r(Context context, int i10) {
        return a2.b().c(context, i10);
    }

    public static OpensignalDatabase s(Context context) {
        OpensignalDatabase opensignalDatabase;
        l.e(context, "context");
        synchronized (OpensignalDatabase.j) {
            try {
                if (OpensignalDatabase.k == null) {
                    Context applicationContext = context.getApplicationContext();
                    l.d(applicationContext, "getApplicationContext(...)");
                    if (tt.l.D0("wifi_speed_db")) {
                        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                    }
                    k kVar = new k(applicationContext);
                    kVar.a(OpensignalDatabase.f6071l);
                    kVar.a(OpensignalDatabase.f6072m);
                    kVar.a(OpensignalDatabase.f6073n);
                    kVar.a(OpensignalDatabase.f6074o);
                    OpensignalDatabase.k = kVar.b();
                }
                opensignalDatabase = OpensignalDatabase.k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return opensignalDatabase;
    }

    public static String t(List list) {
        if (list == null || list.size() == 0) {
            return "-32768";
        }
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            Object next = it.next();
            sb2.append(str);
            sb2.append(next != null ? next.toString() : "-32768");
            str = ",";
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static s3.d u(q0 q0Var) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new s3.d(i3.a.l(q0Var));
        }
        TextPaint textPaint = new TextPaint(q0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = q0Var.getBreakStrategy();
        int hyphenationFrequency = q0Var.getHyphenationFrequency();
        if (q0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i10 < 28 || (q0Var.getInputType() & 15) != 3) {
                boolean z10 = q0Var.getLayoutDirection() == 1;
                switch (q0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(i3.a.c(DecimalFormatSymbols.getInstance(q0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new s3.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void v(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                if (closeable instanceof InputStream) {
                    ((InputStream) closeable).close();
                    return;
                }
                if (closeable instanceof OutputStream) {
                    ((OutputStream) closeable).close();
                } else if (closeable instanceof Writer) {
                    ((Writer) closeable).close();
                } else if (closeable instanceof Reader) {
                    ((Reader) closeable).close();
                }
            } catch (Exception e4) {
                ch.n.d("TUUtilityFunctions", "Error closing stream.", e4);
            }
        }
    }

    public static boolean w(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static synchronized boolean x(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f11321a;
        if (context2 != null && (bool = f11322d) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f11322d = null;
        if (gc.b.e()) {
            f11322d = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f11322d = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f11322d = Boolean.FALSE;
            }
        }
        f11321a = applicationContext;
        return f11322d.booleanValue();
    }

    public static boolean y(byte b2) {
        return b2 > -65;
    }

    public static final String z(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("{");
        boolean z10 = true;
        for (String str : bundle.keySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(',');
            }
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                sb2.append(str);
                sb2.append(':');
                sb2.append(z((Bundle) obj));
            } else {
                sb2.append(str);
                sb2.append(':');
                sb2.append(obj);
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        l.d(string, "toString(...)");
        return string;
    }

    public abstract View B(int i10);

    public abstract boolean C();

    public Metadata l(pa.c cVar) {
        ByteBuffer byteBuffer = cVar.f26791r;
        byteBuffer.getClass();
        qb.b.g(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (cVar.g(Integer.MIN_VALUE)) {
            return null;
        }
        return m(cVar, byteBuffer);
    }

    public abstract Metadata m(pa.c cVar, ByteBuffer byteBuffer);
}
