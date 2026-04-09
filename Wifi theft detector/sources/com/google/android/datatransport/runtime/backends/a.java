package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* loaded from: classes2.dex */
public final class a extends BackendResponse {

    /* renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f9742a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9743b;

    public a(BackendResponse.Status status, long j10) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f9742a = status;
        this.f9743b = j10;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long b() {
        return this.f9743b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status c() {
        return this.f9742a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendResponse) {
            BackendResponse backendResponse = (BackendResponse) obj;
            if (this.f9742a.equals(backendResponse.c()) && this.f9743b == backendResponse.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f9742a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f9743b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f9742a + ", nextRequestWaitMillis=" + this.f9743b + "}";
    }
}
