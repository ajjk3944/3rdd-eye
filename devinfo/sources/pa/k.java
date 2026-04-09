package pa;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.sl;
import java.util.concurrent.atomic.AtomicLong;
import pb.y;
import va.c3;
import va.e2;
import va.l0;
import va.s2;
import va.x1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class k extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f31539a;

    public k(Context context) {
        super(context);
        this.f31539a = new e2(this);
    }

    public final void a() {
        sk.a(getContext());
        if (((Boolean) sl.f16459e.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16326sc)).booleanValue()) {
                za.b.f38135b.execute(new v(this, 2));
                return;
            }
        }
        e2 e2Var = this.f31539a;
        e2Var.getClass();
        try {
            l0 l0Var = e2Var.f36077i;
            if (l0Var != null) {
                l0Var.h();
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public final void b(g gVar) {
        y.d("#008 Must be called on the main UI thread.");
        sk.a(getContext());
        if (((Boolean) sl.f16460f.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new fb.r(7, this, gVar));
                return;
            }
        }
        this.f31539a.b(gVar.f31526a);
    }

    public c getAdListener() {
        return this.f31539a.f36075f;
    }

    public h getAdSize() {
        c3 c3VarG1;
        e2 e2Var = this.f31539a;
        e2Var.getClass();
        try {
            l0 l0Var = e2Var.f36077i;
            if (l0Var != null && (c3VarG1 = l0Var.G1()) != null) {
                return new h(c3VarG1.f36042e, c3VarG1.f36039b, c3VarG1.f36038a);
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
        h[] hVarArr = e2Var.g;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        l0 l0Var;
        e2 e2Var = this.f31539a;
        if (e2Var.f36078k == null && (l0Var = e2Var.f36077i) != null) {
            try {
                e2Var.f36078k = l0Var.M1();
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
        return e2Var.f36078k;
    }

    public n getOnPaidEventListener() {
        return this.f31539a.f36081n;
    }

    public long getPlacementId() {
        e2 e2Var = this.f31539a;
        AtomicLong atomicLong = e2Var.f36082o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            l0 l0Var = e2Var.f36077i;
            if (l0Var == null) {
                return 0L;
            }
            atomicLong.set(l0Var.M());
            return atomicLong.get();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
            return 0L;
        }
    }

    public q getResponseInfo() {
        l0 l0Var;
        e2 e2Var = this.f31539a;
        e2Var.getClass();
        try {
            l0Var = e2Var.f36077i;
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
        x1 x1VarN1 = l0Var != null ? l0Var.N1() : null;
        if (x1VarN1 != null) {
            return new q(x1VarN1);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i13 = ((i11 - i4) - measuredWidth) / 2;
        int i14 = ((i12 - i10) - measuredHeight) / 2;
        childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        h adSize;
        int iB;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e2) {
                za.i.f("Unable to retrieve ad size.", e2);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iD = adSize.d(context);
                iB = adSize.b(context);
                measuredWidth = iD;
            } else {
                iB = 0;
            }
        } else {
            measureChild(childAt, i4, i10);
            measuredWidth = childAt.getMeasuredWidth();
            iB = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i4), View.resolveSize(Math.max(iB, getSuggestedMinimumHeight()), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        e2 e2Var = this.f31539a;
        e2Var.f36075f = cVar;
        jf0 jf0Var = e2Var.f36073d;
        synchronized (jf0Var.f12741b) {
            jf0Var.f12742c = cVar;
        }
        if (cVar == 0) {
            e2Var.c(null);
            return;
        }
        if (cVar instanceof va.a) {
            e2Var.c((va.a) cVar);
        }
        if (cVar instanceof qa.d) {
            e2Var.e((qa.d) cVar);
        }
    }

    public void setAdSize(h hVar) {
        h[] hVarArr = {hVar};
        e2 e2Var = this.f31539a;
        if (e2Var.g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        e2Var.d(hVarArr);
    }

    public void setAdUnitId(String str) {
        e2 e2Var = this.f31539a;
        if (e2Var.f36078k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        e2Var.f36078k = str;
    }

    public void setOnPaidEventListener(n nVar) {
        e2 e2Var = this.f31539a;
        e2Var.getClass();
        try {
            e2Var.f36081n = nVar;
            l0 l0Var = e2Var.f36077i;
            if (l0Var != null) {
                l0Var.d1(new s2(nVar));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public void setPlacementId(long j) {
        e2 e2Var = this.f31539a;
        e2Var.f36082o.set(j);
        try {
            l0 l0Var = e2Var.f36077i;
            if (l0Var != null) {
                l0Var.D0(j);
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }
}
