package ii;

import Zg.d0;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: ii.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6164k extends InterfaceC6167n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49220a = a.f49221a;

    /* renamed from: ii.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f49221a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC6835l f49222b = C6163j.f49219a;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(Zh.f it) {
            AbstractC6492s.i(it, "it");
            return true;
        }

        public final InterfaceC6835l c() {
            return f49222b;
        }
    }

    /* renamed from: ii.k$b */
    public static final class b extends AbstractC6165l {

        /* renamed from: b, reason: collision with root package name */
        public static final b f49223b = new b();

        private b() {
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Set a() {
            return d0.e();
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Set c() {
            return d0.e();
        }

        @Override // ii.AbstractC6165l, ii.InterfaceC6164k
        public Set f() {
            return d0.e();
        }
    }

    Set a();

    Collection b(Zh.f fVar, Ih.b bVar);

    Set c();

    Collection d(Zh.f fVar, Ih.b bVar);

    Set f();
}
