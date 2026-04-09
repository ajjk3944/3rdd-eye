package R2;

import R2.q;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: classes.dex */
public final class v<Data> implements q<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final q<Uri, Data> f11711a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f11712b;

    /* compiled from: ResourceLoader.java */
    public static final class a implements r<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f11713a;

        public a(Resources resources) {
            this.f11713a = resources;
        }

        @Override // R2.r
        public final q<Integer, AssetFileDescriptor> c(u uVar) {
            return new v(this.f11713a, uVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements r<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f11714a;

        public b(Resources resources) {
            this.f11714a = resources;
        }

        @Override // R2.r
        public final q<Integer, InputStream> c(u uVar) {
            return new v(this.f11714a, uVar.b(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements r<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f11715a;

        public c(Resources resources) {
            this.f11715a = resources;
        }

        @Override // R2.r
        public final q<Integer, Uri> c(u uVar) {
            return new v(this.f11715a, y.f11721a);
        }
    }

    public v(Resources resources, q<Uri, Data> qVar) {
        this.f11712b = resources;
        this.f11711a = qVar;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // R2.q
    public final q.a b(Integer num, int i, int i10, L2.h hVar) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f11712b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e4) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e4);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f11711a.b(uri, i, i10, hVar);
    }
}
