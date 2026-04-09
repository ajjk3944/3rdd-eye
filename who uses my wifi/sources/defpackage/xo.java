package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class xo extends iw implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Z;
    public boolean i0;
    public Dialog k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final a9 a0 = new a9(4, this);
    public final uo b0 = new uo(0, this);
    public final vo c0 = new vo(this);
    public int d0 = 0;
    public int e0 = 0;
    public boolean f0 = true;
    public boolean g0 = true;
    public int h0 = -1;
    public final ug0 j0 = new ug0(4, this);
    public boolean o0 = false;

    @Override // defpackage.iw
    public void A() {
        this.H = true;
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = false;
            dialog.show();
            View decorView = this.k0.getWindow().getDecorView();
            i30.m(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.iw
    public void B() {
        this.H = true;
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.iw
    public final void D(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.k0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.k0.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.iw
    public final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.k0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.k0.onRestoreInstanceState(bundle2);
    }

    public final void N(boolean z, boolean z2) {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        this.n0 = false;
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.k0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.Z.getLooper()) {
                    onDismiss(this.k0);
                } else {
                    this.Z.post(this.a0);
                }
            }
        }
        this.l0 = true;
        if (this.h0 >= 0) {
            xw xwVarK = k();
            int i = this.h0;
            if (i < 0) {
                throw new IllegalArgumentException(ex0.f("Bad id: ", i));
            }
            xwVarK.w(new ww(xwVarK, i), z);
            this.h0 = -1;
            return;
        }
        g9 g9Var = new g9(k());
        g9Var.p = true;
        xw xwVar = this.w;
        if (xwVar != null && xwVar != g9Var.q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        g9Var.b(new ix(3, this));
        if (z) {
            g9Var.d(true);
        } else {
            g9Var.d(false);
        }
    }

    public Dialog O(Bundle bundle) {
        if (xw.F(3)) {
            toString();
        }
        return new eh(G(), this.e0);
    }

    public void P(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void Q(xw xwVar, String str) {
        this.m0 = false;
        this.n0 = true;
        xwVar.getClass();
        g9 g9Var = new g9(xwVar);
        g9Var.p = true;
        g9Var.e(0, this, str, 1);
        g9Var.d(false);
    }

    @Override // defpackage.iw
    public final i30 b() {
        return new wo(this, new gw(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.l0) {
            return;
        }
        if (xw.F(3)) {
            toString();
        }
        N(true, true);
    }

    @Override // defpackage.iw
    public final void r() {
        this.H = true;
    }

    @Override // defpackage.iw
    public final void t(Context context) {
        Object obj;
        super.t(context);
        nf0 nf0Var = this.U;
        nf0Var.getClass();
        nf0.a("observeForever");
        ug0 ug0Var = this.j0;
        t70 t70Var = new t70(nf0Var, ug0Var);
        os0 os0Var = nf0Var.b;
        ls0 ls0VarA = os0Var.a(ug0Var);
        if (ls0VarA != null) {
            obj = ls0VarA.g;
        } else {
            ls0 ls0Var = new ls0(ug0Var, t70Var);
            os0Var.i++;
            ls0 ls0Var2 = os0Var.g;
            if (ls0Var2 == null) {
                os0Var.f = ls0Var;
                os0Var.g = ls0Var;
            } else {
                ls0Var2.h = ls0Var;
                ls0Var.i = ls0Var2;
                os0Var.g = ls0Var;
            }
            obj = null;
        }
        if (((t70) obj) == null) {
            t70Var.a(true);
        }
        if (this.n0) {
            return;
        }
        this.m0 = false;
    }

    @Override // defpackage.iw
    public void u(Bundle bundle) {
        super.u(bundle);
        this.Z = new Handler();
        this.g0 = this.B == 0;
        if (bundle != null) {
            this.d0 = bundle.getInt("android:style", 0);
            this.e0 = bundle.getInt("android:theme", 0);
            this.f0 = bundle.getBoolean("android:cancelable", true);
            this.g0 = bundle.getBoolean("android:showsDialog", this.g0);
            this.h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.iw
    public final void w() {
        this.H = true;
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = true;
            dialog.setOnDismissListener(null);
            this.k0.dismiss();
            if (!this.m0) {
                onDismiss(this.k0);
            }
            this.k0 = null;
            this.o0 = false;
        }
    }

    @Override // defpackage.iw
    public final void x() {
        this.H = true;
        if (!this.n0 && !this.m0) {
            this.m0 = true;
        }
        nf0 nf0Var = this.U;
        nf0Var.getClass();
        nf0.a("removeObserver");
        t70 t70Var = (t70) nf0Var.b.b(this.j0);
        if (t70Var == null) {
            return;
        }
        t70Var.a(false);
    }

    @Override // defpackage.iw
    public final LayoutInflater y(Bundle bundle) {
        LayoutInflater layoutInflaterY = super.y(bundle);
        boolean z = this.g0;
        if (z && !this.i0) {
            if (z && !this.o0) {
                try {
                    this.i0 = true;
                    Dialog dialogO = O(bundle);
                    this.k0 = dialogO;
                    if (this.g0) {
                        P(dialogO, this.d0);
                        Context contextI = i();
                        if (contextI != null) {
                            this.k0.setOwnerActivity((Activity) contextI);
                        }
                        this.k0.setCancelable(this.f0);
                        this.k0.setOnCancelListener(this.b0);
                        this.k0.setOnDismissListener(this.c0);
                        this.o0 = true;
                    } else {
                        this.k0 = null;
                    }
                    this.i0 = false;
                } catch (Throwable th) {
                    this.i0 = false;
                    throw th;
                }
            }
            if (xw.F(2)) {
                toString();
            }
            Dialog dialog = this.k0;
            if (dialog != null) {
                return layoutInflaterY.cloneInContext(dialog.getContext());
            }
        } else if (xw.F(2)) {
            toString();
        }
        return layoutInflaterY;
    }

    @Override // defpackage.iw
    public void z(Bundle bundle) {
        Dialog dialog = this.k0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.d0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.e0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.g0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.h0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
