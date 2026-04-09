package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f3460b = new e() { // from class: com.apm.insight.runtime.e.1

        /* renamed from: a, reason: collision with root package name */
        private Header f3462a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f3462a == null) {
                this.f3462a = Header.b(com.apm.insight.e.g());
            }
            return this.f3462a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f3461a;

    public e() {
        this(f3460b);
    }

    public Object a(String str) {
        e eVar = this.f3461a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        e eVar = this.f3461a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f3461a = eVar;
    }
}
