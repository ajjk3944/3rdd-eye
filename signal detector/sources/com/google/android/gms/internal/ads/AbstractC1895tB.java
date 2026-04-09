package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1895tB {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f16873a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f16874b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f16875c;

    public abstract Collection a();

    public abstract Map b();

    public boolean c(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        Map map = this.f16875c;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f16875c = mapB;
        return mapB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1895tB) {
            return d().equals(((AbstractC1895tB) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
