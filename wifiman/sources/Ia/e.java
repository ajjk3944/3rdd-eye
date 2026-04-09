package Ia;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f9007a;

    /* renamed from: b, reason: collision with root package name */
    private final La.e f9008b;

    public e(c server, La.e evaluation) {
        AbstractC6492s.i(server, "server");
        AbstractC6492s.i(evaluation, "evaluation");
        this.f9007a = server;
        this.f9008b = evaluation;
    }

    public final La.e a() {
        return this.f9008b;
    }

    public final c b() {
        return this.f9007a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f9007a, eVar.f9007a) && AbstractC6492s.d(this.f9008b, eVar.f9008b);
    }

    public int hashCode() {
        return (this.f9007a.hashCode() * 31) + this.f9008b.hashCode();
    }

    public String toString() {
        return "ServerStatus(server=" + this.f9007a + ", evaluation=" + this.f9008b + ")";
    }
}
