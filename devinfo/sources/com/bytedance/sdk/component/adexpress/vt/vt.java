package com.bytedance.sdk.component.adexpress.vt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.tlj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements tlj {
    private ThemeStatusBroadcastReceiver fkw;

    /* renamed from: le, reason: collision with root package name */
    private pno f7415le;

    /* renamed from: lh, reason: collision with root package name */
    int f7416lh;
    com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouw;
    mwh vt;
    private Context yu;

    public vt(Context context, mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, pno pnoVar, com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouwVar) {
        this.yu = context;
        this.vt = mwhVar;
        this.fkw = themeStatusBroadcastReceiver;
        this.f7415le = pnoVar;
        this.ouw = ouwVar;
        ouwVar.vt = pnoVar;
        this.f7416lh = 3;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final boolean ouw(final tlj.ouw ouwVar) {
        this.vt.vt.ouw(this.f7416lh);
        this.ouw.ouw(new ra() { // from class: com.bytedance.sdk.component.adexpress.vt.vt.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, jg jgVar) {
                if (ouwVar.yu()) {
                    return;
                }
                vt vtVar = vt.this;
                vtVar.vt.vt.fkw(vtVar.f7416lh);
                vt vtVar2 = vt.this;
                vtVar2.vt.vt.le(vtVar2.f7416lh);
                vt.this.vt.vt.cf();
                ko koVarVt = ouwVar.vt();
                if (koVarVt == null) {
                    return;
                }
                koVarVt.ouw(vt.this.ouw, jgVar);
                ouwVar.lh();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i4, String str) {
                vt vtVar = vt.this;
                vtVar.vt.vt.ouw(vtVar.f7416lh, i4, str, ouwVar.vt(vtVar));
                if (ouwVar.vt(vt.this)) {
                    ouwVar.ouw(vt.this);
                    return;
                }
                ko koVarVt = ouwVar.vt();
                if (koVarVt == null) {
                    return;
                }
                koVarVt.a_(i4);
            }
        });
        return true;
    }

    public final com.bytedance.sdk.component.adexpress.dynamic.yu vt() {
        com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.ouw;
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.tlj
    public final void ouw() {
        com.bytedance.sdk.component.adexpress.dynamic.ouw.ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.ouw();
        }
    }
}
