package defpackage;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class da0 implements mz, ig0 {
    public final /* synthetic */ MainActivity f;

    public /* synthetic */ da0(MainActivity mainActivity) {
        this.f = mainActivity;
    }

    @Override // defpackage.mz
    public void a(bw bwVar) {
        MainActivity mainActivity = this.f;
        if (bwVar != null) {
            int[] iArr = MainActivity.d0;
            i30.m(bwVar.b + ": " + bwVar.a, "msg");
        }
        f20 f20Var = mainActivity.X;
        if (f20Var == null) {
            i30.S("googleMobileAdsConsentManager");
            throw null;
        }
        if (!((va4) f20Var.g).a() || mainActivity.Y.getAndSet(true)) {
            return;
        }
        List listJ0 = zf.j0("D95CBDBF1A2CCD1B6766C3D9D2B99818", "33C61DE73F8EAEB87B9ECE6E920D98CC", "8BB648896523BB8F17DB8AD774027092");
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.addAll(listJ0);
        pp0 pp0Var = new pp0(arrayList);
        f53 f53VarD = f53.d();
        f53VarD.getClass();
        synchronized (f53VarD.e) {
            try {
                pp0 pp0Var2 = f53VarD.g;
                f53VarD.g = pp0Var;
                if (f53VarD.f != null) {
                    pp0Var2.getClass();
                }
            } finally {
            }
        }
        gi2.q(wl2.a(fp.b), null, new ta0(mainActivity, null), 3);
    }

    @Override // defpackage.ig0
    public void c(r82 r82Var) {
        f32 f32Var;
        int[] iArr = MainActivity.d0;
        MainActivity mainActivity = this.f;
        View viewInflate = mainActivity.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null, false);
        int i = R.id.ad_advertiser;
        TextView textView = (TextView) a30.e(viewInflate, R.id.ad_advertiser);
        if (textView != null) {
            i = R.id.ad_app_icon;
            ImageView imageView = (ImageView) a30.e(viewInflate, R.id.ad_app_icon);
            if (imageView != null) {
                i = R.id.ad_body;
                TextView textView2 = (TextView) a30.e(viewInflate, R.id.ad_body);
                if (textView2 != null) {
                    i = R.id.ad_call_to_action;
                    Button button = (Button) a30.e(viewInflate, R.id.ad_call_to_action);
                    if (button != null) {
                        i = R.id.ad_headline;
                        TextView textView3 = (TextView) a30.e(viewInflate, R.id.ad_headline);
                        if (textView3 != null) {
                            i = R.id.ad_media;
                            MediaView mediaView = (MediaView) a30.e(viewInflate, R.id.ad_media);
                            if (mediaView != null) {
                                i = R.id.ad_price;
                                TextView textView4 = (TextView) a30.e(viewInflate, R.id.ad_price);
                                if (textView4 != null) {
                                    i = R.id.ad_stars;
                                    RatingBar ratingBar = (RatingBar) a30.e(viewInflate, R.id.ad_stars);
                                    if (ratingBar != null) {
                                        i = R.id.ad_store;
                                        TextView textView5 = (TextView) a30.e(viewInflate, R.id.ad_store);
                                        if (textView5 != null) {
                                            NativeAdView nativeAdView = (NativeAdView) viewInflate;
                                            i30.l(nativeAdView, "getRoot(...)");
                                            nativeAdView.setMediaView(mediaView);
                                            nativeAdView.setHeadlineView(textView3);
                                            nativeAdView.setBodyView(textView2);
                                            nativeAdView.setCallToActionView(button);
                                            nativeAdView.setIconView(imageView);
                                            nativeAdView.setPriceView(textView4);
                                            nativeAdView.setStarRatingView(ratingBar);
                                            nativeAdView.setStoreView(textView5);
                                            nativeAdView.setAdvertiserView(textView);
                                            textView3.setText(r82Var.b());
                                            try {
                                                f32Var = r82Var.a;
                                            } catch (RemoteException e) {
                                                gi2.c0("", e);
                                            }
                                            r73 r73Var = f32Var.A() != null ? new r73(f32Var.A()) : null;
                                            if (r73Var != null) {
                                                mediaView.setMediaContent(r73Var);
                                            }
                                            if (r82Var.a() == null) {
                                                textView2.setVisibility(4);
                                            } else {
                                                textView2.setVisibility(0);
                                                textView2.setText(r82Var.a());
                                            }
                                            if (r82Var.f() == null) {
                                                button.setVisibility(4);
                                            } else {
                                                button.setVisibility(0);
                                                button.setText(r82Var.f());
                                            }
                                            l92 l92Var = r82Var.c;
                                            if (l92Var == null) {
                                                imageView.setVisibility(8);
                                            } else {
                                                imageView.setImageDrawable(l92Var != null ? (Drawable) l92Var.g : null);
                                                imageView.setVisibility(0);
                                            }
                                            if (r82Var.g() == null) {
                                                textView4.setVisibility(4);
                                            } else {
                                                textView4.setVisibility(0);
                                                textView4.setText(r82Var.g());
                                            }
                                            if (r82Var.i() == null) {
                                                textView5.setVisibility(4);
                                            } else {
                                                textView5.setVisibility(0);
                                                textView5.setText(r82Var.i());
                                            }
                                            if (r82Var.h() == null) {
                                                ratingBar.setVisibility(4);
                                            } else {
                                                Double dH = r82Var.h();
                                                i30.j(dH);
                                                ratingBar.setRating((float) dH.doubleValue());
                                                ratingBar.setVisibility(0);
                                            }
                                            if (r82Var.e() == null) {
                                                textView.setVisibility(4);
                                            } else {
                                                textView.setText(r82Var.e());
                                                textView.setVisibility(0);
                                            }
                                            nativeAdView.setNativeAd(r82Var);
                                            f2 f2Var = mainActivity.C;
                                            if (f2Var == null) {
                                                i30.S("binding");
                                                throw null;
                                            }
                                            ((FrameLayout) f2Var.d).removeAllViews();
                                            f2 f2Var2 = mainActivity.C;
                                            if (f2Var2 != null) {
                                                ((FrameLayout) f2Var2.d).addView(nativeAdView);
                                                return;
                                            } else {
                                                i30.S("binding");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
