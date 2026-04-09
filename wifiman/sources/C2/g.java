package C2;

import java.security.MessageDigest;
import o.C7010a;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    private final C7010a f2198b = new W2.b();

    private static void f(f fVar, Object obj, MessageDigest messageDigest) {
        fVar.g(obj, messageDigest);
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f2198b.size(); i10++) {
            f((f) this.f2198b.h(i10), this.f2198b.l(i10), messageDigest);
        }
    }

    public Object c(f fVar) {
        return this.f2198b.containsKey(fVar) ? this.f2198b.get(fVar) : fVar.c();
    }

    public void d(g gVar) {
        this.f2198b.i(gVar.f2198b);
    }

    public g e(f fVar, Object obj) {
        this.f2198b.put(fVar, obj);
        return this;
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2198b.equals(((g) obj).f2198b);
        }
        return false;
    }

    @Override // C2.e
    public int hashCode() {
        return this.f2198b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f2198b + '}';
    }
}
