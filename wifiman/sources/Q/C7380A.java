package q;

import Zg.U;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7380A {

    /* renamed from: a, reason: collision with root package name */
    private final C7394m f58197a;

    /* renamed from: b, reason: collision with root package name */
    private final C7404w f58198b;

    /* renamed from: c, reason: collision with root package name */
    private final C7388g f58199c;

    /* renamed from: d, reason: collision with root package name */
    private final C7401t f58200d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f58201e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f58202f;

    public C7380A(C7394m c7394m, C7404w c7404w, C7388g c7388g, C7401t c7401t, boolean z10, Map map) {
        this.f58197a = c7394m;
        this.f58198b = c7404w;
        this.f58199c = c7388g;
        this.f58200d = c7401t;
        this.f58201e = z10;
        this.f58202f = map;
    }

    public final C7388g a() {
        return this.f58199c;
    }

    public final Map b() {
        return this.f58202f;
    }

    public final C7394m c() {
        return this.f58197a;
    }

    public final boolean d() {
        return this.f58201e;
    }

    public final C7401t e() {
        return this.f58200d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7380A)) {
            return false;
        }
        C7380A c7380a = (C7380A) obj;
        return AbstractC6492s.d(this.f58197a, c7380a.f58197a) && AbstractC6492s.d(this.f58198b, c7380a.f58198b) && AbstractC6492s.d(this.f58199c, c7380a.f58199c) && AbstractC6492s.d(this.f58200d, c7380a.f58200d) && this.f58201e == c7380a.f58201e && AbstractC6492s.d(this.f58202f, c7380a.f58202f);
    }

    public final C7404w f() {
        return this.f58198b;
    }

    public int hashCode() {
        C7394m c7394m = this.f58197a;
        int iHashCode = (c7394m == null ? 0 : c7394m.hashCode()) * 31;
        C7404w c7404w = this.f58198b;
        int iHashCode2 = (iHashCode + (c7404w == null ? 0 : c7404w.hashCode())) * 31;
        C7388g c7388g = this.f58199c;
        int iHashCode3 = (iHashCode2 + (c7388g == null ? 0 : c7388g.hashCode())) * 31;
        C7401t c7401t = this.f58200d;
        return ((((iHashCode3 + (c7401t != null ? c7401t.hashCode() : 0)) * 31) + Boolean.hashCode(this.f58201e)) * 31) + this.f58202f.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.f58197a + ", slide=" + this.f58198b + ", changeSize=" + this.f58199c + ", scale=" + this.f58200d + ", hold=" + this.f58201e + ", effectsMap=" + this.f58202f + ')';
    }

    public /* synthetic */ C7380A(C7394m c7394m, C7404w c7404w, C7388g c7388g, C7401t c7401t, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : c7394m, (i10 & 2) != 0 ? null : c7404w, (i10 & 4) != 0 ? null : c7388g, (i10 & 8) == 0 ? c7401t : null, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? U.h() : map);
    }
}
