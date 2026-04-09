package I2;

import I2.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* loaded from: classes.dex */
public class s implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f8536a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f8537b;

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f8538a;

        public a(Resources resources) {
            this.f8538a = resources;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new s(this.f8538a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f8539a;

        public b(Resources resources) {
            this.f8539a = resources;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new s(this.f8539a, rVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f8540a;

        public c(Resources resources) {
            this.f8540a = resources;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new s(this.f8540a, w.c());
        }
    }

    public s(Resources resources, n nVar) {
        this.f8537b = resources;
        this.f8536a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f8537b.getResourcePackageName(num.intValue()) + '/' + this.f8537b.getResourceTypeName(num.intValue()) + '/' + this.f8537b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i10, int i11, C2.g gVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f8536a.a(uriD, i10, i11, gVar);
    }

    @Override // I2.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
