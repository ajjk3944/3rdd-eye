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
import h.AbstractC5927a;

/* loaded from: classes.dex */
public class b extends p implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    final AlertController f26485f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f26486a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26487b;

        public a(Context context) {
            this(context, b.n(context, 0));
        }

        public b a() {
            b bVar = new b(this.f26486a.f26445a, this.f26487b);
            this.f26486a.a(bVar.f26485f);
            bVar.setCancelable(this.f26486a.f26462r);
            if (this.f26486a.f26462r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f26486a.f26463s);
            bVar.setOnDismissListener(this.f26486a.f26464t);
            DialogInterface.OnKeyListener onKeyListener = this.f26486a.f26465u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f26486a.f26445a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f26486a;
            bVar.f26467w = listAdapter;
            bVar.f26468x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f26486a.f26451g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f26486a.f26448d = drawable;
            return this;
        }

        public a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f26486a.f26465u = onKeyListener;
            return this;
        }

        public a g(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f26486a;
            bVar.f26467w = listAdapter;
            bVar.f26468x = onClickListener;
            bVar.f26438I = i10;
            bVar.f26437H = true;
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f26486a.f26450f = charSequence;
            return this;
        }

        public a(Context context, int i10) {
            this.f26486a = new AlertController.b(new ContextThemeWrapper(context, b.n(context, i10)));
            this.f26487b = i10;
        }
    }

    protected b(Context context, int i10) {
        super(context, n(context, i10));
        this.f26485f = new AlertController(getContext(), this, getWindow());
    }

    static int n(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5927a.f47949l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView m() {
        return this.f26485f.d();
    }

    @Override // androidx.appcompat.app.p, c.DialogC4163r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26485f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f26485f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f26485f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.p, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f26485f.p(charSequence);
    }
}
