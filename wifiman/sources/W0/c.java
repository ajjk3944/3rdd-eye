package W0;

import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.e1;

/* loaded from: classes.dex */
final class c implements n {

    /* renamed from: b, reason: collision with root package name */
    private final e1 f23480b;

    /* renamed from: c, reason: collision with root package name */
    private final float f23481c;

    public c(e1 e1Var, float f10) {
        this.f23480b = e1Var;
        this.f23481c = f10;
    }

    public final e1 a() {
        return this.f23480b;
    }

    @Override // W0.n
    public float b() {
        return this.f23481c;
    }

    @Override // W0.n
    public long c() {
        return C6733v0.f52951b.e();
    }

    @Override // W0.n
    public AbstractC6713l0 e() {
        return this.f23480b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f23480b, cVar.f23480b) && Float.compare(this.f23481c, cVar.f23481c) == 0;
    }

    public int hashCode() {
        return (this.f23480b.hashCode() * 31) + Float.hashCode(this.f23481c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f23480b + ", alpha=" + this.f23481c + ')';
    }
}
