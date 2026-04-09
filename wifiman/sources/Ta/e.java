package Ta;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.J;
import Ii.N;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import dh.InterfaceC5380e;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final a f21524g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static d f21525h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21526a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentResolver f21527b;

    /* renamed from: c, reason: collision with root package name */
    private final J f21528c;

    /* renamed from: d, reason: collision with root package name */
    private final Ta.a f21529d;

    /* renamed from: e, reason: collision with root package name */
    private final Ta.a f21530e;

    /* renamed from: f, reason: collision with root package name */
    private final Wa.a f21531f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Context context, J dispatcherIO) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(dispatcherIO, "dispatcherIO");
            synchronized (this) {
                if (e.f21525h != null) {
                    d dVar = e.f21525h;
                    AbstractC6492s.f(dVar);
                    return dVar;
                }
                e.f21525h = new e(context, null, dispatcherIO, null, null, null, 58, null);
                d dVar2 = e.f21525h;
                AbstractC6492s.f(dVar2);
                return dVar2;
            }
        }

        private a() {
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21532a;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return e.this.new b(interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r4.f21532a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L12
                Yg.v.b(r5)
                goto L44
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                Yg.v.b(r5)
                goto L31
            L1f:
                Yg.v.b(r5)
                Ta.e r5 = Ta.e.this
                Ta.a r5 = Ta.e.b(r5)
                r4.f21532a = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L31
                return r0
            L31:
                java.util.UUID r5 = (java.util.UUID) r5
                if (r5 != 0) goto L52
                Ta.e r5 = Ta.e.this
                Ta.a r5 = Ta.e.c(r5)
                r4.f21532a = r2
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L44
                return r0
            L44:
                java.util.UUID r5 = (java.util.UUID) r5
                if (r5 == 0) goto L49
                goto L52
            L49:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Unable to get DeviceID failed with fallback to generate UUID Localy"
                r5.<init>(r0)
                throw r5
            L52:
                Ta.c r0 = new Ta.c
                java.lang.String r5 = r5.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.AbstractC6492s.h(r5, r1)
                Ta.e r1 = Ta.e.this
                java.lang.String r1 = r1.h()
                Ta.e r2 = Ta.e.this
                java.lang.String r2 = Ta.e.d(r2)
                r0.<init>(r5, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ta.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public e(Context context, ContentResolver contentResolver, J dispatcherIO, Ta.a deviceIdStorageAndroidSecure, Ta.a deviceIdStorageSharedPref, Wa.a androidSdkVersion) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(contentResolver, "contentResolver");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        AbstractC6492s.i(deviceIdStorageAndroidSecure, "deviceIdStorageAndroidSecure");
        AbstractC6492s.i(deviceIdStorageSharedPref, "deviceIdStorageSharedPref");
        AbstractC6492s.i(androidSdkVersion, "androidSdkVersion");
        this.f21526a = context;
        this.f21527b = contentResolver;
        this.f21528c = dispatcherIO;
        this.f21529d = deviceIdStorageAndroidSecure;
        this.f21530e = deviceIdStorageSharedPref;
        this.f21531f = androidSdkVersion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    @Override // Ta.d
    public Object a(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(this.f21528c, new b(null), interfaceC5380e);
    }

    public final String h() {
        String string = this.f21531f.b(25) ? Settings.Global.getString(this.f21527b, "device_name") : null;
        if (string != null) {
            String str = t.m0(string) ? null : string;
            if (str != null) {
                return str;
            }
        }
        return g();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(Context context, ContentResolver contentResolver, J j10, Ta.a aVar, Ta.a aVar2, Wa.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            contentResolver = context.getContentResolver();
            AbstractC6492s.h(contentResolver, "getContentResolver(...)");
        }
        ContentResolver contentResolver2 = contentResolver;
        J jB = (i10 & 4) != 0 ? C3048c0.b() : j10;
        this(context, contentResolver2, jB, (i10 & 8) != 0 ? new Ta.b(contentResolver2, jB) : aVar, (i10 & 16) != 0 ? Va.a.f23290a.a(context) : aVar2, (i10 & 32) != 0 ? Wa.a.f23740b.a() : aVar3);
    }
}
