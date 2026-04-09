package xa;

import Ii.N;
import bb.C4079a;
import com.ui.product.catalog.UiProductCatalog;
import com.ui.uidb.UiDB;
import i9.InterfaceC6137a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.OkHttpClient;
import ua.InterfaceC8153a;

/* renamed from: xa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8439a extends UiProductCatalog {

    /* renamed from: a, reason: collision with root package name */
    public static final C2313a f65486a = C2313a.f65487a;

    /* renamed from: xa.a$a, reason: collision with other inner class name */
    public static final class C2313a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C2313a f65487a = new C2313a();

        /* renamed from: b, reason: collision with root package name */
        private static InterfaceC6137a f65488b;

        private C2313a() {
        }

        public final InterfaceC6137a a() {
            return f65488b;
        }

        public final InterfaceC8439a b(N externalScope, UiDB.b environment, OkHttpClient sharedOkhttpClient, za.d storage, c cVar) {
            AbstractC6492s.i(externalScope, "externalScope");
            AbstractC6492s.i(environment, "environment");
            AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
            AbstractC6492s.i(storage, "storage");
            ya.d dVar = cVar != null ? new ya.d(cVar) : null;
            return new j(externalScope, dVar, new ya.m(environment, sharedOkhttpClient, storage, dVar), cVar);
        }
    }

    /* renamed from: xa.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C4079a.C1151a f65489a;

        /* renamed from: b, reason: collision with root package name */
        private final C4079a f65490b;

        public b(C4079a.C1151a metadata, C4079a snapshot) {
            AbstractC6492s.i(metadata, "metadata");
            AbstractC6492s.i(snapshot, "snapshot");
            this.f65489a = metadata;
            this.f65490b = snapshot;
        }

        public final C4079a.C1151a a() {
            return this.f65489a;
        }

        public final C4079a b() {
            return this.f65490b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f65489a, bVar.f65489a) && AbstractC6492s.d(this.f65490b, bVar.f65490b);
        }

        public int hashCode() {
            return (this.f65489a.hashCode() * 31) + this.f65490b.hashCode();
        }

        public String toString() {
            return "Data(metadata=" + this.f65489a + ", snapshot=" + this.f65490b + ")";
        }
    }

    /* renamed from: xa.a$c */
    public interface c {

        /* renamed from: xa.a$c$a, reason: collision with other inner class name */
        public static final class C2314a {
            public static Object a(c cVar, Object obj) {
                return null;
            }
        }

        b a();

        Map b();

        Object c(Object obj);
    }

    /* renamed from: xa.a$d */
    public interface d extends InterfaceC8153a {
        Object N();
    }
}
