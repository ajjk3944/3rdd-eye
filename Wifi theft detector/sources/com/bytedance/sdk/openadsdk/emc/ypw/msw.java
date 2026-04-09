package com.bytedance.sdk.openadsdk.emc.ypw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.vk;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.xmt;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class msw extends PAGNativeAd {
    protected int bw;
    protected emc dg;
    protected vk emc;
    private boolean msw;
    protected String uym;
    protected final Context xq;
    protected int ycc;
    protected final rie ypw;
    private boolean zz;

    public msw(@NonNull Context context, @NonNull rie rieVar, int i10, boolean z10) {
        this.ypw = rieVar;
        this.xq = context;
        this.bw = i10;
        this.ycc = rieVar.tx();
        String strXq = tp.xq(i10);
        this.uym = strXq;
        if (z10) {
            this.dg = new emc(context, rieVar, strXq);
            this.emc = new vk(context, this, rieVar, emc(i10), this.dg);
        }
    }

    private List<View> emc(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        rie rieVar = this.ypw;
        if (rieVar == null || rieVar.zek() == null) {
            return null;
        }
        try {
            return this.ypw.zek().get(str);
        } catch (Throwable th) {
            ul.xq("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        rie rieVar = this.ypw;
        if (rieVar != null) {
            return rieVar.zek();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new dg(msw());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.zz) {
            return;
        }
        xmt.emc(this.ypw, d10, str, str2);
        this.zz = true;
    }

    public emc msw() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        emc(viewGroup, null, list, list2, view, new uym(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    public boolean uym() {
        rie rieVar = this.ypw;
        return (rieVar == null || rieVar.sx() == 5 || aa.dg().xq(this.ycc) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.msw) {
            return;
        }
        xmt.emc(this.ypw, d10);
        this.msw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String emc(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void emc(String str) {
        this.uym = str;
    }

    public void emc(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final ycc yccVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (uym()) {
            list3 = emc(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && yccVar != null && yccVar.ypw()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.msw.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strEmc = db.emc();
                    TTDelegateActivity.emc(msw.this.ypw, strEmc, new uym.emc() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.msw.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.dg.uym.emc
                        public void emc() {
                            yccVar.emc();
                            zz.ypw().ycc(strEmc);
                            PAGMediaView pAGMediaViewEmc = msw.this.msw().emc();
                            if (pAGMediaViewEmc != null) {
                                pAGMediaViewEmc.close();
                            }
                        }
                    });
                }
            });
        }
        this.emc.emc(viewGroup, list, list2, list4, yccVar);
        rie rieVar = this.ypw;
        com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(viewGroup, this.ypw, (rieVar == null || rieVar.yid() != 2) ? null : new bw.emc(this.ypw.ej()));
    }
}
