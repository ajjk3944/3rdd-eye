package com.polidea.rxandroidble3.exceptions;

import java.util.UUID;

/* loaded from: classes3.dex */
public class BleCharacteristicNotFoundException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f39267a;

    public BleCharacteristicNotFoundException(UUID uuid) {
        super("Characteristic not found with UUID " + uuid);
        this.f39267a = uuid;
    }
}
