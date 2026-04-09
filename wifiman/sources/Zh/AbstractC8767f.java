package zh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* renamed from: zh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8767f {

    /* renamed from: a, reason: collision with root package name */
    private final Zh.c f67306a;

    /* renamed from: b, reason: collision with root package name */
    private final String f67307b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f67308c;

    /* renamed from: d, reason: collision with root package name */
    private final Zh.b f67309d;

    /* renamed from: zh.f$a */
    public static final class a extends AbstractC8767f {

        /* renamed from: e, reason: collision with root package name */
        public static final a f67310e = new a();

        private a() {
            super(o.f51769A, "Function", false, null);
        }
    }

    /* renamed from: zh.f$b */
    public static final class b extends AbstractC8767f {

        /* renamed from: e, reason: collision with root package name */
        public static final b f67311e = new b();

        private b() {
            super(o.f51800x, "KFunction", true, null);
        }
    }

    /* renamed from: zh.f$c */
    public static final class c extends AbstractC8767f {

        /* renamed from: e, reason: collision with root package name */
        public static final c f67312e = new c();

        private c() {
            super(o.f51800x, "KSuspendFunction", true, null);
        }
    }

    /* renamed from: zh.f$d */
    public static final class d extends AbstractC8767f {

        /* renamed from: e, reason: collision with root package name */
        public static final d f67313e = new d();

        private d() {
            super(o.f51795s, "SuspendFunction", false, null);
        }
    }

    public AbstractC8767f(Zh.c packageFqName, String classNamePrefix, boolean z10, Zh.b bVar) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(classNamePrefix, "classNamePrefix");
        this.f67306a = packageFqName;
        this.f67307b = classNamePrefix;
        this.f67308c = z10;
        this.f67309d = bVar;
    }

    public final String a() {
        return this.f67307b;
    }

    public final Zh.c b() {
        return this.f67306a;
    }

    public final Zh.f c(int i10) {
        Zh.f fVarH = Zh.f.h(this.f67307b + i10);
        AbstractC6492s.h(fVarH, "identifier(...)");
        return fVarH;
    }

    public String toString() {
        return this.f67306a + '.' + this.f67307b + 'N';
    }
}
