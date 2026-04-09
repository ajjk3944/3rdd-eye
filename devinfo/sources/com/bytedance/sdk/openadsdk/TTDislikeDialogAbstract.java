package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.lh.tlj;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements tlj.vt {

    /* renamed from: lh, reason: collision with root package name */
    protected final tlj f7689lh;
    protected String ouw;
    protected List<FilterWord> vt;
    private View yu;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        tlj tljVar = new tlj();
        this.f7689lh = tljVar;
        tljVar.ouw(this);
    }

    public void destroy() {
        tlj tljVar = this.f7689lh;
        if (tljVar != null) {
            tljVar.ouw();
        }
    }

    public tlj getDislikeManager() {
        return this.f7689lh;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.yu = layoutView;
        if (layoutView == null) {
            ko.yu("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.yu;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        tlj tljVar = this.f7689lh;
        if (tljVar != null) {
            tljVar.vt(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.ouw = str;
        this.vt = list;
        tlj tljVar = this.f7689lh;
        tljVar.bly = str;
        tljVar.ouw(list);
    }

    public TTDislikeDialogAbstract(Context context, int i4) {
        super(context, i4);
        tlj tljVar = new tlj();
        this.f7689lh = tljVar;
        tljVar.ouw(this);
    }
}
