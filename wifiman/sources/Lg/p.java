package Lg;

/* loaded from: classes4.dex */
public class p extends Kg.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11788a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11789b;

    /* renamed from: c, reason: collision with root package name */
    private final Kg.d f11790c;

    public p(l lVar, String str, String str2, Kg.d dVar) {
        super(lVar);
        this.f11788a = str;
        this.f11789b = str2;
        this.f11790c = dVar;
    }

    @Override // Kg.c
    public Kg.a c() {
        return (Kg.a) getSource();
    }

    @Override // Kg.c
    public Kg.d d() {
        return this.f11790c;
    }

    @Override // Kg.c
    public String getName() {
        return this.f11789b;
    }

    @Override // Kg.c
    public String h() {
        return this.f11788a;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public p clone() {
        return new p((l) c(), h(), getName(), new q(d()));
    }

    @Override // java.util.EventObject
    public String toString() {
        return '[' + getClass().getSimpleName() + '@' + System.identityHashCode(this) + "\n\tname: '" + getName() + "' type: '" + h() + "' info: '" + d() + "']";
    }
}
