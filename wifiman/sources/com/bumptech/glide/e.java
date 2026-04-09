package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f34206a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f34207a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f34206a = Collections.unmodifiableMap(new HashMap(aVar.f34207a));
    }

    public boolean a(Class cls) {
        return this.f34206a.containsKey(cls);
    }
}
