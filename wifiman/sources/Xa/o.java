package xa;

import Ii.C3048c0;
import Ii.O;
import com.ui.uidb.UiDB;
import gg.AbstractC5912b;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.OkHttpClient;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f65539a = a.f65540a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f65540a = new a();

        private a() {
        }

        public final o a(UiDB.b environment, OkHttpClient sharedOkhttpClient, za.d storage, InterfaceC8439a.c cVar) {
            AbstractC6492s.i(environment, "environment");
            AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
            AbstractC6492s.i(storage, "storage");
            return new p(InterfaceC8439a.f65486a.b(O.a(C3048c0.a()), environment, sharedOkhttpClient, storage, cVar));
        }
    }

    AbstractC5912b a();

    gg.i b();
}
