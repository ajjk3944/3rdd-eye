package j8;

import android.graphics.Bitmap;
import br.l;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f13412a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13413b;

    public a(Bitmap bitmap, Map map) {
        this.f13412a = bitmap;
        this.f13413b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f13412a, aVar.f13412a) && l.a(this.f13413b, aVar.f13413b);
    }

    public final int hashCode() {
        return this.f13413b.hashCode() + (this.f13412a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f13412a + ", extras=" + this.f13413b + ')';
    }
}
