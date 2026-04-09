package r;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class A0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7543s f59430a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7542q f59431b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC7542q f59432c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC7542q f59433d;

    public static final class a implements InterfaceC7543s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f59434a;

        a(I i10) {
            this.f59434a = i10;
        }

        @Override // r.InterfaceC7543s
        public I get(int i10) {
            return this.f59434a;
        }
    }

    public A0(InterfaceC7543s interfaceC7543s) {
        this.f59430a = interfaceC7543s;
    }

    @Override // r.v0
    public long b(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        Iterator it = AbstractC7978m.s(0, abstractC7542q.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iD = ((Zg.Q) it).d();
            jMax = Math.max(jMax, this.f59430a.get(iD).c(abstractC7542q.a(iD), abstractC7542q2.a(iD), abstractC7542q3.a(iD)));
        }
        return jMax;
    }

    @Override // r.v0
    public AbstractC7542q c(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        if (this.f59431b == null) {
            this.f59431b = r.g(abstractC7542q);
        }
        AbstractC7542q abstractC7542q4 = this.f59431b;
        if (abstractC7542q4 == null) {
            AbstractC6492s.v("valueVector");
            abstractC7542q4 = null;
        }
        int iB = abstractC7542q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q5 = this.f59431b;
            if (abstractC7542q5 == null) {
                AbstractC6492s.v("valueVector");
                abstractC7542q5 = null;
            }
            abstractC7542q5.e(i10, this.f59430a.get(i10).e(j10, abstractC7542q.a(i10), abstractC7542q2.a(i10), abstractC7542q3.a(i10)));
        }
        AbstractC7542q abstractC7542q6 = this.f59431b;
        if (abstractC7542q6 != null) {
            return abstractC7542q6;
        }
        AbstractC6492s.v("valueVector");
        return null;
    }

    @Override // r.v0
    public AbstractC7542q d(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        if (this.f59433d == null) {
            this.f59433d = r.g(abstractC7542q3);
        }
        AbstractC7542q abstractC7542q4 = this.f59433d;
        if (abstractC7542q4 == null) {
            AbstractC6492s.v("endVelocityVector");
            abstractC7542q4 = null;
        }
        int iB = abstractC7542q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q5 = this.f59433d;
            if (abstractC7542q5 == null) {
                AbstractC6492s.v("endVelocityVector");
                abstractC7542q5 = null;
            }
            abstractC7542q5.e(i10, this.f59430a.get(i10).d(abstractC7542q.a(i10), abstractC7542q2.a(i10), abstractC7542q3.a(i10)));
        }
        AbstractC7542q abstractC7542q6 = this.f59433d;
        if (abstractC7542q6 != null) {
            return abstractC7542q6;
        }
        AbstractC6492s.v("endVelocityVector");
        return null;
    }

    @Override // r.v0
    public AbstractC7542q f(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2, AbstractC7542q abstractC7542q3) {
        if (this.f59432c == null) {
            this.f59432c = r.g(abstractC7542q3);
        }
        AbstractC7542q abstractC7542q4 = this.f59432c;
        if (abstractC7542q4 == null) {
            AbstractC6492s.v("velocityVector");
            abstractC7542q4 = null;
        }
        int iB = abstractC7542q4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q5 = this.f59432c;
            if (abstractC7542q5 == null) {
                AbstractC6492s.v("velocityVector");
                abstractC7542q5 = null;
            }
            abstractC7542q5.e(i10, this.f59430a.get(i10).b(j10, abstractC7542q.a(i10), abstractC7542q2.a(i10), abstractC7542q3.a(i10)));
        }
        AbstractC7542q abstractC7542q6 = this.f59432c;
        if (abstractC7542q6 != null) {
            return abstractC7542q6;
        }
        AbstractC6492s.v("velocityVector");
        return null;
    }

    public A0(I i10) {
        this(new a(i10));
    }
}
