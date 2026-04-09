package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class z5 extends g4 implements c2 {
    public File L;
    public int P;
    public Date R;
    public HashMap V;
    public io.sentry.protocol.t O = new io.sentry.protocol.t();
    public String M = "replay_event";
    public y5 N = y5.SESSION;
    public List T = new ArrayList();
    public List U = new ArrayList();
    public List S = new ArrayList();
    public Date Q = dr.a.q();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z5.class == obj.getClass()) {
            z5 z5Var = (z5) obj;
            if (this.P == z5Var.P && ir.f0.s(this.M, z5Var.M) && this.N == z5Var.N && ir.f0.s(this.O, z5Var.O) && ir.f0.s(this.S, z5Var.S) && ir.f0.s(this.T, z5Var.T) && ir.f0.s(this.U, z5Var.U)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.M, this.N, this.O, Integer.valueOf(this.P), this.S, this.T, this.U});
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("type");
        bVar.V(this.M);
        bVar.I("replay_type");
        bVar.S(u0Var, this.N);
        bVar.I("segment_id");
        bVar.R(this.P);
        bVar.I("timestamp");
        bVar.S(u0Var, this.Q);
        if (this.O != null) {
            bVar.I("replay_id");
            bVar.S(u0Var, this.O);
        }
        if (this.R != null) {
            bVar.I("replay_start_timestamp");
            bVar.S(u0Var, this.R);
        }
        if (this.S != null) {
            bVar.I("urls");
            bVar.S(u0Var, this.S);
        }
        if (this.T != null) {
            bVar.I("error_ids");
            bVar.S(u0Var, this.T);
        }
        if (this.U != null) {
            bVar.I("trace_ids");
            bVar.S(u0Var, this.U);
        }
        ic.a.J(this, bVar, u0Var);
        HashMap map = this.V;
        if (map != null) {
            for (String str : map.keySet()) {
                h0.b.C(this.V, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }
}
