package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uo implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ uo(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f) {
            case 0:
                xo xoVar = (xo) this.g;
                Dialog dialog = xoVar.k0;
                if (dialog != null) {
                    xoVar.onCancel(dialog);
                    break;
                }
                break;
            case 1:
                ((mq1) this.g).b();
                break;
            case 2:
                ((JsResult) this.g).cancel();
                break;
            case 3:
                ((JsPromptResult) this.g).cancel();
                break;
            default:
                jh1 jh1Var = (jh1) this.g;
                if (jh1Var != null) {
                    jh1Var.y();
                    break;
                }
                break;
        }
    }
}
