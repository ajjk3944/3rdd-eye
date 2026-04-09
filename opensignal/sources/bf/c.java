package bf;

import com.google.android.gms.internal.measurement.b4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2703a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2704b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2705c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2707e;

    /* renamed from: f, reason: collision with root package name */
    public final f f2708f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2709g;

    public c(String str, Set set, Set set2, int i10, int i11, f fVar, Set set3) {
        this.f2703a = str;
        this.f2704b = Collections.unmodifiableSet(set);
        this.f2705c = Collections.unmodifiableSet(set2);
        this.f2706d = i10;
        this.f2707e = i11;
        this.f2708f = fVar;
        this.f2709g = Collections.unmodifiableSet(set3);
    }

    public static b a(u uVar) {
        return new b(uVar, new u[0]);
    }

    public static b b(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static c c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(u.a(cls));
        for (Class cls2 : clsArr) {
            b4.f(cls2, "Null interface");
            hashSet.add(u.a(cls2));
        }
        return new c(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(0, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2704b.toArray()) + ">{" + this.f2706d + ", type=" + this.f2707e + ", deps=" + Arrays.toString(this.f2705c.toArray()) + "}";
    }
}
