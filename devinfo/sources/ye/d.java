package ye;

import java.util.Date;
import java.util.HashMap;
import we.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements xe.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f37575f;
    public static final b g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f37577a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f37578b;

    /* renamed from: c, reason: collision with root package name */
    public final a f37579c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37580d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f37574e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f37576h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [ye.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ye.b] */
    static {
        final int i4 = 0;
        f37575f = new we.f() { // from class: ye.b
            @Override // we.a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        break;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        g = new we.f() { // from class: ye.b
            @Override // we.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        break;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f37577a = map;
        HashMap map2 = new HashMap();
        this.f37578b = map2;
        this.f37579c = f37574e;
        this.f37580d = false;
        map2.put(String.class, f37575f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, f37576h);
        map.remove(Date.class);
    }

    public final xe.a a(Class cls, we.d dVar) {
        this.f37577a.put(cls, dVar);
        this.f37578b.remove(cls);
        return this;
    }
}
