package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class RequestDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f42425a = NetworkTask.Method.GET;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f42426b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private byte[] f42427c = null;

    /* renamed from: d, reason: collision with root package name */
    private Long f42428d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f42429e;

    public void applySendTime(long j4) {
        this.f42428d = Long.valueOf(j4);
        this.f42429e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j4) * 1000) / 1000);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f42426b;
    }

    public NetworkTask.Method getMethod() {
        return this.f42425a;
    }

    public byte[] getPostData() {
        return this.f42427c;
    }

    public Long getSendTimestamp() {
        return this.f42428d;
    }

    public Integer getSendTimezoneSec() {
        return this.f42429e;
    }

    public void setHeader(String str, String... strArr) {
        this.f42426b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f42425a = NetworkTask.Method.POST;
        this.f42427c = bArr;
    }
}
