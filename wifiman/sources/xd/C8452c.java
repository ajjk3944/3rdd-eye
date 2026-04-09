package xd;

import Sd.d;
import jd.C6292a;
import kotlin.jvm.internal.AbstractC6492s;
import zi.InterfaceC8780j;

/* renamed from: xd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8452c {

    /* renamed from: a, reason: collision with root package name */
    private final C6292a.b f65568a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8780j f65569b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b f65570c;

    public C8452c(C6292a.b bVar, InterfaceC8780j interfaceC8780j, d.b bVar2) {
        this.f65568a = bVar;
        this.f65569b = interfaceC8780j;
        this.f65570c = bVar2;
    }

    public final C6292a.b a() {
        return this.f65568a;
    }

    public final d.b b() {
        return this.f65570c;
    }

    public final InterfaceC8780j c() {
        return this.f65569b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8452c)) {
            return false;
        }
        C8452c c8452c = (C8452c) obj;
        return AbstractC6492s.d(this.f65568a, c8452c.f65568a) && AbstractC6492s.d(this.f65569b, c8452c.f65569b) && AbstractC6492s.d(this.f65570c, c8452c.f65570c);
    }

    public int hashCode() {
        C6292a.b bVar = this.f65568a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        InterfaceC8780j interfaceC8780j = this.f65569b;
        int iHashCode2 = (iHashCode + (interfaceC8780j == null ? 0 : interfaceC8780j.hashCode())) * 31;
        d.b bVar2 = this.f65570c;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public String toString() {
        return "SpeedTestReportParams(accessPoint=" + this.f65568a + ", linkedWiFis=" + this.f65569b + ", console=" + this.f65570c + ")";
    }
}
