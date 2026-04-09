package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class lk extends o implements rj {
    public static final kk g = new kk(pz.h, jk.g);

    public lk() {
        super(pz.h);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [dy, e50] */
    @Override // defpackage.o, defpackage.hk
    public final fk h(gk gkVar) {
        fk fkVar;
        i30.m(gkVar, "key");
        if (gkVar instanceof kk) {
            kk kkVar = (kk) gkVar;
            gk gkVar2 = this.f;
            if ((gkVar2 == kkVar || kkVar.g == gkVar2) && (fkVar = (fk) kkVar.f.g(this)) != null) {
                return fkVar;
            }
        } else if (pz.h == gkVar) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((defpackage.fk) r3.f.g(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (defpackage.pz.h == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return defpackage.ls.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [dy, e50] */
    @Override // defpackage.o, defpackage.hk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hk i(defpackage.gk r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            defpackage.i30.m(r3, r0)
            boolean r0 = r3 instanceof defpackage.kk
            if (r0 == 0) goto L20
            kk r3 = (defpackage.kk) r3
            gk r0 = r2.f
            if (r0 == r3) goto L15
            gk r1 = r3.g
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            e50 r3 = r3.f
            java.lang.Object r3 = r3.g(r2)
            fk r3 = (defpackage.fk) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            pz r0 = defpackage.pz.h
            if (r0 != r3) goto L27
        L24:
            ls r3 = defpackage.ls.f
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.i(gk):hk");
    }

    public abstract void k(hk hkVar, Runnable runnable);

    public boolean l() {
        return !(this instanceof w31);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + um.k(this);
    }
}
