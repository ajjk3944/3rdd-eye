package mi;

import Bh.G;
import Uh.m;
import Yg.s;
import fi.AbstractC5833e;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.AbstractC6643u;
import oi.n;

/* renamed from: mi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6842c extends AbstractC6643u implements kotlin.reflect.jvm.internal.impl.builtins.c {

    /* renamed from: o, reason: collision with root package name */
    public static final a f54040o = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private final boolean f54041n;

    /* renamed from: mi.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6842c a(Zh.c fqName, n storageManager, G module, InputStream inputStream, boolean z10) {
            AbstractC6492s.i(fqName, "fqName");
            AbstractC6492s.i(storageManager, "storageManager");
            AbstractC6492s.i(module, "module");
            AbstractC6492s.i(inputStream, "inputStream");
            s sVarA = Vh.c.a(inputStream);
            m mVar = (m) sVarA.a();
            Vh.a aVar = (Vh.a) sVarA.c();
            if (mVar != null) {
                return new C6842c(fqName, storageManager, module, mVar, aVar, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + Vh.a.f23435h + ", actual " + aVar + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ C6842c(Zh.c cVar, n nVar, G g10, m mVar, Vh.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, g10, mVar, aVar, z10);
    }

    @Override // Dh.H, Dh.AbstractC2607m
    public String toString() {
        return "builtins package fragment for " + e() + " from " + AbstractC5833e.s(this);
    }

    private C6842c(Zh.c cVar, n nVar, G g10, m mVar, Vh.a aVar, boolean z10) {
        super(cVar, nVar, g10, mVar, aVar, null);
        this.f54041n = z10;
    }
}
