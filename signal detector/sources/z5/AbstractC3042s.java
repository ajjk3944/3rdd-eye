package z5;

import h5.AbstractC2367a;
import h5.C2371e;
import h5.InterfaceC2372f;
import h5.InterfaceC2373g;
import h5.InterfaceC2374h;
import h5.InterfaceC2375i;

/* renamed from: z5.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3042s extends AbstractC2367a implements InterfaceC2372f {

    /* renamed from: b, reason: collision with root package name */
    public static final r f24553b = new r(C2371e.f20485a, C3041q.f24550b);

    public AbstractC3042s() {
        super(C2371e.f20485a);
    }

    public abstract void d(InterfaceC2375i interfaceC2375i, Runnable runnable);

    public boolean e() {
        return !(this instanceof k0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [p5.l, q5.j] */
    @Override // h5.AbstractC2367a, h5.InterfaceC2375i
    public final InterfaceC2373g h(InterfaceC2374h interfaceC2374h) {
        InterfaceC2373g interfaceC2373g;
        q5.i.e(interfaceC2374h, "key");
        if (!(interfaceC2374h instanceof r)) {
            if (C2371e.f20485a == interfaceC2374h) {
                return this;
            }
            return null;
        }
        r rVar = (r) interfaceC2374h;
        InterfaceC2374h interfaceC2374h2 = this.f20481a;
        if ((interfaceC2374h2 == rVar || rVar.f24552b == interfaceC2374h2) && (interfaceC2373g = (InterfaceC2373g) rVar.f24551a.f(this)) != null) {
            return interfaceC2373g;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((h5.InterfaceC2373g) r3.f24551a.f(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (h5.C2371e.f20485a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return h5.C2376j.f20486a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [p5.l, q5.j] */
    @Override // h5.AbstractC2367a, h5.InterfaceC2375i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h5.InterfaceC2375i n(h5.InterfaceC2374h r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            q5.i.e(r3, r0)
            boolean r0 = r3 instanceof z5.r
            if (r0 == 0) goto L20
            z5.r r3 = (z5.r) r3
            h5.h r0 = r2.f20481a
            if (r0 == r3) goto L15
            h5.h r1 = r3.f24552b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            q5.j r3 = r3.f24551a
            java.lang.Object r3 = r3.f(r2)
            h5.g r3 = (h5.InterfaceC2373g) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            h5.e r0 = h5.C2371e.f20485a
            if (r0 != r3) goto L27
        L24:
            h5.j r3 = h5.C2376j.f20486a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.AbstractC3042s.n(h5.h):h5.i");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC3046w.h(this);
    }
}
