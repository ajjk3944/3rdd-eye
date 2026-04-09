package uj;

import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import uj.l;

/* loaded from: classes4.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    private final org.kodein.type.q f63196a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f63197b;

    /* renamed from: c, reason: collision with root package name */
    private final org.kodein.type.q f63198c;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10) {
            AbstractC6492s.i(j10, "<anonymous parameter 0>");
            return h.this.k();
        }
    }

    public h(org.kodein.type.q createdType, Object instance) {
        AbstractC6492s.i(createdType, "createdType");
        AbstractC6492s.i(instance, "instance");
        this.f63196a = createdType;
        this.f63197b = instance;
        this.f63198c = org.kodein.type.q.f56966a.a();
    }

    @Override // uj.e
    public String a() {
        return h() + " ( " + j().i() + " )";
    }

    @Override // uj.e
    public org.kodein.type.q b() {
        return this.f63198c;
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
        return e() + " ( " + j().h() + " )";
    }

    @Override // uj.e
    public boolean g() {
        return l.a.f(this);
    }

    @Override // uj.e
    public String h() {
        return "instance";
    }

    @Override // uj.a
    public InterfaceC6835l i(DI.e key, b di2) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(di2, "di");
        return new a();
    }

    @Override // uj.e
    public org.kodein.type.q j() {
        return this.f63196a;
    }

    public final Object k() {
        return this.f63197b;
    }
}
