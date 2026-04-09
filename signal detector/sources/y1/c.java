package y1;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import l1.l;
import n1.z;
import u1.C2949d;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f24222b;

    public c(l lVar) {
        H1.g.c(lVar, "Argument must not be null");
        this.f24222b = lVar;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        this.f24222b.a(messageDigest);
    }

    @Override // l1.l
    public final z b(Context context, z zVar, int i, int i3) {
        b bVar = (b) zVar.get();
        z c2949d = new C2949d(((f) bVar.f24213a.f2634b).f24240l, com.bumptech.glide.b.a(context).f6484a);
        l lVar = this.f24222b;
        z zVarB = lVar.b(context, c2949d, i, i3);
        if (!c2949d.equals(zVarB)) {
            c2949d.b();
        }
        ((f) bVar.f24213a.f2634b).c(lVar, (Bitmap) zVarB.get());
        return zVar;
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f24222b.equals(((c) obj).f24222b);
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return this.f24222b.hashCode();
    }
}
