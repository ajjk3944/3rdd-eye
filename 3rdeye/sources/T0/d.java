package t0;

import L0.r;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import t0.e;
import u0.C5617a;

/* compiled from: MotionLayout.java */
/* loaded from: classes.dex */
public final class d extends ConstraintLayout implements r {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f46349I = 0;

    /* renamed from: A, reason: collision with root package name */
    public C5593b f46350A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f46351B;

    /* renamed from: C, reason: collision with root package name */
    public int f46352C;

    /* renamed from: D, reason: collision with root package name */
    public float f46353D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f46354E;

    /* renamed from: F, reason: collision with root package name */
    public c f46355F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f46356G;

    /* renamed from: H, reason: collision with root package name */
    public e f46357H;

    /* renamed from: t, reason: collision with root package name */
    public float f46358t;

    /* renamed from: u, reason: collision with root package name */
    public int f46359u;

    /* renamed from: v, reason: collision with root package name */
    public int f46360v;

    /* renamed from: w, reason: collision with root package name */
    public float f46361w;

    /* renamed from: x, reason: collision with root package name */
    public float f46362x;

    /* renamed from: y, reason: collision with root package name */
    public long f46363y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0533d f46364z;

    /* compiled from: MotionLayout.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.f46355F.a();
        }
    }

    /* compiled from: MotionLayout.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46366a;

        static {
            int[] iArr = new int[e.values().length];
            f46366a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46366a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46366a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46366a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MotionLayout.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public float f46367a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f46368b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f46369c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f46370d = -1;

        public c() {
        }

        public final void a() {
            int i = this.f46369c;
            d dVar = d.this;
            if (i != -1 || this.f46370d != -1) {
                if (i == -1) {
                    dVar.r(this.f46370d);
                } else {
                    int i10 = this.f46370d;
                    if (i10 == -1) {
                        dVar.getClass();
                        dVar.setState(e.SETUP);
                        dVar.f46359u = i;
                        dVar.f46360v = -1;
                        C5617a c5617a = dVar.f15206l;
                        if (c5617a != null) {
                            float f10 = -1;
                            int i11 = c5617a.f46484b;
                            SparseArray<C5617a.C0537a> sparseArray = c5617a.f46486d;
                            int i12 = 0;
                            ConstraintLayout constraintLayout = c5617a.f46483a;
                            if (i11 == i) {
                                C5617a.C0537a c0537aValueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
                                int i13 = c5617a.f46485c;
                                if (i13 == -1 || !c0537aValueAt.f46489b.get(i13).a(f10, f10)) {
                                    while (true) {
                                        ArrayList<C5617a.b> arrayList = c0537aValueAt.f46489b;
                                        if (i12 >= arrayList.size()) {
                                            i12 = -1;
                                            break;
                                        } else if (arrayList.get(i12).a(f10, f10)) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                    if (c5617a.f46485c != i12) {
                                        ArrayList<C5617a.b> arrayList2 = c0537aValueAt.f46489b;
                                        androidx.constraintlayout.widget.d dVar2 = i12 == -1 ? null : arrayList2.get(i12).f46497f;
                                        if (i12 != -1) {
                                            int i14 = arrayList2.get(i12).f46496e;
                                        }
                                        if (dVar2 != null) {
                                            c5617a.f46485c = i12;
                                            dVar2.a(constraintLayout);
                                            constraintLayout.setConstraintSet(null);
                                            constraintLayout.requestLayout();
                                        }
                                    }
                                }
                            } else {
                                c5617a.f46484b = i;
                                C5617a.C0537a c0537a = sparseArray.get(i);
                                while (true) {
                                    ArrayList<C5617a.b> arrayList3 = c0537a.f46489b;
                                    if (i12 >= arrayList3.size()) {
                                        i12 = -1;
                                        break;
                                    } else if (arrayList3.get(i12).a(f10, f10)) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                                ArrayList<C5617a.b> arrayList4 = c0537a.f46489b;
                                androidx.constraintlayout.widget.d dVar3 = i12 == -1 ? c0537a.f46491d : arrayList4.get(i12).f46497f;
                                if (i12 != -1) {
                                    int i15 = arrayList4.get(i12).f46496e;
                                }
                                if (dVar3 == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                                } else {
                                    c5617a.f46485c = i12;
                                    dVar3.a(constraintLayout);
                                    constraintLayout.setConstraintSet(null);
                                    constraintLayout.requestLayout();
                                }
                            }
                        }
                    } else {
                        dVar.q(i, i10);
                    }
                }
                dVar.setState(e.SETUP);
            }
            if (Float.isNaN(this.f46368b)) {
                if (Float.isNaN(this.f46367a)) {
                    return;
                }
                dVar.setProgress(this.f46367a);
            } else {
                dVar.p(this.f46367a, this.f46368b);
                this.f46367a = Float.NaN;
                this.f46368b = Float.NaN;
                this.f46369c = -1;
                this.f46370d = -1;
            }
        }
    }

    /* compiled from: MotionLayout.java */
    /* renamed from: t0.d$d, reason: collision with other inner class name */
    public interface InterfaceC0533d {
    }

