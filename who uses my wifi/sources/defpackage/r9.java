package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class r9 extends ViewGroup {
    public final e23 f;

    public r9(Context context) {
        super(context);
        this.f = new e23(this);
    }

    public final void a() {
        mz1.a(getContext());
        if (((Boolean) q02.e.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Tb)).booleanValue()) {
                uu1.b.execute(new mx2(this, 2));
                return;
            }
        }
        e23 e23Var = this.f;
        e23Var.getClass();
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.r();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public final void b(b3 b3Var) {
        ou1.h("#008 Must be called on the main UI thread.");
        mz1.a(getContext());
        if (((Boolean) q02.f.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                uu1.b.execute(new n62(this, b3Var, 18));
                return;
            }
        }
        this.f.b(b3Var.a);
    }

    public final void c() {
        mz1.a(getContext());
        if (((Boolean) q02.g.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Ub)).booleanValue()) {
                uu1.b.execute(new mx2(this, 0));
                return;
            }
        }
        e23 e23Var = this.f;
        e23Var.getClass();
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.c();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public final void d() {
        mz1.a(getContext());
        if (((Boolean) q02.h.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Sb)).booleanValue()) {
                uu1.b.execute(new mx2(this, 1));
                return;
            }
        }
        e23 e23Var = this.f;
        e23Var.getClass();
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.e();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public t2 getAdListener() {
        return this.f.f;
    }

    public d3 getAdSize() {
        xe4 xe4VarO;
        e23 e23Var = this.f;
        e23Var.getClass();
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null && (xe4VarO = ba2Var.o()) != null) {
                return new d3(xe4VarO.f, xe4VarO.j, xe4VarO.g);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
        d3[] d3VarArr = e23Var.g;
        if (d3VarArr != null) {
            return d3VarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        ba2 ba2Var;
        e23 e23Var = this.f;
        if (e23Var.k == null && (ba2Var = e23Var.i) != null) {
            try {
                e23Var.k = ba2Var.v();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
        return e23Var.k;
    }

    public ij0 getOnPaidEventListener() {
        this.f.getClass();
        return null;
    }

    public long getPlacementId() {
        e23 e23Var = this.f;
        AtomicLong atomicLong = e23Var.n;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var == null) {
                return 0L;
            }
            atomicLong.set(ba2Var.k0());
            return atomicLong.get();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            return 0L;
        }
    }

    public hq0 getResponseInfo() {
        ba2 ba2Var;
        e23 e23Var = this.f;
        e23Var.getClass();
        try {
            ba2Var = e23Var.i;
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
        tx2 tx2VarN = ba2Var != null ? ba2Var.N() : null;
        if (tx2VarN != null) {
            return new hq0(tx2VarN);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d3 adSize;
        int measuredHeight;
        int iB;
        int iB2;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                gi2.c0("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i3 = adSize.a;
                if (i3 == -3) {
                    iB = -1;
                } else if (i3 != -1) {
                    j63 j63Var = sv1.f.a;
                    iB = j63.b(context, i3);
                } else {
                    iB = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i4 = adSize.b;
                if (i4 == -4 || i4 == -3) {
                    iB2 = -1;
                } else if (i4 != -2) {
                    j63 j63Var2 = sv1.f.a;
                    iB2 = j63.b(context, i4);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f = displayMetrics.heightPixels;
                    float f2 = displayMetrics.density;
                    int i5 = (int) (f / f2);
                    iB2 = (int) ((i5 <= 400 ? 32 : i5 <= 720 ? 50 : 90) * f2);
                }
                measuredHeight = iB2;
                measuredWidth = iB;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(t2 t2Var) {
        e23 e23Var = this.f;
        e23Var.f = t2Var;
        cx2 cx2Var = e23Var.d;
        synchronized (cx2Var.g) {
            cx2Var.h = t2Var;
        }
        if (t2Var == 0) {
            e23Var.c(null);
            return;
        }
        if (t2Var instanceof fd1) {
            e23Var.c((fd1) t2Var);
        }
        if (t2Var instanceof b8) {
            e23Var.e((b8) t2Var);
        }
    }

    public void setAdSize(d3 d3Var) {
        d3[] d3VarArr = {d3Var};
        e23 e23Var = this.f;
        if (e23Var.g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        e23Var.d(d3VarArr);
    }

    public void setAdUnitId(String str) {
        e23 e23Var = this.f;
        if (e23Var.k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        e23Var.k = str;
    }

    public void setOnPaidEventListener(ij0 ij0Var) {
        e23 e23Var = this.f;
        e23Var.getClass();
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.Z1(new kd3());
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    public void setPlacementId(long j) {
        e23 e23Var = this.f;
        e23Var.n.set(j);
        try {
            ba2 ba2Var = e23Var.i;
            if (ba2Var != null) {
                ba2Var.s1(j);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }
}
