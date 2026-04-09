package androidx.fragment.app;

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
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import c.DialogC4163r;
import q2.AbstractC7419g;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC3994e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: C1, reason: collision with root package name */
    private boolean f31424C1;

    /* renamed from: E1, reason: collision with root package name */
    private Dialog f31426E1;

    /* renamed from: F1, reason: collision with root package name */
    private boolean f31427F1;

    /* renamed from: G1, reason: collision with root package name */
    private boolean f31428G1;

    /* renamed from: H1, reason: collision with root package name */
    private boolean f31429H1;

    /* renamed from: t1, reason: collision with root package name */
    private Handler f31431t1;

    /* renamed from: u1, reason: collision with root package name */
    private Runnable f31432u1 = new a();

    /* renamed from: v1, reason: collision with root package name */
    private DialogInterface.OnCancelListener f31433v1 = new b();

    /* renamed from: w1, reason: collision with root package name */
    private DialogInterface.OnDismissListener f31434w1 = new c();

    /* renamed from: x1, reason: collision with root package name */
    private int f31435x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    private int f31436y1 = 0;

    /* renamed from: z1, reason: collision with root package name */
    private boolean f31437z1 = true;

    /* renamed from: A1, reason: collision with root package name */
    private boolean f31422A1 = true;

    /* renamed from: B1, reason: collision with root package name */
    private int f31423B1 = -1;

    /* renamed from: D1, reason: collision with root package name */
    private androidx.lifecycle.v f31425D1 = new d();

    /* renamed from: I1, reason: collision with root package name */
    private boolean f31430I1 = false;

    /* renamed from: androidx.fragment.app.e$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC3994e.this.f31434w1.onDismiss(DialogInterfaceOnCancelListenerC3994e.this.f31426E1);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC3994e.this.f31426E1 != null) {
                DialogInterfaceOnCancelListenerC3994e dialogInterfaceOnCancelListenerC3994e = DialogInterfaceOnCancelListenerC3994e.this;
                dialogInterfaceOnCancelListenerC3994e.onCancel(dialogInterfaceOnCancelListenerC3994e.f31426E1);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC3994e.this.f31426E1 != null) {
                DialogInterfaceOnCancelListenerC3994e dialogInterfaceOnCancelListenerC3994e = DialogInterfaceOnCancelListenerC3994e.this;
                dialogInterfaceOnCancelListenerC3994e.onDismiss(dialogInterfaceOnCancelListenerC3994e.f31426E1);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    class d implements androidx.lifecycle.v {
        d() {
        }

        @Override // androidx.lifecycle.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC4017o interfaceC4017o) {
            if (interfaceC4017o == null || !DialogInterfaceOnCancelListenerC3994e.this.f31422A1) {
                return;
            }
            View viewQ1 = DialogInterfaceOnCancelListenerC3994e.this.q1();
            if (viewQ1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC3994e.this.f31426E1 != null) {
                if (w.E0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC3994e.this.f31426E1);
                }
                DialogInterfaceOnCancelListenerC3994e.this.f31426E1.setContentView(viewQ1);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C1104e extends AbstractC4001l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4001l f31442a;

        C1104e(AbstractC4001l abstractC4001l) {
            this.f31442a = abstractC4001l;
        }

        @Override // androidx.fragment.app.AbstractC4001l
        public View d(int i10) {
            return this.f31442a.e() ? this.f31442a.d(i10) : DialogInterfaceOnCancelListenerC3994e.this.K1(i10);
        }

        @Override // androidx.fragment.app.AbstractC4001l
        public boolean e() {
            return this.f31442a.e() || DialogInterfaceOnCancelListenerC3994e.this.L1();
        }
    }

    private void G1(boolean z10, boolean z11, boolean z12) {
        if (this.f31428G1) {
            return;
        }
        this.f31428G1 = true;
        this.f31429H1 = false;
        Dialog dialog = this.f31426E1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f31426E1.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f31431t1.getLooper()) {
                    onDismiss(this.f31426E1);
                } else {
                    this.f31431t1.post(this.f31432u1);
                }
            }
        }
        this.f31427F1 = true;
        if (this.f31423B1 >= 0) {
            if (z12) {
                G().Y0(this.f31423B1, 1);
            } else {
                G().W0(this.f31423B1, 1, z10);
            }
            this.f31423B1 = -1;
            return;
        }
        E eM = G().m();
        eM.p(true);
        eM.m(this);
        if (z12) {
            eM.i();
        } else if (z10) {
            eM.h();
        } else {
            eM.g();
        }
    }

    private void M1(Bundle bundle) {
        if (this.f31422A1 && !this.f31430I1) {
            try {
                this.f31424C1 = true;
                Dialog dialogJ1 = J1(bundle);
                this.f31426E1 = dialogJ1;
                if (this.f31422A1) {
                    P1(dialogJ1, this.f31435x1);
                    Context contextS = s();
                    if (contextS instanceof Activity) {
                        this.f31426E1.setOwnerActivity((Activity) contextS);
                    }
                    this.f31426E1.setCancelable(this.f31437z1);
                    this.f31426E1.setOnCancelListener(this.f31433v1);
                    this.f31426E1.setOnDismissListener(this.f31434w1);
                    this.f31430I1 = true;
                } else {
                    this.f31426E1 = null;
                }
                this.f31424C1 = false;
            } catch (Throwable th2) {
                this.f31424C1 = false;
                throw th2;
            }
        }
    }

    public Dialog H1() {
        return this.f31426E1;
    }

    public int I1() {
        return this.f31436y1;
    }

    public Dialog J1(Bundle bundle) {
        if (w.E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC4163r(p1(), I1());
    }

    @Override // androidx.fragment.app.Fragment
    public void K0(Bundle bundle) {
        super.K0(bundle);
        Dialog dialog = this.f31426E1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f31435x1;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f31436y1;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f31437z1;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f31422A1;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f31423B1;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    View K1(int i10) {
        Dialog dialog = this.f31426E1;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void L0() {
        super.L0();
        Dialog dialog = this.f31426E1;
        if (dialog != null) {
            this.f31427F1 = false;
            dialog.show();
            View decorView = this.f31426E1.getWindow().getDecorView();
            T.b(decorView, this);
            U.b(decorView, this);
            AbstractC7419g.b(decorView, this);
        }
    }

    boolean L1() {
        return this.f31430I1;
    }

    @Override // androidx.fragment.app.Fragment
    public void M0() {
        super.M0();
        Dialog dialog = this.f31426E1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog N1() {
        Dialog dialogH1 = H1();
        if (dialogH1 != null) {
            return dialogH1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.Fragment
    public void O0(Bundle bundle) {
        Bundle bundle2;
        super.O0(bundle);
        if (this.f31426E1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f31426E1.onRestoreInstanceState(bundle2);
    }

    public void O1(boolean z10) {
        this.f31422A1 = z10;
    }

    public void P1(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void Q1(w wVar, String str) {
        this.f31428G1 = false;
        this.f31429H1 = true;
        E eM = wVar.m();
        eM.p(true);
        eM.e(this, str);
        eM.g();
    }

    @Override // androidx.fragment.app.Fragment
    void V0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.V0(layoutInflater, viewGroup, bundle);
        if (this.f31230I != null || this.f31426E1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f31426E1.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    AbstractC4001l f() {
        return new C1104e(super.f());
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Context context) {
        super.l0(context);
        W().i(this.f31425D1);
        if (this.f31429H1) {
            return;
        }
        this.f31428G1 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void o0(Bundle bundle) {
        super.o0(bundle);
        this.f31431t1 = new Handler();
        this.f31422A1 = this.f31273y == 0;
        if (bundle != null) {
            this.f31435x1 = bundle.getInt("android:style", 0);
            this.f31436y1 = bundle.getInt("android:theme", 0);
            this.f31437z1 = bundle.getBoolean("android:cancelable", true);
            this.f31422A1 = bundle.getBoolean("android:showsDialog", this.f31422A1);
            this.f31423B1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f31427F1) {
            return;
        }
        if (w.E0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        G1(true, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void v0() {
        super.v0();
        Dialog dialog = this.f31426E1;
        if (dialog != null) {
            this.f31427F1 = true;
            dialog.setOnDismissListener(null);
            this.f31426E1.dismiss();
            if (!this.f31428G1) {
                onDismiss(this.f31426E1);
            }
            this.f31426E1 = null;
            this.f31430I1 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void w0() {
        super.w0();
        if (!this.f31429H1 && !this.f31428G1) {
            this.f31428G1 = true;
        }
        W().m(this.f31425D1);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater x0(Bundle bundle) {
        LayoutInflater layoutInflaterX0 = super.x0(bundle);
        if (this.f31422A1 && !this.f31424C1) {
            M1(bundle);
            if (w.E0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f31426E1;
            return dialog != null ? layoutInflaterX0.cloneInContext(dialog.getContext()) : layoutInflaterX0;
        }
        if (w.E0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f31422A1) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterX0;
    }
}
