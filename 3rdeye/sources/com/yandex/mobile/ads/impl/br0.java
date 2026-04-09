package com.yandex.mobile.ads.impl;

import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class br0 implements tm {

    /* renamed from: a, reason: collision with root package name */
    private final long f25369a;

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet<zm> f25370b = new TreeSet<>(new P2(4));

    /* renamed from: c, reason: collision with root package name */
    private long f25371c;

    public br0(long j4) {
        this.f25369a = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(zm zmVar, zm zmVar2) {
        long j4 = zmVar.f36551g;
        long j10 = zmVar2.f36551g;
        if (j4 - j10 != 0) {
            return j4 < j10 ? -1 : 1;
        }
        if (!zmVar.f36546b.equals(zmVar2.f36546b)) {
            return zmVar.f36546b.compareTo(zmVar2.f36546b);
        }
        long j11 = zmVar.f36547c - zmVar2.f36547c;
        if (j11 == 0) {
            return 0;
        }
        return j11 < 0 ? -1 : 1;
    }

    @Override // com.yandex.mobile.ads.impl.mm.b
    public final void a(mm mmVar, zm zmVar) {
        this.f25370b.add(zmVar);
        this.f25371c += zmVar.f36548d;
        while (this.f25371c > this.f25369a && !this.f25370b.isEmpty()) {
            mmVar.a(this.f25370b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.mm.b
    public final void a(zm zmVar) {
        this.f25370b.remove(zmVar);
        this.f25371c -= zmVar.f36548d;
    }

    @Override // com.yandex.mobile.ads.impl.mm.b
    public final void a(mm mmVar, zm zmVar, zm zmVar2) {
        a(zmVar);
        a(mmVar, zmVar2);
    }

    @Override // com.yandex.mobile.ads.impl.tm
    public final void a(mm mmVar, long j4) {
        if (j4 != -1) {
            while (this.f25371c + j4 > this.f25369a && !this.f25370b.isEmpty()) {
                mmVar.a(this.f25370b.first());
            }
        }
    }
}
