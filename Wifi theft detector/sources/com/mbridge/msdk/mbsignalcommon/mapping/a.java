package com.mbridge.msdk.mbsignalcommon.mapping;

/* loaded from: classes3.dex */
public class a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f16202a;

    /* renamed from: b, reason: collision with root package name */
    private String f16203b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f16202a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.f16203b = str;
    }
}
