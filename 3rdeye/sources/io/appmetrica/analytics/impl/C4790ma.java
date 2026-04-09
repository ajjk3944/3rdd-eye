package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4790ma {

    /* renamed from: a, reason: collision with root package name */
    public final Ql f41251a = new Ql();

    /* renamed from: b, reason: collision with root package name */
    public C4842oa f41252b = new C4842oa();

    public final synchronized void a(C4842oa c4842oa) {
        this.f41252b = c4842oa;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.l.b((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f41252b.f41368a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    C4842oa c4842oa = this.f41252b;
                    IdentifierStatus identifierStatus = c4842oa.f41369b;
                    String str2 = c4842oa.f41370c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new b9.j();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f41251a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
