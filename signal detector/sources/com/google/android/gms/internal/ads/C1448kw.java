package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.view.View;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448kw implements c3.b, BD, XJ, ZA, InterfaceC0801Wn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15313a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15314b;

    public /* synthetic */ C1448kw(int i, Object obj) {
        this.f15313a = i;
        this.f15314b = obj;
    }

    public static C1448kw f(MA ma) {
        return new C1448kw(3, new Wu(5, ma));
    }

    public static C1448kw g(byte[] bArr) {
        return new C1448kw(5, C1313iK.a(bArr));
    }

    public static C1448kw i(int i) {
        return new C1448kw(5, C1313iK.a(AbstractC1739qG.a(i)));
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        return (C0573Jg) this.f15314b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        CO co = (CO) obj;
        switch (this.f15313a) {
            case 8:
                co.p();
                break;
            default:
                co.k((TP) this.f15314b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.XJ
    public Object c(String str) {
        InterfaceC0877aK interfaceC0877aK = (InterfaceC0877aK) this.f15314b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            Provider provider = Security.getProvider(strArr[i3]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return interfaceC0877aK.d(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
        return interfaceC0877aK.d(str, null);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        My my = (My) obj;
        Hy hy = (Hy) ((Qy) this.f15314b).f10815c;
        synchronized (hy.f9040m) {
            H5 h52 = hy.f9043p;
            String strA = my.a();
            h52.b();
            ((I5) h52.f13551b).K(strA);
        }
    }

    @Override // c3.b
    public void e(c3.j jVar) {
        Tx tx = (Tx) this.f15314b;
        if (jVar.f5914d) {
            tx.cancel(false);
            return;
        }
        if (jVar.e()) {
            tx.d(jVar.c());
            return;
        }
        Exception excB = jVar.b();
        if (excB == null) {
            throw new IllegalStateException();
        }
        tx.e(excB);
    }

    public JSONObject h(View view) throws JSONException {
        int currentModeType;
        JSONObject jSONObjectA = AbstractC1718pw.a(0, 0, 0, 0);
        UiModeManager uiModeManager = Cr.f7677b;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : C1476lN.f15381c;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i3 == 0);
            return jSONObjectA;
        } catch (JSONException e6) {
            AbstractC1984ut.l("Error with setting output device status", e6);
            return jSONObjectA;
        }
    }

    public List j(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itE = ((YA) this.f15314b).e(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            XA xa = (XA) itE;
            if (!xa.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) xa.next());
        }
    }

    public /* synthetic */ C1448kw(BO bo, TP tp, CN cn) {
        this.f15313a = 9;
        this.f15314b = tp;
    }

    public /* synthetic */ C1448kw(BO bo, Object obj, long j6) {
        this.f15313a = 8;
        this.f15314b = obj;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
    }
}
