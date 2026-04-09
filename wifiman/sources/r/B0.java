package r;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class B0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private final J f59435a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7542q f59436b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC7542q f59437c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC7542q f59438d;

    /* renamed from: e, reason: collision with root package name */
    private final float f59439e;

    public B0(J j10) {
        this.f59435a = j10;
        this.f59439e = j10.a();
    }

    @Override // r.x0
    public float a() {
        return this.f59439e;
    }

    @Override // r.x0
    public AbstractC7542q b(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2) {
        if (this.f59437c == null) {
            this.f59437c = r.g(abstractC7542q);
        }
        AbstractC7542q abstractC7542q3 = this.f59437c;
        if (abstractC7542q3 == null) {
            AbstractC6492s.v("velocityVector");
            abstractC7542q3 = null;
        }
        int iB = abstractC7542q3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q4 = this.f59437c;
            if (abstractC7542q4 == null) {
                AbstractC6492s.v("velocityVector");
                abstractC7542q4 = null;
            }
            abstractC7542q4.e(i10, this.f59435a.b(j10, abstractC7542q.a(i10), abstractC7542q2.a(i10)));
        }
        AbstractC7542q abstractC7542q5 = this.f59437c;
        if (abstractC7542q5 != null) {
            return abstractC7542q5;
        }
        AbstractC6492s.v("velocityVector");
        return null;
    }

    @Override // r.x0
    public AbstractC7542q c(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2) {
        if (this.f59438d == null) {
            this.f59438d = r.g(abstractC7542q);
        }
        AbstractC7542q abstractC7542q3 = this.f59438d;
        if (abstractC7542q3 == null) {
            AbstractC6492s.v("targetVector");
            abstractC7542q3 = null;
        }
        int iB = abstractC7542q3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q4 = this.f59438d;
            if (abstractC7542q4 == null) {
                AbstractC6492s.v("targetVector");
                abstractC7542q4 = null;
            }
            abstractC7542q4.e(i10, this.f59435a.d(abstractC7542q.a(i10), abstractC7542q2.a(i10)));
        }
        AbstractC7542q abstractC7542q5 = this.f59438d;
        if (abstractC7542q5 != null) {
            return abstractC7542q5;
        }
        AbstractC6492s.v("targetVector");
        return null;
    }

    @Override // r.x0
    public AbstractC7542q d(long j10, AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2) {
        if (this.f59436b == null) {
            this.f59436b = r.g(abstractC7542q);
        }
        AbstractC7542q abstractC7542q3 = this.f59436b;
        if (abstractC7542q3 == null) {
            AbstractC6492s.v("valueVector");
            abstractC7542q3 = null;
        }
        int iB = abstractC7542q3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q4 = this.f59436b;
            if (abstractC7542q4 == null) {
                AbstractC6492s.v("valueVector");
                abstractC7542q4 = null;
            }
            abstractC7542q4.e(i10, this.f59435a.e(j10, abstractC7542q.a(i10), abstractC7542q2.a(i10)));
        }
        AbstractC7542q abstractC7542q5 = this.f59436b;
        if (abstractC7542q5 != null) {
            return abstractC7542q5;
        }
        AbstractC6492s.v("valueVector");
        return null;
    }

    @Override // r.x0
    public long e(AbstractC7542q abstractC7542q, AbstractC7542q abstractC7542q2) {
        if (this.f59437c == null) {
            this.f59437c = r.g(abstractC7542q);
        }
        AbstractC7542q abstractC7542q3 = this.f59437c;
        if (abstractC7542q3 == null) {
            AbstractC6492s.v("velocityVector");
            abstractC7542q3 = null;
        }
        int iB = abstractC7542q3.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f59435a.c(abstractC7542q.a(i10), abstractC7542q2.a(i10)));
        }
        return jMax;
    }
}
