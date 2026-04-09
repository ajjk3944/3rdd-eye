package q1;

import android.view.KeyEvent;
import br.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f20671a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f20671a, ((b) obj).f20671a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20671a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f20671a + ')';
    }
}
