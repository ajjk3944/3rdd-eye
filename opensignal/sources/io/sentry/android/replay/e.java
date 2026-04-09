package io.sentry.android.replay;

import io.sentry.y5;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final t f11905a;

    /* renamed from: b, reason: collision with root package name */
    public final j f11906b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f11907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11908d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11909e;

    /* renamed from: f, reason: collision with root package name */
    public final y5 f11910f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11911g;

    /* renamed from: h, reason: collision with root package name */
    public final List f11912h;

    public e(t tVar, j jVar, Date date, int i10, long j, y5 y5Var, String str, List list) {
        this.f11905a = tVar;
        this.f11906b = jVar;
        this.f11907c = date;
        this.f11908d = i10;
        this.f11909e = j;
        this.f11910f = y5Var;
        this.f11911g = str;
        this.f11912h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return br.l.a(this.f11905a, eVar.f11905a) && br.l.a(this.f11906b, eVar.f11906b) && br.l.a(this.f11907c, eVar.f11907c) && this.f11908d == eVar.f11908d && this.f11909e == eVar.f11909e && this.f11910f == eVar.f11910f && br.l.a(this.f11911g, eVar.f11911g) && br.l.a(this.f11912h, eVar.f11912h);
    }

    public final int hashCode() {
        int iHashCode = (this.f11910f.hashCode() + h0.b.b(c7.a.C(this.f11908d, (this.f11907c.hashCode() + ((this.f11906b.hashCode() + (this.f11905a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f11909e)) * 31;
        String str = this.f11911g;
        return this.f11912h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LastSegmentData(recorderConfig=");
        sb2.append(this.f11905a);
        sb2.append(", cache=");
        sb2.append(this.f11906b);
        sb2.append(", timestamp=");
        sb2.append(this.f11907c);
        sb2.append(", id=");
        sb2.append(this.f11908d);
        sb2.append(", duration=");
        sb2.append(this.f11909e);
        sb2.append(", replayType=");
        sb2.append(this.f11910f);
        sb2.append(", screenAtStart=");
        sb2.append(this.f11911g);
        sb2.append(", events=");
        return h0.b.t(sb2, this.f11912h, ')');
    }
}
