package g9;

import android.content.Context;
import com.google.android.gms.internal.play_billing.m1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24615a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bykv.vk.openvk.ouw.ouw.ouw.lh.a f24616b;

    /* renamed from: d, reason: collision with root package name */
    public final File f24618d;

    /* renamed from: e, reason: collision with root package name */
    public final File f24619e;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f24617c = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24620f = new ArrayList();
    public volatile boolean g = false;

    public b(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        this.f24618d = null;
        this.f24619e = null;
        this.f24615a = context;
        this.f24616b = aVar;
        this.f24618d = m1.A(aVar.f6567lh, aVar.bly());
        this.f24619e = m1.G(aVar.f6567lh, aVar.bly());
    }

    public static /* synthetic */ void b(b bVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar, int i4, String str) {
        synchronized (w8.a.class) {
            try {
                ArrayList arrayList = bVar.f24620f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    w8.a aVar2 = (w8.a) obj;
                    if (aVar2 != null) {
                        aVar2.ouw(aVar, i4, str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar, int i4) {
        synchronized (w8.a.class) {
            try {
                ArrayList arrayList = this.f24620f;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    w8.a aVar2 = (w8.a) obj;
                    if (aVar2 != null) {
                        aVar2.ouw(aVar, i4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
