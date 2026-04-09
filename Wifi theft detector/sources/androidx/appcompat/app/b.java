package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class b extends u implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final AlertController f529f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f530a;

        /* renamed from: b, reason: collision with root package name */
        public final int f531b;

        public a(@NonNull Context context) {
            this(context, b.l(context, 0));
        }

        public b a() {
            b bVar = new b(this.f530a.f366a, this.f531b);
            this.f530a.a(bVar.f529f);
            bVar.setCancelable(this.f530a.f383r);
            if (this.f530a.f383r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f530a.f384s);
            bVar.setOnDismissListener(this.f530a.f385t);
            DialogInterface.OnKeyListener onKeyListener = this.f530a.f386u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f530a.f366a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f388w = listAdapter;
            bVar.f389x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f530a.f383r = z10;
            return this;
        }

        public a e(View view) {
            this.f530a.f372g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f530a.f369d = drawable;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f530a.f373h = charSequence;
            return this;
        }

        public a h(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f377l = bVar.f366a.getText(i10);
            this.f530a.f379n = onClickListener;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f377l = charSequence;
            bVar.f379n = onClickListener;
            return this;
        }

        public a j(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f380o = bVar.f366a.getText(i10);
            this.f530a.f382q = onClickListener;
            return this;
        }

        public a k(DialogInterface.OnKeyListener onKeyListener) {
            this.f530a.f386u = onKeyListener;
            return this;
        }

        public a l(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f374i = bVar.f366a.getText(i10);
            this.f530a.f376k = onClickListener;
            return this;
        }

        public a m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f374i = charSequence;
            bVar.f376k = onClickListener;
            return this;
        }

        public a n(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f530a;
            bVar.f388w = listAdapter;
            bVar.f389x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a o(int i10) {
            AlertController.b bVar = this.f530a;
            bVar.f371f = bVar.f366a.getText(i10);
            return this;
        }

        public a p(CharSequence charSequence) {
            this.f530a.f371f = charSequence;
            return this;
        }

        public a q(View view) {
            AlertController.b bVar = this.f530a;
            bVar.f391z = view;
            bVar.f390y = 0;
            bVar.E = false;
            return this;
        }

        public b r() {
            b bVarA = a();
            bVarA.show();
            return bVarA;
        }

        public a(Context context, int i10) {
            this.f530a = new AlertController.b(new ContextThemeWrapper(context, b.l(context, i10)));
            this.f531b = i10;
        }
    }

    public b(Context context, int i10) {
        super(context, l(context, i10));
        this.f529f = new AlertController(getContext(), this, getWindow());
    }

    public static int l(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i10) {
        return this.f529f.c(i10);
    }

    public ListView j() {
        return this.f529f.e();
    }

    @Override // androidx.appcompat.app.u, androidx.activity.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f529f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f529f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f529f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.u, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f529f.q(charSequence);
    }
}
