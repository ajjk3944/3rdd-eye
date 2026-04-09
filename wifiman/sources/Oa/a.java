package Oa;

import com.ui.sso.account.UIAccountManager;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0610a f17689a = C0610a.f17690a;

    /* renamed from: Oa.a$a, reason: collision with other inner class name */
    public static final class C0610a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0610a f17690a = new C0610a();

        /* renamed from: b, reason: collision with root package name */
        private static final a f17691b = new b();

        private C0610a() {
        }

        public final a a() {
            return f17691b;
        }
    }

    void a(UUID uuid);

    void b();

    void c(UIAccountManager.a aVar);

    void d(UIAccountManager.a aVar);
}
