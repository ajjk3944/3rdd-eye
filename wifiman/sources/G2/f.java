package G2;

import G2.d;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f6835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6836b;

        a(Context context, String str) {
            this.f6835a = context;
            this.f6836b = str;
        }

        @Override // G2.d.a
        public File a() {
            File cacheDir = this.f6835a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f6836b != null ? new File(cacheDir, this.f6836b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
