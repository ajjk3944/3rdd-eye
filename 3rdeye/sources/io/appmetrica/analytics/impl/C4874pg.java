package io.appmetrica.analytics.impl;

import android.content.Context;
import b9.C2001h;
import b9.InterfaceC2000g;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4874pg {

    /* renamed from: a, reason: collision with root package name */
    public final C5052wg f41424a;

    /* renamed from: b, reason: collision with root package name */
    public final Sa f41425b;

    /* renamed from: c, reason: collision with root package name */
    public final Hg f41426c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2000g f41427d = C2001h.b(new C4796mg(this));

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2000g f41428e = C2001h.b(new C4744kg(this));

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2000g f41429f = C2001h.b(new C4848og(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f41430g = new ArrayList();

    public C4874pg(C5052wg c5052wg, Gg gg, Sa sa2, Hg hg) {
        this.f41424a = c5052wg;
        this.f41425b = sa2;
        this.f41426c = hg;
    }

    public static final InterfaceC4667hg a(C4874pg c4874pg) {
        return (InterfaceC4667hg) c4874pg.f41427d.getValue();
    }

    public static final void a(C4874pg c4874pg, C5102yg c5102yg, InterfaceC4667hg interfaceC4667hg) {
        boolean zB;
        c4874pg.f41430g.add(c5102yg);
        Hg hg = c4874pg.f41426c;
        if (c5102yg == null) {
            hg.getClass();
        } else {
            SafePackageManager safePackageManager = hg.f39579b;
            Context context = hg.f39578a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = c5102yg.f42145d.ordinal();
            if (iOrdinal == 1) {
                zB = kotlin.jvm.internal.l.b(hg.f39583f, installerPackageName);
            } else if (iOrdinal == 2) {
                zB = kotlin.jvm.internal.l.b(hg.f39584g, installerPackageName);
            }
            if (zB) {
                c4874pg.a(c5102yg);
                return;
            }
        }
        interfaceC4667hg.a();
    }

    public final void a(C5102yg c5102yg) {
        C5052wg c5052wg = this.f41424a;
        synchronized (c5052wg) {
            c5052wg.f41972b = c5102yg;
            c5052wg.f41973c = true;
            c5052wg.f41974d.a(c5102yg);
            c5052wg.f41974d.d();
            c5052wg.a(c5052wg.f41972b);
        }
    }
}
