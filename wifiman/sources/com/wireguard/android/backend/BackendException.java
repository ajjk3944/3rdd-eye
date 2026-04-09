package com.wireguard.android.backend;

/* loaded from: classes4.dex */
public final class BackendException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f45587a;

    /* renamed from: b, reason: collision with root package name */
    private final a f45588b;

    public enum a {
        UNKNOWN_KERNEL_MODULE_NAME,
        WG_QUICK_CONFIG_ERROR_CODE,
        TUNNEL_MISSING_CONFIG,
        VPN_NOT_AUTHORIZED,
        UNABLE_TO_START_VPN,
        TUN_CREATION_ERROR,
        GO_ACTIVATION_ERROR_CODE,
        DNS_RESOLUTION_FAILURE
    }

    public BackendException(a aVar, Object... objArr) {
        this.f45588b = aVar;
        this.f45587a = objArr;
    }

    public a a() {
        return this.f45588b;
    }
}
