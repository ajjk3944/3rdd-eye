package com.ui.sso.api.provider;

import Ii.AbstractC3059i;
import Ii.AbstractC3061j;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.J;
import Ii.N;
import Ki.t;
import Li.AbstractC3222i;
import Li.D;
import Li.F;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.J;
import Li.y;
import Yg.v;
import Zg.AbstractC3689v;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.ui.sso.api.UiAccountApi;
import com.ui.sso.api.provider.UiAccountProvider;
import com.ui.sso.api.provider.UiAccountProviderCursor;
import com.ui.sso.api.provider.UiAccountProviderError;
import com.ui.sso.api.provider.UiAccountProviderMessageSerializer;
import com.ui.sso.api.provider.d;
import com.ui.sso.api.provider.e;
import com.ui.sso.auth.UiAuthSerializer;
import com.ui.sso.auth.a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class a implements UiAccountApi {

    /* renamed from: p, reason: collision with root package name */
    public static final C1347a f41932p = new C1347a(null);

    /* renamed from: a, reason: collision with root package name */
    private final UiAccountApi.c f41933a;

    /* renamed from: b, reason: collision with root package name */
    private final UiAccountApi.d f41934b;

    /* renamed from: c, reason: collision with root package name */
    private final ContentResolver f41935c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ui.sso.api.provider.f f41936d;

    /* renamed from: e, reason: collision with root package name */
    private final Wa.a f41937e;

    /* renamed from: f, reason: collision with root package name */
    private final UiAccountProviderMessageSerializer f41938f;

    /* renamed from: g, reason: collision with root package name */
    private final UiAccountProviderMessageSerializer f41939g;

    /* renamed from: h, reason: collision with root package name */
    private final UiAccountProviderCursor.Serializer f41940h;

    /* renamed from: i, reason: collision with root package name */
    private final UiAuthSerializer f41941i;

    /* renamed from: j, reason: collision with root package name */
    private final J f41942j;

    /* renamed from: k, reason: collision with root package name */
    private final J f41943k;

    /* renamed from: l, reason: collision with root package name */
    private final b.c f41944l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC3220g f41945m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3220g f41946n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3220g f41947o;

    /* renamed from: com.ui.sso.api.provider.a$a, reason: collision with other inner class name */
    public static final class C1347a {
        public /* synthetic */ C1347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1347a() {
        }
    }

    public static abstract class b {

        /* renamed from: com.ui.sso.api.provider.a$b$a, reason: collision with other inner class name */
        public static final class C1348a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1348a f41948a = new C1348a();

            private C1348a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1348a);
            }

            public int hashCode() {
                return -660002888;
            }

            public String toString() {
                return "Accounts";
            }
        }

        /* renamed from: com.ui.sso.api.provider.a$b$b, reason: collision with other inner class name */
        public static final class C1349b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final UUID f41949a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1349b(UUID uuid) {
                super(null);
                AbstractC6492s.i(uuid, "uuid");
                this.f41949a = uuid;
            }

            public final UUID a() {
                return this.f41949a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1349b) && AbstractC6492s.d(this.f41949a, ((C1349b) obj).f41949a);
            }

            public int hashCode() {
                return this.f41949a.hashCode();
            }

            public String toString() {
                return "Authentication(uuid=" + this.f41949a + ")";
            }
        }

        public interface c {
            D a();

            ContentObserver start();

            void stop();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements b.c {

        /* renamed from: a, reason: collision with root package name */
        private final J f41950a;

        /* renamed from: b, reason: collision with root package name */
        private HandlerThread f41951b;

        /* renamed from: c, reason: collision with root package name */
        private final y f41952c;

        /* renamed from: com.ui.sso.api.provider.a$c$a, reason: collision with other inner class name */
        public static final class C1350a extends ContentObserver {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f41953a;

            /* renamed from: com.ui.sso.api.provider.a$c$a$a, reason: collision with other inner class name */
            static final class C1351a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f41954a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f41955b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Uri f41956c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ c f41957d;

                /* renamed from: com.ui.sso.api.provider.a$c$a$a$a, reason: collision with other inner class name */
                static final class C1352a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Uri f41958a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1352a(Uri uri) {
                        super(0);
                        this.f41958a = uri;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        Uri uri = this.f41958a;
                        return "Update Notification received from content provider " + (uri != null ? uri.toString() : null);
                    }
                }

                /* renamed from: com.ui.sso.api.provider.a$c$a$a$b */
                static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f41959a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ c f41960b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(c cVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f41960b = cVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new b(this.f41960b, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f41959a;
                        if (i10 == 0) {
                            v.b(obj);
                            y yVarA = this.f41960b.a();
                            b.C1348a c1348a = b.C1348a.f41948a;
                            this.f41959a = 1;
                            if (yVarA.a(c1348a, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(obj);
                        }
                        return Yg.J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                    }
                }

                /* renamed from: com.ui.sso.api.provider.a$c$a$a$c, reason: collision with other inner class name */
                static final class C1353c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    int f41961a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Uri f41962b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ c f41963c;

                    /* renamed from: com.ui.sso.api.provider.a$c$a$a$c$a, reason: collision with other inner class name */
                    static final class C1354a extends AbstractC6494u implements InterfaceC6824a {

                        /* renamed from: a, reason: collision with root package name */
                        public static final C1354a f41964a = new C1354a();

                        C1354a() {
                            super(0);
                        }

                        @Override // mh.InterfaceC6824a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Received notification with invalid UUID";
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1353c(Uri uri, c cVar, InterfaceC5380e interfaceC5380e) {
                        super(2, interfaceC5380e);
                        this.f41962b = uri;
                        this.f41963c = cVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                        return new C1353c(this.f41962b, this.f41963c, interfaceC5380e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        UUID uuidFromString;
                        Object objG = AbstractC5467b.g();
                        int i10 = this.f41961a;
                        if (i10 == 0) {
                            v.b(obj);
                            List<String> pathSegments = this.f41962b.getPathSegments();
                            AbstractC6492s.h(pathSegments, "getPathSegments(...)");
                            String str = (String) AbstractC3689v.D0(pathSegments);
                            if (str != null) {
                                c cVar = this.f41963c;
                                try {
                                    uuidFromString = UUID.fromString(str);
                                } catch (IllegalArgumentException unused) {
                                    Ua.a.g(C1354a.f41964a, null, 2, null);
                                    uuidFromString = null;
                                }
                                if (uuidFromString != null) {
                                    y yVarA = cVar.a();
                                    b.C1349b c1349b = new b.C1349b(uuidFromString);
                                    this.f41961a = 1;
                                    if (yVarA.a(c1349b, this) == objG) {
                                        return objG;
                                    }
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v.b(obj);
                        }
                        return Yg.J.f24997a;
                    }

                    @Override // mh.InterfaceC6839p
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                        return ((C1353c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                    }
                }

                /* renamed from: com.ui.sso.api.provider.a$c$a$a$d */
                static final class d extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Uri f41965a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    d(Uri uri) {
                        super(0);
                        this.f41965a = uri;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Unexpected Update Notification Uri: " + this.f41965a + "}";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1351a(Uri uri, c cVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f41956c = uri;
                    this.f41957d = cVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    C1351a c1351a = new C1351a(this.f41956c, this.f41957d, interfaceC5380e);
                    c1351a.f41955b = obj;
                    return c1351a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    List<String> pathSegments;
                    AbstractC5467b.g();
                    if (this.f41954a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    N n10 = (N) this.f41955b;
                    Ua.a.e(new C1352a(this.f41956c));
                    Uri uri = this.f41956c;
                    String str = (uri == null || (pathSegments = uri.getPathSegments()) == null) ? null : (String) AbstractC3689v.s0(pathSegments);
                    if (AbstractC6492s.d(str, "accounts")) {
                        return AbstractC3063k.d(n10, this.f41957d.c(), null, new b(this.f41957d, null), 2, null);
                    }
                    if (AbstractC6492s.d(str, "auth")) {
                        return AbstractC3063k.d(n10, this.f41957d.c(), null, new C1353c(this.f41956c, this.f41957d, null), 2, null);
                    }
                    Ua.a.g(new d(this.f41956c), null, 2, null);
                    return Yg.J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1351a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1350a(Handler handler, c cVar) {
                super(handler);
                this.f41953a = cVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                AbstractC3061j.b(null, new C1351a(uri, this.f41953a, null), 1, null);
            }
        }

        public c(J dispatcherDefault) {
            AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
            this.f41950a = dispatcherDefault;
            this.f41952c = F.b(0, 0, null, 7, null);
        }

        private final ContentObserver b(Handler handler) {
            return new C1350a(handler, this);
        }

        public final J c() {
            return this.f41950a;
        }

        @Override // com.ui.sso.api.provider.a.b.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public y a() {
            return this.f41952c;
        }

        @Override // com.ui.sso.api.provider.a.b.c
        public ContentObserver start() {
            ContentObserver contentObserverB;
            synchronized (this) {
                try {
                    if (this.f41951b != null) {
                        stop();
                    }
                    HandlerThread handlerThread = new HandlerThread("UIAccountNotification");
                    this.f41951b = handlerThread;
                    handlerThread.start();
                    contentObserverB = b(new Handler(handlerThread.getLooper()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return contentObserverB;
        }

        @Override // com.ui.sso.api.provider.a.b.c
        public void stop() {
            synchronized (this) {
                try {
                    HandlerThread handlerThread = this.f41951b;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    this.f41951b = null;
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41966a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f41967b;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f41967b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41966a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f41967b;
                b.C1348a c1348a = b.C1348a.f41948a;
                this.f41966a = 1;
                if (interfaceC3221h.a(c1348a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((d) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41968a;

        e(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new e(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41968a;
            if (i10 == 0) {
                v.b(obj);
                a aVar = a.this;
                this.f41968a = 1;
                obj = aVar.u(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return obj;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.C1348a c1348a, InterfaceC5380e interfaceC5380e) {
            return ((e) create(c1348a, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f41971b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f41972c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f41973d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f41974e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f41975f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f41976g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f41977h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41971b = aVar;
            this.f41972c = contentResolver;
            this.f41973d = fVar;
            this.f41974e = str;
            this.f41975f = dVar;
            this.f41976g = uiAccountProviderMessageSerializer;
            this.f41977h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new f(this.f41971b, this.f41972c, this.f41973d, this.f41974e, this.f41975f, this.f41976g, this.f41977h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f41970a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f41971b.b(29)) {
                    ContentResolver contentResolver = this.f41972c;
                    String strB = this.f41973d.b();
                    String str = this.f41974e;
                    com.ui.sso.api.provider.d dVar = this.f41975f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f41977h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f41972c;
                    Uri uriC = this.f41973d.c();
                    String str2 = this.f41974e;
                    com.ui.sso.api.provider.d dVar2 = this.f41975f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f41977h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f41974e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f41976g.b(bundleCall);
                    if (!(eVar instanceof e.Action)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    if (((e.Action) eVar).getSuccess()) {
                        return Yg.J.f24997a;
                    }
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("action not successful but no exception thrown", null, 2, null);
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f41974e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41978a;

        /* renamed from: c, reason: collision with root package name */
        int f41980c;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41978a = obj;
            this.f41980c |= PduHandle.NONE;
            return a.this.t(this);
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f41982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f41983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f41984d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f41985e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f41986f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f41987g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f41988h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41982b = aVar;
            this.f41983c = contentResolver;
            this.f41984d = fVar;
            this.f41985e = str;
            this.f41986f = dVar;
            this.f41987g = uiAccountProviderMessageSerializer;
            this.f41988h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new h(this.f41982b, this.f41983c, this.f41984d, this.f41985e, this.f41986f, this.f41987g, this.f41988h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f41981a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f41982b.b(29)) {
                    ContentResolver contentResolver = this.f41983c;
                    String strB = this.f41984d.b();
                    String str = this.f41985e;
                    com.ui.sso.api.provider.d dVar = this.f41986f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f41988h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f41983c;
                    Uri uriC = this.f41984d.c();
                    String str2 = this.f41985e;
                    com.ui.sso.api.provider.d dVar2 = this.f41986f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f41988h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f41985e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f41987g.b(bundleCall);
                    if (!(eVar instanceof e.Action)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    if (((e.Action) eVar).getSuccess()) {
                        return Yg.J.f24997a;
                    }
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("action not successful but no exception thrown", null, 2, null);
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f41985e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41989a;

        i(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return a.this.new i(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            AbstractC5467b.g();
            if (this.f41989a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                Cursor cursorQuery = a.this.f41935c.query(a.this.f41936d.a(), null, null, null, null);
                if (cursorQuery != null) {
                    return ((UiAccountProviderCursor.a) a.this.f41940h.a(cursorQuery, O.b(UiAccountProviderCursor.a.class))).a();
                }
                throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Null cursor in accounts query", null, 2, null);
            } catch (UiAccountProviderCursor.Serializer.Error e10) {
                throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse(e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e11);
            } catch (IllegalStateException e12) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e12);
                if (errorA != null) {
                    throw errorA;
                }
                throw e12;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((i) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f41992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f41993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f41994d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f41995e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f41996f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f41997g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f41998h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ a f41999i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ a.EnumC1372a f42000j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e, a aVar2, a.EnumC1372a enumC1372a) {
            super(2, interfaceC5380e);
            this.f41992b = aVar;
            this.f41993c = contentResolver;
            this.f41994d = fVar;
            this.f41995e = str;
            this.f41996f = dVar;
            this.f41997g = uiAccountProviderMessageSerializer;
            this.f41998h = uiAccountProviderMessageSerializer2;
            this.f41999i = aVar2;
            this.f42000j = enumC1372a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new j(this.f41992b, this.f41993c, this.f41994d, this.f41995e, this.f41996f, this.f41997g, this.f41998h, interfaceC5380e, this.f41999i, this.f42000j);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f41991a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f41992b.b(29)) {
                    ContentResolver contentResolver = this.f41993c;
                    String strB = this.f41994d.b();
                    String str = this.f41995e;
                    com.ui.sso.api.provider.d dVar = this.f41996f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f41998h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f41993c;
                    Uri uriC = this.f41994d.c();
                    String str2 = this.f41995e;
                    com.ui.sso.api.provider.d dVar2 = this.f41996f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f41998h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f41995e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f41997g.b(bundleCall);
                    if (!(eVar instanceof e.Auth)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    String serializedAuth = ((e.Auth) eVar).getSerializedAuth();
                    if (serializedAuth == null) {
                        return null;
                    }
                    try {
                        return this.f41999i.f41941i.b(serializedAuth, this.f42000j);
                    } catch (UiAuthSerializer.Error unused) {
                        throw new UiAccountApi.Error.AccountManager.IO("Failed to deserialize authentication");
                    }
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f41995e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((j) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f42002b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f42003c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f42004d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42005e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f42006f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42007g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42008h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42002b = aVar;
            this.f42003c = contentResolver;
            this.f42004d = fVar;
            this.f42005e = str;
            this.f42006f = dVar;
            this.f42007g = uiAccountProviderMessageSerializer;
            this.f42008h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new k(this.f42002b, this.f42003c, this.f42004d, this.f42005e, this.f42006f, this.f42007g, this.f42008h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f42001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f42002b.b(29)) {
                    ContentResolver contentResolver = this.f42003c;
                    String strB = this.f42004d.b();
                    String str = this.f42005e;
                    com.ui.sso.api.provider.d dVar = this.f42006f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f42008h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f42003c;
                    Uri uriC = this.f42004d.c();
                    String str2 = this.f42005e;
                    com.ui.sso.api.provider.d dVar2 = this.f42006f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f42008h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42005e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f42007g.b(bundleCall);
                    if (!(eVar instanceof e.DeviceIdentifiers)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    e.DeviceIdentifiers deviceIdentifiers = (e.DeviceIdentifiers) eVar;
                    return new Ta.c(deviceIdentifiers.getId(), deviceIdentifiers.getName(), deviceIdentifiers.getModel());
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42005e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((k) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f42009a;

        /* renamed from: c, reason: collision with root package name */
        int f42011c;

        l(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42009a = obj;
            this.f42011c |= PduHandle.NONE;
            return a.this.h(this);
        }
    }

    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42012a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f42013b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f42014c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f42015d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42016e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f42017f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42018g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42019h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42013b = aVar;
            this.f42014c = contentResolver;
            this.f42015d = fVar;
            this.f42016e = str;
            this.f42017f = dVar;
            this.f42018g = uiAccountProviderMessageSerializer;
            this.f42019h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new m(this.f42013b, this.f42014c, this.f42015d, this.f42016e, this.f42017f, this.f42018g, this.f42019h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f42012a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f42013b.b(29)) {
                    ContentResolver contentResolver = this.f42014c;
                    String strB = this.f42015d.b();
                    String str = this.f42016e;
                    com.ui.sso.api.provider.d dVar = this.f42017f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f42019h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f42014c;
                    Uri uriC = this.f42015d.c();
                    String str2 = this.f42016e;
                    com.ui.sso.api.provider.d dVar2 = this.f42017f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f42019h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42016e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f42018g.b(bundleCall);
                    if (!(eVar instanceof e.Action)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    if (((e.Action) eVar).getSuccess()) {
                        return Yg.J.f24997a;
                    }
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("action not successful but no exception thrown", null, 2, null);
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42016e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((m) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class n implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f42020a;

        /* renamed from: com.ui.sso.api.provider.a$n$a, reason: collision with other inner class name */
        public static final class C1355a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f42021a;

            /* renamed from: com.ui.sso.api.provider.a$n$a$a, reason: collision with other inner class name */
            public static final class C1356a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42022a;

                /* renamed from: b, reason: collision with root package name */
                int f42023b;

                public C1356a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42022a = obj;
                    this.f42023b |= PduHandle.NONE;
                    return C1355a.this.a(null, this);
                }
            }

            public C1355a(InterfaceC3221h interfaceC3221h) {
                this.f42021a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ui.sso.api.provider.a.n.C1355a.C1356a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.ui.sso.api.provider.a$n$a$a r0 = (com.ui.sso.api.provider.a.n.C1355a.C1356a) r0
                    int r1 = r0.f42023b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42023b = r1
                    goto L18
                L13:
                    com.ui.sso.api.provider.a$n$a$a r0 = new com.ui.sso.api.provider.a$n$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f42022a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f42023b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L44
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f42021a
                    boolean r2 = r5 instanceof com.ui.sso.api.provider.a.b.C1348a
                    if (r2 == 0) goto L44
                    r0.f42023b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.a.n.C1355a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public n(InterfaceC3220g interfaceC3220g) {
            this.f42020a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f42020a.b(new C1355a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    public static final class o implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f42025a;

        /* renamed from: com.ui.sso.api.provider.a$o$a, reason: collision with other inner class name */
        public static final class C1357a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f42026a;

            /* renamed from: com.ui.sso.api.provider.a$o$a$a, reason: collision with other inner class name */
            public static final class C1358a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42027a;

                /* renamed from: b, reason: collision with root package name */
                int f42028b;

                public C1358a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42027a = obj;
                    this.f42028b |= PduHandle.NONE;
                    return C1357a.this.a(null, this);
                }
            }

            public C1357a(InterfaceC3221h interfaceC3221h) {
                this.f42026a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ui.sso.api.provider.a.o.C1357a.C1358a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.ui.sso.api.provider.a$o$a$a r0 = (com.ui.sso.api.provider.a.o.C1357a.C1358a) r0
                    int r1 = r0.f42028b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42028b = r1
                    goto L18
                L13:
                    com.ui.sso.api.provider.a$o$a$a r0 = new com.ui.sso.api.provider.a$o$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f42027a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f42028b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L44
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f42026a
                    boolean r2 = r5 instanceof com.ui.sso.api.provider.a.b.C1349b
                    if (r2 == 0) goto L44
                    r0.f42028b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.a.o.C1357a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public o(InterfaceC3220g interfaceC3220g) {
            this.f42025a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f42025a.b(new C1357a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    public static final class p implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f42030a;

        /* renamed from: com.ui.sso.api.provider.a$p$a, reason: collision with other inner class name */
        public static final class C1359a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f42031a;

            /* renamed from: com.ui.sso.api.provider.a$p$a$a, reason: collision with other inner class name */
            public static final class C1360a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42032a;

                /* renamed from: b, reason: collision with root package name */
                int f42033b;

                public C1360a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f42032a = obj;
                    this.f42033b |= PduHandle.NONE;
                    return C1359a.this.a(null, this);
                }
            }

            public C1359a(InterfaceC3221h interfaceC3221h) {
                this.f42031a = interfaceC3221h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ui.sso.api.provider.a.p.C1359a.C1360a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.ui.sso.api.provider.a$p$a$a r0 = (com.ui.sso.api.provider.a.p.C1359a.C1360a) r0
                    int r1 = r0.f42033b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42033b = r1
                    goto L18
                L13:
                    com.ui.sso.api.provider.a$p$a$a r0 = new com.ui.sso.api.provider.a$p$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f42032a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f42033b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f42031a
                    com.ui.sso.api.provider.a$b$b r5 = (com.ui.sso.api.provider.a.b.C1349b) r5
                    java.util.UUID r5 = r5.a()
                    r0.f42033b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.a.p.C1359a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public p(InterfaceC3220g interfaceC3220g) {
            this.f42030a = interfaceC3220g;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f42030a.b(new C1359a(interfaceC3221h), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42035a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f42036b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f42037c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f42038d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42039e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f42040f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42041g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42042h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42036b = aVar;
            this.f42037c = contentResolver;
            this.f42038d = fVar;
            this.f42039e = str;
            this.f42040f = dVar;
            this.f42041g = uiAccountProviderMessageSerializer;
            this.f42042h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new q(this.f42036b, this.f42037c, this.f42038d, this.f42039e, this.f42040f, this.f42041g, this.f42042h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f42035a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f42036b.b(29)) {
                    ContentResolver contentResolver = this.f42037c;
                    String strB = this.f42038d.b();
                    String str = this.f42039e;
                    com.ui.sso.api.provider.d dVar = this.f42040f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f42042h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f42037c;
                    Uri uriC = this.f42038d.c();
                    String str2 = this.f42039e;
                    com.ui.sso.api.provider.d dVar2 = this.f42040f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f42042h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42039e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f42041g.b(bundleCall);
                    if (!(eVar instanceof e.Action)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    if (((e.Action) eVar).getSuccess()) {
                        return Yg.J.f24997a;
                    }
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("action not successful but no exception thrown", null, 2, null);
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42039e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((q) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f42044b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f42045c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.f f42046d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42047e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f42048f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42049g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42050h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Wa.a aVar, ContentResolver contentResolver, com.ui.sso.api.provider.f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42044b = aVar;
            this.f42045c = contentResolver;
            this.f42046d = fVar;
            this.f42047e = str;
            this.f42048f = dVar;
            this.f42049g = uiAccountProviderMessageSerializer;
            this.f42050h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new r(this.f42044b, this.f42045c, this.f42046d, this.f42047e, this.f42048f, this.f42049g, this.f42050h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f42043a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f42044b.b(29)) {
                    ContentResolver contentResolver = this.f42045c;
                    String strB = this.f42046d.b();
                    String str = this.f42047e;
                    com.ui.sso.api.provider.d dVar = this.f42048f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f42050h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f42045c;
                    Uri uriC = this.f42046d.c();
                    String str2 = this.f42047e;
                    com.ui.sso.api.provider.d dVar2 = this.f42048f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f42050h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42047e + "' got null response bundle", null, 2, null);
                }
                try {
                    com.ui.sso.api.provider.e eVar = (com.ui.sso.api.provider.e) this.f42049g.b(bundleCall);
                    if (!(eVar instanceof e.Action)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    if (((e.Action) eVar).getSuccess()) {
                        return Yg.J.f24997a;
                    }
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("action not successful but no exception thrown", null, 2, null);
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42047e + "' missing response", e10);
                }
            } catch (UiAccountProviderMessageSerializer.SerializationError e11) {
                throw new UiAccountApi.Error.ContentProvider.IllegalState("failed to serialized request message", e11);
            } catch (IllegalArgumentException e12) {
                throw new UiAccountApi.Error.ContentProvider.ProviderUnavailable(e12);
            } catch (IllegalStateException e13) {
                UiAccountApi.Error errorA = UiAccountProviderError.InterprocessWrapper.INSTANCE.a(e13);
                if (errorA != null) {
                    throw errorA;
                }
                throw e13;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((r) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42051a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42052b;

        /* renamed from: com.ui.sso.api.provider.a$s$a, reason: collision with other inner class name */
        static final class C1361a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1361a f42054a = new C1361a();

            C1361a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content provider notification init start";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f42055a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content provider notification registered";
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f42056a = new c();

            c() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content provider notification init complete";
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f42057a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3091y0 f42058b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentObserver f42059c;

            /* renamed from: com.ui.sso.api.provider.a$s$d$a, reason: collision with other inner class name */
            static final class C1362a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1362a f42060a = new C1362a();

                C1362a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "failed to unregister content observer";
                }
            }

            static final class b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final b f42061a = new b();

                b() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Content provider notification cleared";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(a aVar, InterfaceC3091y0 interfaceC3091y0, ContentObserver contentObserver) {
                super(0);
                this.f42057a = aVar;
                this.f42058b = interfaceC3091y0;
                this.f42059c = contentObserver;
            }

            public final void a() {
                this.f42057a.f41944l.stop();
                InterfaceC3091y0.a.b(this.f42058b, null, 1, null);
                try {
                    this.f42057a.f41935c.unregisterContentObserver(this.f42059c);
                } catch (Throwable th2) {
                    Ua.a.f(C1362a.f42060a, th2);
                }
                Ua.a.e(b.f42061a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f42062a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f42063b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ t f42064c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(t tVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f42064c = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                e eVar = new e(this.f42064c, interfaceC5380e);
                eVar.f42063b = obj;
                return eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f42062a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f42064c.k((b) this.f42063b);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(b bVar, InterfaceC5380e interfaceC5380e) {
                return ((e) create(bVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        static final class f extends kotlin.coroutines.jvm.internal.l implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            int f42065a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f42066b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ t f42067c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(t tVar, InterfaceC5380e interfaceC5380e) {
                super(3, interfaceC5380e);
                this.f42067c = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f42065a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f42067c.f((Throwable) this.f42066b);
                return Yg.J.f24997a;
            }

            @Override // mh.q
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
                f fVar = new f(this.f42067c, interfaceC5380e);
                fVar.f42066b = th2;
                return fVar.invokeSuspend(Yg.J.f24997a);
            }
        }

        s(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            s sVar = a.this.new s(interfaceC5380e);
            sVar.f42052b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f42051a;
            if (i10 == 0) {
                v.b(obj);
                t tVar = (t) this.f42052b;
                Ua.a.e(C1361a.f42054a);
                ContentObserver contentObserverStart = a.this.f41944l.start();
                InterfaceC3091y0 interfaceC3091y0D = AbstractC3222i.D(AbstractC3222i.f(AbstractC3222i.I(a.this.f41944l.a(), new e(tVar, null)), new f(tVar, null)), tVar);
                a.this.f41935c.registerContentObserver(a.this.f41936d.a(), false, contentObserverStart);
                a.this.f41935c.registerContentObserver(a.this.f41936d.e(), true, contentObserverStart);
                Ua.a.e(b.f42055a);
                Ua.a.e(c.f42056a);
                d dVar = new d(a.this, interfaceC3091y0D, contentObserverStart);
                this.f42051a = 1;
                if (Ki.r.a(tVar, dVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, InterfaceC5380e interfaceC5380e) {
            return ((s) create(tVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public a(UiAccountApi.c state, UiAccountApi.d supportFile, ContentResolver resolver, com.ui.sso.api.provider.f uri, Wa.a sdkVersion, UiAccountProviderMessageSerializer requestSerializer, UiAccountProviderMessageSerializer responseSerializer, UiAccountProviderCursor.Serializer cursorSerializer, UiAuthSerializer authSerializer, N externalScope, J dispatcherIO, J dispatcherDefault, b.c notificationObserver) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(supportFile, "supportFile");
        AbstractC6492s.i(resolver, "resolver");
        AbstractC6492s.i(uri, "uri");
        AbstractC6492s.i(sdkVersion, "sdkVersion");
        AbstractC6492s.i(requestSerializer, "requestSerializer");
        AbstractC6492s.i(responseSerializer, "responseSerializer");
        AbstractC6492s.i(cursorSerializer, "cursorSerializer");
        AbstractC6492s.i(authSerializer, "authSerializer");
        AbstractC6492s.i(externalScope, "externalScope");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
        AbstractC6492s.i(notificationObserver, "notificationObserver");
        this.f41933a = state;
        this.f41934b = supportFile;
        this.f41935c = resolver;
        this.f41936d = uri;
        this.f41937e = sdkVersion;
        this.f41938f = requestSerializer;
        this.f41939g = responseSerializer;
        this.f41940h = cursorSerializer;
        this.f41941i = authSerializer;
        this.f41942j = dispatcherIO;
        this.f41943k = dispatcherDefault;
        this.f41944l = notificationObserver;
        InterfaceC3220g interfaceC3220gC = AbstractC3222i.C(AbstractC3222i.e(new s(null)), dispatcherDefault);
        J.a aVar = Li.J.f11860a;
        InterfaceC3220g interfaceC3220gB = Wa.c.b(interfaceC3220gC, externalScope, J.a.b(aVar, 0L, 0L, 3, null), 0, 4, null);
        this.f41945m = interfaceC3220gB;
        this.f41946n = Wa.c.a(AbstractC3222i.C(AbstractC3222i.n(AbstractC3222i.w(AbstractC3222i.E(new n(AbstractC3222i.J(interfaceC3220gB, new d(null))), new e(null)))), dispatcherDefault), externalScope, J.a.b(aVar, 0L, 0L, 1, null), 1);
        this.f41947o = Wa.c.b(AbstractC3222i.C(AbstractC3222i.w(new p(new o(interfaceC3220gB))), dispatcherDefault), externalScope, J.a.b(aVar, 0L, 0L, 3, null), 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f41942j, new i(null), interfaceC5380e);
    }

    @Override // com.ui.sso.api.UiAccountApi
    public InterfaceC3220g a() {
        return this.f41946n;
    }

    @Override // com.ui.sso.api.UiAccountApi
    public Object b(Na.b bVar, InterfaceC5380e interfaceC5380e) {
        String id2 = UiAccountProvider.b.ACCOUNT_UPDATE.getId();
        String string = bVar.c().toString();
        AbstractC6492s.h(string, "toString(...)");
        d.AccountUpdate accountUpdate = new d.AccountUpdate(string, bVar.d(), bVar.b(), bVar.a());
        ContentResolver contentResolver = this.f41935c;
        com.ui.sso.api.provider.f fVar = this.f41936d;
        Wa.a aVar = this.f41937e;
        UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.f41938f;
        return AbstractC3059i.g(this.f41942j, new q(aVar, contentResolver, fVar, id2, accountUpdate, this.f41939g, uiAccountProviderMessageSerializer, null), interfaceC5380e);
    }

    @Override // com.ui.sso.api.UiAccountApi
    public Object c(UUID uuid, InterfaceC5380e interfaceC5380e) {
        String id2 = UiAccountProvider.b.ACCOUNT_DELETE.getId();
        String string = uuid.toString();
        AbstractC6492s.h(string, "toString(...)");
        d.AccountDelete accountDelete = new d.AccountDelete(string);
        ContentResolver contentResolver = this.f41935c;
        com.ui.sso.api.provider.f fVar = this.f41936d;
        Wa.a aVar = this.f41937e;
        UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.f41938f;
        return AbstractC3059i.g(this.f41942j, new h(aVar, contentResolver, fVar, id2, accountDelete, this.f41939g, uiAccountProviderMessageSerializer, null), interfaceC5380e);
    }

    @Override // com.ui.sso.api.UiAccountApi
    public Object d(UUID uuid, a.EnumC1372a enumC1372a, InterfaceC5380e interfaceC5380e) {
        String id2 = UiAccountProvider.b.INVALIDATE_AUTH_TOKEN.getId();
        String string = uuid.toString();
        AbstractC6492s.h(string, "toString(...)");
        d.AuthTokenInvalidate authTokenInvalidate = new d.AuthTokenInvalidate(string, enumC1372a.getId());
        ContentResolver contentResolver = this.f41935c;
        com.ui.sso.api.provider.f fVar = this.f41936d;
        Wa.a aVar = this.f41937e;
        UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.f41938f;
        return AbstractC3059i.g(this.f41942j, new m(aVar, contentResolver, fVar, id2, authTokenInvalidate, this.f41939g, uiAccountProviderMessageSerializer, null), interfaceC5380e);
    }

    @Override // com.ui.sso.api.UiAccountApi
    public Object e(UUID uuid, a.EnumC1372a enumC1372a, InterfaceC5380e interfaceC5380e) {
        String id2 = UiAccountProvider.b.GET_AUTH_TOKEN.getId();
        String string = uuid.toString();
        AbstractC6492s.h(string, "toString(...)");
        d.AuthGet authGet = new d.AuthGet(string, enumC1372a.getId());
        ContentResolver contentResolver = this.f41935c;
        com.ui.sso.api.provider.f fVar = this.f41936d;
        Wa.a aVar = this.f41937e;
        UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.f41938f;
        return AbstractC3059i.g(this.f41942j, new j(aVar, contentResolver, fVar, id2, authGet, this.f41939g, uiAccountProviderMessageSerializer, null, this, enumC1372a), interfaceC5380e);
    }

    @Override // com.ui.sso.api.UiAccountApi
    public InterfaceC3220g f() {
        return this.f41947o;
    }

    @Override // com.ui.sso.api.UiAccountApi
    public Object g(UUID uuid, com.ui.sso.auth.a aVar, InterfaceC5380e interfaceC5380e) throws UiAccountApi.Error.AccountManager.IO {
        try {
            String strA = this.f41941i.a(aVar);
            String id2 = UiAccountProvider.b.UPDATE_AUTH_TOKEN.getId();
            String string = uuid.toString();
            AbstractC6492s.h(string, "toString(...)");
            d.AuthTokenUpdate authTokenUpdate = new d.AuthTokenUpdate(string, aVar.b().getId(), strA);
            ContentResolver contentResolver = this.f41935c;
            com.ui.sso.api.provider.f fVar = this.f41936d;
            Wa.a aVar2 = this.f41937e;
            UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer = this.f41938f;
            return AbstractC3059i.g(this.f41942j, new r(aVar2, contentResolver, fVar, id2, authTokenUpdate, this.f41939g, uiAccountProviderMessageSerializer, null), interfaceC5380e);
        } catch (UiAuthSerializer.Error unused) {
            throw new UiAccountApi.Error.AccountManager.IO("Failed to serialize given authentication");
        }
    }

    @Override // com.ui.sso.api.UiAccountApi
    public UiAccountApi.c getState() {
        return this.f41933a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ui.sso.api.UiAccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(dh.InterfaceC5380e r14) throws com.ui.sso.api.UiAccountApi.Error.Unsupported {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.ui.sso.api.provider.a.l
            if (r0 == 0) goto L13
            r0 = r14
            com.ui.sso.api.provider.a$l r0 = (com.ui.sso.api.provider.a.l) r0
            int r1 = r0.f42011c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42011c = r1
            goto L18
        L13:
            com.ui.sso.api.provider.a$l r0 = new com.ui.sso.api.provider.a$l
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f42009a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f42011c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r14)
            goto L6f
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L32:
            Yg.v.b(r14)
            com.ui.sso.api.UiAccountApi$c r14 = r13.getState()
            int r14 = r14.c()
            r2 = 2
            if (r14 < r2) goto L73
            com.ui.sso.api.provider.UiAccountProvider$b r14 = com.ui.sso.api.provider.UiAccountProvider.b.GET_DEVICE_IDENTIFIERS
            java.lang.String r8 = r14.getId()
            android.content.ContentResolver r6 = p(r13)
            com.ui.sso.api.provider.f r7 = s(r13)
            Wa.a r5 = r(r13)
            com.ui.sso.api.provider.UiAccountProviderMessageSerializer r11 = o(r13)
            com.ui.sso.api.provider.UiAccountProviderMessageSerializer r10 = q(r13)
            Ii.J r14 = m(r13)
            com.ui.sso.api.provider.a$k r2 = new com.ui.sso.api.provider.a$k
            r12 = 0
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f42011c = r3
            java.lang.Object r14 = Ii.AbstractC3059i.g(r14, r2, r0)
            if (r14 != r1) goto L6f
            return r1
        L6f:
            kotlin.jvm.internal.AbstractC6492s.f(r14)
            return r14
        L73:
            com.ui.sso.api.UiAccountApi$Error$Unsupported r14 = new com.ui.sso.api.UiAccountApi$Error$Unsupported
            com.ui.sso.api.UiAccountApi$c r0 = r13.getState()
            int r0 = r0.c()
            com.ui.sso.api.UiAccountApi$c r1 = r13.getState()
            java.lang.String r1 = r1.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "deviceIdentifiers are not supported since API v2. Current API version is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". App "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " needs to be updated."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.a.h(dh.e):java.lang.Object");
    }

    @Override // com.ui.sso.api.UiAccountApi
    public UiAccountApi.d i() {
        return this.f41934b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(dh.InterfaceC5380e r14) throws com.ui.sso.api.UiAccountApi.Error.Unsupported {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.ui.sso.api.provider.a.g
            if (r0 == 0) goto L13
            r0 = r14
            com.ui.sso.api.provider.a$g r0 = (com.ui.sso.api.provider.a.g) r0
            int r1 = r0.f41980c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41980c = r1
            goto L18
        L13:
            com.ui.sso.api.provider.a$g r0 = new com.ui.sso.api.provider.a$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f41978a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f41980c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L29
            Yg.v.b(r14)
            goto L6f
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L32:
            Yg.v.b(r14)
            com.ui.sso.api.UiAccountApi$c r14 = r13.getState()
            int r14 = r14.c()
            r2 = 3
            if (r14 < r2) goto L75
            com.ui.sso.api.provider.UiAccountProvider$b r14 = com.ui.sso.api.provider.UiAccountProvider.b.ACQUIRE_OWNERSHIP
            java.lang.String r8 = r14.getId()
            android.content.ContentResolver r6 = p(r13)
            com.ui.sso.api.provider.f r7 = s(r13)
            Wa.a r5 = r(r13)
            com.ui.sso.api.provider.UiAccountProviderMessageSerializer r11 = o(r13)
            com.ui.sso.api.provider.UiAccountProviderMessageSerializer r10 = q(r13)
            Ii.J r14 = m(r13)
            com.ui.sso.api.provider.a$f r2 = new com.ui.sso.api.provider.a$f
            r12 = 0
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f41980c = r3
            java.lang.Object r14 = Ii.AbstractC3059i.g(r14, r2, r0)
            if (r14 != r1) goto L6f
            return r1
        L6f:
            kotlin.jvm.internal.AbstractC6492s.f(r14)
            Yg.J r14 = Yg.J.f24997a
            return r14
        L75:
            com.ui.sso.api.UiAccountApi$Error$Unsupported r14 = new com.ui.sso.api.UiAccountApi$Error$Unsupported
            com.ui.sso.api.UiAccountApi$c r0 = r13.getState()
            int r0 = r0.c()
            com.ui.sso.api.UiAccountApi$c r1 = r13.getState()
            java.lang.String r1 = r1.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "acquireOwnership are not supported since API v3. Current API version is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". App "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " needs to be updated."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.a.t(dh.e):java.lang.Object");
    }
}
