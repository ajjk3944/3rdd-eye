package com.amazonaws.internal;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

/* loaded from: classes.dex */
public class StaticCredentialsProvider implements AWSCredentialsProvider {

    /* renamed from: a, reason: collision with root package name */
    private final AWSCredentials f34064a;

    public StaticCredentialsProvider(AWSCredentials aWSCredentials) {
        this.f34064a = aWSCredentials;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public AWSCredentials a() {
        return this.f34064a;
    }
}
