package com.polidea.rxandroidble3.exceptions;

import java.util.UUID;

/* loaded from: classes3.dex */
public class BleServiceNotFoundException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f39279a;

    public BleServiceNotFoundException(UUID uuid) {
        super("BLE Service not found with UUID " + uuid);
        this.f39279a = uuid;
    }
}
