package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4797mh extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final Ie f41259b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f41260c;

    /* renamed from: d, reason: collision with root package name */
    public final K2 f41261d;

    /* renamed from: e, reason: collision with root package name */
    public final C4679i2 f41262e;

    /* renamed from: f, reason: collision with root package name */
    public final D2 f41263f;

    public C4797mh(C4940s5 c4940s5, Ie ie) {
        this(c4940s5, ie, Nm.a(Z1.class).a(c4940s5.getContext()), new K2(c4940s5.getContext()), new C4679i2(), new D2(c4940s5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        C4940s5 c4940s5 = this.f40632a;
        c4940s5.f41600b.toString();
        if (!c4940s5.f41617t.c() || !c4940s5.w()) {
            return false;
        }
        Z1 z12 = (Z1) this.f41260c.read();
        List list = z12.f40453a;
        J2 j22 = z12.f40454b;
        K2 k22 = this.f41261d;
        k22.getClass();
        Z1 z13 = null;
        J2 j2A = AndroidUtils.isApiAchieved(28) ? G2.a(k22.f39706a, k22.f39707b) : null;
        List list2 = z12.f40455c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f41263f.f39278a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C2());
        Ie ie = this.f41259b;
        Context context = this.f40632a.f41599a;
        ie.getClass();
        ArrayList arrayListA = new Zi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !AbstractC4623fo.a(j22, j2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            z13 = new Z1(list, j2A, list3);
        }
        if (z13 != null) {
            C9 c92 = c4940s5.f41611n;
            C4683i6 c4683i6A = C4683i6.a(c4683i6, z13.f40453a, z13.f40454b, this.f41262e, z13.f40455c);
            c92.a(c4683i6A, Pk.a(c92.f39235c.b(c4683i6A), c4683i6A.i));
            long jCurrentTimeSeconds = c92.f39241j.currentTimeSeconds();
            c92.f39243l = jCurrentTimeSeconds;
            c92.f39233a.a(jCurrentTimeSeconds).b();
            this.f41260c.save(z13);
            return false;
        }
        if (!c4940s5.z()) {
            return false;
        }
        C9 c93 = c4940s5.f41611n;
        C4683i6 c4683i6A2 = C4683i6.a(c4683i6, z12.f40453a, z12.f40454b, this.f41262e, z12.f40455c);
        c93.a(c4683i6A2, Pk.a(c93.f39235c.b(c4683i6A2), c4683i6A2.i));
        long jCurrentTimeSeconds2 = c93.f39241j.currentTimeSeconds();
        c93.f39243l = jCurrentTimeSeconds2;
        c93.f39233a.a(jCurrentTimeSeconds2).b();
        return false;
    }

    public C4797mh(C4940s5 c4940s5, Ie ie, ProtobufStateStorage protobufStateStorage, K2 k22, C4679i2 c4679i2, D2 d22) {
        super(c4940s5);
        this.f41259b = ie;
        this.f41260c = protobufStateStorage;
        this.f41261d = k22;
        this.f41262e = c4679i2;
        this.f41263f = d22;
    }
}
