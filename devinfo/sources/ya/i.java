package ya;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37465d;

    public i(t5.p pVar, Context context, String str, boolean z3, boolean z10) {
        this.f37462a = context;
        this.f37463b = str;
        this.f37464c = z3;
        this.f37465d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var = ua.j.C.f35261c;
        Context context = this.f37462a;
        AlertDialog.Builder builderL = f0.l(context);
        builderL.setMessage(this.f37463b);
        if (this.f37464c) {
            builderL.setTitle("Error");
        } else {
            builderL.setTitle("Info");
        }
        if (this.f37465d) {
            builderL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderL.setPositiveButton("Learn More", new t.r(this, context));
            builderL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderL.create().show();
    }
}
