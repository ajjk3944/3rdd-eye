package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    public ApiException(Status status) {
        super(status.e() + ": " + (status.f() != null ? status.f() : ""));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.e();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f();
    }
}
