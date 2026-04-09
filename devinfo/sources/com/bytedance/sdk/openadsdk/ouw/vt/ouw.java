package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.core.bly.bly;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    public com.bytedance.sdk.openadsdk.core.lh.ouw bly;

    /* renamed from: cf, reason: collision with root package name */
    public WeakReference<com.bytedance.sdk.openadsdk.core.ryl.le> f8608cf;
    public com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh fkw;

    /* renamed from: jg, reason: collision with root package name */
    private boolean f8609jg = false;

    /* renamed from: le, reason: collision with root package name */
    public PAGMediaView f8610le;

    /* renamed from: lh, reason: collision with root package name */
    WeakReference<com.bytedance.sdk.openadsdk.core.mwh.vt.le> f8611lh;
    private final String mwh;
    protected final vpp ouw;
    public PAGMediaView pno;
    public qbp ra;
    private final Context ryl;
    public com.bytedance.sdk.openadsdk.core.lh.vt tlj;
    boolean vt;
    vt yu;

    public ouw(Context context, vpp vppVar, String str) {
        this.ryl = context;
        this.ouw = vppVar;
        this.mwh = str;
    }

    public final void bly() {
        Context context = this.ryl;
        if (context != null) {
            TTWebsiteActivity.ouw(context, this.ouw, this.mwh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView fkw() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.ouw
            com.bytedance.sdk.openadsdk.utils.vt.ouw(r0)
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.ouw
            int r0 = r0.rn()
            r1 = 2
            if (r0 != r1) goto L63
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r4.ouw
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r0)
            r1 = 1
            r2 = 520093762(0x1f000042, float:2.7105268E-20)
            if (r0 == 0) goto L3d
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r0 = r4.fkw
            if (r0 == 0) goto L5a
            boolean r3 = r0 instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt
            if (r3 == 0) goto L5a
            com.bytedance.sdk.openadsdk.core.bly.qbp r0 = r0.yu()
            com.bytedance.sdk.openadsdk.core.bly.th r0 = (com.bytedance.sdk.openadsdk.core.bly.th) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.setTag(r2, r3)
            boolean r2 = r4.f8609jg
            if (r2 != 0) goto L36
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r2 = r4.fkw
            r2.fkw()
        L36:
            r4.f8609jg = r1
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView r0 = r4.ouw(r0)
            goto L5b
        L3d:
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r0 = r4.fkw
            if (r0 == 0) goto L5a
            com.bytedance.sdk.openadsdk.core.bly.qbp r0 = r0.yu()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.setTag(r2, r3)
            boolean r2 = r4.f8609jg
            if (r2 != 0) goto L53
            com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh r2 = r4.fkw
            r2.fkw()
        L53:
            r4.f8609jg = r1
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView r0 = r4.ouw(r0)
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L67
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)     // Catch: java.lang.Exception -> L67
            goto L67
        L63:
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView r0 = r4.le()
        L67:
            if (r0 == 0) goto L73
            com.bytedance.sdk.openadsdk.core.model.vpp r1 = r4.ouw
            java.lang.Integer r1 = com.bytedance.sdk.openadsdk.tc.vt.fkw.vt(r1)
            r0.setMrcTrackerKey(r1)
            goto L7a
        L73:
            com.bytedance.sdk.openadsdk.ouw.vt.ouw$1 r0 = new com.bytedance.sdk.openadsdk.ouw.vt.ouw$1
            android.content.Context r1 = r4.ryl
            r0.<init>(r1)
        L7a:
            boolean r1 = r0 instanceof com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView
            if (r1 == 0) goto L86
            r1 = r0
            com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView r1 = (com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView) r1
            com.bytedance.sdk.openadsdk.core.model.vpp r2 = r4.ouw
            r1.setMaterialMeta(r2)
        L86:
            r4.pno = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ouw.vt.ouw.fkw():com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView le() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ouw.vt.ouw.le():com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView");
    }

    public final String lh() {
        vpp vppVar = this.ouw;
        if (vppVar != null) {
            return !TextUtils.isEmpty(vppVar.fqk) ? vppVar.fqk : !TextUtils.isEmpty(vppVar.hun) ? vppVar.hun : "";
        }
        return null;
    }

    public final PAGImageItem ouw() {
        zih zihVar;
        vpp vppVar = this.ouw;
        if (vppVar == null || (zihVar = vppVar.fak) == null) {
            return null;
        }
        return new PAGImageItem(zihVar.f8323lh, zihVar.vt, zihVar.ouw, (float) zihVar.yu);
    }

    public final View pno() {
        vpp vppVar;
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() == null || (vppVar = this.ouw) == null) {
            ko.fkw("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!vppVar.cd() || !this.ouw.le()) {
            return null;
        }
        ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.zih.ouw());
        com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 14.0f, true), imageView, this.ouw);
        return imageView;
    }

    public final View ra() {
        if (com.bytedance.sdk.openadsdk.core.zih.ouw() == null) {
            ko.fkw("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.zih.ouw()) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.4
            int ouw = 0;
            int vt = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
                super.onLayout(z3, i4, i10, i11, i12);
                try {
                    Object parent = getParent();
                    if (parent == null || this.ouw == 0 || this.vt == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i13 = this.ouw;
                    if (width < i13 || height < this.vt) {
                        float fMin = Math.min(height / this.vt, width / i13);
                        int i14 = (width - this.ouw) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i14);
                        }
                    }
                } catch (Throwable th2) {
                    ko.fkw("PAGExtraFuncationHelper", th2.getMessage());
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public final void onMeasure(int i4, int i10) {
                if (this.ouw == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, LinearLayoutManager.INVALID_OFFSET), i10);
                    this.ouw = getMeasuredWidth();
                    this.vt = this.containerHeight;
                }
                setMeasuredDimension(this.ouw, this.vt);
            }
        };
        pAGLogoView.initData(this.ouw);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ouw.this.bly();
            }
        });
        return pAGLogoView;
    }

    public final String vt() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
        return (leVar == null || TextUtils.isEmpty(leVar.vt)) ? !TextUtils.isEmpty(vppVar.f8315vh) ? vppVar.f8315vh : !TextUtils.isEmpty(vppVar.fqk) ? vppVar.fqk : "" : vppVar.wp.vt;
    }

    public final String yu() {
        vpp vppVar = this.ouw;
        if (vppVar != null) {
            return vppVar.vpp();
        }
        return null;
    }

    private PAGMediaView ouw(final View view) {
        int i4;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        qbp qbpVar = this.ra;
        if (qbpVar != null) {
            qbpVar.setClickListener(null);
            this.ra.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar = this.tlj;
        if (vtVar != null && (vtVar instanceof bly) && (view instanceof qbp)) {
            ((qbp) view).setClickListener((bly) vtVar);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.bly;
        if (ouwVar != null && (ouwVar instanceof com.bytedance.sdk.openadsdk.core.bly.pno) && (view instanceof qbp)) {
            ((qbp) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.bly.pno) ouwVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.ryl) { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.3
            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.yu.ouw(this, ouw.this.ouw);
            }

            @Override // android.view.View
            public final void onWindowFocusChanged(boolean z3) {
                super.onWindowFocusChanged(z3);
                if (view instanceof qbp) {
                    return;
                }
                Integer num = this.ouw;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(num), z3 ? 4 : 8);
                }
                vpp vppVar = ouw.this.ouw;
                if (vppVar != null) {
                    com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(vppVar, z3);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public final void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                ouw.this.ouw(pAGVideoAdListener);
            }
        };
        int i10 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
            i4 = layoutParams.height;
        } else {
            i4 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i4);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof qbp) {
            this.ra = (qbp) view;
        }
        return pAGMediaView;
    }

    private lh vt(final PAGVideoAdListener pAGVideoAdListener) {
        return new lh() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.6
            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void lh() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void ouw() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void vt() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
            public final void yu() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public final void ouw(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh lhVar;
        if (this.ouw.rn() == 2 && vpp.fkw(this.ouw) && (lhVar = this.fkw) != null && (lhVar instanceof com.bytedance.sdk.openadsdk.ouw.vt.ouw.vt)) {
            th thVar = (th) lhVar.yu();
            if (thVar != null) {
                thVar.setVideoAdListener(vt(pAGVideoAdListener));
                return;
            }
            return;
        }
        vt vtVar = this.yu;
        if (vtVar != null) {
            vtVar.ouw = vt(pAGVideoAdListener);
        }
    }
}
