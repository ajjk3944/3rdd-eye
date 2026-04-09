package com.google.android.gms.common.api;

import r3.C7566d;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C7566d f34726a;

    public UnsupportedApiCallException(C7566d c7566d) {
        this.f34726a = c7566d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f34726a));
    }
}
