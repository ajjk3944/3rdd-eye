package s7;

import Zg.AbstractC3689v;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import s7.AbstractC7919f;

/* renamed from: s7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7916c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f61363c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final C7918e f61364d = new C7918e();

    /* renamed from: a, reason: collision with root package name */
    private final Set f61365a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7917d f61366b;

    /* renamed from: s7.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f61367a = new LinkedHashSet();

        public final C7916c a() {
            return new C7916c(this.f61367a, null, 2, 0 == true ? 1 : 0);
        }

        public final a b(byte[] address) {
            AbstractC6492s.i(address, "address");
            this.f61367a.add(new AbstractC7919f.a(address));
            return this;
        }
    }

    /* renamed from: s7.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7916c a(InterfaceC6835l builder) {
            AbstractC6492s.i(builder, "builder");
            a aVar = new a();
            builder.invoke(aVar);
            return aVar.a();
        }

        private b() {
        }
    }

    /* renamed from: s7.c$c, reason: collision with other inner class name */
    static final class C2136c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2136c f61368a = new C2136c();

        C2136c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC7919f it) {
            AbstractC6492s.i(it, "it");
            return it.toString();
        }
    }

    private C7916c(Set set, InterfaceC7917d interfaceC7917d) {
        this.f61365a = set;
        this.f61366b = interfaceC7917d;
    }

    private final boolean c(AbstractC7919f.a aVar, AbstractC7919f abstractC7919f) {
        if (abstractC7919f instanceof AbstractC7919f.a) {
            return Arrays.equals(aVar.a(), ((AbstractC7919f.a) abstractC7919f).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean d(AbstractC7919f abstractC7919f, AbstractC7919f abstractC7919f2) {
        if (abstractC7919f instanceof AbstractC7919f.a) {
            return c((AbstractC7919f.a) abstractC7919f, abstractC7919f2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String a() {
        return this.f61366b.a(this);
    }

    public final boolean b() {
        return this.f61365a.isEmpty();
    }

    public final boolean e(C7916c other) {
        AbstractC6492s.i(other, "other");
        for (AbstractC7919f abstractC7919f : this.f61365a) {
            Iterator it = other.f61365a.iterator();
            while (it.hasNext()) {
                if (d(abstractC7919f, (AbstractC7919f) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(C7916c identification) {
        AbstractC6492s.i(identification, "identification");
        this.f61365a.addAll(identification.f61365a);
    }

    public String toString() {
        return "identification: { " + AbstractC3689v.z0(this.f61365a, " || ", null, null, 0, null, C2136c.f61368a, 30, null) + " }";
    }

    /* synthetic */ C7916c(Set set, InterfaceC7917d interfaceC7917d, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? f61364d : interfaceC7917d);
    }
}
