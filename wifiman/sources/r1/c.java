package R1;

import Ii.N;
import java.io.File;
import java.util.List;
import jh.AbstractC6331d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f19547a = new c();

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f19548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6824a interfaceC6824a) {
            super(0);
            this.f19548a = interfaceC6824a;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f19548a.invoke();
            String strO = AbstractC6331d.o(file);
            h hVar = h.f19553a;
            if (AbstractC6492s.d(strO, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final O1.e a(P1.b bVar, List migrations, N scope, InterfaceC6824a produceFile) {
        AbstractC6492s.i(migrations, "migrations");
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(produceFile, "produceFile");
        return new b(O1.f.f16782a.a(h.f19553a, bVar, migrations, scope, new a(produceFile)));
    }
}
