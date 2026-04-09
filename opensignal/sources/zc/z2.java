package zc;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class z2 extends k3 {
    public final d5.y0 B;
    public final d5.y0 D;
    public final d5.y0 E;
    public final d5.y0 F;
    public final d5.y0 G;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f27286x;

    /* renamed from: y, reason: collision with root package name */
    public final d5.y0 f27287y;

    public z2(p3 p3Var) {
        super(p3Var);
        this.f27286x = new HashMap();
        r0 r0Var = ((c1) this.f1504d).f26888x;
        c1.e(r0Var);
        this.f27287y = new d5.y0(r0Var, "last_delete_stale", 0L);
        r0 r0Var2 = ((c1) this.f1504d).f26888x;
        c1.e(r0Var2);
        this.B = new d5.y0(r0Var2, "last_delete_stale_batch", 0L);
        r0 r0Var3 = ((c1) this.f1504d).f26888x;
        c1.e(r0Var3);
        this.D = new d5.y0(r0Var3, "backoff", 0L);
        r0 r0Var4 = ((c1) this.f1504d).f26888x;
        c1.e(r0Var4);
        this.E = new d5.y0(r0Var4, "last_upload", 0L);
        r0 r0Var5 = ((c1) this.f1504d).f26888x;
        c1.e(r0Var5);
        this.F = new d5.y0(r0Var5, "last_upload_attempt", 0L);
        r0 r0Var6 = ((c1) this.f1504d).f26888x;
        c1.e(r0Var6);
        this.G = new d5.y0(r0Var6, "midnight_offset", 0L);
    }

    public final Pair w1(String str) {
        y2 y2Var;
        cc.f0 f0VarA;
        s1();
        c1 c1Var = (c1) this.f1504d;
        gc.a aVar = c1Var.G;
        f fVar = c1Var.f26887r;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f27286x;
        y2 y2Var2 = (y2) map.get(str);
        if (y2Var2 != null && jElapsedRealtime < y2Var2.f27278c) {
            return new Pair(y2Var2.f27276a, Boolean.valueOf(y2Var2.f27277b));
        }
        long jZ1 = fVar.z1(str, u.f27164b) + jElapsedRealtime;
        try {
            try {
                f0VarA = ub.a.a(c1Var.f26884a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (y2Var2 != null && jElapsedRealtime < y2Var2.f27278c + fVar.z1(str, u.f27167c)) {
                    return new Pair(y2Var2.f27276a, Boolean.valueOf(y2Var2.f27277b));
                }
                f0VarA = null;
            }
        } catch (Exception e4) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.J.c(e4, "Unable to get advertising id");
            y2Var = new y2("", false, jZ1);
        }
        if (f0VarA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = f0VarA.f3649c;
        y2Var = str2 != null ? new y2(str2, f0VarA.f3648b, jZ1) : new y2("", f0VarA.f3648b, jZ1);
        map.put(str, y2Var);
        return new Pair(y2Var.f27276a, Boolean.valueOf(y2Var.f27277b));
    }

    public final String x1(String str, boolean z10) {
        s1();
        String str2 = z10 ? (String) w1(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestJ1 = s3.J1();
        if (messageDigestJ1 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestJ1.digest(str2.getBytes())));
    }

    @Override // zc.k3
    public final void v1() {
    }
}
