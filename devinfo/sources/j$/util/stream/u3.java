package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public class u3 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f26765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26767c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26768d;

    public u3(e2 e2Var, Object obj, int i4) {
        this.f26767c = i4;
        this.f26765a = e2Var;
        this.f26766b = 0;
        this.f26768d = obj;
    }

    public u3(u3 u3Var, e2 e2Var, int i4, byte b10) {
        super(u3Var);
        this.f26765a = e2Var;
        this.f26766b = i4;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        u3 u3VarA = this;
        while (u3VarA.f26765a.o() != 0) {
            u3VarA.setPendingCount(u3VarA.f26765a.o() - 1);
            int i4 = 0;
            int iCount = 0;
            while (i4 < u3VarA.f26765a.o() - 1) {
                u3 u3VarA2 = u3VarA.a(i4, u3VarA.f26766b + iCount);
                iCount = (int) (u3VarA2.f26765a.count() + iCount);
                u3VarA2.fork();
                i4++;
            }
            u3VarA = u3VarA.a(i4, u3VarA.f26766b + iCount);
        }
        switch (u3VarA.f26767c) {
            case 0:
                ((d2) u3VarA.f26765a).f(u3VarA.f26766b, u3VarA.f26768d);
                break;
            default:
                u3VarA.f26765a.k((Object[]) u3VarA.f26768d, u3VarA.f26766b);
                break;
        }
        u3VarA.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(u3 u3Var, e2 e2Var, int i4) {
        this(u3Var, e2Var, i4, (byte) 0);
        this.f26767c = 1;
        this.f26768d = (Object[]) u3Var.f26768d;
    }

    public final u3 a(int i4, int i10) {
        switch (this.f26767c) {
            case 0:
                return new u3(this, ((d2) this.f26765a).a(i4), i10);
            default:
                return new u3(this, this.f26765a.a(i4), i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u3(u3 u3Var, d2 d2Var, int i4) {
        this(u3Var, d2Var, i4, (byte) 0);
        this.f26767c = 0;
        this.f26768d = u3Var.f26768d;
    }
}
