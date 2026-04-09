package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class o00 implements c72.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f31116a;

    /* renamed from: b, reason: collision with root package name */
    private final List<dc0> f31117b;

    public o00() {
        this(xj0.h());
    }

    @Override // com.yandex.mobile.ads.impl.c72.c
    public final c72 a(int i, c72.b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new pg1(new u11(bVar.f25558a));
            }
            if (i == 21) {
                return new pg1(new gi0());
            }
            if (i == 27) {
                if (a(4)) {
                    return null;
                }
                return new pg1(new ye0(new yw1(a(bVar)), a(1), a(8)));
            }
            if (i == 36) {
                return new pg1(new ze0(new yw1(a(bVar))));
            }
            if (i == 89) {
                return new pg1(new s40(bVar.f25559b));
            }
            if (i != 138) {
                if (i == 172) {
                    return new pg1(new r(bVar.f25558a));
                }
                if (i == 257) {
                    return new sw1(new fg1("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new sw1(new fg1("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (a(2)) {
                                return null;
                            }
                            return new pg1(new bb(bVar.f25558a, false));
                        case 16:
                            return new pg1(new xe0(new r82(a(bVar))));
                        case 17:
                            if (a(2)) {
                                return null;
                            }
                            return new pg1(new rq0(bVar.f25558a));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!a(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new pg1(new C4166o(bVar.f25558a));
            }
            return new pg1(new i40(bVar.f25558a));
        }
        return new pg1(new we0(new r82(a(bVar))));
    }

    public o00(List list) {
        this.f31116a = 0;
        this.f31117b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List<dc0> a(c72.b bVar) {
        String str;
        int i;
        List<byte[]> listSingletonList;
        if (a(32)) {
            return this.f31117b;
        }
        uf1 uf1Var = new uf1(bVar.f25560c);
        ArrayList arrayList = this.f31117b;
        while (uf1Var.a() > 0) {
            int iT = uf1Var.t();
            int iD = uf1Var.d() + uf1Var.t();
            if (iT == 134) {
                arrayList = new ArrayList();
                int iT2 = uf1Var.t() & 31;
                for (int i10 = 0; i10 < iT2; i10++) {
                    String strA = uf1Var.a(3, fo.f27410c);
                    int iT3 = uf1Var.t();
                    boolean z10 = (iT3 & 128) != 0;
                    if (z10) {
                        i = iT3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bT = (byte) uf1Var.t();
                    uf1Var.f(1);
                    if (z10) {
                        listSingletonList = Collections.singletonList((bT & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    arrayList.add(new dc0.a().e(str).d(strA).a(i).a(listSingletonList).a());
                }
            }
            uf1Var.e(iD);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private boolean a(int i) {
        return (i & this.f31116a) != 0;
    }

    @Override // com.yandex.mobile.ads.impl.c72.c
    public final SparseArray<c72> a() {
        return new SparseArray<>();
    }
}
