package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class af0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9318d;

    public /* synthetic */ af0(Object obj, int i4, Object obj2, int i10) {
        this.f9315a = i10;
        this.f9317c = obj;
        this.f9316b = i4;
        this.f9318d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9315a) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f9317c).iterator();
                while (it.hasNext()) {
                    rd0 rd0Var = (rd0) this.f9318d;
                    me0 me0Var = (me0) it.next();
                    if (!me0Var.f13880d) {
                        int i4 = this.f9316b;
                        if (i4 != -1) {
                            me0Var.f13878b.s(i4);
                        }
                        me0Var.f13879c = true;
                        rd0Var.mo160c(me0Var.f13877a);
                    }
                }
                break;
            default:
                ((z71) this.f9317c).t(this.f9316b, (vd.b) this.f9318d);
                break;
        }
    }
}
