package r1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m implements com.bumptech.glide.load.data.d {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f23360d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23361a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23362b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23363c;

    public /* synthetic */ m(Object obj, int i, Object obj2) {
        this.f23361a = i;
        this.f23362b = obj;
        this.f23363c = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f23361a) {
            case 0:
                return File.class;
            default:
                return ((C2870A) this.f23363c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f23361a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        switch (this.f23361a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f23361a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) {
        Object objWrap;
        switch (this.f23361a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f23362b).getContentResolver().query((Uri) this.f23363c, f23360d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    cVar.f(new File(string));
                    return;
                }
                cVar.d(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f23363c)));
                return;
            default:
                C2870A c2870a = (C2870A) this.f23363c;
                byte[] bArr = (byte[]) this.f23362b;
                switch (c2870a.f23326a) {
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

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
