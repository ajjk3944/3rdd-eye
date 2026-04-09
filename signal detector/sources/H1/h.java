package H1;

import b4.C0344i;
import com.google.android.gms.internal.ads.C1913tc;
import com.google.android.gms.internal.ads.InterfaceC2104x4;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import p1.InterfaceC2770a;

/* loaded from: classes.dex */
public final class h implements i, InterfaceC2104x4 {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f1765a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1766b;

    public /* synthetic */ h(Object obj) {
        this.f1766b = obj;
    }

    public InterfaceC2770a a() {
        if (((InterfaceC2770a) this.f1765a) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC2770a) this.f1765a) == null) {
                        File cacheDir = ((A1.n) ((d4.h) this.f1766b).f19807b).f115b.getCacheDir();
                        C1913tc c1913tc = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c1913tc = new C1913tc(file);
                        }
                        this.f1765a = c1913tc;
                    }
                    if (((InterfaceC2770a) this.f1765a) == null) {
                        this.f1765a = new C0344i(29);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC2770a) this.f1765a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2104x4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.A4 g(com.google.android.gms.internal.ads.C4 r15) throws java.io.IOException, com.google.android.gms.internal.ads.F4 {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.h.g(com.google.android.gms.internal.ads.C4):com.google.android.gms.internal.ads.A4");
    }

    @Override // H1.i
    public Object get() {
        if (this.f1765a == null) {
            synchronized (this) {
                try {
                    if (this.f1765a == null) {
                        Object obj = ((i) this.f1766b).get();
                        g.c(obj, "Argument must not be null");
                        this.f1765a = obj;
                    }
                } finally {
                }
            }
        }
        return this.f1765a;
    }

    public h() {
        this.f1766b = new CopyOnWriteArraySet();
    }
}
