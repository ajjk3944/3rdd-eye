package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Cl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ El f39269a;

    public Cl(El el) {
        this.f39269a = el;
    }

    public final void a(String str, Gl gl, C4544cm c4544cm) {
        ArrayList arrayList;
        synchronized (this.f39269a.f39382b) {
            try {
                Collection collection = (Collection) this.f39269a.f39381a.f39621a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Nl) it.next()).a(gl, c4544cm);
        }
    }
}
