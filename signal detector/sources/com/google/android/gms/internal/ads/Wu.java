package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class Wu implements Eu, T0.e, InterfaceC1989uy, YA, ZA, InterfaceC0801Wn, InterfaceC1048dR {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12336a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12337b;

    public /* synthetic */ Wu(int i, Object obj) {
        this.f12336a = i;
        this.f12337b = obj;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        return (C0911b) this.f12337b;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public /* synthetic */ Object b(Object obj) {
        if (((Boolean) AbstractC1049da.f13768c.v()).booleanValue()) {
            ((Su) this.f12337b).a();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1048dR
    public C1197gC c(int i, C2108x8 c2108x8, int[] iArr) {
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        int i6 = 0;
        while (i3 < c2108x8.f17546a) {
            int i7 = i;
            C2108x8 c2108x82 = c2108x8;
            XQ xq = new XQ(i7, c2108x82, i3, (C0884aR) this.f12337b, iArr[i3]);
            int length = objArrCopyOf.length;
            int i8 = i6 + 1;
            int iD = GB.d(length, i8);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i6] = xq;
            i3++;
            i6 = i8;
            i = i7;
            c2108x8 = c2108x82;
        }
        return LB.o(i6, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989uy
    public /* synthetic */ void d(Object obj, FileOutputStream fileOutputStream) {
        ((FK) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.YA
    public /* synthetic */ Iterator e(C1448kw c1448kw, CharSequence charSequence) {
        return new VA(charSequence, (MA) this.f12337b, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989uy
    public /* synthetic */ Object f() {
        return (FK) this.f12337b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989uy
    public Object g(FileInputStream fileInputStream) throws C1636oL {
        try {
            CL clO = ((AbstractC1096eL) ((FK) this.f12337b)).o();
            XK xk = XK.f12412a;
            int i = JK.f9277a;
            XK xk2 = XK.f12413b;
            C1042dL c1042dL = (C1042dL) clO;
            c1042dL.getClass();
            SK sk = new SK(fileInputStream);
            AbstractC1096eL abstractC1096eLL = AbstractC1096eL.l(c1042dL.f13757a, sk, xk2);
            sk.o(0);
            if (AbstractC1096eL.x(abstractC1096eLL, true)) {
                return abstractC1096eLL;
            }
            throw new C1636oL(new QL().getMessage());
        } catch (C1636oL e6) {
            throw new C1881sy("Cannot read proto.", e6);
        }
    }

    @Override // T0.e
    public void onPostMessage(WebView webView, T0.d dVar, Uri uri, boolean z6, T0.a aVar) throws JSONException {
        Vv vv = (Vv) this.f12337b;
        try {
            JSONObject jSONObject = new JSONObject(dVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                vv.a(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap map = vv.f12110d;
                Rv rv = (Rv) map.get(string2);
                if (rv != null) {
                    rv.c();
                    map.remove(string2);
                }
            }
        } catch (JSONException e6) {
            AbstractC1984ut.l("Error parsing JS message in JavaScriptSessionService.", e6);
        }
    }

    public /* synthetic */ Wu(BO bo, Object obj, int i) {
        this.f12336a = i;
        this.f12337b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        CO co = (CO) obj;
        switch (this.f12336a) {
            case 9:
                co.c((BN) this.f12337b);
                break;
            default:
                C1161fd c1161fd = (C1161fd) this.f12337b;
                co.j(c1161fd);
                int i = c1161fd.f14103a;
                break;
        }
    }
}
