package o1;

import H1.p;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class i implements InterfaceC2759g {

    /* renamed from: a, reason: collision with root package name */
    public final C2757e f22689a;

    /* renamed from: b, reason: collision with root package name */
    public int f22690b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f22691c;

    public i(C2757e c2757e) {
        this.f22689a = c2757e;
    }

    @Override // o1.InterfaceC2759g
    public final void a() {
        this.f22689a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f22690b == iVar.f22690b && p.b(this.f22691c, iVar.f22691c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f22690b * 31;
        Bitmap.Config config = this.f22691c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return j.c(this.f22690b, this.f22691c);
    }
}
