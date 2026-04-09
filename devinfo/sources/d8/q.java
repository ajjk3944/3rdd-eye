package d8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q implements com.bumptech.glide.load.data.d {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f22039d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22040a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22041b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22042c;

    public /* synthetic */ q(int i4, Object obj, Object obj2) {
        this.f22040a = i4;
        this.f22041b = obj;
        this.f22042c = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f22040a) {
            case 0:
                return File.class;
            default:
                return ((d0) this.f22042c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i4 = this.f22040a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i4 = this.f22040a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f22040a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.c cVar) {
        Object objWrap;
        switch (this.f22040a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f22041b).getContentResolver().query((Uri) this.f22042c, f22039d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    cVar.f(new File(string));
                    return;
                }
                cVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f22042c)));
                return;
            default:
                d0 d0Var = (d0) this.f22042c;
                byte[] bArr = (byte[]) this.f22041b;
                switch (d0Var.f22004a) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                cVar.f(objWrap);
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
