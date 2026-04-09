package d4;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class d0 extends rq.c {
    public final /* synthetic */ e0 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public Object f6790r;

    /* renamed from: x, reason: collision with root package name */
    public FileInputStream f6791x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6792y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, rq.c cVar) {
        super(cVar);
        this.B = e0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6792y = obj;
        this.D |= Integer.MIN_VALUE;
        return e0.a(this.B, this);
    }
}
