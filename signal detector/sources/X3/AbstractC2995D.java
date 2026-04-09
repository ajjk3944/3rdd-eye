package x3;

import android.widget.ImageButton;

/* renamed from: x3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2995D extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f24038a;

    public final void a(int i, boolean z6) {
        super.setVisibility(i);
        if (z6) {
            this.f24038a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f24038a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }
}
