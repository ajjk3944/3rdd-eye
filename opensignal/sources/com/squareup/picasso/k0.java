package com.squareup.picasso;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5917a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5918b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5919c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5920d = null;

    /* renamed from: e, reason: collision with root package name */
    public final int f5921e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5922f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f5923g;

    static {
        TimeUnit.SECONDS.toNanos(5L);
    }

    public k0(Uri uri, int i10, int i11, int i12, d0 d0Var) {
        this.f5918b = uri;
        this.f5919c = i10;
        this.f5921e = i11;
        this.f5922f = i12;
        this.f5923g = d0Var;
    }

    public final boolean a() {
        return (this.f5921e == 0 && this.f5922f == 0) ? false : true;
    }

    public final boolean b() {
        return a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f5919c;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f5918b);
        }
        List list = this.f5920d;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                sb2.append(' ');
                throw null;
            }
        }
        int i11 = this.f5921e;
        if (i11 > 0) {
            sb2.append(" resize(");
            sb2.append(i11);
            sb2.append(',');
            sb2.append(this.f5922f);
            sb2.append(')');
        }
        sb2.append('}');
        return sb2.toString();
    }
}
