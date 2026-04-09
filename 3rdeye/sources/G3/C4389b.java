package g3;

import L2.f;
import java.security.MessageDigest;
import t4.C5606d;

/* compiled from: ObjectKey.java */
/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4389b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f37951b;

    public C4389b(Object obj) {
        C5606d.l(obj, "Argument must not be null");
        this.f37951b = obj;
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f37951b.toString().getBytes(f.f4027a));
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (obj instanceof C4389b) {
            return this.f37951b.equals(((C4389b) obj).f37951b);
        }
        return false;
    }

    @Override // L2.f
    public final int hashCode() {
        return this.f37951b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f37951b + '}';
    }
}
