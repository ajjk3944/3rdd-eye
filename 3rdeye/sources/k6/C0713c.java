package K6;

import A7.b;
import H6.C0672i;
import H6.C0675l;
import H6.C0680q;
import H6.C0683u;
import L0.ViewTreeObserverOnPreDrawListenerC0791w;
import N7.AbstractC1138d8;
import N7.AbstractC1293o4;
import N7.AbstractC1339r9;
import N7.B9;
import N7.C1130d0;
import N7.C1134d4;
import N7.C1153e8;
import N7.C1175g0;
import N7.C1179g4;
import N7.C1185ga;
import N7.C1241k8;
import N7.C1250l3;
import N7.C1332r2;
import N7.C1333r3;
import N7.C1353s9;
import N7.C1362t4;
import N7.C1370tc;
import N7.C1412wc;
import N7.C1431y3;
import N7.C3;
import N7.C9;
import N7.D3;
import N7.E5;
import N7.EnumC1195h5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.F4;
import N7.H9;
import N7.K2;
import N7.La;
import N7.Qb;
import N7.S2;
import N7.T2;
import N7.W4;
import N7.W8;
import N7.X2;
import N7.X9;
import N7.Z;
import O6.C1475a;
import O6.C1476b;
import O6.InterfaceC1478d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.C2095p;
import c9.C2097r;
import c9.C2099t;
import h7.C4422c;
import i7.C4460a;
import j7.C5198a;
import j7.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k6.C5246y;
import org.json.JSONArray;
import p6.C5467a;
import r7.C5530a;
import r7.C5533d;
import s7.AbstractC5584c;
import s7.d;
import z6.C5865d;

