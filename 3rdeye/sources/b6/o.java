package B6;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes.dex */
public final class o implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final C6.k f560b;

    /* renamed from: c, reason: collision with root package name */
    public final View f561c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f562d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f563e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f564f = new Rect();

    public o(C6.k kVar, View view, boolean z10, boolean z11) {
        this.f560b = kVar;
        this.f561c = view;
        this.f562d = z10;
        this.f563e = z11;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(event, "event");
        View view2 = this.f561c;
        Rect rect = this.f564f;
        view2.getHitRect(rect);
        if (rect.contains((int) event.getX(), (int) event.getY())) {
            return false;
        }
        if (this.f563e) {
            this.f560b.dismiss();
        }
        return this.f562d;
    }
}
