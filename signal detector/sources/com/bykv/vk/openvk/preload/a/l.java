package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private Map<String, a> f6623d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        List<h> f6624a = new ArrayList();

        public final a a(h hVar) {
            this.f6624a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f6624a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.f6623d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f6611a == f.class;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, a> f6625a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f6626b;

        public final a a(String str) {
            if (this.f6625a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f6625a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f6625a).a(this.f6626b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f6623d = (Map) obj;
                return;
            } catch (ClassCastException e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        throw new IllegalStateException("args error");
    }
}
