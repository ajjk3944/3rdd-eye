package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class qm1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qm1(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f) {
            case 0:
                mq1 mq1Var = (mq1) this.g;
                String str = (String) this.h;
                mq1Var.getClass();
                lf4 lf4Var = hg4.C.c;
                lf4.s(mq1Var.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
                break;
            default:
                ((JsPromptResult) this.g).confirm(((EditText) this.h).getText().toString());
                break;
        }
    }
}
