package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.Eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0496Eo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8008d;

    public /* synthetic */ RunnableC0496Eo(int i, int i3, Object obj, Object obj2) {
        this.f8005a = i3;
        this.f8007c = obj;
        this.f8006b = i;
        this.f8008d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8005a) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f8007c).iterator();
                while (it.hasNext()) {
                    InterfaceC0801Wn interfaceC0801Wn = (InterfaceC0801Wn) this.f8008d;
                    C1871so c1871so = (C1871so) it.next();
                    if (!c1871so.f16798d) {
                        int i = this.f8006b;
                        if (i != -1) {
                            c1871so.f16796b.i(i);
                        }
                        c1871so.f16797c = true;
                        interfaceC0801Wn.mo4b(c1871so.f16795a);
                    }
                }
                break;
            default:
                ((AbstractC1466lD) this.f8007c).s(this.f8006b, (InterfaceFutureC2326a) this.f8008d);
                break;
        }
    }
}
