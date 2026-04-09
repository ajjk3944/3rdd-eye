package d0;

import T.C3529g;

/* renamed from: d0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5280l implements InterfaceC5279k {

    /* renamed from: a, reason: collision with root package name */
    private final C3529g f45713a = new C3529g(0);

    public final boolean p(int i10) {
        return (i10 & androidx.compose.runtime.snapshots.e.a(this.f45713a.get())) != 0;
    }

    public final void q(int i10) {
        int iA;
        do {
            iA = androidx.compose.runtime.snapshots.e.a(this.f45713a.get());
            if ((iA & i10) != 0) {
                return;
            }
        } while (!this.f45713a.compareAndSet(iA, androidx.compose.runtime.snapshots.e.a(iA | i10)));
    }
}
