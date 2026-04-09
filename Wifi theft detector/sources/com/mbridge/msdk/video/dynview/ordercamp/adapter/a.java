package com.mbridge.msdk.video.dynview.ordercamp.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f18770a = false;

    /* renamed from: b, reason: collision with root package name */
    private b f18771b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f18772c;

    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.adapter.a$a, reason: collision with other inner class name */
    public class C0333a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f18773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18774b;

        public C0333a(ImageView imageView, boolean z10) {
            this.f18773a = imageView;
            this.f18774b = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (this.f18774b) {
                this.f18773a.setVisibility(8);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                this.f18773a.setImageBitmap(bitmap);
            } catch (Throwable th) {
                q0.b("OrderCampAdapter", th.getMessage());
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f18776a;

        /* renamed from: b, reason: collision with root package name */
        MBRotationView f18777b;

        /* renamed from: c, reason: collision with root package name */
        MBridgeImageView f18778c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f18779d;

        /* renamed from: e, reason: collision with root package name */
        TextView f18780e;

        /* renamed from: f, reason: collision with root package name */
        TextView f18781f;

        /* renamed from: g, reason: collision with root package name */
        TextView f18782g;

        /* renamed from: h, reason: collision with root package name */
        TextView f18783h;

        /* renamed from: i, reason: collision with root package name */
        MBridgeLevelLayoutView f18784i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f18785j;

        /* renamed from: k, reason: collision with root package name */
        ImageView f18786k;

        /* renamed from: l, reason: collision with root package name */
        MBCusRoundImageView f18787l;

        /* renamed from: m, reason: collision with root package name */
        MBCusRoundImageView f18788m;

        /* renamed from: n, reason: collision with root package name */
        MBStarLevelLayoutView f18789n;

        /* renamed from: o, reason: collision with root package name */
        MBHeatLevelLayoutView f18790o;

        /* renamed from: p, reason: collision with root package name */
        MBFrameLayout f18791p;
    }

    public a(List<CampaignEx> list) {
        this.f18772c = list;
    }

    private void a(int i10, ViewGroup viewGroup) throws Resources.NotFoundException {
        List<CampaignEx> list = this.f18772c;
        if (list == null || this.f18771b == null || list.size() == 0) {
            return;
        }
        MBridgeImageView mBridgeImageView = this.f18771b.f18778c;
        if (mBridgeImageView != null) {
            a(mBridgeImageView, this.f18772c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f18771b.f18786k;
        if (imageView != null) {
            a(imageView, this.f18772c.get(i10).getImageUrl(), false);
        }
        RoundImageView roundImageView = this.f18771b.f18779d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f18771b.f18779d, this.f18772c.get(i10).getIconUrl(), true);
        }
        double rating = this.f18772c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBridgeLevelLayoutView mBridgeLevelLayoutView = this.f18771b.f18784i;
        if (mBridgeLevelLayoutView != null) {
            mBridgeLevelLayoutView.setRatingAndUser(rating, this.f18772c.get(i10).getNumberRating());
            this.f18771b.f18784i.setOrientation(0);
        }
        MBRotationView mBRotationView = this.f18771b.f18777b;
        if (mBRotationView != null) {
            mBRotationView.setWidthRatio(1.0f);
            this.f18771b.f18777b.setHeightRatio(1.0f);
            this.f18771b.f18777b.setAutoscroll(false);
        }
        MBridgeImageView mBridgeImageView2 = this.f18771b.f18778c;
        if (mBridgeImageView2 != null) {
            mBridgeImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private View b(int i10) throws Throwable {
        View viewA;
        String cMPTEntryUrl;
        String str;
        try {
            List<CampaignEx> list = this.f18772c;
            cMPTEntryUrl = "";
            if (list == null || list.get(i10) == null) {
                str = "501";
            } else {
                str = this.f18772c.get(i10).getMof_tplid() + "";
                cMPTEntryUrl = this.f18772c.get(i10).getCMPTEntryUrl();
            }
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
            viewA = null;
        }
        if (TextUtils.isEmpty(cMPTEntryUrl)) {
            return a();
        }
        int iF = m0.F(com.mbridge.msdk.foundation.controller.c.n().d());
        String strA = z.a(0, str, cMPTEntryUrl);
        if (TextUtils.isEmpty(strA)) {
            return a();
        }
        File file = new File(strA + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> listA = o0.a(strA, "template_" + str + "_" + iF + "_item");
            if (listA == null) {
                return a();
            }
            viewA = a(i10, listA);
            return this.f18770a ? viewA : a();
        }
        return a();
    }

    private int c(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, "id");
    }

    public int d(String str) {
        return i0.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<CampaignEx> list = this.f18772c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f18772c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        List<CampaignEx> list = this.f18772c;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) throws Throwable {
        try {
            if (view == null) {
                view = b(i10);
            } else {
                this.f18771b = (b) view.getTag();
            }
            a(view);
            if (this.f18770a) {
                b(i10, viewGroup);
            } else {
                a(i10, viewGroup);
            }
            a(i10);
        } catch (Exception e10) {
            q0.b("OrderCampAdapter", e10.getMessage());
        }
        List<CampaignEx> list = this.f18772c;
        if (list != null && list.size() > i10) {
            b1.a(view, this.f18772c.get(i10).getLocalRequestId(), this.f18772c.get(i10).getLocalAllowTrackClick());
        }
        return view;
    }

    private void b(int i10, ViewGroup viewGroup) throws Resources.NotFoundException {
        List<CampaignEx> list = this.f18772c;
        if (list == null || this.f18771b == null || list.size() == 0) {
            return;
        }
        MBCusRoundImageView mBCusRoundImageView = this.f18771b.f18787l;
        if (mBCusRoundImageView != null) {
            mBCusRoundImageView.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
            a(this.f18771b.f18787l, this.f18772c.get(i10).getImageUrl(), false);
        }
        ImageView imageView = this.f18771b.f18786k;
        if (imageView != null) {
            a(imageView, this.f18772c.get(i10).getImageUrl(), false);
        }
        MBCusRoundImageView mBCusRoundImageView2 = this.f18771b.f18788m;
        if (mBCusRoundImageView2 != null) {
            mBCusRoundImageView2.setBorder(50, 20, -1);
            a(this.f18771b.f18788m, this.f18772c.get(i10).getIconUrl(), true);
        }
        double rating = this.f18772c.get(i10).getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        MBStarLevelLayoutView mBStarLevelLayoutView = this.f18771b.f18789n;
        if (mBStarLevelLayoutView != null) {
            mBStarLevelLayoutView.setRating((int) rating);
            this.f18771b.f18789n.setOrientation(0);
        }
        MBHeatLevelLayoutView mBHeatLevelLayoutView = this.f18771b.f18790o;
        if (mBHeatLevelLayoutView != null) {
            mBHeatLevelLayoutView.setHeatCount(this.f18772c.get(i10).getNumberRating());
        }
    }

    private View a(int i10, List<String> list) {
        int iF = m0.F(com.mbridge.msdk.foundation.controller.c.n().d());
        h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        View viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.f18772c.get(i10)).fileDirs(list).dyAdType(DyAdType.REWARD).orientation(iF).adChoiceLink(v0.a(this.f18772c.get(i10))).build());
        if (viewCreateDynamicView != null) {
            this.f18770a = true;
            b bVar = new b();
            this.f18771b = bVar;
            bVar.f18787l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv"));
            this.f18771b.f18786k = (ImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_iv_burl"));
            this.f18771b.f18788m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(b("mbridge_lv_icon_iv"));
            this.f18771b.f18789n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(b("mbridge_lv_sv_starlevel"));
            this.f18771b.f18791p = (MBFrameLayout) viewCreateDynamicView.findViewById(b("mbridge_lv_ration"));
            viewCreateDynamicView.setTag(this.f18771b);
        }
        return viewCreateDynamicView;
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private View a() {
        View viewInflate = LayoutInflater.from(com.mbridge.msdk.foundation.controller.c.n().d()).inflate(d("mbridge_order_layout_item"), (ViewGroup) null);
        b bVar = new b();
        this.f18771b = bVar;
        bVar.f18778c = (MBridgeImageView) viewInflate.findViewById(c("mbridge_lv_iv"));
        this.f18771b.f18786k = (ImageView) viewInflate.findViewById(c("mbridge_lv_iv_burl"));
        this.f18771b.f18779d = (RoundImageView) viewInflate.findViewById(c("mbridge_lv_icon_iv"));
        this.f18771b.f18784i = (MBridgeLevelLayoutView) viewInflate.findViewById(c("mbridge_lv_sv_starlevel"));
        this.f18771b.f18777b = (MBRotationView) viewInflate.findViewById(c("mbridge_lv_ration"));
        viewInflate.setTag(this.f18771b);
        return viewInflate;
    }

    private void a(View view) {
        this.f18771b.f18776a = (RelativeLayout) view.findViewById(a("mbridge_lv_item_rl"));
        this.f18771b.f18780e = (TextView) view.findViewById(a("mbridge_lv_title_tv"));
        this.f18771b.f18782g = (TextView) view.findViewById(a("mbridge_lv_tv_install"));
        this.f18771b.f18790o = (MBHeatLevelLayoutView) view.findViewById(a("mbridge_lv_sv_heat_level"));
        this.f18771b.f18781f = (TextView) view.findViewById(a("mbridge_lv_desc_tv"));
        this.f18771b.f18785j = (ImageView) view.findViewById(a("mbridge_iv_flag"));
        this.f18771b.f18783h = (TextView) view.findViewById(a("mbridge_order_viewed_tv"));
    }

    private void a(ImageView imageView, String str, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.image.b.a(imageView.getContext()).a(str, new C0333a(imageView, z10));
        } else if (z10) {
            imageView.setVisibility(8);
        }
    }

    private void a(int i10) {
        b bVar = this.f18771b;
        if (bVar != null) {
            if (bVar.f18780e != null) {
                this.f18771b.f18780e.setText(this.f18772c.get(i10).getAppName());
            }
            if (this.f18771b.f18781f != null) {
                this.f18771b.f18781f.setText(this.f18772c.get(i10).getAppDesc());
            }
            if (this.f18771b.f18782g != null) {
                String adCall = this.f18772c.get(i10).getAdCall();
                if (this.f18771b.f18782g instanceof MBridgeTextView) {
                    ((MBridgeTextView) this.f18771b.f18782g).setObjectAnimator(new com.mbridge.msdk.video.dynview.ui.b().a(this.f18771b.f18782g));
                }
                this.f18771b.f18782g.setText(adCall);
            }
            if (this.f18771b.f18785j != null) {
                try {
                    String language = Locale.getDefault().getLanguage();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                            this.f18771b.f18785j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        } else {
                            this.f18771b.f18785j.setImageDrawable(contextD.getResources().getDrawable(contextD.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
                        }
                    }
                } catch (Exception e10) {
                    q0.b("OrderCampAdapter", e10.getMessage());
                }
                v0.a(2, this.f18771b.f18785j, this.f18772c.get(i10), com.mbridge.msdk.foundation.controller.c.n().d(), false, null);
            }
            if (this.f18771b.f18783h != null) {
                try {
                    this.f18771b.f18783h.setText(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getString(com.mbridge.msdk.foundation.controller.c.n().d().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", com.mbridge.msdk.foundation.controller.c.n().i())));
                    this.f18771b.f18783h.setVisibility(0);
                } catch (Exception e11) {
                    q0.b("OrderCampAdapter", e11.getMessage());
                }
            }
        }
    }

    private int a(String str) {
        if (this.f18770a) {
            return b(str);
        }
        return c(str);
    }
}
