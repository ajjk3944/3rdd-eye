package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class WX extends UO<String> {
    public final /* synthetic */ V7 A00;
    public final /* synthetic */ WW A01;

    public WX(WW ww, V7 v72) {
        this.A01 = ww;
        this.A00 = v72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UO
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A02(String str) {
        super.A02(str);
        if (this.A00.A0B()) {
            this.A01.A02.A62();
        } else {
            this.A01.A02.A61();
        }
    }

    @Override // com.instagram.common.viewpoint.core.UO
    public final void A01(int i4, String str) {
        super.A01(i4, str);
    }
}
