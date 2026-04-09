package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class p extends d5 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f26706s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f26707t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(a aVar, int i4, Object obj, int i10) {
        super(aVar, i4);
        this.f26706s = i10;
        this.f26707t = obj;
    }

    @Override // j$.util.stream.a
    public final m5 H0(int i4, m5 m5Var) {
        switch (this.f26706s) {
            case 0:
                return new o(this, m5Var, 0);
            case 1:
                return new s0(this, m5Var, 0);
            case 2:
                return new a1(this, m5Var, 0);
            case 3:
                return new l(this, m5Var, 1);
            case 4:
                return new l(this, m5Var, 2);
            case 5:
                return new l(this, m5Var, 3);
            default:
                return new k(this, m5Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e5 e5Var, Consumer consumer) {
        super(e5Var, 0);
        this.f26706s = 3;
        this.f26707t = consumer;
    }
}
