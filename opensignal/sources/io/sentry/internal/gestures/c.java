package io.sentry.internal.gestures;

import android.view.View;
import ir.f0;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12356b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12357c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12358d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12359e;

    public c(View view, String str, String str2, String str3, String str4) {
        this.f12355a = new WeakReference(view);
        this.f12356b = str;
        this.f12357c = str2;
        this.f12358d = str3;
        this.f12359e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (f0.s(this.f12356b, cVar.f12356b) && f0.s(this.f12357c, cVar.f12357c) && f0.s(this.f12358d, cVar.f12358d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12355a, this.f12357c, this.f12358d});
    }
}
