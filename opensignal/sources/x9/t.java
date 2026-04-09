package x9;

import com.google.android.exoplayer2.analytics.PlaybackStatsListener;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: g, reason: collision with root package name */
    public static final d5.j f25199g = new d5.j(2);

    /* renamed from: h, reason: collision with root package name */
    public static final Random f25200h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public PlaybackStatsListener f25204d;

    /* renamed from: f, reason: collision with root package name */
    public String f25206f;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f25201a = new v1();

    /* renamed from: b, reason: collision with root package name */
    public final u1 f25202b = new u1();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25203c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public w1 f25205e = w1.f4774a;

    public final synchronized boolean a(q qVar, String str) {
        s sVar = (s) this.f25203c.get(str);
        if (sVar == null) {
            return false;
        }
        int i10 = qVar.f25183c;
        ya.v vVar = qVar.f25184d;
        if (sVar.f25194c == -1 && i10 == sVar.f25193b && vVar != null) {
            sVar.f25194c = vVar.f26180d;
        }
        return sVar.a(i10, vVar);
    }

    public final s b(int i10, ya.v vVar) {
        HashMap map = this.f25203c;
        s sVar = null;
        long j = Long.MAX_VALUE;
        for (s sVar2 : map.values()) {
            if (sVar2.f25194c == -1 && i10 == sVar2.f25193b && vVar != null) {
                sVar2.f25194c = vVar.f26180d;
            }
            if (sVar2.a(i10, vVar)) {
                long j7 = sVar2.f25194c;
                if (j7 == -1 || j7 < j) {
                    sVar = sVar2;
                    j = j7;
                } else if (j7 == j) {
                    int i11 = qb.v.f20828a;
                    if (sVar.f25195d != null && sVar2.f25195d != null) {
                        sVar = sVar2;
                    }
                }
            }
        }
        if (sVar != null) {
            return sVar;
        }
        String str = (String) f25199g.get();
        s sVar3 = new s(this, str, i10, vVar);
        map.put(str, sVar3);
        return sVar3;
    }

    public final void c(q qVar) {
        ya.v vVar;
        w1 w1Var = qVar.f25182b;
        int i10 = qVar.f25183c;
        ya.v vVar2 = qVar.f25184d;
        if (w1Var.p()) {
            this.f25206f = null;
            return;
        }
        s sVar = (s) this.f25203c.get(this.f25206f);
        String str = b(i10, vVar2).f25192a;
        this.f25206f = str;
        d(qVar);
        if (vVar2 != null) {
            long j = vVar2.f26180d;
            if (vVar2.a()) {
                if (sVar != null && sVar.f25194c == j && (vVar = sVar.f25195d) != null && vVar.f26178b == vVar2.f26178b && vVar.f26179c == vVar2.f26179c) {
                    return;
                }
                this.f25204d.onAdPlaybackStarted(qVar, b(i10, new ya.v(vVar2.f26177a, j)).f25192a, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r3.f26180d < r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(x9.q r23) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.t.d(x9.q):void");
    }
}
