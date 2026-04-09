package na;

import java.io.Serializable;

/* compiled from: IsoChronology.java */
/* loaded from: classes3.dex */
public final class l extends g implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final l f44466d = new l();

    public static boolean m(long j4) {
        if ((3 & j4) == 0) {
            return j4 % 100 != 0 || j4 % 400 == 0;
        }
        return false;
    }

    private Object readResolve() {
        return f44466d;
    }

    @Override // na.g
    public final b a(qa.e eVar) {
        return ma.e.t0(eVar);
    }

    @Override // na.g
    public final h e(int i) {
        return m.of(i);
    }

    @Override // na.g
    public final String g() {
        return "iso8601";
    }

    @Override // na.g
    public final String h() {
        return "ISO";
    }

    @Override // na.g
    public final c i(qa.d dVar) {
        return ma.f.s0(dVar);
    }

    @Override // na.g
    public final e k(ma.d dVar, ma.p pVar) {
        com.google.gson.internal.c.v(dVar, "instant");
        return ma.s.v0(dVar.f44091b, dVar.f44092c, pVar);
    }

    @Override // na.g
    public final e l(qa.d dVar) {
        return ma.s.w0(dVar);
    }
}
