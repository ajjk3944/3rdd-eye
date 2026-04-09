package e4;

import g4.a;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f20943a;

    /* renamed from: b, reason: collision with root package name */
    public final f4.d f20944b;

    /* renamed from: c, reason: collision with root package name */
    public final u f20945c;

    /* renamed from: d, reason: collision with root package name */
    public final g4.a f20946d;

    public s(Executor executor, f4.d dVar, u uVar, g4.a aVar) {
        this.f20943a = executor;
        this.f20944b = dVar;
        this.f20945c = uVar;
        this.f20946d = aVar;
    }

    public static /* synthetic */ Object a(s sVar) {
        Iterator it = sVar.f20944b.A().iterator();
        while (it.hasNext()) {
            sVar.f20945c.a((x3.o) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f20943a.execute(new Runnable() { // from class: e4.q
            @Override // java.lang.Runnable
            public final void run() {
                s sVar = this.f20941a;
                sVar.f20946d.a(new a.InterfaceC0402a() { // from class: e4.r
                    @Override // g4.a.InterfaceC0402a
                    public final Object execute() {
                        return s.a(sVar);
                    }
                });
            }
        });
    }
}
