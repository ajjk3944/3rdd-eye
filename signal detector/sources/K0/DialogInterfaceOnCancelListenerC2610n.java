package k0;

import a.AbstractC0241a;
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
import androidx.lifecycle.C0303z;
import c.DialogC0390o;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import q.C2785c;

/* renamed from: k0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2610n extends AbstractComponentCallbacksC2617v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: k0, reason: collision with root package name */
    public Handler f21646k0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f21655t0;
    public Dialog v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f21657w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f21658x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f21659y0;

    /* renamed from: l0, reason: collision with root package name */
    public final C0.k f21647l0 = new C0.k(25, this);

    /* renamed from: m0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC2606j f21648m0 = new DialogInterfaceOnCancelListenerC2606j(0, this);

    /* renamed from: n0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC2607k f21649n0 = new DialogInterfaceOnDismissListenerC2607k(this);

    /* renamed from: o0, reason: collision with root package name */
    public int f21650o0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    public int f21651p0 = 0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f21652q0 = true;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f21653r0 = true;

    /* renamed from: s0, reason: collision with root package name */
    public int f21654s0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public final C2608l f21656u0 = new C2608l(this);

    /* renamed from: z0, reason: collision with root package name */
    public boolean f21660z0 = false;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void A(Context context) {
        Object obj;
        super.A(context);
        androidx.lifecycle.D d6 = this.f21709d0;
        d6.getClass();
        androidx.lifecycle.C.a("observeForever");
        C2608l c2608l = this.f21656u0;
        C0303z c0303z = new C0303z(d6, c2608l);
        q.f fVar = d6.f5178b;
        C2785c c2785cA = fVar.a(c2608l);
        if (c2785cA != null) {
            obj = c2785cA.f22895b;
        } else {
            C2785c c2785c = new C2785c(c2608l, c0303z);
            fVar.f22904d++;
            C2785c c2785c2 = fVar.f22902b;
            if (c2785c2 == null) {
                fVar.f22901a = c2785c;
                fVar.f22902b = c2785c;
            } else {
                c2785c2.f22896c = c2785c;
                c2785c.f22897d = c2785c2;
                fVar.f22902b = c2785c;
            }
            obj = null;
        }
        androidx.lifecycle.B b5 = (androidx.lifecycle.B) obj;
        if (b5 instanceof androidx.lifecycle.A) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b5 == null) {
            c0303z.c(true);
        }
        if (this.f21659y0) {
            return;
        }
        this.f21658x0 = false;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public void B(Bundle bundle) {
        super.B(bundle);
        this.f21646k0 = new Handler();
        this.f21653r0 = this.f21689L == 0;
        if (bundle != null) {
            this.f21650o0 = bundle.getInt("android:style", 0);
            this.f21651p0 = bundle.getInt("android:theme", 0);
            this.f21652q0 = bundle.getBoolean("android:cancelable", true);
            this.f21653r0 = bundle.getBoolean("android:showsDialog", this.f21653r0);
            this.f21654s0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public void D() {
        this.f21694R = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            this.f21657w0 = true;
            dialog.setOnDismissListener(null);
            this.v0.dismiss();
            if (!this.f21658x0) {
                onDismiss(this.v0);
            }
            this.v0 = null;
            this.f21660z0 = false;
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void E() {
        this.f21694R = true;
        if (!this.f21659y0 && !this.f21658x0) {
            this.f21658x0 = true;
        }
        this.f21709d0.i(this.f21656u0);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final LayoutInflater F(Bundle bundle) {
        LayoutInflater layoutInflaterF = super.F(bundle);
        boolean z6 = this.f21653r0;
        if (z6 && !this.f21655t0) {
            if (z6 && !this.f21660z0) {
                try {
                    this.f21655t0 = true;
                    Dialog dialogB0 = b0(bundle);
                    this.v0 = dialogB0;
                    if (this.f21653r0) {
                        d0(dialogB0, this.f21650o0);
                        Context contextM = m();
                        if (A.f.y(contextM)) {
                            this.v0.setOwnerActivity((Activity) contextM);
                        }
                        this.v0.setCancelable(this.f21652q0);
                        this.v0.setOnCancelListener(this.f21648m0);
                        this.v0.setOnDismissListener(this.f21649n0);
                        this.f21660z0 = true;
                    } else {
                        this.v0 = null;
                    }
                    this.f21655t0 = false;
                } catch (Throwable th) {
                    this.f21655t0 = false;
                    throw th;
                }
            }
            if (K.H(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.v0;
            if (dialog != null) {
                return layoutInflaterF.cloneInContext(dialog.getContext());
            }
        } else if (K.H(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f21653r0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterF;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterF;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public void J(Bundle bundle) {
        Dialog dialog = this.v0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f21650o0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i3 = this.f21651p0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z6 = this.f21652q0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z7 = this.f21653r0;
        if (!z7) {
            bundle.putBoolean("android:showsDialog", z7);
        }
        int i6 = this.f21654s0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public void K() {
        this.f21694R = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            this.f21657w0 = false;
            dialog.show();
            View decorView = this.v0.getWindow().getDecorView();
            androidx.lifecycle.Q.i(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC0241a.o(decorView, this);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public void L() {
        this.f21694R = true;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void N(Bundle bundle) {
        Bundle bundle2;
        this.f21694R = true;
        if (this.v0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.v0.onRestoreInstanceState(bundle2);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.O(layoutInflater, viewGroup, bundle);
        if (this.f21696T != null || this.v0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.v0.onRestoreInstanceState(bundle2);
    }

    public void X() {
        Z(false, false);
    }

    public void Y() {
        Z(true, false);
    }

    public final void Z(boolean z6, boolean z7) {
        if (this.f21658x0) {
            return;
        }
        this.f21658x0 = true;
        this.f21659y0 = false;
        Dialog dialog = this.v0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.v0.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.f21646k0.getLooper()) {
                    onDismiss(this.v0);
                } else {
                    this.f21646k0.post(this.f21647l0);
                }
            }
        }
        this.f21657w0 = true;
        if (this.f21654s0 >= 0) {
            K kP = p();
            int i = this.f21654s0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC1135f5.l(i, "Bad id: "));
            }
            kP.v(new I(kP, null, i), z6);
            this.f21654s0 = -1;
            return;
        }
        C2597a c2597a = new C2597a(p());
        c2597a.f21600p = true;
        c2597a.h(this);
        if (z6) {
            c2597a.d(true);
        } else {
            c2597a.d(false);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final I5.b a() {
        return new C2609m(this, new C2613q(this));
    }

    public int a0() {
        return this.f21651p0;
    }

    public Dialog b0(Bundle bundle) {
        if (K.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0390o(R(), a0());
    }

    public final Dialog c0() {
        Dialog dialog = this.v0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void d0(Dialog dialog, int i) {
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

    public void e0(K k6, String str) {
        this.f21658x0 = false;
        this.f21659y0 = true;
        k6.getClass();
        C2597a c2597a = new C2597a(k6);
        c2597a.f21600p = true;
        c2597a.f(0, this, str, 1);
        c2597a.d(false);
    }

    public final void f0(K k6, String str) {
        this.f21658x0 = false;
        this.f21659y0 = true;
        k6.getClass();
        C2597a c2597a = new C2597a(k6);
        c2597a.f21600p = true;
        c2597a.f(0, this, str, 1);
        c2597a.e();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f21657w0) {
            return;
        }
        if (K.H(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        Z(true, true);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void y() {
        this.f21694R = true;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
