package zc;

import android.widget.ImageButton;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class o extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public int f38237a;

    public final void a(int i4, boolean z3) {
        super.setVisibility(i4);
        if (z3) {
            this.f38237a = i4;
        }
    }

    public final int getUserSetVisibility() {
        return this.f38237a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        a(i4, true);
    }
}
