package Vf;

import Li.P;
import Li.z;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f23390d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final h f23391a;

    /* renamed from: b, reason: collision with root package name */
    private final d f23392b;

    /* renamed from: c, reason: collision with root package name */
    private final z f23393c;

    public b(h theme, d effect, C6533i c6533i) {
        AbstractC6492s.i(theme, "theme");
        AbstractC6492s.i(effect, "effect");
        this.f23391a = theme;
        this.f23392b = effect;
        this.f23393c = P.a(c6533i);
    }

    public final z a() {
        return this.f23393c;
    }

    public final d b() {
        return this.f23392b;
    }

    public final h c() {
        return this.f23391a;
    }

    public final void d(C6533i c6533i) {
        this.f23393c.setValue(c6533i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f23391a, bVar.f23391a) && AbstractC6492s.d(this.f23392b, bVar.f23392b);
    }

    public int hashCode() {
        return (this.f23391a.hashCode() * 31) + this.f23392b.hashCode();
    }
}
