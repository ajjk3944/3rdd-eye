package io.sentry;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f12863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f12865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f12866d;

    public /* synthetic */ x3(u0 u0Var, String str, w wVar, File file) {
        this.f12863a = u0Var;
        this.f12864b = str;
        this.f12865c = wVar;
        this.f12866d = file;
    }

    public final void a() {
        File file = this.f12866d;
        b5 b5Var = b5.DEBUG;
        String str = this.f12864b;
        u0 u0Var = this.f12863a;
        u0Var.m(b5Var, "Started processing cached files from %s", str);
        w wVar = this.f12865c;
        p6 p6Var = wVar.f12853d;
        u0 u0Var2 = wVar.f12851b;
        try {
            u0Var2.m(b5Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new u(0, wVar));
            if (fileArrListFiles != null) {
                u0Var2.m(b5Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                int length = fileArrListFiles.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i11];
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!p6Var.contains(absolutePath)) {
                            io.sentry.transport.p pVarD = wVar.f12850a.d();
                            if (pVarD != null && pVarD.f(m.All)) {
                                u0Var2.m(b5.INFO, "DirectoryProcessor, rate limiting active.", new Object[i10]);
                                break;
                            } else {
                                u0Var2.m(b5.DEBUG, "Processing file: %s", absolutePath);
                                wVar.b(file2, dr.a.j(new v(wVar.f12852c, wVar.f12851b, absolutePath, p6Var)));
                                Thread.sleep(100L);
                            }
                        } else {
                            u0Var2.m(b5.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        u0Var2.m(b5.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                    i11++;
                    i10 = 0;
                }
            } else {
                u0Var2.m(b5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            }
        } catch (Throwable th2) {
            u0Var2.f(b5.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
        u0Var.m(b5.DEBUG, "Finished processing cached files from %s", str);
    }
}
