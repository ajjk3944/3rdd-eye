package M6;

import H6.C0672i;
import H6.C0683u;
import H6.H;
import K6.L1;
import K6.P;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.G7;
import N7.S2;
import N7.Z;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c9.AbstractC2082c;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;
import r7.C5533d;
import z6.C5865d;

/* compiled from: DivPagerAdapter.kt */
/* renamed from: M6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795a extends P<q> {

    /* renamed from: A, reason: collision with root package name */
    public int f4219A;

    /* renamed from: o, reason: collision with root package name */
    public final C0672i f4220o;

    /* renamed from: p, reason: collision with root package name */
    public final C0683u f4221p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray<Float> f4222q;

    /* renamed from: r, reason: collision with root package name */
    public final H f4223r;

    /* renamed from: s, reason: collision with root package name */
    public final C5865d f4224s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f4225t;

    /* renamed from: u, reason: collision with root package name */
    public final O6.t f4226u;

    /* renamed from: v, reason: collision with root package name */
    public final C0076a f4227v;

    /* renamed from: w, reason: collision with root package name */
    public int f4228w;

    /* renamed from: x, reason: collision with root package name */
    public G7.a f4229x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4230y;

    /* renamed from: z, reason: collision with root package name */
    public int f4231z;

    /* compiled from: DivPagerAdapter.kt */
    /* renamed from: M6.a$a, reason: collision with other inner class name */
    public static final class C0076a extends AbstractC2082c<i7.b> {
        public C0076a() {
        }

        @Override // c9.AbstractC2080a
        public final int c() {
            C0795a c0795a = C0795a.this;
            return c0795a.f3271l.c() + (c0795a.f4230y ? 4 : 0);
        }

        @Override // c9.AbstractC2080a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof i7.b) {
                return super.contains((i7.b) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            C0795a c0795a = C0795a.this;
            boolean z10 = c0795a.f4230y;
            L1.b bVar = c0795a.f3271l;
            if (!z10) {
                return (i7.b) bVar.get(i);
            }
            int iC = (bVar.c() + i) - 2;
            int iC2 = bVar.c();
            int i10 = iC % iC2;
            return (i7.b) bVar.get(i10 + (iC2 & (((i10 ^ iC2) & ((-i10) | i10)) >> 31)));
        }

        @Override // c9.AbstractC2082c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof i7.b) {
                return super.indexOf((i7.b) obj);
            }
            return -1;
        }

        @Override // c9.AbstractC2082c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof i7.b) {
                return super.lastIndexOf((i7.b) obj);
            }
            return -1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795a(List<i7.b> list, C0672i c0672i, C0683u c0683u, SparseArray<Float> sparseArray, H viewCreator, C5865d c5865d, boolean z10, O6.t pagerView) {
        super(list);
        kotlin.jvm.internal.l.f(viewCreator, "viewCreator");
        kotlin.jvm.internal.l.f(pagerView, "pagerView");
        this.f4220o = c0672i;
        this.f4221p = c0683u;
        this.f4222q = sparseArray;
        this.f4223r = viewCreator;
        this.f4224s = c5865d;
        this.f4225t = z10;
        this.f4226u = pagerView;
        this.f4227v = new C0076a();
        this.f4229x = G7.a.START;
        this.f4219A = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void c(int i) {
        if (!this.f4230y) {
            notifyItemInserted(i);
            int i10 = this.f4219A;
            if (i10 >= i) {
                this.f4219A = i10 + 1;
                return;
            }
            return;
        }
        int i11 = i + 2;
        notifyItemInserted(i11);
        i(i);
        int i12 = this.f4219A;
        if (i12 >= i11) {
            this.f4219A = i12 + 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void d(int i) {
        this.f4231z++;
        if (!this.f4230y) {
            notifyItemRemoved(i);
            int i10 = this.f4219A;
            if (i10 > i) {
                this.f4219A = i10 - 1;
                return;
            }
            return;
        }
        int i11 = i + 2;
        notifyItemRemoved(i11);
        i(i);
        int i12 = this.f4219A;
        if (i12 > i11) {
            this.f4219A = i12 - 1;
        }
    }

    @Override // K6.L1, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f4227v.c();
    }

    public final void i(int i) {
        L1.b bVar = this.f3271l;
        if (i >= 0 && i < 2) {
            notifyItemRangeChanged(bVar.c() + i, 2 - i);
            return;
        }
        int iC = bVar.c() - 2;
        if (i >= bVar.c() || iC > i) {
            return;
        }
        notifyItemRangeChanged((i - bVar.c()) + 2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        Enum r02;
        q holder = (q) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        i7.b bVar = (i7.b) this.f4227v.get(i);
        C0672i c0672iA = this.f4220o.a(bVar.f38461b);
        int iIndexOf = this.f3269j.indexOf(bVar);
        Z div = bVar.f38460a;
        kotlin.jvm.internal.l.f(div, "div");
        holder.a(c0672iA, div, iIndexOf);
        l lVar = holder.f4290t;
        View child = lVar.getChild();
        ViewGroup.LayoutParams layoutParams = child != null ? child.getLayoutParams() : null;
        C5533d c5533d = layoutParams instanceof C5533d ? (C5533d) layoutParams : null;
        if (c5533d != null) {
            S2 s2D = div.d();
            F7.l lVar2 = holder.f4292v;
            A7.b bVarV = ((Boolean) lVar2.invoke()).booleanValue() ? s2D.v() : s2D.o();
            if (bVarV == null || (r02 = (Enum) bVarV.a(c0672iA.f2147b)) == null) {
                r02 = holder.f4293w.f4233g.f4229x;
            }
            boolean zBooleanValue = ((Boolean) lVar2.invoke()).booleanValue();
            int i10 = 17;
            if (zBooleanValue) {
                if (r02 != G7.a.CENTER && r02 != EnumC1319q2.CENTER) {
                    i10 = (r02 == G7.a.END || r02 == EnumC1319q2.BOTTOM) ? 80 : 48;
                }
            } else if (r02 != G7.a.CENTER && r02 != EnumC1305p2.CENTER) {
                i10 = (r02 == G7.a.END || r02 == EnumC1305p2.END) ? 8388613 : r02 == EnumC1305p2.LEFT ? 3 : r02 == EnumC1305p2.RIGHT ? 5 : 8388611;
            }
            c5533d.f45758a = i10;
            lVar.requestLayout();
        }
        if (holder.f4291u) {
            lVar.setTag(R.id.div_pager_item_clip_id, Integer.valueOf(i));
        }
        Float f11 = this.f4222q.get(i);
        if (f11 != null) {
            float fFloatValue = f11.floatValue();
            if (this.f4228w == 0) {
                holder.itemView.setTranslationX(fFloatValue);
            } else {
                holder.itemView.setTranslationY(fFloatValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        l lVar = new l(this.f4220o.f2146a.getContext$div_release(), new F7.m(this, 1));
        F7.l lVar2 = new F7.l(this, 2);
        C0796b c0796b = new C0796b(this);
        return new q(this.f4220o, lVar, this.f4221p, this.f4223r, this.f4224s, this.f4225t, lVar2, c0796b);
    }
}
