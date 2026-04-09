package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14695b;

    public /* synthetic */ of0(int i4, Object obj) {
        this.f14694a = i4;
        this.f14695b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f14694a) {
            case 0:
                yf0 yf0Var = (yf0) this.f14695b;
                zd0 zd0Var = (zd0) yf0Var.f18731e;
                zd0Var.getClass();
                Iterator it = ((CopyOnWriteArraySet) yf0Var.f18732f).iterator();
                while (it.hasNext()) {
                    me0 me0Var = (me0) it.next();
                    if (!me0Var.f13880d && me0Var.f13879c) {
                        yv1 yv1VarW = me0Var.f13878b.w();
                        me0Var.f13878b = new a4.d(5);
                        me0Var.f13879c = false;
                        zd0Var.j(me0Var.f13877a, yv1VarW);
                    }
                    no0 no0Var = (no0) yf0Var.f18730d;
                    no0Var.getClass();
                    if (no0Var.f14385a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f14695b;
                dVar.getClass();
                int i4 = message.what;
                if (i4 == 1) {
                    ((hm0) dVar.f19300f).a();
                    break;
                } else if (i4 == 2) {
                    ((sm0) dVar.g).a();
                    break;
                } else if (i4 == 3) {
                    ((vm0) dVar.f19301h).a();
                    break;
                } else if (i4 == 4) {
                    ((bn0) dVar.f19302i).a();
                    break;
                }
                break;
        }
        return true;
    }
}
