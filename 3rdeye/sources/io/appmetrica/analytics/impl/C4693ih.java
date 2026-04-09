package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4693ih extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final C4531c9 f41083b;

    public C4693ih(C4940s5 c4940s5) {
        this(c4940s5, c4940s5.i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        EnumC5046wa enumC5046wa;
        if (!TextUtils.isEmpty(c4683i6.getName())) {
            C4531c9 c4531c9 = this.f41083b;
            String name = c4683i6.getName();
            if (c4531c9.f40620c == null) {
                c4531c9.a();
            }
            int iHashCode = name.hashCode();
            if (c4531c9.f40620c.f40797b.contains(Integer.valueOf(iHashCode))) {
                enumC5046wa = EnumC5046wa.NON_FIRST_OCCURENCE;
            } else {
                C4582e9 c4582e9 = c4531c9.f40620c;
                EnumC5046wa enumC5046wa2 = c4582e9.f40796a ? EnumC5046wa.FIRST_OCCURRENCE : EnumC5046wa.UNKNOWN;
                if (c4582e9.f40799d < 1000) {
                    c4582e9.f40797b.add(Integer.valueOf(iHashCode));
                    c4582e9.f40799d++;
                } else {
                    c4582e9.f40796a = false;
                }
                C4660h9 c4660h9 = c4531c9.f40619b;
                C4582e9 c4582e92 = c4531c9.f40620c;
                IBinaryDataHelper iBinaryDataHelper = c4660h9.f40996c;
                C4634g9 c4634g9 = c4660h9.f40995b;
                c4660h9.f40994a.getClass();
                M9 m9A = C4608f9.a(c4582e92);
                c4634g9.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m9A));
                enumC5046wa = enumC5046wa2;
            }
            c4683i6.f41053k = enumC5046wa;
        }
        return false;
    }

    public C4693ih(C4940s5 c4940s5, C4531c9 c4531c9) {
        super(c4940s5);
        this.f41083b = c4531c9;
    }
}
