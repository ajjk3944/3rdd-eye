package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f9935a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9936b;

    /* renamed from: c, reason: collision with root package name */
    public final LB f9937c;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public N0(Uri uri, LB lb) {
        List list = Collections.EMPTY_LIST;
        this.f9935a = uri;
        ArrayList arrayList = D4.f7726a;
        this.f9936b = list;
        this.f9937c = lb;
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (lb.size() <= 0) {
            LB.o(0, objArr);
        } else {
            lb.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f9935a.equals(n02.f9935a) && this.f9936b.equals(n02.f9936b) && this.f9937c.equals(n02.f9937c);
    }

    public final int hashCode() {
        return (int) ((((this.f9937c.hashCode() + ((this.f9936b.hashCode() + (this.f9935a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
