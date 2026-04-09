package Ta;

import Ii.AbstractC3059i;
import Ii.J;
import Ii.N;
import Yg.m;
import Yg.n;
import Yg.v;
import android.content.ContentResolver;
import android.provider.Settings;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class b implements Ta.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f21512d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final J f21513b;

    /* renamed from: c, reason: collision with root package name */
    private final m f21514c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Ta.b$b, reason: collision with other inner class name */
    static final class C0790b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentResolver f21516b;

        /* renamed from: Ta.b$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UUID f21517a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(UUID uuid) {
                super(0);
                this.f21517a = uuid;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Device ID (based on Android_ID): " + this.f21517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0790b(ContentResolver contentResolver) {
            super(0);
            this.f21516b = contentResolver;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            String strC = b.this.c(this.f21516b);
            if (strC == null || t.m0(strC) || AbstractC6492s.d(strC, "9774d56d682e549c")) {
                return null;
            }
            byte[] bytes = strC.getBytes(C6510d.f52215b);
            AbstractC6492s.h(bytes, "getBytes(...)");
            UUID uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
            Ua.a.e(new a(uuidNameUUIDFromBytes));
            return uuidNameUUIDFromBytes;
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21518a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return b.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f21518a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return b.this.b();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21520a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get Settings.Secure.ANDROID_ID";
        }
    }

    public b(ContentResolver resolver, J dispatcherIO) {
        AbstractC6492s.i(resolver, "resolver");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        this.f21513b = dispatcherIO;
        this.f21514c = n.b(new C0790b(resolver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID b() {
        return (UUID) this.f21514c.getValue();
    }

    public final String c(ContentResolver resolver) {
        AbstractC6492s.i(resolver, "resolver");
        try {
            String string = Settings.Secure.getString(resolver, "android_id");
            if (string == null) {
                return null;
            }
            return string;
        } catch (Throwable th2) {
            Ua.a.f(d.f21520a, th2);
            return null;
        }
    }

    @Override // Ta.a
    public Object e(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f21513b, new c(null), interfaceC5380e);
    }
}
