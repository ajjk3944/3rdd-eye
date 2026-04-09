package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class C7 extends U6 {

    /* renamed from: d, reason: collision with root package name */
    private String f35823d;

    /* renamed from: e, reason: collision with root package name */
    private Set f35824e;

    /* renamed from: f, reason: collision with root package name */
    private Map f35825f;

    /* renamed from: g, reason: collision with root package name */
    private Long f35826g;

    /* renamed from: h, reason: collision with root package name */
    private Long f35827h;

    C7(C4833d7 c4833d7) {
        super(c4833d7);
    }

    private final E7 u(Integer num) {
        if (this.f35825f.containsKey(num)) {
            return (E7) this.f35825f.get(num);
        }
        E7 e72 = new E7(this, this.f35823d);
        this.f35825f.put(num, e72);
        return e72;
    }

    private final boolean w(int i10, int i11) {
        E7 e72 = (E7) this.f35825f.get(Integer.valueOf(i10));
        if (e72 == null) {
            return false;
        }
        return e72.f35861d.get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x05dd, code lost:
    
        r7 = zzj().H();
        r8 = com.google.android.gms.measurement.internal.L2.r(r52.f35823d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05ef, code lost:
    
        if (r9.N() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05f1, code lost:
    
        r9 = java.lang.Integer.valueOf(r9.j());
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05fa, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05fb, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r9));
        r9 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List v(java.lang.String r53, java.util.List r54, java.util.List r55, java.lang.Long r56, java.lang.Long r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7.v(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }
}
