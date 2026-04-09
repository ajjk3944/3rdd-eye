package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.c1;
import androidx.core.view.l0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.ViewBoundsCheck;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.xbill.DNS.KEYRecord;
import s0.x;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements l0, androidx.core.view.b0 {
    public static boolean E0 = false;
    public static boolean F0 = false;
    public static final int[] G0 = {R.attr.nestedScrollingEnabled};
    public static final float H0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean I0 = false;
    public static final boolean J0 = true;
    public static final boolean K0 = true;
    public static final Class[] L0;
    public static final Interpolator M0;
    public static final z N0;
    public int A;
    public boolean A0;
    public boolean B;
    public final o.b B0;
    public final AccessibilityManager C;
    public final androidx.core.view.o C0;
    public List D;
    public androidx.core.view.n D0;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public EdgeEffectFactory I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public EdgeEffect M;
    public ItemAnimator N;
    public int O;
    public int P;
    public VelocityTracker Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public q W;

    /* renamed from: a, reason: collision with root package name */
    public final float f3671a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f3672a0;

    /* renamed from: b, reason: collision with root package name */
    public final w f3673b;

    /* renamed from: b0, reason: collision with root package name */
    public final int f3674b0;

    /* renamed from: c, reason: collision with root package name */
    public final u f3675c;

    /* renamed from: c0, reason: collision with root package name */
    public float f3676c0;

    /* renamed from: d, reason: collision with root package name */
    public SavedState f3677d;

    /* renamed from: d0, reason: collision with root package name */
    public float f3678d0;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.a f3679e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3680e0;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.b f3681f;

    /* renamed from: f0, reason: collision with root package name */
    public final b0 f3682f0;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.o f3683g;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.recyclerview.widget.e f3684g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3685h;

    /* renamed from: h0, reason: collision with root package name */
    public e.b f3686h0;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f3687i;

    /* renamed from: i0, reason: collision with root package name */
    public final y f3688i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f3689j;

    /* renamed from: j0, reason: collision with root package name */
    public s f3690j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f3691k;

    /* renamed from: k0, reason: collision with root package name */
    public List f3692k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f3693l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f3694l0;

    /* renamed from: m, reason: collision with root package name */
    public Adapter f3695m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f3696m0;

    /* renamed from: n, reason: collision with root package name */
    public n f3697n;

    /* renamed from: n0, reason: collision with root package name */
    public ItemAnimator.a f3698n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f3699o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f3700o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3701p;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.recyclerview.widget.k f3702p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3703q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f3704q0;

    /* renamed from: r, reason: collision with root package name */
    public r f3705r;

    /* renamed from: r0, reason: collision with root package name */
    public androidx.core.view.c0 f3706r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3707s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f3708s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3709t;

    /* renamed from: t0, reason: collision with root package name */
    public final int[] f3710t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3711u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f3712u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3713v;

    /* renamed from: v0, reason: collision with root package name */
    public final List f3714v0;

    /* renamed from: w, reason: collision with root package name */
    public int f3715w;

    /* renamed from: w0, reason: collision with root package name */
    public Runnable f3716w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3717x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f3718x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3719y;

    /* renamed from: y0, reason: collision with root package name */
    public int f3720y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3721z;

    /* renamed from: z0, reason: collision with root package name */
    public int f3722z0;

    public static abstract class Adapter {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(@NonNull c0 c0Var, int i10) {
            boolean z10 = c0Var.mBindingAdapter == null;
            if (z10) {
                c0Var.mPosition = i10;
                if (hasStableIds()) {
                    c0Var.mItemId = getItemId(i10);
                }
                c0Var.setFlags(1, 519);
                if (n0.r.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(c0Var.mItemViewType)));
                }
            }
            c0Var.mBindingAdapter = this;
            if (RecyclerView.E0) {
                if (c0Var.itemView.getParent() == null && c0Var.itemView.isAttachedToWindow() != c0Var.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + c0Var.isTmpDetached() + ", attached to window: " + c0Var.itemView.isAttachedToWindow() + ", holder: " + c0Var);
                }
                if (c0Var.itemView.getParent() == null && c0Var.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + c0Var);
                }
            }
            onBindViewHolder(c0Var, i10, c0Var.getUnmodifiedPayloads());
            if (z10) {
                c0Var.clearPayload();
                ViewGroup.LayoutParams layoutParams = c0Var.itemView.getLayoutParams();
                if (layoutParams instanceof o) {
                    ((o) layoutParams).f3761c = true;
                }
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
        }

        @NonNull
        public final c0 createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            try {
                if (n0.r.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                c0 c0VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
                if (c0VarOnCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                c0VarOnCreateViewHolder.mItemViewType = i10;
                Trace.endSection();
                return c0VarOnCreateViewHolder;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter adapter, @NonNull c0 c0Var, int i10) {
            if (adapter == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(c0 c0Var, int i10);

        public void onBindViewHolder(@NonNull c0 c0Var, int i10, @NonNull List<Object> list) {
            onBindViewHolder(c0Var, i10);
        }

        public abstract c0 onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull c0 c0Var) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull c0 c0Var) {
        }

        public void onViewDetachedFromWindow(@NonNull c0 c0Var) {
        }

        public void onViewRecycled(@NonNull c0 c0Var) {
        }

        public void registerAdapterDataObserver(@NonNull i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(@NonNull i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i10, @Nullable Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    public static class EdgeEffectFactory {

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        public abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    public static abstract class ItemAnimator {

        /* renamed from: a, reason: collision with root package name */
        public a f3727a = null;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f3728b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public long f3729c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f3730d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f3731e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f3732f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface a {
            void a(c0 c0Var);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f3733a;

            /* renamed from: b, reason: collision with root package name */
            public int f3734b;

            /* renamed from: c, reason: collision with root package name */
            public int f3735c;

            /* renamed from: d, reason: collision with root package name */
            public int f3736d;

            public b a(c0 c0Var) {
                return b(c0Var, 0);
            }

            public b b(c0 c0Var, int i10) {
                View view = c0Var.itemView;
                this.f3733a = view.getLeft();
                this.f3734b = view.getTop();
                this.f3735c = view.getRight();
                this.f3736d = view.getBottom();
                return this;
            }
        }

        public static int e(c0 c0Var) {
            int i10 = c0Var.mFlags;
            int i11 = i10 & 14;
            if (c0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = c0Var.getOldPosition();
                int absoluteAdapterPosition = c0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | KEYRecord.Flags.FLAG4;
                }
            }
            return i11;
        }

        public abstract boolean a(c0 c0Var, b bVar, b bVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, b bVar, b bVar2);

        public abstract boolean c(c0 c0Var, b bVar, b bVar2);

        public abstract boolean d(c0 c0Var, b bVar, b bVar2);

        public abstract boolean f(c0 c0Var);

        public boolean g(c0 c0Var, List list) {
            return f(c0Var);
        }

        public final void h(c0 c0Var) {
            r(c0Var);
            a aVar = this.f3727a;
            if (aVar != null) {
                aVar.a(c0Var);
            }
        }

        public final void i() {
            if (this.f3728b.size() <= 0) {
                this.f3728b.clear();
            } else {
                androidx.appcompat.app.z.a(this.f3728b.get(0));
                throw null;
            }
        }

        public abstract void j(c0 c0Var);

        public abstract void k();

        public long l() {
            return this.f3729c;
        }

        public long m() {
            return this.f3732f;
        }

        public long n() {
            return this.f3731e;
        }

        public long o() {
            return this.f3730d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(c0 c0Var) {
        }

        public b s(y yVar, c0 c0Var) {
            return q().a(c0Var);
        }

        public b t(y yVar, c0 c0Var, int i10, List list) {
            return q().a(c0Var);
        }

        public abstract void u();

        public void v(a aVar) {
            this.f3727a = aVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f3713v || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f3707s) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f3719y) {
                recyclerView2.f3717x = true;
            } else {
                recyclerView2.B();
            }
        }
    }

    public static abstract class a0 {
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ItemAnimator itemAnimator = RecyclerView.this.N;
            if (itemAnimator != null) {
                itemAnimator.u();
            }
            RecyclerView.this.f3700o0 = false;
        }
    }

    public class b0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f3740a;

        /* renamed from: b, reason: collision with root package name */
        public int f3741b;

        /* renamed from: c, reason: collision with root package name */
        public OverScroller f3742c;

        /* renamed from: d, reason: collision with root package name */
        public Interpolator f3743d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3744e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3745f;

        public b0() {
            Interpolator interpolator = RecyclerView.M0;
            this.f3743d = interpolator;
            this.f3744e = false;
            this.f3745f = false;
            this.f3742c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3741b = 0;
            this.f3740a = 0;
            Interpolator interpolator = this.f3743d;
            Interpolator interpolator2 = RecyclerView.M0;
            if (interpolator != interpolator2) {
                this.f3743d = interpolator2;
                this.f3742c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3742c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.b0(RecyclerView.this, this);
        }

        public void d() {
            if (this.f3744e) {
                this.f3745f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.M0;
            }
            if (this.f3743d != interpolator) {
                this.f3743d = interpolator;
                this.f3742c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3741b = 0;
            this.f3740a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3742c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f3742c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3697n == null) {
                f();
                return;
            }
            this.f3745f = false;
            this.f3744e = true;
            recyclerView.B();
            OverScroller overScroller = this.f3742c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f3740a;
                int i13 = currY - this.f3741b;
                this.f3740a = currX;
                this.f3741b = currY;
                int iY = RecyclerView.this.y(i12);
                int iA = RecyclerView.this.A(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3712u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.M(iY, iA, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3712u0;
                    iY -= iArr2[0];
                    iA -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.x(iY, iA);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3695m != null) {
                    int[] iArr3 = recyclerView3.f3712u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.v1(iY, iA, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3712u0;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    iY -= i14;
                    iA -= i15;
                    x xVar = recyclerView4.f3697n.mSmoothScroller;
                    if (xVar != null && !xVar.isPendingInitialRun() && xVar.isRunning()) {
                        int iB = RecyclerView.this.f3688i0.b();
                        if (iB == 0) {
                            xVar.stop();
                        } else if (xVar.getTargetPosition() >= iB) {
                            xVar.setTargetPosition(iB - 1);
                            xVar.onAnimation(i14, i15);
                        } else {
                            xVar.onAnimation(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = iY;
                int i17 = iA;
                if (!RecyclerView.this.f3701p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3712u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.N(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3712u0;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.P(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                x xVar2 = RecyclerView.this.f3697n.mSmoothScroller;
                if ((xVar2 == null || !xVar2.isPendingInitialRun()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i20, currVelocity);
                    }
                    if (RecyclerView.K0) {
                        RecyclerView.this.f3686h0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f3684g0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    j.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            x xVar3 = RecyclerView.this.f3697n.mSmoothScroller;
            if (xVar3 != null && xVar3.isPendingInitialRun()) {
                xVar3.onAnimation(0, 0);
            }
            this.f3744e = false;
            if (this.f3745f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.L1(1);
            }
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static abstract class c0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f3747b = 0;

        @NonNull
        public final View itemView;
        Adapter mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        c0 mShadowedHolder = null;
        c0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        u mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public final void a() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                a();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.N(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.k0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int iK0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iK0 = this.mOwnerRecyclerView.k0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iK0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.N(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((o) this.itemView.getLayoutParams()).f3761c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.y1(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.y1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.E0 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.v(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.E0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        public void setScrapContainer(u uVar, boolean z10) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z10;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.O(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class d implements o.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.o.b
        public void a(c0 c0Var, ItemAnimator.b bVar, ItemAnimator.b bVar2) {
            RecyclerView.this.o(c0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.o.b
        public void b(c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3697n.removeAndRecycleView(c0Var.itemView, recyclerView.f3675c);
        }

        @Override // androidx.recyclerview.widget.o.b
        public void c(c0 c0Var, ItemAnimator.b bVar, ItemAnimator.b bVar2) {
            RecyclerView.this.f3675c.O(c0Var);
            RecyclerView.this.q(c0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.o.b
        public void d(c0 c0Var, ItemAnimator.b bVar, ItemAnimator.b bVar2) {
            c0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.E) {
                if (recyclerView.N.b(c0Var, c0Var, bVar, bVar2)) {
                    RecyclerView.this.Y0();
                }
            } else if (recyclerView.N.d(c0Var, bVar, bVar2)) {
                RecyclerView.this.Y0();
            }
        }
    }

    public class e implements androidx.core.view.o {
        public e() {
        }

        @Override // androidx.core.view.o
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f3697n.canScrollVertically()) {
                i11 = (int) f10;
                i10 = 0;
            } else if (RecyclerView.this.f3697n.canScrollHorizontally()) {
                i10 = (int) f10;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.M1();
            return RecyclerView.this.j0(i10, i11);
        }

        @Override // androidx.core.view.o
        public float b() {
            float f10;
            if (RecyclerView.this.f3697n.canScrollVertically()) {
                f10 = RecyclerView.this.f3678d0;
            } else {
                if (!RecyclerView.this.f3697n.canScrollHorizontally()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f3676c0;
            }
            return -f10;
        }

        @Override // androidx.core.view.o
        public void c() {
            RecyclerView.this.M1();
        }
    }

    public class f implements b.InterfaceC0038b {
        public f() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void addView(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.F(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void b(View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0 != null) {
                c0VarP0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public c0 d(View view) {
            return RecyclerView.p0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void e(int i10) {
            View viewA = a(i10);
            if (viewA != null) {
                c0 c0VarP0 = RecyclerView.p0(viewA);
                if (c0VarP0 != null) {
                    if (c0VarP0.isTmpDetached() && !c0VarP0.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + c0VarP0 + RecyclerView.this.W());
                    }
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "tmpDetach " + c0VarP0);
                    }
                    c0VarP0.addFlags(256);
                }
            } else if (RecyclerView.E0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.W());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void f() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.G(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void h(View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0 != null) {
                c0VarP0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void i(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.G(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0038b
        public void j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0 != null) {
                if (!c0VarP0.isTmpDetached() && !c0VarP0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + c0VarP0 + RecyclerView.this.W());
                }
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "reAttach " + c0VarP0);
                }
                c0VarP0.clearTmpDetachFlag();
            } else if (RecyclerView.E0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.W());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    public class g implements a.InterfaceC0037a {
        public g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void a(int i10, int i11) {
            RecyclerView.this.O0(i10, i11);
            RecyclerView.this.f3694l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void d(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, false);
            RecyclerView.this.f3694l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.O1(i10, i11, obj);
            RecyclerView.this.f3696m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public c0 f(int i10) {
            c0 c0VarG0 = RecyclerView.this.g0(i10, true);
            if (c0VarG0 == null) {
                return null;
            }
            if (!RecyclerView.this.f3681f.n(c0VarG0.itemView)) {
                return c0VarG0;
            }
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void g(int i10, int i11) {
            RecyclerView.this.N0(i10, i11);
            RecyclerView.this.f3694l0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0037a
        public void h(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3694l0 = true;
            recyclerView.f3688i0.f3789d += i11;
        }

        public void i(a.b bVar) {
            int i10 = bVar.f3874a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3697n.onItemsAdded(recyclerView, bVar.f3875b, bVar.f3877d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3697n.onItemsRemoved(recyclerView2, bVar.f3875b, bVar.f3877d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3697n.onItemsUpdated(recyclerView3, bVar.f3875b, bVar.f3877d, bVar.f3876c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3697n.onItemsMoved(recyclerView4, bVar.f3875b, bVar.f3877d, 1);
            }
        }
    }

    public static class h extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public static abstract class i {
        public abstract void onChanged();

        public void onItemRangeChanged(int i10, int i11) {
        }

        public void onItemRangeInserted(int i10, int i11) {
        }

        public void onItemRangeMoved(int i10, int i11, int i12) {
        }

        public void onItemRangeRemoved(int i10, int i11) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            onItemRangeChanged(i10, i11);
        }
    }

    public static final class j {
        @DoNotInline
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface k {
    }

    public class l implements ItemAnimator.a {
        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.a
        public void a(c0 c0Var) {
            c0Var.setIsRecyclable(true);
            if (c0Var.mShadowedHolder != null && c0Var.mShadowingHolder == null) {
                c0Var.mShadowedHolder = null;
            }
            c0Var.mShadowingHolder = null;
            if (c0Var.shouldBeKeptAsChild() || RecyclerView.this.j1(c0Var.itemView) || !c0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c0Var.itemView, false);
        }
    }

    public static abstract class m {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            getItemOffsets(rect, ((o) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull y yVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull y yVar) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class n {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.b mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        x mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class a implements ViewBoundsCheck.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public View a(int i10) {
                return n.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int b(View view) {
                return n.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int c() {
                return n.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int d() {
                return n.this.getWidth() - n.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int e(View view) {
                return n.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements ViewBoundsCheck.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public View a(int i10) {
                return n.this.getChildAt(i10);
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int b(View view) {
                return n.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int c() {
                return n.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int d() {
                return n.this.getHeight() - n.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.ViewBoundsCheck.b
            public int e(View view) {
                return n.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f3755a;

            /* renamed from: b, reason: collision with root package name */
            public int f3756b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f3757c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f3758d;
        }

        public n() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(aVar);
            this.mVerticalBoundCheck = new ViewBoundsCheck(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static d getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, i11);
            dVar.f3755a = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            dVar.f3756b = typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            dVar.f3757c = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            dVar.f3758d = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean i(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.s(str);
            }
        }

        public void attachView(@NonNull View view, int i10, o oVar) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0.isRemoved()) {
                this.mRecyclerView.f3683g.b(c0VarP0);
            } else {
                this.mRecyclerView.f3683g.p(c0VarP0);
            }
            this.mChildHelper.c(view, i10, oVar, c0VarP0.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.t0(view));
            }
        }

        public abstract boolean canScrollHorizontally();

        public abstract boolean canScrollVertically();

        public boolean checkLayoutParams(o oVar) {
            return oVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i10, int i11, y yVar, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i10, c cVar) {
        }

        public abstract int computeHorizontalScrollExtent(y yVar);

        public abstract int computeHorizontalScrollOffset(y yVar);

        public abstract int computeHorizontalScrollRange(y yVar);

        public abstract int computeVerticalScrollExtent(y yVar);

        public abstract int computeVerticalScrollOffset(y yVar);

        public abstract int computeVerticalScrollRange(y yVar);

        public void detachAndScrapAttachedViews(@NonNull u uVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                j(uVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull u uVar) {
            j(uVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i10, @NonNull u uVar) {
            j(uVar, i10, getChildAt(i10));
        }

        public void detachView(@NonNull View view) {
            int iM = this.mChildHelper.m(view);
            if (iM >= 0) {
                f(iM, view);
            }
        }

        public void detachViewAt(int i10) {
            f(i10, getChildAt(i10));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, u uVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, uVar);
        }

        public final void e(View view, int i10, boolean z10) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (z10 || c0VarP0.isRemoved()) {
                this.mRecyclerView.f3683g.b(c0VarP0);
            } else {
                this.mRecyclerView.f3683g.p(c0VarP0);
            }
            o oVar = (o) view.getLayoutParams();
            if (c0VarP0.wasReturnedFromScrap() || c0VarP0.isScrap()) {
                if (c0VarP0.isScrap()) {
                    c0VarP0.unScrap();
                } else {
                    c0VarP0.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM = this.mChildHelper.m(view);
                if (i10 == -1) {
                    i10 = this.mChildHelper.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.W());
                }
                if (iM != i10) {
                    this.mRecyclerView.f3697n.moveView(iM, i10);
                }
            } else {
                this.mChildHelper.a(view, i10, false);
                oVar.f3761c = true;
                x xVar = this.mSmoothScroller;
                if (xVar != null && xVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (oVar.f3762d) {
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + oVar.f3759a);
                }
                c0VarP0.itemView.invalidate();
                oVar.f3762d = false;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.N;
            if (itemAnimator != null) {
                itemAnimator.j(RecyclerView.p0(view));
            }
        }

        public final void f(int i10, View view) {
            this.mChildHelper.d(i10);
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewY;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewY = recyclerView.Y(view)) == null || this.mChildHelper.n(viewY)) {
                return null;
            }
            return viewY;
        }

        public View findViewByPosition(int i10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                c0 c0VarP0 = RecyclerView.p0(childAt);
                if (c0VarP0 != null && c0VarP0.getLayoutPosition() == i10 && !c0VarP0.shouldIgnore() && (this.mRecyclerView.f3688i0.e() || !c0VarP0.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public final int[] g(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - paddingLeft;
            int iMin = Math.min(0, i10);
            int i11 = top - paddingTop;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - width;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public abstract o generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((o) view.getLayoutParams()).f3760b.bottom;
        }

        @Nullable
        public View getChildAt(int i10) {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.f3685h;
        }

        public int getColumnCountForAccessibility(@NonNull u uVar, @NonNull y yVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f3695m == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.f3695m.getItemCount();
        }

        public int getDecoratedBottom(@NonNull View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.q0(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((o) view.getLayoutParams()).f3760b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((o) view.getLayoutParams()).f3760b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.p0(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return this.mRecyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((o) view.getLayoutParams()).f3760b.left;
        }

        @Px
        public int getMinimumHeight() {
            return ViewCompat.z(this.mRecyclerView);
        }

        @Px
        public int getMinimumWidth() {
            return ViewCompat.A(this.mRecyclerView);
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.C(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.D(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((o) view.getLayoutParams()).f3760b.right;
        }

        public int getRowCountForAccessibility(@NonNull u uVar, @NonNull y yVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.f3695m == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.f3695m.getItemCount();
        }

        public int getSelectionModeForAccessibility(@NonNull u uVar, @NonNull y yVar) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((o) view.getLayoutParams()).f3760b.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z10, @NonNull Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((o) view.getLayoutParams()).f3760b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.f3693l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public final boolean h(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.f3689j;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i10 < width && rect.right - i10 > paddingLeft && rect.top - i11 < height && rect.bottom - i11 > paddingTop;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.W());
            }
            c0 c0VarP0 = RecyclerView.p0(view);
            c0VarP0.addFlags(128);
            this.mRecyclerView.f3683g.q(c0VarP0);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public abstract boolean isAutoMeasureEnabled();

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull u uVar, @NonNull y yVar) {
            return false;
        }

        public boolean isLayoutReversed() {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            x xVar = this.mSmoothScroller;
            return xVar != null && xVar.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z10, boolean z11) {
            boolean z12 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public final void j(u uVar, int i10, View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0.shouldIgnore()) {
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "ignoring view " + c0VarP0);
                    return;
                }
                return;
            }
            if (c0VarP0.isInvalid() && !c0VarP0.isRemoved() && !this.mRecyclerView.f3695m.hasStableIds()) {
                removeViewAt(i10);
                uVar.H(c0VarP0);
            } else {
                detachViewAt(i10);
                uVar.I(view);
                this.mRecyclerView.f3683g.k(c0VarP0);
            }
        }

        public void layoutDecorated(@NonNull View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((o) view.getLayoutParams()).f3760b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i10, int i11, int i12, int i13) {
            o oVar = (o) view.getLayoutParams();
            Rect rect = oVar.f3760b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) oVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) oVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) oVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i10, int i11) {
            o oVar = (o) view.getLayoutParams();
            Rect rectT0 = this.mRecyclerView.t0(view);
            int i12 = i10 + rectT0.left + rectT0.right;
            int i13 = i11 + rectT0.top + rectT0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i12, ((ViewGroup.MarginLayoutParams) oVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i13, ((ViewGroup.MarginLayoutParams) oVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, oVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i10, int i11) {
            o oVar = (o) view.getLayoutParams();
            Rect rectT0 = this.mRecyclerView.t0(view);
            int i12 = i10 + rectT0.left + rectT0.right;
            int i13 = i11 + rectT0.top + rectT0.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) oVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) oVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, oVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i10, int i11) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                detachViewAt(i10);
                attachView(childAt, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@Px int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.L0(i10);
            }
        }

        public void offsetChildrenVertical(@Px int i10) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.M0(i10);
            }
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public abstract View onFocusSearchFailed(View view, int i10, u uVar, y yVar);

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f3675c, recyclerView.f3688i0, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(s0.x xVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f3675c, recyclerView.f3688i0, xVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, s0.x xVar) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0 == null || c0VarP0.isRemoved() || this.mChildHelper.n(c0VarP0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f3675c, recyclerView.f3688i0, view, xVar);
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i10) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public abstract void onLayoutChildren(u uVar, y yVar);

        public void onLayoutCompleted(y yVar) {
        }

        public void onMeasure(@NonNull u uVar, @NonNull y yVar, int i10, int i11) {
            this.mRecyclerView.D(i10, i11);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.F0();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i10) {
        }

        public void onSmoothScrollerStopped(x xVar) {
            if (this.mSmoothScroller == xVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f3675c, recyclerView.f3688i0, i10, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull u uVar, @NonNull y yVar, @NonNull View view, int i10, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                ViewCompat.b0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull u uVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.p0(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, uVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(u uVar) {
            int iJ = uVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = uVar.n(i10);
                c0 c0VarP0 = RecyclerView.p0(viewN);
                if (!c0VarP0.shouldIgnore()) {
                    c0VarP0.setIsRecyclable(false);
                    if (c0VarP0.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewN, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.N;
                    if (itemAnimator != null) {
                        itemAnimator.j(c0VarP0);
                    }
                    c0VarP0.setIsRecyclable(true);
                    uVar.D(viewN);
                }
            }
            uVar.e();
            if (iJ > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull u uVar) {
            removeView(view);
            uVar.G(view);
        }

        public void removeAndRecycleViewAt(int i10, @NonNull u uVar) {
            View childAt = getChildAt(i10);
            removeViewAt(i10);
            uVar.G(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i10) {
            if (getChildAt(i10) != null) {
                this.mChildHelper.q(i10);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public abstract int scrollHorizontallyBy(int i10, u uVar, y yVar);

        public abstract void scrollToPosition(int i10);

        public abstract int scrollVerticallyBy(int i10, u uVar, y yVar);

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f3675c.P();
                }
            }
        }

        public void setMeasureSpecs(int i10, int i11) {
            this.mWidth = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.J0) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.J0) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i10, int i11) {
            setMeasuredDimension(chooseSize(i10, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i11, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i10, int i11) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.D(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                Rect rect = this.mRecyclerView.f3689j;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.mRecyclerView.f3689j.set(i15, i13, i12, i14);
            setMeasuredDimension(this.mRecyclerView.f3689j, i10, i11);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f3681f;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i10, int i11, o oVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && i(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) oVar).width) && i(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) oVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i10, int i11, o oVar) {
            return (this.mMeasurementCacheEnabled && i(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) oVar).width) && i(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) oVar).height)) ? false : true;
        }

        public abstract void smoothScrollToPosition(RecyclerView recyclerView, y yVar, int i10);

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(x xVar) {
            x xVar2 = this.mSmoothScroller;
            if (xVar2 != null && xVar != xVar2 && xVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = xVar;
            xVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            c0VarP0.stopIgnoring();
            c0VarP0.resetInternal();
            c0VarP0.addFlags(4);
        }

        public void stopSmoothScroller() {
            x xVar = this.mSmoothScroller;
            if (xVar != null) {
                xVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i10) {
            e(view, i10, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i10) {
            e(view, i10, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, u uVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull u uVar, @NonNull y yVar, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            Adapter adapter = this.mRecyclerView.f3695m;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(u uVar, y yVar, s0.x xVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                xVar.a(8192);
                xVar.H0(true);
                xVar.w0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                xVar.a(4096);
                xVar.H0(true);
                xVar.w0(true);
            }
            xVar.o0(x.e.b(getRowCountForAccessibility(uVar, yVar), getColumnCountForAccessibility(uVar, yVar), isLayoutHierarchical(uVar, yVar), getSelectionModeForAccessibility(uVar, yVar)));
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i10, int i11, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i10, i11);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull y yVar, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[PHI: r11
  0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.u r11, @androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.y r12, int r13, @androidx.annotation.Nullable android.os.Bundle r14) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i10, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f3675c, recyclerView.f3688i0, view, i10, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            int[] iArrG = g(view, rect);
            int i10 = iArrG[0];
            int i11 = iArrG[1];
            if ((z11 && !h(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.B1(i10, i11);
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull u uVar, @NonNull y yVar, @NonNull View view, @NonNull s0.x xVar) {
            xVar.p0(x.f.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(@NonNull View view, int i10) {
            attachView(view, i10, (o) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public o generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public void setMeasuredDimension(int i10, int i11) {
            this.mRecyclerView.setMeasuredDimension(i10, i11);
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    public interface p {
        void a(View view);

        void b(View view);
    }

    public static abstract class q {
        public abstract boolean onFling(int i10, int i11);
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class s {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class t {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray f3763a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public int f3764b = 0;

        /* renamed from: c, reason: collision with root package name */
        public Set f3765c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f3766a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            public int f3767b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f3768c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f3769d = 0;
        }

        public void a() {
            this.f3764b++;
        }

        public void b(Adapter adapter) {
            this.f3765c.add(adapter);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f3763a.size(); i10++) {
                a aVar = (a) this.f3763a.valueAt(i10);
                ArrayList arrayList = aVar.f3766a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    x0.a.a(((c0) obj).itemView);
                }
                aVar.f3766a.clear();
            }
        }

        public void d() {
            this.f3764b--;
        }

        public void e(Adapter adapter, boolean z10) {
            this.f3765c.remove(adapter);
            if (this.f3765c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f3763a.size(); i10++) {
                SparseArray sparseArray = this.f3763a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f3766a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    x0.a.a(((c0) arrayList.get(i11)).itemView);
                }
            }
        }

        public void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f3769d = l(aVarI.f3769d, j10);
        }

        public void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f3768c = l(aVarI.f3768c, j10);
        }

        public c0 h(int i10) {
            a aVar = (a) this.f3763a.get(i10);
            if (aVar == null || aVar.f3766a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f3766a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((c0) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (c0) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a i(int i10) {
            a aVar = (a) this.f3763a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3763a.put(i10, aVar2);
            return aVar2;
        }

        public void j(Adapter adapter, Adapter adapter2, boolean z10) {
            if (adapter != null) {
                d();
            }
            if (!z10 && this.f3764b == 0) {
                c();
            }
            if (adapter2 != null) {
                a();
            }
        }

        public void k(c0 c0Var) {
            int itemViewType = c0Var.getItemViewType();
            ArrayList arrayList = i(itemViewType).f3766a;
            if (((a) this.f3763a.get(itemViewType)).f3767b <= arrayList.size()) {
                x0.a.a(c0Var.itemView);
            } else {
                if (RecyclerView.E0 && arrayList.contains(c0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                c0Var.resetInternal();
                arrayList.add(c0Var);
            }
        }

        public long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f3769d;
            return j12 == 0 || j10 + j12 < j11;
        }

        public boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f3768c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3770a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f3771b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f3772c;

        /* renamed from: d, reason: collision with root package name */
        public final List f3773d;

        /* renamed from: e, reason: collision with root package name */
        public int f3774e;

        /* renamed from: f, reason: collision with root package name */
        public int f3775f;

        /* renamed from: g, reason: collision with root package name */
        public t f3776g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f3770a = arrayList;
            this.f3771b = null;
            this.f3772c = new ArrayList();
            this.f3773d = Collections.unmodifiableList(arrayList);
            this.f3774e = 2;
            this.f3775f = 2;
        }

        public void A() {
            for (int i10 = 0; i10 < this.f3772c.size(); i10++) {
                x0.a.a(((c0) this.f3772c.get(i10)).itemView);
            }
            B(RecyclerView.this.f3695m);
        }

        public final void B(Adapter adapter) {
            C(adapter, false);
        }

        public final void C(Adapter adapter, boolean z10) {
            t tVar = this.f3776g;
            if (tVar != null) {
                tVar.e(adapter, z10);
            }
        }

        public void D(View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            c0VarP0.mScrapContainer = null;
            c0VarP0.mInChangeScrap = false;
            c0VarP0.clearReturnedFromScrapFlag();
            H(c0VarP0);
        }

        public void E() {
            for (int size = this.f3772c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f3772c.clear();
            if (RecyclerView.K0) {
                RecyclerView.this.f3686h0.b();
            }
        }

        public void F(int i10) {
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            c0 c0Var = (c0) this.f3772c.get(i10);
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + c0Var);
            }
            a(c0Var, true);
            this.f3772c.remove(i10);
        }

        public void G(View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (c0VarP0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (c0VarP0.isScrap()) {
                c0VarP0.unScrap();
            } else if (c0VarP0.wasReturnedFromScrap()) {
                c0VarP0.clearReturnedFromScrapFlag();
            }
            H(c0VarP0);
            if (RecyclerView.this.N == null || c0VarP0.isRecyclable()) {
                return;
            }
            RecyclerView.this.N.j(c0VarP0);
        }

        public void H(c0 c0Var) {
            boolean z10;
            boolean z11 = true;
            if (c0Var.isScrap() || c0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.isScrap());
                sb.append(" isAttached:");
                sb.append(c0Var.itemView.getParent() != null);
                sb.append(RecyclerView.this.W());
                throw new IllegalArgumentException(sb.toString());
            }
            if (c0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.W());
            }
            if (c0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.W());
            }
            boolean zDoesTransientStatePreventRecycling = c0Var.doesTransientStatePreventRecycling();
            Adapter adapter = RecyclerView.this.f3695m;
            boolean z12 = adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(c0Var);
            if (RecyclerView.E0 && this.f3772c.contains(c0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + c0Var + RecyclerView.this.W());
            }
            if (z12 || c0Var.isRecyclable()) {
                if (this.f3775f <= 0 || c0Var.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f3772c.size();
                    if (size >= this.f3775f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.K0 && size > 0 && !RecyclerView.this.f3686h0.d(c0Var.mPosition)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f3686h0.d(((c0) this.f3772c.get(i10)).mPosition)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f3772c.add(size, c0Var);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(c0Var, true);
                }
                z = z10;
            } else {
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.W());
                }
                z11 = false;
            }
            RecyclerView.this.f3683g.q(c0Var);
            if (z || z11 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            x0.a.a(c0Var.itemView);
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = null;
        }

        public void I(View view) {
            c0 c0VarP0 = RecyclerView.p0(view);
            if (!c0VarP0.hasAnyOfTheFlags(12) && c0VarP0.isUpdated() && !RecyclerView.this.t(c0VarP0)) {
                if (this.f3771b == null) {
                    this.f3771b = new ArrayList();
                }
                c0VarP0.setScrapContainer(this, true);
                this.f3771b.add(c0VarP0);
                return;
            }
            if (!c0VarP0.isInvalid() || c0VarP0.isRemoved() || RecyclerView.this.f3695m.hasStableIds()) {
                c0VarP0.setScrapContainer(this, false);
                this.f3770a.add(c0VarP0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.W());
            }
        }

        public void J(t tVar) {
            B(RecyclerView.this.f3695m);
            t tVar2 = this.f3776g;
            if (tVar2 != null) {
                tVar2.d();
            }
            this.f3776g = tVar;
            if (tVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3776g.a();
            }
            u();
        }

        public void K(a0 a0Var) {
        }

        public void L(int i10) {
            this.f3774e = i10;
            P();
        }

        public final boolean M(c0 c0Var, int i10, int i11, long j10) {
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = c0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f3776g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (c0Var.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(c0Var.itemView, recyclerView.getChildCount(), c0Var.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f3695m.bindViewHolder(c0Var, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(c0Var.itemView);
            }
            this.f3776g.f(c0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c0Var);
            if (RecyclerView.this.f3688i0.e()) {
                c0Var.mPreLayoutPosition = i11;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.c0 N(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 604
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        public void O(c0 c0Var) {
            if (c0Var.mInChangeScrap) {
                this.f3771b.remove(c0Var);
            } else {
                this.f3770a.remove(c0Var);
            }
            c0Var.mScrapContainer = null;
            c0Var.mInChangeScrap = false;
            c0Var.clearReturnedFromScrapFlag();
        }

        public void P() {
            n nVar = RecyclerView.this.f3697n;
            this.f3775f = this.f3774e + (nVar != null ? nVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f3772c.size() - 1; size >= 0 && this.f3772c.size() > this.f3775f; size--) {
                F(size);
            }
        }

        public boolean Q(c0 c0Var) {
            if (c0Var.isRemoved()) {
                if (!RecyclerView.E0 || RecyclerView.this.f3688i0.e()) {
                    return RecyclerView.this.f3688i0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.W());
            }
            int i10 = c0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f3695m.getItemCount()) {
                if (RecyclerView.this.f3688i0.e() || RecyclerView.this.f3695m.getItemViewType(c0Var.mPosition) == c0Var.getItemViewType()) {
                    return !RecyclerView.this.f3695m.hasStableIds() || c0Var.getItemId() == RecyclerView.this.f3695m.getItemId(c0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.W());
        }

        public void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3772c.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.f3772c.get(size);
                if (c0Var != null && (i12 = c0Var.mPosition) >= i10 && i12 < i13) {
                    c0Var.addFlags(2);
                    F(size);
                }
            }
        }

        public void a(c0 c0Var, boolean z10) {
            RecyclerView.v(c0Var);
            View view = c0Var.itemView;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f3702p0;
            if (kVar != null) {
                androidx.core.view.a aVarN = kVar.n();
                ViewCompat.j0(view, aVarN instanceof k.a ? ((k.a) aVarN).n(view) : null);
            }
            if (z10) {
                g(c0Var);
            }
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = null;
            i().k(c0Var);
        }

        public final void b(c0 c0Var) {
            if (RecyclerView.this.E0()) {
                View view = c0Var.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f3702p0;
                if (kVar == null) {
                    return;
                }
                androidx.core.view.a aVarN = kVar.n();
                if (aVarN instanceof k.a) {
                    ((k.a) aVarN).o(view);
                }
                ViewCompat.j0(view, aVarN);
            }
        }

        public void c() {
            this.f3770a.clear();
            E();
        }

        public void d() {
            int size = this.f3772c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) this.f3772c.get(i10)).clearOldPosition();
            }
            int size2 = this.f3770a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((c0) this.f3770a.get(i11)).clearOldPosition();
            }
            ArrayList arrayList = this.f3771b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((c0) this.f3771b.get(i12)).clearOldPosition();
                }
            }
        }

        public void e() {
            this.f3770a.clear();
            ArrayList arrayList = this.f3771b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f3688i0.b()) {
                return !RecyclerView.this.f3688i0.e() ? i10 : RecyclerView.this.f3679e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f3688i0.b() + RecyclerView.this.W());
        }

        public void g(c0 c0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f3699o.size() > 0) {
                androidx.appcompat.app.z.a(RecyclerView.this.f3699o.get(0));
                throw null;
            }
            Adapter adapter = RecyclerView.this.f3695m;
            if (adapter != null) {
                adapter.onViewRecycled(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3688i0 != null) {
                recyclerView.f3683g.q(c0Var);
            }
            if (RecyclerView.F0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + c0Var);
            }
        }

        public c0 h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f3771b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    c0 c0Var = (c0) this.f3771b.get(i11);
                    if (!c0Var.wasReturnedFromScrap() && c0Var.getLayoutPosition() == i10) {
                        c0Var.addFlags(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.f3695m.hasStableIds() && (iM = RecyclerView.this.f3679e.m(i10)) > 0 && iM < RecyclerView.this.f3695m.getItemCount()) {
                    long itemId = RecyclerView.this.f3695m.getItemId(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        c0 c0Var2 = (c0) this.f3771b.get(i12);
                        if (!c0Var2.wasReturnedFromScrap() && c0Var2.getItemId() == itemId) {
                            c0Var2.addFlags(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public t i() {
            if (this.f3776g == null) {
                this.f3776g = new t();
                u();
            }
            return this.f3776g;
        }

        public int j() {
            return this.f3770a.size();
        }

        public List k() {
            return this.f3773d;
        }

        public c0 l(long j10, int i10, boolean z10) {
            for (int size = this.f3770a.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.f3770a.get(size);
                if (c0Var.getItemId() == j10 && !c0Var.wasReturnedFromScrap()) {
                    if (i10 == c0Var.getItemViewType()) {
                        c0Var.addFlags(32);
                        if (c0Var.isRemoved() && !RecyclerView.this.f3688i0.e()) {
                            c0Var.setFlags(2, 14);
                        }
                        return c0Var;
                    }
                    if (!z10) {
                        this.f3770a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.itemView, false);
                        D(c0Var.itemView);
                    }
                }
            }
            int size2 = this.f3772c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                c0 c0Var2 = (c0) this.f3772c.get(size2);
                if (c0Var2.getItemId() == j10 && !c0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == c0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f3772c.remove(size2);
                        }
                        return c0Var2;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        public c0 m(int i10, boolean z10) {
            View viewE;
            int size = this.f3770a.size();
            for (int i11 = 0; i11 < size; i11++) {
                c0 c0Var = (c0) this.f3770a.get(i11);
                if (!c0Var.wasReturnedFromScrap() && c0Var.getLayoutPosition() == i10 && !c0Var.isInvalid() && (RecyclerView.this.f3688i0.f3793h || !c0Var.isRemoved())) {
                    c0Var.addFlags(32);
                    return c0Var;
                }
            }
            if (!z10 && (viewE = RecyclerView.this.f3681f.e(i10)) != null) {
                c0 c0VarP0 = RecyclerView.p0(viewE);
                RecyclerView.this.f3681f.s(viewE);
                int iM = RecyclerView.this.f3681f.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.f3681f.d(iM);
                    I(viewE);
                    c0VarP0.addFlags(8224);
                    return c0VarP0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + c0VarP0 + RecyclerView.this.W());
            }
            int size2 = this.f3772c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                c0 c0Var2 = (c0) this.f3772c.get(i12);
                if (!c0Var2.isInvalid() && c0Var2.getLayoutPosition() == i10 && !c0Var2.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f3772c.remove(i12);
                    }
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + c0Var2);
                    }
                    return c0Var2;
                }
            }
            return null;
        }

        public View n(int i10) {
            return ((c0) this.f3770a.get(i10)).itemView;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        public View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).itemView;
        }

        public final void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(c0 c0Var) {
            View view = c0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f3772c.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) ((c0) this.f3772c.get(i10)).itemView.getLayoutParams();
                if (oVar != null) {
                    oVar.f3761c = true;
                }
            }
        }

        public void t() {
            int size = this.f3772c.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = (c0) this.f3772c.get(i10);
                if (c0Var != null) {
                    c0Var.addFlags(6);
                    c0Var.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.f3695m;
            if (adapter == null || !adapter.hasStableIds()) {
                E();
            }
        }

        public final void u() {
            if (this.f3776g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3695m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f3776g.b(RecyclerView.this.f3695m);
            }
        }

        public void v(int i10, int i11) {
            int size = this.f3772c.size();
            for (int i12 = 0; i12 < size; i12++) {
                c0 c0Var = (c0) this.f3772c.get(i12);
                if (c0Var != null && c0Var.mPosition >= i10) {
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + c0Var + " now at position " + (c0Var.mPosition + i11));
                    }
                    c0Var.offsetPosition(i11, false);
                }
            }
        }

        public void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f3772c.size();
            for (int i16 = 0; i16 < size; i16++) {
                c0 c0Var = (c0) this.f3772c.get(i16);
                if (c0Var != null && (i15 = c0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        c0Var.offsetPosition(i11 - i10, false);
                    } else {
                        c0Var.offsetPosition(i12, false);
                    }
                    if (RecyclerView.F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + c0Var);
                    }
                }
            }
        }

        public void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3772c.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.f3772c.get(size);
                if (c0Var != null) {
                    int i13 = c0Var.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.F0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + c0Var + " now at position " + (c0Var.mPosition - i11));
                        }
                        c0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        c0Var.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        public void y(Adapter adapter, Adapter adapter2, boolean z10) {
            c();
            C(adapter, true);
            i().j(adapter, adapter2, z10);
            u();
        }

        public void z() {
            u();
        }
    }

    public interface v {
    }

    public class w extends i {
        public w() {
        }

        public void a() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3709t && recyclerView.f3707s) {
                ViewCompat.b0(recyclerView, recyclerView.f3687i);
            } else {
                recyclerView.B = true;
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            RecyclerView.this.s(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3688i0.f3792g = true;
            recyclerView.b1(true);
            if (RecyclerView.this.f3679e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11, Object obj) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f3679e.r(i10, i11, obj)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i10, int i11) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f3679e.s(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i10, int i11, int i12) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f3679e.t(i10, i11, i12)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i10, int i11) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f3679e.u(i10, i11)) {
                a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3677d == null || (adapter = recyclerView.f3695m) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    public static abstract class x {
        private n mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f3779a;

            /* renamed from: b, reason: collision with root package name */
            public int f3780b;

            /* renamed from: c, reason: collision with root package name */
            public int f3781c;

            /* renamed from: d, reason: collision with root package name */
            public int f3782d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f3783e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f3784f;

            /* renamed from: g, reason: collision with root package name */
            public int f3785g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.f3782d >= 0;
            }

            public void b(int i10) {
                this.f3782d = i10;
            }

            public void c(RecyclerView recyclerView) {
                int i10 = this.f3782d;
                if (i10 >= 0) {
                    this.f3782d = -1;
                    recyclerView.H0(i10);
                    this.f3784f = false;
                } else {
                    if (!this.f3784f) {
                        this.f3785g = 0;
                        return;
                    }
                    e();
                    recyclerView.f3682f0.e(this.f3779a, this.f3780b, this.f3781c, this.f3783e);
                    int i11 = this.f3785g + 1;
                    this.f3785g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3784f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3779a = i10;
                this.f3780b = i11;
                this.f3781c = i12;
                this.f3783e = interpolator;
                this.f3784f = true;
            }

            public final void e() {
                if (this.f3783e != null && this.f3781c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3781c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f3782d = -1;
                this.f3784f = false;
                this.f3785g = 0;
                this.f3779a = i10;
                this.f3780b = i11;
                this.f3781c = i12;
                this.f3783e = interpolator;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i10);
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i10) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i10) {
            return this.mRecyclerView.f3697n.findViewByPosition(i10);
        }

        public int getChildCount() {
            return this.mRecyclerView.f3697n.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.n0(view);
        }

        @Nullable
        public n getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i10) {
            this.mRecyclerView.w1(i10);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i10, int i11) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = pointFComputeScrollVectorForPosition.x;
                if (f10 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.v1((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.f3688i0, this.mRecyclingAction);
                    this.mRecyclingAction.c(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i10, i11, recyclerView.f3688i0, this.mRecyclingAction);
                boolean zA = this.mRecyclingAction.a();
                this.mRecyclingAction.c(recyclerView);
                if (zA && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f3682f0.d();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.F0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        public abstract void onSeekTargetStep(int i10, int i11, y yVar, a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, y yVar, a aVar);

        public void setTargetPosition(int i10) {
            this.mTargetPosition = i10;
        }

        public void start(RecyclerView recyclerView, n nVar) {
            recyclerView.f3682f0.f();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = nVar;
            int i10 = this.mTargetPosition;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f3688i0.f3786a = i10;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.f3682f0.d();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.f3688i0.f3786a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    public static class y {

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f3787b;

        /* renamed from: m, reason: collision with root package name */
        public int f3798m;

        /* renamed from: n, reason: collision with root package name */
        public long f3799n;

        /* renamed from: o, reason: collision with root package name */
        public int f3800o;

        /* renamed from: p, reason: collision with root package name */
        public int f3801p;

        /* renamed from: q, reason: collision with root package name */
        public int f3802q;

        /* renamed from: a, reason: collision with root package name */
        public int f3786a = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f3788c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f3789d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f3790e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f3791f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f3792g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f3793h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f3794i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3795j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3796k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f3797l = false;

        public void a(int i10) {
            if ((this.f3790e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f3790e));
        }

        public int b() {
            return this.f3793h ? this.f3788c - this.f3789d : this.f3791f;
        }

        public int c() {
            return this.f3786a;
        }

        public boolean d() {
            return this.f3786a != -1;
        }

        public boolean e() {
            return this.f3793h;
        }

        public void f(Adapter adapter) {
            this.f3790e = 1;
            this.f3791f = adapter.getItemCount();
            this.f3793h = false;
            this.f3794i = false;
            this.f3795j = false;
        }

        public boolean g() {
            return this.f3797l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3786a + ", mData=" + this.f3787b + ", mItemCount=" + this.f3791f + ", mIsMeasuring=" + this.f3795j + ", mPreviousLayoutItemCount=" + this.f3788c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3789d + ", mStructureChanged=" + this.f3792g + ", mInPreLayout=" + this.f3793h + ", mRunSimpleAnimations=" + this.f3796k + ", mRunPredictiveAnimations=" + this.f3797l + '}';
        }
    }

    public static class z extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        public EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    static {
        Class cls = Integer.TYPE;
        L0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        M0 = new c();
        N0 = new z();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private boolean J1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.d.d(this.J, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.L, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.K, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.d.d(this.M, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewC0 = c0(viewGroup.getChildAt(i10));
            if (recyclerViewC0 != null) {
                return recyclerViewC0;
            }
        }
        return null;
    }

    private androidx.core.view.c0 getScrollingChildHelper() {
        if (this.f3706r0 == null) {
            this.f3706r0 = new androidx.core.view.c0(this);
        }
        return this.f3706r0;
    }

    private int h1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.K;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.M.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.M, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.M) == 0.0f) {
                        this.M.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.K.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.K, -height, width);
                if (androidx.core.widget.d.b(this.K) == 0.0f) {
                    this.K.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public static c0 p0(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f3759a;
    }

    public static void q0(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f3760b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        E0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        F0 = z10;
    }

    private float u0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f3671a * 0.015f));
        float f10 = H0;
        return (float) (this.f3671a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * dLog));
    }

    public static void v(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            c0Var.mNestedRecyclerView = null;
        }
    }

    public int A(int i10) {
        return z(i10, this.K, this.M, getHeight());
    }

    public final void A0() {
        this.f3681f = new androidx.recyclerview.widget.b(new f());
    }

    public boolean A1(AccessibilityEvent accessibilityEvent) {
        if (!F0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AccessibilityEventCompat.a(accessibilityEvent) : 0;
        this.A |= iA != 0 ? iA : 0;
        return true;
    }

    public void B() {
        if (!this.f3713v || this.E) {
            Trace.beginSection("RV FullInvalidate");
            I();
            Trace.endSection();
            return;
        }
        if (this.f3679e.p()) {
            if (!this.f3679e.o(4) || this.f3679e.o(11)) {
                if (this.f3679e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    I();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            G1();
            S0();
            this.f3679e.w();
            if (!this.f3717x) {
                if (x0()) {
                    I();
                } else {
                    this.f3679e.i();
                }
            }
            K1(true);
            T0();
            Trace.endSection();
        }
    }

    public void B0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + W());
        }
    }

    public void B1(int i10, int i11) {
        C1(i10, i11, null);
    }

    public final void C(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strS0 = s0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strS0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(n.class);
                try {
                    constructor = clsAsSubclass.getConstructor(L0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strS0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((n) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strS0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strS0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strS0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e16);
            }
        }
    }

    public void C0() {
        this.M = null;
        this.K = null;
        this.L = null;
        this.J = null;
    }

    public void C1(int i10, int i11, Interpolator interpolator) {
        D1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void D(int i10, int i11) {
        setMeasuredDimension(n.chooseSize(i10, getPaddingLeft() + getPaddingRight(), ViewCompat.A(this)), n.chooseSize(i11, getPaddingTop() + getPaddingBottom(), ViewCompat.z(this)));
    }

    public void D0() {
        if (this.f3701p.size() == 0) {
            return;
        }
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        I0();
        requestLayout();
    }

    public void D1(int i10, int i11, Interpolator interpolator, int i12) {
        E1(i10, i11, interpolator, i12, false);
    }

    public final boolean E(int i10, int i11) {
        b0(this.f3704q0);
        int[] iArr = this.f3704q0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    public boolean E0() {
        AccessibilityManager accessibilityManager = this.C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void E1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        n nVar = this.f3697n;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3719y) {
            return;
        }
        if (!nVar.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.f3697n.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            H1(i13, 1);
        }
        this.f3682f0.e(i10, i11, i12, interpolator);
    }

    public void F(View view) {
        c0 c0VarP0 = p0(view);
        Q0(view);
        Adapter adapter = this.f3695m;
        if (adapter != null && c0VarP0 != null) {
            adapter.onViewAttachedToWindow(c0VarP0);
        }
        List list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((p) this.D.get(size)).b(view);
            }
        }
    }

    public boolean F0() {
        return this.G > 0;
    }

    public void F1(int i10) {
        if (this.f3719y) {
            return;
        }
        n nVar = this.f3697n;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nVar.smoothScrollToPosition(this, this.f3688i0, i10);
        }
    }

    public void G(View view) {
        c0 c0VarP0 = p0(view);
        R0(view);
        Adapter adapter = this.f3695m;
        if (adapter != null && c0VarP0 != null) {
            adapter.onViewDetachedFromWindow(c0VarP0);
        }
        List list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((p) this.D.get(size)).a(view);
            }
        }
    }

    public final boolean G0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f3689j.set(0, 0, view.getWidth(), view.getHeight());
        this.f3691k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3689j);
        offsetDescendantRectToMyCoords(view2, this.f3691k);
        char c10 = 65535;
        int i12 = this.f3697n.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.f3689j;
        int i13 = rect.left;
        Rect rect2 = this.f3691k;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + W());
    }

    public void G1() {
        int i10 = this.f3715w + 1;
        this.f3715w = i10;
        if (i10 != 1 || this.f3719y) {
            return;
        }
        this.f3717x = false;
    }

    public final void H() {
        int i10 = this.A;
        this.A = 0;
        if (i10 == 0 || !E0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(KEYRecord.Flags.FLAG4);
        AccessibilityEventCompat.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public void H0(int i10) {
        if (this.f3697n == null) {
            return;
        }
        setScrollState(2);
        this.f3697n.scrollToPosition(i10);
        awakenScrollBars();
    }

    public boolean H1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    public void I() {
        if (this.f3695m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f3697n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f3688i0.f3795j = false;
        boolean z10 = this.f3718x0 && !(this.f3720y0 == getWidth() && this.f3722z0 == getHeight());
        this.f3720y0 = 0;
        this.f3722z0 = 0;
        this.f3718x0 = false;
        if (this.f3688i0.f3790e == 1) {
            J();
            this.f3697n.setExactMeasureSpecsFrom(this);
            K();
        } else if (this.f3679e.q() || z10 || this.f3697n.getWidth() != getWidth() || this.f3697n.getHeight() != getHeight()) {
            this.f3697n.setExactMeasureSpecsFrom(this);
            K();
        } else {
            this.f3697n.setExactMeasureSpecsFrom(this);
        }
        L();
    }

    public void I0() {
        int iJ = this.f3681f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((o) this.f3681f.i(i10).getLayoutParams()).f3761c = true;
        }
        this.f3675c.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I1(int i10) {
        boolean zCanScrollHorizontally = this.f3697n.canScrollHorizontally();
        int i11 = zCanScrollHorizontally;
        if (this.f3697n.canScrollVertically()) {
            i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        H1(i11, i10);
    }

    public final void J() {
        this.f3688i0.a(1);
        X(this.f3688i0);
        this.f3688i0.f3795j = false;
        G1();
        this.f3683g.f();
        S0();
        a1();
        s1();
        y yVar = this.f3688i0;
        yVar.f3794i = yVar.f3796k && this.f3696m0;
        this.f3696m0 = false;
        this.f3694l0 = false;
        yVar.f3793h = yVar.f3797l;
        yVar.f3791f = this.f3695m.getItemCount();
        b0(this.f3704q0);
        if (this.f3688i0.f3796k) {
            int iG = this.f3681f.g();
            for (int i10 = 0; i10 < iG; i10++) {
                c0 c0VarP0 = p0(this.f3681f.f(i10));
                if (!c0VarP0.shouldIgnore() && (!c0VarP0.isInvalid() || this.f3695m.hasStableIds())) {
                    this.f3683g.e(c0VarP0, this.N.t(this.f3688i0, c0VarP0, ItemAnimator.e(c0VarP0), c0VarP0.getUnmodifiedPayloads()));
                    if (this.f3688i0.f3794i && c0VarP0.isUpdated() && !c0VarP0.isRemoved() && !c0VarP0.shouldIgnore() && !c0VarP0.isInvalid()) {
                        this.f3683g.c(l0(c0VarP0), c0VarP0);
                    }
                }
            }
        }
        if (this.f3688i0.f3797l) {
            t1();
            y yVar2 = this.f3688i0;
            boolean z10 = yVar2.f3792g;
            yVar2.f3792g = false;
            this.f3697n.onLayoutChildren(this.f3675c, yVar2);
            this.f3688i0.f3792g = z10;
            for (int i11 = 0; i11 < this.f3681f.g(); i11++) {
                c0 c0VarP02 = p0(this.f3681f.f(i11));
                if (!c0VarP02.shouldIgnore() && !this.f3683g.i(c0VarP02)) {
                    int iE = ItemAnimator.e(c0VarP02);
                    boolean zHasAnyOfTheFlags = c0VarP02.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= 4096;
                    }
                    ItemAnimator.b bVarT = this.N.t(this.f3688i0, c0VarP02, iE, c0VarP02.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        d1(c0VarP02, bVarT);
                    } else {
                        this.f3683g.a(c0VarP02, bVarT);
                    }
                }
            }
            w();
        } else {
            w();
        }
        T0();
        K1(false);
        this.f3688i0.f3790e = 2;
    }

    public void J0() {
        int iJ = this.f3681f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            c0 c0VarP0 = p0(this.f3681f.i(i10));
            if (c0VarP0 != null && !c0VarP0.shouldIgnore()) {
                c0VarP0.addFlags(6);
            }
        }
        I0();
        this.f3675c.t();
    }

    public final void K() {
        G1();
        S0();
        this.f3688i0.a(6);
        this.f3679e.j();
        this.f3688i0.f3791f = this.f3695m.getItemCount();
        this.f3688i0.f3789d = 0;
        if (this.f3677d != null && this.f3695m.canRestoreState()) {
            Parcelable parcelable = this.f3677d.f3737c;
            if (parcelable != null) {
                this.f3697n.onRestoreInstanceState(parcelable);
            }
            this.f3677d = null;
        }
        y yVar = this.f3688i0;
        yVar.f3793h = false;
        this.f3697n.onLayoutChildren(this.f3675c, yVar);
        y yVar2 = this.f3688i0;
        yVar2.f3792g = false;
        yVar2.f3796k = yVar2.f3796k && this.N != null;
        yVar2.f3790e = 4;
        T0();
        K1(false);
    }

    public final void K0(int i10, int i11, MotionEvent motionEvent, int i12) {
        n nVar = this.f3697n;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3719y) {
            return;
        }
        int[] iArr = this.f3712u0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = nVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f3697n.canScrollVertically();
        int i13 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iG1 = i10 - g1(i10, height);
        int iH1 = i11 - h1(i11, width);
        H1(i13, i12);
        if (M(zCanScrollHorizontally ? iG1 : 0, zCanScrollVertically ? iH1 : 0, this.f3712u0, this.f3708s0, i12)) {
            int[] iArr2 = this.f3712u0;
            iG1 -= iArr2[0];
            iH1 -= iArr2[1];
        }
        u1(zCanScrollHorizontally ? iG1 : 0, zCanScrollVertically ? iH1 : 0, motionEvent, i12);
        androidx.recyclerview.widget.e eVar = this.f3684g0;
        if (eVar != null && (iG1 != 0 || iH1 != 0)) {
            eVar.f(this, iG1, iH1);
        }
        L1(i12);
    }

    public void K1(boolean z10) {
        if (this.f3715w < 1) {
            if (E0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + W());
            }
            this.f3715w = 1;
        }
        if (!z10 && !this.f3719y) {
            this.f3717x = false;
        }
        if (this.f3715w == 1) {
            if (z10 && this.f3717x && !this.f3719y && this.f3697n != null && this.f3695m != null) {
                I();
            }
            if (!this.f3719y) {
                this.f3717x = false;
            }
        }
        this.f3715w--;
    }

    public final void L() {
        RecyclerView recyclerView;
        this.f3688i0.a(4);
        G1();
        S0();
        y yVar = this.f3688i0;
        yVar.f3790e = 1;
        if (yVar.f3796k) {
            for (int iG = this.f3681f.g() - 1; iG >= 0; iG--) {
                c0 c0VarP0 = p0(this.f3681f.f(iG));
                if (!c0VarP0.shouldIgnore()) {
                    long jL0 = l0(c0VarP0);
                    ItemAnimator.b bVarS = this.N.s(this.f3688i0, c0VarP0);
                    c0 c0VarG = this.f3683g.g(jL0);
                    if (c0VarG == null || c0VarG.shouldIgnore()) {
                        this.f3683g.d(c0VarP0, bVarS);
                    } else {
                        boolean zH = this.f3683g.h(c0VarG);
                        boolean zH2 = this.f3683g.h(c0VarP0);
                        if (zH && c0VarG == c0VarP0) {
                            this.f3683g.d(c0VarP0, bVarS);
                        } else {
                            ItemAnimator.b bVarN = this.f3683g.n(c0VarG);
                            this.f3683g.d(c0VarP0, bVarS);
                            ItemAnimator.b bVarM = this.f3683g.m(c0VarP0);
                            if (bVarN == null) {
                                v0(jL0, c0VarP0, c0VarG);
                            } else {
                                p(c0VarG, c0VarP0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f3683g.o(recyclerView.B0);
        } else {
            recyclerView = this;
        }
        recyclerView.f3697n.removeAndRecycleScrapInt(recyclerView.f3675c);
        y yVar2 = recyclerView.f3688i0;
        yVar2.f3788c = yVar2.f3791f;
        recyclerView.E = false;
        recyclerView.F = false;
        yVar2.f3796k = false;
        yVar2.f3797l = false;
        recyclerView.f3697n.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recyclerView.f3675c.f3771b;
        if (arrayList != null) {
            arrayList.clear();
        }
        n nVar = recyclerView.f3697n;
        if (nVar.mPrefetchMaxObservedInInitialPrefetch) {
            nVar.mPrefetchMaxCountObserved = 0;
            nVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.f3675c.P();
        }
        recyclerView.f3697n.onLayoutCompleted(recyclerView.f3688i0);
        T0();
        K1(false);
        recyclerView.f3683g.f();
        int[] iArr = recyclerView.f3704q0;
        if (E(iArr[0], iArr[1])) {
            P(0, 0);
        }
        e1();
        q1();
    }

    public void L0(int i10) {
        int iG = this.f3681f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f3681f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void L1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public boolean M(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void M0(int i10) {
        int iG = this.f3681f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f3681f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public void M1() {
        setScrollState(0);
        N1();
    }

    public final void N(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void N0(int i10, int i11) {
        int iJ = this.f3681f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            c0 c0VarP0 = p0(this.f3681f.i(i12));
            if (c0VarP0 != null && !c0VarP0.shouldIgnore() && c0VarP0.mPosition >= i10) {
                if (F0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + c0VarP0 + " now at position " + (c0VarP0.mPosition + i11));
                }
                c0VarP0.offsetPosition(i11, false);
                this.f3688i0.f3792g = true;
            }
        }
        this.f3675c.v(i10, i11);
        requestLayout();
    }

    public final void N1() {
        this.f3682f0.f();
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.stopSmoothScroller();
        }
    }

    public void O(int i10) {
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.onScrollStateChanged(i10);
        }
        W0(i10);
        s sVar = this.f3690j0;
        if (sVar != null) {
            sVar.onScrollStateChanged(this, i10);
        }
        List list = this.f3692k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f3692k0.get(size)).onScrollStateChanged(this, i10);
            }
        }
    }

    public void O0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f3681f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            c0 c0VarP0 = p0(this.f3681f.i(i16));
            if (c0VarP0 != null && (i15 = c0VarP0.mPosition) >= i13 && i15 <= i12) {
                if (F0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + c0VarP0);
                }
                if (c0VarP0.mPosition == i10) {
                    c0VarP0.offsetPosition(i11 - i10, false);
                } else {
                    c0VarP0.offsetPosition(i14, false);
                }
                this.f3688i0.f3792g = true;
            }
        }
        this.f3675c.w(i10, i11);
        requestLayout();
    }

    public void O1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f3681f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f3681f.i(i14);
            c0 c0VarP0 = p0(viewI);
            if (c0VarP0 != null && !c0VarP0.shouldIgnore() && (i12 = c0VarP0.mPosition) >= i10 && i12 < i13) {
                c0VarP0.addFlags(2);
                c0VarP0.addChangePayload(obj);
                ((o) viewI.getLayoutParams()).f3761c = true;
            }
        }
        this.f3675c.R(i10, i11);
    }

    public void P(int i10, int i11) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        X0(i10, i11);
        s sVar = this.f3690j0;
        if (sVar != null) {
            sVar.onScrolled(this, i10, i11);
        }
        List list = this.f3692k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f3692k0.get(size)).onScrolled(this, i10, i11);
            }
        }
        this.H--;
    }

    public void P0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f3681f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            c0 c0VarP0 = p0(this.f3681f.i(i13));
            if (c0VarP0 != null && !c0VarP0.shouldIgnore()) {
                int i14 = c0VarP0.mPosition;
                if (i14 >= i12) {
                    if (F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + c0VarP0 + " now at position " + (c0VarP0.mPosition - i11));
                    }
                    c0VarP0.offsetPosition(-i11, z10);
                    this.f3688i0.f3792g = true;
                } else if (i14 >= i10) {
                    if (F0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + c0VarP0 + " now REMOVED");
                    }
                    c0VarP0.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.f3688i0.f3792g = true;
                }
            }
        }
        this.f3675c.x(i10, i11, z10);
        requestLayout();
    }

    public void Q() {
        int i10;
        for (int size = this.f3714v0.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) this.f3714v0.get(size);
            if (c0Var.itemView.getParent() == this && !c0Var.shouldIgnore() && (i10 = c0Var.mPendingAccessibilityState) != -1) {
                c0Var.itemView.setImportantForAccessibility(i10);
                c0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f3714v0.clear();
    }

    public void Q0(View view) {
    }

    public final boolean R(MotionEvent motionEvent) {
        r rVar = this.f3705r;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        rVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f3705r = null;
        }
        return true;
    }

    public void R0(View view) {
    }

    public void S() {
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 3);
        this.M = edgeEffectA;
        if (this.f3685h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void S0() {
        this.G++;
    }

    public void T() {
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 0);
        this.J = edgeEffectA;
        if (this.f3685h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void T0() {
        U0(true);
    }

    public void U() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 2);
        this.L = edgeEffectA;
        if (this.f3685h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void U0(boolean z10) {
        int i10 = this.G - 1;
        this.G = i10;
        if (i10 < 1) {
            if (E0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + W());
            }
            this.G = 0;
            if (z10) {
                H();
                Q();
            }
        }
    }

    public void V() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.I.a(this, 1);
        this.K = edgeEffectA;
        if (this.f3685h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void V0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.P = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.T = x10;
            this.R = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.U = y10;
            this.S = y10;
        }
    }

    public String W() {
        return " " + super.toString() + ", adapter:" + this.f3695m + ", layout:" + this.f3697n + ", context:" + getContext();
    }

    public void W0(int i10) {
    }

    public final void X(y yVar) {
        if (getScrollState() != 2) {
            yVar.f3801p = 0;
            yVar.f3802q = 0;
        } else {
            OverScroller overScroller = this.f3682f0.f3742c;
            yVar.f3801p = overScroller.getFinalX() - overScroller.getCurrX();
            yVar.f3802q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void X0(int i10, int i11) {
    }

    public View Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void Y0() {
        if (this.f3700o0 || !this.f3707s) {
            return;
        }
        ViewCompat.b0(this, this.f3716w0);
        this.f3700o0 = true;
    }

    public c0 Z(View view) {
        View viewY = Y(view);
        if (viewY == null) {
            return null;
        }
        return o0(viewY);
    }

    public final boolean Z0() {
        return this.N != null && this.f3697n.supportsPredictiveItemAnimations();
    }

    public final boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3703q.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = (r) this.f3703q.get(i10);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.f3705r = rVar;
                return true;
            }
        }
        return false;
    }

    public final void a1() {
        boolean z10;
        if (this.E) {
            this.f3679e.y();
            if (this.F) {
                this.f3697n.onItemsChanged(this);
            }
        }
        if (Z0()) {
            this.f3679e.w();
        } else {
            this.f3679e.j();
        }
        boolean z11 = this.f3694l0 || this.f3696m0;
        this.f3688i0.f3796k = this.f3713v && this.N != null && ((z10 = this.E) || z11 || this.f3697n.mRequestedSimpleAnimations) && (!z10 || this.f3695m.hasStableIds());
        y yVar = this.f3688i0;
        yVar.f3797l = yVar.f3796k && z11 && !this.E && Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        n nVar = this.f3697n;
        if (nVar == null || !nVar.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            T();
            if (this.J.isFinished()) {
                this.J.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            V();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            S();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public final void b0(int[] iArr) {
        int iG = this.f3681f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            c0 c0VarP0 = p0(this.f3681f.f(i12));
            if (!c0VarP0.shouldIgnore()) {
                int layoutPosition = c0VarP0.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void b1(boolean z10) {
        this.F = z10 | this.F;
        this.E = true;
        J0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.T()
            android.widget.EdgeEffect r1 = r6.J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.d.d(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.U()
            android.widget.EdgeEffect r1 = r6.L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.V()
            android.widget.EdgeEffect r9 = r6.K
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.d.d(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.S()
            android.widget.EdgeEffect r9 = r6.M
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.d.d(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c1(float, float, float, float):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.f3697n.checkLayoutParams((o) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        n nVar = this.f3697n;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.f3697n.computeHorizontalScrollExtent(this.f3688i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        n nVar = this.f3697n;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.f3697n.computeHorizontalScrollOffset(this.f3688i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        n nVar = this.f3697n;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.f3697n.computeHorizontalScrollRange(this.f3688i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        n nVar = this.f3697n;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.f3697n.computeVerticalScrollExtent(this.f3688i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        n nVar = this.f3697n;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.f3697n.computeVerticalScrollOffset(this.f3688i0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        n nVar = this.f3697n;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.f3697n.computeVerticalScrollRange(this.f3688i0);
        }
        return 0;
    }

    public final View d0() {
        c0 c0VarE0;
        y yVar = this.f3688i0;
        int i10 = yVar.f3798m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = yVar.b();
        for (int i11 = i10; i11 < iB; i11++) {
            c0 c0VarE02 = e0(i11);
            if (c0VarE02 == null) {
                break;
            }
            if (c0VarE02.itemView.hasFocusable()) {
                return c0VarE02.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (c0VarE0 = e0(iMin)) == null) {
                return null;
            }
        } while (!c0VarE0.itemView.hasFocusable());
        return c0VarE0.itemView;
    }

    public void d1(c0 c0Var, ItemAnimator.b bVar) {
        c0Var.setFlags(0, 8192);
        if (this.f3688i0.f3794i && c0Var.isUpdated() && !c0Var.isRemoved() && !c0Var.shouldIgnore()) {
            this.f3683g.c(l0(c0Var), c0Var);
        }
        this.f3683g.e(c0Var, bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        n layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    D1(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    D1(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                if (keyCode == 122) {
                    if (zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed) {
                    itemCount = getAdapter().getItemCount();
                }
                F1(itemCount);
                return true;
            }
        } else if (layoutManager.canScrollHorizontally()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    D1(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    D1(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                if (keyCode2 == 122) {
                    if (zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zIsLayoutReversed2) {
                    itemCount = getAdapter().getItemCount();
                }
                F1(itemCount);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f3701p.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f3701p.get(i10)).onDrawOver(canvas, this, this.f3688i0);
        }
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f3685h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.J;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f3685h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.K;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3685h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.L;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3685h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.N == null || this.f3701p.size() <= 0 || !this.N.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public c0 e0(int i10) {
        c0 c0Var = null;
        if (this.E) {
            return null;
        }
        int iJ = this.f3681f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            c0 c0VarP0 = p0(this.f3681f.i(i11));
            if (c0VarP0 != null && !c0VarP0.isRemoved() && k0(c0VarP0) == i10) {
                if (!this.f3681f.n(c0VarP0.itemView)) {
                    return c0VarP0;
                }
                c0Var = c0VarP0;
            }
        }
        return c0Var;
    }

    public final void e1() {
        View viewFindViewById;
        if (!this.f3680e0 || this.f3695m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f3681f.n(getFocusedChild())) {
                return;
            }
        }
        View viewD0 = null;
        c0 c0VarF0 = (this.f3688i0.f3799n == -1 || !this.f3695m.hasStableIds()) ? null : f0(this.f3688i0.f3799n);
        if (c0VarF0 != null && !this.f3681f.n(c0VarF0.itemView) && c0VarF0.itemView.hasFocusable()) {
            viewD0 = c0VarF0.itemView;
        } else if (this.f3681f.g() > 0) {
            viewD0 = d0();
        }
        if (viewD0 != null) {
            int i10 = this.f3688i0.f3800o;
            if (i10 != -1 && (viewFindViewById = viewD0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewD0 = viewFindViewById;
            }
            viewD0.requestFocus();
        }
    }

    public c0 f0(long j10) {
        Adapter adapter = this.f3695m;
        c0 c0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int iJ = this.f3681f.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                c0 c0VarP0 = p0(this.f3681f.i(i10));
                if (c0VarP0 != null && !c0VarP0.isRemoved() && c0VarP0.getItemId() == j10) {
                    if (!this.f3681f.n(c0VarP0.itemView)) {
                        return c0VarP0;
                    }
                    c0Var = c0VarP0;
                }
            }
        }
        return c0Var;
    }

    public final void f1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.J.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.c0 g0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3681f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f3681f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = p0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f3681f
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    public final int g1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.J;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.L.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.L, width, height);
                    if (androidx.core.widget.d.b(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.J.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.J, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.f3697n;
        if (nVar != null) {
            return nVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.f3697n;
        if (nVar != null) {
            return nVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.f3695m;
    }

    @Override // android.view.View
    public int getBaseline() {
        n nVar = this.f3697n;
        return nVar != null ? nVar.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3685h;
    }

    @Nullable
    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f3702p0;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.I;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.N;
    }

    public int getItemDecorationCount() {
        return this.f3701p.size();
    }

    @Nullable
    public n getLayoutManager() {
        return this.f3697n;
    }

    public int getMaxFlingVelocity() {
        return this.f3674b0;
    }

    public int getMinFlingVelocity() {
        return this.f3672a0;
    }

    public long getNanoTime() {
        if (K0) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public q getOnFlingListener() {
        return this.W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3680e0;
    }

    @NonNull
    public t getRecycledViewPool() {
        return this.f3675c.i();
    }

    public int getScrollState() {
        return this.O;
    }

    public boolean h0(int i10, int i11) {
        return i0(i10, i11, this.f3672a0, this.f3674b0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public final void i(c0 c0Var) {
        View view = c0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.f3675c.O(o0(view));
        if (c0Var.isTmpDetached()) {
            this.f3681f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f3681f.k(view);
        } else {
            this.f3681f.b(view, true);
        }
    }

    public final boolean i0(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        n nVar = this.f3697n;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f3719y) {
            return false;
        }
        boolean zCanScrollHorizontally = nVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f3697n.canScrollVertically();
        if (!zCanScrollHorizontally || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.J;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.L;
                if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                    if (z1(this.L, i10, getWidth())) {
                        this.L.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i15 = -i10;
                if (z1(this.J, i15, getWidth())) {
                    this.J.onAbsorb(i15);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i14 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.K;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.M;
                if (edgeEffect4 != null && androidx.core.widget.d.b(edgeEffect4) != 0.0f) {
                    if (z1(this.M, i11, getHeight())) {
                        this.M.onAbsorb(i11);
                        i11 = 0;
                    }
                    i14 = 0;
                }
                i14 = i11;
                i11 = 0;
            } else {
                int i16 = -i11;
                if (z1(this.K, i16, getHeight())) {
                    this.K.onAbsorb(i16);
                    i11 = 0;
                }
                i14 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            I1(1);
            this.f3682f0.b(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zCanScrollHorizontally || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z10);
            q qVar = this.W;
            if (qVar != null && qVar.onFling(i10, i14)) {
                return true;
            }
            if (z10) {
                I1(1);
                int i18 = -i13;
                this.f3682f0.b(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    public void i1() {
        ItemAnimator itemAnimator = this.N;
        if (itemAnimator != null) {
            itemAnimator.k();
        }
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.removeAndRecycleAllViews(this.f3675c);
            this.f3697n.removeAndRecycleScrapInt(this.f3675c);
        }
        this.f3675c.c();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f3707s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3719y;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(m mVar) {
        k(mVar, -1);
    }

    public boolean j0(int i10, int i11) {
        return i0(i10, i11, 0, Integer.MAX_VALUE);
    }

    public boolean j1(View view) {
        G1();
        boolean zR = this.f3681f.r(view);
        if (zR) {
            c0 c0VarP0 = p0(view);
            this.f3675c.O(c0VarP0);
            this.f3675c.H(c0VarP0);
            if (F0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        K1(!zR);
        return zR;
    }

    public void k(m mVar, int i10) {
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3701p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f3701p.add(mVar);
        } else {
            this.f3701p.add(i10, mVar);
        }
        I0();
        requestLayout();
    }

    public int k0(c0 c0Var) {
        if (c0Var.hasAnyOfTheFlags(524) || !c0Var.isBound()) {
            return -1;
        }
        return this.f3679e.e(c0Var.mPosition);
    }

    public void k1(m mVar) {
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3701p.remove(mVar);
        if (this.f3701p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        I0();
        requestLayout();
    }

    public void l(p pVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(pVar);
    }

    public long l0(c0 c0Var) {
        return this.f3695m.hasStableIds() ? c0Var.getItemId() : c0Var.mPosition;
    }

    public void l1(p pVar) {
        List list = this.D;
        if (list == null) {
            return;
        }
        list.remove(pVar);
    }

    public void m(r rVar) {
        this.f3703q.add(rVar);
    }

    public int m0(View view) {
        c0 c0VarP0 = p0(view);
        if (c0VarP0 != null) {
            return c0VarP0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public void m1(r rVar) {
        this.f3703q.remove(rVar);
        if (this.f3705r == rVar) {
            this.f3705r = null;
        }
    }

    public void n(s sVar) {
        if (this.f3692k0 == null) {
            this.f3692k0 = new ArrayList();
        }
        this.f3692k0.add(sVar);
    }

    public int n0(View view) {
        c0 c0VarP0 = p0(view);
        if (c0VarP0 != null) {
            return c0VarP0.getLayoutPosition();
        }
        return -1;
    }

    public void n1(s sVar) {
        List list = this.f3692k0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void o(c0 c0Var, ItemAnimator.b bVar, ItemAnimator.b bVar2) {
        c0Var.setIsRecyclable(false);
        if (this.N.a(c0Var, bVar, bVar2)) {
            Y0();
        }
    }

    public c0 o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return p0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void o1() {
        c0 c0Var;
        int iG = this.f3681f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f3681f.f(i10);
            c0 c0VarO0 = o0(viewF);
            if (c0VarO0 != null && (c0Var = c0VarO0.mShadowingHolder) != null) {
                View view = c0Var.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.G = r0
            r1 = 1
            r5.f3707s = r1
            boolean r2 = r5.f3713v
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f3713v = r1
            androidx.recyclerview.widget.RecyclerView$u r1 = r5.f3675c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$n r1 = r5.f3697n
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.f3700o0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.K0
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f3967e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f3684g0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f3684g0 = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.s(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.e r2 = r5.f3684g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3971c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.e r0 = r5.f3684g0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.N;
        if (itemAnimator != null) {
            itemAnimator.k();
        }
        M1();
        this.f3707s = false;
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.dispatchDetachedFromWindow(this, this.f3675c);
        }
        this.f3714v0.clear();
        removeCallbacks(this.f3716w0);
        this.f3683g.j();
        this.f3675c.A();
        x0.a.b(this);
        if (!K0 || (eVar = this.f3684g0) == null) {
            return;
        }
        eVar.j(this);
        this.f3684g0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3701p.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) this.f3701p.get(i10)).onDraw(canvas, this, this.f3688i0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        float axisValue;
        RecyclerView recyclerView;
        if (this.f3697n != null && !this.f3719y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f10 = this.f3697n.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                z10 = false;
                axisValue = this.f3697n.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f10;
                i10 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i10 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.f3697n.canScrollVertically()) {
                    float f11 = -axisValue;
                    axisValue = 0.0f;
                    f = f11;
                } else if (!this.f3697n.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                z10 = this.A0;
            } else {
                i10 = 0;
                z10 = false;
                axisValue = 0.0f;
            }
            int i11 = (int) (f * this.f3678d0);
            int i12 = (int) (axisValue * this.f3676c0);
            if (z10) {
                OverScroller overScroller = this.f3682f0.f3742c;
                recyclerView = this;
                recyclerView.E1(i12 + (overScroller.getFinalX() - overScroller.getCurrX()), i11 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                K0(i12, i11, motionEvent, 1);
            }
            if (i10 != 0 && !z10) {
                recyclerView.D0.g(motionEvent, i10);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f3719y) {
            return false;
        }
        this.f3705r = null;
        if (a0(motionEvent)) {
            u();
            return true;
        }
        n nVar = this.f3697n;
        if (nVar == null) {
            return false;
        }
        boolean zCanScrollHorizontally = nVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f3697n.canScrollVertically();
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3721z) {
                this.f3721z = false;
            }
            this.P = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.T = x10;
            this.R = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.U = y10;
            this.S = y10;
            if (J1(motionEvent) || this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                L1(1);
            }
            int[] iArr = this.f3710t0;
            iArr[1] = 0;
            iArr[0] = 0;
            I1(0);
        } else if (actionMasked == 1) {
            this.Q.clear();
            L1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i10 = x11 - this.R;
                int i11 = y11 - this.S;
                if (!zCanScrollHorizontally || Math.abs(i10) <= this.V) {
                    z10 = false;
                } else {
                    this.T = x11;
                    z10 = true;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.V) {
                    this.U = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            u();
        } else if (actionMasked == 5) {
            this.P = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.T = x12;
            this.R = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.U = y12;
            this.S = y12;
        } else if (actionMasked == 6) {
            V0(motionEvent);
        }
        return this.O == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        I();
        Trace.endSection();
        this.f3713v = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        n nVar = this.f3697n;
        if (nVar == null) {
            D(i10, i11);
            return;
        }
        boolean z10 = false;
        if (nVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3697n.onMeasure(this.f3675c, this.f3688i0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f3718x0 = z10;
            if (z10 || this.f3695m == null) {
                return;
            }
            if (this.f3688i0.f3790e == 1) {
                J();
            }
            this.f3697n.setMeasureSpecs(i10, i11);
            this.f3688i0.f3795j = true;
            K();
            this.f3697n.setMeasuredDimensionFromChildren(i10, i11);
            if (this.f3697n.shouldMeasureTwice()) {
                this.f3697n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f3688i0.f3795j = true;
                K();
                this.f3697n.setMeasuredDimensionFromChildren(i10, i11);
            }
            this.f3720y0 = getMeasuredWidth();
            this.f3722z0 = getMeasuredHeight();
            return;
        }
        if (this.f3709t) {
            this.f3697n.onMeasure(this.f3675c, this.f3688i0, i10, i11);
            return;
        }
        if (this.B) {
            G1();
            S0();
            a1();
            T0();
            y yVar = this.f3688i0;
            if (yVar.f3797l) {
                yVar.f3793h = true;
            } else {
                this.f3679e.j();
                this.f3688i0.f3793h = false;
            }
            this.B = false;
            K1(false);
        } else if (this.f3688i0.f3797l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.f3695m;
        if (adapter != null) {
            this.f3688i0.f3791f = adapter.getItemCount();
        } else {
            this.f3688i0.f3791f = 0;
        }
        G1();
        this.f3697n.onMeasure(this.f3675c, this.f3688i0, i10, i11);
        K1(false);
        this.f3688i0.f3793h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (F0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3677d = savedState;
        super.onRestoreInstanceState(savedState.c());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f3677d;
        if (savedState2 != null) {
            savedState.e(savedState2);
            return savedState;
        }
        n nVar = this.f3697n;
        if (nVar != null) {
            savedState.f3737c = nVar.onSaveInstanceState();
            return savedState;
        }
        savedState.f3737c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        C0();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r1
  0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(c0 c0Var, c0 c0Var2, ItemAnimator.b bVar, ItemAnimator.b bVar2, boolean z10, boolean z11) {
        c0Var.setIsRecyclable(false);
        if (z10) {
            i(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z11) {
                i(c0Var2);
            }
            c0Var.mShadowedHolder = c0Var2;
            i(c0Var);
            this.f3675c.O(c0Var);
            c0Var2.setIsRecyclable(false);
            c0Var2.mShadowingHolder = c0Var;
        }
        if (this.N.b(c0Var, c0Var2, bVar, bVar2)) {
            Y0();
        }
    }

    public final void p1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3689j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f3761c) {
                Rect rect = oVar.f3760b;
                Rect rect2 = this.f3689j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3689j);
            offsetRectIntoDescendantCoords(view, this.f3689j);
        }
        this.f3697n.requestChildRectangleOnScreen(this, view, this.f3689j, !this.f3713v, view2 == null);
    }

    public void q(c0 c0Var, ItemAnimator.b bVar, ItemAnimator.b bVar2) {
        i(c0Var);
        c0Var.setIsRecyclable(false);
        if (this.N.c(c0Var, bVar, bVar2)) {
            Y0();
        }
    }

    public final void q1() {
        y yVar = this.f3688i0;
        yVar.f3799n = -1L;
        yVar.f3798m = -1;
        yVar.f3800o = -1;
    }

    public void r(String str) {
        if (F0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + W());
        }
        throw new IllegalStateException(str + W());
    }

    public final int r0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void r1() {
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        L1(0);
        f1();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        c0 c0VarP0 = p0(view);
        if (c0VarP0 != null) {
            if (c0VarP0.isTmpDetached()) {
                c0VarP0.clearTmpDetachFlag();
            } else if (!c0VarP0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c0VarP0 + W());
            }
        } else if (E0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + W());
        }
        view.clearAnimation();
        G(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3697n.onRequestChildFocus(this, this.f3688i0, view, view2) && view2 != null) {
            p1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f3697n.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f3703q.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) this.f3703q.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3715w != 0 || this.f3719y) {
            this.f3717x = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(String str) {
        if (F0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + W());
        }
        if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + W()));
        }
    }

    public final String s0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public final void s1() {
        View focusedChild = (this.f3680e0 && hasFocus() && this.f3695m != null) ? getFocusedChild() : null;
        c0 c0VarZ = focusedChild != null ? Z(focusedChild) : null;
        if (c0VarZ == null) {
            q1();
            return;
        }
        this.f3688i0.f3799n = this.f3695m.hasStableIds() ? c0VarZ.getItemId() : -1L;
        this.f3688i0.f3798m = this.E ? -1 : c0VarZ.isRemoved() ? c0VarZ.mOldPosition : c0VarZ.getAbsoluteAdapterPosition();
        this.f3688i0.f3800o = r0(c0VarZ.itemView);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        n nVar = this.f3697n;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3719y) {
            return;
        }
        boolean zCanScrollHorizontally = nVar.canScrollHorizontally();
        boolean zCanScrollVertically = this.f3697n.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i10 = 0;
            }
            if (!zCanScrollVertically) {
                i11 = 0;
            }
            u1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable androidx.recyclerview.widget.k kVar) {
        this.f3702p0 = kVar;
        ViewCompat.j0(this, kVar);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        x1(adapter, false, true);
        b1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f3685h) {
            C0();
        }
        this.f3685h = z10;
        super.setClipToPadding(z10);
        if (this.f3713v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        r0.i.g(edgeEffectFactory);
        this.I = edgeEffectFactory;
        C0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f3709t = z10;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.N;
        if (itemAnimator2 != null) {
            itemAnimator2.k();
            this.N.v(null);
        }
        this.N = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.v(this.f3698n0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f3675c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(@Nullable n nVar) {
        if (nVar == this.f3697n) {
            return;
        }
        M1();
        if (this.f3697n != null) {
            ItemAnimator itemAnimator = this.N;
            if (itemAnimator != null) {
                itemAnimator.k();
            }
            this.f3697n.removeAndRecycleAllViews(this.f3675c);
            this.f3697n.removeAndRecycleScrapInt(this.f3675c);
            this.f3675c.c();
            if (this.f3707s) {
                this.f3697n.dispatchDetachedFromWindow(this, this.f3675c);
            }
            this.f3697n.setRecyclerView(null);
            this.f3697n = null;
        } else {
            this.f3675c.c();
        }
        this.f3681f.o();
        this.f3697n = nVar;
        if (nVar != null) {
            if (nVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.mRecyclerView.W());
            }
            nVar.setRecyclerView(this);
            if (this.f3707s) {
                this.f3697n.dispatchAttachedToWindow(this);
            }
        }
        this.f3675c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(@Nullable q qVar) {
        this.W = qVar;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable s sVar) {
        this.f3690j0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f3680e0 = z10;
    }

    public void setRecycledViewPool(@Nullable t tVar) {
        this.f3675c.J(tVar);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable v vVar) {
    }

    public void setScrollState(int i10) {
        if (i10 == this.O) {
            return;
        }
        if (F0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.O, new Exception());
        }
        this.O = i10;
        if (i10 != 2) {
            N1();
        }
        O(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable a0 a0Var) {
        this.f3675c.K(a0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f3719y) {
            s("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f3719y = true;
                this.f3721z = true;
                M1();
                return;
            }
            this.f3719y = false;
            if (this.f3717x && this.f3697n != null && this.f3695m != null) {
                requestLayout();
            }
            this.f3717x = false;
        }
    }

    public boolean t(c0 c0Var) {
        ItemAnimator itemAnimator = this.N;
        return itemAnimator == null || itemAnimator.g(c0Var, c0Var.getUnmodifiedPayloads());
    }

    public Rect t0(View view) {
        o oVar = (o) view.getLayoutParams();
        if (!oVar.f3761c) {
            return oVar.f3760b;
        }
        if (this.f3688i0.e() && (oVar.b() || oVar.d())) {
            return oVar.f3760b;
        }
        Rect rect = oVar.f3760b;
        rect.set(0, 0, 0, 0);
        int size = this.f3701p.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3689j.set(0, 0, 0, 0);
            ((m) this.f3701p.get(i10)).getItemOffsets(this.f3689j, view, this, this.f3688i0);
            int i11 = rect.left;
            Rect rect2 = this.f3689j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oVar.f3761c = false;
        return rect;
    }

    public void t1() {
        int iJ = this.f3681f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            c0 c0VarP0 = p0(this.f3681f.i(i10));
            if (E0 && c0VarP0.mPosition == -1 && !c0VarP0.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + W());
            }
            if (!c0VarP0.shouldIgnore()) {
                c0VarP0.saveOldPosition();
            }
        }
    }

    public final void u() {
        r1();
        setScrollState(0);
    }

    public boolean u1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        B();
        if (this.f3695m != null) {
            int[] iArr = this.f3712u0;
            iArr[0] = 0;
            iArr[1] = 0;
            v1(i10, i11, iArr);
            int[] iArr2 = this.f3712u0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f3701p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3712u0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        N(i13, i14, i15, i16, this.f3708s0, i12, iArr3);
        int[] iArr4 = this.f3712u0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.T;
        int[] iArr5 = this.f3708s0;
        int i24 = iArr5[0];
        this.T = i23 - i24;
        int i25 = this.U;
        int i26 = iArr5[1];
        this.U = i25 - i26;
        int[] iArr6 = this.f3710t0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.a0.a(motionEvent, 8194)) {
                c1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && androidx.core.view.a0.a(motionEvent, 4194304)) {
                    f1();
                }
            }
            x(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            P(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    public final void v0(long j10, c0 c0Var, c0 c0Var2) {
        int iG = this.f3681f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            c0 c0VarP0 = p0(this.f3681f.f(i10));
            if (c0VarP0 != c0Var && l0(c0VarP0) == j10) {
                Adapter adapter = this.f3695m;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + c0VarP0 + " \n View Holder 2:" + c0Var + W());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + c0VarP0 + " \n View Holder 2:" + c0Var + W());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + W());
    }

    public void v1(int i10, int i11, int[] iArr) {
        G1();
        S0();
        Trace.beginSection("RV Scroll");
        X(this.f3688i0);
        int iScrollHorizontallyBy = i10 != 0 ? this.f3697n.scrollHorizontallyBy(i10, this.f3675c, this.f3688i0) : 0;
        int iScrollVerticallyBy = i11 != 0 ? this.f3697n.scrollVerticallyBy(i11, this.f3675c, this.f3688i0) : 0;
        Trace.endSection();
        o1();
        T0();
        K1(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public void w() {
        int iJ = this.f3681f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            c0 c0VarP0 = p0(this.f3681f.i(i10));
            if (!c0VarP0.shouldIgnore()) {
                c0VarP0.clearOldPosition();
            }
        }
        this.f3675c.d();
    }

    public boolean w0() {
        return !this.f3713v || this.E || this.f3679e.p();
    }

    public void w1(int i10) {
        if (this.f3719y) {
            return;
        }
        M1();
        n nVar = this.f3697n;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nVar.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    public void x(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.J;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.J.onRelease();
            zIsFinished = this.J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final boolean x0() {
        int iG = this.f3681f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            c0 c0VarP0 = p0(this.f3681f.f(i10));
            if (c0VarP0 != null && !c0VarP0.shouldIgnore() && c0VarP0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public final void x1(Adapter adapter, boolean z10, boolean z11) {
        Adapter adapter2 = this.f3695m;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f3673b);
            this.f3695m.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            i1();
        }
        this.f3679e.y();
        Adapter adapter3 = this.f3695m;
        this.f3695m = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f3673b);
            adapter.onAttachedToRecyclerView(this);
        }
        n nVar = this.f3697n;
        if (nVar != null) {
            nVar.onAdapterChanged(adapter3, this.f3695m);
        }
        this.f3675c.y(adapter3, this.f3695m, z10);
        this.f3688i0.f3792g = true;
    }

    public int y(int i10) {
        return z(i10, this.J, this.L, getWidth());
    }

    public void y0() {
        this.f3679e = new androidx.recyclerview.widget.a(new g());
    }

    public boolean y1(c0 c0Var, int i10) {
        if (!F0()) {
            c0Var.itemView.setImportantForAccessibility(i10);
            return true;
        }
        c0Var.mPendingAccessibilityState = i10;
        this.f3714v0.add(c0Var);
        return false;
    }

    public final int z(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    public final void z0() {
        if (ViewCompat.x(this) == 0) {
            ViewCompat.s0(this, 8);
        }
    }

    public final boolean z1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return u0(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) i11);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f3737c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3737c = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        public void e(SavedState savedState) {
            this.f3737c = savedState.f3737c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3737c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.f3673b = new w();
        this.f3675c = new u();
        this.f3683g = new androidx.recyclerview.widget.o();
        this.f3687i = new a();
        this.f3689j = new Rect();
        this.f3691k = new Rect();
        this.f3693l = new RectF();
        this.f3699o = new ArrayList();
        this.f3701p = new ArrayList();
        this.f3703q = new ArrayList();
        this.f3715w = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = N0;
        this.N = new androidx.recyclerview.widget.c();
        this.O = 0;
        this.P = -1;
        this.f3676c0 = Float.MIN_VALUE;
        this.f3678d0 = Float.MIN_VALUE;
        this.f3680e0 = true;
        this.f3682f0 = new b0();
        this.f3686h0 = K0 ? new e.b() : null;
        this.f3688i0 = new y();
        this.f3694l0 = false;
        this.f3696m0 = false;
        this.f3698n0 = new l();
        this.f3700o0 = false;
        this.f3704q0 = new int[2];
        this.f3708s0 = new int[2];
        this.f3710t0 = new int[2];
        this.f3712u0 = new int[2];
        this.f3714v0 = new ArrayList();
        this.f3716w0 = new b();
        this.f3720y0 = 0;
        this.f3722z0 = 0;
        this.B0 = new d();
        e eVar = new e();
        this.C0 = eVar;
        this.D0 = new androidx.core.view.n(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.V = viewConfiguration.getScaledTouchSlop();
        this.f3676c0 = c1.f(viewConfiguration, context);
        this.f3678d0 = c1.j(viewConfiguration, context);
        this.f3672a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3674b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3671a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.N.v(this.f3698n0);
        y0();
        A0();
        z0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = androidx.recyclerview.R.styleable.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ViewCompat.h0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3685h = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.f3711u = z10;
        if (z10) {
            B0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.A0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        C(context, string, attributeSet, i10, 0);
        int[] iArr2 = G0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        ViewCompat.h0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        x0.a.d(this, true);
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public c0 f3759a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f3760b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3761c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3762d;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3760b = new Rect();
            this.f3761c = true;
            this.f3762d = false;
        }

        public int a() {
            return this.f3759a.getLayoutPosition();
        }

        public boolean b() {
            return this.f3759a.isUpdated();
        }

        public boolean c() {
            return this.f3759a.isRemoved();
        }

        public boolean d() {
            return this.f3759a.isInvalid();
        }

        public o(int i10, int i11) {
            super(i10, i11);
            this.f3760b = new Rect();
            this.f3761c = true;
            this.f3762d = false;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3760b = new Rect();
            this.f3761c = true;
            this.f3762d = false;
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3760b = new Rect();
            this.f3761c = true;
            this.f3762d = false;
        }

        public o(o oVar) {
            super((ViewGroup.LayoutParams) oVar);
            this.f3760b = new Rect();
            this.f3761c = true;
            this.f3762d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f3697n;
        if (nVar != null) {
            return nVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }
}
