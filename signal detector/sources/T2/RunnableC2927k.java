package t2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: t2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2927k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23630d;

    public RunnableC2927k(C2928l c2928l, Context context, String str, boolean z6, boolean z7) {
        this.f23627a = context;
        this.f23628b = str;
        this.f23629c = z6;
        this.f23630d = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2911G c2911g = p2.j.f22785C.f22790c;
        Context context = this.f23627a;
        AlertDialog.Builder builderL = C2911G.l(context);
        builderL.setMessage(this.f23628b);
        if (this.f23629c) {
            builderL.setTitle("Error");
        } else {
            builderL.setTitle("Info");
        }
        if (this.f23630d) {
            builderL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderL.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC2920d(this, context));
            builderL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderL.create().show();
    }
}
