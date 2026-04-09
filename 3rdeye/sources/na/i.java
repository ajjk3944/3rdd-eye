package na;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: HijrahChronology.java */
/* loaded from: classes3.dex */
public final class i extends g implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final i f44435d = new i();

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BH", "HE"});
        map2.put("en", new String[]{"B.H.", "H.E."});
        map3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private Object readResolve() {
        return f44435d;
    }

    @Override // na.g
    public final b a(qa.e eVar) {
        return eVar instanceof j ? (j) eVar : new j(eVar.getLong(qa.a.EPOCH_DAY));
    }

    @Override // na.g
    public final h e(int i) {
        if (i == 0) {
            return k.BEFORE_AH;
        }
        if (i == 1) {
            return k.AH;
        }
        throw new ma.a("invalid Hijrah era");
    }

    @Override // na.g
    public final String g() {
        return "islamic-umalqura";
    }

    @Override // na.g
    public final String h() {
        return "Hijrah-umalqura";
    }

    @Override // na.g
    public final e<j> k(ma.d dVar, ma.p pVar) {
        return f.w0(this, dVar, pVar);
    }
}
