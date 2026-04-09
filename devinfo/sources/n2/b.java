package n2;

import android.content.res.Resources;
import com.liuzh.deviceinfo.R;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f29563a;

    public b(Resources.Theme theme) {
        this.f29563a = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.a(this.f29563a, ((b) obj).f29563a);
    }

    public final int hashCode() {
        return (this.f29563a.hashCode() * 31) + R.drawable.ic_move;
    }

    public final String toString() {
        return "Key(theme=" + this.f29563a + ", id=2131231236)";
    }
}
