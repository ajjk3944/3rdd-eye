package e5;

import androidx.media3.common.a1;
import androidx.media3.common.y0;
import androidx.media3.common.z0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class a0 implements g0 {

    /* renamed from: g, reason: collision with root package name */
    public static final d5.j f7797g = new d5.j(1);

    /* renamed from: h, reason: collision with root package name */
    public static final Random f7798h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public Object f7802d;

    /* renamed from: f, reason: collision with root package name */
    public String f7804f;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f7799a = new z0();

    /* renamed from: b, reason: collision with root package name */
    public final y0 f7800b = new y0();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7801c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public a1 f7803e = a1.f1564a;

    public final synchronized boolean a(a aVar, String str) {
        z zVar = (z) this.f7801c.get(str);
        if (zVar == null) {
            return false;
        }
        int i10 = aVar.f7790c;
        o5.z zVar2 = aVar.f7791d;
        if (zVar.f7955c == -1 && i10 == zVar.f7954b && zVar2 != null) {
            zVar.f7955c = zVar2.f1692d;
        }
        return zVar.a(i10, zVar2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e5.f0, java.lang.Object] */
    public final synchronized void b(a aVar) {
        ?? r22;
        this.f7804f = null;
        Iterator it = this.f7801c.values().iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            it.remove();
            if (zVar.f7957e && (r22 = this.f7802d) != 0) {
                r22.onSessionFinished(aVar, zVar.f7953a, false);
            }
        }
    }

    public final z c(int i10, o5.z zVar) {
        HashMap map = this.f7801c;
        z zVar2 = null;
        long j = Long.MAX_VALUE;
        for (z zVar3 : map.values()) {
            if (zVar3.f7955c == -1 && i10 == zVar3.f7954b && zVar != null) {
                zVar3.f7955c = zVar.f1692d;
            }
            if (zVar3.a(i10, zVar)) {
                long j7 = zVar3.f7955c;
                if (j7 == -1 || j7 < j) {
                    zVar2 = zVar3;
                    j = j7;
                } else if (j7 == j) {
                    int i11 = a5.d0.f105a;
                    if (zVar2.f7956d != null && zVar3.f7956d != null) {
                        zVar2 = zVar3;
                    }
                }
            }
        }
        if (zVar2 != null) {
            return zVar2;
        }
        String str = (String) f7797g.get();
        z zVar4 = new z(this, str, i10, zVar);
        map.put(str, zVar4);
        return zVar4;
    }

    public final synchronized String d(a1 a1Var, o5.z zVar) {
        return c(a1Var.g(zVar.f1689a, this.f7800b).f1829g, zVar).f7953a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e5.f0, java.lang.Object] */
    public final void e(a aVar) {
        o5.z zVar;
        a1 a1Var = aVar.f7789b;
        int i10 = aVar.f7790c;
        o5.z zVar2 = aVar.f7791d;
        if (a1Var.p()) {
            this.f7804f = null;
            return;
        }
        z zVar3 = (z) this.f7801c.get(this.f7804f);
        String str = c(i10, zVar2).f7953a;
        this.f7804f = str;
        f(aVar);
        if (zVar2 != null) {
            long j = zVar2.f1692d;
            if (zVar2.a()) {
                if (zVar3 != null && zVar3.f7955c == j && (zVar = zVar3.f7956d) != null && zVar.f1690b == zVar2.f1690b && zVar.f1691c == zVar2.f1691c) {
                    return;
                }
                this.f7802d.onAdPlaybackStarted(aVar, c(i10, new o5.z(zVar2.f1689a, j)).f7953a, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r3.f1692d < r4) goto L21;
     */
    /* JADX WARN: Type inference failed for: r3v11, types: [e5.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [e5.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [e5.f0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(e5.a r23) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a0.f(e5.a):void");
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [e5.f0, java.lang.Object] */
    public final synchronized void g(a aVar, int i10) {
        try {
            this.f7802d.getClass();
            boolean z10 = i10 == 0;
            Iterator it = this.f7801c.values().iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (zVar.b(aVar)) {
                    it.remove();
                    if (zVar.f7957e) {
                        boolean zEquals = zVar.f7953a.equals(this.f7804f);
                        boolean z11 = z10 && zEquals && zVar.f7958f;
                        if (zEquals) {
                            this.f7804f = null;
                        }
                        this.f7802d.onSessionFinished(aVar, zVar.f7953a, z11);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [e5.f0, java.lang.Object] */
    public final synchronized void h(a aVar) {
        try {
            this.f7802d.getClass();
            a1 a1Var = this.f7803e;
            this.f7803e = aVar.f7789b;
            Iterator it = this.f7801c.values().iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (!zVar.c(a1Var, this.f7803e) || zVar.b(aVar)) {
                    it.remove();
                    if (zVar.f7957e) {
                        if (zVar.f7953a.equals(this.f7804f)) {
                            this.f7804f = null;
                        }
                        this.f7802d.onSessionFinished(aVar, zVar.f7953a, false);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
