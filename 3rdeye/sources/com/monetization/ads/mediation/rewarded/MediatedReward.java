package com.monetization.ads.mediation.rewarded;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedReward {

    /* renamed from: a, reason: collision with root package name */
    private final int f23767a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23768b;

    public MediatedReward(int i, String type) {
        l.f(type, "type");
        this.f23767a = i;
        this.f23768b = type;
    }

    public final int getAmount() {
        return this.f23767a;
    }

    public final String getType() {
        return this.f23768b;
    }
}
