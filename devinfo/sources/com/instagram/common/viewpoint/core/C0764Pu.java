package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0764Pu implements Comparator<View> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(View view, View view2) {
        C0758Po c0758Po = (C0758Po) view.getLayoutParams();
        C0758Po c0758Po2 = (C0758Po) view2.getLayoutParams();
        if (c0758Po.A05 != c0758Po2.A05) {
            return c0758Po.A05 ? 1 : -1;
        }
        return c0758Po.A02 - c0758Po2.A02;
    }
}
