package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vu2 {
    public final mv2 a;

    public vu2(mv2 mv2Var) {
        this.a = mv2Var;
    }

    public final boolean a(qe3 qe3Var) {
        boolean zL = qe3Var.L();
        eg4 eg4Var = eg4.f;
        mv2 mv2Var = this.a;
        if (zL) {
            lv2 lv2VarA = mv2Var.a();
            lv2VarA.k("action", "aq_ad_closed");
            lv2VarA.k("gqi", qe3Var.D());
            lv2VarA.k("aq_ad_duration", String.valueOf(qe3Var.E()));
            lv2VarA.k("aq_ad_bounce_cnt", String.valueOf(qe3Var.F()));
            lv2VarA.k("aq_time_away", String.valueOf(qe3Var.I()));
            return lv2VarA.n().equals(eg4Var);
        }
        lv2 lv2VarA2 = mv2Var.a();
        lv2VarA2.k("action", "aq_ad_kill");
        lv2VarA2.k("gqi", qe3Var.D());
        lv2VarA2.k("aq_ad_duration", String.valueOf(qe3Var.E()));
        lv2VarA2.k("aq_ad_bounce_cnt", String.valueOf(qe3Var.F()));
        lv2VarA2.k("aq_time_away", String.valueOf(qe3Var.I()));
        lv2VarA2.k("aq_is_os_kill", String.valueOf(qe3Var.H()));
        return lv2VarA2.n().equals(eg4Var);
    }
}
