package m1;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import r1.C2870A;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21933a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f21934b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21935c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21936d;

    public /* synthetic */ c(Comparable comparable, Object obj, int i) {
        this.f21933a = i;
        this.f21934b = comparable;
        this.f21935c = obj;
    }

    public static c d(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.a(context).f6486c.b().f(), dVar, com.bumptech.glide.b.a(context).f6487d, context.getContentResolver()), 0);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f21933a) {
            case 0:
                return InputStream.class;
            case 1:
                ((C2870A) this.f21935c).getClass();
                return InputStream.class;
            default:
                return ((C2870A) this.f21935c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        switch (this.f21933a) {
            case 0:
                InputStream inputStream = (InputStream) this.f21936d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f21936d).close();
                    break;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.f21936d;
                if (obj != null) {
                    try {
                        switch (((C2870A) this.f21935c).f23326a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        switch (this.f21933a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f21933a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(h hVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        Object objOpen;
        switch (this.f21933a) {
            case 0:
                try {
                    InputStream inputStreamI = i();
                    this.f21936d = inputStreamI;
                    cVar.f(inputStreamI);
                    break;
                } catch (FileNotFoundException e6) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e6);
                    }
                    cVar.d(e6);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = C2870A.a((String) this.f21934b);
                    this.f21936d = byteArrayInputStreamA;
                    cVar.f(byteArrayInputStreamA);
                    break;
                } catch (IllegalArgumentException e7) {
                    cVar.d(e7);
                }
            default:
                try {
                    C2870A c2870a = (C2870A) this.f21935c;
                    File file = (File) this.f21934b;
                    switch (c2870a.f23326a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f21936d = objOpen;
                    cVar.f(objOpen);
                    break;
                } catch (FileNotFoundException e8) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e8);
                    }
                    cVar.d(e8);
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
        throw new UnsupportedOperationException("Method not decompiled: m1.c.i():java.io.InputStream");
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
