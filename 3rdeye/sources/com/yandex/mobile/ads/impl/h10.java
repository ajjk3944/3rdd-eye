package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes3.dex */
public final class h10 implements tr {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f28067a;

    public final void a(Dialog dialog) {
        kotlin.jvm.internal.l.f(dialog, "dialog");
        this.f28067a = dialog;
        dialog.setOnDismissListener(new N0(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void f() {
        Dialog dialog = this.f28067a;
        if (dialog != null) {
            i10.a(dialog);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h10 this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Dialog dialog = this$0.f28067a;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        this$0.f28067a = null;
    }
}
