package ni;

import android.widget.FrameLayout;
import ig.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a extends FrameLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29946a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29947b;

    /* renamed from: c, reason: collision with root package name */
    public mi.b f29948c;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f29946a;
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setChecked(boolean z3) {
        if (this.f29946a != z3) {
            this.f29946a = z3;
            if (this.f29947b) {
                return;
            }
            post(new l(11, this));
        }
    }

    public void setOnCheckedChangeListener(mi.b bVar) {
        this.f29948c = bVar;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.f29946a) {
            return;
        }
        setChecked(true);
    }
}
