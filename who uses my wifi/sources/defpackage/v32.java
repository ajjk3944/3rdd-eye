package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class v32 implements y32 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ v32(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    public void a(String str, k42 k42Var) {
        synchronized (this.g) {
            ((HashMap) this.h).put(str, k42Var);
        }
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        k42 k42Var;
        String str;
        switch (this.f) {
            case 0:
                ag2 ag2Var = (ag2) obj;
                x32.b(map, (xp2) this.g);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    gi2.i0("URL missing from click GMSG.");
                    return;
                }
                gj2 gj2Var = (gj2) this.h;
                gq3 gq3VarR = gq3.r(x32.a(ag2Var, str2));
                w32 w32Var = new w32(gj2Var, str2, 0);
                ld2 ld2Var = md2.a;
                qp3 qp3VarO = pu1.O(gq3VarR, w32Var, ld2Var);
                qp3VarO.c(new jq3(qp3VarO, new t32(ag2Var), 0), ld2Var);
                return;
            case 1:
                Map map2 = (Map) this.h;
                hg4 hg4Var = hg4.C;
                oc2 oc2Var = hg4Var.y;
                oc2 oc2Var2 = hg4Var.y;
                Context context = (Context) this.g;
                if (oc2Var.a(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 94399) {
                        if (iHashCode != 94401) {
                            if (iHashCode == 94407 && str3.equals("_ai")) {
                                Map map3 = (Map) map2.get("_ai");
                                oc2Var2.getClass();
                                oc2Var2.h(context, "_ai", str4, oc2.f(map3));
                                return;
                            }
                        } else if (str3.equals("_ac")) {
                            Map map4 = (Map) map2.get("_ac");
                            oc2Var2.getClass();
                            oc2Var2.h(context, "_ac", str4, oc2.f(map4));
                            return;
                        }
                    } else if (str3.equals("_aa")) {
                        oc2Var2.h(context, "_aa", str4, null);
                        return;
                    }
                    gi2.Z("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            case 2:
                String str5 = (String) map.get("id");
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                String strConcat = TextUtils.isEmpty(str8) ? "" : "\n".concat(String.valueOf(str8));
                synchronized (this.g) {
                    try {
                        k42Var = (k42) ((HashMap) this.h).remove(str5);
                    } catch (JSONException e) {
                        k42Var.w(e.getMessage());
                    } finally {
                    }
                    if (k42Var == null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb.append("Received result for unexpected method invocation: ");
                        sb.append(str5);
                        gi2.i0(sb.toString());
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + strConcat.length());
                        sb2.append(str7);
                        sb2.append(strConcat);
                        k42Var.w(sb2.toString());
                        return;
                    }
                    if (str9 == null) {
                        k42Var.x(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (gi2.R()) {
                        String string = jSONObject.toString(2);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 13);
                        sb3.append("Result GMSG: ");
                        sb3.append(string);
                        gi2.G(sb3.toString());
                    }
                    k42Var.x(jSONObject);
                    return;
                }
            case 3:
                dr2 dr2Var = (dr2) ((WeakReference) this.g).get();
                if (dr2Var == null) {
                    return;
                }
                dr2Var.l.a();
                iz1 iz1Var = mz1.Jd;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    View view = (View) ((WeakReference) this.h).get();
                    a83 a83Var = dr2Var.o;
                    fs2 fs2Var = dr2Var.J;
                    fs2Var.getClass();
                    if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue() || view == null) {
                        return;
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (parent == null) {
                            str = "0";
                        } else if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                            str = "1";
                        } else {
                            parent = parent.getParent();
                        }
                    }
                    lv2 lv2VarA = fs2Var.a.a();
                    lv2VarA.k("action", "hcp");
                    lv2VarA.k("hcp", str);
                    lv2VarA.i(a83Var);
                    lv2VarA.m();
                    return;
                }
                return;
            case 4:
                hs2 hs2Var = (hs2) this.g;
                try {
                    hs2Var.k = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    gi2.Z("Failed to call parse unconfirmedClickTimestamp.");
                }
                a32 a32Var = (a32) this.h;
                hs2Var.j = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                if (a32Var == null) {
                    gi2.U("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel parcelU = a32Var.U();
                    parcelU.writeString(str10);
                    a32Var.M0(parcelU, 1);
                    return;
                } catch (RemoteException e2) {
                    gi2.p0("#007 Could not call remote method.", e2);
                    return;
                }
            case 5:
                ou2 ou2Var = (ou2) this.g;
                ag2 ag2Var2 = (ag2) this.h;
                xj2 xj2Var = ou2Var.i;
                synchronized (xj2Var) {
                    xj2Var.h.add(ag2Var2);
                    qj2 qj2Var = xj2Var.f;
                    ag2Var2.v0("/updateActiveView", qj2Var.e);
                    ag2Var2.v0("/untrackActiveViewUnit", qj2Var.f);
                }
                return;
            default:
                ag2 ag2Var3 = (ag2) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    gi2.i0("URL missing from httpTrack GMSG.");
                    return;
                }
                a83 a83VarF = ag2Var3.F();
                if (a83VarF != null && !a83VarF.i0) {
                    ((eb3) this.g).b(str11, a83VarF.x0, null, null);
                    return;
                }
                c83 c83VarF0 = ag2Var3.F0();
                if (c83VarF0 == null) {
                    hg4.C.h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                jz2 jz2Var = (jz2) this.h;
                hg4.C.k.getClass();
                wo1 wo1Var = new wo1(System.currentTimeMillis(), c83VarF0.b, str11, 2);
                jz2Var.getClass();
                jz2Var.a(new mr2(jz2Var, wo1Var, 4, false));
                return;
        }
    }

    public v32() {
        this.f = 2;
        this.g = new Object();
        this.h = new HashMap();
    }

    public v32(dr2 dr2Var, View view) {
        this.f = 3;
        this.g = new WeakReference(dr2Var);
        if (((Boolean) tw1.e.c.a(mz1.Jd)).booleanValue()) {
            this.h = new WeakReference(view);
        } else {
            this.h = new WeakReference(null);
        }
    }
}
