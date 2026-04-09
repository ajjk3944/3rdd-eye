package o4;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public class p extends androidx.fragment.app.b implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean F0;
    public Dialog H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;

    /* renamed from: w0, reason: collision with root package name */
    public Handler f18835w0;

    /* renamed from: x0, reason: collision with root package name */
    public final b4.e f18836x0 = new b4.e(24, this);

    /* renamed from: y0, reason: collision with root package name */
    public final l f18837y0 = new l(this);

    /* renamed from: z0, reason: collision with root package name */
    public final m f18838z0 = new m(this);
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = true;
    public boolean D0 = true;
    public int E0 = -1;
    public final n G0 = new n(this);
    public boolean L0 = false;

    @Override // androidx.fragment.app.b
    public final void C(Context context) {
        super.C(context);
        this.f1425p0.e(this.G0);
        if (this.K0) {
            return;
        }
        this.J0 = false;
    }

    @Override // androidx.fragment.app.b
    public void D(Bundle bundle) {
        super.D(bundle);
        this.f18835w0 = new Handler();
        this.D0 = this.V == 0;
        if (bundle != null) {
            this.A0 = bundle.getInt("android:style", 0);
            this.B0 = bundle.getInt("android:theme", 0);
            this.C0 = bundle.getBoolean("android:cancelable", true);
            this.D0 = bundle.getBoolean("android:showsDialog", this.D0);
            this.E0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.b
    public final void H() {
        this.f1410c0 = true;
        Dialog dialog = this.H0;
        if (dialog != null) {
            this.I0 = true;
            dialog.setOnDismissListener(null);
            this.H0.dismiss();
            if (!this.J0) {
                onDismiss(this.H0);
            }
            this.H0 = null;
            this.L0 = false;
        }
    }

    @Override // androidx.fragment.app.b
    public final void I() {
        this.f1410c0 = true;
        if (!this.K0 && !this.J0) {
            this.J0 = true;
        }
        this.f1425p0.h(this.G0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0042, B:29:0x004c, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:30:0x0064), top: B:45:0x0018 }] */
    @Override // androidx.fragment.app.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater J(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.J(r7)
            boolean r0 = r6.D0
            r1 = 2
            if (r0 == 0) goto L83
            boolean r2 = r6.F0
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            if (r0 != 0) goto L12
            goto L6d
        L12:
            boolean r0 = r6.L0
            if (r0 != 0) goto L6d
            r0 = 0
            r2 = 1
            r6.F0 = r2     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.h0()     // Catch: java.lang.Throwable -> L4a
            r6.H0 = r3     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r6.D0     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L64
            int r4 = r6.A0     // Catch: java.lang.Throwable -> L4a
            if (r4 == r2) goto L39
            if (r4 == r1) goto L39
            r5 = 3
            if (r4 == r5) goto L2e
            goto L3c
        L2e:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L39
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L4a
        L39:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L4a
        L3c:
            android.content.Context r3 = r6.n()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            android.app.Dialog r4 = r6.H0     // Catch: java.lang.Throwable -> L4a
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L4a
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r7 = move-exception
            goto L6a
        L4c:
            android.app.Dialog r3 = r6.H0     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r6.C0     // Catch: java.lang.Throwable -> L4a
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.H0     // Catch: java.lang.Throwable -> L4a
            o4.l r4 = r6.f18837y0     // Catch: java.lang.Throwable -> L4a
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.H0     // Catch: java.lang.Throwable -> L4a
            o4.m r4 = r6.f18838z0     // Catch: java.lang.Throwable -> L4a
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L4a
            r6.L0 = r2     // Catch: java.lang.Throwable -> L4a
            goto L67
        L64:
            r2 = 0
            r6.H0 = r2     // Catch: java.lang.Throwable -> L4a
        L67:
            r6.F0 = r0
            goto L6d
        L6a:
            r6.F0 = r0
            throw r7
        L6d:
            boolean r0 = androidx.fragment.app.d.K(r1)
            if (r0 == 0) goto L76
            r6.toString()
        L76:
            android.app.Dialog r0 = r6.H0
            if (r0 == 0) goto L8c
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r7 = r7.cloneInContext(r0)
            return r7
        L83:
            boolean r0 = androidx.fragment.app.d.K(r1)
            if (r0 == 0) goto L8c
            r6.toString()
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.p.J(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.b
    public void P(Bundle bundle) {
        Dialog dialog = this.H0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.A0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.B0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.C0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.D0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.E0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.b
    public void Q() {
        this.f1410c0 = true;
        Dialog dialog = this.H0;
        if (dialog != null) {
            this.I0 = false;
            dialog.show();
            View decorView = this.H0.getWindow().getDecorView();
            androidx.lifecycle.o0.f(decorView, this);
            decorView.setTag(v4.d.view_tree_view_model_store_owner, this);
            i4.C(decorView, this);
        }
    }

    @Override // androidx.fragment.app.b
    public void R() {
        this.f1410c0 = true;
        Dialog dialog = this.H0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.b
    public final void T(Bundle bundle) {
        Bundle bundle2;
        this.f1410c0 = true;
        if (this.H0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.H0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.b
    public final void U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.U(layoutInflater, viewGroup, bundle);
        if (this.f1413e0 != null || this.H0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.H0.onRestoreInstanceState(bundle2);
    }

    public final void g0(boolean z10, boolean z11) {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        this.K0 = false;
        Dialog dialog = this.H0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.H0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f18835w0.getLooper()) {
                    onDismiss(this.H0);
                } else {
                    this.f18835w0.post(this.f18836x0);
                }
            }
        }
        this.I0 = true;
        if (this.E0 >= 0) {
            androidx.fragment.app.d dVarP = p();
            int i10 = this.E0;
            if (i10 < 0) {
                throw new IllegalArgumentException(h0.b.h(i10, "Bad id: "));
            }
            dVarP.y(new h0(dVarP, i10), z10);
            this.E0 = -1;
            return;
        }
        a aVar = new a(p());
        aVar.f18770o = true;
        androidx.fragment.app.d dVar = this.Q;
        if (dVar != null && dVar != aVar.f18772q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new o0(3, this));
        if (z10) {
            aVar.f(true, true);
        } else {
            aVar.e();
        }
    }

    public Dialog h0() {
        if (androidx.fragment.app.d.K(3)) {
            toString();
        }
        return new c.n(X(), this.B0);
    }

    @Override // androidx.fragment.app.b
    public final ic.a i() {
        return new o(this, new s(this));
    }

    public final void i0(int i10) {
        if (androidx.fragment.app.d.K(2)) {
            toString();
        }
        this.A0 = 0;
        if (i10 != 0) {
            this.B0 = i10;
        }
    }

    public void j0(androidx.fragment.app.d dVar, String str) {
        this.J0 = false;
        this.K0 = true;
        dVar.getClass();
        a aVar = new a(dVar);
        aVar.f18770o = true;
        aVar.g(0, this, str, 1);
        aVar.e();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.I0) {
            return;
        }
        if (androidx.fragment.app.d.K(3)) {
            toString();
        }
        g0(true, true);
    }

    @Override // androidx.fragment.app.b
    public final void z(Bundle bundle) {
        this.f1410c0 = true;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
