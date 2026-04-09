package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import q2.InterfaceC2806a;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525Gj implements InterfaceC2806a {

    /* renamed from: a, reason: collision with root package name */
    public final C0576Jj f8434a;

    /* renamed from: b, reason: collision with root package name */
    public final C0960bu f8435b;

    public C0525Gj(C0576Jj c0576Jj, C0960bu c0960bu) {
        this.f8434a = c0576Jj;
        this.f8435b = c0960bu;
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        C0960bu c0960bu = this.f8435b;
        C0576Jj c0576Jj = this.f8434a;
        String str = c0960bu.f13485g;
        synchronized (c0576Jj.f9341a) {
            try {
                ConcurrentHashMap concurrentHashMap = c0576Jj.f9342b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
