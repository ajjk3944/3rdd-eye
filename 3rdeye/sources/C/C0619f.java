package C;

import C.AbstractC0633u;

/* compiled from: AutoValue_CameraState_StateError.java */
/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619f extends AbstractC0633u.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f698a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f699b;

    public C0619f(int i, Throwable th) {
        this.f698a = i;
        this.f699b = th;
    }

    @Override // C.AbstractC0633u.a
    public final Throwable a() {
        return this.f699b;
    }

    @Override // C.AbstractC0633u.a
    public final int b() {
        return this.f698a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0633u.a)) {
            return false;
        }
        AbstractC0633u.a aVar = (AbstractC0633u.a) obj;
        if (this.f698a != aVar.b()) {
            return false;
        }
        Throwable th = this.f699b;
        return th == null ? aVar.a() == null : th.equals(aVar.a());
    }

    public final int hashCode() {
        int i = (this.f698a ^ 1000003) * 1000003;
        Throwable th = this.f699b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f698a + ", cause=" + this.f699b + "}";
    }
}
