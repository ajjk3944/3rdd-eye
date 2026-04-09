package d4;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public final class t0 extends rq.c {
    public boolean B;
    public /* synthetic */ Object D;
    public final /* synthetic */ u0 E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public eu.d f6880r;

    /* renamed from: x, reason: collision with root package name */
    public FileInputStream f6881x;

    /* renamed from: y, reason: collision with root package name */
    public FileLock f6882y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, rq.c cVar) {
        super(cVar);
        this.E = u0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(null, this);
    }
}
