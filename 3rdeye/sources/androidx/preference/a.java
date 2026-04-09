package androidx.preference;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k;
import androidx.lifecycle.j0;
import androidx.preference.DialogPreference;

/* compiled from: PreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class a extends DialogInterfaceOnCancelListenerC1758k implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public DialogPreference f16313b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f16314c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f16315d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16316e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16317f;

    /* renamed from: g, reason: collision with root package name */
    public int f16318g;

    /* renamed from: h, reason: collision with root package name */
    public BitmapDrawable f16319h;
    public int i;

    /* compiled from: PreferenceDialogFragmentCompat.java */
    /* renamed from: androidx.preference.a$a, reason: collision with other inner class name */
    public static class C0256a {
        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public final DialogPreference c() {
        if (this.f16313b == null) {
            this.f16313b = (DialogPreference) ((DialogPreference.a) getTargetFragment()).a(requireArguments().getString("key"));
        }
        return this.f16313b;
    }

    public void d(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f16317f;
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

    public abstract void e(boolean z10);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.i = i;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j0 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f16314c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f16315d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f16316e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f16317f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f16318g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f16319h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.a(string);
        this.f16313b = dialogPreference;
        this.f16314c = dialogPreference.f16211N;
        this.f16315d = dialogPreference.f16214Q;
        this.f16316e = dialogPreference.f16215R;
        this.f16317f = dialogPreference.f16212O;
        this.f16318g = dialogPreference.f16216S;
        Drawable drawable = dialogPreference.f16213P;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f16319h = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f16319h = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k
    public final Dialog onCreateDialog(Bundle bundle) {
        this.i = -2;
        d.a aVar = new d.a(requireContext());
        CharSequence charSequence = this.f16314c;
        AlertController.b bVar = aVar.f14344a;
        bVar.f14317d = charSequence;
        bVar.f14316c = this.f16319h;
        aVar.b(this.f16315d, this);
        bVar.i = this.f16316e;
        bVar.f14322j = this;
        requireContext();
        int i = this.f16318g;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            d(viewInflate);
            bVar.f14327o = viewInflate;
        } else {
            bVar.f14319f = this.f16317f;
        }
        f(aVar);
        androidx.appcompat.app.d dVarA = aVar.a();
        if (this instanceof n1.a) {
            Window window = dVarA.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C0256a.a(window);
                return dVarA;
            }
            n1.a aVar2 = (n1.a) this;
            aVar2.f44197m = SystemClock.currentThreadTimeMillis();
            aVar2.g();
        }
        return dVarA;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        e(this.i == -1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f16314c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f16315d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f16316e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f16317f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f16318g);
        BitmapDrawable bitmapDrawable = this.f16319h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void f(d.a aVar) {
    }
}
