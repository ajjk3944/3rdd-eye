package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f5245b = new e() { // from class: com.apm.insight.runtime.e.1

        /* renamed from: a, reason: collision with root package name */
        private Header f5247a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            if (this.f5247a == null) {
                this.f5247a = Header.b(com.apm.insight.e.g());
            }
            return this.f5247a.f().opt(str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f5246a;

    public e() {
        this(f5245b);
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.f5246a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.f5246a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f5246a = eVar;
    }
}