/* compiled from: BaseDivViewExtensions.kt */
/* renamed from: K6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713c {

    /* compiled from: BaseDivViewExtensions.kt */
    /* renamed from: K6.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3394a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3395b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f3396c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f3397d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f3398e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f3399f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f3400g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f3401h;
        public static final /* synthetic */ int[] i;

        static {
            int[] iArr = new int[H9.values().length];
            try {
                iArr[H9.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H9.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H9.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3394a = iArr;
            int[] iArr2 = new int[EnumC1305p2.values().length];
            try {
                iArr2[EnumC1305p2.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC1305p2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC1305p2.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1305p2.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1305p2.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f3395b = iArr2;
            int[] iArr3 = new int[EnumC1319q2.values().length];
            try {
                iArr3[EnumC1319q2.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC1319q2.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC1319q2.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f3396c = iArr3;
            int[] iArr4 = new int[C3.values().length];
            try {
                iArr4[C3.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[C3.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[C3.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[C3.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[C3.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[C3.SPACE_AROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[C3.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[C3.SPACE_EVENLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            f3397d = iArr4;
            int[] iArr5 = new int[D3.values().length];
            try {
                iArr5[D3.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[D3.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[D3.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[D3.SPACE_AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[D3.SPACE_BETWEEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[D3.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[D3.BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            f3398e = iArr5;
            int[] iArr6 = new int[E5.values().length];
            try {
                iArr6[E5.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[E5.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[E5.STRETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[E5.NO_SCALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            f3399f = iArr6;
            int[] iArr7 = new int[La.values().length];
            try {
                iArr7[La.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[La.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[La.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[La.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f3400g = iArr7;
            int[] iArr8 = new int[T2.values().length];
            try {
                iArr8[T2.SOURCE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[T2.SOURCE_ATOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[T2.DARKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr8[T2.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr8[T2.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[T2.SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused40) {
            }
            f3401h = iArr8;
            int[] iArr9 = new int[EnumC1195h5.values().length];
            try {
                iArr9[EnumC1195h5.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr9[EnumC1195h5.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr9[EnumC1195h5.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr9[EnumC1195h5.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            i = iArr9;
        }
    }

    /* compiled from: View.kt */
    /* renamed from: K6.c$b */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3402b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f3403c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f3404d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A7.d f3405e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C1475a f3406f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.m f3407g;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view, Bitmap bitmap, List list, A7.d dVar, C1475a c1475a, p9.l lVar) {
            this.f3402b = view;
            this.f3403c = bitmap;
            this.f3404d = list;
            this.f3405e = dVar;
            this.f3406f = c1475a;
            this.f3407g = (kotlin.jvm.internal.m) lVar;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            View view2 = this.f3402b;
            float height = view2.getHeight();
            Bitmap bitmap = this.f3403c;
            float fMax = Math.max(height / bitmap.getHeight(), view2.getWidth() / bitmap.getWidth());
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
            for (F4 f42 : this.f3404d) {
                boolean z10 = f42 instanceof F4.a;
                C1475a c1475a = this.f3406f;
                if (z10) {
                    long jLongValue = ((F4.a) f42).f5171b.f6372a.a(this.f3405e).longValue();
                    long j4 = jLongValue >> 31;
                    Integer numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
                    DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
                    kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                    bitmapCreateScaledBitmap = c1475a.a(bitmapCreateScaledBitmap, C0713c.C(numValueOf, displayMetrics));
                } else if ((f42 instanceof F4.b) && C6.r.d(view2)) {
                    bitmapCreateScaledBitmap = C1475a.b(bitmapCreateScaledBitmap);
                }
            }
            this.f3407g.invoke(bitmapCreateScaledBitmap);
        }
    }

    /* compiled from: View.kt */
    /* renamed from: K6.c$c, reason: collision with other inner class name */
    public static final class RunnableC0057c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f3408b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3409c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Qb f3410d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A7.d f3411e;

        public RunnableC0057c(View view, View view2, Qb qb, A7.d dVar) {
            this.f3408b = view;
            this.f3409c = view2;
            this.f3410d = qb;
            this.f3411e = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f3409c;
            int width = view.getWidth();
            Qb qb = this.f3410d;
            AbstractC1138d8 abstractC1138d8 = qb.f6103a;
            A7.d dVar = this.f3411e;
            view.setPivotX(C0713c.N(view, width, abstractC1138d8, dVar));
            view.setPivotY(C0713c.N(view, view.getHeight(), qb.f6104b, dVar));
        }
    }

    /* compiled from: BaseDivViewExtensions.kt */
    /* renamed from: K6.c$d */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<Double, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f3412g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(1);
            this.f3412g = view;
        }

        @Override // p9.l
        public final C1992A invoke(Double d10) {
            ((X6.e) this.f3412g).setAspectRatio((float) d10.doubleValue());
            return C1992A.f18074a;
        }
    }

    /* compiled from: BaseDivViewExtensions.kt */
    /* renamed from: K6.c$e */
    public static final class e extends kotlin.jvm.internal.m implements p9.l<Boolean, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3413g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewGroup viewGroup) {
            super(1);
            this.f3413g = viewGroup;
        }

        @Override // p9.l
        public final C1992A invoke(Boolean bool) {
            C0713c.c(this.f3413g, bool.booleanValue());
            return C1992A.f18074a;
        }
    }

    /* compiled from: BaseDivViewExtensions.kt */
    /* renamed from: K6.c$f */
    public static final class f extends kotlin.jvm.internal.m implements p9.l<View, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C0683u f3414g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C0672i f3415h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0683u c0683u, C0672i c0672i) {
            super(1);
            this.f3414g = c0683u;
            this.f3415h = c0672i;
        }

        @Override // p9.l
        public final Boolean invoke(View view) {
            View currentView = view;
            kotlin.jvm.internal.l.f(currentView, "currentView");
            if (!(currentView instanceof O6.A)) {
                return Boolean.TRUE;
            }
            O6.A a10 = (O6.A) currentView;
            Z.m div = a10.getDiv();
            if (div == null) {
                return Boolean.FALSE;
            }
            C5865d path = a10.getPath();
            if (path == null) {
                return Boolean.FALSE;
            }
            this.f3414g.b(this.f3415h, currentView, div, path.d());
            return Boolean.FALSE;
        }
    }

    /* compiled from: View.kt */
    /* renamed from: K6.c$g */
    public static final class g implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3416b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f3417c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ H6.L f3418d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C0675l f3419e;

        public g(ViewGroup viewGroup, List list, H6.L l5, C0675l c0675l) {
            this.f3416b = viewGroup;
            this.f3417c = list;
            this.f3418d = l5;
            this.f3419e = c0675l;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            view.removeOnLayoutChangeListener(this);
            Iterator it = ((Iterable) C2097r.j0(this.f3417c).f18579b).iterator();
            int i17 = 0;
            while (true) {
                ViewGroup viewGroup = this.f3416b;
                if (!(i17 < viewGroup.getChildCount()) || !it.hasNext()) {
                    return;
                }
                int i18 = i17 + 1;
                View childAt = viewGroup.getChildAt(i17);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                i7.b bVar = (i7.b) it.next();
                H6.L.j(this.f3418d, this.f3419e, bVar.f38461b, childAt, bVar.f38460a);
                i17 = i18;
            }
        }
    }

    public static final d.b A(int i, float f10, float f11, float f12, float f13, Float f14, Integer num) {
        return new d.b(i, new AbstractC5584c.b(f10 * f13, f11 * f13, f12 * f13), f14 != null ? f14.floatValue() : 0.0f, num != null ? num.intValue() : 0);
    }

    public static final int B(Long l5, DisplayMetrics metrics) {
        Integer numValueOf;
        kotlin.jvm.internal.l.f(metrics, "metrics");
        if (l5 != null) {
            long jLongValue = l5.longValue();
            long j4 = jLongValue >> 31;
            numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
        } else {
            numValueOf = null;
        }
        return C(numValueOf, metrics);
    }

    public static final <T extends Number> int C(T t10, DisplayMetrics metrics) {
        kotlin.jvm.internal.l.f(metrics, "metrics");
        return com.google.gson.internal.c.y(D(t10, metrics));
    }

    public static final <T extends Number> float D(T t10, DisplayMetrics metrics) {
        kotlin.jvm.internal.l.f(metrics, "metrics");
        return TypedValue.applyDimension(1, t10 != null ? t10.floatValue() : 0.0f, metrics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(View view, Canvas canvas) {
        C1476b divBorderDrawer;
        int iSave = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            InterfaceC1478d interfaceC1478d = view instanceof InterfaceC1478d ? (InterfaceC1478d) view : null;
            if (interfaceC1478d != null && (divBorderDrawer = interfaceC1478d.getDivBorderDrawer()) != null) {
                divBorderDrawer.e(canvas);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public static final int F(EnumC1305p2 enumC1305p2, EnumC1319q2 enumC1319q2) {
        int i;
        int i10 = enumC1305p2 == null ? -1 : a.f3395b[enumC1305p2.ordinal()];
        if (i10 == 1) {
            i = 3;
        } else if (i10 != 2) {
            i = 5;
            if (i10 != 3) {
                i = (i10 == 4 || i10 != 5) ? 8388611 : 8388613;
            }
        } else {
            i = 1;
        }
        int i11 = enumC1319q2 != null ? a.f3396c[enumC1319q2.ordinal()] : -1;
        int i12 = 48;
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 16;
            } else if (i11 == 3) {
                i12 = 80;
            }
        }
        return i12 | i;
    }

    public static final int G(C3 c32, D3 d32) {
        int i = 8388611;
        switch (c32 == null ? -1 : a.f3397d[c32.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 5;
                break;
            case 5:
                i = 8388613;
                break;
            case 6:
                i = 16777216;
                break;
            case 7:
                i = 33554432;
                break;
            case 8:
                i = 67108864;
                break;
        }
        int i10 = 48;
        switch (d32 != null ? a.f3398e[d32.ordinal()] : -1) {
            case 2:
                i10 = 16;
                break;
            case 3:
                i10 = 80;
                break;
            case 4:
                i10 = 268435456;
                break;
            case 5:
                i10 = 536870912;
                break;
            case 6:
                i10 = 1073741824;
                break;
        }
        return i10 | i;
    }

    public static final float H(long j4, H9 h92, DisplayMetrics displayMetrics) {
        int i = a.f3394a[h92.ordinal()];
        if (i == 1) {
            return D(Long.valueOf(j4), displayMetrics);
        }
        if (i == 2) {
            return X(Long.valueOf(j4), displayMetrics);
        }
        if (i == 3) {
            return j4;
        }
        throw new b9.j();
    }

    public static final ArrayList I(List list, A7.d resolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((B9) obj).isEnabled().a(resolver).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<C1370tc> J(S2 s22) {
        kotlin.jvm.internal.l.f(s22, "<this>");
        List<C1370tc> listE = s22.e();
        if (listE != null) {
            return listE;
        }
        C1370tc c1370tcT = s22.t();
        List<C1370tc> listG = c1370tcT != null ? E.u.G(c1370tcT) : null;
        return listG == null ? C2099t.f18581b : listG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0672i K(View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        O6.l lVar = view instanceof O6.l ? (O6.l) view : null;
        if (lVar != null) {
            return lVar.getBindingContext();
        }
        return null;
    }

    public static final String L(S2 s22, int i) {
        kotlin.jvm.internal.l.f(s22, "<this>");
        if (s22 instanceof X9) {
            X9 x92 = (X9) s22;
            String str = x92.f7730l;
            if (str != null) {
                return str;
            }
            String str2 = x92.f7735q;
            return str2 == null ? "" : str2;
        }
        String id = s22.getId();
        if (id != null) {
            return id;
        }
        ArrayList<String> arrayList = C5467a.f45208a;
        if (arrayList.size() <= i) {
            arrayList.ensureCapacity(i + 1);
            int size = arrayList.size();
            if (size <= i) {
                while (true) {
                    arrayList.add(size, "child#" + size);
                    if (size == i) {
                        break;
                    }
                    size++;
                }
            }
        }
        String str3 = arrayList.get(i);
        kotlin.jvm.internal.l.e(str3, "cache[index]");
        return str3;
    }

    public static final boolean M(S2 s22) {
        kotlin.jvm.internal.l.f(s22, "<this>");
        if (s22.t() != null) {
            return true;
        }
        List<C1370tc> listE = s22.e();
        if (listE != null && !listE.isEmpty()) {
            return true;
        }
        List<C1179g4> listC = s22.c();
        return (listC == null || listC.isEmpty()) ? false : true;
    }

    public static final float N(View view, int i, AbstractC1138d8 abstractC1138d8, A7.d dVar) {
        Object objC = abstractC1138d8.c();
        if (!(objC instanceof C1153e8)) {
            return objC instanceof C1241k8 ? (((float) ((C1241k8) objC).f8645a.a(dVar).doubleValue()) / 100.0f) * i : i / 2.0f;
        }
        C1153e8 c1153e8 = (C1153e8) objC;
        A7.b<Long> bVar = c1153e8.f8164b;
        if (bVar == null) {
            return i / 2.0f;
        }
        float fLongValue = bVar.a(dVar).longValue();
        int i10 = a.f3394a[c1153e8.f8163a.a(dVar).ordinal()];
        if (i10 == 1) {
            Float fValueOf = Float.valueOf(fLongValue);
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            return D(fValueOf, displayMetrics);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return fLongValue;
            }
            throw new b9.j();
        }
        Float fValueOf2 = Float.valueOf(fLongValue);
        DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics2, "resources.displayMetrics");
        return X(fValueOf2, displayMetrics2);
    }

    public static final Typeface O(int i, u6.a typefaceProvider) {
        kotlin.jvm.internal.l.f(typefaceProvider, "typefaceProvider");
        Typeface typefaceFor = typefaceProvider.getTypefaceFor(i);
        if (typefaceFor != null) {
            return typefaceFor;
        }
        Typeface DEFAULT = Typeface.DEFAULT;
        kotlin.jvm.internal.l.e(DEFAULT, "DEFAULT");
        return DEFAULT;
    }

    public static final int P(EnumC1195h5 enumC1195h5, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i = enumC1195h5 == null ? -1 : a.i[enumC1195h5.ordinal()];
        if (i == 1) {
            return 300;
        }
        if (i == 2) {
            return 400;
        }
        if (i != 3) {
            return i != 4 ? 400 : 700;
        }
        return 500;
    }

    public static final float Q(C9 c92, A7.d resolver) {
        A7.b<Double> bVar;
        kotlin.jvm.internal.l.f(c92, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (!(c92 instanceof C9.b) || (bVar = ((C9.b) c92).f5044b.f7573a) == null) {
            return 0.0f;
        }
        return (float) bVar.a(resolver).doubleValue();
    }

    public static final boolean R(X2 x22) {
        if (x22 == null) {
            return true;
        }
        if (x22.f7687a == null && x22.f7688b == null) {
            return kotlin.jvm.internal.l.b(x22.f7689c, new b.C0000b(Boolean.FALSE)) && x22.f7690d == null && x22.f7691e == null;
        }
        return false;
    }

    public static final boolean S(C1431y3 c1431y3, A7.d resolver) {
        kotlin.jvm.internal.l.f(c1431y3, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return c1431y3.f9830G.a(resolver) == C1431y3.b.HORIZONTAL;
    }

    public static final boolean T(C1431y3 c1431y3, A7.d resolver) {
        kotlin.jvm.internal.l.f(c1431y3, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (c1431y3.f9825B.a(resolver) == C1431y3.a.WRAP && c1431y3.f9830G.a(resolver) != C1431y3.b.OVERLAP) {
            if (S(c1431y3, resolver)) {
                return x(c1431y3.f9849Z, resolver);
            }
            if (x(c1431y3.f9872v, resolver)) {
                return true;
            }
            K2 k22 = c1431y3.i;
            if (k22 != null) {
                return !(((float) k22.f5615a.a(resolver).doubleValue()) == 0.0f);
            }
        }
        return false;
    }

    public static final C5865d U(S2 s22, int i, C5865d parentPath) {
        kotlin.jvm.internal.l.f(s22, "<this>");
        kotlin.jvm.internal.l.f(parentPath, "parentPath");
        String strL = L(s22, i);
        List<String> list = parentPath.f48460c;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(strL);
        return new C5865d(parentPath.f48458a, parentPath.f48459b, arrayList);
    }

    public static final void V(View view, C6.a accessibilityStateProvider) {
        kotlin.jvm.internal.l.f(accessibilityStateProvider, "accessibilityStateProvider");
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "view.context");
        if (accessibilityStateProvider.a(context)) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? I0.m.g() : AccessibilityEvent.obtain(32));
        }
    }

    public static final int W(Long l5, DisplayMetrics metrics) {
        Integer numValueOf;
        kotlin.jvm.internal.l.f(metrics, "metrics");
        if (l5 != null) {
            long jLongValue = l5.longValue();
            long j4 = jLongValue >> 31;
            numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
        } else {
            numValueOf = null;
        }
        return com.google.gson.internal.c.y(X(numValueOf, metrics));
    }

    public static final <T extends Number> float X(T t10, DisplayMetrics metrics) {
        kotlin.jvm.internal.l.f(metrics, "metrics");
        return TypedValue.applyDimension(2, t10 != null ? t10.floatValue() : 0.0f, metrics);
    }

    public static final EnumC1305p2 Y(C3 c32) {
        kotlin.jvm.internal.l.f(c32, "<this>");
        int i = a.f3397d[c32.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? EnumC1305p2.START : EnumC1305p2.END : EnumC1305p2.START : EnumC1305p2.RIGHT : EnumC1305p2.CENTER : EnumC1305p2.LEFT;
    }

    public static final EnumC1319q2 Z(D3 d32) {
        kotlin.jvm.internal.l.f(d32, "<this>");
        int i = a.f3398e[d32.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 7 ? EnumC1319q2.TOP : EnumC1319q2.BASELINE : EnumC1319q2.BOTTOM : EnumC1319q2.CENTER : EnumC1319q2.TOP;
    }

    public static final void a(View view, EnumC1305p2 enumC1305p2, EnumC1319q2 enumC1319q2) {
        kotlin.jvm.internal.l.f(view, "<this>");
        int iF = F(enumC1305p2, enumC1319q2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C5533d) {
            C5533d c5533d = (C5533d) layoutParams;
            if (c5533d.f45758a != iF) {
                c5533d.f45758a = iF;
                view.requestLayout();
            }
        } else {
            Objects.toString(view.getTag());
            Objects.toString(layoutParams);
            int i = C4422c.f38270a;
            C7.a aVar = C7.a.ERROR;
        }
        boolean z10 = enumC1319q2 == EnumC1319q2.BASELINE;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        C5533d c5533d2 = layoutParams2 instanceof C5533d ? (C5533d) layoutParams2 : null;
        if (c5533d2 == null || c5533d2.f45759b == z10) {
            return;
        }
        c5533d2.f45759b = z10;
        view.requestLayout();
    }

    public static final int a0(H9 h92) {
        kotlin.jvm.internal.l.f(h92, "<this>");
        int i = a.f3394a[h92.ordinal()];
        int i10 = 1;
        if (i != 1) {
            i10 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 0;
                }
                throw new b9.j();
            }
        }
        return i10;
    }

    public static final void b(View view, C0672i context, Bitmap bitmap, List<? extends F4> list, p9.l<? super Bitmap, C1992A> lVar) {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        List<? extends F4> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            lVar.invoke(bitmap);
            return;
        }
        C1475a c1475aE = context.f2146a.getDiv2Component$div_release().e();
        boolean zC = C6.r.c(view);
        A7.d dVar = context.f2147b;
        if (!zC || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new b(view, bitmap, list, dVar, c1475aE, lVar));
            return;
        }
        float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
        for (F4 f42 : list) {
            if (f42 instanceof F4.a) {
                long jLongValue = ((F4.a) f42).f5171b.f6372a.a(dVar).longValue();
                long j4 = jLongValue >> 31;
                Integer numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
                bitmapCreateScaledBitmap = c1475aE.a(bitmapCreateScaledBitmap, C(numValueOf, displayMetrics));
            } else if ((f42 instanceof F4.b) && C6.r.d(view)) {
                bitmapCreateScaledBitmap = C1475a.b(bitmapCreateScaledBitmap);
            }
        }
        lVar.invoke(bitmapCreateScaledBitmap);
    }

    public static final Drawable b0(AbstractC1293o4 abstractC1293o4, DisplayMetrics metrics, A7.d resolver) {
        kotlin.jvm.internal.l.f(abstractC1293o4, "<this>");
        kotlin.jvm.internal.l.f(metrics, "metrics");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (!(abstractC1293o4 instanceof AbstractC1293o4.a)) {
            throw new b9.j();
        }
        C1353s9 c1353s9 = ((AbstractC1293o4.a) abstractC1293o4).f8855b;
        kotlin.jvm.internal.l.f(c1353s9, "<this>");
        AbstractC1339r9 abstractC1339r9 = c1353s9.f9188b;
        boolean z10 = abstractC1339r9 instanceof AbstractC1339r9.b;
        A7.b<Integer> bVar = c1353s9.f9187a;
        Float fValueOf = null;
        C1185ga c1185ga = c1353s9.f9189c;
        if (z10) {
            W8 w82 = ((AbstractC1339r9.b) abstractC1339r9).f9080b;
            float fJ0 = j0(w82.f7622d, metrics, resolver);
            float fJ02 = j0(w82.f7621c, metrics, resolver);
            A7.b<Integer> bVar2 = w82.f7619a;
            if (bVar2 != null) {
                bVar = bVar2;
            }
            int iIntValue = bVar.a(resolver).intValue();
            float fJ03 = j0(w82.f7620b, metrics, resolver);
            C1185ga c1185ga2 = w82.f7623e;
            C1185ga c1185ga3 = c1185ga2 == null ? c1185ga : c1185ga2;
            Integer numA = c1185ga3 != null ? c1185ga3.f8299a.a(resolver) : null;
            if (c1185ga2 != null) {
                c1185ga = c1185ga2;
            }
            if (c1185ga != null) {
                Double dA = c1185ga.f8302d.a(resolver);
                H9 unit = c1185ga.f8301c.a(resolver);
                kotlin.jvm.internal.l.f(unit, "unit");
                fValueOf = Float.valueOf(TypedValue.applyDimension(a0(unit), dA != null ? dA.floatValue() : 0.0f, metrics));
            }
            return new j7.e(new e.a(fJ0, fJ02, iIntValue, fJ03, numA, fValueOf));
        }
        if (!(abstractC1339r9 instanceof AbstractC1339r9.a)) {
            return null;
        }
        C1250l3 c1250l3 = ((AbstractC1339r9.a) abstractC1339r9).f9079b;
        float fJ04 = j0(c1250l3.f8728b, metrics, resolver);
        A7.b<Integer> bVar3 = c1250l3.f8727a;
        if (bVar3 != null) {
            bVar = bVar3;
        }
        int iIntValue2 = bVar.a(resolver).intValue();
        C1185ga c1185ga4 = c1250l3.f8729c;
        C1185ga c1185ga5 = c1185ga4 == null ? c1185ga : c1185ga4;
        Integer numA2 = c1185ga5 != null ? c1185ga5.f8299a.a(resolver) : null;
        if (c1185ga4 != null) {
            c1185ga = c1185ga4;
        }
        if (c1185ga != null) {
            Double dA2 = c1185ga.f8302d.a(resolver);
            H9 unit2 = c1185ga.f8301c.a(resolver);
            kotlin.jvm.internal.l.f(unit2, "unit");
            fValueOf = Float.valueOf(TypedValue.applyDimension(a0(unit2), dA2 != null ? dA2.floatValue() : 0.0f, metrics));
        }
        return new C5198a(new C5198a.C0479a(fJ04, iIntValue2, numA2, fValueOf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ViewGroup viewGroup, boolean z10) {
        kotlin.jvm.internal.l.f(viewGroup, "<this>");
        O6.l lVar = viewGroup instanceof O6.l ? (O6.l) viewGroup : null;
        if (lVar != null) {
            lVar.setNeedClipping(z10);
        }
        ViewParent parent = viewGroup.getParent();
        if (z10 || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    public static final C5530a.EnumC0523a c0(E5 e52) {
        kotlin.jvm.internal.l.f(e52, "<this>");
        int i = a.f3399f[e52.ordinal()];
        if (i == 1) {
            return C5530a.EnumC0523a.FILL;
        }
        if (i == 2) {
            return C5530a.EnumC0523a.FIT;
        }
        if (i == 3) {
            return C5530a.EnumC0523a.STRETCH;
        }
        if (i == 4) {
            return C5530a.EnumC0523a.NO_SCALE;
        }
        throw new b9.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(View view, C0672i context, C1175g0 c1175g0, List<C1175g0> list, List<C1175g0> list2, List<C1175g0> list3, List<C1175g0> list4, List<C1175g0> list5, List<C1175g0> list6, List<C1175g0> list7, C1332r2 actionAnimation, C1130d0 c1130d0, A7.b<Boolean> captureFocusOnAction) {
        List<C1175g0> listG;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(actionAnimation, "actionAnimation");
        kotlin.jvm.internal.l.f(captureFocusOnAction, "captureFocusOnAction");
        C0745n c0745nK = context.f2146a.getDiv2Component$div_release().k();
        List<C1175g0> list8 = list;
        if (list8 == null || list8.isEmpty()) {
            listG = c1175g0 != null ? E.u.G(c1175g0) : null;
        } else {
            listG = list;
        }
        A7.d dVar = context.f2147b;
        C0751q c0751q = new C0751q(listG, dVar, list3, list2, list4, list5, list6, list7, c0745nK, context, view, actionAnimation, c1130d0, captureFocusOnAction);
        A9.I.d(view, listG, dVar, new F7.h(c0751q, 2));
        A9.I.d(view, list2, dVar, new C9.r(c0751q, 2));
        A9.I.d(view, list3, dVar, new C0749p(c0751q, 0));
        C0680q c0680q = new C0680q(c0751q, 1);
        if (view instanceof i7.k) {
            ((i7.k) view).b(captureFocusOnAction.d(dVar, c0680q));
        }
        c0751q.invoke();
    }

    public static final int d0(C9 c92, DisplayMetrics displayMetrics, A7.d resolver, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (c92 == null) {
            return -2;
        }
        if (c92 instanceof C9.b) {
            return -1;
        }
        if (c92 instanceof C9.a) {
            return h0(((C9.a) c92).f5043b, displayMetrics, resolver);
        }
        if (!(c92 instanceof C9.c)) {
            throw new b9.j();
        }
        A7.b<Boolean> bVar = ((C9.c) c92).f5045b.f9737a;
        return (bVar != null && bVar.a(resolver).booleanValue() && (layoutParams instanceof C5533d)) ? -3 : -2;
    }

    public static final void e(TextView textView, int i, H9 unit) {
        kotlin.jvm.internal.l.f(textView, "<this>");
        kotlin.jvm.internal.l.f(unit, "unit");
        textView.setTextSize(a0(unit), i);
    }

    public static final PorterDuff.Mode e0(T2 t22) {
        kotlin.jvm.internal.l.f(t22, "<this>");
        switch (a.f3401h[t22.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new b9.j();
        }
    }

    public static final void f(A7.d resolver, S2 div, View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        C9 height = div.getHeight();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
        int iD0 = d0(height, displayMetrics, resolver, view.getLayoutParams());
        if (view.getLayoutParams().height != iD0) {
            view.getLayoutParams().height = iD0;
            view.requestLayout();
        }
        p(view, div.d(), resolver);
    }

    public static final int f0(long j4, H9 unit, DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.l.f(unit, "unit");
        int i = a.f3394a[unit.ordinal()];
        if (i == 1) {
            return B(Long.valueOf(j4), displayMetrics);
        }
        if (i == 2) {
            return W(Long.valueOf(j4), displayMetrics);
        }
        if (i != 3) {
            throw new b9.j();
        }
        long j10 = j4 >> 31;
        if (j10 == 0 || j10 == -1) {
            return (int) j4;
        }
        if (j4 > 0) {
            return Integer.MAX_VALUE;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public static final void g(View view, float f10) {
        kotlin.jvm.internal.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        if (c5533d == null || c5533d.f45761d == f10) {
            return;
        }
        c5533d.f45761d = f10;
        view.requestLayout();
    }

    public static final int g0(C1134d4 c1134d4, DisplayMetrics metrics, A7.d resolver) {
        kotlin.jvm.internal.l.f(c1134d4, "<this>");
        kotlin.jvm.internal.l.f(metrics, "metrics");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        int i = a.f3394a[c1134d4.f8066a.a(resolver).ordinal()];
        A7.b<Double> bVar = c1134d4.f8067b;
        if (i == 1) {
            return C(bVar.a(resolver), metrics);
        }
        if (i == 2) {
            return com.google.gson.internal.c.y(X(bVar.a(resolver), metrics));
        }
        if (i == 3) {
            return (int) bVar.a(resolver).doubleValue();
        }
        throw new b9.j();
    }

    public static final void h(TextView textView, double d10, int i) {
        kotlin.jvm.internal.l.f(textView, "<this>");
        textView.setLetterSpacing(((float) d10) / i);
    }

    public static final int h0(W4 w42, DisplayMetrics displayMetrics, A7.d resolver) {
        kotlin.jvm.internal.l.f(w42, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        int i = a.f3394a[w42.f7612a.a(resolver).ordinal()];
        A7.b<Long> bVar = w42.f7613b;
        if (i == 1) {
            return B(bVar.a(resolver), displayMetrics);
        }
        if (i == 2) {
            return W(bVar.a(resolver), displayMetrics);
        }
        if (i != 3) {
            throw new b9.j();
        }
        long jLongValue = bVar.a(resolver).longValue();
        long j4 = jLongValue >> 31;
        if (j4 == 0 || j4 == -1) {
            return (int) jLongValue;
        }
        if (jLongValue > 0) {
            return Integer.MAX_VALUE;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends TextView & X6.i> void i(T t10, Long l5, H9 unit) {
        int iN0;
        kotlin.jvm.internal.l.f(t10, "<this>");
        kotlin.jvm.internal.l.f(unit, "unit");
        T t11 = t10;
        if (l5 != null) {
            DisplayMetrics displayMetrics = t10.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            iN0 = n0(l5, displayMetrics, unit);
        } else {
            iN0 = -1;
        }
        t11.setFixedLineHeight(iN0);
    }

    public static final int i0(C1412wc.a aVar, DisplayMetrics displayMetrics, A7.d resolver) {
        kotlin.jvm.internal.l.f(aVar, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        int i = a.f3394a[aVar.f9741a.a(resolver).ordinal()];
        A7.b<Long> bVar = aVar.f9742b;
        if (i == 1) {
            return B(bVar.a(resolver), displayMetrics);
        }
        if (i == 2) {
            return W(bVar.a(resolver), displayMetrics);
        }
        if (i != 3) {
            throw new b9.j();
        }
        long jLongValue = bVar.a(resolver).longValue();
        long j4 = jLongValue >> 31;
        if (j4 == 0 || j4 == -1) {
            return (int) jLongValue;
        }
        if (jLongValue > 0) {
            return Integer.MAX_VALUE;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public static final void j(View view, C1362t4 c1362t4, A7.d resolver) {
        int iN0;
        int iN02;
        int iN03;
        int iN04;
        Integer numValueOf;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (c1362t4 != null) {
            H9 h9A = c1362t4.f9222g.a(resolver);
            Long lA = c1362t4.f9218c.a(resolver);
            kotlin.jvm.internal.l.e(metrics, "metrics");
            iN0 = n0(lA, metrics, h9A);
            iN02 = n0(c1362t4.f9221f.a(resolver), metrics, h9A);
            iN03 = n0(c1362t4.f9219d.a(resolver), metrics, h9A);
            iN04 = n0(c1362t4.f9216a.a(resolver), metrics, h9A);
            A7.b<Long> bVar = c1362t4.f9220e;
            Integer numValueOf2 = bVar != null ? Integer.valueOf(n0(bVar.a(resolver), metrics, h9A)) : null;
            A7.b<Long> bVar2 = c1362t4.f9217b;
            numValueOf = bVar2 != null ? Integer.valueOf(n0(bVar2.a(resolver), metrics, h9A)) : null;
            num = numValueOf2;
        } else {
            iN0 = 0;
            iN02 = 0;
            iN03 = 0;
            iN04 = 0;
            numValueOf = null;
        }
        if (marginLayoutParams.leftMargin == iN0 && marginLayoutParams.topMargin == iN02 && marginLayoutParams.rightMargin == iN03 && marginLayoutParams.bottomMargin == iN04 && ((num == null || marginLayoutParams.getMarginStart() == num.intValue()) && (numValueOf == null || marginLayoutParams.getMarginEnd() == numValueOf.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = iN02;
        marginLayoutParams.bottomMargin = iN04;
        if (num == null && numValueOf == null) {
            marginLayoutParams.leftMargin = iN0;
            marginLayoutParams.rightMargin = iN03;
        } else {
            marginLayoutParams.setMarginStart(num != null ? num.intValue() : 0);
            marginLayoutParams.setMarginEnd(numValueOf != null ? numValueOf.intValue() : 0);
        }
        view.requestLayout();
    }

    public static final float j0(W4 w42, DisplayMetrics metrics, A7.d resolver) {
        kotlin.jvm.internal.l.f(w42, "<this>");
        kotlin.jvm.internal.l.f(metrics, "metrics");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return H(w42.f7613b.a(resolver).longValue(), w42.f7612a.a(resolver), metrics);
    }

    public static final void k(View view, C1412wc.a aVar, A7.d resolver) {
        int iI0;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        if (c5533d == null) {
            return;
        }
        if (aVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            iI0 = i0(aVar, displayMetrics, resolver);
        } else {
            iI0 = Integer.MAX_VALUE;
        }
        if (c5533d.f45764g != iI0) {
            c5533d.f45764g = iI0;
            view.requestLayout();
        }
    }

    public static final V6.n k0(La la2) {
        kotlin.jvm.internal.l.f(la2, "<this>");
        int i = a.f3400g[la2.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? V6.n.BASELINE : V6.n.BOTTOM : V6.n.BASELINE : V6.n.CENTER : V6.n.TOP;
    }

    public static final void l(View view, C1412wc.a aVar, A7.d resolver) {
        int iI0;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        if (c5533d == null) {
            return;
        }
        if (aVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            iI0 = i0(aVar, displayMetrics, resolver);
        } else {
            iI0 = Integer.MAX_VALUE;
        }
        if (c5533d.f45765h != iI0) {
            c5533d.f45765h = iI0;
            view.requestLayout();
        }
    }

    public static final void l0(ViewGroup viewGroup, C0675l divView, List<i7.b> list, List<i7.b> list2) {
        Collection collection;
        kotlin.jvm.internal.l.f(viewGroup, "<this>");
        kotlin.jvm.internal.l.f(divView, "divView");
        H6.L lB = divView.getDiv2Component$div_release().B();
        List<i7.b> list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                collection = C2099t.f18581b;
                if (!zHasNext) {
                    break;
                }
                S2 s2D = ((i7.b) it.next()).f38460a.d();
                kotlin.jvm.internal.l.f(s2D, "<this>");
                Collection collectionC = s2D.c();
                if (collectionC != null) {
                    collection = collectionC;
                }
                C2095p.b0(C2097r.y0(J(s2D), collection), arrayList);
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((B9) it2.next()).g());
            }
            for (i7.b bVar : list2) {
                List<C1370tc> listJ = J(bVar.f38460a.d());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listJ) {
                    if (!hashSet.contains(((C1370tc) obj).f9341c)) {
                        arrayList2.add(obj);
                    }
                }
                S2 s2D2 = bVar.f38460a.d();
                kotlin.jvm.internal.l.f(s2D2, "<this>");
                Collection collectionC2 = s2D2.c();
                if (collectionC2 == null) {
                    collectionC2 = collection;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : collectionC2) {
                    if (!hashSet.contains(((C1179g4) obj2).f8278d)) {
                        arrayList3.add(obj2);
                    }
                }
                lB.i(divView, bVar.f38461b, null, bVar.f38460a, arrayList2, arrayList3);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new g(viewGroup, list, lB, divView));
    }

    public static final void m(View view, C1412wc.a aVar, A7.d resolver) {
        int iI0;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (aVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            iI0 = i0(aVar, displayMetrics, resolver);
        } else {
            iI0 = 0;
        }
        if (view.getMinimumHeight() != iI0) {
            view.setMinimumHeight(iI0);
            view.requestLayout();
        }
    }

    public static final void m0(View view, f fVar) {
        if (!((Boolean) fVar.invoke(view)).booleanValue() || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i10 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            m0(childAt, fVar);
            i = i10;
        }
    }

    public static final void n(View view, C1412wc.a aVar, A7.d resolver) {
        int iI0;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (aVar != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            iI0 = i0(aVar, displayMetrics, resolver);
        } else {
            iI0 = 0;
        }
        if (view.getMinimumWidth() != iI0) {
            view.setMinimumWidth(iI0);
            view.requestLayout();
        }
    }

    public static final int n0(Long l5, DisplayMetrics metrics, H9 unit) {
        Integer numValueOf;
        kotlin.jvm.internal.l.f(metrics, "metrics");
        kotlin.jvm.internal.l.f(unit, "unit");
        if (l5 != null) {
            long jLongValue = l5.longValue();
            long j4 = jLongValue >> 31;
            numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
        } else {
            numValueOf = null;
        }
        return o0(numValueOf, metrics, unit);
    }

    public static final void o(View view, C1362t4 c1362t4, A7.d resolver) {
        int iF0;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (c1362t4 == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        DisplayMetrics metrics = view.getResources().getDisplayMetrics();
        H9 h9A = c1362t4.f9222g.a(resolver);
        A7.b<Long> bVar = c1362t4.f9216a;
        A7.b<Long> bVar2 = c1362t4.f9221f;
        A7.b<Long> bVar3 = c1362t4.f9217b;
        A7.b<Long> bVar4 = c1362t4.f9220e;
        if (bVar4 == null && bVar3 == null) {
            long jLongValue = c1362t4.f9218c.a(resolver).longValue();
            kotlin.jvm.internal.l.e(metrics, "metrics");
            view.setPadding(f0(jLongValue, h9A, metrics), f0(bVar2.a(resolver).longValue(), h9A, metrics), f0(c1362t4.f9219d.a(resolver).longValue(), h9A, metrics), f0(bVar.a(resolver).longValue(), h9A, metrics));
            return;
        }
        if (bVar4 != null) {
            long jLongValue2 = bVar4.a(resolver).longValue();
            kotlin.jvm.internal.l.e(metrics, "metrics");
            iF0 = f0(jLongValue2, h9A, metrics);
        } else {
            iF0 = 0;
        }
        long jLongValue3 = bVar2.a(resolver).longValue();
        kotlin.jvm.internal.l.e(metrics, "metrics");
        view.setPaddingRelative(iF0, f0(jLongValue3, h9A, metrics), bVar3 != null ? f0(bVar3.a(resolver).longValue(), h9A, metrics) : 0, f0(bVar.a(resolver).longValue(), h9A, metrics));
    }

    public static final <T extends Number> int o0(T t10, DisplayMetrics metrics, H9 unit) {
        kotlin.jvm.internal.l.f(metrics, "metrics");
        kotlin.jvm.internal.l.f(unit, "unit");
        return com.google.gson.internal.c.y(TypedValue.applyDimension(a0(unit), t10 != null ? t10.floatValue() : 0.0f, metrics));
    }

    public static final void p(View view, Qb qb, A7.d resolver) {
        A7.b<Double> bVar;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        Float fValueOf = (qb == null || (bVar = qb.f6105c) == null) ? null : Float.valueOf((float) bVar.a(resolver).doubleValue());
        if (fValueOf == null) {
            view.setRotation(0.0f);
            return;
        }
        view.setRotation(fValueOf.floatValue());
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            ViewTreeObserverOnPreDrawListenerC0791w.a(view, new RunnableC0057c(view, view, qb, resolver));
        } else {
            view.setPivotX(N(view, view.getWidth(), qb.f6103a, resolver));
            view.setPivotY(N(view, view.getHeight(), qb.f6104b, resolver));
        }
    }

    public static final void q(View view, float f10) {
        kotlin.jvm.internal.l.f(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        if (c5533d == null || c5533d.f45760c == f10) {
            return;
        }
        c5533d.f45760c = f10;
        view.requestLayout();
    }

    public static final void r(A7.d resolver, S2 div, View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        C9 width = div.getWidth();
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
        int iD0 = d0(width, displayMetrics, resolver, view.getLayoutParams());
        if (view.getLayoutParams().width != iD0) {
            view.getLayoutParams().width = iD0;
            view.requestLayout();
        }
        p(view, div.d(), resolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(View view, K2 k22, K2 k23, A7.d resolver) {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (view instanceof X6.e) {
            if (A2.l.s(k22 != null ? k22.f5615a : null, k23 != null ? k23.f5615a : null)) {
                return;
            }
            X6.e eVar = (X6.e) view;
            Double dA = k22 != null ? k22.f5615a.a(resolver) : null;
            eVar.setAspectRatio(dA != null ? (float) dA.doubleValue() : 0.0f);
            if (A2.l.A(k22 != null ? k22.f5615a : null) || !(view instanceof i7.k)) {
                return;
            }
            ((i7.k) view).b(k22 != null ? k22.f5615a.d(resolver, new d(view)) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(ViewGroup viewGroup, A7.b<Boolean> newClipToBounds, A7.b<Boolean> bVar, A7.d resolver) {
        kotlin.jvm.internal.l.f(viewGroup, "<this>");
        kotlin.jvm.internal.l.f(newClipToBounds, "newClipToBounds");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (A2.l.s(newClipToBounds, bVar)) {
            return;
        }
        c(viewGroup, newClipToBounds.a(resolver).booleanValue());
        if (newClipToBounds instanceof b.C0000b) {
            return;
        }
        O6.l lVar = viewGroup instanceof O6.l ? (O6.l) viewGroup : null;
        if (lVar != null) {
            lVar.b(newClipToBounds.d(resolver, new e(viewGroup)));
        }
    }

    public static final void u(C1333r3 builder, A7.d resolver, p9.l<Object, C1992A> lVar) {
        A7.d dVarG;
        kotlin.jvm.internal.l.f(builder, "builder");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        A7.b<JSONArray> bVar = builder.f9032a;
        bVar.d(resolver, lVar);
        JSONArray jSONArrayA = bVar.a(resolver);
        int length = jSONArrayA.length();
        int i = 0;
        while (true) {
            if (i < length) {
                Object obj = jSONArrayA.get(i);
                if (obj != null && (dVarG = C4460a.g(builder, obj, i, resolver)) != null) {
                    resolver = dVarG;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        Iterator<T> it = builder.f9034c.iterator();
        while (it.hasNext()) {
            ((C1333r3.a) it.next()).f9038c.d(resolver, lVar);
        }
    }

    public static final void v(A7.d resolver, S2 div, View view) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        try {
            r(resolver, div, view);
            f(resolver, div, view);
            A7.b<EnumC1305p2> bVarO = div.o();
            EnumC1305p2 enumC1305p2A = bVarO != null ? bVarO.a(resolver) : null;
            A7.b<EnumC1319q2> bVarV = div.v();
            a(view, enumC1305p2A, bVarV != null ? bVarV.a(resolver) : null);
        } catch (z7.d e4) {
            if (!com.google.gson.internal.c.a(e4)) {
                throw e4;
            }
        }
    }

    public static final void w(View view, C0672i c0672i, C0683u binder) {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(binder, "binder");
        m0(view, new f(binder, c0672i));
    }

    public static final boolean x(C9 c92, A7.d resolver) {
        A7.b<Boolean> bVar;
        kotlin.jvm.internal.l.f(c92, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return !(c92 instanceof C9.c) || ((bVar = ((C9.c) c92).f5045b.f9737a) != null && bVar.a(resolver).booleanValue());
    }

    public static final void y(View view, T6.b focusTracker) {
        WeakReference<View> weakReference;
        View view2;
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(focusTracker, "focusTracker");
        if (view.isFocused() || !view.isInTouchMode() || (weakReference = T6.b.f12299d) == null || (view2 = weakReference.get()) == null) {
            return;
        }
        view2.clearFocus();
        C5246y.a(view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final K6.C0716d z(android.view.View r3, H6.C0672i r4, N7.C1332r2 r5, H6.C0684v r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r3, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l.f(r4, r0)
            r0 = 0
            if (r5 == 0) goto L2b
            N7.r2 r1 = I6.p.f2579a
            A7.d r1 = r4.f2147b
            java.lang.String r2 = "expressionResolver"
            kotlin.jvm.internal.l.f(r1, r2)
            r2 = 0
            android.view.animation.Animation r3 = I6.p.c(r5, r1, r2, r3)
            r2 = 1
            android.view.animation.Animation r5 = I6.p.c(r5, r1, r2, r0)
            if (r3 != 0) goto L25
            if (r5 != 0) goto L25
            goto L2b
        L25:
            I6.q r1 = new I6.q
            r1.<init>(r3, r5)
            goto L2c
        L2b:
            r1 = r0
        L2c:
            if (r6 == 0) goto L47
            K6.t r3 = r6.f2255c
            if (r3 != 0) goto L38
            kotlin.jvm.internal.m r3 = r6.f2256d
            if (r3 != 0) goto L38
            r3 = r0
            goto L39
        L38:
            r3 = r6
        L39:
            if (r3 == 0) goto L47
            android.view.GestureDetector r3 = new android.view.GestureDetector
            H6.l r4 = r4.f2146a
            j6.e r4 = r4.getContext$div_release()
            r3.<init>(r4, r6)
            goto L48
        L47:
            r3 = r0
        L48:
            if (r1 != 0) goto L4e
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            return r0
        L4e:
            K6.d r4 = new K6.d
            r4.<init>(r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C0713c.z(android.view.View, H6.i, N7.r2, H6.v):K6.d");
    }
}
