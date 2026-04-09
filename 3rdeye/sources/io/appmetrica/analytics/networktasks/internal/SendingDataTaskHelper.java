package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes3.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f42434a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f42435b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f42436c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f42437d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f42438e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f42439f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f42439f.handle(this.f42438e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f42437d.applySendTime(this.f42436c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f42435b.compress(bArr);
            if (bArrCompress != null && (bArrEncrypt = this.f42434a.encrypt(bArrCompress)) != null) {
                this.f42437d.setPostData(bArrEncrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f42434a = requestBodyEncrypter;
        this.f42435b = compressor;
        this.f42436c = timeProvider;
        this.f42437d = requestDataHolder;
        this.f42438e = responseDataHolder;
        this.f42439f = networkResponseHandler;
    }
}
