package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class q52 implements em {

    /* renamed from: d, reason: collision with root package name */
    public static final em.a<q52> f32074d = new L2(7);

    /* renamed from: b, reason: collision with root package name */
    public final l52 f32075b;

    /* renamed from: c, reason: collision with root package name */
    public final xj0<Integer> f32076c;

    public q52(l52 l52Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l52Var.f29890b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f32075b = l52Var;
        this.f32076c = xj0.a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q52 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        l52 l52Var = (l52) l52.f29889g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new q52(l52Var, up0.a(intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q52.class == obj.getClass()) {
            q52 q52Var = (q52) obj;
            if (this.f32075b.equals(q52Var.f32075b) && this.f32076c.equals(q52Var.f32076c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f32076c.hashCode() * 31) + this.f32075b.hashCode();
    }
}
