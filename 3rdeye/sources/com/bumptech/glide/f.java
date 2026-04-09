package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, Object> f22254a;

    /* compiled from: GlideExperiments.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f22255a = new HashMap();
    }

    public f(a aVar) {
        this.f22254a = Collections.unmodifiableMap(new HashMap(aVar.f22255a));
    }
}
