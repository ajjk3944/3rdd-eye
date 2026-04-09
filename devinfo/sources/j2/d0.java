package j2;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d0 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f27107a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(p2.p pVar) {
        p2.l lVarK = pVar.k();
        return !lVarK.f31095a.c(p2.t.f31121i);
    }

    public static final boolean c(p2.p pVar, Resources resources) {
        Object objG = pVar.f31104d.f31095a.g(p2.t.f31114a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !p2.s.e(pVar) && (pVar.f31104d.f31097c || (pVar.o() && ((list != null ? (String) zj.n.d0(list) : null) != null || j(pVar) != null || i(pVar, resources) != null || h(pVar))));
    }

    public static final void d(f4.f fVar, p2.p pVar) {
        p2.l lVar = pVar.f31104d;
        x.e0 e0Var = lVar.f31095a;
        Object objG = lVar.f31095a.g(p2.t.f31134w);
        if (objG == null) {
            objG = null;
        }
        p2.h hVar = (p2.h) objG;
        if (b(pVar)) {
            if (hVar != null && hVar.f31050a == 8) {
                return;
            }
            Object objG2 = e0Var.g(p2.k.f31092x);
            if (objG2 == null) {
                objG2 = null;
            }
            p2.a aVar = (p2.a) objG2;
            if (aVar != null) {
                fVar.b(new f4.c(R.id.accessibilityActionPageUp, aVar.f31036a));
            }
            Object objG3 = e0Var.g(p2.k.f31094z);
            if (objG3 == null) {
                objG3 = null;
            }
            p2.a aVar2 = (p2.a) objG3;
            if (aVar2 != null) {
                fVar.b(new f4.c(R.id.accessibilityActionPageDown, aVar2.f31036a));
            }
            Object objG4 = e0Var.g(p2.k.f31093y);
            if (objG4 == null) {
                objG4 = null;
            }
            p2.a aVar3 = (p2.a) objG4;
            if (aVar3 != null) {
                fVar.b(new f4.c(R.id.accessibilityActionPageLeft, aVar3.f31036a));
            }
            Object objG5 = e0Var.g(p2.k.A);
            p2.a aVar4 = (p2.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                fVar.b(new f4.c(R.id.accessibilityActionPageRight, aVar4.f31036a));
            }
        }
    }

    public static final c1 e(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            d3.e eVarA = com.bumptech.glide.f.a(context);
            long jA = com.google.android.gms.internal.play_billing.m1.a(configuration.screenWidthDp, configuration.screenHeightDp);
            long jM = d.h.m(jA, eVarA);
            return new c1((4294967295L & ((int) Float.intBitsToFloat((int) (jM & 4294967295L)))) | (((int) Float.intBitsToFloat((int) (jM >> 32))) << 32), jA);
        }
        r6.c.f32841a.getClass();
        r6.b bVar = r6.b.f32839a;
        r6.d dVar = r6.b.f32840b;
        nk.k.e(dVar, "it");
        int i4 = Build.VERSION.SDK_INT;
        q6.a aVar = (i4 >= 34 ? s6.f.f33482c : i4 >= 30 ? s6.d.f33480c : s6.c.f33477h).c((ContextWrapper) baseContext, dVar.f32842b).f32837a;
        aVar.getClass();
        int iWidth = new Rect(aVar.f32195a, aVar.f32196b, aVar.f32197c, aVar.f32198d).width();
        aVar.getClass();
        long jHeight = (iWidth << 32) | (new Rect(aVar.f32195a, aVar.f32196b, aVar.f32197c, aVar.f32198d).height() & 4294967295L);
        d3.e eVarA2 = com.bumptech.glide.f.a(baseContext);
        long jF = me.t1.F(jHeight);
        return new c1(jHeight, jF != 9205357640488583168L ? com.google.android.gms.internal.play_billing.m1.a(eVarA2.D(Float.intBitsToFloat((int) (jF >> 32))), eVarA2.D(Float.intBitsToFloat((int) (4294967295L & jF)))) : 9205357640488583168L);
    }

    public static final boolean f(Object obj) {
        if (obj instanceof g1.n) {
            g1.n nVar = (g1.n) obj;
            if (nVar.b() == u0.e.f34769d || nVar.b() == u0.e.g || nVar.b() == u0.e.f34770e) {
                Object value = nVar.getValue();
                if (value == null) {
                    return true;
                }
                return f(value);
            }
        } else {
            if ((obj instanceof yj.c) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i4 = 0; i4 < 7; i4++) {
                if (f27107a[i4].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float g(float[] fArr, int i4, float[] fArr2, int i10) {
        int i11 = i4 * 4;
        return (fArr[i11 + 3] * fArr2[12 + i10]) + (fArr[i11 + 2] * fArr2[8 + i10]) + (fArr[i11 + 1] * fArr2[4 + i10]) + (fArr[i11] * fArr2[i10]);
    }

    public static final boolean h(p2.p pVar) {
        Object objG = pVar.f31104d.f31095a.g(p2.t.G);
        if (objG == null) {
            objG = null;
        }
        r2.a aVar = (r2.a) objG;
        x.e0 e0Var = pVar.f31104d.f31095a;
        Object objG2 = e0Var.g(p2.t.f31134w);
        if (objG2 == null) {
            objG2 = null;
        }
        p2.h hVar = (p2.h) objG2;
        boolean z3 = aVar != null;
        Object objG3 = e0Var.g(p2.t.F);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (hVar != null && hVar.f31050a == 4)) {
            return z3;
        }
        return true;
    }

    public static final String i(p2.p pVar, Resources resources) throws Resources.NotFoundException {
        p2.l lVar = pVar.f31104d;
        p2.l lVar2 = pVar.f31104d;
        Object objG = lVar.f31095a.g(p2.t.f31115b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        x.e0 e0Var = lVar2.f31095a;
        Object objG2 = e0Var.g(p2.t.G);
        if (objG2 == null) {
            objG2 = null;
        }
        r2.a aVar = (r2.a) objG2;
        Object objG3 = e0Var.g(p2.t.f31134w);
        if (objG3 == null) {
            objG3 = null;
        }
        p2.h hVar = (p2.h) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new ac.m();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.liuzh.deviceinfo.R.string.indeterminate);
                    }
                } else if (hVar != null && hVar.f31050a == 2 && objG == null) {
                    objG = resources.getString(com.liuzh.deviceinfo.R.string.state_off);
                }
            } else if (hVar != null && hVar.f31050a == 2 && objG == null) {
                objG = resources.getString(com.liuzh.deviceinfo.R.string.state_on);
            }
        }
        Object objG4 = e0Var.g(p2.t.F);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((hVar == null || hVar.f31050a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.liuzh.deviceinfo.R.string.selected) : resources.getString(com.liuzh.deviceinfo.R.string.not_selected);
            }
        }
        Object objG5 = e0Var.g(p2.t.f31116c);
        if (objG5 == null) {
            objG5 = null;
        }
        p2.g gVar = (p2.g) objG5;
        if (gVar != null) {
            if (gVar != p2.g.f31048b) {
                if (objG == null) {
                    objG = resources.getString(com.liuzh.deviceinfo.R.string.template_percent, 0);
                }
            } else if (objG == null) {
                objG = resources.getString(com.liuzh.deviceinfo.R.string.in_progress);
            }
        }
        p2.w wVar = p2.t.D;
        if (e0Var.c(wVar)) {
            x.e0 e0Var2 = new p2.p(pVar.f31101a, true, pVar.f31103c, lVar2).k().f31095a;
            Object objG6 = e0Var2.g(p2.t.f31114a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = e0Var2.g(p2.t.f31137z);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = e0Var2.g(wVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.liuzh.deviceinfo.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final s2.e j(p2.p pVar) {
        p2.l lVar = pVar.f31104d;
        p2.w wVar = p2.t.f31114a;
        s2.e eVar = (s2.e) p2.s.d(lVar, p2.t.D);
        List list = (List) p2.s.d(pVar.f31104d, p2.t.f31137z);
        return eVar == null ? list != null ? (s2.e) zj.n.d0(list) : null : eVar;
    }

    public static boolean k() {
        try {
            if (r.J0 == null) {
                r.J0 = Class.forName("android.os.SystemProperties");
            }
            if (r.K0 == null) {
                Class cls = r.J0;
                r.K0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = r.K0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return nk.k.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final s2.e0 l(p2.l lVar) {
        mk.c cVar;
        ArrayList arrayList = new ArrayList();
        Object objG = lVar.f31095a.g(p2.k.f31071a);
        if (objG == null) {
            objG = null;
        }
        p2.a aVar = (p2.a) objG;
        if (aVar == null || (cVar = (mk.c) aVar.f31037b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (s2.e0) arrayList.get(0);
    }

    public static final boolean m(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
            fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
            fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
            fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
            fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
            float f41 = -f22;
            fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
            fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
            fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
            fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
            fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
            fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
            fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
            fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
            fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
            fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        }
        return !(f38 == 0.0f);
    }

    public static final boolean n(float f10, float f11, p1.j jVar) {
        float f12 = f10 - 0.005f;
        float f13 = f11 - 0.005f;
        float f14 = f10 + 0.005f;
        float f15 = f11 + 0.005f;
        p1.j jVarA = p1.l.a();
        if (Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15)) {
            p1.l.b("Invalid rectangle, make sure no value is NaN");
        }
        if (jVarA.f30987b == null) {
            jVarA.f30987b = new RectF();
        }
        RectF rectF = jVarA.f30987b;
        nk.k.b(rectF);
        rectF.set(f12, f13, f14, f15);
        Path path = jVarA.f30986a;
        RectF rectF2 = jVarA.f30987b;
        nk.k.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        p1.j jVarA2 = p1.l.a();
        jVarA2.b(jVar, jVarA, 1);
        boolean zIsEmpty = jVarA2.f30986a.isEmpty();
        jVarA2.c();
        jVarA.c();
        return !zIsEmpty;
    }

    public static final boolean o(float f10, float f11, float f12, float f13, long j) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void p(float[] fArr, float[] fArr2) {
        float fG = g(fArr2, 0, fArr, 0);
        float fG2 = g(fArr2, 0, fArr, 1);
        float fG3 = g(fArr2, 0, fArr, 2);
        float fG4 = g(fArr2, 0, fArr, 3);
        float fG5 = g(fArr2, 1, fArr, 0);
        float fG6 = g(fArr2, 1, fArr, 1);
        float fG7 = g(fArr2, 1, fArr, 2);
        float fG8 = g(fArr2, 1, fArr, 3);
        float fG9 = g(fArr2, 2, fArr, 0);
        float fG10 = g(fArr2, 2, fArr, 1);
        float fG11 = g(fArr2, 2, fArr, 2);
        float fG12 = g(fArr2, 2, fArr, 3);
        float fG13 = g(fArr2, 3, fArr, 0);
        float fG14 = g(fArr2, 3, fArr, 1);
        float fG15 = g(fArr2, 3, fArr, 2);
        float fG16 = g(fArr2, 3, fArr, 3);
        fArr[0] = fG;
        fArr[1] = fG2;
        fArr[2] = fG3;
        fArr[3] = fG4;
        fArr[4] = fG5;
        fArr[5] = fG6;
        fArr[6] = fG7;
        fArr[7] = fG8;
        fArr[8] = fG9;
        fArr[9] = fG10;
        fArr[10] = fG11;
        fArr[11] = fG12;
        fArr[12] = fG13;
        fArr[13] = fG14;
        fArr[14] = fG15;
        fArr[15] = fG16;
    }

    public static final g3.j q(o0 o0Var, int i4) {
        Object next;
        Iterator<T> it = o0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((i2.e0) ((Map.Entry) next).getKey()).f25628b == i4) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (g3.j) entry.getValue();
        }
        return null;
    }

    public static final String r(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String s(int i4) {
        if (i4 == 0) {
            return "android.widget.Button";
        }
        if (i4 == 1) {
            return "android.widget.CheckBox";
        }
        if (i4 == 3) {
            return "android.widget.RadioButton";
        }
        if (i4 == 5) {
            return "android.widget.ImageView";
        }
        if (i4 == 6) {
            return "android.widget.Spinner";
        }
        if (i4 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
