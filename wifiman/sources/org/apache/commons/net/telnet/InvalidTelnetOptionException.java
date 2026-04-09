package org.apache.commons.net.telnet;

/* loaded from: classes4.dex */
public class InvalidTelnetOptionException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f56869a;

    /* renamed from: b, reason: collision with root package name */
    private final String f56870b;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f56870b + ": " + this.f56869a;
    }
}
