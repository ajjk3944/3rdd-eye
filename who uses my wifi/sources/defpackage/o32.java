package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o32 implements y32 {
    public static final /* synthetic */ o32 g = new o32(20);
    public static final /* synthetic */ o32 h = new o32(21);
    public static final /* synthetic */ o32 i = new o32(22);
    public static final /* synthetic */ o32 j = new o32(23);
    public static final /* synthetic */ o32 k = new o32(24);
    public static final /* synthetic */ o32 l = new o32(27);
    public final /* synthetic */ int f;

    public /* synthetic */ o32(int i2) {
        this.f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(java.lang.Object r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o32.a(java.lang.Object, java.util.Map):void");
    }

    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            gi2.i0(sb.toString());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:379|75|76|(12:367|78|79|(10:85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(2:99|(1:101)))|102|369|103|(1:108)(1:109)|360|110|391|116)(1:83)|82|(0)|102|369|103|(0)(0)|360|110|391|116|73) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x032e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032f, code lost:
    
        defpackage.hg4.C.h.d(r3.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0347, code lost:
    
        defpackage.gi2.c0("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dd  */
    @Override // defpackage.y32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r20, java.util.Map r21) throws org.json.JSONException, java.net.URISyntaxException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o32.c(java.lang.Object, java.util.Map):void");
    }
}
