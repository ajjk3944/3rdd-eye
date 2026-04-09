package androidx.recyclerview.widget;

import L0.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    public int f16539A;

    /* renamed from: B, reason: collision with root package name */
    public final d f16540B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16541C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16542D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f16543E;

    /* renamed from: F, reason: collision with root package name */
    public e f16544F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f16545G;

    /* renamed from: H, reason: collision with root package name */
    public final b f16546H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f16547I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f16548J;

    /* renamed from: K, reason: collision with root package name */
    public final a f16549K;

    /* renamed from: p, reason: collision with root package name */
    public int f16550p;

    /* renamed from: q, reason: collision with root package name */
    public f[] f16551q;

    /* renamed from: r, reason: collision with root package name */
    public final A f16552r;

    /* renamed from: s, reason: collision with root package name */
    public final A f16553s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16554t;

    /* renamed from: u, reason: collision with root package name */
    public int f16555u;

    /* renamed from: v, reason: collision with root package name */
    public final t f16556v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16557w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16558x;

    /* renamed from: y, reason: collision with root package name */
    public BitSet f16559y;

    /* renamed from: z, reason: collision with root package name */
    public int f16560z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.Y0();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16562a;

        /* renamed from: b, reason: collision with root package name */
        public int f16563b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16564c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16565d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16566e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f16567f;

        public b() {
            a();
        }

        public final void a() {
            this.f16562a = -1;
            this.f16563b = RecyclerView.UNDEFINED_DURATION;
            this.f16564c = false;
            this.f16565d = false;
            this.f16566e = false;
            int[] iArr = this.f16567f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        public f f16569e;
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int[] f16570a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f16571b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0259a();

            /* renamed from: b, reason: collision with root package name */
            public int f16572b;

            /* renamed from: c, reason: collision with root package name */
            public int f16573c;

            /* renamed from: d, reason: collision with root package name */
            public int[] f16574d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f16575e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0259a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.f16572b = parcel.readInt();
                    aVar.f16573c = parcel.readInt();
                    aVar.f16575e = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        aVar.f16574d = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f16572b + ", mGapDir=" + this.f16573c + ", mHasUnwantedGapAfter=" + this.f16575e + ", mGapPerSpan=" + Arrays.toString(this.f16574d) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f16572b);
                parcel.writeInt(this.f16573c);
                parcel.writeInt(this.f16575e ? 1 : 0);
                int[] iArr = this.f16574d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f16574d);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f16570a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f16571b = null;
        }

        public final void b(int i) {
            int[] iArr = this.f16570a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f16570a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f16570a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f16570a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void c(int i, int i10) {
            int[] iArr = this.f16570a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i11 = i + i10;
            b(i11);
            int[] iArr2 = this.f16570a;
            System.arraycopy(iArr2, i, iArr2, i11, (iArr2.length - i) - i10);
            Arrays.fill(this.f16570a, i, i11, -1);
            ArrayList arrayList = this.f16571b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f16571b.get(size);
                int i12 = aVar.f16572b;
                if (i12 >= i) {
                    aVar.f16572b = i12 + i10;
                }
            }
        }

        public final void d(int i, int i10) {
            int[] iArr = this.f16570a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i11 = i + i10;
            b(i11);
            int[] iArr2 = this.f16570a;
            System.arraycopy(iArr2, i11, iArr2, i, (iArr2.length - i) - i10);
            int[] iArr3 = this.f16570a;
            Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            ArrayList arrayList = this.f16571b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f16571b.get(size);
                int i12 = aVar.f16572b;
                if (i12 >= i) {
                    if (i12 < i11) {
                        this.f16571b.remove(size);
                    } else {
                        aVar.f16572b = i12 - i10;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f16576b;

        /* renamed from: c, reason: collision with root package name */
        public int f16577c;

        /* renamed from: d, reason: collision with root package name */
        public int f16578d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f16579e;

        /* renamed from: f, reason: collision with root package name */
        public int f16580f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f16581g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f16582h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f16583j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f16584k;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.f16576b = parcel.readInt();
                eVar.f16577c = parcel.readInt();
                int i = parcel.readInt();
                eVar.f16578d = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    eVar.f16579e = iArr;
                    parcel.readIntArray(iArr);
                }
                int i10 = parcel.readInt();
                eVar.f16580f = i10;
                if (i10 > 0) {
                    int[] iArr2 = new int[i10];
                    eVar.f16581g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.i = parcel.readInt() == 1;
                eVar.f16583j = parcel.readInt() == 1;
                eVar.f16584k = parcel.readInt() == 1;
                eVar.f16582h = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f16576b);
            parcel.writeInt(this.f16577c);
            parcel.writeInt(this.f16578d);
            if (this.f16578d > 0) {
                parcel.writeIntArray(this.f16579e);
            }
            parcel.writeInt(this.f16580f);
            if (this.f16580f > 0) {
                parcel.writeIntArray(this.f16581g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.f16583j ? 1 : 0);
            parcel.writeInt(this.f16584k ? 1 : 0);
            parcel.writeList(this.f16582h);
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList<View> f16585a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f16586b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c, reason: collision with root package name */
        public int f16587c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d, reason: collision with root package name */
        public int f16588d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f16589e;

        public f(int i) {
            this.f16589e = i;
        }

        public final void a() {
            View view = this.f16585a.get(r0.size() - 1);
            c cVar = (c) view.getLayoutParams();
            this.f16587c = StaggeredGridLayoutManager.this.f16552r.b(view);
            cVar.getClass();
        }

        public final void b() {
            this.f16585a.clear();
            this.f16586b = RecyclerView.UNDEFINED_DURATION;
            this.f16587c = RecyclerView.UNDEFINED_DURATION;
            this.f16588d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.f16557w ? e(r1.size() - 1, -1, false, false, true) : e(0, this.f16585a.size(), false, false, true);
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.f16557w ? e(0, this.f16585a.size(), false, false, true) : e(r1.size() - 1, -1, false, false, true);
        }

        public final int e(int i, int i10, boolean z10, boolean z11, boolean z12) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iK = staggeredGridLayoutManager.f16552r.k();
            int iG = staggeredGridLayoutManager.f16552r.g();
            int i11 = i10 > i ? 1 : -1;
            while (i != i10) {
                View view = this.f16585a.get(i);
                int iE = staggeredGridLayoutManager.f16552r.e(view);
                int iB = staggeredGridLayoutManager.f16552r.b(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iE >= iG : iE > iG;
                if (!z12 ? iB > iK : iB >= iK) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iE >= iK && iB <= iG) {
                            return RecyclerView.p.b0(view);
                        }
                    } else {
                        if (z11) {
                            return RecyclerView.p.b0(view);
                        }
                        if (iE < iK || iB > iG) {
                            return RecyclerView.p.b0(view);
                        }
                    }
                }
                i += i11;
            }
            return -1;
        }

        public final int f(int i) {
            int i10 = this.f16587c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f16585a.size() == 0) {
                return i;
            }
            a();
            return this.f16587c;
        }

        public final View g(int i, int i10) {
            ArrayList<View> arrayList = this.f16585a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i10 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f16557w && RecyclerView.p.b0(view2) >= i) || ((!staggeredGridLayoutManager.f16557w && RecyclerView.p.b0(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                View view3 = arrayList.get(i11);
                if ((staggeredGridLayoutManager.f16557w && RecyclerView.p.b0(view3) <= i) || ((!staggeredGridLayoutManager.f16557w && RecyclerView.p.b0(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i11++;
                view = view3;
            }
            return view;
        }

        public final int h(int i) {
            int i10 = this.f16586b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f16585a.size() == 0) {
                return i;
            }
            View view = this.f16585a.get(0);
            c cVar = (c) view.getLayoutParams();
            this.f16586b = StaggeredGridLayoutManager.this.f16552r.e(view);
            cVar.getClass();
            return this.f16586b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f16550p = -1;
        this.f16557w = false;
        this.f16558x = false;
        this.f16560z = -1;
        this.f16539A = RecyclerView.UNDEFINED_DURATION;
        this.f16540B = new d();
        this.f16541C = 2;
        this.f16545G = new Rect();
        this.f16546H = new b();
        this.f16547I = true;
        this.f16549K = new a();
        RecyclerView.p.c cVarC0 = RecyclerView.p.c0(context, attributeSet, i, i10);
        int i11 = cVarC0.f16514a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        t(null);
        if (i11 != this.f16554t) {
            this.f16554t = i11;
            A a10 = this.f16552r;
            this.f16552r = this.f16553s;
            this.f16553s = a10;
            J0();
        }
        y1(cVarC0.f16515b);
        boolean z10 = cVarC0.f16516c;
        t(null);
        e eVar = this.f16544F;
        if (eVar != null && eVar.i != z10) {
            eVar.i = z10;
        }
        this.f16557w = z10;
        J0();
        this.f16556v = new t();
        this.f16552r = A.a(this, this.f16554t);
        this.f16553s = A.a(this, 1 - this.f16554t);
    }

    public static int B1(int i, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i10) - i11), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void A0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f16544F = eVar;
            if (this.f16560z != -1) {
                eVar.f16579e = null;
                eVar.f16578d = 0;
                eVar.f16576b = -1;
                eVar.f16577c = -1;
                eVar.f16579e = null;
                eVar.f16578d = 0;
                eVar.f16580f = 0;
                eVar.f16581g = null;
                eVar.f16582h = null;
            }
            J0();
        }
    }

    public final void A1(f fVar, int i, int i10) {
        int i11 = fVar.f16588d;
        int i12 = fVar.f16589e;
        if (i != -1) {
            int i13 = fVar.f16587c;
            if (i13 == Integer.MIN_VALUE) {
                fVar.a();
                i13 = fVar.f16587c;
            }
            if (i13 - i11 >= i10) {
                this.f16559y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = fVar.f16586b;
        if (i14 == Integer.MIN_VALUE) {
            View view = fVar.f16585a.get(0);
            c cVar = (c) view.getLayoutParams();
            fVar.f16586b = StaggeredGridLayoutManager.this.f16552r.e(view);
            cVar.getClass();
            i14 = fVar.f16586b;
        }
        if (i14 + i11 <= i10) {
            this.f16559y.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int B(RecyclerView.B b10) {
        return Z0(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final Parcelable B0() {
        int iH;
        int iK;
        int[] iArr;
        e eVar = this.f16544F;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.f16578d = eVar.f16578d;
            eVar2.f16576b = eVar.f16576b;
            eVar2.f16577c = eVar.f16577c;
            eVar2.f16579e = eVar.f16579e;
            eVar2.f16580f = eVar.f16580f;
            eVar2.f16581g = eVar.f16581g;
            eVar2.i = eVar.i;
            eVar2.f16583j = eVar.f16583j;
            eVar2.f16584k = eVar.f16584k;
            eVar2.f16582h = eVar.f16582h;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.i = this.f16557w;
        eVar3.f16583j = this.f16542D;
        eVar3.f16584k = this.f16543E;
        d dVar = this.f16540B;
        if (dVar == null || (iArr = dVar.f16570a) == null) {
            eVar3.f16580f = 0;
        } else {
            eVar3.f16581g = iArr;
            eVar3.f16580f = iArr.length;
            eVar3.f16582h = dVar.f16571b;
        }
        if (O() <= 0) {
            eVar3.f16576b = -1;
            eVar3.f16577c = -1;
            eVar3.f16578d = 0;
            return eVar3;
        }
        eVar3.f16576b = this.f16542D ? i1() : h1();
        View viewD1 = this.f16558x ? d1(true) : e1(true);
        eVar3.f16577c = viewD1 != null ? RecyclerView.p.b0(viewD1) : -1;
        int i = this.f16550p;
        eVar3.f16578d = i;
        eVar3.f16579e = new int[i];
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            if (this.f16542D) {
                iH = this.f16551q[i10].f(RecyclerView.UNDEFINED_DURATION);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f16552r.g();
                    iH -= iK;
                }
            } else {
                iH = this.f16551q[i10].h(RecyclerView.UNDEFINED_DURATION);
                if (iH != Integer.MIN_VALUE) {
                    iK = this.f16552r.k();
                    iH -= iK;
                }
            }
            eVar3.f16579e[i10] = iH;
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int C(RecyclerView.B b10) {
        return a1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void C0(int i) {
        if (i == 0) {
            Y0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int D(RecyclerView.B b10) {
        return b1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int E(RecyclerView.B b10) {
        return Z0(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int F(RecyclerView.B b10) {
        return a1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int G(RecyclerView.B b10) {
        return b1(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q K() {
        return this.f16554t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int K0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        return w1(i, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q L(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void L0(int i) {
        e eVar = this.f16544F;
        if (eVar != null && eVar.f16576b != i) {
            eVar.f16579e = null;
            eVar.f16578d = 0;
            eVar.f16576b = -1;
            eVar.f16577c = -1;
        }
        this.f16560z = i;
        this.f16539A = RecyclerView.UNDEFINED_DURATION;
        J0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int M0(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        return w1(i, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void P0(Rect rect, int i, int i10) {
        int iY;
        int iY2;
        int iZ = Z() + Y();
        int iX = X() + a0();
        if (this.f16554t == 1) {
            int iHeight = rect.height() + iX;
            RecyclerView recyclerView = this.f16499b;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            iY2 = RecyclerView.p.y(i10, iHeight, recyclerView.getMinimumHeight());
            iY = RecyclerView.p.y(i, (this.f16555u * this.f16550p) + iZ, this.f16499b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iZ;
            RecyclerView recyclerView2 = this.f16499b;
            WeakHashMap<View, S> weakHashMap2 = L0.I.f3792a;
            iY = RecyclerView.p.y(i, iWidth, recyclerView2.getMinimumWidth());
            iY2 = RecyclerView.p.y(i10, (this.f16555u * this.f16550p) + iX, this.f16499b.getMinimumHeight());
        }
        this.f16499b.setMeasuredDimension(iY, iY2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void V0(RecyclerView recyclerView, int i) {
        u uVar = new u(recyclerView.getContext());
        uVar.f16448a = i;
        W0(uVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean X0() {
        return this.f16544F == null;
    }

    public final boolean Y0() {
        int iH1;
        if (O() != 0 && this.f16541C != 0 && this.f16504g) {
            if (this.f16558x) {
                iH1 = i1();
                h1();
            } else {
                iH1 = h1();
                i1();
            }
            d dVar = this.f16540B;
            if (iH1 == 0 && m1() != null) {
                dVar.a();
                this.f16503f = true;
                J0();
                return true;
            }
        }
        return false;
    }

    public final int Z0(RecyclerView.B b10) {
        if (O() == 0) {
            return 0;
        }
        A a10 = this.f16552r;
        boolean z10 = !this.f16547I;
        return E.a(b10, a10, e1(z10), d1(z10), this, this.f16547I);
    }

    public final int a1(RecyclerView.B b10) {
        if (O() == 0) {
            return 0;
        }
        A a10 = this.f16552r;
        boolean z10 = !this.f16547I;
        return E.b(b10, a10, e1(z10), d1(z10), this, this.f16547I, this.f16558x);
    }

    public final int b1(RecyclerView.B b10) {
        if (O() == 0) {
            return 0;
        }
        A a10 = this.f16552r;
        boolean z10 = !this.f16547I;
        return E.c(b10, a10, e1(z10), d1(z10), this, this.f16547I);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public final int c1(RecyclerView.w wVar, t tVar, RecyclerView.B b10) {
        f fVar;
        ?? r32;
        int i;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i10;
        int i11;
        int i12;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i13 = 0;
        int i14 = 1;
        staggeredGridLayoutManager.f16559y.set(0, staggeredGridLayoutManager.f16550p, true);
        t tVar2 = staggeredGridLayoutManager.f16556v;
        int i15 = tVar2.i ? tVar.f16765e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION : tVar.f16765e == 1 ? tVar.f16767g + tVar.f16762b : tVar.f16766f - tVar.f16762b;
        int i16 = tVar.f16765e;
        for (int i17 = 0; i17 < staggeredGridLayoutManager.f16550p; i17++) {
            if (!staggeredGridLayoutManager.f16551q[i17].f16585a.isEmpty()) {
                staggeredGridLayoutManager.A1(staggeredGridLayoutManager.f16551q[i17], i16, i15);
            }
        }
        int iG = staggeredGridLayoutManager.f16558x ? staggeredGridLayoutManager.f16552r.g() : staggeredGridLayoutManager.f16552r.k();
        boolean z10 = false;
        while (true) {
            int i18 = tVar.f16763c;
            if (((i18 < 0 || i18 >= b10.b()) ? i13 : i14) == 0 || (!tVar2.i && staggeredGridLayoutManager.f16559y.isEmpty())) {
                break;
            }
            View view = wVar.l(tVar.f16763c, Long.MAX_VALUE).itemView;
            tVar.f16763c += tVar.f16764d;
            c cVar = (c) view.getLayoutParams();
            int layoutPosition = cVar.f16518a.getLayoutPosition();
            d dVar = staggeredGridLayoutManager.f16540B;
            int[] iArr = dVar.f16570a;
            int i19 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i19 == -1) {
                if (staggeredGridLayoutManager.q1(tVar.f16765e)) {
                    i12 = staggeredGridLayoutManager.f16550p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = staggeredGridLayoutManager.f16550p;
                    i12 = i13;
                }
                f fVar2 = null;
                if (tVar.f16765e == i14) {
                    int iK2 = staggeredGridLayoutManager.f16552r.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        f fVar3 = staggeredGridLayoutManager.f16551q[i12];
                        int iF = fVar3.f(iK2);
                        if (iF < i20) {
                            fVar2 = fVar3;
                            i20 = iF;
                        }
                        i12 += i10;
                    }
                } else {
                    int iG2 = staggeredGridLayoutManager.f16552r.g();
                    int i21 = RecyclerView.UNDEFINED_DURATION;
                    while (i12 != i11) {
                        f fVar4 = staggeredGridLayoutManager.f16551q[i12];
                        int iH2 = fVar4.h(iG2);
                        if (iH2 > i21) {
                            fVar2 = fVar4;
                            i21 = iH2;
                        }
                        i12 += i10;
                    }
                }
                fVar = fVar2;
                dVar.b(layoutPosition);
                dVar.f16570a[layoutPosition] = fVar.f16589e;
            } else {
                fVar = staggeredGridLayoutManager.f16551q[i19];
            }
            f fVar5 = fVar;
            cVar.f16569e = fVar5;
            if (tVar.f16765e == 1) {
                r32 = 0;
                staggeredGridLayoutManager.s(view, -1, false);
            } else {
                r32 = 0;
                staggeredGridLayoutManager.s(view, 0, false);
            }
            if (staggeredGridLayoutManager.f16554t == 1) {
                i = 1;
                staggeredGridLayoutManager.o1(view, RecyclerView.p.P(r32, staggeredGridLayoutManager.f16555u, staggeredGridLayoutManager.f16508l, r32, ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.p.P(true, staggeredGridLayoutManager.f16511o, staggeredGridLayoutManager.f16509m, staggeredGridLayoutManager.X() + staggeredGridLayoutManager.a0(), ((ViewGroup.MarginLayoutParams) cVar).height));
            } else {
                i = 1;
                staggeredGridLayoutManager.o1(view, RecyclerView.p.P(true, staggeredGridLayoutManager.f16510n, staggeredGridLayoutManager.f16508l, staggeredGridLayoutManager.Z() + staggeredGridLayoutManager.Y(), ((ViewGroup.MarginLayoutParams) cVar).width), RecyclerView.p.P(false, staggeredGridLayoutManager.f16555u, staggeredGridLayoutManager.f16509m, 0, ((ViewGroup.MarginLayoutParams) cVar).height));
            }
            if (tVar.f16765e == i) {
                iC = fVar5.f(iG);
                iH = staggeredGridLayoutManager.f16552r.c(view) + iC;
            } else {
                iH = fVar5.h(iG);
                iC = iH - staggeredGridLayoutManager.f16552r.c(view);
            }
            if (tVar.f16765e == 1) {
                f fVar6 = cVar.f16569e;
                fVar6.getClass();
                c cVar2 = (c) view.getLayoutParams();
                cVar2.f16569e = fVar6;
                ArrayList<View> arrayList = fVar6.f16585a;
                arrayList.add(view);
                fVar6.f16587c = RecyclerView.UNDEFINED_DURATION;
                if (arrayList.size() == 1) {
                    fVar6.f16586b = RecyclerView.UNDEFINED_DURATION;
                }
                if (cVar2.f16518a.isRemoved() || cVar2.f16518a.isUpdated()) {
                    fVar6.f16588d = StaggeredGridLayoutManager.this.f16552r.c(view) + fVar6.f16588d;
                }
            } else {
                f fVar7 = cVar.f16569e;
                fVar7.getClass();
                c cVar3 = (c) view.getLayoutParams();
                cVar3.f16569e = fVar7;
                ArrayList<View> arrayList2 = fVar7.f16585a;
                arrayList2.add(0, view);
                fVar7.f16586b = RecyclerView.UNDEFINED_DURATION;
                if (arrayList2.size() == 1) {
                    fVar7.f16587c = RecyclerView.UNDEFINED_DURATION;
                }
                if (cVar3.f16518a.isRemoved() || cVar3.f16518a.isUpdated()) {
                    fVar7.f16588d = StaggeredGridLayoutManager.this.f16552r.c(view) + fVar7.f16588d;
                }
            }
            if (staggeredGridLayoutManager.n1() && staggeredGridLayoutManager.f16554t == 1) {
                iC2 = staggeredGridLayoutManager.f16553s.g() - (((staggeredGridLayoutManager.f16550p - 1) - fVar5.f16589e) * staggeredGridLayoutManager.f16555u);
                iK = iC2 - staggeredGridLayoutManager.f16553s.c(view);
            } else {
                iK = staggeredGridLayoutManager.f16553s.k() + (fVar5.f16589e * staggeredGridLayoutManager.f16555u);
                iC2 = staggeredGridLayoutManager.f16553s.c(view) + iK;
            }
            int i22 = iK;
            int i23 = iC2;
            if (staggeredGridLayoutManager.f16554t == 1) {
                staggeredGridLayoutManager.h0(view, i22, iC, i23, iH);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.h0(view, iC, i22, iH, i23);
            }
            staggeredGridLayoutManager.A1(fVar5, tVar2.f16765e, i15);
            staggeredGridLayoutManager.s1(wVar, tVar2);
            if (tVar2.f16768h && view.hasFocusable()) {
                staggeredGridLayoutManager.f16559y.set(fVar5.f16589e, false);
            }
            z10 = true;
            i14 = 1;
            i13 = 0;
        }
        if (!z10) {
            staggeredGridLayoutManager.s1(wVar, tVar2);
        }
        int iK3 = tVar2.f16765e == -1 ? staggeredGridLayoutManager.f16552r.k() - staggeredGridLayoutManager.k1(staggeredGridLayoutManager.f16552r.k()) : staggeredGridLayoutManager.j1(staggeredGridLayoutManager.f16552r.g()) - staggeredGridLayoutManager.f16552r.g();
        if (iK3 > 0) {
            return Math.min(tVar.f16762b, iK3);
        }
        return 0;
    }

    public final View d1(boolean z10) {
        int iK = this.f16552r.k();
        int iG = this.f16552r.g();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iE = this.f16552r.e(viewN);
            int iB = this.f16552r.b(viewN);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    public final View e1(boolean z10) {
        int iK = this.f16552r.k();
        int iG = this.f16552r.g();
        int iO = O();
        View view = null;
        for (int i = 0; i < iO; i++) {
            View viewN = N(i);
            int iE = this.f16552r.e(viewN);
            if (this.f16552r.b(viewN) > iK && iE < iG) {
                if (iE >= iK || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF f(int r4) {
        /*
            r3 = this;
            int r0 = r3.O()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f16558x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.h1()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f16558x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f16554t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.f(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean f0() {
        return this.f16541C != 0;
    }

    public final void f1(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iG;
        int iJ1 = j1(RecyclerView.UNDEFINED_DURATION);
        if (iJ1 != Integer.MIN_VALUE && (iG = this.f16552r.g() - iJ1) > 0) {
            int i = iG - (-w1(-iG, wVar, b10));
            if (!z10 || i <= 0) {
                return;
            }
            this.f16552r.o(i);
        }
    }

    public final void g1(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iK;
        int iK1 = k1(Integer.MAX_VALUE);
        if (iK1 != Integer.MAX_VALUE && (iK = iK1 - this.f16552r.k()) > 0) {
            int iW1 = iK - w1(iK, wVar, b10);
            if (!z10 || iW1 <= 0) {
                return;
            }
            this.f16552r.o(-iW1);
        }
    }

    public final int h1() {
        if (O() == 0) {
            return 0;
        }
        return RecyclerView.p.b0(N(0));
    }

    public final int i1() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return RecyclerView.p.b0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void j0(int i) {
        super.j0(i);
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            f fVar = this.f16551q[i10];
            int i11 = fVar.f16586b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f16586b = i11 + i;
            }
            int i12 = fVar.f16587c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f16587c = i12 + i;
            }
        }
    }

    public final int j1(int i) {
        int iF = this.f16551q[0].f(i);
        for (int i10 = 1; i10 < this.f16550p; i10++) {
            int iF2 = this.f16551q[i10].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void k0(int i) {
        super.k0(i);
        for (int i10 = 0; i10 < this.f16550p; i10++) {
            f fVar = this.f16551q[i10];
            int i11 = fVar.f16586b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f16586b = i11 + i;
            }
            int i12 = fVar.f16587c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f16587c = i12 + i;
            }
        }
    }

    public final int k1(int i) {
        int iH = this.f16551q[0].h(i);
        for (int i10 = 1; i10 < this.f16550p; i10++) {
            int iH2 = this.f16551q[i10].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void l0() {
        this.f16540B.a();
        for (int i = 0; i < this.f16550p; i++) {
            this.f16551q[i].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l1(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f16558x
            if (r0 == 0) goto L9
            int r0 = r9.i1()
            goto Ld
        L9:
            int r0 = r9.h1()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r9.f16540B
            int[] r5 = r4.f16570a
            r6 = -1
            if (r5 != 0) goto L27
            goto L9a
        L27:
            int r5 = r5.length
            if (r3 < r5) goto L2c
            goto L9a
        L2c:
            java.util.ArrayList r5 = r4.f16571b
            if (r5 != 0) goto L32
        L30:
            r5 = r6
            goto L80
        L32:
            if (r5 != 0) goto L35
            goto L4d
        L35:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3b:
            if (r5 < 0) goto L4d
            java.util.ArrayList r7 = r4.f16571b
            java.lang.Object r7 = r7.get(r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r7
            int r8 = r7.f16572b
            if (r8 != r3) goto L4a
            goto L4e
        L4a:
            int r5 = r5 + (-1)
            goto L3b
        L4d:
            r7 = 0
        L4e:
            if (r7 == 0) goto L55
            java.util.ArrayList r5 = r4.f16571b
            r5.remove(r7)
        L55:
            java.util.ArrayList r5 = r4.f16571b
            int r5 = r5.size()
            r7 = 0
        L5c:
            if (r7 >= r5) goto L6e
            java.util.ArrayList r8 = r4.f16571b
            java.lang.Object r8 = r8.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r8
            int r8 = r8.f16572b
            if (r8 < r3) goto L6b
            goto L6f
        L6b:
            int r7 = r7 + 1
            goto L5c
        L6e:
            r7 = r6
        L6f:
            if (r7 == r6) goto L30
            java.util.ArrayList r5 = r4.f16571b
            java.lang.Object r5 = r5.get(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r5
            java.util.ArrayList r8 = r4.f16571b
            r8.remove(r7)
            int r5 = r5.f16572b
        L80:
            if (r5 != r6) goto L8c
            int[] r5 = r4.f16570a
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            int[] r5 = r4.f16570a
            int r5 = r5.length
            goto L9a
        L8c:
            int r5 = r5 + 1
            int[] r7 = r4.f16570a
            int r7 = r7.length
            int r5 = java.lang.Math.min(r5, r7)
            int[] r7 = r4.f16570a
            java.util.Arrays.fill(r7, r3, r5, r6)
        L9a:
            r5 = 1
            if (r12 == r5) goto Lae
            r6 = 2
            if (r12 == r6) goto Laa
            if (r12 == r1) goto La3
            goto Lb1
        La3:
            r4.d(r10, r5)
            r4.c(r11, r5)
            goto Lb1
        Laa:
            r4.d(r10, r11)
            goto Lb1
        Lae:
            r4.c(r10, r11)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r10 = r9.f16558x
            if (r10 == 0) goto Lbd
            int r10 = r9.h1()
            goto Lc1
        Lbd:
            int r10 = r9.i1()
        Lc1:
            if (r3 > r10) goto Lc6
            r9.J0()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l1(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m1() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n0(RecyclerView recyclerView, RecyclerView.w wVar) {
        RecyclerView recyclerView2 = this.f16499b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f16549K);
        }
        for (int i = 0; i < this.f16550p; i++) {
            this.f16551q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean n1() {
        return W() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View o0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.w r11, androidx.recyclerview.widget.RecyclerView.B r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    public final void o1(View view, int i, int i10) {
        Rect rect = this.f16545G;
        u(view, rect);
        c cVar = (c) view.getLayoutParams();
        int iB1 = B1(i, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int iB12 = B1(i10, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (S0(view, iB1, iB12, cVar)) {
            view.measure(iB1, iB12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void p0(AccessibilityEvent accessibilityEvent) {
        super.p0(accessibilityEvent);
        if (O() > 0) {
            View viewE1 = e1(false);
            View viewD1 = d1(false);
            if (viewE1 == null || viewD1 == null) {
                return;
            }
            int iB0 = RecyclerView.p.b0(viewE1);
            int iB02 = RecyclerView.p.b0(viewD1);
            if (iB0 < iB02) {
                accessibilityEvent.setFromIndex(iB0);
                accessibilityEvent.setToIndex(iB02);
            } else {
                accessibilityEvent.setFromIndex(iB02);
                accessibilityEvent.setToIndex(iB0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p1(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.B r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.p1(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    public final boolean q1(int i) {
        if (this.f16554t == 0) {
            return (i == -1) != this.f16558x;
        }
        return ((i == -1) == this.f16558x) == n1();
    }

    public final void r1(int i, RecyclerView.B b10) {
        int iH1;
        int i10;
        if (i > 0) {
            iH1 = i1();
            i10 = 1;
        } else {
            iH1 = h1();
            i10 = -1;
        }
        t tVar = this.f16556v;
        tVar.f16761a = true;
        z1(iH1, b10);
        x1(i10);
        tVar.f16763c = iH1 + tVar.f16764d;
        tVar.f16762b = Math.abs(i);
    }

    public final void s1(RecyclerView.w wVar, t tVar) {
        if (!tVar.f16761a || tVar.i) {
            return;
        }
        if (tVar.f16762b == 0) {
            if (tVar.f16765e == -1) {
                t1(wVar, tVar.f16767g);
                return;
            } else {
                u1(wVar, tVar.f16766f);
                return;
            }
        }
        int i = 1;
        if (tVar.f16765e == -1) {
            int i10 = tVar.f16766f;
            int iH = this.f16551q[0].h(i10);
            while (i < this.f16550p) {
                int iH2 = this.f16551q[i].h(i10);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i11 = i10 - iH;
            t1(wVar, i11 < 0 ? tVar.f16767g : tVar.f16767g - Math.min(i11, tVar.f16762b));
            return;
        }
        int i12 = tVar.f16767g;
        int iF = this.f16551q[0].f(i12);
        while (i < this.f16550p) {
            int iF2 = this.f16551q[i].f(i12);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i13 = iF - tVar.f16767g;
        u1(wVar, i13 < 0 ? tVar.f16766f : Math.min(i13, tVar.f16762b) + tVar.f16766f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void t(String str) {
        if (this.f16544F == null) {
            super.t(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void t0(int i, int i10) {
        l1(i, i10, 1);
    }

    public final void t1(RecyclerView.w wVar, int i) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f16552r.e(viewN) < i || this.f16552r.n(viewN) < i) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            cVar.getClass();
            if (cVar.f16569e.f16585a.size() == 1) {
                return;
            }
            f fVar = cVar.f16569e;
            ArrayList<View> arrayList = fVar.f16585a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f16569e = null;
            if (cVar2.f16518a.isRemoved() || cVar2.f16518a.isUpdated()) {
                fVar.f16588d -= StaggeredGridLayoutManager.this.f16552r.c(viewRemove);
            }
            if (size == 1) {
                fVar.f16586b = RecyclerView.UNDEFINED_DURATION;
            }
            fVar.f16587c = RecyclerView.UNDEFINED_DURATION;
            G0(viewN);
            wVar.i(viewN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void u0() {
        this.f16540B.a();
        J0();
    }

    public final void u1(RecyclerView.w wVar, int i) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f16552r.b(viewN) > i || this.f16552r.m(viewN) > i) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            cVar.getClass();
            if (cVar.f16569e.f16585a.size() == 1) {
                return;
            }
            f fVar = cVar.f16569e;
            ArrayList<View> arrayList = fVar.f16585a;
            View viewRemove = arrayList.remove(0);
            c cVar2 = (c) viewRemove.getLayoutParams();
            cVar2.f16569e = null;
            if (arrayList.size() == 0) {
                fVar.f16587c = RecyclerView.UNDEFINED_DURATION;
            }
            if (cVar2.f16518a.isRemoved() || cVar2.f16518a.isUpdated()) {
                fVar.f16588d -= StaggeredGridLayoutManager.this.f16552r.c(viewRemove);
            }
            fVar.f16586b = RecyclerView.UNDEFINED_DURATION;
            G0(viewN);
            wVar.i(viewN);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean v() {
        return this.f16554t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void v0(int i, int i10) {
        l1(i, i10, 8);
    }

    public final void v1() {
        if (this.f16554t == 1 || !n1()) {
            this.f16558x = this.f16557w;
        } else {
            this.f16558x = !this.f16557w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean w() {
        return this.f16554t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void w0(int i, int i10) {
        l1(i, i10, 2);
    }

    public final int w1(int i, RecyclerView.w wVar, RecyclerView.B b10) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        r1(i, b10);
        t tVar = this.f16556v;
        int iC1 = c1(wVar, tVar, b10);
        if (tVar.f16762b >= iC1) {
            i = i < 0 ? -iC1 : iC1;
        }
        this.f16552r.o(-i);
        this.f16542D = this.f16558x;
        tVar.f16762b = 0;
        s1(wVar, tVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean x(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void x0(int i, int i10) {
        l1(i, i10, 4);
    }

    public final void x1(int i) {
        t tVar = this.f16556v;
        tVar.f16765e = i;
        tVar.f16764d = this.f16558x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void y0(RecyclerView.w wVar, RecyclerView.B b10) {
        p1(wVar, b10, true);
    }

    public final void y1(int i) {
        t(null);
        if (i != this.f16550p) {
            this.f16540B.a();
            J0();
            this.f16550p = i;
            this.f16559y = new BitSet(this.f16550p);
            this.f16551q = new f[this.f16550p];
            for (int i10 = 0; i10 < this.f16550p; i10++) {
                this.f16551q[i10] = new f(i10);
            }
            J0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void z(int i, int i10, RecyclerView.B b10, s.b bVar) {
        t tVar;
        int iF;
        int iH;
        if (this.f16554t != 0) {
            i = i10;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        r1(i, b10);
        int[] iArr = this.f16548J;
        if (iArr == null || iArr.length < this.f16550p) {
            this.f16548J = new int[this.f16550p];
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f16550p;
            tVar = this.f16556v;
            if (i11 >= i13) {
                break;
            }
            if (tVar.f16764d == -1) {
                iF = tVar.f16766f;
                iH = this.f16551q[i11].h(iF);
            } else {
                iF = this.f16551q[i11].f(tVar.f16767g);
                iH = tVar.f16767g;
            }
            int i14 = iF - iH;
            if (i14 >= 0) {
                this.f16548J[i12] = i14;
                i12++;
            }
            i11++;
        }
        Arrays.sort(this.f16548J, 0, i12);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = tVar.f16763c;
            if (i16 < 0 || i16 >= b10.b()) {
                return;
            }
            bVar.a(tVar.f16763c, this.f16548J[i15]);
            tVar.f16763c += tVar.f16764d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z0(RecyclerView.B b10) {
        this.f16560z = -1;
        this.f16539A = RecyclerView.UNDEFINED_DURATION;
        this.f16544F = null;
        this.f16546H.a();
    }

    public final void z1(int i, RecyclerView.B b10) {
        int iL;
        int iL2;
        int i10;
        t tVar = this.f16556v;
        boolean z10 = false;
        tVar.f16762b = 0;
        tVar.f16763c = i;
        u uVar = this.f16502e;
        if (!(uVar != null && uVar.f16452e) || (i10 = b10.f16463a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f16558x == (i10 < i)) {
                iL = this.f16552r.l();
                iL2 = 0;
            } else {
                iL2 = this.f16552r.l();
                iL = 0;
            }
        }
        if (Q()) {
            tVar.f16766f = this.f16552r.k() - iL2;
            tVar.f16767g = this.f16552r.g() + iL;
        } else {
            tVar.f16767g = this.f16552r.f() + iL;
            tVar.f16766f = -iL2;
        }
        tVar.f16768h = false;
        tVar.f16761a = true;
        if (this.f16552r.i() == 0 && this.f16552r.f() == 0) {
            z10 = true;
        }
        tVar.i = z10;
    }

    public StaggeredGridLayoutManager(int i, int i10) {
        this.f16550p = -1;
        this.f16557w = false;
        this.f16558x = false;
        this.f16560z = -1;
        this.f16539A = RecyclerView.UNDEFINED_DURATION;
        this.f16540B = new d();
        this.f16541C = 2;
        this.f16545G = new Rect();
        this.f16546H = new b();
        this.f16547I = true;
        this.f16549K = new a();
        this.f16554t = i10;
        y1(i);
        this.f16556v = new t();
        this.f16552r = A.a(this, this.f16554t);
        this.f16553s = A.a(this, 1 - this.f16554t);
    }
}
