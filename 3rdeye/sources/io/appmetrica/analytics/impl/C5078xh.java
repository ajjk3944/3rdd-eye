package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5078xh extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final Ff f42082b;

    /* renamed from: c, reason: collision with root package name */
    public final C4933ro f42083c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f42084d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f42085e;

    public C5078xh(C4940s5 c4940s5) {
        this(c4940s5, c4940s5.t(), Ga.j().s(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        C4940s5 c4940s5 = this.f40632a;
        if (this.f42083c.d()) {
            return false;
        }
        C4683i6 c4683i6A = ((C5028vh) c4940s5.f41608k.a()).f41862e ? C4683i6.a(c4683i6, EnumC4997ub.EVENT_TYPE_APP_UPDATE) : C4683i6.a(c4683i6, EnumC4997ub.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f42084d.getInstallerPackageName(c4940s5.f41599a, c4940s5.f41600b.f41170a), ""));
            Ff ff = this.f42082b;
            ff.f40846h.a(ff.f40839a);
            jSONObject.put("preloadInfo", ((Cf) ff.c()).b());
        } catch (Throwable unused) {
        }
        c4683i6A.setValue(jSONObject.toString());
        C9 c92 = c4940s5.f41611n;
        c92.a(c4683i6A, Pk.a(c92.f39235c.b(c4683i6A), c4683i6A.i));
        C4933ro c4933ro = this.f42083c;
        synchronized (c4933ro) {
            C4959so c4959so = c4933ro.f41594a;
            c4959so.a(c4959so.a().put("init_event_done", true));
        }
        this.f42083c.a(this.f42085e.currentTimeMillis());
        return false;
    }

    public C5078xh(C4940s5 c4940s5, C4933ro c4933ro, Ff ff, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c4940s5);
        this.f42083c = c4933ro;
        this.f42082b = ff;
        this.f42084d = safePackageManager;
        this.f42085e = systemTimeProvider;
    }
}
