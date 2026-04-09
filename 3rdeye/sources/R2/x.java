package R2;

import R2.q;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: classes.dex */
public final class x<Data> implements q<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final q<Uri, Data> f11720a;

    /* compiled from: StringLoader.java */
    public static final class a implements r<String, AssetFileDescriptor> {
        @Override // R2.r
        public final q<String, AssetFileDescriptor> c(u uVar) {
            return new x(uVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements r<String, ParcelFileDescriptor> {
        @Override // R2.r
        public final q<String, ParcelFileDescriptor> c(u uVar) {
            return new x(uVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements r<String, InputStream> {
        @Override // R2.r
        public final q<String, InputStream> c(u uVar) {
            return new x(uVar.b(Uri.class, InputStream.class));
        }
    }

    public x(q<Uri, Data> qVar) {
        this.f11720a = qVar;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // R2.q
    public final q.a b(String str, int i, int i10, L2.h hVar) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            q<Uri, Data> qVar = this.f11720a;
            if (qVar.a(uriFromFile)) {
                return qVar.b(uriFromFile, i, i10, hVar);
            }
        }
        return null;
    }
}
