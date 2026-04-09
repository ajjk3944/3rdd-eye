package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import java.util.HashMap;
import s2.BinderC2894d;

/* renamed from: com.google.android.gms.internal.ads.Op, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0667Op implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10252c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0667Op(Object obj, int i, Object obj2) {
        this.f10250a = i;
        this.f10251b = obj;
        this.f10252c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10250a) {
            case 0:
                BinderC0718Rp binderC0718Rp = (BinderC0718Rp) this.f10251b;
                BinderC2894d binderC2894d = (BinderC2894d) this.f10252c;
                binderC0718Rp.f11051e.b(binderC0718Rp.f11052f);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                binderC0718Rp.Q3(binderC0718Rp.f11052f, map, "dialog_click");
                if (binderC2894d != null) {
                    binderC2894d.z();
                    break;
                }
                break;
            case 1:
                BinderC0718Rp binderC0718Rp2 = (BinderC0718Rp) this.f10251b;
                BinderC2894d binderC2894d2 = (BinderC2894d) this.f10252c;
                binderC0718Rp2.f11051e.b(binderC0718Rp2.f11052f);
                HashMap map2 = new HashMap();
                map2.put("dialog_action", "dismiss");
                binderC0718Rp2.Q3(binderC0718Rp2.f11052f, map2, "rtsdc");
                if (binderC2894d2 != null) {
                    binderC2894d2.z();
                    break;
                }
                break;
            default:
                ((JsPromptResult) this.f10251b).confirm(((EditText) this.f10252c).getText().toString());
                break;
        }
    }
}
