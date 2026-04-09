package androidx.recyclerview.widget;

import N7.G8;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804f {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.C1797e f16628a;

    /* renamed from: e, reason: collision with root package name */
    public View f16632e;

    /* renamed from: d, reason: collision with root package name */
    public int f16631d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f16629b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16630c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f16633a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f16634b;

        public final void a(int i) {
            if (i < 64) {
                this.f16633a &= ~(1 << i);
                return;
            }
            a aVar = this.f16634b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            a aVar = this.f16634b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.f16633a) : Long.bitCount(this.f16633a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f16633a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f16633a) + aVar.b(i - 64);
        }

        public final void c() {
            if (this.f16634b == null) {
                this.f16634b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.f16633a & (1 << i)) != 0;
            }
            c();
            return this.f16634b.d(i - 64);
        }

        public final void e(int i, boolean z10) {
            if (i >= 64) {
                c();
                this.f16634b.e(i - 64, z10);
                return;
            }
            long j4 = this.f16633a;
            boolean z11 = (Long.MIN_VALUE & j4) != 0;
            long j10 = (1 << i) - 1;
            this.f16633a = ((j4 & (~j10)) << 1) | (j4 & j10);
            if (z10) {
                h(i);
            } else {
                a(i);
            }
            if (z11 || this.f16634b != null) {
                c();
                this.f16634b.e(0, z11);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f16634b.f(i - 64);
            }
            long j4 = 1 << i;
            long j10 = this.f16633a;
            boolean z10 = (j10 & j4) != 0;
            long j11 = j10 & (~j4);
            this.f16633a = j11;
            long j12 = j4 - 1;
            this.f16633a = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            a aVar = this.f16634b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f16634b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f16633a = 0L;
            a aVar = this.f16634b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.f16633a |= 1 << i;
            } else {
                c();
                this.f16634b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.f16634b == null) {
                return Long.toBinaryString(this.f16633a);
            }
            return this.f16634b.toString() + "xx" + Long.toBinaryString(this.f16633a);
        }
    }

    public C1804f(RecyclerView.C1797e c1797e) {
        this.f16628a = c1797e;
    }

    public final void a(View view, int i, boolean z10) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f16629b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f16629b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        RecyclerView.F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(G8.q(recyclerView, sb));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(G8.q(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.f16629b.f(iF);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.F childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(G8.q(recyclerView, sb));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iF);
            throw new IllegalArgumentException(G8.q(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return RecyclerView.this.getChildAt(f(i));
    }

    public final int e() {
        return RecyclerView.this.getChildCount() - this.f16630c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i10 = i;
        while (i10 < childCount) {
            a aVar = this.f16629b;
            int iB = i - (i10 - aVar.b(i10));
            if (iB == 0) {
                while (aVar.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public final int h() {
        return RecyclerView.this.getChildCount();
    }

    public final void i(View view) {
        this.f16630c.add(view);
        RecyclerView.C1797e c1797e = this.f16628a;
        RecyclerView.F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final void j(View view) {
        if (this.f16630c.remove(view)) {
            RecyclerView.C1797e c1797e = this.f16628a;
            RecyclerView.F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.f16629b.toString() + ", hidden list:" + this.f16630c.size();
    }
}
