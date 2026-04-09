package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.xq.ru;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements ru.ypw {
    private View dg;
    protected String emc;
    protected final ru xq;
    protected List<FilterWord> ypw;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        ru ruVar = new ru();
        this.xq = ruVar;
        ruVar.emc(this);
    }

    public void destroy() {
        ru ruVar = this.xq;
        if (ruVar != null) {
            ruVar.emc();
        }
    }

    public ru getDislikeManager() {
        return this.xq;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dg = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.dg;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        ru ruVar = this.xq;
        if (ruVar != null) {
            ruVar.xq(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.emc = str;
        this.ypw = list;
        this.xq.emc(str);
        this.xq.emc(this.ypw);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10) {
        super(context, i10);
        ru ruVar = new ru();
        this.xq = ruVar;
        ruVar.emc(this);
    }
}
