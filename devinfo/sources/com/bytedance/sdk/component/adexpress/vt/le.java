package com.bytedance.sdk.component.adexpress.vt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.vt.tlj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le implements tlj {

    /* renamed from: lh, reason: collision with root package name */
    private mwh f7394lh;
    public ouw ouw;
    private Context vt;

    public le(Context context, mwh mwhVar, ouw ouwVar) {
        this.vt = context;
        this.ouw = ouwVar;
        this.f7394lh = mwhVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        this.f7394lh.vt.ra();
        this.ouw.ouw(new ra() { // from class: com.bytedance.sdk.component.adexpress.vt.le.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                if (ouwVar.yu()) {
                    return;
                }
                ko koVarVt = ouwVar.vt();
                if (koVarVt != null) {
                    koVarVt.ouw(le.this.ouw, jgVar);
                }
                ouwVar.lh();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i4, String str) {
                ko koVarVt = ouwVar.vt();
                if (koVarVt != null) {
                    koVarVt.a_(i4);
                }
            }
        });
        return true;
    }
}
