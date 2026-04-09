package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.apm.insight.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import j2.C2553i;
import j2.C2556l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import q2.C2841s;
import q2.InterfaceC2846u0;
import q2.InterfaceC2854y0;
import t2.C2911G;
import v2.AbstractC2960a;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0751To extends B7 implements InterfaceC2846u0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11463a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11464b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f11465c;

    /* renamed from: d, reason: collision with root package name */
    public final C0615Lo f11466d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f11467e;

    /* renamed from: f, reason: collision with root package name */
    public C0581Jo f11468f;

    public BinderC0751To(Context context, WeakReference weakReference, C0615Lo c0615Lo, ID id) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f11463a = new HashMap();
        this.f11464b = context;
        this.f11465c = weakReference;
        this.f11466d = c0615Lo;
        this.f11467e = id;
    }

    public static String P3(Object obj) {
        j2.q qVarI;
        InterfaceC2854y0 interfaceC2854y0;
        if (obj instanceof C2556l) {
            qVarI = ((C2556l) obj).f21351f;
        } else {
            InterfaceC2854y0 interfaceC2854y0N = null;
            if (obj instanceof C1029d8) {
                C1029d8 c1029d8 = (C1029d8) obj;
                c1029d8.getClass();
                try {
                    interfaceC2854y0N = c1029d8.f13732a.e();
                } catch (RemoteException e6) {
                    u2.k.k("#007 Could not call remote method.", e6);
                }
                qVarI = new j2.q(interfaceC2854y0N);
            } else if (obj instanceof AbstractC2960a) {
                C1268hc c1268hc = (C1268hc) ((AbstractC2960a) obj);
                c1268hc.getClass();
                try {
                    q2.L l2 = c1268hc.f14511c;
                    if (l2 != null) {
                        interfaceC2854y0N = l2.N();
                    }
                } catch (RemoteException e7) {
                    u2.k.k("#007 Could not call remote method.", e7);
                }
                qVarI = new j2.q(interfaceC2854y0N);
            } else if (obj instanceof C0758Ue) {
                C0758Ue c0758Ue = (C0758Ue) obj;
                c0758Ue.getClass();
                try {
                    InterfaceC0605Le interfaceC0605Le = c0758Ue.f11700a;
                    if (interfaceC0605Le != null) {
                        interfaceC2854y0N = interfaceC0605Le.n();
                    }
                } catch (RemoteException e8) {
                    u2.k.k("#007 Could not call remote method.", e8);
                }
                qVarI = new j2.q(interfaceC2854y0N);
            } else if (obj instanceof C0890af) {
                C0890af c0890af = (C0890af) obj;
                c0890af.getClass();
                try {
                    InterfaceC0605Le interfaceC0605Le2 = c0890af.f13152a;
                    if (interfaceC0605Le2 != null) {
                        interfaceC2854y0N = interfaceC0605Le2.n();
                    }
                } catch (RemoteException e9) {
                    u2.k.k("#007 Could not call remote method.", e9);
                }
                qVarI = new j2.q(interfaceC2854y0N);
            } else if (obj instanceof C2553i) {
                qVarI = ((C2553i) obj).getResponseInfo();
            } else {
                if (!(obj instanceof NativeAd)) {
                    return "";
                }
                qVarI = ((NativeAd) obj).i();
            }
        }
        if (qVarI == null || (interfaceC2854y0 = qVarI.f21354a) == null) {
            return "";
        }
        try {
            return interfaceC2854y0.h();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
        S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
        C7.f(parcel);
        i3(string, aVarD1, aVarD12);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void K3(String str) {
        HashMap map;
        Object obj;
        try {
            C0615Lo c0615Lo = this.f11466d;
            InterfaceC0828Yg interfaceC0828Yg = c0615Lo.f9761d;
            Activity activityH = (interfaceC0828Yg == null || interfaceC0828Yg.t0()) ? null : c0615Lo.f9761d.h();
            if (activityH != null && (obj = (map = this.f11463a).get(str)) != null) {
                E9 e9 = H9.Ea;
                C2841s c2841s = C2841s.f23267e;
                if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || (obj instanceof C1029d8) || (obj instanceof AbstractC2960a) || (obj instanceof C0758Ue) || (obj instanceof C0890af)) {
                    map.remove(str);
                }
                N3(P3(obj));
                if (obj instanceof C1029d8) {
                    ((C1029d8) obj).b(activityH);
                    return;
                }
                if (obj instanceof AbstractC2960a) {
                    ((AbstractC2960a) obj).b(activityH);
                    return;
                }
                if (obj instanceof C0758Ue) {
                    ((C0758Ue) obj).b(activityH, C1437kl.f15247H);
                    return;
                }
                if (obj instanceof C0890af) {
                    C0890af c0890af = (C0890af) obj;
                    C1437kl c1437kl = C1437kl.f15246G;
                    BinderC0843Ze binderC0843Ze = c0890af.f13154c;
                    binderC0843Ze.f12909b = c1437kl;
                    try {
                        InterfaceC0605Le interfaceC0605Le = c0890af.f13152a;
                        if (interfaceC0605Le != null) {
                            interfaceC0605Le.F2(binderC0843Ze);
                            interfaceC0605Le.o1(new S2.b(activityH));
                        }
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                    }
                    return;
                }
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && ((obj instanceof C2553i) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextO3 = O3();
                    intent.setClassName(contextO3, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    C2911G.u(contextO3, intent);
                }
            }
        } finally {
        }
    }

    public final synchronized void L3(Object obj, String str) {
        this.f11463a.put(str, obj);
        M3(P3(obj));
    }

    public final synchronized void M3(String str) {
        try {
            C0657Of c0657OfE = this.f11468f.e(str);
            Rx rx = new Rx(22, this);
            c0657OfE.a(new CD(c0657OfE, 0, rx), this.f11467e);
        } catch (NullPointerException e6) {
            p2.j.f22785C.f22795h.f("OutOfContextTester.setAdAsOutOfContext", e6);
            this.f11466d.b();
        }
    }

    public final synchronized void N3(String str) {
        try {
            C0657Of c0657OfE = this.f11468f.e(str);
            L6 l6 = new L6(21, this);
            c0657OfE.a(new CD(c0657OfE, 0, l6), this.f11467e);
        } catch (NullPointerException e6) {
            p2.j.f22785C.f22795h.f("OutOfContextTester.setAdAsShown", e6);
            this.f11466d.b();
        }
    }

    public final Context O3() {
        Context context = (Context) this.f11465c.get();
        return context == null ? this.f11464b : context;
    }

    @Override // q2.InterfaceC2846u0
    public final void i3(String str, S2.a aVar, S2.a aVar2) {
        Context context = (Context) S2.b.n1(aVar);
        ViewGroup viewGroup = (ViewGroup) S2.b.n1(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f11463a;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof C2553i) {
            C2553i c2553i = (C2553i) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            AbstractC1114el.C(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(c2553i);
            c2553i.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            AbstractC1114el.C(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            AbstractC1114el.C(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesE = p2.j.f22785C.f22795h.e();
            linearLayout2.addView(AbstractC1114el.w(context, resourcesE == null ? "Headline" : resourcesE.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String strE = nativeAd.e();
            if (strE == null) {
                strE = "";
            }
            View viewW = AbstractC1114el.w(context, strE, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewW);
            linearLayout2.addView(viewW);
            linearLayout2.addView(AbstractC1114el.w(context, resourcesE == null ? "Body" : resourcesE.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String strC = nativeAd.c();
            if (strC == null) {
                strC = "";
            }
            View viewW2 = AbstractC1114el.w(context, strC, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewW2);
            linearLayout2.addView(viewW2);
            linearLayout2.addView(AbstractC1114el.w(context, resourcesE == null ? "Media View" : resourcesE.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
