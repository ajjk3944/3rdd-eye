package nb;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class k extends b5.s {

    /* renamed from: p0, reason: collision with root package name */
    public Dialog f29908p0;

    /* renamed from: q0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f29909q0;

    /* renamed from: r0, reason: collision with root package name */
    public AlertDialog f29910r0;

    @Override // b5.s
    public final Dialog e0(Bundle bundle) {
        Dialog dialog = this.f29908p0;
        if (dialog != null) {
            return dialog;
        }
        this.f1863g0 = false;
        if (this.f29910r0 == null) {
            Context contextP = p();
            y.h(contextP);
            this.f29910r0 = new AlertDialog.Builder(contextP).create();
        }
        return this.f29910r0;
    }

    @Override // b5.s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f29909q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
