package fb;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f23990b;

    public /* synthetic */ x(y yVar, int i4) {
        this.f23989a = i4;
        this.f23990b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        switch (this.f23989a) {
            case 0:
                this.f23990b.a();
                break;
            default:
                y yVar = this.f23990b;
                yVar.f23993c.execute(new x(yVar, 0));
                break;
        }
    }
}
