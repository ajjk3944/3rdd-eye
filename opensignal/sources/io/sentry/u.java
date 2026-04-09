package io.sentry;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12785b;

    public /* synthetic */ u(int i10, Object obj) {
        this.f12784a = i10;
        this.f12785b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) throws InterruptedException {
        switch (this.f12784a) {
            case 0:
                return ((w) this.f12785b).a(str);
            case 1:
                io.sentry.android.replay.j jVar = (io.sentry.android.replay.j) this.f12785b;
                br.l.b(str);
                if (tt.s.f0(str, ".jpg", false)) {
                    File file2 = new File(file, str);
                    String name = file2.getName();
                    br.l.d(name, "getName(...)");
                    Long lP0 = tt.s.p0(tt.l.W0(name, name));
                    if (lP0 != null) {
                        jVar.b(file2, lP0.longValue(), null);
                    }
                }
                return false;
            default:
                return str.startsWith((String) this.f12785b);
        }
    }
}
