package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public UUID f4531a;

    /* renamed from: b, reason: collision with root package name */
    public l2.p f4532b;

    /* renamed from: c, reason: collision with root package name */
    public Set f4533c;

    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        public l2.p f4536c;

        /* renamed from: e, reason: collision with root package name */
        public Class f4538e;

        /* renamed from: a, reason: collision with root package name */
        public boolean f4534a = false;

        /* renamed from: d, reason: collision with root package name */
        public Set f4537d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public UUID f4535b = UUID.randomUUID();

        public a(Class cls) {
            this.f4538e = cls;
            this.f4536c = new l2.p(this.f4535b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.f4537d.add(str);
            return d();
        }

        public final s b() {
            s sVarC = c();
            b bVar = this.f4536c.f23101j;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && bVar.e()) || bVar.f() || bVar.g() || bVar.h();
            if (this.f4536c.f23108q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f4535b = UUID.randomUUID();
            l2.p pVar = new l2.p(this.f4536c);
            this.f4536c = pVar;
            pVar.f23092a = this.f4535b.toString();
            return sVarC;
        }

        public abstract s c();

        public abstract a d();

        public final a e(b bVar) {
            this.f4536c.f23101j = bVar;
            return d();
        }

        public final a f(d dVar) {
            this.f4536c.f23096e = dVar;
            return d();
        }
    }

    public s(UUID uuid, l2.p pVar, Set set) {
        this.f4531a = uuid;
        this.f4532b = pVar;
        this.f4533c = set;
    }

    public String a() {
        return this.f4531a.toString();
    }

    public Set b() {
        return this.f4533c;
    }

    public l2.p c() {
        return this.f4532b;
    }
}
