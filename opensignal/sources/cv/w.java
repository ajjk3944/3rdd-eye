package cv;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6742d;

    /* renamed from: a, reason: collision with root package name */
    public final j f6743a;

    static {
        String str = File.separator;
        br.l.d(str, "separator");
        f6742d = str;
    }

    public w(j jVar) {
        br.l.e(jVar, "bytes");
        this.f6743a = jVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = dv.c.a(this);
        j jVar = this.f6743a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < jVar.d() && jVar.i(iA) == 92) {
            iA++;
        }
        int iD = jVar.d();
        int i10 = iA;
        while (iA < iD) {
            if (jVar.i(iA) == 47 || jVar.i(iA) == 92) {
                arrayList.add(jVar.n(i10, iA));
                i10 = iA + 1;
            }
            iA++;
        }
        if (i10 < jVar.d()) {
            arrayList.add(jVar.n(i10, jVar.d()));
        }
        return arrayList;
    }

    public final w b() {
        j jVar = dv.c.f7595d;
        j jVar2 = this.f6743a;
        if (br.l.a(jVar2, jVar)) {
            return null;
        }
        j jVar3 = dv.c.f7592a;
        if (br.l.a(jVar2, jVar3)) {
            return null;
        }
        j jVar4 = dv.c.f7593b;
        if (br.l.a(jVar2, jVar4)) {
            return null;
        }
        j jVar5 = dv.c.f7596e;
        jVar2.getClass();
        br.l.e(jVar5, "suffix");
        int iD = jVar2.d();
        byte[] bArr = jVar5.f6716a;
        if (jVar2.m(iD - bArr.length, jVar5, bArr.length) && (jVar2.d() == 2 || jVar2.m(jVar2.d() - 3, jVar3, 1) || jVar2.m(jVar2.d() - 3, jVar4, 1))) {
            return null;
        }
        int iK = j.k(jVar2, jVar3);
        if (iK == -1) {
            iK = j.k(jVar2, jVar4);
        }
        if (iK == 2 && f() != null) {
            if (jVar2.d() == 3) {
                return null;
            }
            return new w(j.o(jVar2, 0, 3, 1));
        }
        if (iK == 1) {
            br.l.e(jVar4, "prefix");
            if (jVar2.m(0, jVar4, jVar4.d())) {
                return null;
            }
        }
        if (iK != -1 || f() == null) {
            return iK == -1 ? new w(jVar) : iK == 0 ? new w(j.o(jVar2, 0, 1, 1)) : new w(j.o(jVar2, 0, iK, 1));
        }
        if (jVar2.d() == 2) {
            return null;
        }
        return new w(j.o(jVar2, 0, 2, 1));
    }

    public final w c(w wVar) {
        br.l.e(wVar, "other");
        j jVar = wVar.f6743a;
        int iA = dv.c.a(this);
        j jVar2 = this.f6743a;
        w wVar2 = iA == -1 ? null : new w(jVar2.n(0, iA));
        int iA2 = dv.c.a(wVar);
        if (!br.l.a(wVar2, iA2 != -1 ? new w(jVar.n(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + wVar).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = wVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i10 = 0;
        while (i10 < iMin && br.l.a(arrayListA.get(i10), arrayListA2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && jVar2.d() == jVar.d()) {
            return cg.e.q(".");
        }
        if (arrayListA2.subList(i10, arrayListA2.size()).indexOf(dv.c.f7596e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + wVar).toString());
        }
        g gVar = new g();
        j jVarC = dv.c.c(wVar);
        if (jVarC == null && (jVarC = dv.c.c(this)) == null) {
            jVarC = dv.c.f(f6742d);
        }
        int size = arrayListA2.size();
        for (int i11 = i10; i11 < size; i11++) {
            gVar.n0(dv.c.f7596e);
            gVar.n0(jVarC);
        }
        int size2 = arrayListA.size();
        while (i10 < size2) {
            gVar.n0((j) arrayListA.get(i10));
            gVar.n0(jVarC);
            i10++;
        }
        return dv.c.d(gVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        br.l.e(wVar, "other");
        return this.f6743a.compareTo(wVar.f6743a);
    }

    public final w d(String str) {
        br.l.e(str, "child");
        g gVar = new g();
        gVar.u0(str);
        return dv.c.b(this, dv.c.d(gVar, false), false);
    }

    public final Path e() {
        Path path = Paths.get(this.f6743a.q(), new String[0]);
        br.l.d(path, "get(...)");
        return path;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && br.l.a(((w) obj).f6743a, this.f6743a);
    }

    public final Character f() {
        j jVar = dv.c.f7592a;
        j jVar2 = this.f6743a;
        if (j.g(jVar2, jVar) != -1 || jVar2.d() < 2 || jVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) jVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.f6743a.hashCode();
    }

    public final File toFile() {
        return new File(this.f6743a.q());
    }

    public final String toString() {
        return this.f6743a.q();
    }
}
