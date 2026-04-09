package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1698pc implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16179a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16180b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16181c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16182d;

    public C1698pc(C0895ak c0895ak, C1536mc c1536mc, h2.d dVar) {
        this.f16180b = c1536mc;
        this.f16181c = dVar;
        this.f16182d = c0895ak;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) {
        switch (this.f16179a) {
            case 0:
                AbstractC2907C.m("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                C0895ak c0895ak = (C0895ak) this.f16182d;
                synchronized (c0895ak.f13214b) {
                    try {
                        AbstractC2907C.m("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        u2.k.g("JS Engine is requesting an update");
                        if (c0895ak.f13219g == 0) {
                            u2.k.g("Starting reload.");
                            c0895ak.f13219g = 2;
                            c0895ak.a();
                        }
                        ((C1536mc) this.f16180b).d("/requestReload", (C1698pc) ((h2.d) this.f16181c).f20472a);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                AbstractC2907C.m("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((InterfaceC1050db) this.f16180b).E1((InterfaceC0839Za) ((InterfaceC1692pN) this.f16182d).c(), str);
                    return;
                } catch (RemoteException e6) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
                    sb.append("Failed to call onCustomClick for asset ");
                    sb.append(str);
                    sb.append(".");
                    u2.k.i(sb.toString(), e6);
                    return;
                }
        }
    }

    public C1698pc(C1708pm c1708pm, C1492lm c1492lm, C1547mn c1547mn, InterfaceC1692pN interfaceC1692pN) {
        this.f16180b = (InterfaceC1050db) c1708pm.f16222g.get(c1492lm.q());
        this.f16181c = c1547mn;
        this.f16182d = interfaceC1692pN;
    }
}
