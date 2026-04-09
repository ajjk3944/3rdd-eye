package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh0 implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh0 f14702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xa.i f14703c;

    public /* synthetic */ oh0(qh0 qh0Var, xa.i iVar, int i4) {
        this.f14701a = i4;
        this.f14702b = qh0Var;
        this.f14703c = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        switch (this.f14701a) {
            case 0:
                qh0 qh0Var = this.f14702b;
                qh0Var.f15346e.e(qh0Var.f15347f);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                qh0Var.n4(qh0Var.f15347f, "dialog_click", map);
                xa.i iVar = this.f14703c;
                if (iVar != null) {
                    iVar.m();
                    break;
                }
                break;
            default:
                qh0 qh0Var2 = this.f14702b;
                qh0Var2.f15346e.e(qh0Var2.f15347f);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                qh0Var2.n4(qh0Var2.f15347f, "rtsdc", map2);
                xa.i iVar2 = this.f14703c;
                if (iVar2 != null) {
                    iVar2.m();
                    break;
                }
                break;
        }
    }
}
