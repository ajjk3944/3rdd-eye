package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    public final String f21484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f21486c;

    public I(K k6, String str, int i) {
        this.f21486c = k6;
        this.f21484a = str;
        this.f21485b = i;
    }

    @Override // k0.H
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f21486c.f21525x;
        if (abstractComponentCallbacksC2617v != null && this.f21485b < 0 && this.f21484a == null && abstractComponentCallbacksC2617v.l().Q(-1, 0)) {
            return false;
        }
        return this.f21486c.R(arrayList, arrayList2, this.f21484a, this.f21485b, 1);
    }
}
