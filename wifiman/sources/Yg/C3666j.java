package Yg;

import java.io.Serializable;

/* renamed from: Yg.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3666j implements m, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25006a;

    public C3666j(Object obj) {
        this.f25006a = obj;
    }

    @Override // Yg.m
    public Object getValue() {
        return this.f25006a;
    }

    @Override // Yg.m
    public boolean m() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
