package d4;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class k0 extends rq.c {
    public final /* synthetic */ l0 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public FileOutputStream f6840r;

    /* renamed from: x, reason: collision with root package name */
    public FileOutputStream f6841x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6842y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, rq.c cVar) {
        super(cVar);
        this.B = l0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6842y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
