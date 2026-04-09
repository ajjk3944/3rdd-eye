package defpackage;

import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nl2 {
    public final zx2 a;
    public final l83 b;
    public final u93 c;
    public final tb1 d;
    public final s13 e;
    public final zo2 f;
    public h83 g;
    public final t83 h;
    public final km2 i;
    public final Executor j;
    public final ky2 k;
    public final e03 l;

    public nl2(zx2 zx2Var, l83 l83Var, u93 u93Var, tb1 tb1Var, s13 s13Var, zo2 zo2Var, h83 h83Var, t83 t83Var, km2 km2Var, ld2 ld2Var, ky2 ky2Var, e03 e03Var) {
        this.a = zx2Var;
        this.b = l83Var;
        this.c = u93Var;
        this.d = tb1Var;
        this.e = s13Var;
        this.f = zo2Var;
        this.g = h83Var;
        this.h = t83Var;
        this.i = km2Var;
        this.j = ld2Var;
        this.k = ky2Var;
        this.l = e03Var;
    }

    public final q93 a(n70 n70Var) {
        if (this.g != null) {
            u93 u93Var = this.c;
            s93 s93Var = s93.i;
            Objects.requireNonNull(u93Var);
            return new bu1(u93Var, s93Var, null, u93.d, Collections.EMPTY_LIST, pu1.r(this.g)).A();
        }
        bu1 bu1Var = hg4.C.j;
        bu1Var.getClass();
        iz1 iz1Var = mz1.G4;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            synchronized (bu1Var.i) {
                try {
                    bu1Var.E();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) bu1Var.g;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    bu1Var.g = md2.d.schedule((fu1) bu1Var.h, ((Long) tw1Var.c.a(mz1.H4)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.c.a(n70Var, s93.i).s(new u42(4, this.k)).A();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0287 A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #5 {all -> 0x0105, blocks: (B:32:0x00a4, B:34:0x00c3, B:36:0x00cb, B:38:0x00d8, B:40:0x00f0, B:44:0x011c, B:47:0x0128, B:49:0x0130, B:51:0x0137, B:55:0x0140, B:66:0x017a, B:58:0x0154, B:65:0x0165, B:68:0x017f, B:43:0x0108, B:69:0x0193, B:76:0x01b2, B:79:0x01ba, B:83:0x01dd, B:85:0x01f3, B:89:0x0215, B:91:0x022c, B:94:0x0240, B:99:0x0253, B:100:0x0254, B:101:0x0261, B:105:0x0266, B:106:0x0267, B:111:0x027d, B:124:0x028e, B:115:0x0281, B:118:0x0284, B:120:0x0286, B:121:0x0287, B:123:0x028d, B:131:0x02a2, B:90:0x021f, B:86:0x0206, B:82:0x01c9, B:73:0x01a1, B:74:0x01a6, B:122:0x0288, B:95:0x0241, B:97:0x024b, B:107:0x0268, B:109:0x0272), top: B:174:0x00a4, inners: #0, #4, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0288 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0215 A[Catch: all -> 0x0105, TryCatch #5 {all -> 0x0105, blocks: (B:32:0x00a4, B:34:0x00c3, B:36:0x00cb, B:38:0x00d8, B:40:0x00f0, B:44:0x011c, B:47:0x0128, B:49:0x0130, B:51:0x0137, B:55:0x0140, B:66:0x017a, B:58:0x0154, B:65:0x0165, B:68:0x017f, B:43:0x0108, B:69:0x0193, B:76:0x01b2, B:79:0x01ba, B:83:0x01dd, B:85:0x01f3, B:89:0x0215, B:91:0x022c, B:94:0x0240, B:99:0x0253, B:100:0x0254, B:101:0x0261, B:105:0x0266, B:106:0x0267, B:111:0x027d, B:124:0x028e, B:115:0x0281, B:118:0x0284, B:120:0x0286, B:121:0x0287, B:123:0x028d, B:131:0x02a2, B:90:0x021f, B:86:0x0206, B:82:0x01c9, B:73:0x01a1, B:74:0x01a6, B:122:0x0288, B:95:0x0241, B:97:0x024b, B:107:0x0268, B:109:0x0272), top: B:174:0x00a4, inners: #0, #4, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f A[Catch: all -> 0x0105, TryCatch #5 {all -> 0x0105, blocks: (B:32:0x00a4, B:34:0x00c3, B:36:0x00cb, B:38:0x00d8, B:40:0x00f0, B:44:0x011c, B:47:0x0128, B:49:0x0130, B:51:0x0137, B:55:0x0140, B:66:0x017a, B:58:0x0154, B:65:0x0165, B:68:0x017f, B:43:0x0108, B:69:0x0193, B:76:0x01b2, B:79:0x01ba, B:83:0x01dd, B:85:0x01f3, B:89:0x0215, B:91:0x022c, B:94:0x0240, B:99:0x0253, B:100:0x0254, B:101:0x0261, B:105:0x0266, B:106:0x0267, B:111:0x027d, B:124:0x028e, B:115:0x0281, B:118:0x0284, B:120:0x0286, B:121:0x0287, B:123:0x028d, B:131:0x02a2, B:90:0x021f, B:86:0x0206, B:82:0x01c9, B:73:0x01a1, B:74:0x01a6, B:122:0x0288, B:95:0x0241, B:97:0x024b, B:107:0x0268, B:109:0x0272), top: B:174:0x00a4, inners: #0, #4, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.q93 b() {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.b():q93");
    }

    public final q93 c(n70 n70Var) {
        bu1 bu1VarS = this.c.a(n70Var, s93.j).q(new zs1(18, this)).s(this.e);
        iz1 iz1Var = mz1.Y5;
        tw1 tw1Var = tw1.e;
        if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            long jIntValue = ((Integer) tw1Var.c.a(mz1.Z5)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            bu1VarS = bu1VarS.z(jIntValue);
        }
        return bu1VarS.A();
    }
}
