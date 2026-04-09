package d8;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22005a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f22006b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22007c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22008d;

    public /* synthetic */ e(Comparable comparable, Object obj, int i4) {
        this.f22005a = i4;
        this.f22006b = comparable;
        this.f22007c = obj;
    }

    public static e c(Context context, Uri uri, y7.b bVar) {
        return new e(uri, new y7.c(com.bumptech.glide.b.a(context).f6472c.b().f(), bVar, com.bumptech.glide.b.a(context).f6473d, context.getContentResolver()), 2);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f22005a) {
            case 0:
                ((d0) this.f22007c).getClass();
                return InputStream.class;
            case 1:
                return ((d0) this.f22007c).b();
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        switch (this.f22005a) {
            case 0:
                try {
                    ((ByteArrayInputStream) this.f22008d).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                Object obj = this.f22008d;
                if (obj != null) {
                    try {
                        switch (((d0) this.f22007c).f22004a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.f22008d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i4 = this.f22005a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f22005a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        Object objOpen;
        switch (this.f22005a) {
            case 0:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = d0.a((String) this.f22006b);
                    this.f22008d = byteArrayInputStreamA;
                    cVar.f(byteArrayInputStreamA);
                    break;
                } catch (IllegalArgumentException e2) {
                    cVar.c(e2);
                }
            case 1:
                try {
                    d0 d0Var = (d0) this.f22007c;
                    File file = (File) this.f22006b;
                    switch (d0Var.f22004a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f22008d = objOpen;
                    cVar.f(objOpen);
                    break;
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e10);
                    }
                    cVar.c(e10);
                    return;
                }
            default:
                try {
                    InputStream inputStreamI = i();
                    this.f22008d = inputStreamI;
                    cVar.f(inputStreamI);
                    break;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e11);
                    }
                    cVar.c(e11);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[PHI: r7
  0x002f: PHI (r7v6 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:23:0x004e, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e.i():java.io.InputStream");
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
