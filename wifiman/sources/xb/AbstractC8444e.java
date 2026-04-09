package xb;

import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import gg.AbstractC5912b;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* renamed from: xb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8444e {

    /* renamed from: xb.e$a */
    /* synthetic */ class a extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f65550a = new a();

        a() {
            super(1, AbstractC8444e.class, "mapUnauthorisedException", "mapUnauthorisedException(Lretrofit2/HttpException;)Ljava/lang/Throwable;", 1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(HttpException p02) {
            AbstractC6492s.i(p02, "p0");
            return AbstractC8444e.d(p02);
        }
    }

    /* renamed from: xb.e$b */
    /* synthetic */ class b extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65551a = new b();

        b() {
            super(1, AbstractC8444e.class, "mapUnauthorisedException", "mapUnauthorisedException(Lretrofit2/HttpException;)Ljava/lang/Throwable;", 1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(HttpException p02) {
            AbstractC6492s.i(p02, "p0");
            return AbstractC8444e.d(p02);
        }
    }

    public static final AbstractC5912b b(AbstractC5912b abstractC5912b) {
        AbstractC6492s.i(abstractC5912b, "<this>");
        AbstractC5912b abstractC5912bN = abstractC5912b.n(new C8441b(b.f65551a));
        AbstractC6492s.h(abstractC5912bN, "compose(...)");
        return abstractC5912bN;
    }

    public static final z c(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        z zVarH = zVar.h(new C8443d(a.f65550a));
        AbstractC6492s.h(zVarH, "compose(...)");
        return zVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable d(HttpException httpException) {
        if (httpException.a() == 401) {
            return new UnauthorisedException(null, httpException, 1, null);
        }
        return null;
    }
}
