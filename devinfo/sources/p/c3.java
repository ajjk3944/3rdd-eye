package p;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c3 extends w4.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f30676a;

    public c3(SwitchCompat switchCompat) {
        this.f30676a = new WeakReference(switchCompat);
    }

    @Override // w4.g
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f30676a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // w4.g
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f30676a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
