package com.google.mlkit.common;

import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class MlKitException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f39131a;

    public MlKitException(String str, int i10, Throwable th2) {
        super(AbstractC7901p.g(str, "Provided message must not be empty."), th2);
        this.f39131a = i10;
    }
}
