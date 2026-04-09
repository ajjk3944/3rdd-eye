package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class is1 implements Runnable {
    public final /* synthetic */ Context f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public is1(us1 us1Var, Context context, String str, boolean z, boolean z2) {
        this.f = context;
        this.g = str;
        this.h = z;
        this.i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4 lf4Var = hg4.C.c;
        Context context = this.f;
        AlertDialog.Builder builderK = lf4.k(context);
        builderK.setMessage(this.g);
        if (this.h) {
            builderK.setTitle("Error");
        } else {
            builderK.setTitle("Info");
        }
        if (this.i) {
            builderK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderK.setPositiveButton("Learn More", new k70(this, context));
            builderK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderK.create().show();
    }
}
