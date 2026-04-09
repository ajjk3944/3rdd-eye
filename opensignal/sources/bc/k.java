package bc;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k extends e implements DialogInterface.OnCancelListener {
    public final d B;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2614d;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f2615g;

    /* renamed from: r, reason: collision with root package name */
    public final yh.a f2616r;

    /* renamed from: x, reason: collision with root package name */
    public final zb.c f2617x;

    /* renamed from: y, reason: collision with root package name */
    public final u.f f2618y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, d dVar) {
        super(fVar);
        zb.c cVar = zb.c.f26814e;
        this.f2615g = new AtomicReference(null);
        this.f2616r = new yh.a(Looper.getMainLooper(), 4);
        this.f2617x = cVar;
        this.f2618y = new u.f(0);
        this.B = dVar;
        fVar.b("ConnectionlessLifecycleHelper", this);
    }

    @Override // bc.e
    public final void c(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f2615g;
        c0 c0Var = (c0) atomicReference.get();
        d dVar = this.B;
        if (i10 != 1) {
            if (i10 == 2) {
                int iB = this.f2617x.b(a(), zb.d.f26816a);
                if (iB == 0) {
                    atomicReference.set(null);
                    yh.a aVar = dVar.J;
                    aVar.sendMessage(aVar.obtainMessage(3));
                    return;
                } else {
                    if (c0Var == null) {
                        return;
                    }
                    if (c0Var.f2587b.f4807d == 18 && iB == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            yh.a aVar2 = dVar.J;
            aVar2.sendMessage(aVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (c0Var != null) {
                ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c0Var.f2587b.toString());
                int i12 = c0Var.f2586a;
                atomicReference.set(null);
                dVar.h(connectionResult, i12);
                return;
            }
            return;
        }
        if (c0Var != null) {
            ConnectionResult connectionResult2 = c0Var.f2587b;
            int i13 = c0Var.f2586a;
            atomicReference.set(null);
            dVar.h(connectionResult2, i13);
        }
    }

    @Override // bc.e
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.f2615g.set(bundle.getBoolean("resolving_error", false) ? new c0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // bc.e
    public final void e() {
        if (this.f2618y.isEmpty()) {
            return;
        }
        this.B.e(this);
    }

    @Override // bc.e
    public final void f(Bundle bundle) {
        c0 c0Var = (c0) this.f2615g.get();
        if (c0Var == null) {
            return;
        }
        ConnectionResult connectionResult = c0Var.f2587b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c0Var.f2586a);
        bundle.putInt("failed_status", connectionResult.f4807d);
        bundle.putParcelable("failed_resolution", connectionResult.f4808g);
    }

    @Override // bc.e
    public final void g() {
        this.f2614d = true;
        if (this.f2618y.isEmpty()) {
            return;
        }
        this.B.e(this);
    }

    @Override // bc.e
    public final void h() {
        this.f2614d = false;
        d dVar = this.B;
        dVar.getClass();
        synchronized (d.N) {
            try {
                if (dVar.G == this) {
                    dVar.G = null;
                    dVar.H.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        AtomicReference atomicReference = this.f2615g;
        c0 c0Var = (c0) atomicReference.get();
        int i10 = c0Var == null ? -1 : c0Var.f2586a;
        atomicReference.set(null);
        this.B.h(connectionResult, i10);
    }
}
