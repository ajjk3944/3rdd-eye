package io.appmetrica.analytics.impl;

import android.content.Context;
import c9.C2092m;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.s7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4942s7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4477a7 f41626a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41627b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41628c;

    public C4942s7(InterfaceC4477a7 interfaceC4477a7, ArrayList arrayList, boolean z10) {
        this.f41626a = interfaceC4477a7;
        this.f41627b = arrayList;
        this.f41628c = z10;
    }

    public final String a(Context context, InterfaceC4865p7 interfaceC4865p7) {
        File parentFile;
        try {
            File fileA = this.f41626a.a(context, interfaceC4865p7.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, interfaceC4865p7.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return interfaceC4865p7.b();
        }
    }

    public final void a(Context context, String str, File file) {
        List list = this.f41627b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileA = ((InterfaceC4477a7) it.next()).a(context, str);
            if (fileA.exists()) {
                try {
                    if (this.f41628c) {
                        FileUtils.copyToNullable(fileA, file);
                    } else {
                        FileUtils.move(fileA, file);
                    }
                    String path = fileA.getPath();
                    String path2 = file.getPath();
                    for (String str2 : C2092m.W("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f41628c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
