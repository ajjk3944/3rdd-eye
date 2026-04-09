package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends TTDislikeDialogAbstract {
    public String fkw;
    ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void lh();

        void ouw();

        void ouw(FilterWord filterWord);

        void vt();
    }

    public yu(Context context, String str, List<FilterWord> list) {
        super(context, vpp.le(context, "tt_dislikeDialog"));
        this.ouw = str;
        this.vt = list;
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public final ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(osn.yu(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public final View getLayoutView() {
        return new bly(getContext(), this.f7689lh, this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            Window window = getWindow();
            if (window != null && window.getAttributes() != null) {
                window.getAttributes().windowAnimations = 0;
            }
            setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.lh.yu.1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    if (yu.this.yu != null) {
                        yu.this.yu.vt();
                    }
                }
            });
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.lh.yu.2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (yu.this.yu != null) {
                        yu.this.yu.lh();
                    }
                }
            });
            setMaterialMeta(this.ouw, this.vt);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            ko.vt("dislike bad token");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.vt
    public final void ouw(int i4) {
        FilterWord filterWord;
        if (tlj.f8582lh == i4) {
            dismiss();
            return;
        }
        if (tlj.fkw == i4) {
            ouw ouwVar = this.yu;
            if (ouwVar != null) {
                ouwVar.ouw();
                return;
            }
            return;
        }
        if (tlj.vt != i4 || (filterWord = this.f7689lh.vm) == null || tlj.ouw.equals(filterWord)) {
            return;
        }
        ouw ouwVar2 = this.yu;
        if (ouwVar2 != null) {
            try {
                ouwVar2.ouw(filterWord);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }
}
