package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.gQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3460gQ implements PZ {
    public final /* synthetic */ C23236k A00;
    public final /* synthetic */ PU A01;

    public C3460gQ(C23236k c23236k, PU pu) {
        this.A00 = c23236k;
        this.A01 = pu;
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final Object A58(int i) {
        PS compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final List<Object> A6Q(String str, int i) {
        List<PS> listA03 = this.A01.A03(str, i);
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

    @Override // com.facebook.ads.redexgen.core.PZ
    public final Object A6R(int i) {
        PS compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final boolean AGB(int i, int i10, Bundle bundle) {
        return this.A01.A04(i, i10, bundle);
    }
}
