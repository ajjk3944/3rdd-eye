package b5;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1848b;

    public /* synthetic */ p(int i4, Object obj) {
        this.f1847a = i4;
        this.f1848b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1847a) {
            case 0:
                s sVar = (s) this.f1848b;
                Dialog dialog = sVar.f1867k0;
                if (dialog != null) {
                    sVar.onCancel(dialog);
                    break;
                }
                break;
            default:
                ((ya.g) this.f1848b).b();
                break;
        }
    }
}
