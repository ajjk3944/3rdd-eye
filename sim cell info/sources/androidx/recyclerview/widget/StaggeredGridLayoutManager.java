package androidx.recyclerview.widget;

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
import b0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;

    /* renamed from: t, reason: collision with root package name */
    f[] f2043t;

    /* renamed from: u, reason: collision with root package name */
    h f2044u;

    /* renamed from: v, reason: collision with root package name */
    h f2045v;

    /* renamed from: w, reason: collision with root package name */
    private int f2046w;

    /* renamed from: x, reason: collision with root package name */
    private int f2047x;

    /* renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f2048y;

    /* renamed from: s, reason: collision with root package name */
    private int f2042s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f2049z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.M1();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f2051a;

        /* renamed from: b, reason: collision with root package name */
        int f2052b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2053c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2054d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2055e;

        /* renamed from: f, reason: collision with root package name */
        int[] f2056f;

        b() {
            c();
        }

        void a() {
            this.f2052b = this.f2053c ? StaggeredGridLayoutManager.this.f2044u.i() : StaggeredGridLayoutManager.this.f2044u.m();
        }

        void b(int i2) {
            this.f2052b = this.f2053c ? StaggeredGridLayoutManager.this.f2044u.i() - i2 : StaggeredGridLayoutManager.this.f2044u.m() + i2;
        }

        void c() {
            this.f2051a = -1;
            this.f2052b = Integer.MIN_VALUE;
            this.f2053c = false;
            this.f2054d = false;
            this.f2055e = false;
            int[] iArr = this.f2056f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2056f;
            if (iArr == null || iArr.length < length) {
                this.f2056f = new int[StaggeredGridLayoutManager.this.f2043t.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f2056f[i2] = fVarArr[i2].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        f f2058e;

        /* renamed from: f, reason: collision with root package name */
        boolean f2059f;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            f fVar = this.f2058e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2080e;
        }

        public boolean f() {
            return this.f2059f;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f2060a;

        /* renamed from: b, reason: collision with root package name */
        List<a> f2061b;

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0015a();

            /* renamed from: b, reason: collision with root package name */
            int f2062b;

            /* renamed from: c, reason: collision with root package name */
            int f2063c;

            /* renamed from: d, reason: collision with root package name */
            int[] f2064d;

            /* renamed from: e, reason: collision with root package name */
            boolean f2065e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0015a implements Parcelable.Creator<a> {
                C0015a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f2062b = parcel.readInt();
                this.f2063c = parcel.readInt();
                this.f2065e = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    this.f2064d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i2) {
                int[] iArr = this.f2064d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2062b + ", mGapDir=" + this.f2063c + ", mHasUnwantedGapAfter=" + this.f2065e + ", mGapPerSpan=" + Arrays.toString(this.f2064d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f2062b);
                parcel.writeInt(this.f2063c);
                parcel.writeInt(this.f2065e ? 1 : 0);
                int[] iArr = this.f2064d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f2064d);
                }
            }
        }

        d() {
        }

        private int i(int i2) {
            if (this.f2061b == null) {
                return -1;
            }
            a aVarF = f(i2);
            if (aVarF != null) {
                this.f2061b.remove(aVarF);
            }
            int size = this.f2061b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (this.f2061b.get(i3).f2062b >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            a aVar = this.f2061b.get(i3);
            this.f2061b.remove(i3);
            return aVar.f2062b;
        }

        private void l(int i2, int i3) {
            List<a> list = this.f2061b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2061b.get(size);
                int i4 = aVar.f2062b;
                if (i4 >= i2) {
                    aVar.f2062b = i4 + i3;
                }
            }
        }

        private void m(int i2, int i3) {
            List<a> list = this.f2061b;
            if (list == null) {
                return;
            }
            int i4 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2061b.get(size);
                int i5 = aVar.f2062b;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f2061b.remove(size);
                    } else {
                        aVar.f2062b = i5 - i3;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f2061b == null) {
                this.f2061b = new ArrayList();
            }
            int size = this.f2061b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = this.f2061b.get(i2);
                if (aVar2.f2062b == aVar.f2062b) {
                    this.f2061b.remove(i2);
                }
                if (aVar2.f2062b >= aVar.f2062b) {
                    this.f2061b.add(i2, aVar);
                    return;
                }
            }
            this.f2061b.add(aVar);
        }

        void b() {
            int[] iArr = this.f2060a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2061b = null;
        }

        void c(int i2) {
            int[] iArr = this.f2060a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f2060a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[o(i2)];
                this.f2060a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2060a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i2) {
            List<a> list = this.f2061b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2061b.get(size).f2062b >= i2) {
                        this.f2061b.remove(size);
                    }
                }
            }
            return h(i2);
        }

        public a e(int i2, int i3, int i4, boolean z2) {
            List<a> list = this.f2061b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.f2061b.get(i5);
                int i6 = aVar.f2062b;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || aVar.f2063c == i4 || (z2 && aVar.f2065e))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i2) {
            List<a> list = this.f2061b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2061b.get(size);
                if (aVar.f2062b == i2) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i2) {
            int[] iArr = this.f2060a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        int h(int i2) {
            int[] iArr = this.f2060a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int i3 = i(i2);
            if (i3 == -1) {
                int[] iArr2 = this.f2060a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.f2060a.length;
            }
            int i4 = i3 + 1;
            Arrays.fill(this.f2060a, i2, i4, -1);
            return i4;
        }

        void j(int i2, int i3) {
            int[] iArr = this.f2060a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.f2060a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.f2060a, i2, i4, -1);
            l(i2, i3);
        }

        void k(int i2, int i3) {
            int[] iArr = this.f2060a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.f2060a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f2060a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            m(i2, i3);
        }

        void n(int i2, f fVar) {
            c(i2);
            this.f2060a[i2] = fVar.f2080e;
        }

        int o(int i2) {
            int length = this.f2060a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f2066b;

        /* renamed from: c, reason: collision with root package name */
        int f2067c;

        /* renamed from: d, reason: collision with root package name */
        int f2068d;

        /* renamed from: e, reason: collision with root package name */
        int[] f2069e;

        /* renamed from: f, reason: collision with root package name */
        int f2070f;

        /* renamed from: g, reason: collision with root package name */
        int[] f2071g;

        /* renamed from: h, reason: collision with root package name */
        List<d.a> f2072h;

        /* renamed from: i, reason: collision with root package name */
        boolean f2073i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2074j;

        /* renamed from: k, reason: collision with root package name */
        boolean f2075k;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f2066b = parcel.readInt();
            this.f2067c = parcel.readInt();
            int i2 = parcel.readInt();
            this.f2068d = i2;
            if (i2 > 0) {
                int[] iArr = new int[i2];
                this.f2069e = iArr;
                parcel.readIntArray(iArr);
            }
            int i3 = parcel.readInt();
            this.f2070f = i3;
            if (i3 > 0) {
                int[] iArr2 = new int[i3];
                this.f2071g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f2073i = parcel.readInt() == 1;
            this.f2074j = parcel.readInt() == 1;
            this.f2075k = parcel.readInt() == 1;
            this.f2072h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2068d = eVar.f2068d;
            this.f2066b = eVar.f2066b;
            this.f2067c = eVar.f2067c;
            this.f2069e = eVar.f2069e;
            this.f2070f = eVar.f2070f;
            this.f2071g = eVar.f2071g;
            this.f2073i = eVar.f2073i;
            this.f2074j = eVar.f2074j;
            this.f2075k = eVar.f2075k;
            this.f2072h = eVar.f2072h;
        }

        void a() {
            this.f2069e = null;
            this.f2068d = 0;
            this.f2070f = 0;
            this.f2071g = null;
            this.f2072h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f2066b);
            parcel.writeInt(this.f2067c);
            parcel.writeInt(this.f2068d);
            if (this.f2068d > 0) {
                parcel.writeIntArray(this.f2069e);
            }
            parcel.writeInt(this.f2070f);
            if (this.f2070f > 0) {
                parcel.writeIntArray(this.f2071g);
            }
            parcel.writeInt(this.f2073i ? 1 : 0);
            parcel.writeInt(this.f2074j ? 1 : 0);
            parcel.writeInt(this.f2075k ? 1 : 0);
            parcel.writeList(this.f2072h);
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f2076a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f2077b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f2078c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f2079d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f2080e;

        f(int i2) {
            this.f2080e = i2;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f2058e = this;
            this.f2076a.add(view);
            this.f2078c = Integer.MIN_VALUE;
            if (this.f2076a.size() == 1) {
                this.f2077b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f2079d += StaggeredGridLayoutManager.this.f2044u.e(view);
            }
        }

        void b(boolean z2, int i2) {
            int iL = z2 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z2 || iL >= StaggeredGridLayoutManager.this.f2044u.i()) {
                if (z2 || iL <= StaggeredGridLayoutManager.this.f2044u.m()) {
                    if (i2 != Integer.MIN_VALUE) {
                        iL += i2;
                    }
                    this.f2078c = iL;
                    this.f2077b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f2076a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f2078c = StaggeredGridLayoutManager.this.f2044u.d(view);
            if (cVarN.f2059f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f2063c == 1) {
                this.f2078c += aVarF.a(this.f2080e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f2076a.get(0);
            c cVarN = n(view);
            this.f2077b = StaggeredGridLayoutManager.this.f2044u.g(view);
            if (cVarN.f2059f && (aVarF = StaggeredGridLayoutManager.this.E.f(cVarN.a())) != null && aVarF.f2063c == -1) {
                this.f2077b -= aVarF.a(this.f2080e);
            }
        }

        void e() {
            this.f2076a.clear();
            q();
            this.f2079d = 0;
        }

        public int f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f2049z) {
                size = this.f2076a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f2076a.size();
            }
            return i(size, size2, true);
        }

        public int g() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f2049z) {
                size = 0;
                size2 = this.f2076a.size();
            } else {
                size = this.f2076a.size() - 1;
                size2 = -1;
            }
            return i(size, size2, true);
        }

        int h(int i2, int i3, boolean z2, boolean z3, boolean z4) {
            int iM = StaggeredGridLayoutManager.this.f2044u.m();
            int i4 = StaggeredGridLayoutManager.this.f2044u.i();
            int i5 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.f2076a.get(i2);
                int iG = StaggeredGridLayoutManager.this.f2044u.g(view);
                int iD = StaggeredGridLayoutManager.this.f2044u.d(view);
                boolean z5 = false;
                boolean z6 = !z4 ? iG >= i4 : iG > i4;
                if (!z4 ? iD > iM : iD >= iM) {
                    z5 = true;
                }
                if (z6 && z5) {
                    if (z2 && z3) {
                        if (iG >= iM && iD <= i4) {
                            return StaggeredGridLayoutManager.this.f0(view);
                        }
                    } else if (z3 || iG < iM || iD > i4) {
                        return StaggeredGridLayoutManager.this.f0(view);
                    }
                }
                i2 += i5;
            }
            return -1;
        }

        int i(int i2, int i3, boolean z2) {
            return h(i2, i3, false, false, z2);
        }

        public int j() {
            return this.f2079d;
        }

        int k() {
            int i2 = this.f2078c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            c();
            return this.f2078c;
        }

        int l(int i2) {
            int i3 = this.f2078c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f2076a.size() == 0) {
                return i2;
            }
            c();
            return this.f2078c;
        }

        public View m(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f2076a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2076a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2049z && staggeredGridLayoutManager.f0(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2049z && staggeredGridLayoutManager2.f0(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2076a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f2076a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2049z && staggeredGridLayoutManager3.f0(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2049z && staggeredGridLayoutManager4.f0(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i2 = this.f2077b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            d();
            return this.f2077b;
        }

        int p(int i2) {
            int i3 = this.f2077b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f2076a.size() == 0) {
                return i2;
            }
            d();
            return this.f2077b;
        }

        void q() {
            this.f2077b = Integer.MIN_VALUE;
            this.f2078c = Integer.MIN_VALUE;
        }

        void r(int i2) {
            int i3 = this.f2077b;
            if (i3 != Integer.MIN_VALUE) {
                this.f2077b = i3 + i2;
            }
            int i4 = this.f2078c;
            if (i4 != Integer.MIN_VALUE) {
                this.f2078c = i4 + i2;
            }
        }

        void s() {
            int size = this.f2076a.size();
            View viewRemove = this.f2076a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f2058e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f2079d -= StaggeredGridLayoutManager.this.f2044u.e(viewRemove);
            }
            if (size == 1) {
                this.f2077b = Integer.MIN_VALUE;
            }
            this.f2078c = Integer.MIN_VALUE;
        }

        void t() {
            View viewRemove = this.f2076a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f2058e = null;
            if (this.f2076a.size() == 0) {
                this.f2078c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f2079d -= StaggeredGridLayoutManager.this.f2044u.e(viewRemove);
            }
            this.f2077b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f2058e = this;
            this.f2076a.add(0, view);
            this.f2077b = Integer.MIN_VALUE;
            if (this.f2076a.size() == 1) {
                this.f2078c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f2079d += StaggeredGridLayoutManager.this.f2044u.e(view);
            }
        }

        void v(int i2) {
            this.f2077b = i2;
            this.f2078c = i2;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.o.d dVarG0 = RecyclerView.o.g0(context, attributeSet, i2, i3);
        B2(dVarG0.f2018a);
        D2(dVarG0.f2019b);
        C2(dVarG0.f2020c);
        this.f2048y = new androidx.recyclerview.widget.f();
        U1();
    }

    private void A2(int i2) {
        androidx.recyclerview.widget.f fVar = this.f2048y;
        fVar.f2200e = i2;
        fVar.f2199d = this.A != (i2 == -1) ? -1 : 1;
    }

    private void E2(int i2, int i3) {
        for (int i4 = 0; i4 < this.f2042s; i4++) {
            if (!this.f2043t[i4].f2076a.isEmpty()) {
                K2(this.f2043t[i4], i2, i3);
            }
        }
    }

    private boolean F2(RecyclerView.a0 a0Var, b bVar) {
        boolean z2 = this.G;
        int iB = a0Var.b();
        bVar.f2051a = z2 ? a2(iB) : W1(iB);
        bVar.f2052b = Integer.MIN_VALUE;
        return true;
    }

    private void G1(View view) {
        for (int i2 = this.f2042s - 1; i2 >= 0; i2--) {
            this.f2043t[i2].a(view);
        }
    }

    private void H1(b bVar) {
        boolean z2;
        e eVar = this.I;
        int i2 = eVar.f2068d;
        if (i2 > 0) {
            if (i2 == this.f2042s) {
                for (int i3 = 0; i3 < this.f2042s; i3++) {
                    this.f2043t[i3].e();
                    e eVar2 = this.I;
                    int i4 = eVar2.f2069e[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        i4 += eVar2.f2074j ? this.f2044u.i() : this.f2044u.m();
                    }
                    this.f2043t[i3].v(i4);
                }
            } else {
                eVar.a();
                e eVar3 = this.I;
                eVar3.f2066b = eVar3.f2067c;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f2075k;
        C2(eVar4.f2073i);
        y2();
        e eVar5 = this.I;
        int i5 = eVar5.f2066b;
        if (i5 != -1) {
            this.C = i5;
            z2 = eVar5.f2074j;
        } else {
            z2 = this.A;
        }
        bVar.f2053c = z2;
        if (eVar5.f2070f > 1) {
            d dVar = this.E;
            dVar.f2060a = eVar5.f2071g;
            dVar.f2061b = eVar5.f2072h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f2048y
            r1 = 0
            r0.f2197b = r1
            r0.f2198c = r5
            boolean r0 = r4.v0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.h r5 = r4.f2044u
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.h r5 = r4.f2044u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.L()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f2048y
            androidx.recyclerview.widget.h r3 = r4.f2044u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f2201f = r3
            androidx.recyclerview.widget.f r6 = r4.f2048y
            androidx.recyclerview.widget.h r0 = r4.f2044u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f2202g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f2048y
            androidx.recyclerview.widget.h r3 = r4.f2044u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f2202g = r3
            androidx.recyclerview.widget.f r5 = r4.f2048y
            int r6 = -r6
            r5.f2201f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f2048y
            r5.f2203h = r1
            r5.f2196a = r2
            androidx.recyclerview.widget.h r6 = r4.f2044u
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.h r6 = r4.f2044u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f2204i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.I2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void K1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f2200e == 1) {
            if (cVar.f2059f) {
                G1(view);
                return;
            } else {
                cVar.f2058e.a(view);
                return;
            }
        }
        if (cVar.f2059f) {
            t2(view);
        } else {
            cVar.f2058e.u(view);
        }
    }

    private void K2(f fVar, int i2, int i3) {
        int iJ = fVar.j();
        if (i2 == -1) {
            if (fVar.o() + iJ > i3) {
                return;
            }
        } else if (fVar.k() - iJ < i3) {
            return;
        }
        this.B.set(fVar.f2080e, false);
    }

    private int L1(int i2) {
        if (I() == 0) {
            return this.A ? 1 : -1;
        }
        return (i2 < d2()) != this.A ? -1 : 1;
    }

    private int L2(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    private boolean N1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f2044u.i()) {
                ArrayList<View> arrayList = fVar.f2076a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f2059f;
            }
        } else if (fVar.o() > this.f2044u.m()) {
            return !fVar.n(fVar.f2076a.get(0)).f2059f;
        }
        return false;
    }

    private int O1(RecyclerView.a0 a0Var) {
        if (I() == 0) {
            return 0;
        }
        return j.a(a0Var, this.f2044u, Y1(!this.N), X1(!this.N), this, this.N);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (I() == 0) {
            return 0;
        }
        return j.b(a0Var, this.f2044u, Y1(!this.N), X1(!this.N), this, this.N, this.A);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (I() == 0) {
            return 0;
        }
        return j.c(a0Var, this.f2044u, Y1(!this.N), X1(!this.N), this, this.N);
    }

    private int R1(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f2046w == 1) ? 1 : Integer.MIN_VALUE : this.f2046w == 0 ? 1 : Integer.MIN_VALUE : this.f2046w == 1 ? -1 : Integer.MIN_VALUE : this.f2046w == 0 ? -1 : Integer.MIN_VALUE : (this.f2046w != 1 && n2()) ? -1 : 1 : (this.f2046w != 1 && n2()) ? 1 : -1;
    }

    private d.a S1(int i2) {
        d.a aVar = new d.a();
        aVar.f2064d = new int[this.f2042s];
        for (int i3 = 0; i3 < this.f2042s; i3++) {
            aVar.f2064d[i3] = i2 - this.f2043t[i3].l(i2);
        }
        return aVar;
    }

    private d.a T1(int i2) {
        d.a aVar = new d.a();
        aVar.f2064d = new int[this.f2042s];
        for (int i3 = 0; i3 < this.f2042s; i3++) {
            aVar.f2064d[i3] = this.f2043t[i3].p(i2) - i2;
        }
        return aVar;
    }

    private void U1() {
        this.f2044u = h.b(this, this.f2046w);
        this.f2045v = h.b(this, 1 - this.f2046w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int V1(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, RecyclerView.a0 a0Var) {
        int i2;
        f fVarJ2;
        int iE;
        int i3;
        int iE2;
        int iE3;
        RecyclerView.o oVar;
        View view;
        int i4;
        int i5;
        ?? r9 = 0;
        this.B.set(0, this.f2042s, true);
        if (this.f2048y.f2204i) {
            i2 = fVar.f2200e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = fVar.f2200e == 1 ? fVar.f2202g + fVar.f2197b : fVar.f2201f - fVar.f2197b;
        }
        E2(fVar.f2200e, i2);
        int i6 = this.A ? this.f2044u.i() : this.f2044u.m();
        boolean z2 = false;
        while (fVar.a(a0Var) && (this.f2048y.f2204i || !this.B.isEmpty())) {
            View viewB = fVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.E.g(iA);
            boolean z3 = iG == -1;
            if (z3) {
                fVarJ2 = cVar.f2059f ? this.f2043t[r9] : j2(fVar);
                this.E.n(iA, fVarJ2);
            } else {
                fVarJ2 = this.f2043t[iG];
            }
            f fVar2 = fVarJ2;
            cVar.f2058e = fVar2;
            if (fVar.f2200e == 1) {
                c(viewB);
            } else {
                d(viewB, r9);
            }
            p2(viewB, cVar, r9);
            if (fVar.f2200e == 1) {
                int iF2 = cVar.f2059f ? f2(i6) : fVar2.l(i6);
                int iE4 = this.f2044u.e(viewB) + iF2;
                if (z3 && cVar.f2059f) {
                    d.a aVarS1 = S1(iF2);
                    aVarS1.f2063c = -1;
                    aVarS1.f2062b = iA;
                    this.E.a(aVarS1);
                }
                i3 = iE4;
                iE = iF2;
            } else {
                int iI2 = cVar.f2059f ? i2(i6) : fVar2.p(i6);
                iE = iI2 - this.f2044u.e(viewB);
                if (z3 && cVar.f2059f) {
                    d.a aVarT1 = T1(iI2);
                    aVarT1.f2063c = 1;
                    aVarT1.f2062b = iA;
                    this.E.a(aVarT1);
                }
                i3 = iI2;
            }
            if (cVar.f2059f && fVar.f2199d == -1) {
                if (z3) {
                    this.M = true;
                } else {
                    if (!(fVar.f2200e == 1 ? I1() : J1())) {
                        d.a aVarF = this.E.f(iA);
                        if (aVarF != null) {
                            aVarF.f2065e = true;
                        }
                        this.M = true;
                    }
                }
            }
            K1(viewB, cVar, fVar);
            if (n2() && this.f2046w == 1) {
                int i7 = cVar.f2059f ? this.f2045v.i() : this.f2045v.i() - (((this.f2042s - 1) - fVar2.f2080e) * this.f2047x);
                iE3 = i7;
                iE2 = i7 - this.f2045v.e(viewB);
            } else {
                int iM = cVar.f2059f ? this.f2045v.m() : (fVar2.f2080e * this.f2047x) + this.f2045v.m();
                iE2 = iM;
                iE3 = this.f2045v.e(viewB) + iM;
            }
            if (this.f2046w == 1) {
                oVar = this;
                view = viewB;
                i4 = iE2;
                iE2 = iE;
                i5 = iE3;
            } else {
                oVar = this;
                view = viewB;
                i4 = iE;
                i5 = i3;
                i3 = iE3;
            }
            oVar.x0(view, i4, iE2, i5, i3);
            if (cVar.f2059f) {
                E2(this.f2048y.f2200e, i2);
            } else {
                K2(fVar2, this.f2048y.f2200e, i2);
            }
            u2(vVar, this.f2048y);
            if (this.f2048y.f2203h && viewB.hasFocusable()) {
                if (cVar.f2059f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar2.f2080e, false);
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            u2(vVar, this.f2048y);
        }
        int iM2 = this.f2048y.f2200e == -1 ? this.f2044u.m() - i2(this.f2044u.m()) : f2(this.f2044u.i()) - this.f2044u.i();
        if (iM2 > 0) {
            return Math.min(fVar.f2197b, iM2);
        }
        return 0;
    }

    private int W1(int i2) {
        int I = I();
        for (int i3 = 0; i3 < I; i3++) {
            int iF0 = f0(H(i3));
            if (iF0 >= 0 && iF0 < i2) {
                return iF0;
            }
        }
        return 0;
    }

    private int a2(int i2) {
        for (int I = I() - 1; I >= 0; I--) {
            int iF0 = f0(H(I));
            if (iF0 >= 0 && iF0 < i2) {
                return iF0;
            }
        }
        return 0;
    }

    private void b2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int i2;
        int iF2 = f2(Integer.MIN_VALUE);
        if (iF2 != Integer.MIN_VALUE && (i2 = this.f2044u.i() - iF2) > 0) {
            int i3 = i2 - (-z2(-i2, vVar, a0Var));
            if (!z2 || i3 <= 0) {
                return;
            }
            this.f2044u.r(i3);
        }
    }

    private void c2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int iM;
        int iI2 = i2(Integer.MAX_VALUE);
        if (iI2 != Integer.MAX_VALUE && (iM = iI2 - this.f2044u.m()) > 0) {
            int iZ2 = iM - z2(iM, vVar, a0Var);
            if (!z2 || iZ2 <= 0) {
                return;
            }
            this.f2044u.r(-iZ2);
        }
    }

    private int f2(int i2) {
        int iL = this.f2043t[0].l(i2);
        for (int i3 = 1; i3 < this.f2042s; i3++) {
            int iL2 = this.f2043t[i3].l(i2);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int g2(int i2) {
        int iP = this.f2043t[0].p(i2);
        for (int i3 = 1; i3 < this.f2042s; i3++) {
            int iP2 = this.f2043t[i3].p(i2);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int h2(int i2) {
        int iL = this.f2043t[0].l(i2);
        for (int i3 = 1; i3 < this.f2042s; i3++) {
            int iL2 = this.f2043t[i3].l(i2);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int i2(int i2) {
        int iP = this.f2043t[0].p(i2);
        for (int i3 = 1; i3 < this.f2042s; i3++) {
            int iP2 = this.f2043t[i3].p(i2);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f j2(androidx.recyclerview.widget.f fVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (r2(fVar.f2200e)) {
            i2 = this.f2042s - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.f2042s;
            i3 = 1;
        }
        f fVar2 = null;
        if (fVar.f2200e == 1) {
            int i5 = Integer.MAX_VALUE;
            int iM = this.f2044u.m();
            while (i2 != i4) {
                f fVar3 = this.f2043t[i2];
                int iL = fVar3.l(iM);
                if (iL < i5) {
                    fVar2 = fVar3;
                    i5 = iL;
                }
                i2 += i3;
            }
            return fVar2;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = this.f2044u.i();
        while (i2 != i4) {
            f fVar4 = this.f2043t[i2];
            int iP = fVar4.p(i7);
            if (iP > i6) {
                fVar2 = fVar4;
                i6 = iP;
            }
            i2 += i3;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void k2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.e2()
            goto Ld
        L9:
            int r0 = r6.d2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.d2()
            goto L51
        L4d:
            int r7 = r6.e2()
        L51:
            if (r3 > r7) goto L56
            r6.q1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.k2(int, int, int):void");
    }

    private void o2(View view, int i2, int i3, boolean z2) {
        i(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iL2 = L2(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iL22 = L2(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z2 ? D1(view, iL2, iL22, cVar) : B1(view, iL2, iL22, cVar)) {
            view.measure(iL2, iL22);
        }
    }

    private void p2(View view, c cVar, boolean z2) {
        int iJ;
        int iJ2;
        if (cVar.f2059f) {
            if (this.f2046w != 1) {
                o2(view, RecyclerView.o.J(m0(), n0(), c0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z2);
                return;
            }
            iJ = this.J;
        } else {
            if (this.f2046w != 1) {
                iJ = RecyclerView.o.J(m0(), n0(), c0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                iJ2 = RecyclerView.o.J(this.f2047x, W(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                o2(view, iJ, iJ2, z2);
            }
            iJ = RecyclerView.o.J(this.f2047x, n0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        iJ2 = RecyclerView.o.J(V(), W(), e0() + b0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        o2(view, iJ, iJ2, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean r2(int i2) {
        if (this.f2046w == 0) {
            return (i2 == -1) != this.A;
        }
        return ((i2 == -1) == this.A) == n2();
    }

    private void t2(View view) {
        for (int i2 = this.f2042s - 1; i2 >= 0; i2--) {
            this.f2043t[i2].u(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f2200e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f2196a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f2204i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f2197b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f2200e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f2202g
        L14:
            r2.v2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f2201f
        L1a:
            r2.w2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f2200e
            if (r0 != r1) goto L37
            int r0 = r4.f2201f
            int r1 = r2.g2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f2202g
            int r4 = r4.f2197b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f2202g
            int r0 = r2.h2(r0)
            int r1 = r4.f2202g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f2201f
            int r4 = r4.f2197b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    private void v2(RecyclerView.v vVar, int i2) {
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            if (this.f2044u.g(viewH) < i2 || this.f2044u.q(viewH) < i2) {
                return;
            }
            c cVar = (c) viewH.getLayoutParams();
            if (cVar.f2059f) {
                for (int i3 = 0; i3 < this.f2042s; i3++) {
                    if (this.f2043t[i3].f2076a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f2042s; i4++) {
                    this.f2043t[i4].s();
                }
            } else if (cVar.f2058e.f2076a.size() == 1) {
                return;
            } else {
                cVar.f2058e.s();
            }
            j1(viewH, vVar);
        }
    }

    private void w2(RecyclerView.v vVar, int i2) {
        while (I() > 0) {
            View viewH = H(0);
            if (this.f2044u.d(viewH) > i2 || this.f2044u.p(viewH) > i2) {
                return;
            }
            c cVar = (c) viewH.getLayoutParams();
            if (cVar.f2059f) {
                for (int i3 = 0; i3 < this.f2042s; i3++) {
                    if (this.f2043t[i3].f2076a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f2042s; i4++) {
                    this.f2043t[i4].t();
                }
            } else if (cVar.f2058e.f2076a.size() == 1) {
                return;
            } else {
                cVar.f2058e.t();
            }
            j1(viewH, vVar);
        }
    }

    private void x2() {
        if (this.f2045v.k() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = H(i2);
            float fE = this.f2045v.e(viewH);
            if (fE >= fMax) {
                if (((c) viewH.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f2042s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i3 = this.f2047x;
        int iRound = Math.round(fMax * this.f2042s);
        if (this.f2045v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f2045v.n());
        }
        J2(iRound);
        if (this.f2047x == i3) {
            return;
        }
        for (int i4 = 0; i4 < I; i4++) {
            View viewH2 = H(i4);
            c cVar = (c) viewH2.getLayoutParams();
            if (!cVar.f2059f) {
                if (n2() && this.f2046w == 1) {
                    int i5 = this.f2042s;
                    int i6 = cVar.f2058e.f2080e;
                    viewH2.offsetLeftAndRight(((-((i5 - 1) - i6)) * this.f2047x) - ((-((i5 - 1) - i6)) * i3));
                } else {
                    int i7 = cVar.f2058e.f2080e;
                    int i8 = this.f2046w;
                    int i9 = (this.f2047x * i7) - (i7 * i3);
                    if (i8 == 1) {
                        viewH2.offsetLeftAndRight(i9);
                    } else {
                        viewH2.offsetTopAndBottom(i9);
                    }
                }
            }
        }
    }

    private void y2() {
        this.A = (this.f2046w == 1 || !n2()) ? this.f2049z : !this.f2049z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void A0(int i2) {
        super.A0(i2);
        for (int i3 = 0; i3 < this.f2042s; i3++) {
            this.f2043t[i3].r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B0(int i2) {
        super.B0(i2);
        for (int i3 = 0; i3 < this.f2042s; i3++) {
            this.f2043t[i3].r(i2);
        }
    }

    public void B2(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        f(null);
        if (i2 == this.f2046w) {
            return;
        }
        this.f2046w = i2;
        h hVar = this.f2044u;
        this.f2044u = this.f2045v;
        this.f2045v = hVar;
        q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p C() {
        return this.f2046w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void C2(boolean z2) {
        f(null);
        e eVar = this.I;
        if (eVar != null && eVar.f2073i != z2) {
            eVar.f2073i = z2;
        }
        this.f2049z = z2;
        q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void D2(int i2) {
        f(null);
        if (i2 != this.f2042s) {
            m2();
            this.f2042s = i2;
            this.B = new BitSet(this.f2042s);
            this.f2043t = new f[this.f2042s];
            for (int i3 = 0; i3 < this.f2042s; i3++) {
                this.f2043t[i3] = new f(i3);
            }
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F1() {
        return this.I == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.G0(recyclerView, vVar);
        l1(this.P);
        for (int i2 = 0; i2 < this.f2042s; i2++) {
            this.f2043t[i2].e();
        }
        recyclerView.requestLayout();
    }

    boolean G2(RecyclerView.a0 a0Var, b bVar) {
        int i2;
        int iM;
        int iG;
        if (!a0Var.e() && (i2 = this.C) != -1) {
            if (i2 >= 0 && i2 < a0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f2066b == -1 || eVar.f2068d < 1) {
                    View viewB = B(this.C);
                    if (viewB != null) {
                        bVar.f2051a = this.A ? e2() : d2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f2053c) {
                                iM = this.f2044u.i() - this.D;
                                iG = this.f2044u.d(viewB);
                            } else {
                                iM = this.f2044u.m() + this.D;
                                iG = this.f2044u.g(viewB);
                            }
                            bVar.f2052b = iM - iG;
                            return true;
                        }
                        if (this.f2044u.e(viewB) > this.f2044u.n()) {
                            bVar.f2052b = bVar.f2053c ? this.f2044u.i() : this.f2044u.m();
                            return true;
                        }
                        int iG2 = this.f2044u.g(viewB) - this.f2044u.m();
                        if (iG2 < 0) {
                            bVar.f2052b = -iG2;
                            return true;
                        }
                        int i3 = this.f2044u.i() - this.f2044u.d(viewB);
                        if (i3 < 0) {
                            bVar.f2052b = i3;
                            return true;
                        }
                        bVar.f2052b = Integer.MIN_VALUE;
                    } else {
                        int i4 = this.C;
                        bVar.f2051a = i4;
                        int i5 = this.D;
                        if (i5 == Integer.MIN_VALUE) {
                            bVar.f2053c = L1(i4) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i5);
                        }
                        bVar.f2054d = true;
                    }
                } else {
                    bVar.f2052b = Integer.MIN_VALUE;
                    bVar.f2051a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H0(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View viewA;
        View viewM;
        if (I() == 0 || (viewA = A(view)) == null) {
            return null;
        }
        y2();
        int iR1 = R1(i2);
        if (iR1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewA.getLayoutParams();
        boolean z2 = cVar.f2059f;
        f fVar = cVar.f2058e;
        int iE2 = iR1 == 1 ? e2() : d2();
        I2(iE2, a0Var);
        A2(iR1);
        androidx.recyclerview.widget.f fVar2 = this.f2048y;
        fVar2.f2198c = fVar2.f2199d + iE2;
        fVar2.f2197b = (int) (this.f2044u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f2048y;
        fVar3.f2203h = true;
        fVar3.f2196a = false;
        V1(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z2 && (viewM = fVar.m(iE2, iR1)) != null && viewM != viewA) {
            return viewM;
        }
        if (r2(iR1)) {
            for (int i3 = this.f2042s - 1; i3 >= 0; i3--) {
                View viewM2 = this.f2043t[i3].m(iE2, iR1);
                if (viewM2 != null && viewM2 != viewA) {
                    return viewM2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f2042s; i4++) {
                View viewM3 = this.f2043t[i4].m(iE2, iR1);
                if (viewM3 != null && viewM3 != viewA) {
                    return viewM3;
                }
            }
        }
        boolean z3 = (this.f2049z ^ true) == (iR1 == -1);
        if (!z2) {
            View viewB = B(z3 ? fVar.f() : fVar.g());
            if (viewB != null && viewB != viewA) {
                return viewB;
            }
        }
        if (r2(iR1)) {
            for (int i5 = this.f2042s - 1; i5 >= 0; i5--) {
                if (i5 != fVar.f2080e) {
                    f[] fVarArr = this.f2043t;
                    View viewB2 = B(z3 ? fVarArr[i5].f() : fVarArr[i5].g());
                    if (viewB2 != null && viewB2 != viewA) {
                        return viewB2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2042s; i6++) {
                f[] fVarArr2 = this.f2043t;
                View viewB3 = B(z3 ? fVarArr2[i6].f() : fVarArr2[i6].g());
                if (viewB3 != null && viewB3 != viewA) {
                    return viewB3;
                }
            }
        }
        return null;
    }

    void H2(RecyclerView.a0 a0Var, b bVar) {
        if (G2(a0Var, bVar) || F2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f2051a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(AccessibilityEvent accessibilityEvent) {
        super.I0(accessibilityEvent);
        if (I() > 0) {
            View viewY1 = Y1(false);
            View viewX1 = X1(false);
            if (viewY1 == null || viewX1 == null) {
                return;
            }
            int iF0 = f0(viewY1);
            int iF02 = f0(viewX1);
            if (iF0 < iF02) {
                accessibilityEvent.setFromIndex(iF0);
                accessibilityEvent.setToIndex(iF02);
            } else {
                accessibilityEvent.setFromIndex(iF02);
                accessibilityEvent.setToIndex(iF0);
            }
        }
    }

    boolean I1() {
        int iL = this.f2043t[0].l(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f2042s; i2++) {
            if (this.f2043t[i2].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean J1() {
        int iP = this.f2043t[0].p(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f2042s; i2++) {
            if (this.f2043t[i2].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void J2(int i2) {
        this.f2047x = i2 / this.f2042s;
        this.J = View.MeasureSpec.makeMeasureSpec(i2, this.f2045v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int M(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f2046w == 1 ? this.f2042s : super.M(vVar, a0Var);
    }

    boolean M1() {
        int iD2;
        int iE2;
        if (I() == 0 || this.F == 0 || !p0()) {
            return false;
        }
        if (this.A) {
            iD2 = e2();
            iE2 = d2();
        } else {
            iD2 = d2();
            iE2 = e2();
        }
        if (iD2 == 0 && l2() != null) {
            this.E.b();
        } else {
            if (!this.M) {
                return false;
            }
            int i2 = this.A ? -1 : 1;
            int i3 = iE2 + 1;
            d.a aVarE = this.E.e(iD2, i3, i2, true);
            if (aVarE == null) {
                this.M = false;
                this.E.d(i3);
                return false;
            }
            d.a aVarE2 = this.E.e(iD2, aVarE.f2062b, i2 * (-1), true);
            if (aVarE2 == null) {
                this.E.d(aVarE.f2062b);
            } else {
                this.E.d(aVarE2.f2062b + 1);
            }
        }
        r1();
        q1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, b0.c cVar) {
        int iE;
        int i2;
        int iE2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.M0(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.f2046w == 0) {
            iE = cVar2.e();
            i2 = cVar2.f2059f ? this.f2042s : 1;
            iE2 = -1;
            i3 = -1;
        } else {
            iE = -1;
            i2 = -1;
            iE2 = cVar2.e();
            i3 = cVar2.f2059f ? this.f2042s : 1;
        }
        cVar.L(c.C0022c.a(iE, i2, iE2, i3, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, int i2, int i3) {
        k2(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(RecyclerView recyclerView) {
        this.E.b();
        q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i2, int i3, int i4) {
        k2(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView, int i2, int i3) {
        k2(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        k2(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        q2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.a0 a0Var) {
        super.W0(a0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    View X1(boolean z2) {
        int iM = this.f2044u.m();
        int i2 = this.f2044u.i();
        View view = null;
        for (int I = I() - 1; I >= 0; I--) {
            View viewH = H(I);
            int iG = this.f2044u.g(viewH);
            int iD = this.f2044u.d(viewH);
            if (iD > iM && iG < i2) {
                if (iD <= i2 || !z2) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    View Y1(boolean z2) {
        int iM = this.f2044u.m();
        int i2 = this.f2044u.i();
        int I = I();
        View view = null;
        for (int i3 = 0; i3 < I; i3++) {
            View viewH = H(i3);
            int iG = this.f2044u.g(viewH);
            if (this.f2044u.d(viewH) > iM && iG < i2) {
                if (iG >= iM || !z2) {
                    return viewH;
                }
                if (view == null) {
                    view = viewH;
                }
            }
        }
        return view;
    }

    int Z1() {
        View viewX1 = this.A ? X1(true) : Y1(true);
        if (viewX1 == null) {
            return -1;
        }
        return f0(viewX1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            q1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable b1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f2073i = this.f2049z;
        eVar.f2074j = this.G;
        eVar.f2075k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f2060a) == null) {
            eVar.f2070f = 0;
        } else {
            eVar.f2071g = iArr;
            eVar.f2070f = iArr.length;
            eVar.f2072h = dVar.f2061b;
        }
        if (I() > 0) {
            eVar.f2066b = this.G ? e2() : d2();
            eVar.f2067c = Z1();
            int i2 = this.f2042s;
            eVar.f2068d = i2;
            eVar.f2069e = new int[i2];
            for (int i3 = 0; i3 < this.f2042s; i3++) {
                if (this.G) {
                    iP = this.f2043t[i3].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f2044u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f2043t[i3].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f2044u.m();
                        iP -= iM;
                    }
                }
                eVar.f2069e[i3] = iP;
            }
        } else {
            eVar.f2066b = -1;
            eVar.f2067c = -1;
            eVar.f2068d = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(int i2) {
        if (i2 == 0) {
            M1();
        }
    }

    int d2() {
        if (I() == 0) {
            return 0;
        }
        return f0(H(0));
    }

    int e2() {
        int I = I();
        if (I == 0) {
            return 0;
        }
        return f0(H(I - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f(String str) {
        if (this.I == null) {
            super.f(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int i0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f2046w == 0 ? this.f2042s : super.i0(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j() {
        return this.f2046w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f2046w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View l2() {
        /*
            r12 = this;
            int r0 = r12.I()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2042s
            r2.<init>(r3)
            int r3 = r12.f2042s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2046w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.n2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.H(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2058e
            int r9 = r9.f2080e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2058e
            boolean r9 = r12.N1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2058e
            int r9 = r9.f2080e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f2059f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.H(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.h r10 = r12.f2044u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.f2044u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.h r10 = r12.f2044u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.h r11 = r12.f2044u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2058e
            int r8 = r8.f2080e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2058e
            int r9 = r9.f2080e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l2():android.view.View");
    }

    public void m2() {
        this.E.b();
        q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int iL;
        int iP;
        if (this.f2046w != 0) {
            i2 = i3;
        }
        if (I() == 0 || i2 == 0) {
            return;
        }
        s2(i2, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f2042s) {
            this.O = new int[this.f2042s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2042s; i5++) {
            androidx.recyclerview.widget.f fVar = this.f2048y;
            if (fVar.f2199d == -1) {
                iL = fVar.f2201f;
                iP = this.f2043t[i5].p(iL);
            } else {
                iL = this.f2043t[i5].l(fVar.f2202g);
                iP = this.f2048y.f2202g;
            }
            int i6 = iL - iP;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.f2048y.a(a0Var); i7++) {
            cVar.a(this.f2048y.f2198c, this.O[i7]);
            androidx.recyclerview.widget.f fVar2 = this.f2048y;
            fVar2.f2198c += fVar2.f2199d;
        }
    }

    boolean n2() {
        return X() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int p(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q0() {
        return this.F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    void s2(int i2, RecyclerView.a0 a0Var) {
        int iD2;
        int i3;
        if (i2 > 0) {
            iD2 = e2();
            i3 = 1;
        } else {
            iD2 = d2();
            i3 = -1;
        }
        this.f2048y.f2196a = true;
        I2(iD2, a0Var);
        A2(i3);
        androidx.recyclerview.widget.f fVar = this.f2048y;
        fVar.f2198c = iD2 + fVar.f2199d;
        fVar.f2197b = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return z2(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return z2(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(Rect rect, int i2, int i3) {
        int iM;
        int iM2;
        int iC0 = c0() + d0();
        int iE0 = e0() + b0();
        if (this.f2046w == 1) {
            iM2 = RecyclerView.o.m(i3, rect.height() + iE0, Z());
            iM = RecyclerView.o.m(i2, (this.f2047x * this.f2042s) + iC0, a0());
        } else {
            iM = RecyclerView.o.m(i2, rect.width() + iC0, a0());
            iM2 = RecyclerView.o.m(i3, (this.f2047x * this.f2042s) + iE0, Z());
        }
        x1(iM, iM2);
    }

    int z2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (I() == 0 || i2 == 0) {
            return 0;
        }
        s2(i2, a0Var);
        int iV1 = V1(vVar, this.f2048y, a0Var);
        if (this.f2048y.f2197b >= iV1) {
            i2 = i2 < 0 ? -iV1 : iV1;
        }
        this.f2044u.r(-i2);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.f2048y;
        fVar.f2197b = 0;
        u2(vVar, fVar);
        return i2;
    }
}
