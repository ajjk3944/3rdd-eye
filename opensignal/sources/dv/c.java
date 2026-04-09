package dv;

import br.l;
import cv.w;
import sm.m;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final cv.j f7592a;

    /* renamed from: b, reason: collision with root package name */
    public static final cv.j f7593b;

    /* renamed from: c, reason: collision with root package name */
    public static final cv.j f7594c;

    /* renamed from: d, reason: collision with root package name */
    public static final cv.j f7595d;

    /* renamed from: e, reason: collision with root package name */
    public static final cv.j f7596e;

    static {
        cv.j jVar = cv.j.f6715r;
        f7592a = m.m("/");
        f7593b = m.m("\\");
        f7594c = m.m("/\\");
        f7595d = m.m(".");
        f7596e = m.m("..");
    }

    public static final int a(w wVar) {
        cv.j jVar = wVar.f6743a;
        if (jVar.d() != 0) {
            if (jVar.i(0) != 47) {
                if (jVar.i(0) == 92) {
                    if (jVar.d() > 2 && jVar.i(1) == 92) {
                        cv.j jVar2 = f7593b;
                        l.e(jVar2, "other");
                        int iF = jVar.f(2, jVar2.h());
                        return iF == -1 ? jVar.d() : iF;
                    }
                } else if (jVar.d() > 2 && jVar.i(1) == 58 && jVar.i(2) == 92) {
                    char cI = (char) jVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final w b(w wVar, w wVar2, boolean z10) {
        l.e(wVar2, "child");
        if (a(wVar2) != -1 || wVar2.f() != null) {
            return wVar2;
        }
        cv.j jVarC = c(wVar);
        if (jVarC == null && (jVarC = c(wVar2)) == null) {
            jVarC = f(w.f6742d);
        }
        cv.g gVar = new cv.g();
        gVar.n0(wVar.f6743a);
        if (gVar.f6706d > 0) {
            gVar.n0(jVarC);
        }
        gVar.n0(wVar2.f6743a);
        return d(gVar, z10);
    }

    public static final cv.j c(w wVar) {
        cv.j jVar = wVar.f6743a;
        cv.j jVar2 = f7592a;
        if (cv.j.g(jVar, jVar2) != -1) {
            return jVar2;
        }
        cv.j jVar3 = wVar.f6743a;
        cv.j jVar4 = f7593b;
        if (cv.j.g(jVar3, jVar4) != -1) {
            return jVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final cv.w d(cv.g r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.c.d(cv.g, boolean):cv.w");
    }

    public static final cv.j e(byte b2) {
        if (b2 == 47) {
            return f7592a;
        }
        if (b2 == 92) {
            return f7593b;
        }
        throw new IllegalArgumentException(h0.b.h(b2, "not a directory separator: "));
    }

    public static final cv.j f(String str) {
        if (l.a(str, "/")) {
            return f7592a;
        }
        if (l.a(str, "\\")) {
            return f7593b;
        }
        throw new IllegalArgumentException(c7.a.p("not a directory separator: ", str));
    }
}
