package na;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: JapaneseEra.java */
/* loaded from: classes3.dex */
public final class p extends pa.a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final p f44475f;

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReference<p[]> f44476g;

    /* renamed from: c, reason: collision with root package name */
    public final int f44477c;

    /* renamed from: d, reason: collision with root package name */
    public final transient ma.e f44478d;

    /* renamed from: e, reason: collision with root package name */
    public final transient String f44479e;

    static {
        p pVar = new p(-1, ma.e.C0(1868, 9, 8), "Meiji");
        f44475f = pVar;
        f44476g = new AtomicReference<>(new p[]{pVar, new p(0, ma.e.C0(1912, 7, 30), "Taisho"), new p(1, ma.e.C0(1926, 12, 25), "Showa"), new p(2, ma.e.C0(1989, 1, 8), "Heisei"), new p(3, ma.e.C0(2019, 5, 1), "Reiwa")});
    }

    public p(int i, ma.e eVar, String str) {
        super(false, 0);
        this.f44477c = i;
        this.f44478d = eVar;
        this.f44479e = str;
    }

    public static p j0(ma.e eVar) {
        if (eVar.y0(f44475f.f44478d)) {
            throw new ma.a("Date too early: " + eVar);
        }
        p[] pVarArr = f44476g.get();
        for (int length = pVarArr.length - 1; length >= 0; length--) {
            p pVar = pVarArr[length];
            if (eVar.compareTo(pVar.f44478d) >= 0) {
                return pVar;
            }
        }
        return null;
    }

    public static p k0(int i) {
        p[] pVarArr = f44476g.get();
        if (i < f44475f.f44477c || i > pVarArr[pVarArr.length - 1].f44477c) {
            throw new ma.a("japaneseEra is invalid");
        }
        return pVarArr[i + 1];
    }

    public static p[] l0() {
        p[] pVarArr = f44476g.get();
        return (p[]) Arrays.copyOf(pVarArr, pVarArr.length);
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return k0(this.f44477c);
        } catch (ma.a e4) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e4);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    public final ma.e i0() {
        int i = this.f44477c;
        int i10 = i + 1;
        p[] pVarArrL0 = l0();
        return i10 >= pVarArrL0.length + (-1) ? ma.e.f44096g : pVarArrL0[i + 2].f44478d.F0(-1L);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        qa.a aVar = qa.a.ERA;
        return hVar == aVar ? n.f44468e.m(aVar) : super.range(hVar);
    }

    public final String toString() {
        return this.f44479e;
    }
}
