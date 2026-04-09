package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ex2 extends hv1 implements uv2 {
    public final HashMap f;
    public final Context g;
    public final WeakReference h;
    public final ax2 i;
    public final pq3 j;
    public zw2 k;

    public ex2(Context context, WeakReference weakReference, ax2 ax2Var, pq3 pq3Var) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f = new HashMap();
        this.g = context;
        this.h = weakReference;
        this.i = ax2Var;
        this.j = pq3Var;
    }

    public static String F3(Object obj) {
        hq0 hq0VarC;
        tx2 tx2Var;
        if (obj instanceof u70) {
            hq0VarC = ((u70) obj).k;
        } else {
            tx2 tx2VarN = null;
            if (obj instanceof hw1) {
                try {
                    tx2VarN = ((hw1) obj).a.e();
                } catch (RemoteException e) {
                    gi2.p0("#007 Could not call remote method.", e);
                }
                hq0VarC = new hq0(tx2VarN);
            } else if (obj instanceof g30) {
                try {
                    ba2 ba2Var = ((k52) ((g30) obj)).c;
                    if (ba2Var != null) {
                        tx2VarN = ba2Var.N();
                    }
                } catch (RemoteException e2) {
                    gi2.p0("#007 Could not call remote method.", e2);
                }
                hq0VarC = new hq0(tx2VarN);
            } else if (obj instanceof hb2) {
                try {
                    ya2 ya2Var = ((hb2) obj).a;
                    if (ya2Var != null) {
                        tx2VarN = ya2Var.n();
                    }
                } catch (RemoteException e3) {
                    gi2.p0("#007 Could not call remote method.", e3);
                }
                hq0VarC = new hq0(tx2VarN);
            } else if (obj instanceof pb2) {
                try {
                    ya2 ya2Var2 = ((pb2) obj).a;
                    if (ya2Var2 != null) {
                        tx2VarN = ya2Var2.n();
                    }
                } catch (RemoteException e4) {
                    gi2.p0("#007 Could not call remote method.", e4);
                }
                hq0VarC = new hq0(tx2VarN);
            } else if (obj instanceof e3) {
                hq0VarC = ((e3) obj).getResponseInfo();
            } else {
                if (!(obj instanceof NativeAd)) {
                    return "";
                }
                hq0VarC = ((NativeAd) obj).c();
            }
        }
        if (hq0VarC == null || (tx2Var = hq0VarC.a) == null) {
            return "";
        }
        try {
            return tx2Var.g();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
        u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
        iv1.f(parcel);
        z2(string, u10VarX0, u10VarX02);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void B3(Object obj, String str) {
        this.f.put(str, obj);
        C3(F3(obj));
    }

    public final synchronized void C3(String str) {
        try {
            pd2 pd2VarD = this.k.d(str);
            vg0 vg0Var = new vg0(20, this);
            pd2VarD.c(new jq3(pd2VarD, vg0Var, 0), this.j);
        } catch (NullPointerException e) {
            hg4.C.h.d("OutOfContextTester.setAdAsOutOfContext", e);
            this.i.b();
        }
    }

    public final synchronized void D3(String str) {
        try {
            pd2 pd2VarD = this.k.d(str);
            z71 z71Var = new z71(24, this);
            pd2VarD.c(new jq3(pd2VarD, z71Var, 0), this.j);
        } catch (NullPointerException e) {
            hg4.C.h.d("OutOfContextTester.setAdAsShown", e);
            this.i.b();
        }
    }

    public final Context E3() {
        Context context = (Context) this.h.get();
        return context == null ? this.g : context;
    }

    @Override // defpackage.uv2
    public final void z2(String str, u10 u10Var, u10 u10Var2) {
        Context context = (Context) oi0.l1(u10Var);
        ViewGroup viewGroup = (ViewGroup) oi0.l1(u10Var2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof e3) {
            e3 e3Var = (e3) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            uk2.c0(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(e3Var);
            e3Var.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            uk2.c0(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            uk2.c0(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesC = hg4.C.h.c();
            linearLayout2.addView(uk2.Y(context, resourcesC == null ? "Headline" : resourcesC.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String strB = nativeAd.b();
            if (strB == null) {
                strB = "";
            }
            View viewY = uk2.Y(context, strB, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewY);
            linearLayout2.addView(viewY);
            linearLayout2.addView(uk2.Y(context, resourcesC == null ? "Body" : resourcesC.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String strA = nativeAd.a();
            if (strA == null) {
                strA = "";
            }
            View viewY2 = uk2.Y(context, strA, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewY2);
            linearLayout2.addView(viewY2);
            linearLayout2.addView(uk2.Y(context, resourcesC == null ? "Media View" : resourcesC.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
