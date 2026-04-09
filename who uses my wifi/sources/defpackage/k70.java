package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.webkit.JsPromptResult;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k70 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k70(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        switch (this.f) {
            case 0:
                l70 l70Var = (l70) this.g;
                l70Var.x0 = i;
                l70Var.w0 = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                ((AtomicInteger) this.g).set(i);
                break;
            case 2:
                ((mq1) this.g).b();
                break;
            case 3:
                lf4 lf4Var = hg4.C.c;
                lf4.u((Context) this.g, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
            case 4:
                ((p82) this.g).G("User canceled the download.");
                break;
            default:
                ((JsPromptResult) this.g).cancel();
                break;
        }
    }

    public k70(is1 is1Var, Context context) {
        this.f = 3;
        this.g = context;
    }
}
