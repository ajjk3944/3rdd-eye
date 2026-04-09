package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n.AbstractC5342d;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final f f14487b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14488c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14489d;

    /* renamed from: e, reason: collision with root package name */
    public View f14490e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14492g;

    /* renamed from: h, reason: collision with root package name */
    public j.a f14493h;
    public AbstractC5342d i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14494j;

    /* renamed from: f, reason: collision with root package name */
    public int f14491f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final a f14495k = new a();

    /* compiled from: MenuPopupHelper.java */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(int i, Context context, View view, f fVar, boolean z10) {
        this.f14486a = context;
        this.f14487b = fVar;
        this.f14490e = view;
        this.f14488c = z10;
        this.f14489d = i;
    }

    public final AbstractC5342d a() {
        AbstractC5342d lVar;
        if (this.i == null) {
            Context context = this.f14486a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new b(context, this.f14490e, this.f14489d, this.f14488c);
            } else {
                View view = this.f14490e;
                Context context2 = this.f14486a;
                boolean z10 = this.f14488c;
                lVar = new l(this.f14489d, context2, view, this.f14487b, z10);
            }
            lVar.k(this.f14487b);
            lVar.q(this.f14495k);
            lVar.m(this.f14490e);
            lVar.d(this.f14493h);
            lVar.n(this.f14492g);
            lVar.o(this.f14491f);
            this.i = lVar;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC5342d abstractC5342d = this.i;
        return abstractC5342d != null && abstractC5342d.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f14494j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d() {
        if (b()) {
            return;
        }
        if (this.f14490e == null) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        e(0, 0, false, false);
    }

    public final void e(int i, int i10, boolean z10, boolean z11) {
        AbstractC5342d abstractC5342dA = a();
        abstractC5342dA.r(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f14491f, this.f14490e.getLayoutDirection()) & 7) == 5) {
                i -= this.f14490e.getWidth();
            }
            abstractC5342dA.p(i);
            abstractC5342dA.s(i10);
            int i11 = (int) ((this.f14486a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC5342dA.f44187b = new Rect(i - i11, i10 - i11, i + i11, i10 + i11);
        }
        abstractC5342dA.show();
    }
}
