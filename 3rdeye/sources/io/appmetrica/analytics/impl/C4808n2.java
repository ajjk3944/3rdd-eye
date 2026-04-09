package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4808n2 extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final C4933ro f41289b;

    /* renamed from: c, reason: collision with root package name */
    public final C4593ek f41290c;

    public C4808n2(C4940s5 c4940s5) {
        this(c4940s5, c4940s5.t(), C4593ek.c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        C4940s5 c4940s5 = this.f40632a;
        if (!this.f41289b.c() && !this.f41289b.d()) {
            if (((C5028vh) c4940s5.f41608k.a()).f41862e) {
                this.f41290c.b();
            }
            C4531c9 c4531c9 = this.f40632a.f41609l;
            if (c4531c9.f40620c == null) {
                c4531c9.a();
            }
            C4582e9 c4582e9 = c4531c9.f40620c;
            c4582e9.getClass();
            c4582e9.f40797b = new HashSet();
            c4582e9.f40799d = 0;
            C4582e9 c4582e92 = c4531c9.f40620c;
            c4582e92.f40796a = true;
            C4660h9 c4660h9 = c4531c9.f40619b;
            IBinaryDataHelper iBinaryDataHelper = c4660h9.f40996c;
            C4634g9 c4634g9 = c4660h9.f40995b;
            c4660h9.f40994a.getClass();
            M9 m9A = C4608f9.a(c4582e92);
            c4634g9.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m9A));
        }
        return false;
    }

    public C4808n2(C4940s5 c4940s5, C4933ro c4933ro, C4593ek c4593ek) {
        super(c4940s5);
        this.f41289b = c4933ro;
        this.f41290c = c4593ek;
    }
}
