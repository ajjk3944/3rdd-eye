package com.unity3d.services.ads.token;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import y8.s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/ads/token/TokenStorage;", "", "Lorg/json/JSONArray;", "tokens", "Ly8/s;", "createTokens", "(Lorg/json/JSONArray;)V", "appendTokens", "deleteTokens", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setInitToken", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", BidResponsed.KEY_TOKEN, "getNativeGeneratedToken", "()Ly8/s;", "nativeGeneratedToken", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TokenStorage {
    void appendTokens(@NotNull JSONArray tokens) throws JSONException;

    void createTokens(@NotNull JSONArray tokens) throws JSONException;

    void deleteTokens();

    @NotNull
    s getNativeGeneratedToken();

    @Nullable
    String getToken();

    void setInitToken(@Nullable String value);
}
