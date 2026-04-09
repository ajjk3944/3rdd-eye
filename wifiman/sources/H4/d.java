package H4;

import D4.a;
import android.os.Bundle;
import f5.InterfaceC5535a;
import f5.InterfaceC5536b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5535a f7616a;

    /* renamed from: b, reason: collision with root package name */
    private volatile J4.a f7617b;

    /* renamed from: c, reason: collision with root package name */
    private volatile K4.b f7618c;

    /* renamed from: d, reason: collision with root package name */
    private final List f7619d;

    public d(InterfaceC5535a interfaceC5535a) {
        this(interfaceC5535a, new K4.c(), new J4.f());
    }

    private void f() {
        this.f7616a.a(new InterfaceC5535a.InterfaceC1759a() { // from class: H4.c
            @Override // f5.InterfaceC5535a.InterfaceC1759a
            public final void a(InterfaceC5536b interfaceC5536b) {
                this.f7615a.i(interfaceC5536b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f7617b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(K4.a aVar) {
        synchronized (this) {
            try {
                if (this.f7618c instanceof K4.c) {
                    this.f7619d.add(aVar);
                }
                this.f7618c.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(InterfaceC5536b interfaceC5536b) {
        I4.g.f().b("AnalyticsConnector now available.");
        D4.a aVar = (D4.a) interfaceC5536b.get();
        J4.e eVar = new J4.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) == null) {
            I4.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        I4.g.f().b("Registered Firebase Analytics listener.");
        J4.d dVar = new J4.d();
        J4.c cVar = new J4.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it = this.f7619d.iterator();
                while (it.hasNext()) {
                    dVar.a((K4.a) it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f7618c = dVar;
                this.f7617b = cVar;
            } finally {
            }
        }
    }

    private static a.InterfaceC0141a j(D4.a aVar, e eVar) {
        a.InterfaceC0141a interfaceC0141aB = aVar.b("clx", eVar);
        if (interfaceC0141aB == null) {
            I4.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0141aB = aVar.b("crash", eVar);
            if (interfaceC0141aB != null) {
                I4.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0141aB;
    }

    public J4.a d() {
        return new J4.a() { // from class: H4.b
            @Override // J4.a
            public final void a(String str, Bundle bundle) {
                this.f7614a.g(str, bundle);
            }
        };
    }

    public K4.b e() {
        return new K4.b() { // from class: H4.a
            @Override // K4.b
            public final void a(K4.a aVar) {
                this.f7613a.h(aVar);
            }
        };
    }

    public d(InterfaceC5535a interfaceC5535a, K4.b bVar, J4.a aVar) {
        this.f7616a = interfaceC5535a;
        this.f7618c = bVar;
        this.f7619d = new ArrayList();
        this.f7617b = aVar;
        f();
    }
}
