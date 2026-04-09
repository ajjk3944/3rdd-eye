package com.amazonaws;

/* loaded from: classes.dex */
public class AmazonServiceException extends AmazonClientException {

    /* renamed from: a, reason: collision with root package name */
    private String f34053a;

    /* renamed from: b, reason: collision with root package name */
    private String f34054b;

    /* renamed from: c, reason: collision with root package name */
    private String f34055c;

    /* renamed from: d, reason: collision with root package name */
    private int f34056d;

    /* renamed from: e, reason: collision with root package name */
    private String f34057e;

    public String a() {
        return this.f34054b;
    }

    public String c() {
        return this.f34055c;
    }

    public String d() {
        return this.f34053a;
    }

    public String g() {
        return this.f34057e;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c() + " (Service: " + g() + "; Status Code: " + h() + "; Error Code: " + a() + "; Request ID: " + d() + ")";
    }

    public int h() {
        return this.f34056d;
    }
}
