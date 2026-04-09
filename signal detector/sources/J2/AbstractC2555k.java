package j2;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1266ha;
import com.google.android.gms.internal.ads.C0649No;
import com.google.android.gms.internal.ads.H9;
import java.util.concurrent.atomic.AtomicLong;
import k2.InterfaceC2625d;
import q2.C2841s;
import q2.F0;
import q2.InterfaceC2806a;
import q2.InterfaceC2854y0;
import q2.L;
import q2.T0;
import q2.d1;
import u2.AbstractC2953c;

/* renamed from: j2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2555k extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f21350a;

    public AbstractC2555k(Context context) {
        super(context);
        this.f21350a = new F0(this);
    }

    public final void a() {
        H9.a(getContext());
        if (((Boolean) AbstractC1266ha.f14503e.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.qc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new v(this, 2));
                return;
            }
        }
        F0 f02 = this.f21350a;
        f02.getClass();
        try {
            L l2 = f02.i;
            if (l2 != null) {
                l2.s();
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public final void b(C2551g c2551g) {
        M2.u.c("#008 Must be called on the main UI thread.");
        H9.a(getContext());
        if (((Boolean) AbstractC1266ha.f14504f.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new f1.i(this, 3, c2551g));
                return;
            }
        }
        this.f21350a.b(c2551g.f21337a);
    }

    public AbstractC2547c getAdListener() {
        return this.f21350a.f23107f;
    }

    public C2552h getAdSize() {
        d1 d1VarO;
        F0 f02 = this.f21350a;
        f02.getClass();
        try {
            L l2 = f02.i;
            if (l2 != null && (d1VarO = l2.o()) != null) {
                return new C2552h(d1VarO.f23192e, d1VarO.f23189b, d1VarO.f23188a);
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
        C2552h[] c2552hArr = f02.f23108g;
        if (c2552hArr != null) {
            return c2552hArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        L l2;
        F0 f02 = this.f21350a;
        if (f02.f23111k == null && (l2 = f02.i) != null) {
            try {
                f02.f23111k = l2.A();
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            }
        }
        return f02.f23111k;
    }

    public InterfaceC2558n getOnPaidEventListener() {
        this.f21350a.getClass();
        return null;
    }

    public long getPlacementId() {
        F0 f02 = this.f21350a;
        AtomicLong atomicLong = f02.f23114n;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            L l2 = f02.i;
            if (l2 == null) {
                return 0L;
            }
            atomicLong.set(l2.a0());
            return atomicLong.get();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
            return 0L;
        }
    }

    public q getResponseInfo() {
        L l2;
        F0 f02 = this.f21350a;
        f02.getClass();
        try {
            l2 = f02.i;
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
        InterfaceC2854y0 interfaceC2854y0N = l2 != null ? l2.N() : null;
        if (interfaceC2854y0N != null) {
            return new q(interfaceC2854y0N);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i8 = ((i6 - i) - measuredWidth) / 2;
        int i9 = ((i7 - i3) - measuredHeight) / 2;
        childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        C2552h adSize;
        int measuredHeight;
        int iB;
        int iB2;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e6) {
                u2.k.f("Unable to retrieve ad size.", e6);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i6 = adSize.f21340a;
                if (i6 == -3) {
                    iB = -1;
                } else if (i6 != -1) {
                    u2.f fVar = q2.r.f23260g.f23261a;
                    iB = u2.f.b(context, i6);
                } else {
                    iB = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i7 = adSize.f21341b;
                if (i7 == -4 || i7 == -3) {
                    iB2 = -1;
                } else if (i7 != -2) {
                    u2.f fVar2 = q2.r.f23260g.f23261a;
                    iB2 = u2.f.b(context, i7);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f2 = displayMetrics.heightPixels;
                    float f5 = displayMetrics.density;
                    int i8 = (int) (f2 / f5);
                    iB2 = (int) ((i8 <= 400 ? 32 : i8 <= 720 ? 50 : 90) * f5);
                }
                measuredHeight = iB2;
                measuredWidth = iB;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i, i3);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AbstractC2547c abstractC2547c) {
        F0 f02 = this.f21350a;
        f02.f23107f = abstractC2547c;
        C0649No c0649No = f02.f23105d;
        synchronized (c0649No.f10066b) {
            c0649No.f10067c = abstractC2547c;
        }
        if (abstractC2547c == 0) {
            f02.c(null);
            return;
        }
        if (abstractC2547c instanceof InterfaceC2806a) {
            f02.c((InterfaceC2806a) abstractC2547c);
        }
        if (abstractC2547c instanceof InterfaceC2625d) {
            f02.e((InterfaceC2625d) abstractC2547c);
        }
    }

    public void setAdSize(C2552h c2552h) {
        C2552h[] c2552hArr = {c2552h};
        F0 f02 = this.f21350a;
        if (f02.f23108g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        f02.d(c2552hArr);
    }

    public void setAdUnitId(String str) {
        F0 f02 = this.f21350a;
        if (f02.f23111k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        f02.f23111k = str;
    }

    public void setOnPaidEventListener(InterfaceC2558n interfaceC2558n) {
        F0 f02 = this.f21350a;
        f02.getClass();
        try {
            L l2 = f02.i;
            if (l2 != null) {
                l2.V2(new T0());
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public void setPlacementId(long j6) {
        F0 f02 = this.f21350a;
        f02.f23114n.set(j6);
        try {
            L l2 = f02.i;
            if (l2 != null) {
                l2.R0(j6);
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
