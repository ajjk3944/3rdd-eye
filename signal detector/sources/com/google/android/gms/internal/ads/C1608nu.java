package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.nu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608nu {

    /* renamed from: b, reason: collision with root package name */
    public final int f15843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15844c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f15842a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final Bu f15845d = new Bu();

    public C1608nu(int i, int i3) {
        this.f15843b = i;
        this.f15844c = i3;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f15842a;
            if (linkedList.isEmpty()) {
                return;
            }
            C1877su c1877su = (C1877su) linkedList.getFirst();
            p2.j.f22785C.f22797k.getClass();
            if (System.currentTimeMillis() - c1877su.f16821d < this.f15844c) {
                return;
            }
            Bu bu = this.f15845d;
            bu.f7464f++;
            bu.f7460b.f7065b++;
            linkedList.remove();
        }
    }
}
