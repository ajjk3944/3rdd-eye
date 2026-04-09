package ks;

import java.util.LinkedHashMap;
import java.util.Map;
import mq.b0;

/* loaded from: classes.dex */
public enum b {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final a Companion = new a();
    private static final Map<Integer, b> entryById;

    /* renamed from: id, reason: collision with root package name */
    private final int f14486id;

    static {
        b[] bVarArrValues = values();
        int iP = b0.P(bVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (b bVar : bVarArrValues) {
            linkedHashMap.put(Integer.valueOf(bVar.f14486id), bVar);
        }
        entryById = linkedHashMap;
    }

    b(int i10) {
        this.f14486id = i10;
    }

    public static final b getById(int i10) {
        Companion.getClass();
        b bVar = (b) entryById.get(Integer.valueOf(i10));
        return bVar == null ? UNKNOWN : bVar;
    }
}
