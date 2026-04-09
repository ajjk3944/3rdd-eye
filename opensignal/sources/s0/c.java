package s0;

/* loaded from: classes.dex */
public class c extends mq.e {

    /* renamed from: g, reason: collision with root package name */
    public static final c f21825g = new c(k.f21840e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final k f21826a;

    /* renamed from: d, reason: collision with root package name */
    public final int f21827d;

    public c(k kVar, int i10) {
        this.f21826a = kVar;
        this.f21827d = i10;
    }

    public final c a(Object obj, t0.a aVar) {
        ag.b bVarU = this.f21826a.u(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        return bVarU == null ? this : new c((k) bVarU.f346g, this.f21827d + bVarU.f345d);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f21826a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f21826a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
