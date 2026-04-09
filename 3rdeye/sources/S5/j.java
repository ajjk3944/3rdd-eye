package S5;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import t4.C5606d;

/* compiled from: Balloon.kt */
/* loaded from: classes2.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11984b;

    public j(f fVar) {
        this.f11984b = fVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent event) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(event, "event");
        int action = event.getAction();
        f fVar = this.f11984b;
        if (action == 4) {
            if (fVar.f11918c.f11966z) {
                fVar.d();
                return true;
            }
        } else {
            if (!fVar.f11918c.f11926A || event.getAction() != 1) {
                return false;
            }
            T5.a aVar = fVar.f11919d;
            if (C5606d.x(aVar.f12296g).x <= event.getRawX()) {
                if (aVar.f12296g.getMeasuredWidth() + C5606d.x(aVar.f12296g).x >= event.getRawX()) {
                    return false;
                }
            }
            if (fVar.f11918c.f11966z) {
                fVar.d();
            }
        }
        return true;
    }
}
