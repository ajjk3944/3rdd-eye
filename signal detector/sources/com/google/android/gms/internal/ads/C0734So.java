package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0734So implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11248b;

    public /* synthetic */ C0734So(int i, Object obj) {
        this.f11247a = i;
        this.f11248b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f11247a) {
            case 0:
                C1009cp c1009cp = (C1009cp) this.f11248b;
                InterfaceC1172fo interfaceC1172fo = (InterfaceC1172fo) c1009cp.f13676e;
                interfaceC1172fo.getClass();
                Iterator it = ((CopyOnWriteArraySet) c1009cp.f13677f).iterator();
                while (it.hasNext()) {
                    C1871so c1871so = (C1871so) it.next();
                    if (!c1871so.f16798d && c1871so.f16797c) {
                        C1264hP c1264hPJ = c1871so.f16796b.j();
                        c1871so.f16796b = new P.g(4);
                        c1871so.f16797c = false;
                        interfaceC1172fo.q(c1871so.f16795a, c1264hPJ);
                    }
                    C1231gt c1231gt = (C1231gt) c1009cp.f13675d;
                    c1231gt.getClass();
                    if (c1231gt.f14397a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                K4.c cVar = (K4.c) this.f11248b;
                cVar.getClass();
                int i = message.what;
                if (i == 1) {
                    ((C1337is) cVar.f2215h).a();
                    break;
                } else if (i == 2) {
                    ((C1821rs) cVar.i).a();
                    break;
                } else if (i == 3) {
                    ((C1929ts) cVar.f2211d).a();
                    break;
                } else if (i == 4) {
                    ((C2199ys) cVar.f2216j).a();
                    break;
                }
                break;
        }
        return true;
    }
}
