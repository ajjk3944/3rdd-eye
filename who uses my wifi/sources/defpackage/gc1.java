package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gc1 extends wc1 {
    public final Context b;
    public final /* synthetic */ fz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc1(fz fzVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0, false);
        this.c = fzVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (message.what != 1) {
            return;
        }
        int i = gz.a;
        fz fzVar = this.c;
        Context context = this.b;
        int iC = fzVar.c(context, i);
        int i2 = oz.c;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = fzVar.b(iC, context, "n");
            fzVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
