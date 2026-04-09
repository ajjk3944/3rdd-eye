package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1511hw implements QD {
    public final /* synthetic */ C7Q A00;
    public final /* synthetic */ Q8 A01;

    public C1511hw(C7Q c7q, Q8 q82) {
        this.A00 = c7q;
        this.A01 = q82;
    }

    @Override // com.instagram.common.viewpoint.core.QD
    public final Object A5G(int i4) {
        Q6 compatInfo = this.A01.A00(i4);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.QD
    public final List<Object> A6Y(String str, int i4) {
        List<Q6> listA03 = this.A01.A03(str, i4);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i10 = 0; i10 < infoCount; i10++) {
            arrayList.add(listA03.get(i10).A0M());
        }
        return arrayList;
    }

    @Override // com.instagram.common.viewpoint.core.QD
    public final Object A6Z(int i4) {
        Q6 compatInfo = this.A01.A01(i4);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.QD
    public final boolean AGv(int i4, int i10, Bundle bundle) {
        return this.A01.A04(i4, i10, bundle);
    }
}
