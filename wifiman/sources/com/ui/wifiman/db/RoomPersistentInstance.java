package com.ui.wifiman.db;

import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import java.util.List;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public abstract class RoomPersistentInstance {

    /* renamed from: a, reason: collision with root package name */
    private final gg.z f42360a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f42361b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/ui/wifiman/db/RoomPersistentInstance$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "UpdateFailed", "NotInitialized", "app-db_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/ui/wifiman/db/RoomPersistentInstance$Error$NotInitialized;", "Lcom/ui/wifiman/db/RoomPersistentInstance$Error;", "", "table", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getTable", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "getMessage", "message", "app-db_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotInitialized extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String table;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public NotInitialized(String table) {
                AbstractC6492s.i(table, "table");
                this.table = table;
                this.message = "Persistent Instance " + table + " not initialized!";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/db/RoomPersistentInstance$Error$UpdateFailed;", "Lcom/ui/wifiman/db/RoomPersistentInstance$Error;", "<init>", "()V", "app-db_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UpdateFailed extends Error {
        }
    }

    public static abstract class a {
        protected abstract Object a();

        public abstract String b();

        public void c(InterfaceC6824a defaultInstance) {
            AbstractC6492s.i(defaultInstance, "defaultInstance");
            if (a() == null) {
                Z7.b.h("DB PersistentInstance '" + b() + "' not initialized. Inserting initial item...", null, 2, null);
                d(defaultInstance.invoke());
            }
            Z7.b.h("DB PersistentInstance '" + b() + "' INITIALIZED", null, 2, null);
        }

        protected abstract long d(Object obj);

        public abstract gg.i e();

        protected abstract int f(Object obj);

        public int g(InterfaceC6835l updater, InterfaceC6824a defaultInstance) {
            AbstractC6492s.i(updater, "updater");
            AbstractC6492s.i(defaultInstance, "defaultInstance");
            Object objA = a();
            if (objA == null) {
                objA = defaultInstance.invoke();
            }
            return f(updater.invoke(objA));
        }
    }

    static final class b implements InterfaceC6824a {
        b() {
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            RoomPersistentInstance roomPersistentInstance = RoomPersistentInstance.this;
            return roomPersistentInstance.g(roomPersistentInstance.f());
        }
    }

    static final class c implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f42366a;

            a(a aVar) {
                this.f42366a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object apply(List it) {
                AbstractC6492s.i(it, "it");
                Object objS0 = AbstractC3689v.s0(it);
                if (objS0 != null) {
                    return objS0;
                }
                throw new Error.NotInitialized(this.f42366a.b());
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RoomPersistentInstance f42367a;

            b(RoomPersistentInstance roomPersistentInstance) {
                this.f42367a = roomPersistentInstance;
            }

            @Override // kg.n
            public final Object apply(Object it) {
                AbstractC6492s.i(it, "it");
                return this.f42367a.e(it);
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(a dao) {
            AbstractC6492s.i(dao, "dao");
            return dao.e().N0(new a(dao)).N0(new b(RoomPersistentInstance.this)).F1(Gg.a.d());
        }
    }

    /* synthetic */ class d extends C6490p implements InterfaceC6835l {
        d(Object obj) {
            super(1, obj, RoomPersistentInstance.class, "doOnNextInstance", "doOnNextInstance(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Completable;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5912b invoke(Object p02) {
            AbstractC6492s.i(p02, "p0");
            return ((RoomPersistentInstance) this.receiver).d(p02);
        }
    }

    public static final class e implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f42368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoomPersistentInstance f42369b;

        public e(a aVar, RoomPersistentInstance roomPersistentInstance) {
            this.f42368a = aVar;
            this.f42369b = roomPersistentInstance;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                this.f42368a.c(this.f42369b.new b());
                interfaceC5910A.onSuccess(this.f42368a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class f implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f42371b;

        static final class a implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RoomPersistentInstance f42372a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f42373b;

            a(RoomPersistentInstance roomPersistentInstance, InterfaceC6835l interfaceC6835l) {
                this.f42372a = roomPersistentInstance;
                this.f42373b = interfaceC6835l;
            }

            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                RoomPersistentInstance roomPersistentInstance = this.f42372a;
                return roomPersistentInstance.g(this.f42373b.invoke(roomPersistentInstance.e(obj)));
            }
        }

        static final class b implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RoomPersistentInstance f42374a;

            b(RoomPersistentInstance roomPersistentInstance) {
                this.f42374a = roomPersistentInstance;
            }

            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                RoomPersistentInstance roomPersistentInstance = this.f42374a;
                return roomPersistentInstance.g(roomPersistentInstance.f());
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f42375a = new c();

            c() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Integer rowsUpdates) {
                AbstractC6492s.i(rowsUpdates, "rowsUpdates");
                if (rowsUpdates.intValue() < 1) {
                    throw new Error.UpdateFailed();
                }
            }
        }

        public static final class d implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f42376a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RoomPersistentInstance f42377b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6835l f42378c;

            public d(a aVar, RoomPersistentInstance roomPersistentInstance, InterfaceC6835l interfaceC6835l) {
                this.f42376a = aVar;
                this.f42377b = roomPersistentInstance;
                this.f42378c = interfaceC6835l;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(Integer.valueOf(this.f42376a.g(new a(this.f42377b, this.f42378c), new b(this.f42377b))));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        f(InterfaceC6835l interfaceC6835l) {
            this.f42371b = interfaceC6835l;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(a dao) {
            AbstractC6492s.i(dao, "dao");
            gg.z zVarI = gg.z.i(new d(dao, RoomPersistentInstance.this, this.f42371b));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI.o(c.f42375a).O(Gg.a.d()).y();
        }
    }

    public RoomPersistentInstance(a dao) {
        AbstractC6492s.i(dao, "dao");
        gg.z zVarI = gg.z.i(new e(dao, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.z zVarE = zVarI.O(Gg.a.d()).e();
        AbstractC6492s.h(zVarE, "cache(...)");
        this.f42360a = zVarE;
        gg.i iVarW = zVarE.w(new c()).X0(Gg.a.a()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        gg.i iVarI2 = n9.c.c(iVarW, new d(this)).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42361b = iVarI2;
    }

    public final AbstractC5912b a(InterfaceC6835l updater) {
        AbstractC6492s.i(updater, "updater");
        AbstractC5912b abstractC5912bL = this.f42360a.t(new f(updater)).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    public final gg.i b() {
        return this.f42361b;
    }

    protected AbstractC5912b d(Object instance) {
        AbstractC6492s.i(instance, "instance");
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    protected abstract Object e(Object obj);

    protected abstract Object f();

    protected abstract Object g(Object obj);
}
