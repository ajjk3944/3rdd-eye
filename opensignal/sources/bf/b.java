package bf;

import com.google.android.gms.internal.measurement.b4;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f2696a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2697b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2698c;

    /* renamed from: d, reason: collision with root package name */
    public int f2699d;

    /* renamed from: e, reason: collision with root package name */
    public int f2700e;

    /* renamed from: f, reason: collision with root package name */
    public f f2701f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f2702g;

    public b(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f2697b = hashSet;
        this.f2698c = new HashSet();
        this.f2699d = 0;
        this.f2700e = 0;
        this.f2702g = new HashSet();
        hashSet.add(u.a(cls));
        for (Class cls2 : clsArr) {
            b4.f(cls2, "Null interface");
            this.f2697b.add(u.a(cls2));
        }
    }

    public final void a(l lVar) {
        if (this.f2697b.contains(lVar.f2727a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f2698c.add(lVar);
    }

    public final c b() {
        if (this.f2701f != null) {
            return new c(this.f2696a, new HashSet(this.f2697b), new HashSet(this.f2698c), this.f2699d, this.f2700e, this.f2701f, this.f2702g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i10) {
        if (!(this.f2699d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f2699d = i10;
    }

    public b(u uVar, u[] uVarArr) {
        HashSet hashSet = new HashSet();
        this.f2697b = hashSet;
        this.f2698c = new HashSet();
        this.f2699d = 0;
        this.f2700e = 0;
        this.f2702g = new HashSet();
        hashSet.add(uVar);
        for (u uVar2 : uVarArr) {
            b4.f(uVar2, "Null interface");
        }
        Collections.addAll(this.f2697b, uVarArr);
    }
}
