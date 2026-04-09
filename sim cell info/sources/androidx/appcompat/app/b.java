package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class b extends b.b {

    /* renamed from: d, reason: collision with root package name */
    final AlertController f366d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f367a;

        /* renamed from: b, reason: collision with root package name */
        private final int f368b;

        public a(Context context) {
            this(context, b.i(context, 0));
        }

        public a(Context context, int i2) {
            this.f367a = new AlertController.f(new ContextThemeWrapper(context, b.i(context, i2)));
            this.f368b = i2;
        }

        public b a() {
            b bVar = new b(this.f367a.f317a, this.f368b);
            this.f367a.a(bVar.f366d);
            bVar.setCancelable(this.f367a.f334r);
            if (this.f367a.f334r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f367a.f335s);
            bVar.setOnDismissListener(this.f367a.f336t);
            DialogInterface.OnKeyListener onKeyListener = this.f367a.f337u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f367a.f317a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f367a;
            fVar.f339w = listAdapter;
            fVar.f340x = onClickListener;
            return this;
        }

        public a d(boolean z2) {
            this.f367a.f334r = z2;
            return this;
        }

        public a e(View view) {
            this.f367a.f323g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f367a.f320d = drawable;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f367a.f324h = charSequence;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f367a;
            fVar.f328l = charSequence;
            fVar.f330n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f367a.f337u = onKeyListener;
            return this;
        }

        public a j(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f367a;
            fVar.f339w = listAdapter;
            fVar.f340x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a k(CharSequence charSequence) {
            this.f367a.f322f = charSequence;
            return this;
        }
    }

    protected b(Context context, int i2) {
        super(context, i(context, i2));
        this.f366d = new AlertController(getContext(), this, getWindow());
    }

    static int i(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.f14o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f366d.d();
    }

    @Override // b.b, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f366d.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f366d.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f366d.h(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // b.b, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f366d.q(charSequence);
    }
}
