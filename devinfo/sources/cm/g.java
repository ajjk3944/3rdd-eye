package cm;

import a0.v;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.lifecycle.u;
import c0.c1;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.internal.play_billing.y3;
import com.liuzh.deviceinfo.R;
import e4.u0;
import e4.v0;
import g0.a0;
import j2.a1;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p1.z;
import t2.q;
import u0.m1;
import u0.p;
import xk.x;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2965a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2966b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2967c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f2968d;

    public static final List F(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : s(list.get(0)) : s.f38317a;
    }

    public static final int H(int i4, float f10) {
        return (i4 & 16777215) | (((int) ((f10 * 255.0f) + 0.5f)) << 24);
    }

    public static final float I(long j, float f10, d3.c cVar) {
        float fC;
        long jB = d3.n.b(j);
        if (d3.o.a(jB, 4294967296L)) {
            if (cVar.F() <= 1.05d) {
                return cVar.W(j);
            }
            fC = d3.n.c(j) / d3.n.c(cVar.x(f10));
        } else {
            if (!d3.o.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = d3.n.c(j);
        }
        return fC * f10;
    }

    public static final Object J(mk.e eVar) {
        Thread.interrupted();
        return x.z(ck.i.f2898a, new u(eVar, null));
    }

    public static final void K(Spannable spannable, long j, int i4, int i10) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(z.u(j)), i4, i10, 33);
        }
    }

    public static final void L(Spannable spannable, long j, d3.c cVar, int i4, int i10) {
        long jB = d3.n.b(j);
        if (d3.o.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(pk.a.s(cVar.W(j)), false), i4, i10, 33);
        } else if (d3.o.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(d3.n.c(j)), i4, i10, 33);
        }
    }

    public static final void M(Spannable spannable, y2.c cVar, int i4, int i10) {
        LocaleSpan localeSpan;
        if (cVar != null) {
            List list = cVar.f37320a;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(zj.o.T(cVar, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y2.b) it.next()).f37318a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = a3.a.c(a3.a.b((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? y2.e.f37322a.b().a() : cVar.a()).f37318a);
            }
            spannable.setSpan(localeSpan, i4, i10, 33);
        }
    }

    public static void N() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static String O(long j) {
        int i4 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + com.bumptech.glide.c.u(Float.intBitsToFloat(i4)) + ')';
        }
        return "CornerRadius.elliptical(" + com.bumptech.glide.c.u(Float.intBitsToFloat(i4)) + ", " + com.bumptech.glide.c.u(Float.intBitsToFloat(i10)) + ')';
    }

    public static final double P(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static void Q(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int R(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 != 3) {
            return i4 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ boolean S(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, y3 y3Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(y3Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(y3Var) != obj && atomicReferenceFieldUpdater.get(y3Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final void a(final i1.n nVar, final i0.u uVar, a0 a0Var, final g0.d dVar, i1.c cVar, d0.k kVar, boolean z3, c0.j jVar, final mk.c cVar2, p pVar, final int i4) {
        final a0 a0Var2;
        final i1.c cVar3;
        final d0.k kVar2;
        final boolean z10;
        final c0.j jVar2;
        Object jVar3;
        c0.j jVar4;
        int i10;
        d0.k kVar3;
        boolean z11;
        pVar.X(53695811);
        int i11 = i4 | (pVar.f(nVar) ? 4 : 2) | (pVar.f(uVar) ? 32 : 16) | 46861696 | (pVar.h(cVar2) ? 536870912 : 268435456);
        if (pVar.O(i11 & 1, (306783379 & i11) != 306783378)) {
            pVar.T();
            if ((i4 & 1) == 0 || pVar.y()) {
                float f10 = 0;
                a0 a0Var3 = new a0(f10, f10, f10, f10);
                i1.c cVar4 = i1.b.f25540l;
                float f11 = z.f.f37799a;
                d3.c cVar5 = (d3.c) pVar.j(a1.f27074h);
                boolean zC = pVar.c(cVar5.a());
                Object objL = pVar.L();
                Object obj = u0.l.f34851a;
                if (zC || objL == obj) {
                    objL = new v(new z.e(cVar5));
                    pVar.g0(objL);
                }
                v vVar = (v) objL;
                boolean zF = pVar.f(vVar);
                Object objL2 = pVar.L();
                if (zF || objL2 == obj) {
                    objL2 = new d0.k(vVar);
                    pVar.g0(objL2);
                }
                d0.k kVar4 = (d0.k) objL2;
                u0.a0 a0Var4 = c1.f2379a;
                pVar.W(282942128);
                c0.k kVar5 = (c0.k) pVar.j(c1.f2379a);
                if (kVar5 == null) {
                    pVar.p(false);
                    jVar4 = null;
                    a0Var = a0Var3;
                } else {
                    boolean zF2 = pVar.f(kVar5);
                    Object objL3 = pVar.L();
                    if (zF2 || objL3 == obj) {
                        a0Var = a0Var3;
                        jVar3 = new c0.j(kVar5.f2454a, kVar5.f2455b, kVar5.f2456c, kVar5.f2457d);
                        pVar.g0(jVar3);
                    } else {
                        a0Var = a0Var3;
                        jVar3 = objL3;
                    }
                    pVar.p(false);
                    jVar4 = (c0.j) jVar3;
                }
                i10 = i11 & (-238551041);
                cVar3 = cVar4;
                kVar3 = kVar4;
                z11 = true;
            } else {
                pVar.R();
                i10 = i11 & (-238551041);
                cVar3 = cVar;
                kVar3 = kVar;
                z11 = z3;
                jVar4 = jVar;
            }
            a0 a0Var5 = a0Var;
            pVar.q();
            com.bumptech.glide.c.b(nVar, uVar, a0Var5, kVar3, z11, jVar4, cVar3, dVar, cVar2, pVar, 806882688 | (i10 & 14) | 24576 | (i10 & AppLovinMediationAdapter.ERROR_CHILD_USER), 6 | ((i10 >> 18) & 7168));
            kVar2 = kVar3;
            z10 = z11;
            jVar2 = jVar4;
            a0Var2 = a0Var5;
        } else {
            pVar.R();
            a0Var2 = a0Var;
            cVar3 = cVar;
            kVar2 = kVar;
            z10 = z3;
            jVar2 = jVar;
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new mk.e(uVar, a0Var2, dVar, cVar3, kVar2, z10, jVar2, cVar2, i4) { // from class: i0.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f25403b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a0 f25404c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ g0.d f25405d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i1.c f25406e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d0.k f25407f;
                public final /* synthetic */ boolean g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ c0.j f25408h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ mk.c f25409i;

                @Override // mk.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iZ = u0.q.z(24577);
                    cm.g.a(this.f25402a, this.f25403b, this.f25404c, this.f25405d, this.f25406e, this.f25407f, this.g, this.f25408h, this.f25409i, (u0.p) obj2, iZ);
                    return yj.u.f37649a;
                }
            };
        }
    }

    public static ArrayList b(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new zj.k(objArr, true));
    }

    public static int c(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        nk.k.e(arrayList, "<this>");
        int size2 = arrayList.size();
        int i4 = 0;
        if (size < 0) {
            throw new IllegalArgumentException(r5.c.i(0, "fromIndex (", ") is greater than toIndex (", size, ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException(r5.c.i(size, "toIndex (", ") is greater than size (", size2, ")."));
        }
        int i10 = size - 1;
        while (i4 <= i10) {
            int i11 = (i4 + i10) >>> 1;
            int iF = pk.a.f((Comparable) arrayList.get(i11), comparable);
            if (iF < 0) {
                i4 = i11 + 1;
            } else {
                if (iF <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static ak.c d(ak.c cVar) {
        cVar.i();
        cVar.f438c = true;
        return cVar.f437b > 0 ? cVar : ak.c.f435d;
    }

    public static final void e(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                wd.b.a(th2, th3);
            }
        }
    }

    public static ak.c f() {
        return new ak.c(10);
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = v0.f22405a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = u0.f22400d;
        u0 u0Var = (u0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (u0Var == null) {
            u0Var = new u0();
            u0Var.f22401a = null;
            u0Var.f22402b = null;
            u0Var.f22403c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, u0Var);
        }
        WeakReference weakReference2 = u0Var.f22403c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        u0Var.f22403c = new WeakReference(keyEvent);
        if (u0Var.f22402b == null) {
            u0Var.f22402b = new SparseArray();
        }
        SparseArray sparseArray = u0Var.f22402b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean h(e4.l lVar, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (lVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return lVar.a(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f2965a) {
                            try {
                                f2966b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f2965a = true;
                        }
                        Method method = f2966b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (v0.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2967c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2968d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2967c = true;
                }
                Field field = f2968d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (v0.d(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && v0.d(view, keyEvent)) || lVar.a(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(long j, long j8) {
        return j == j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be A[LOOP:0: B:65:0x00b8->B:67:0x00be, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static gg.a j(android.content.pm.PackageInfo r26, android.content.pm.PackageManager r27) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.g.j(android.content.pm.PackageInfo, android.content.pm.PackageManager):gg.a");
    }

    public static final int l(int i4, Context context) {
        nk.k.e(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        nk.k.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static final ColorStateList m(int i4, Context context) {
        nk.k.e(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        nk.k.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        nk.k.b(colorStateList);
        return colorStateList;
    }

    public static final int n(int i4, Context context) {
        nk.k.e(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i4});
        nk.k.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static final Drawable o(Context context) {
        nk.k.e(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        nk.k.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        nk.k.b(drawable);
        return drawable;
    }

    public static final float p(Layout layout, int i4, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i4);
        ThreadLocal threadLocal = q.f34154a;
        if (layout.getEllipsisCount(i4) <= 0 || layout.getParagraphDirection(i4) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i4) + layout.getLineStart(i4)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if ((paragraphAlignment == null ? -1 : u2.d.f35038a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float q(Layout layout, int i4, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = q.f34154a;
        if (layout.getEllipsisCount(i4) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i4) != -1 || layout.getWidth() >= layout.getLineRight(i4)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i4) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i4) + layout.getLineStart(i4)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if ((paragraphAlignment != null ? u2.d.f35038a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i4);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i4);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static int r(List list) {
        nk.k.e(list, "<this>");
        return list.size() - 1;
    }

    public static List s(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        nk.k.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List t(Object... objArr) {
        nk.k.e(objArr, "elements");
        return objArr.length > 0 ? zj.m.I(objArr) : s.f38317a;
    }

    public static void u(aj.b bVar, ImageView imageView, ImageView imageView2) throws Resources.NotFoundException {
        Object file;
        if (bVar == null) {
            return;
        }
        String str = bVar.f410e;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
            imageView2.setAlpha(1.0f);
            ContextWrapper contextWrapper = (ContextWrapper) jm.a.f27720a.f1134b;
            Drawable drawable = contextWrapper.getDrawable(wi.g.c(wi.c.i(str)));
            if (drawable == null) {
                drawable = contextWrapper.getDrawable(R.drawable.bu_ic_doc_generic);
            }
            imageView2.setImageDrawable(drawable);
        }
        if (((ec.x) jm.a.f27720a.f1136d) == null) {
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                imageView2.setAlpha(0.0f);
            }
            imageView.setVisibility(0);
            com.bumptech.glide.p pVarD = com.bumptech.glide.b.d(imageView);
            pVarD.i(Drawable.class).C(bVar.c()).B(new eg.j(imageView, imageView2, 1)).z(imageView);
            return;
        }
        imageView.setVisibility(4);
        int dimensionPixelSize = ((ContextWrapper) jm.a.f27720a.f1134b).getResources().getDimensionPixelSize(R.dimen.icon_size);
        new Point(dimensionPixelSize, dimensionPixelSize);
        eg.j jVar = new eg.j(imageView2, imageView, 0);
        com.bumptech.glide.p pVarD2 = com.bumptech.glide.b.d(imageView);
        pVarD2.getClass();
        pVarD2.j(new com.bumptech.glide.n(imageView));
        nk.k.d(str, "getNodeName(...)");
        String strB = wi.g.b(wi.c.i(str));
        nk.k.d(strB, "getTypeNameFromMimeType(...)");
        String lowerCase = strB.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 96796) {
            if (iHashCode != 100313435) {
                if (iHashCode != 112202875 || !lowerCase.equals("video")) {
                    return;
                }
            } else if (!lowerCase.equals("image")) {
                return;
            }
        } else if (!lowerCase.equals("apk")) {
            return;
        }
        com.bumptech.glide.p pVarD3 = com.bumptech.glide.b.d(imageView);
        if (lowerCase.equals("apk")) {
            String strC = bVar.c();
            nk.k.d(strC, "getPath(...)");
            file = new ei.c(strC);
        } else {
            file = new File(bVar.c());
        }
        pVarD3.i(Drawable.class).C(file).v(jVar).z(imageView);
    }

    public static ArrayList v(Object... objArr) {
        nk.k.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new zj.k(objArr, true));
    }

    public abstract void B(String str);

    public abstract void E(km.o oVar);

    public abstract g G(nk.e eVar, Object obj);

    public abstract Object k(nk.e eVar);

    public abstract void x(pi.b bVar);

    public void A() {
    }

    public void w() {
    }

    public void y() {
    }

    public void C(i0.f fVar) {
    }

    public void D(n.a aVar) {
    }

    public void z(km.o oVar) {
    }
}
