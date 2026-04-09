package d8;

import a8.AbstractC1669a;
import android.os.Bundle;
import com.zipoapps.premiumhelper.d;
import va.a;

/* compiled from: TestLogPlatform.java */
/* renamed from: d8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4282b extends AbstractC1669a {
    @Override // a8.AbstractC1669a
    public final void a(d dVar, boolean z10) {
        super.a(dVar, z10);
        a.b bVar = va.a.f47104a;
        bVar.o("TestLogPlatform");
        bVar.g("Initialized", new Object[0]);
    }

    @Override // a8.AbstractC1669a
    public final void b(c8.d dVar) {
        a.b bVar = va.a.f47104a;
        bVar.o("TestLogPlatform");
        bVar.a("Session finish: %s", dVar.f18559c);
    }

    @Override // a8.AbstractC1669a
    public final void c(c8.d dVar) {
        a.b bVar = va.a.f47104a;
        bVar.o("TestLogPlatform");
        bVar.a("Session start: %s", dVar.f18559c);
    }

    @Override // a8.AbstractC1669a
    public final void d(String str) {
        a.b bVar = va.a.f47104a;
        bVar.o("TestLogPlatform");
        bVar.a("Set user id: %s", str);
    }

    @Override // a8.AbstractC1669a
    public final void e(String str, String str2) {
        a.b bVar = va.a.f47104a;
        bVar.o("TestLogPlatform");
        bVar.a("Set user property: " + str + "=" + str2, new Object[0]);
    }

    @Override // a8.AbstractC1669a
    public final void f(Bundle bundle, String str) {
        a.b bVar = va.a.f47104a;
        bVar.o("TestLogPlatform");
        bVar.a("Event: " + str + " Params: " + bundle.toString(), new Object[0]);
    }
}
