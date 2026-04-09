package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5125ze {

    /* renamed from: a, reason: collision with root package name */
    public final int f42178a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f42179b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f42180c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f42178a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f42179b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f42180c;
        }
        throw new b9.j();
    }

    public final Boolean a(int i) {
        if (i == this.f42179b) {
            return Boolean.FALSE;
        }
        if (i == this.f42180c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
