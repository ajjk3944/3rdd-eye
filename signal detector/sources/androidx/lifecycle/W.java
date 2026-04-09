package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5225a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5226b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5227c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5228d;

    public W(C0300w c0300w, EnumC0291m enumC0291m) {
        q5.i.e(c0300w, "registry");
        q5.i.e(enumC0291m, "event");
        this.f5227c = c0300w;
        this.f5228d = enumC0291m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A0.e eVar;
        switch (this.f5225a) {
            case 0:
                if (!this.f5226b) {
                    ((C0300w) this.f5227c).d((EnumC0291m) this.f5228d);
                    this.f5226b = true;
                    break;
                }
                break;
            default:
                View view = (View) this.f5227c;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f5228d;
                X.f fVar = swipeDismissBehavior.f18106a;
                if (fVar != null && fVar.g()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.f5226b && (eVar = swipeDismissBehavior.f18107b) != null) {
                    eVar.q(view);
                    break;
                }
                break;
        }
    }

    public W(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z6) {
        this.f5228d = swipeDismissBehavior;
        this.f5227c = view;
        this.f5226b = z6;
    }
}
