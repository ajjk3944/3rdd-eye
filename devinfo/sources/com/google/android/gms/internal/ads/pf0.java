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
import com.google.android.gms.ads.nativead.NativeAd;
import com.liuzh.deviceinfo.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pf0 extends mg implements va.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14995a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14996b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f14997c;

    /* renamed from: d, reason: collision with root package name */
    public final hf0 f14998d;

    /* renamed from: e, reason: collision with root package name */
    public final w81 f14999e;

    /* renamed from: f, reason: collision with root package name */
    public ff0 f15000f;

    public pf0(Context context, WeakReference weakReference, hf0 hf0Var, w81 w81Var) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f14995a = new HashMap();
        this.f14996b = context;
        this.f14997c = weakReference;
        this.f14998d = hf0Var;
        this.f14999e = w81Var;
    }

    public static String m4(Object obj) {
        pa.q qVarC;
        va.x1 x1Var;
        if (obj instanceof pa.l) {
            qVarC = ((pa.l) obj).f31540e;
        } else {
            va.x1 x1VarF1 = null;
            if (obj instanceof oh) {
                try {
                    x1VarF1 = ((oh) obj).f14699a.e();
                } catch (RemoteException e2) {
                    za.i.k("#007 Could not call remote method.", e2);
                }
                qVarC = new pa.q(x1VarF1);
            } else if (obj instanceof ab.a) {
                try {
                    va.l0 l0Var = ((up) ((ab.a) obj)).f17283c;
                    if (l0Var != null) {
                        x1VarF1 = l0Var.N1();
                    }
                } catch (RemoteException e10) {
                    za.i.k("#007 Could not call remote method.", e10);
                }
                qVarC = new pa.q(x1VarF1);
            } else if (obj instanceof lv) {
                try {
                    cv cvVar = ((lv) obj).f13639a;
                    if (cvVar != null) {
                        x1VarF1 = cvVar.F1();
                    }
                } catch (RemoteException e11) {
                    za.i.k("#007 Could not call remote method.", e11);
                }
                qVarC = new pa.q(x1VarF1);
            } else if (obj instanceof rv) {
                try {
                    cv cvVar2 = ((rv) obj).f15767a;
                    if (cvVar2 != null) {
                        x1VarF1 = cvVar2.F1();
                    }
                } catch (RemoteException e12) {
                    za.i.k("#007 Could not call remote method.", e12);
                }
                qVarC = new pa.q(x1VarF1);
            } else if (obj instanceof pa.i) {
                qVarC = ((pa.i) obj).getResponseInfo();
            } else {
                if (!(obj instanceof NativeAd)) {
                    return "";
                }
                qVarC = ((NativeAd) obj).c();
            }
        }
        if (qVarC == null || (x1Var = qVarC.f31543a) == null) {
            return "";
        }
        try {
            return x1Var.A1();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // va.t1
    public final void S3(String str, vb.a aVar, vb.a aVar2) {
        Context context = (Context) vb.b.U0(aVar);
        ViewGroup viewGroup = (ViewGroup) vb.b.U0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f14995a;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof pa.i) {
            pa.i iVar = (pa.i) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            jz.x(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(iVar);
            iVar.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            eb.e eVar = new eb.e(context);
            eVar.setTag("ad_view_tag");
            jz.x(eVar, -1, -1);
            viewGroup.addView(eVar);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            jz.x(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            eVar.addView(linearLayout2);
            Resources resourcesE = ua.j.C.f35265h.e();
            linearLayout2.addView(jz.s(context, resourcesE == null ? "Headline" : resourcesE.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String strB = nativeAd.b();
            if (strB == null) {
                strB = "";
            }
            View viewS = jz.s(context, strB, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            eVar.setHeadlineView(viewS);
            linearLayout2.addView(viewS);
            linearLayout2.addView(jz.s(context, resourcesE == null ? "Body" : resourcesE.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String strA = nativeAd.a();
            if (strA == null) {
                strA = "";
            }
            View viewS2 = jz.s(context, strA, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            eVar.setBodyView(viewS2);
            linearLayout2.addView(viewS2);
            linearLayout2.addView(jz.s(context, resourcesE == null ? "Media View" : resourcesE.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            eb.b bVar = new eb.b(context);
            bVar.setTag("media_view_tag");
            eVar.setMediaView(bVar);
            linearLayout2.addView(bVar);
            eVar.setNativeAd(nativeAd);
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        String string = parcel.readString();
        vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
        vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
        ng.f(parcel);
        S3(string, aVarR0, aVarR02);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void h4(String str) {
        HashMap map;
        Object obj;
        try {
            hf0 hf0Var = this.f14998d;
            qz qzVar = hf0Var.f11853d;
            Activity activityA1 = (qzVar == null || qzVar.g0()) ? null : hf0Var.f11853d.A1();
            if (activityA1 != null && (obj = (map = this.f14995a).get(str)) != null) {
                pk pkVar = sk.Ga;
                va.s sVar = va.s.f36163e;
                if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || (obj instanceof oh) || (obj instanceof ab.a) || (obj instanceof lv) || (obj instanceof rv)) {
                    map.remove(str);
                }
                k4(m4(obj));
                if (obj instanceof oh) {
                    ((oh) obj).b(activityA1);
                    return;
                }
                if (obj instanceof ab.a) {
                    ((ab.a) obj).b(activityA1);
                    return;
                }
                if (obj instanceof lv) {
                    ((lv) obj).b(activityA1, h80.f11761s);
                    return;
                }
                if (obj instanceof rv) {
                    rv rvVar = (rv) obj;
                    h80 h80Var = h80.f11760r;
                    qv qvVar = rvVar.f15769c;
                    qvVar.f15456b = h80Var;
                    try {
                        cv cvVar = rvVar.f15767a;
                        if (cvVar != null) {
                            cvVar.Y2(qvVar);
                            cvVar.I2(new vb.b(activityA1));
                        }
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                    }
                    return;
                }
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && ((obj instanceof pa.i) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextL4 = l4();
                    intent.setClassName(contextL4, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    ya.f0 f0Var = ua.j.C.f35261c;
                    ya.f0.u(contextL4, intent);
                }
            }
        } finally {
        }
    }

    public final synchronized void i4(Object obj, String str) {
        this.f14995a.put(str, obj);
        j4(m4(obj));
    }

    public final synchronized void j4(String str) {
        try {
            gx gxVarE = this.f15000f.e(str);
            ix0 ix0Var = new ix0(25, this);
            gxVarE.a(new q81(0, gxVarE, ix0Var), this.f14999e);
        } catch (NullPointerException e2) {
            ua.j.C.f35265h.f("OutOfContextTester.setAdAsOutOfContext", e2);
            this.f14998d.b();
        }
    }

    public final synchronized void k4(String str) {
        try {
            gx gxVarE = this.f15000f.e(str);
            mx0 mx0Var = new mx0(27, this);
            gxVarE.a(new q81(0, gxVarE, mx0Var), this.f14999e);
        } catch (NullPointerException e2) {
            ua.j.C.f35265h.f("OutOfContextTester.setAdAsShown", e2);
            this.f14998d.b();
        }
    }

    public final Context l4() {
        Context context = (Context) this.f14997c.get();
        return context == null ? this.f14996b : context;
    }
}
