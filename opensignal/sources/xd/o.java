package xd;

import android.widget.ImageButton;

/* loaded from: classes.dex */
public abstract class o extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f25298a;

    public final void a(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f25298a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f25298a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }
}
