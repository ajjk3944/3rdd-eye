package u1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import o1.InterfaceC2753a;

/* loaded from: classes.dex */
public final class s implements l1.l {

    /* renamed from: b, reason: collision with root package name */
    public final l1.l f23766b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23767c;

    public s(l1.l lVar, boolean z6) {
        this.f23766b = lVar;
        this.f23767c = z6;
    }

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        this.f23766b.a(messageDigest);
    }

    @Override // l1.l
    public final n1.z b(Context context, n1.z zVar, int i, int i3) {
        InterfaceC2753a interfaceC2753a = com.bumptech.glide.b.a(context).f6484a;
        Drawable drawable = (Drawable) zVar.get();
        C2949d c2949dB = r.b(interfaceC2753a, drawable, i, i3);
        if (c2949dB != null) {
            n1.z zVarB = this.f23766b.b(context, c2949dB, i, i3);
            if (!zVarB.equals(c2949dB)) {
                return new C2949d(context.getResources(), zVarB);
            }
            zVarB.b();
            return zVar;
        }
        if (!this.f23767c) {
            return zVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f23766b.equals(((s) obj).f23766b);
        }
        return false;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return this.f23766b.hashCode();
    }
}
