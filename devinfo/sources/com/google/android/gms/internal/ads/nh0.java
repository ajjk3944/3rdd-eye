package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14292c;

    public /* synthetic */ nh0(int i4, Object obj, Object obj2) {
        this.f14290a = i4;
        this.f14291b = obj;
        this.f14292c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f14290a) {
            case 0:
                qh0 qh0Var = (qh0) this.f14291b;
                xa.i iVar = (xa.i) this.f14292c;
                qh0Var.f15346e.e(qh0Var.f15347f);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                qh0Var.n4(qh0Var.f15347f, "dialog_click", map);
                if (iVar != null) {
                    iVar.m();
                    break;
                }
                break;
            case 1:
                qh0 qh0Var2 = (qh0) this.f14291b;
                xa.i iVar2 = (xa.i) this.f14292c;
                qh0Var2.f15346e.e(qh0Var2.f15347f);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                qh0Var2.n4(qh0Var2.f15347f, "rtsdc", map2);
                if (iVar2 != null) {
                    iVar2.m();
                    break;
                }
                break;
            default:
                ((JsPromptResult) this.f14291b).confirm(((EditText) this.f14292c).getText().toString());
                break;
        }
    }
}
