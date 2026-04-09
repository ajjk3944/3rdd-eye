package eb;

import Zg.U;
import eb.InterfaceC5443g;
import gg.AbstractC5912b;
import gg.D;
import gg.z;
import java.security.cert.Certificate;
import java.util.Map;
import kg.q;
import kotlin.jvm.internal.AbstractC6492s;
import lb.C6569c;
import ub.C8156c;

/* renamed from: eb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5443g {

    /* renamed from: eb.g$a */
    public interface a {
    }

    /* renamed from: eb.g$b */
    public interface b {
    }

    /* renamed from: eb.g$c */
    public interface c extends InterfaceC5451o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46347a = a.f46348a;

        /* renamed from: eb.g$c$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f46348a = new a();

            private a() {
            }

            public final Map a(Map map, C6569c meta) {
                AbstractC6492s.i(meta, "meta");
                Map mapC = U.c();
                if (map != null) {
                    mapC.putAll(C8156c.f62925a.c(map));
                }
                mapC.put("x-client-name", aj.k.b(meta.a()));
                mapC.put("x-client-version", aj.k.b(meta.b()));
                mapC.put("x-client-platform", aj.k.b("ucore-android"));
                return U.b(mapC);
            }
        }

        /* renamed from: eb.g$c$b */
        public static final class b {
            public static z b(final c cVar, final String path, final boolean z10, final long j10) {
                AbstractC6492s.i(path, "path");
                z zVarJ = z.j(new q() { // from class: eb.h
                    @Override // kg.q
                    public final Object get() {
                        return InterfaceC5443g.c.b.d(cVar, path, z10, j10);
                    }
                });
                AbstractC6492s.h(zVarJ, "defer(...)");
                return zVarJ;
            }

            public static /* synthetic */ z c(c cVar, String str, boolean z10, long j10, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observableWebSocket");
                }
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                if ((i10 & 4) != 0) {
                    j10 = 30;
                }
                return cVar.a(str, z10, j10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static D d(c cVar, String str, boolean z10, long j10) {
                return C5449m.f46355i.a(cVar, str, z10, j10);
            }
        }

        z a(String str, boolean z10, long j10);

        z b(String str, kb.o oVar, String str2, Map map);

        AbstractC5912b d(String str, kb.o oVar, String str2, Map map);
    }

    z a(mb.j jVar);

    z b();

    void c(Certificate[] certificateArr);

    gg.i connect();
}
