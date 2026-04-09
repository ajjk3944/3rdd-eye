package zc;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class m2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f27008a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2 f27009d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f27010g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f27011r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o2 f27012x;

    public m2(o2 o2Var, l2 l2Var, l2 l2Var2, long j, boolean z10) {
        this.f27008a = l2Var;
        this.f27009d = l2Var2;
        this.f27010g = j;
        this.f27011r = z10;
        this.f27012x = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f27012x.C1(this.f27008a, this.f27009d, this.f27010g, this.f27011r, null);
    }
}
