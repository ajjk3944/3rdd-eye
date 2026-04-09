package uj;

import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import uj.l;

/* loaded from: classes4.dex */
public final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    private final org.kodein.type.q f63222a;

    /* renamed from: b, reason: collision with root package name */
    private final org.kodein.type.q f63223b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f63224c;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f63226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f63226b = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10) {
            AbstractC6492s.i(j10, "<anonymous parameter 0>");
            return n.this.k().invoke(new k(this.f63226b));
        }
    }

    public n(org.kodein.type.q contextType, org.kodein.type.q createdType, InterfaceC6835l creator) {
        AbstractC6492s.i(contextType, "contextType");
        AbstractC6492s.i(createdType, "createdType");
        AbstractC6492s.i(creator, "creator");
        this.f63222a = contextType;
        this.f63223b = createdType;
        this.f63224c = creator;
    }

    @Override // uj.e
    public String a() {
        return l.a.c(this);
    }

    @Override // uj.e
    public org.kodein.type.q b() {
        return this.f63222a;
    }

    @Override // uj.e
    public q c() {
        return l.a.e(this);
    }

    @Override // uj.e
    public org.kodein.type.q d() {
        return l.a.b(this);
    }

    @Override // uj.e
    public String e() {
        return l.a.a(this);
    }

    @Override // uj.e
    public String f() {
        return l.a.d(this);
    }

    @Override // uj.e
    public boolean g() {
        return l.a.f(this);
    }

    @Override // uj.e
    public String h() {
        return "provider";
    }

    @Override // uj.a
    public InterfaceC6835l i(DI.e key, b di2) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(di2, "di");
        return new a(di2);
    }

    @Override // uj.e
    public org.kodein.type.q j() {
        return this.f63223b;
    }

    public final InterfaceC6835l k() {
        return this.f63224c;
    }
}
