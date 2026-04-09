package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5058d implements A {
    AbstractC5058d() {
    }

    @Override // com.google.common.collect.A
    public abstract Map a();

    public boolean c(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return B.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
