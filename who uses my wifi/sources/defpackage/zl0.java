package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zl0 extends xo implements DialogInterface.OnClickListener {
    public DialogPreference p0;
    public CharSequence q0;
    public CharSequence r0;
    public CharSequence s0;
    public CharSequence t0;
    public int u0;
    public BitmapDrawable v0;
    public int w0;

    @Override // defpackage.xo
    public final Dialog O(Bundle bundle) {
        this.w0 = -2;
        t3 t3Var = new t3(G());
        CharSequence charSequence = this.q0;
        p3 p3Var = (p3) t3Var.h;
        p3Var.d = charSequence;
        p3Var.c = this.v0;
        t3Var.g(this.r0, this);
        p3Var.i = this.s0;
        p3Var.j = this;
        G();
        int i = this.u0;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterY = this.O;
            if (layoutInflaterY == null) {
                layoutInflaterY = y(null);
                this.O = layoutInflaterY;
            }
            viewInflate = layoutInflaterY.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            S(viewInflate);
            p3Var.o = viewInflate;
        } else {
            p3Var.f = this.t0;
        }
        U(t3Var);
        u3 u3VarB = t3Var.b();
        if (this instanceof hr) {
            Window window = u3VarB.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                yl0.a(window);
                return u3VarB;
            }
            hr hrVar = (hr) this;
            hrVar.A0 = SystemClock.currentThreadTimeMillis();
            hrVar.V();
        }
        return u3VarB;
    }

    public final DialogPreference R() {
        if (this.p0 == null) {
            Bundle bundle = this.k;
            if (bundle == null) {
                throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
            }
            this.p0 = (DialogPreference) ((bm0) m(true)).N(bundle.getString("key"));
        }
        return this.p0;
    }

    public void S(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.t0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void T(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.w0 = i;
    }

    @Override // defpackage.xo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        T(this.w0 == -1);
    }

    @Override // defpackage.xo, defpackage.iw
    public void u(Bundle bundle) {
        super.u(bundle);
        iw iwVarM = m(true);
        if (!(iwVarM instanceof bm0)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        bm0 bm0Var = (bm0) iwVarM;
        Bundle bundle2 = this.k;
        if (bundle2 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        String string = bundle2.getString("key");
        if (bundle != null) {
            this.q0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.r0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.s0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.t0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.u0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.v0 = new BitmapDrawable(l(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) bm0Var.N(string);
        this.p0 = dialogPreference;
        this.q0 = dialogPreference.S;
        this.r0 = dialogPreference.V;
        this.s0 = dialogPreference.W;
        this.t0 = dialogPreference.T;
        this.u0 = dialogPreference.X;
        Drawable drawable = dialogPreference.U;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.v0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.v0 = new BitmapDrawable(l(), bitmapCreateBitmap);
    }

    @Override // defpackage.xo, defpackage.iw
    public void z(Bundle bundle) {
        super.z(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.q0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.r0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.s0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.t0);
        bundle.putInt("PreferenceDialogFragment.layout", this.u0);
        BitmapDrawable bitmapDrawable = this.v0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void U(t3 t3Var) {
    }
}
