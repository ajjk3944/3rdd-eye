package com.opensignal.sdk.data.traceroute;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/opensignal/sdk/data/traceroute/TracerouteListener;", "", "", "logMessage", "Llq/b0;", "onStart", "(Ljava/lang/String;)V", "endpoint", "onEndpoint", "ipAddress", "onEndpointResolved", "onProgress", "onFinish", "onError", "jsonStringResult", "onResult", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TracerouteListener {
    void onEndpoint(String endpoint);

    void onEndpointResolved(String ipAddress);

    void onError(String logMessage);

    void onFinish(String logMessage);

    void onProgress(String logMessage);

    void onResult(String jsonStringResult);

    void onStart(String logMessage);
}
