package com.bytedance.sdk.openadsdk.xq;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.List;

/* loaded from: classes.dex */
public class dg extends TTDislikeDialogAbstract {
    private String bw;
    private emc dg;

    public interface emc {
        void emc();

        void emc(int i10, FilterWord filterWord);

        void ypw();
    }

    public dg(Context context, String str, List<FilterWord> list) {
        super(context, rie.ycc(context, "tt_dislikeDialog"));
        this.emc = str;
        this.ypw = list;
    }

    private void ypw() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.xq.dg.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (dg.this.dg != null) {
                    emc unused = dg.this.dg;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.xq.dg.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (dg.this.dg != null) {
                    dg.this.dg.ypw();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(vw.xq(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new zz(getContext(), this.xq, this.ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            emc();
            ypw();
            setMaterialMeta(this.emc, this.ypw);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void emc(emc emcVar) {
        this.dg = emcVar;
    }

    public void emc(String str) {
        this.bw = str;
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.ypw
    public void emc(int i10) {
        FilterWord filterWordYpw;
        if (ru.xq == i10) {
            dismiss();
            return;
        }
        if (ru.bw == i10) {
            emc emcVar = this.dg;
            if (emcVar != null) {
                emcVar.emc();
                return;
            }
            return;
        }
        if (ru.ypw != i10 || (filterWordYpw = this.xq.ypw()) == null || ru.emc.equals(filterWordYpw)) {
            return;
        }
        emc emcVar2 = this.dg;
        if (emcVar2 != null) {
            try {
                emcVar2.emc(0, filterWordYpw);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void emc() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
