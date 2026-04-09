package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xf2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ JsResult g;

    public /* synthetic */ xf2(JsResult jsResult, int i) {
        this.f = i;
        this.g = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f) {
            case 0:
                this.g.cancel();
                break;
            default:
                this.g.confirm();
                break;
        }
    }
}
