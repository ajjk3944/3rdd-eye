package Zi;

import Xi.n;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Zi.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3703e0 implements Xi.f {

    /* renamed from: a, reason: collision with root package name */
    private final Xi.f f25622a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25623b;

    public /* synthetic */ AbstractC3703e0(Xi.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        Integer numQ = kotlin.text.t.q(name);
        if (numQ != null) {
            return numQ.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // Xi.f
    public int e() {
        return this.f25623b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3703e0)) {
            return false;
        }
        AbstractC3703e0 abstractC3703e0 = (AbstractC3703e0) obj;
        return AbstractC6492s.d(this.f25622a, abstractC3703e0.f25622a) && AbstractC6492s.d(a(), abstractC3703e0.a());
    }

    @Override // Xi.f
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // Xi.f
    public List g(int i10) {
        if (i10 >= 0) {
            return AbstractC3689v.l();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // Xi.f
    public Xi.m h() {
        return n.b.f24471a;
    }

    public int hashCode() {
        return (this.f25622a.hashCode() * 31) + a().hashCode();
    }

    @Override // Xi.f
    public Xi.f i(int i10) {
        if (i10 >= 0) {
            return this.f25622a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // Xi.f
    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f25622a + ')';
    }

    private AbstractC3703e0(Xi.f fVar) {
        this.f25622a = fVar;
        this.f25623b = 1;
    }
}
