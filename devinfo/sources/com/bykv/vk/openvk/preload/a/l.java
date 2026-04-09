package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private Map<String, a> f6614d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<h> f6615a = new ArrayList();

        public final a a(h hVar) {
            this.f6615a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f6615a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.f6614d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f6602a == f.class;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, a> f6616a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f6617b;

        public final a a(String str) {
            if (this.f6616a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f6616a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f6616a).a(this.f6617b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f6614d = (Map) obj;
                return;
            } catch (ClassCastException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        throw new IllegalStateException("args error");
    }
}
