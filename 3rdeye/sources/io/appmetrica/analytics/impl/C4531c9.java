package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4531c9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40618a;

    /* renamed from: b, reason: collision with root package name */
    public final C4660h9 f40619b;

    /* renamed from: c, reason: collision with root package name */
    public C4582e9 f40620c;

    public C4531c9(C4660h9 c4660h9, int i) {
        this.f40618a = i;
        this.f40619b = c4660h9;
    }

    public final void a() {
        C4582e9 c4582e9;
        C4660h9 c4660h9 = this.f40619b;
        c4660h9.getClass();
        try {
            byte[] bArr = c4660h9.f40996c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                C4608f9 c4608f9 = c4660h9.f40994a;
                c4660h9.f40995b.getClass();
                M9 m92 = new M9();
                c4608f9.getClass();
                c4582e9 = new C4582e9(m92.f39853a, m92.f39854b, m92.f39855c, CollectionUtils.hashSetFromIntArray(m92.f39856d));
            } else {
                C4608f9 c4608f92 = c4660h9.f40994a;
                M9 state = c4660h9.f40995b.toState(bArr);
                c4608f92.getClass();
                c4582e9 = new C4582e9(state.f39853a, state.f39854b, state.f39855c, CollectionUtils.hashSetFromIntArray(state.f39856d));
            }
        } catch (Throwable unused) {
            C4608f9 c4608f93 = c4660h9.f40994a;
            c4660h9.f40995b.getClass();
            M9 m93 = new M9();
            c4608f93.getClass();
            c4582e9 = new C4582e9(m93.f39853a, m93.f39854b, m93.f39855c, CollectionUtils.hashSetFromIntArray(m93.f39856d));
        }
        this.f40620c = c4582e9;
        int i = c4582e9.f40798c;
        int i10 = this.f40618a;
        if (i != i10) {
            c4582e9.f40798c = i10;
            c4582e9.f40799d = 0;
            C4660h9 c4660h92 = this.f40619b;
            IBinaryDataHelper iBinaryDataHelper = c4660h92.f40996c;
            C4634g9 c4634g9 = c4660h92.f40995b;
            c4660h92.f40994a.getClass();
            M9 m9A = C4608f9.a(c4582e9);
            c4634g9.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(m9A));
        }
    }
}
