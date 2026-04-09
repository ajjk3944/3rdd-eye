package uj;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import uj.e;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final org.kodein.type.q f63190a;

    /* renamed from: b, reason: collision with root package name */
    private final org.kodein.type.q f63191b;

    /* renamed from: c, reason: collision with root package name */
    private final org.kodein.type.q f63192c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f63193d;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f63195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f63195b = bVar;
        }

        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return g.this.f63193d.invoke(this.f63195b, obj);
        }
    }

    public g(org.kodein.type.q contextType, org.kodein.type.q argType, org.kodein.type.q createdType, InterfaceC6839p creator) {
        AbstractC6492s.i(contextType, "contextType");
        AbstractC6492s.i(argType, "argType");
        AbstractC6492s.i(createdType, "createdType");
        AbstractC6492s.i(creator, "creator");
        this.f63190a = contextType;
        this.f63191b = argType;
        this.f63192c = createdType;
        this.f63193d = creator;
    }

    @Override // uj.e
    public String a() {
        return e.b.b(this);
    }

    @Override // uj.e
    public org.kodein.type.q b() {
        return this.f63190a;
    }

    @Override // uj.e
    public q c() {
        return e.b.d(this);
    }

    @Override // uj.e
    public org.kodein.type.q d() {
        return this.f63191b;
    }

    @Override // uj.e
    public String e() {
        return e.b.a(this);
    }

    @Override // uj.e
    public String f() {
        return e.b.c(this);
    }

    @Override // uj.e
    public boolean g() {
        return e.b.e(this);
    }

    @Override // uj.e
    public String h() {
        return "factory";
    }

    @Override // uj.a
    public InterfaceC6835l i(DI.e key, b di2) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(di2, "di");
        return new a(di2);
    }

    @Override // uj.e
    public org.kodein.type.q j() {
        return this.f63192c;
    }
}
