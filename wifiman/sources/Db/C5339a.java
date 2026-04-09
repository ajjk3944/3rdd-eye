package db;

import cb.EnumC4235a;
import gg.z;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import lb.CloudConfig;
import lb.UnifiCloudAccess;
import wb.C8294d;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5339a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5340b f45979a;

    /* renamed from: db.a$a, reason: collision with other inner class name */
    static final class C1714a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1714a f45980a = new C1714a();

        C1714a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifiCloudAccess apply(CloudConfig it) {
            AbstractC6492s.i(it, "it");
            return it.getUnifiCloudAccess();
        }
    }

    public C5339a(EnumC4235a environment) throws SecurityException {
        AbstractC6492s.i(environment, "environment");
        Object objB = new C8294d(environment.getCloudConfigUrl(), null, null, null, null, null, null, null, null, 510, null).d().b(InterfaceC5340b.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f45979a = (InterfaceC5340b) objB;
    }

    public final z a() {
        z zVarA = this.f45979a.a().A(C1714a.f45980a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }
}
