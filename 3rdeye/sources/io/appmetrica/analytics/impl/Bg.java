package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Bg implements InterfaceC5027vg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f39178a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39179b;

    /* renamed from: c, reason: collision with root package name */
    public C5102yg f39180c;

    public Bg() {
        this(Ga.j().t());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5027vg
    public final synchronized void a(C5102yg c5102yg) {
        if (c5102yg != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", c5102yg.f42145d.f42081a, c5102yg.f42142a);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f39180c = c5102yg;
        this.f39179b = true;
        Iterator it = this.f39178a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4900qg) it.next()).a(this.f39180c);
        }
        this.f39178a.clear();
    }

    public Bg(C5052wg c5052wg) {
        this.f39178a = new HashSet();
        c5052wg.a(new C5007ul(this));
        c5052wg.a();
    }

    public final synchronized void a(InterfaceC4900qg interfaceC4900qg) {
        this.f39178a.add(interfaceC4900qg);
        if (this.f39179b) {
            interfaceC4900qg.a(this.f39180c);
            this.f39178a.remove(interfaceC4900qg);
        }
    }
}
