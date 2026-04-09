package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4816c extends AbstractC4825d {

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.T1 f36355g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ C7 f36356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4816c(C7 c72, String str, int i10, com.google.android.gms.internal.measurement.T1 t12) {
        super(str, i10);
        this.f36356h = c72;
        this.f36355g = t12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4825d
    final int a() {
        return this.f36355g.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4825d
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4825d
    final boolean j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.C2 c22, boolean z10) {
        byte b10 = com.google.android.gms.internal.measurement.A6.a() && this.f36356h.a().F(this.f36366a, N.f36014C0);
        boolean zK = this.f36355g.K();
        boolean zL = this.f36355g.L();
        boolean zM = this.f36355g.M();
        byte b11 = zK || zL || zM;
        Boolean boolD = null;
        boolD = null;
        boolD = null;
        boolD = null;
        boolD = null;
        if (z10 && b11 != true) {
            this.f36356h.zzj().G().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f36367b), this.f36355g.N() ? Integer.valueOf(this.f36355g.j()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.R1 r1G = this.f36355g.G();
        boolean zL2 = r1G.L();
        if (c22.X()) {
            if (r1G.N()) {
                boolD = AbstractC4825d.d(AbstractC4825d.c(c22.O(), r1G.I()), zL2);
            } else {
                this.f36356h.zzj().H().b("No number filter for long property. property", this.f36356h.c().g(c22.T()));
            }
        } else if (c22.V()) {
            if (r1G.N()) {
                boolD = AbstractC4825d.d(AbstractC4825d.b(c22.F(), r1G.I()), zL2);
            } else {
                this.f36356h.zzj().H().b("No number filter for double property. property", this.f36356h.c().g(c22.T()));
            }
        } else if (!c22.Z()) {
            this.f36356h.zzj().H().b("User property has no value, property", this.f36356h.c().g(c22.T()));
        } else if (r1G.P()) {
            boolD = AbstractC4825d.d(AbstractC4825d.g(c22.U(), r1G.J(), this.f36356h.zzj()), zL2);
        } else if (!r1G.N()) {
            this.f36356h.zzj().H().b("No string or number filter defined. property", this.f36356h.c().g(c22.T()));
        } else if (s7.c0(c22.U())) {
            boolD = AbstractC4825d.d(AbstractC4825d.e(c22.U(), r1G.I()), zL2);
        } else {
            this.f36356h.zzj().H().c("Invalid user property value for Numeric number filter. property, value", this.f36356h.c().g(c22.T()), c22.U());
        }
        this.f36356h.zzj().G().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f36368c = Boolean.TRUE;
        if (zM && !boolD.booleanValue()) {
            return true;
        }
        if (!z10 || this.f36355g.K()) {
            this.f36369d = boolD;
        }
        if (boolD.booleanValue() && b11 != false && c22.Y()) {
            long jQ = c22.Q();
            if (l10 != null) {
                jQ = l10.longValue();
            }
            if (b10 != false && this.f36355g.K() && !this.f36355g.L() && l11 != null) {
                jQ = l11.longValue();
            }
            if (this.f36355g.L()) {
                this.f36371f = Long.valueOf(jQ);
            } else {
                this.f36370e = Long.valueOf(jQ);
            }
        }
        return true;
    }
}
