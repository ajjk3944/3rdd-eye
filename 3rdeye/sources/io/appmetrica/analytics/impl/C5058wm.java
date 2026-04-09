package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5058wm implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final C5108ym f41988a;

    /* renamed from: b, reason: collision with root package name */
    public C4492am f41989b;

    /* renamed from: c, reason: collision with root package name */
    public Gl f41990c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f41991d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f41992e;

    /* renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f41993f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f41994g;

    /* renamed from: h, reason: collision with root package name */
    public final Ol f41995h;

    public C5058wm(C5108ym c5108ym, FullUrlFormer<Yl> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<Yl> configProvider) {
        this(c5108ym, new Ol(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f41988a.f42149a.f42206f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f41994g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f41991d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f41993f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((Yl) this.f41992e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C5082xl) Ga.f39501F.y()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f41991d.setHeader("Accept-Encoding", "encrypted");
        return this.f41988a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        if (z10) {
            return;
        }
        this.f41990c = Gl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C4492am c4492amHandle = this.f41995h.handle(this.f41993f);
        this.f41989b = c4492amHandle;
        return c4492amHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f41990c = Gl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f41990c = Gl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f41989b == null || this.f41993f.getResponseHeaders() == null) {
            return;
        }
        this.f41988a.a(this.f41989b, (Yl) this.f41992e.getConfig(), this.f41993f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f41990c == null) {
            this.f41990c = Gl.UNKNOWN;
        }
        this.f41988a.a(this.f41990c);
    }

    public C5058wm(C5108ym c5108ym, Ol ol, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f41988a = c5108ym;
        this.f41995h = ol;
        this.f41991d = requestDataHolder;
        this.f41993f = responseDataHolder;
        this.f41992e = configProvider;
        this.f41994g = fullUrlFormer;
        fullUrlFormer.setHosts(((Yl) configProvider.getConfig()).k());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }
}
