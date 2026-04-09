package j$.time.format;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f26147a;

    /* renamed from: b, reason: collision with root package name */
    public final v f26148b;

    /* renamed from: c, reason: collision with root package name */
    public final b f26149c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f26150d;

    public m(j$.time.temporal.q qVar, v vVar, b bVar) {
        this.f26147a = qVar;
        this.f26148b = vVar;
        this.f26149c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb2) {
        String strA;
        Long lA = pVar.a(this.f26147a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.f26161a.l(j$.time.temporal.r.f26223b);
        if (mVar == null || mVar == j$.time.chrono.t.f26098c) {
            b bVar = this.f26149c;
            long jLongValue = lA.longValue();
            v vVar = this.f26148b;
            Locale locale = pVar.f26162b.f26123b;
            strA = bVar.f26128a.a(jLongValue, vVar);
        } else {
            b bVar2 = this.f26149c;
            long jLongValue2 = lA.longValue();
            v vVar2 = this.f26148b;
            Locale locale2 = pVar.f26162b.f26123b;
            strA = bVar2.f26128a.a(jLongValue2, vVar2);
        }
        if (strA != null) {
            sb2.append(strA);
            return true;
        }
        if (this.f26150d == null) {
            this.f26150d = new i(this.f26147a, 1, 19, u.NORMAL);
        }
        return this.f26150d.i(pVar, sb2);
    }

    public final String toString() {
        v vVar = v.FULL;
        j$.time.temporal.q qVar = this.f26147a;
        v vVar2 = this.f26148b;
        if (vVar2 == vVar) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + vVar2 + ")";
    }
}
