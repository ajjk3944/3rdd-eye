package io.sentry.android.replay;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public volatile o f11941a;

    public final boolean a(o oVar) {
        br.l.e(oVar, "newState");
        switch (m.f11940a[this.f11941a.ordinal()]) {
            case 1:
                return oVar == o.STARTED || oVar == o.CLOSED;
            case 2:
                return oVar == o.PAUSED || oVar == o.STOPPED || oVar == o.CLOSED;
            case 3:
                return oVar == o.PAUSED || oVar == o.STOPPED || oVar == o.CLOSED;
            case 4:
                return oVar == o.RESUMED || oVar == o.STOPPED || oVar == o.CLOSED;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return oVar == o.STARTED || oVar == o.CLOSED;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return false;
            default:
                throw new bf.n();
        }
    }
}
