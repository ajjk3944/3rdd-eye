package com.polidea.rxandroidble3.exceptions;

import java.util.UUID;

/* loaded from: classes3.dex */
public class BleConflictingNotificationAlreadySetException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f39268a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39269b;

    public BleConflictingNotificationAlreadySetException(UUID uuid, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Characteristic ");
        sb2.append(uuid);
        sb2.append(" notification already set to ");
        sb2.append(z10 ? "indication" : "notification");
        super(sb2.toString());
        this.f39268a = uuid;
        this.f39269b = z10;
    }
}
