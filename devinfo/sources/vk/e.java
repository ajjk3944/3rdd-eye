package vk;

import b7.u;
import e4.d0;
import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends zj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36281a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36282b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f36281a = i4;
        this.f36282b = obj;
    }

    public c a(int i4) {
        Matcher matcher = ((f) this.f36282b).f36283a;
        sk.d dVarE = ci.b.E(matcher.start(i4), matcher.end(i4));
        if (dVarE.f33817a < 0) {
            return null;
        }
        String strGroup = matcher.group(i4);
        nk.k.d(strGroup, "group(...)");
        return new c(strGroup, dVarE);
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f36281a) {
            case 0:
                if (obj == null ? true : obj instanceof c) {
                    return super.contains((c) obj);
                }
                return false;
            default:
                return ((z0.b) this.f36282b).containsValue(obj);
        }
    }

    @Override // zj.a
    public final int getSize() {
        switch (this.f36281a) {
            case 0:
                return ((f) this.f36282b).f36283a.groupCount() + 1;
            default:
                z0.b bVar = (z0.b) this.f36282b;
                bVar.getClass();
                return bVar.f37804b;
        }
    }

    @Override // zj.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f36281a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f36281a) {
            case 0:
                return new d0(new uk.e(new uk.j(3, new sk.d(0, size() - 1, 1)), new u(25, this)));
            default:
                z0.j jVar = ((z0.b) this.f36282b).f37803a;
                z0.k[] kVarArr = new z0.k[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    kVarArr[i4] = new z0.l(2);
                }
                return new z0.i(jVar, kVarArr);
        }
    }
}
