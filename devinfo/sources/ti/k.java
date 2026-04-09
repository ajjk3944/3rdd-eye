package ti;

import android.os.Handler;
import ec.r1;
import java.io.File;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.zip.ZipOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PipedOutputStream f34680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f34681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f34682c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File[] f34683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f34684e;

    public k(r1 r1Var, PipedOutputStream pipedOutputStream, Handler handler, File file, File[] fileArr) {
        this.f34684e = r1Var;
        this.f34680a = pipedOutputStream;
        this.f34681b = handler;
        this.f34682c = file;
        this.f34683d = fileArr;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        r1 r1Var = this.f34684e;
        long[] jArr = {0};
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(this.f34680a);
            try {
                d2.b bVar = new d2.b(this, jArr);
                byte[] bArr = new byte[10240];
                i0.f.o(this.f34682c, zipOutputStream, r1Var.f23043d, jArr[0], bArr, bVar);
                for (File file : this.f34683d) {
                    i0.f.o(file, zipOutputStream, r1Var.f23043d, jArr[0], bArr, bVar);
                }
                zipOutputStream.flush();
                zipOutputStream.close();
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
