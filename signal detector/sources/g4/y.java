package g4;

import java.io.IOException;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f20248a;

    public y(z zVar) {
        this.f20248a = zVar;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) {
        if (c2762a.B() != 9) {
            return this.f20248a.b(c2762a);
        }
        c2762a.x();
        return null;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        if (obj == null) {
            c2764c.o();
        } else {
            this.f20248a.c(c2764c, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f20248a + "]";
    }
}
