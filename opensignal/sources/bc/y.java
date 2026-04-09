package bc;

import android.os.Trace;
import com.google.android.gms.internal.measurement.m4;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y f2662d = new y(0);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y f2663g = new y(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2664a;

    public /* synthetic */ y(int i10) {
        this.f2664a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process process;
        switch (this.f2664a) {
            case 0:
                return;
            case 1:
                try {
                    int i10 = p3.f.f20247a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j4.h.c()) {
                        j4.h.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = p3.f.f20247a;
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                wo.b.f24545a = true;
                return;
            case 3:
                try {
                    if (yh.e.j) {
                        return;
                    }
                    yh.e.k = true;
                    Process process2 = yh.e.f26274m;
                    if (process2 != null) {
                        try {
                            process2.destroy();
                        } catch (Exception e4) {
                            ch.n.g("TTQoSFileIO", "Ex while destroying ping process.", e4);
                        }
                        yh.e.j = true;
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ch.n.d("TTQoSFileIO", "Exception while destroying ping test.", e10);
                    return;
                }
            case 4:
                try {
                    if (yh.e.j || !yh.e.f26273l || (process = yh.e.f26274m) == null) {
                        return;
                    }
                    try {
                        process.destroy();
                    } catch (Exception e11) {
                        ch.n.g("TTQoSFileIO", "Ex while destroying ping process.", e11);
                    }
                    yh.e.j = true;
                    return;
                } catch (Exception e12) {
                    ch.n.d("TTQoSFileIO", "Exception while destroying ping test.", e12);
                    return;
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                try {
                    yh.e.j(false);
                    if (yh.e.f26275n != null) {
                        yh.e.f26275n.postDelayed(yh.e.f26287z, yh.e.f26284w);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    yh.e.n(yh.e.f26287z);
                    ch.n.g("TTQoSFileIO", "Ex in Byte Count Collector.", e13);
                    return;
                }
            default:
                m4.f5116i.incrementAndGet();
                return;
        }
    }

    private final /* synthetic */ void a() {
    }
}
