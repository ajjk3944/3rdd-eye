package z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b extends zj.f {

    /* renamed from: c, reason: collision with root package name */
    public static final b f37802c = new b(j.f37821e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final j f37803a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37804b;

    public b(j jVar, int i4) {
        this.f37803a = jVar;
        this.f37804b = i4;
    }

    public d a() {
        return new d(this);
    }

    public final b b(Object obj, a1.a aVar) {
        t7.m mVarU = this.f37803a.u(obj, obj != null ? obj.hashCode() : 0, aVar, 0);
        return mVarU == null ? this : new b((j) mVarU.f34474c, this.f37804b + mVarU.f34473b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f37803a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f37803a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
