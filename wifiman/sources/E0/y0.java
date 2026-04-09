package E0;

import androidx.compose.ui.e;

/* loaded from: classes.dex */
public final class y0 extends e.c {

    /* renamed from: n, reason: collision with root package name */
    private boolean f4001n;

    public y0() {
        t2(0);
    }

    public final boolean D2() {
        return this.f4001n;
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        this.f4001n = true;
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f4001n = false;
    }

    public String toString() {
        return "<tail>";
    }
}
