package j3;

import c3.AbstractC4215p;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k3.InterfaceC6370d;
import l3.InterfaceC6542a;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f50108a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6370d f50109b;

    /* renamed from: c, reason: collision with root package name */
    private final x f50110c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6542a f50111d;

    v(Executor executor, InterfaceC6370d interfaceC6370d, x xVar, InterfaceC6542a interfaceC6542a) {
        this.f50108a = executor;
        this.f50109b = interfaceC6370d;
        this.f50110c = xVar;
        this.f50111d = interfaceC6542a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f50109b.x().iterator();
        while (it.hasNext()) {
            this.f50110c.b((AbstractC4215p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f50111d.h(new InterfaceC6542a.InterfaceC1933a() { // from class: j3.u
            @Override // l3.InterfaceC6542a.InterfaceC1933a
            public final Object g() {
                return this.f50107a.d();
            }
        });
    }

    public void c() {
        this.f50108a.execute(new Runnable() { // from class: j3.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f50106a.e();
            }
        });
    }
}
