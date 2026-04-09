package p;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g2 extends j4.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f20062a;

    public g2(SwitchCompat switchCompat) {
        this.f20062a = new WeakReference(switchCompat);
    }

    @Override // j4.f
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f20062a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // j4.f
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f20062a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
