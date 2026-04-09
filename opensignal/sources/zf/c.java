package zf;

import ag.g;
import java.util.Date;
import java.util.HashMap;
import xf.f;

/* loaded from: classes.dex */
public final class c implements yf.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f27368f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f27369g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27371a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f27372b;

    /* renamed from: c, reason: collision with root package name */
    public final g f27373c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27374d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f27367e = new g(2);

    /* renamed from: h, reason: collision with root package name */
    public static final b f27370h = new b();

    /* JADX WARN: Type inference failed for: r0v1, types: [zf.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zf.a] */
    static {
        final int i10 = 0;
        f27368f = new f() { // from class: zf.a
            @Override // xf.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((xf.g) obj2).f((String) obj);
                        break;
                    default:
                        ((xf.g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f27369g = new f() { // from class: zf.a
            @Override // xf.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((xf.g) obj2).f((String) obj);
                        break;
                    default:
                        ((xf.g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public c() {
        HashMap map = new HashMap();
        this.f27371a = map;
        HashMap map2 = new HashMap();
        this.f27372b = map2;
        this.f27373c = f27367e;
        this.f27374d = false;
        map2.put(String.class, f27368f);
        map.remove(String.class);
        map2.put(Boolean.class, f27369g);
        map.remove(Boolean.class);
        map2.put(Date.class, f27370h);
        map.remove(Date.class);
    }

    public final yf.a a(Class cls, xf.d dVar) {
        this.f27371a.put(cls, dVar);
        this.f27372b.remove(cls);
        return this;
    }
}
