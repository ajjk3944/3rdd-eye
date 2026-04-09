package com.bytedance.sdk.openadsdk.emc.ypw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

    public msw(Context context, rie rieVar, int i, boolean z6) {
        this.ypw = rieVar;
        this.xq = context;
        this.bw = i;
        this.ycc = rieVar.tx();
        String strXq = tp.xq(i);
        this.uym = strXq;
        if (z6) {
            this.dg = new emc(context, rieVar, strXq);
            this.emc = new vk(context, this, rieVar, emc(i), this.dg);
        }
    }

    private List<View> emc(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                linkedList.add(list2.get(i3));
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
    public void loss(Double d6, String str, String str2) {
        if (this.zz) {
            return;
        }
        xmt.emc(this.ypw, d6, str, str2);
        this.zz = true;
    }

    public emc msw() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
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
    public void win(Double d6) {
        if (this.msw) {
            return;
        }
        xmt.emc(this.ypw, d6);
        this.msw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String emc(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void emc(String str) {
        this.uym = str;
    }

    public void emc(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final ycc yccVar) {
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
