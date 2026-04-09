package me;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.DragEvent;
import android.view.View;
import android.widget.RemoteViews;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.splash.SplashActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class t1 {
    public static final Object C(Object[] objArr, f1.k kVar, mk.a aVar, u0.p pVar, int i4) {
        f1.k kVar2;
        final Object obj;
        Object objC;
        final Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        long j = pVar.T;
        com.bumptech.glide.d.g(36);
        final String string = Long.toString(j, 36);
        nk.k.d(string, "toString(...)");
        nk.k.c(kVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final f1.g gVar = (f1.g) pVar.j(f1.i.f23623a);
        Object objL = pVar.L();
        Object obj2 = u0.l.f34851a;
        if (objL == obj2) {
            Object objF = (gVar == null || (objC = gVar.c(string)) == null) ? null : kVar.f(objC);
            if (objF == null) {
                objF = aVar.invoke();
            }
            kVar2 = kVar;
            Object bVar = new f1.b(kVar2, gVar, string, objF, objArrCopyOf);
            pVar.g0(bVar);
            objL = bVar;
        } else {
            kVar2 = kVar;
        }
        final f1.b bVar2 = (f1.b) objL;
        Object objInvoke = Arrays.equals(objArrCopyOf, bVar2.f23610e) ? bVar2.f23609d : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zH = pVar.h(bVar2) | pVar.h(kVar2) | pVar.h(gVar) | pVar.f(string) | pVar.h(objInvoke) | pVar.h(objArrCopyOf);
        Object objL2 = pVar.L();
        if (zH || objL2 == obj2) {
            obj = objInvoke;
            final f1.k kVar3 = kVar2;
            Object obj3 = new mk.a() { // from class: f1.a
                @Override // mk.a
                public final Object invoke() {
                    boolean z3;
                    b bVar3 = bVar2;
                    g gVar2 = bVar3.f23607b;
                    g gVar3 = gVar;
                    boolean z10 = true;
                    if (gVar2 != gVar3) {
                        bVar3.f23607b = gVar3;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String str = bVar3.f23608c;
                    String str2 = string;
                    if (nk.k.a(str, str2)) {
                        z10 = z3;
                    } else {
                        bVar3.f23608c = str2;
                    }
                    bVar3.f23606a = kVar3;
                    bVar3.f23609d = obj;
                    bVar3.f23610e = objArrCopyOf;
                    f fVar = bVar3.f23611f;
                    if (fVar != null && z10) {
                        ((yb.e) fVar).z();
                        bVar3.f23611f = null;
                        bVar3.c();
                    }
                    return u.f37649a;
                }
            };
            pVar.g0(obj3);
            objL2 = obj3;
        } else {
            obj = objInvoke;
        }
        v0.l0 l0Var = pVar.M.f35556b.f35553e;
        l0Var.X(v0.b0.f35565c);
        pd.b.q(l0Var, 0, (mk.a) objL2);
        return obj;
    }

    public static final long F(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static String J(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i4 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(K(objArr[i4]));
            i10 = iIndexOf + 2;
            i4++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i4 < length) {
            String str2 = " [";
            while (i4 < objArr.length) {
                sb2.append(str2);
                sb2.append(K(objArr[i4]));
                i4++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String K(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM = r5.c.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strM.length() + 8 + name2.length() + 1);
            je.u.B(sb2, "<", strM, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final j1.e a(String str) {
        Set setSingleton = Collections.singleton(str);
        nk.k.d(setSingleton, "singleton(...)");
        return new j1.e(setSingleton);
    }

    public static final void b(Logger logger, ul.a aVar, ul.c cVar, String str) {
        logger.fine(cVar.f35537b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f35530a);
    }

    public static final void c(int i4, StringBuilder sb2) {
        for (int i10 = 0; i10 < i4; i10++) {
            sb2.append("?");
            if (i10 < i4 - 1) {
                sb2.append(",");
            }
        }
    }

    public static final Object d(vd.b bVar, ek.j jVar) throws Throwable {
        try {
            if (bVar.isDone()) {
                return h3.g.h(bVar);
            }
            xk.h hVar = new xk.h(1, a.a.r(jVar));
            bVar.a(new h3.n(bVar, hVar, 0), h3.l.f24840a);
            hVar.u(new c2.l0(4, bVar));
            return hVar.r();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            yj.d dVar = new yj.d();
            nk.k.j(dVar, nk.k.class.getName());
            throw dVar;
        }
    }

    public static final RemoteViews e(Context context) {
        nk.k.e(context, "context");
        RemoteViews remoteViews = new RemoteViews("com.liuzh.deviceinfo", R.layout.widget_not_agree_privacy);
        remoteViews.setOnClickPendingIntent(R.id.open_app, PendingIntent.getActivity(context, 210125, new Intent(context, (Class<?>) SplashActivity.class), ii.a.c(134217728)));
        return remoteViews;
    }

    public static final Bitmap h(Context context, int i4, float f10) {
        nk.k.e(context, "context");
        int iB = a4.a.b(33.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, iB, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        int iB2 = a4.a.b(f10);
        paint.setStrokeWidth(iB2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(context.getColor(R.color.widget_progress_bg_color));
        int i10 = (iB2 / 2) + 1;
        float f11 = i10;
        float f12 = iB - i10;
        canvas.drawArc(f11, f11, f12, f12, 0.0f, 360.0f, false, paint);
        paint.setColor(context.getColor(R.color.colorPrimary));
        canvas.drawArc(f11, f11, f12, f12, -90.0f, (i4 / 100.0f) * 360, false, paint);
        return bitmapCreateBitmap;
    }

    public static final h3.k i(c7.l lVar, String str, mk.a aVar) {
        nk.k.e(lVar, "<this>");
        return jm.a.n(new ah.d(lVar, str, aVar, 18));
    }

    public static final String j(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? je.u.s((j - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder()) : j <= -999500 ? je.u.s((j - 500000) / 1000000, " ms", new StringBuilder()) : j <= 0 ? je.u.s((j - 500) / 1000, " µs", new StringBuilder()) : j < 999500 ? je.u.s((j + 500) / 1000, " µs", new StringBuilder()) : j < 999500000 ? je.u.s((j + 500000) / 1000000, " ms", new StringBuilder()) : je.u.s((j + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder())}, 1));
    }

    public static final String k(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final String[] n(j1.o oVar) {
        nk.k.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((j1.e) oVar).f27049b.toArray(new String[0]);
    }

    public static final long p(jf.c cVar) {
        DragEvent dragEvent = (DragEvent) cVar.f27642b;
        float x10 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }

    public static h3.k v(ck.h hVar, mk.e eVar) {
        nk.k.e(hVar, "context");
        return jm.a.n(new ah.d(hVar, xk.w.f37244a, eVar));
    }

    public abstract void A(View view, int i4, int i10);

    public abstract void B(View view, float f10, float f11);

    public abstract void D(boolean z3);

    public abstract void E(boolean z3);

    public abstract boolean G(int i4, View view);

    public abstract TransformationMethod H(TransformationMethod transformationMethod);

    public abstract long I();

    public abstract int f(int i4, View view);

    public abstract int g(int i4, View view);

    public abstract Method l(Class cls, Field field);

    public abstract Constructor m(Class cls);

    public abstract InputFilter[] o(InputFilter[] inputFilterArr);

    public abstract String[] q(Class cls);

    public int r(View view) {
        return 0;
    }

    public int s() {
        return 0;
    }

    public abstract boolean t();

    public abstract boolean u(Class cls);

    public abstract void w(int i4);

    public abstract void x(Typeface typeface, boolean z3);

    public abstract void z(int i4);

    public void y(int i4, View view) {
    }
}
