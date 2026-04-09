package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ZF {

    /* renamed from: b, reason: collision with root package name */
    public static final ZF f12810b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12811a = new AtomicReference(new C2008vG(new C2222zE(2)));

    static {
        try {
            ZF zf = new ZF();
            zf.a(new JF(PF.class, C1414kF.f15101l));
            f12810b = zf;
        } catch (Exception e6) {
            throw new J0.c(e6);
        }
    }

    public final synchronized void a(JF jf) {
        AtomicReference atomicReference = this.f12811a;
        C2222zE c2222zE = new C2222zE((C2008vG) atomicReference.get());
        c2222zE.b(jf);
        atomicReference.set(new C2008vG(c2222zE));
    }

    public final synchronized void b(HF hf) {
        AtomicReference atomicReference = this.f12811a;
        C2222zE c2222zE = new C2222zE((C2008vG) atomicReference.get());
        c2222zE.f(hf);
        atomicReference.set(new C2008vG(c2222zE));
    }

    public final synchronized void c(C1037dG c1037dG) {
        AtomicReference atomicReference = this.f12811a;
        C2222zE c2222zE = new C2222zE((C2008vG) atomicReference.get());
        c2222zE.h(c1037dG);
        atomicReference.set(new C2008vG(c2222zE));
    }

    public final synchronized void d(C0928bG c0928bG) {
        AtomicReference atomicReference = this.f12811a;
        C2222zE c2222zE = new C2222zE((C2008vG) atomicReference.get());
        c2222zE.i(c0928bG);
        atomicReference.set(new C2008vG(c2222zE));
    }

    public final Cr e(C1631oG c1631oG) throws GeneralSecurityException {
        C2008vG c2008vG = (C2008vG) this.f12811a.get();
        c2008vG.getClass();
        C1900tG c1900tG = new C1900tG(C1631oG.class, c1631oG.f15923b);
        HashMap map = c2008vG.f17250b;
        if (map.containsKey(c1900tG)) {
            return ((HF) map.get(c1900tG)).f8881b.b(c1631oG);
        }
        String string = c1900tG.toString();
        throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final InterfaceC1846sG f(Cr cr) throws GeneralSecurityException {
        C2008vG c2008vG = (C2008vG) this.f12811a.get();
        c2008vG.getClass();
        C1954uG c1954uG = new C1954uG(cr.getClass(), C1631oG.class);
        HashMap map = c2008vG.f17249a;
        if (map.containsKey(c1954uG)) {
            return ((JF) map.get(c1954uG)).f9270b.c(cr);
        }
        String string = c1954uG.toString();
        throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final AbstractC1089eE g(C1685pG c1685pG) throws GeneralSecurityException {
        C2008vG c2008vG = (C2008vG) this.f12811a.get();
        c2008vG.getClass();
        C1900tG c1900tG = new C1900tG(C1685pG.class, c1685pG.f16154a);
        HashMap map = c2008vG.f17252d;
        if (map.containsKey(c1900tG)) {
            return ((C0928bG) map.get(c1900tG)).f13338b.a(c1685pG);
        }
        String string = c1900tG.toString();
        throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final InterfaceC1846sG h(AbstractC1089eE abstractC1089eE) throws GeneralSecurityException {
        C2008vG c2008vG = (C2008vG) this.f12811a.get();
        c2008vG.getClass();
        C1954uG c1954uG = new C1954uG(abstractC1089eE.getClass(), C1685pG.class);
        HashMap map = c2008vG.f17251c;
        if (map.containsKey(c1954uG)) {
            return ((C1037dG) map.get(c1954uG)).f13749b.e(abstractC1089eE);
        }
        String string = c1954uG.toString();
        throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}
