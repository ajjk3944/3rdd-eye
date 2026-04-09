package vj;

import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import org.kodein.di.DI;
import org.kodein.type.q;
import uj.m;

/* loaded from: classes3.dex */
public class b implements DI.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f63637a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63638b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f63639c;

    /* renamed from: d, reason: collision with root package name */
    private final c f63640d;

    /* renamed from: e, reason: collision with root package name */
    private final q f63641e;

    public final class a implements DI.b.InterfaceC2016b {

        /* renamed from: a, reason: collision with root package name */
        private final q f63642a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f63643b;

        /* renamed from: c, reason: collision with root package name */
        private final Boolean f63644c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f63645d;

        public a(b bVar, q type, Object obj, Boolean bool) {
            AbstractC6492s.i(type, "type");
            this.f63645d = bVar;
            this.f63642a = type;
            this.f63643b = obj;
            this.f63644c = bool;
        }

        @Override // org.kodein.di.DI.b.InterfaceC2016b
        public void a(uj.e binding) {
            AbstractC6492s.i(binding, "binding");
            b().a(new DI.e(binding.b(), binding.d(), this.f63642a, this.f63643b), binding, this.f63645d.f63637a, this.f63644c);
        }

        public final c b() {
            return this.f63645d.h();
        }
    }

    public b(String str, String prefix, Set importedModules, c containerBuilder) {
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(importedModules, "importedModules");
        AbstractC6492s.i(containerBuilder, "containerBuilder");
        this.f63637a = str;
        this.f63638b = prefix;
        this.f63639c = importedModules;
        this.f63640d = containerBuilder;
        this.f63641e = q.f56966a.a();
    }

    @Override // org.kodein.di.DI.b
    public void a(DI.g module, boolean z10) {
        AbstractC6492s.i(module, "module");
        String str = this.f63638b + module.c();
        if (str.length() > 0 && this.f63639c.contains(str)) {
            throw new IllegalStateException("Module \"" + str + "\" has already been imported!");
        }
        this.f63639c.add(str);
        module.b().invoke(new b(str, this.f63638b + module.d(), this.f63639c, h().g(z10, module.a())));
    }

    @Override // org.kodein.di.DI.a
    public q b() {
        return this.f63641e;
    }

    @Override // org.kodein.di.DI.a.InterfaceC2015a
    public uj.q c() {
        return new m();
    }

    @Override // org.kodein.di.DI.a
    public boolean e() {
        return false;
    }

    @Override // org.kodein.di.DI.b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a d(q type, Object obj, Boolean bool) {
        AbstractC6492s.i(type, "type");
        return new a(this, type, obj, bool);
    }

    public c h() {
        return this.f63640d;
    }
}
