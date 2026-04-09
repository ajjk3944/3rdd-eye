package d8;

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22001a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22002b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f22001a = i4;
        this.f22002b = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f22001a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                return this.f22002b.getClass();
            default:
                return Drawable.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i4 = this.f22001a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i4 = this.f22001a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f22001a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.c cVar) {
        switch (this.f22001a) {
            case 0:
                try {
                    cVar.f(t8.b.a((File) this.f22002b));
                    break;
                } catch (IOException e2) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                    }
                    cVar.c(e2);
                    return;
                }
            case 1:
                cVar.f(this.f22002b);
                break;
            default:
                nk.k.e(iVar, "priority");
                kg.d dVar = (kg.d) this.f22002b;
                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                nk.k.d(deviceInfoApp, "instance");
                Drawable drawableB = dVar.b(deviceInfoApp);
                if (drawableB != null) {
                    cVar.f(drawableB);
                    break;
                } else {
                    cVar.c(new Exception());
                    break;
                }
        }
    }

    public d(kg.d dVar) {
        this.f22001a = 2;
        nk.k.e(dVar, "model");
        this.f22002b = dVar;
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }
}