    /* compiled from: MotionLayout.java */
    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        boolean z10;
        if (this.f46363y == -1) {
            this.f46363y = getNanoTime();
        }
        float f10 = this.f46362x;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f46359u = -1;
        }
        boolean z11 = false;
        if (this.f46351B) {
            float fSignum = Math.signum(1.0f - f10);
            long nanoTime = getNanoTime();
            float f11 = (((nanoTime - this.f46363y) * fSignum) * 1.0E-9f) / 0.0f;
            float f12 = this.f46362x + f11;
            if ((fSignum > 0.0f && f12 >= 1.0f) || (fSignum <= 0.0f && f12 <= 1.0f)) {
                f12 = 1.0f;
            }
            this.f46362x = f12;
            this.f46361w = f12;
            this.f46363y = nanoTime;
            this.f46358t = f11;
            if (Math.abs(f11) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((fSignum > 0.0f && f12 >= 1.0f) || (fSignum <= 0.0f && f12 <= 1.0f)) {
                f12 = 1.0f;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                setState(e.FINISHED);
            }
            int childCount = getChildCount();
            this.f46351B = false;
            getNanoTime();
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z12 = (fSignum > 0.0f && f12 >= 1.0f) || (fSignum <= 0.0f && f12 <= 1.0f);
            if (!this.f46351B && z12) {
                setState(e.FINISHED);
            }
            boolean z13 = (!z12) | this.f46351B;
            this.f46351B = z13;
            if (f12 >= 1.0d) {
                int i = this.f46359u;
                int i10 = this.f46360v;
                if (i != i10) {
                    this.f46359u = i10;
                    throw null;
                }
            }
            if (z13) {
                invalidate();
            } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                setState(e.FINISHED);
            }
            if (!this.f46351B && ((fSignum <= 0.0f || f12 != 1.0f) && fSignum < 0.0f)) {
                int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
            }
        }
        float f13 = this.f46362x;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                z10 = this.f46359u != -1;
                this.f46359u = -1;
            }
            if (z11 && !this.f46354E) {
                super.requestLayout();
            }
            this.f46361w = this.f46362x;
            super.dispatchDraw(canvas);
        }
        int i12 = this.f46359u;
        int i13 = this.f46360v;
        z10 = i12 != i13;
        this.f46359u = i13;
        z11 = z10;
        if (z11) {
            super.requestLayout();
        }
        this.f46361w = this.f46362x;
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void e(int i) {
        this.f15206l = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f46359u;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public C5593b getDesignTool() {
        if (this.f46350A == null) {
            this.f46350A = new C5593b();
        }
        return this.f46350A;
    }

    public int getEndState() {
        return this.f46360v;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f46362x;
    }

    public t0.e getScene() {
        return null;
    }

    public int getStartState() {
        return -1;
    }

    public float getTargetPosition() {
        return 1.0f;
    }

    public Bundle getTransitionState() {
        c cVar = this.f46355F;
        d dVar = d.this;
        cVar.f46370d = dVar.f46360v;
        cVar.f46369c = -1;
        cVar.f46368b = dVar.getVelocity();
        cVar.f46367a = dVar.getProgress();
        c cVar2 = this.f46355F;
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", cVar2.f46367a);
        bundle.putFloat("motion.velocity", cVar2.f46368b);
        bundle.putInt("motion.StartState", cVar2.f46369c);
        bundle.putInt("motion.EndState", cVar2.f46370d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.f46358t;
    }

    public final void h() {
        if (this.f46364z == null) {
            throw null;
        }
        if (this.f46353D != this.f46361w) {
            if (this.f46352C != -1) {
                throw null;
            }
            this.f46352C = -1;
            this.f46353D = this.f46361w;
            throw null;
        }
    }

    public final void i() {
        if (this.f46364z == null) {
            throw null;
        }
        if (this.f46352C == -1) {
            this.f46352C = this.f46359u;
            throw null;
        }
        if (this.f46364z != null) {
            throw null;
        }
        throw null;
    }

    @Override // L0.r
    public final void k(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i == 0 && i10 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
    }

    @Override // L0.InterfaceC0786q
    public final boolean m(View view, View view2, int i, int i10) {
        return false;
    }

    @Override // L0.InterfaceC0786q
    public final void n(View view, View view2, int i, int i10) {
        getNanoTime();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        c cVar = this.f46355F;
        if (this.f46356G) {
            post(new a());
        } else {
            cVar.a();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        this.f46354E = true;
        try {
            super.onLayout(z10, i, i10, i11, i12);
        } finally {
            this.f46354E = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof t0.c) {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
    }

    public final void p(float f10, float f11) {
        if (super.isAttachedToWindow()) {
            setProgress(f10);
            setState(e.MOVING);
            this.f46358t = f11;
        } else {
            c cVar = this.f46355F;
            cVar.f46367a = f10;
            cVar.f46368b = f11;
        }
    }

    public final void q(int i, int i10) {
        if (super.isAttachedToWindow()) {
            return;
        }
        if (this.f46355F == null) {
            this.f46355F = new c();
        }
        c cVar = this.f46355F;
        cVar.f46369c = i;
        cVar.f46370d = i10;
    }

    public final void r(int i) {
        if (!super.isAttachedToWindow()) {
            this.f46355F.f46370d = i;
            return;
        }
        int i10 = this.f46359u;
        if (i10 == i || -1 == i || this.f46360v == i) {
            return;
        }
        this.f46360v = i;
        if (i10 != -1) {
            q(i10, i);
            this.f46362x = 0.0f;
        } else {
            this.f46361w = 0.0f;
            this.f46362x = 0.0f;
            this.f46363y = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f46356G = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            this.f46355F.f46367a = f10;
            return;
        }
        if (f10 <= 0.0f) {
            if (this.f46362x == 1.0f && this.f46359u == this.f46360v) {
                setState(e.MOVING);
            }
            this.f46359u = -1;
            if (this.f46362x == 0.0f) {
                setState(e.FINISHED);
                return;
            }
            return;
        }
        if (f10 < 1.0f) {
            this.f46359u = -1;
            setState(e.MOVING);
            return;
        }
        if (this.f46362x == 0.0f && this.f46359u == -1) {
            setState(e.MOVING);
        }
        this.f46359u = this.f46360v;
        if (this.f46362x == 1.0f) {
            setState(e.FINISHED);
        }
    }

    public void setScene(t0.e eVar) {
        d();
        throw null;
    }

    public void setStartState(int i) {
        if (super.isAttachedToWindow()) {
            this.f46359u = i;
            return;
        }
        if (this.f46355F == null) {
            this.f46355F = new c();
        }
        c cVar = this.f46355F;
        cVar.f46369c = i;
        cVar.f46370d = i;
    }

    public void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.f46359u == -1) {
            return;
        }
        e eVar3 = this.f46357H;
        this.f46357H = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            h();
        }
        int i = b.f46366a[eVar3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && eVar == eVar2) {
                i();
                return;
            }
            return;
        }
        if (eVar == eVar4) {
            h();
        }
        if (eVar == eVar2) {
            i();
        }
    }

    public void setTransition(int i) {
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(InterfaceC0533d interfaceC0533d) {
        this.f46364z = interfaceC0533d;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f46355F == null) {
            this.f46355F = new c();
        }
        c cVar = this.f46355F;
        cVar.getClass();
        cVar.f46367a = bundle.getFloat("motion.progress");
        cVar.f46368b = bundle.getFloat("motion.velocity");
        cVar.f46369c = bundle.getInt("motion.StartState");
        cVar.f46370d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f46355F.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C5592a.a(context, -1) + "->" + C5592a.a(context, this.f46360v) + " (pos:" + this.f46362x + " Dpos/Dt:" + this.f46358t;
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    public void setInteractionEnabled(boolean z10) {
    }

    public void setOnHide(float f10) {
    }

    public void setOnShow(float f10) {
    }

    @Override // L0.InterfaceC0786q
    public final void j(int i, View view) {
    }

    @Override // L0.InterfaceC0786q
    public final void o(View view, int i, int i10, int[] iArr, int i11) {
    }

    @Override // L0.InterfaceC0786q
    public final void l(View view, int i, int i10, int i11, int i12, int i13) {
    }
}
