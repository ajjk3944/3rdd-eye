package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class k extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26638b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26639c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26640d;

    public /* synthetic */ k(m5 m5Var) {
        super(m5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j8 j8Var, m5 m5Var) {
        super(m5Var);
        this.f26640d = j8Var;
        this.f26639c = true;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        switch (this.f26638b) {
            case 0:
                this.f26639c = false;
                this.f26640d = null;
                this.f26617a.c(-1L);
                break;
            case 1:
                this.f26617a.c(-1L);
                break;
            default:
                this.f26617a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.f26638b) {
            case 0:
                m5 m5Var = this.f26617a;
                if (obj == null) {
                    if (this.f26639c) {
                        return;
                    }
                    this.f26639c = true;
                    this.f26640d = null;
                    m5Var.n((m5) null);
                    return;
                }
                Object obj2 = this.f26640d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f26640d = obj;
                    m5Var.n((m5) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.q) ((p) this.f26640d).f26707t).apply((j$.util.q) obj);
                if (stream != null) {
                    try {
                        boolean z3 = this.f26639c;
                        m5 m5Var2 = this.f26617a;
                        if (!z3) {
                            ((Stream) stream.sequential()).forEach(m5Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!m5Var2.e() && spliterator.tryAdvance(m5Var2)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f26639c) {
                    boolean zTest = ((j8) this.f26640d).f26637t.test(obj);
                    this.f26639c = zTest;
                    if (zTest) {
                        this.f26617a.n((m5) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public boolean e() {
        switch (this.f26638b) {
            case 1:
                this.f26639c = true;
                return this.f26617a.e();
            case 2:
                return !this.f26639c || this.f26617a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public void end() {
        switch (this.f26638b) {
            case 0:
                this.f26639c = false;
                this.f26640d = null;
                this.f26617a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, m5 m5Var) {
        super(m5Var);
        this.f26640d = pVar;
    }
}
