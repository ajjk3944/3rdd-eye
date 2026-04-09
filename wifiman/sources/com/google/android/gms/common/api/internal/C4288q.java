package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f.AbstractC5487d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4288q {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34848a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f34849b = Collections.synchronizedMap(new WeakHashMap());

    private final void f(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f34848a) {
            map = new HashMap(this.f34848a);
        }
        synchronized (this.f34849b) {
            map2 = new HashMap(this.f34849b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                AbstractC5487d.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    final void b(TaskCompletionSource taskCompletionSource, boolean z10) {
        this.f34849b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new C4287p(this, taskCompletionSource));
    }

    final void c(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        f(true, new Status(20, sb2.toString()));
    }

    public final void d() {
        f(false, C4276e.f34819p);
    }

    final boolean e() {
        return (this.f34848a.isEmpty() && this.f34849b.isEmpty()) ? false : true;
    }
}
