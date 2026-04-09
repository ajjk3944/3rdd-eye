package b5;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s extends z implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Z;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1865i0;

    /* renamed from: k0, reason: collision with root package name */
    public Dialog f1867k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1868l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1869m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f1870n0;

    /* renamed from: a0, reason: collision with root package name */
    public final o f1857a0 = new o(0, this);

    /* renamed from: b0, reason: collision with root package name */
    public final p f1858b0 = new p(0, this);

    /* renamed from: c0, reason: collision with root package name */
    public final q f1859c0 = new q(this);

    /* renamed from: d0, reason: collision with root package name */
    public int f1860d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1861e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1862f0 = true;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1863g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    public int f1864h0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public final t.w f1866j0 = new t.w(this, 2);

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1871o0 = false;

    @Override // b5.z
    public final void C() {
        this.F = true;
    }

    @Override // b5.z
    public final void E(Context context) {
        Object obj;
        super.E(context);
        androidx.lifecycle.l0 l0Var = this.S;
        l0Var.getClass();
        androidx.lifecycle.l0.a("observeForever");
        t.w wVar = this.f1866j0;
        androidx.lifecycle.g0 g0Var = new androidx.lifecycle.g0(l0Var, wVar);
        r.f fVar = l0Var.f1162b;
        r.c cVarA = fVar.a(wVar);
        if (cVarA != null) {
            obj = cVarA.f32476b;
        } else {
            r.c cVar = new r.c(wVar, g0Var);
            fVar.f32485d++;
            r.c cVar2 = fVar.f32483b;
            if (cVar2 == null) {
                fVar.f32482a = cVar;
                fVar.f32483b = cVar;
            } else {
                cVar2.f32477c = cVar;
                cVar.f32478d = cVar2;
                fVar.f32483b = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) obj;
        if (i0Var instanceof androidx.lifecycle.h0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (i0Var == null) {
            g0Var.a(true);
        }
        if (this.f1870n0) {
            return;
        }
        this.f1869m0 = false;
    }

    @Override // b5.z
    public void F(Bundle bundle) {
        super.F(bundle);
        this.Z = new Handler();
        this.f1863g0 = this.f1952z == 0;
        if (bundle != null) {
            this.f1860d0 = bundle.getInt("android:style", 0);
            this.f1861e0 = bundle.getInt("android:theme", 0);
            this.f1862f0 = bundle.getBoolean("android:cancelable", true);
            this.f1863g0 = bundle.getBoolean("android:showsDialog", this.f1863g0);
            this.f1864h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // b5.z
    public void I() {
        this.F = true;
        Dialog dialog = this.f1867k0;
        if (dialog != null) {
            this.f1868l0 = true;
            dialog.setOnDismissListener(null);
            this.f1867k0.dismiss();
            if (!this.f1869m0) {
                onDismiss(this.f1867k0);
            }
            this.f1867k0 = null;
            this.f1871o0 = false;
        }
    }

    @Override // b5.z
    public final void J() {
        this.F = true;
        if (!this.f1870n0 && !this.f1869m0) {
            this.f1869m0 = true;
        }
        this.S.i(this.f1866j0);
    }

    @Override // b5.z
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater layoutInflaterK = super.K(bundle);
        boolean z3 = this.f1863g0;
        if (z3 && !this.f1865i0) {
            if (z3 && !this.f1871o0) {
                try {
                    this.f1865i0 = true;
                    Dialog dialogE0 = e0(bundle);
                    this.f1867k0 = dialogE0;
                    if (this.f1863g0) {
                        g0(dialogE0, this.f1860d0);
                        Context contextP = p();
                        if (a0.g.C(contextP)) {
                            this.f1867k0.setOwnerActivity((Activity) contextP);
                        }
                        this.f1867k0.setCancelable(this.f1862f0);
                        this.f1867k0.setOnCancelListener(this.f1858b0);
                        this.f1867k0.setOnDismissListener(this.f1859c0);
                        this.f1871o0 = true;
                    } else {
                        this.f1867k0 = null;
                    }
                    this.f1865i0 = false;
                } catch (Throwable th2) {
                    this.f1865i0 = false;
                    throw th2;
                }
            }
            if (u0.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f1867k0;
            if (dialog != null) {
                return layoutInflaterK.cloneInContext(dialog.getContext());
            }
        } else if (u0.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f1863g0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterK;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterK;
    }

    @Override // b5.z
    public void O(Bundle bundle) {
        Dialog dialog = this.f1867k0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i4 = this.f1860d0;
        if (i4 != 0) {
            bundle.putInt("android:style", i4);
        }
        int i10 = this.f1861e0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z3 = this.f1862f0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z10 = this.f1863g0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f1864h0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // b5.z
    public void P() {
        this.F = true;
        Dialog dialog = this.f1867k0;
        if (dialog != null) {
            this.f1868l0 = false;
            dialog.show();
            View decorView = this.f1867k0.getWindow().getDecorView();
            androidx.lifecycle.y0.h(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            d5.u(decorView, this);
        }
    }

    @Override // b5.z
    public void Q() {
        this.F = true;
        Dialog dialog = this.f1867k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // b5.z
    public final void S(Bundle bundle) {
        Bundle bundle2;
        this.F = true;
        if (this.f1867k0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1867k0.onRestoreInstanceState(bundle2);
    }

    @Override // b5.z
    public final void T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T(layoutInflater, viewGroup, bundle);
        if (this.H != null || this.f1867k0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1867k0.onRestoreInstanceState(bundle2);
    }

    public void c0() {
        d0(true, false);
    }

    public final void d0(boolean z3, boolean z10) {
        if (this.f1869m0) {
            return;
        }
        this.f1869m0 = true;
        this.f1870n0 = false;
        Dialog dialog = this.f1867k0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1867k0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.Z.getLooper()) {
                    onDismiss(this.f1867k0);
                } else {
                    this.Z.post(this.f1857a0);
                }
            }
        }
        this.f1868l0 = true;
        if (this.f1864h0 >= 0) {
            u0 u0VarS = s();
            int i4 = this.f1864h0;
            if (i4 < 0) {
                throw new IllegalArgumentException(je.u.r(i4, "Bad id: "));
            }
            u0VarS.x(new s0(u0VarS, i4), z3);
            this.f1864h0 = -1;
            return;
        }
        a aVar = new a(s());
        aVar.f1722q = true;
        aVar.j(this);
        if (z3) {
            aVar.f(true, true);
        } else {
            aVar.e();
        }
    }

    public Dialog e0(Bundle bundle) {
        if (u0.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.l(W(), this.f1861e0);
    }

    public final void f0(boolean z3) {
        this.f1862f0 = z3;
        Dialog dialog = this.f1867k0;
        if (dialog != null) {
            dialog.setCancelable(z3);
        }
    }

    public void g0(Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void h0(u0 u0Var, String str) {
        this.f1869m0 = false;
        this.f1870n0 = true;
        u0Var.getClass();
        a aVar = new a(u0Var);
        aVar.f1722q = true;
        aVar.h(0, this, str, 1);
        aVar.e();
    }

    public final void i0(u0 u0Var, String str) {
        this.f1869m0 = false;
        this.f1870n0 = true;
        a aVar = new a(u0Var);
        aVar.f1722q = true;
        aVar.h(0, this, str, 1);
        aVar.g();
    }

    @Override // b5.z
    public final com.bumptech.glide.e k() {
        return new r(this, new v(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1868l0) {
            return;
        }
        if (u0.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        d0(true, true);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
