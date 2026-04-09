package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0415Ab implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7010a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7011b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7012c;

    public /* synthetic */ C0415Ab(Object obj, int i, Object obj2) {
        this.f7010a = i;
        this.f7011b = obj;
        this.f7012c = obj2;
    }

    private final void a(Object obj, Map map) {
        C2248zn c2248zn = (C2248zn) this.f7011b;
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f7012c;
        C0643Ni c0643Ni = c2248zn.i;
        synchronized (c0643Ni) {
            c0643Ni.f10036c.add(interfaceC0828Yg);
            C0575Ji c0575Ji = c0643Ni.f10034a;
            interfaceC0828Yg.g0("/updateActiveView", c0575Ji.f9339e);
            interfaceC0828Yg.g0("/untrackActiveViewUnit", c0575Ji.f9340f);
        }
    }

    public void b(String str, InterfaceC0602Lb interfaceC0602Lb) {
        synchronized (this.f7011b) {
            ((HashMap) this.f7012c).put(str, interfaceC0602Lb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0415Ab.e(java.lang.Object, java.util.Map):void");
    }

    public C0415Ab() {
        this.f7010a = 2;
        this.f7011b = new Object();
        this.f7012c = new HashMap();
    }

    public C0415Ab(C0816Xl c0816Xl, View view) {
        this.f7010a = 3;
        this.f7011b = new WeakReference(c0816Xl);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ge)).booleanValue()) {
            this.f7012c = new WeakReference(view);
        } else {
            this.f7012c = new WeakReference(null);
        }
    }
}
