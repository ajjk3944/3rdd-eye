package Zi;

import Xi.n;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Zi.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3715k0 implements Xi.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f25653a;

    /* renamed from: b, reason: collision with root package name */
    private final Xi.f f25654b;

    /* renamed from: c, reason: collision with root package name */
    private final Xi.f f25655c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25656d;

    public /* synthetic */ AbstractC3715k0(String str, Xi.f fVar, Xi.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
    }

    @Override // Xi.f
    public String a() {
        return this.f25653a;
    }

    @Override // Xi.f
    public int d(String name) {
        AbstractC6492s.i(name, "name");
        Integer numQ = kotlin.text.t.q(name);
        if (numQ != null) {
            return numQ.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // Xi.f
    public int e() {
        return this.f25656d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3715k0)) {
            return false;
        }
        AbstractC3715k0 abstractC3715k0 = (AbstractC3715k0) obj;
        return AbstractC6492s.d(a(), abstractC3715k0.a()) && AbstractC6492s.d(this.f25654b, abstractC3715k0.f25654b) && AbstractC6492s.d(this.f25655c, abstractC3715k0.f25655c);
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
        return n.c.f24472a;
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f25654b.hashCode()) * 31) + this.f25655c.hashCode();
    }

    @Override // Xi.f
    public Xi.f i(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f25654b;
            }
            if (i11 == 1) {
                return this.f25655c;
            }
            throw new IllegalStateException("Unreached");
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
        return a() + '(' + this.f25654b + ", " + this.f25655c + ')';
    }

    private AbstractC3715k0(String str, Xi.f fVar, Xi.f fVar2) {
        this.f25653a = str;
        this.f25654b = fVar;
        this.f25655c = fVar2;
        this.f25656d = 2;
    }
}
