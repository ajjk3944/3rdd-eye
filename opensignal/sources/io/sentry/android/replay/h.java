package io.sentry.android.replay;

import io.sentry.b5;
import io.sentry.x5;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11925d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f11926g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i10) {
        super(0);
        this.f11925d = i10;
        this.f11926g = jVar;
    }

    @Override // ar.a
    public final Object c() throws IOException {
        switch (this.f11925d) {
            case 0:
                j jVar = this.f11926g;
                if (jVar.h() == null) {
                    return null;
                }
                File file = new File(jVar.h(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                j jVar2 = this.f11926g;
                x5 x5Var = jVar2.f11931a;
                io.sentry.protocol.t tVar = jVar2.f11932d;
                br.l.e(x5Var, "options");
                br.l.e(tVar, "replayId");
                String cacheDirPath = x5Var.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    x5Var.getLogger().m(b5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = x5Var.getCacheDirPath();
                br.l.b(cacheDirPath2);
                File file2 = new File(cacheDirPath2, "replay_" + tVar);
                file2.mkdirs();
                return file2;
        }
    }
}
