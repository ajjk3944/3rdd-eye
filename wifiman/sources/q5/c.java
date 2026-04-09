package q5;

import Ai.a;
import Yg.J;
import Yg.m;
import Yg.n;
import Yg.v;
import android.util.Log;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import o5.C7081b;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONObject;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f58394g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5384i f58395a;

    /* renamed from: b, reason: collision with root package name */
    private final g5.e f58396b;

    /* renamed from: c, reason: collision with root package name */
    private final C7081b f58397c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7429a f58398d;

    /* renamed from: e, reason: collision with root package name */
    private final m f58399e;

    /* renamed from: f, reason: collision with root package name */
    private final Ti.a f58400f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O1.e f58401a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O1.e eVar) {
            super(0);
            this.f58401a = eVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(this.f58401a);
        }
    }

    /* renamed from: q5.c$c, reason: collision with other inner class name */
    static final class C2053c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f58402a;

        /* renamed from: b, reason: collision with root package name */
        Object f58403b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f58404c;

        /* renamed from: e, reason: collision with root package name */
        int f58406e;

        C2053c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58404c = obj;
            this.f58406e |= PduHandle.NONE;
            return c.this.d(this);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f58407a;

        /* renamed from: b, reason: collision with root package name */
        Object f58408b;

        /* renamed from: c, reason: collision with root package name */
        int f58409c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f58410d;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = c.this.new d(interfaceC5380e);
            dVar.f58410d = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x019f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, InterfaceC5380e interfaceC5380e) {
            return ((d) create(jSONObject, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58412a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58413b;

        e(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            e eVar = new e(interfaceC5380e);
            eVar.f58413b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f58412a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f58413b));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC5380e interfaceC5380e) {
            return ((e) create(str, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public c(InterfaceC5384i backgroundDispatcher, g5.e firebaseInstallationsApi, C7081b appInfo, InterfaceC7429a configsFetcher, O1.e dataStore) {
        AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6492s.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC6492s.i(appInfo, "appInfo");
        AbstractC6492s.i(configsFetcher, "configsFetcher");
        AbstractC6492s.i(dataStore, "dataStore");
        this.f58395a = backgroundDispatcher;
        this.f58396b = firebaseInstallationsApi;
        this.f58397c = appInfo;
        this.f58398d = configsFetcher;
        this.f58399e = n.b(new b(dataStore));
        this.f58400f = Ti.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g f() {
        return (g) this.f58399e.getValue();
    }

    private final String g(String str) {
        return new p(MqttTopic.TOPIC_LEVEL_SEPARATOR).n(str, "");
    }

    @Override // q5.h
    public Boolean a() {
        return f().g();
    }

    @Override // q5.h
    public Ai.a b() {
        Integer numE = f().e();
        if (numE == null) {
            return null;
        }
        a.C0031a c0031a = Ai.a.f849b;
        return Ai.a.g(Ai.c.s(numE.intValue(), Ai.d.SECONDS));
    }

    @Override // q5.h
    public Double c() {
        return f().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:21:0x004c, B:47:0x00ba, B:49:0x00c8, B:52:0x00d4), top: B:62:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:21:0x004c, B:47:0x00ba, B:49:0x00c8, B:52:0x00d4), top: B:62:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(dh.InterfaceC5380e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.c.d(dh.e):java.lang.Object");
    }
}
