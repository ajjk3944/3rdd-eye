package zc;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f26939e;

    public /* synthetic */ g1(i1 i1Var, String str, String str2, String str3, int i10) {
        this.f26935a = i10;
        this.f26936b = str;
        this.f26937c = str2;
        this.f26938d = str3;
        this.f26939e = i1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26935a) {
            case 0:
                i1 i1Var = this.f26939e;
                i1Var.f26968d.w();
                l lVar = i1Var.f26968d.f27099g;
                p3.Q(lVar);
                return lVar.o2(this.f26936b, this.f26937c, this.f26938d);
            case 1:
                i1 i1Var2 = this.f26939e;
                i1Var2.f26968d.w();
                l lVar2 = i1Var2.f26968d.f27099g;
                p3.Q(lVar2);
                return lVar2.o2(this.f26936b, this.f26937c, this.f26938d);
            case 2:
                i1 i1Var3 = this.f26939e;
                i1Var3.f26968d.w();
                l lVar3 = i1Var3.f26968d.f27099g;
                p3.Q(lVar3);
                return lVar3.s2(this.f26936b, this.f26937c, this.f26938d);
            default:
                i1 i1Var4 = this.f26939e;
                i1Var4.f26968d.w();
                l lVar4 = i1Var4.f26968d.f27099g;
                p3.Q(lVar4);
                return lVar4.s2(this.f26936b, this.f26937c, this.f26938d);
        }
    }
}
