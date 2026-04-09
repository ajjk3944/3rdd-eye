package y1;

import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f25669a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(e2.k kVar) {
        SemanticsConfiguration semanticsConfigurationK = kVar.k();
        return !semanticsConfigurationK.f1191a.c(e2.p.f7741i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.view.View b(android.view.View r4, android.view.View r5, int r6) {
        /*
            r0 = 1
            r1 = -1
            r2 = 0
            if (r6 == r0) goto L33
            r0 = 2
            if (r6 == r0) goto L9
            goto L39
        L9:
            int r6 = r4.getNextFocusForwardId()
            if (r6 != r1) goto L10
            goto L39
        L10:
            y1.q r0 = new y1.q
            r1 = 1
            r0.<init>(r6, r1)
            r6 = r2
        L17:
            android.view.View r6 = i(r4, r0, r6)
            if (r6 != 0) goto L32
            if (r4 != r5) goto L20
            goto L32
        L20:
            android.view.ViewParent r6 = r4.getParent()
            if (r6 == 0) goto L31
            boolean r1 = r6 instanceof android.view.View
            if (r1 != 0) goto L2b
            goto L31
        L2b:
            android.view.View r6 = (android.view.View) r6
            r3 = r6
            r6 = r4
            r4 = r3
            goto L17
        L31:
            return r2
        L32:
            return r6
        L33:
            int r6 = r4.getId()
            if (r6 != r1) goto L3a
        L39:
            return r2
        L3a:
            c7.b r6 = new c7.b
            r0 = 28
            r6.<init>(r5, r0, r4)
            r0 = r2
        L42:
            android.view.View r0 = i(r4, r6, r0)
            if (r0 != 0) goto L5d
            if (r4 != r5) goto L4b
            goto L5d
        L4b:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L5c
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L56
            goto L5c
        L56:
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            r0 = r4
            r4 = r3
            goto L42
        L5c:
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.e0.b(android.view.View, android.view.View, int):android.view.View");
    }

    public static final qr.g c(a aVar, androidx.lifecycle.o oVar) {
        if (oVar.e1().compareTo(androidx.lifecycle.n.DESTROYED) > 0) {
            n7.a aVar2 = new n7.a(1, aVar);
            oVar.V0(aVar2);
            return new qr.g(oVar, 10, aVar2);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + oVar + "is already destroyed").toString());
    }

    public static final boolean d(e2.k kVar, Resources resources) {
        Object objG = kVar.f7717d.f1191a.g(e2.p.f7733a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !e2.n.e(kVar) && (kVar.f7717d.f1193g || (kVar.o() && ((list != null ? (String) mq.o.t0(list) : null) != null || l(kVar) != null || k(kVar, resources) != null || j(kVar))));
    }

    public static final void e(View view, ArrayList arrayList, boolean z10) {
        int i10;
        boolean z11 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z11) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z12 = viewGroup.getDescendantFocusability() == 131072;
        if (z11 && z12) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i11 = 0; i11 < childCount; i11++) {
                viewArr[i11] = viewGroup.getChildAt(i11);
            }
            u.z zVar = i1.f25708a;
            boolean z13 = viewGroup.getLayoutDirection() == 1;
            oh.f fVar = i1.f25713f;
            u.z zVar2 = i1.f25708a;
            u.a0 a0Var = i1.f25711d;
            if (childCount < 2) {
                i10 = 0;
            } else {
                int i12 = childCount - zVar2.f23135b;
                i10 = 0;
                for (int i13 = 0; i13 < i12; i13++) {
                    zVar2.a(new Rect());
                }
                for (int i14 = 0; i14 < childCount; i14++) {
                    View view2 = viewArr[i14];
                    int i15 = i1.f25709b;
                    i1.f25709b = i15 + 1;
                    Rect rect = (Rect) zVar2.e(i15);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    a0Var.l(view2, rect);
                }
                mq.l.y0(viewArr, i1.f25712e);
                Object objG = a0Var.g(viewArr[0]);
                br.l.b(objG);
                int iMax = ((Rect) objG).bottom;
                i1.f25710c = z13 ? -1 : 1;
                int i16 = 0;
                for (int i17 = 0; i17 < childCount; i17++) {
                    Object objG2 = a0Var.g(viewArr[i17]);
                    br.l.b(objG2);
                    Rect rect2 = (Rect) objG2;
                    if (rect2.top >= iMax) {
                        if (i17 - i16 > 1) {
                            mq.l.z0(viewArr, fVar, i16, i17);
                        }
                        iMax = rect2.bottom;
                        i16 = i17;
                    } else {
                        iMax = Math.max(iMax, rect2.bottom);
                    }
                }
                if (childCount - i16 > 1) {
                    mq.l.z0(viewArr, fVar, i16, childCount);
                }
                i1.f25709b = 0;
                a0Var.a();
            }
            for (int i18 = i10; i18 < childCount; i18++) {
                e(viewArr[i18], arrayList, z10);
            }
        }
        if (z11 && !z12 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void f(e2.k kVar, v3.c cVar) {
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        u.a0 a0Var = semanticsConfiguration.f1191a;
        Object objG = semanticsConfiguration.f1191a.g(e2.p.f7751u);
        if (objG == null) {
            objG = null;
        }
        e2.f fVar = (e2.f) objG;
        if (a(kVar)) {
            if (fVar != null && fVar.f7685a == 8) {
                return;
            }
            Object objG2 = a0Var.g(e2.g.f7705v);
            if (objG2 == null) {
                objG2 = null;
            }
            e2.a aVar = (e2.a) objG2;
            if (aVar != null) {
                cVar.b(new v3.b(R.id.accessibilityActionPageUp, aVar.f7677a));
            }
            Object objG3 = a0Var.g(e2.g.f7707x);
            if (objG3 == null) {
                objG3 = null;
            }
            e2.a aVar2 = (e2.a) objG3;
            if (aVar2 != null) {
                cVar.b(new v3.b(R.id.accessibilityActionPageDown, aVar2.f7677a));
            }
            Object objG4 = a0Var.g(e2.g.f7706w);
            if (objG4 == null) {
                objG4 = null;
            }
            e2.a aVar3 = (e2.a) objG4;
            if (aVar3 != null) {
                cVar.b(new v3.b(R.id.accessibilityActionPageLeft, aVar3.f7677a));
            }
            Object objG5 = a0Var.g(e2.g.f7708y);
            e2.a aVar4 = (e2.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                cVar.b(new v3.b(R.id.accessibilityActionPageRight, aVar4.f7677a));
            }
        }
    }

    public static final boolean g(Object obj) {
        if (obj instanceof x0.m) {
            x0.m mVar = (x0.m) obj;
            if (mVar.i() == n0.t0.f17318g || mVar.i() == n0.t0.f17321y || mVar.i() == n0.t0.f17319r) {
                Object value = mVar.getValue();
                if (value == null) {
                    return true;
                }
                return g(value);
            }
        } else {
            if ((obj instanceof lq.e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i10 = 0; i10 < 7; i10++) {
                if (f25669a[i10].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float h(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final View i(View view, ar.k kVar, View view2) {
        View viewI;
        if (((Boolean) kVar.a(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (viewI = i(childAt, kVar, view2)) != null) {
                return viewI;
            }
        }
        return null;
    }

    public static final boolean j(e2.k kVar) {
        Object objG = kVar.f7717d.f1191a.g(e2.p.E);
        if (objG == null) {
            objG = null;
        }
        g2.a aVar = (g2.a) objG;
        u.a0 a0Var = kVar.f7717d.f1191a;
        Object objG2 = a0Var.g(e2.p.f7751u);
        if (objG2 == null) {
            objG2 = null;
        }
        e2.f fVar = (e2.f) objG2;
        boolean z10 = aVar != null;
        Object objG3 = a0Var.g(e2.p.D);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (fVar != null && fVar.f7685a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String k(e2.k kVar, Resources resources) throws Resources.NotFoundException {
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        SemanticsConfiguration semanticsConfiguration2 = kVar.f7717d;
        Object objG = semanticsConfiguration.f1191a.g(e2.p.f7734b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        u.a0 a0Var = semanticsConfiguration2.f1191a;
        Object objG2 = a0Var.g(e2.p.E);
        if (objG2 == null) {
            objG2 = null;
        }
        g2.a aVar = (g2.a) objG2;
        Object objG3 = a0Var.g(e2.p.f7751u);
        if (objG3 == null) {
            objG3 = null;
        }
        e2.f fVar = (e2.f) objG3;
        if (aVar != null) {
            int i10 = y.f25813a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new bf.n();
                    }
                    if (objG == null) {
                        objG = resources.getString(z0.o.indeterminate);
                    }
                } else if (fVar != null && fVar.f7685a == 2 && objG == null) {
                    objG = resources.getString(z0.o.state_off);
                }
            } else if (fVar != null && fVar.f7685a == 2 && objG == null) {
                objG = resources.getString(z0.o.state_on);
            }
        }
        Object objG4 = a0Var.g(e2.p.D);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((fVar == null || fVar.f7685a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(z0.o.selected) : resources.getString(z0.o.not_selected);
            }
        }
        Object objG5 = a0Var.g(e2.p.f7735c);
        if (objG5 == null) {
            objG5 = null;
        }
        e2.e eVar = (e2.e) objG5;
        if (eVar != null) {
            if (eVar != e2.e.f7683b) {
                if (objG == null) {
                    objG = resources.getString(z0.o.template_percent, 0);
                }
            } else if (objG == null) {
                objG = resources.getString(z0.o.in_progress);
            }
        }
        e2.s sVar = e2.p.B;
        if (a0Var.c(sVar)) {
            u.a0 a0Var2 = new e2.k(kVar.f7714a, true, kVar.f7716c, semanticsConfiguration2).k().f1191a;
            Object objG6 = a0Var2.g(e2.p.f7733a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = a0Var2.g(e2.p.f7754x);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = a0Var2.g(sVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(z0.o.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final h2.f l(e2.k kVar) {
        SemanticsConfiguration semanticsConfiguration = kVar.f7717d;
        e2.s sVar = e2.p.f7733a;
        h2.f fVar = (h2.f) e2.n.d(semanticsConfiguration, e2.p.B);
        List list = (List) e2.n.d(kVar.f7717d, e2.p.f7754x);
        return fVar == null ? list != null ? (h2.f) mq.o.t0(list) : null : fVar;
    }

    public static boolean m() {
        try {
            if (AndroidComposeView.f1151b1 == null) {
                AndroidComposeView.f1151b1 = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.f1152c1 == null) {
                Class cls = AndroidComposeView.f1151b1;
                AndroidComposeView.f1152c1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.f1152c1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return br.l.a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final h2.g0 n(SemanticsConfiguration semanticsConfiguration) {
        ar.k kVar;
        ArrayList arrayList = new ArrayList();
        Object objG = semanticsConfiguration.f1191a.g(e2.g.f7686a);
        if (objG == null) {
            objG = null;
        }
        e2.a aVar = (e2.a) objG;
        if (aVar == null || (kVar = (ar.k) aVar.f7678b) == null || !((Boolean) kVar.a(arrayList)).booleanValue()) {
            return null;
        }
        return (h2.g0) arrayList.get(0);
    }

    public static final boolean o(float[] fArr, float[] fArr2) {
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

    public static final boolean p(float f10, float f11, g1.i iVar) {
        Path.Direction direction;
        f1.c cVar = new f1.c(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        g1.i iVarA = g1.l.a();
        g1.c0 c0Var = g1.c0.CounterClockwise;
        float f12 = cVar.f8404a;
        boolean zIsNaN = Float.isNaN(f12);
        float f13 = cVar.f8407d;
        float f14 = cVar.f8406c;
        float f15 = cVar.f8405b;
        if (zIsNaN || Float.isNaN(f15) || Float.isNaN(f14) || Float.isNaN(f13)) {
            g1.l.b("Invalid rectangle, make sure no value is NaN");
        }
        if (iVarA.f9239b == null) {
            iVarA.f9239b = new RectF();
        }
        RectF rectF = iVarA.f9239b;
        br.l.b(rectF);
        rectF.set(f12, f15, f14, f13);
        Path path = iVarA.f9238a;
        RectF rectF2 = iVarA.f9239b;
        br.l.b(rectF2);
        int i10 = g1.k.f9253a[c0Var.ordinal()];
        if (i10 == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i10 != 2) {
                throw new bf.n();
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
        g1.i iVarA2 = g1.l.a();
        iVarA2.getClass();
        Path.Op op = Path.Op.INTERSECT;
        Path path2 = iVarA2.f9238a;
        if (!(iVar instanceof g1.i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path3 = iVar.f9238a;
        if (!(iVarA instanceof g1.i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.op(path3, iVarA.f9238a, op);
        boolean zIsEmpty = iVarA2.f9238a.isEmpty();
        iVarA2.b();
        iVarA.b();
        return !zIsEmpty;
    }

    public static final boolean q(float f10, float f11, float f12, float f13, long j) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void r(float[] fArr, float[] fArr2) {
        float fH = h(0, 0, fArr2, fArr);
        float fH2 = h(0, 1, fArr2, fArr);
        float fH3 = h(0, 2, fArr2, fArr);
        float fH4 = h(0, 3, fArr2, fArr);
        float fH5 = h(1, 0, fArr2, fArr);
        float fH6 = h(1, 1, fArr2, fArr);
        float fH7 = h(1, 2, fArr2, fArr);
        float fH8 = h(1, 3, fArr2, fArr);
        float fH9 = h(2, 0, fArr2, fArr);
        float fH10 = h(2, 1, fArr2, fArr);
        float fH11 = h(2, 2, fArr2, fArr);
        float fH12 = h(2, 3, fArr2, fArr);
        float fH13 = h(3, 0, fArr2, fArr);
        float fH14 = h(3, 1, fArr2, fArr);
        float fH15 = h(3, 2, fArr2, fArr);
        float fH16 = h(3, 3, fArr2, fArr);
        fArr[0] = fH;
        fArr[1] = fH2;
        fArr[2] = fH3;
        fArr[3] = fH4;
        fArr[4] = fH5;
        fArr[5] = fH6;
        fArr[6] = fH7;
        fArr[7] = fH8;
        fArr[8] = fH9;
        fArr[9] = fH10;
        fArr[10] = fH11;
        fArr[11] = fH12;
        fArr[12] = fH13;
        fArr[13] = fH14;
        fArr[14] = fH15;
        fArr[15] = fH16;
    }

    public static final void s(r0 r0Var, int i10) {
        Object next;
        Iterator<T> it = r0Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((x1.f0) ((Map.Entry) next).getKey()).f24799c == i10) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String t(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String u(int i10) {
        if (i10 == 0) {
            return "android.widget.Button";
        }
        if (i10 == 1) {
            return "android.widget.CheckBox";
        }
        if (i10 == 3) {
            return "android.widget.RadioButton";
        }
        if (i10 == 5) {
            return "android.widget.ImageView";
        }
        if (i10 == 6) {
            return "android.widget.Spinner";
        }
        if (i10 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
