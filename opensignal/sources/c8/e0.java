package c8;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3330a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f3331d;

    public /* synthetic */ e0(Context context, int i10) {
        this.f3330a = i10;
        this.f3331d = context;
    }

    @Override // ar.a
    public final Object c() throws IOException {
        int i10 = this.f3330a;
        Context context = this.f3331d;
        switch (i10) {
            case 0:
                Bitmap.Config[] configArr = q8.i.f20736a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            case 1:
                Bitmap.Config[] configArr2 = q8.i.f20736a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir2.mkdirs();
                return cacheDir2;
            case 2:
                File fileH = a.a.h(context, "firebaseSessions/sessionConfigsDataStore.data");
                tg.o.c(fileH);
                return fileH;
            default:
                File fileH2 = a.a.h(context, "firebaseSessions/sessionDataStore.data");
                tg.o.c(fileH2);
                return fileH2;
        }
    }
}
