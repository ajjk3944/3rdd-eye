package com.ui.sso.api.provider;

import Ii.J;
import Ii.N;
import Yg.v;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import com.ui.sso.api.UiAccountApi;
import com.ui.sso.api.provider.UiAccountProviderError;
import com.ui.sso.api.provider.UiAccountProviderMessageSerializer;
import com.ui.sso.api.provider.a;
import com.ui.sso.api.provider.d;
import com.ui.sso.api.provider.e;
import com.ui.sso.api.provider.f;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f42068a;

    /* renamed from: b, reason: collision with root package name */
    private final J f42069b;

    /* renamed from: c, reason: collision with root package name */
    private final J f42070c;

    /* renamed from: d, reason: collision with root package name */
    private final a.b.c f42071d;

    /* renamed from: e, reason: collision with root package name */
    private final Wa.a f42072e;

    /* renamed from: f, reason: collision with root package name */
    private final d.h f42073f;

    /* renamed from: g, reason: collision with root package name */
    private final e.f f42074g;

    /* renamed from: h, reason: collision with root package name */
    private final com.ui.sso.api.provider.c f42075h;

    /* renamed from: i, reason: collision with root package name */
    private final com.ui.sso.auth.b f42076i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f42077a;

        /* renamed from: b, reason: collision with root package name */
        private final UiAccountApi.d f42078b;

        public a(String authority, UiAccountApi.d supportFile) {
            AbstractC6492s.i(authority, "authority");
            AbstractC6492s.i(supportFile, "supportFile");
            this.f42077a = authority;
            this.f42078b = supportFile;
        }

        public final String a() {
            return this.f42077a;
        }

        public final UiAccountApi.d b() {
            return this.f42078b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42077a, aVar.f42077a) && AbstractC6492s.d(this.f42078b, aVar.f42078b);
        }

        public int hashCode() {
            return (this.f42077a.hashCode() * 31) + this.f42078b.hashCode();
        }

        public String toString() {
            return "Params(authority=" + this.f42077a + ", supportFile=" + this.f42078b + ")";
        }
    }

    /* renamed from: com.ui.sso.api.provider.b$b, reason: collision with other inner class name */
    public static final class C1363b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wa.a f42080b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f42081c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f42082d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42083e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.ui.sso.api.provider.d f42084f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42085g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ UiAccountProviderMessageSerializer f42086h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1363b(Wa.a aVar, ContentResolver contentResolver, f fVar, String str, com.ui.sso.api.provider.d dVar, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer, UiAccountProviderMessageSerializer uiAccountProviderMessageSerializer2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42080b = aVar;
            this.f42081c = contentResolver;
            this.f42082d = fVar;
            this.f42083e = str;
            this.f42084f = dVar;
            this.f42085g = uiAccountProviderMessageSerializer;
            this.f42086h = uiAccountProviderMessageSerializer2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new C1363b(this.f42080b, this.f42081c, this.f42082d, this.f42083e, this.f42084f, this.f42085g, this.f42086h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws UiAccountApi.Error {
            Bundle bundleCall;
            AbstractC5467b.g();
            if (this.f42079a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                if (this.f42080b.b(29)) {
                    ContentResolver contentResolver = this.f42081c;
                    String strB = this.f42082d.b();
                    String str = this.f42083e;
                    com.ui.sso.api.provider.d dVar = this.f42084f;
                    bundleCall = contentResolver.call(strB, str, (String) null, dVar != null ? this.f42086h.a(dVar) : null);
                } else {
                    ContentResolver contentResolver2 = this.f42081c;
                    Uri uriC = this.f42082d.c();
                    String str2 = this.f42083e;
                    com.ui.sso.api.provider.d dVar2 = this.f42084f;
                    bundleCall = contentResolver2.call(uriC, str2, (String) null, dVar2 != null ? this.f42086h.a(dVar2) : null);
                }
                if (bundleCall == null) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42083e + "' got null response bundle", null, 2, null);
                }
                try {
                    e eVar = (e) this.f42085g.b(bundleCall);
                    if (!(eVar instanceof e.StateV2)) {
                        throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("Received response of unexpected type", null, 2, null);
                    }
                    e.StateV2 stateV2 = (e.StateV2) eVar;
                    return new UiAccountApi.c(stateV2.getVersion(), stateV2.getAccountType(), stateV2.getAppPackage(), Na.c.ANDROID, UiAccountApi.a.CONTENT_PROVIDER, stateV2.getIsAndroidAccountManagerAccountOwner(), stateV2.getIsAndroidStorageOwner(), stateV2.getIsLocalStorageOwner());
                } catch (UiAccountProviderMessageSerializer.SerializationError e10) {
                    throw new UiAccountApi.Error.ContentProvider.ReceivedInvalidResponse("method '" + this.f42083e + "' missing response", e10);
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
            return ((C1363b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f42087a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42088b;

        /* renamed from: d, reason: collision with root package name */
        int f42090d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42088b = obj;
            this.f42090d |= PduHandle.NONE;
            return b.this.b(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f42091a;

        /* renamed from: b, reason: collision with root package name */
        Object f42092b;

        /* renamed from: c, reason: collision with root package name */
        Object f42093c;

        /* renamed from: d, reason: collision with root package name */
        Object f42094d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f42095e;

        /* renamed from: g, reason: collision with root package name */
        int f42097g;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42095e = obj;
            this.f42097g |= PduHandle.NONE;
            return b.this.d(null, null, this);
        }
    }

    public b(ContentResolver resolver, J dispatcherIO, J dispatcherDefault, a.b.c providerNotificationObserver, Wa.a androidSdkVersion) {
        AbstractC6492s.i(resolver, "resolver");
        AbstractC6492s.i(dispatcherIO, "dispatcherIO");
        AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
        AbstractC6492s.i(providerNotificationObserver, "providerNotificationObserver");
        AbstractC6492s.i(androidSdkVersion, "androidSdkVersion");
        this.f42068a = resolver;
        this.f42069b = dispatcherIO;
        this.f42070c = dispatcherDefault;
        this.f42071d = providerNotificationObserver;
        this.f42072e = androidSdkVersion;
        this.f42073f = new d.h();
        this.f42074g = new e.f();
        this.f42075h = new com.ui.sso.api.provider.c();
        this.f42076i = new com.ui.sso.auth.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.ui.sso.api.provider.f r14, dh.InterfaceC5380e r15) throws com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.ui.sso.api.provider.b.c
            if (r0 == 0) goto L13
            r0 = r15
            com.ui.sso.api.provider.b$c r0 = (com.ui.sso.api.provider.b.c) r0
            int r1 = r0.f42090d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42090d = r1
            goto L18
        L13:
            com.ui.sso.api.provider.b$c r0 = new com.ui.sso.api.provider.b$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f42088b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f42090d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2f
            java.lang.Object r14 = r0.f42087a
            com.ui.sso.api.provider.f r14 = (com.ui.sso.api.provider.f) r14
            Yg.v.b(r15)     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            goto L61
        L2d:
            r15 = move-exception
            goto L67
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            Yg.v.b(r15)
            com.ui.sso.api.provider.a$a r15 = com.ui.sso.api.provider.a.f41932p     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            android.content.ContentResolver r6 = r13.f42068a     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            com.ui.sso.api.provider.UiAccountProvider$b r15 = com.ui.sso.api.provider.UiAccountProvider.b.GET_STATE     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            java.lang.String r8 = r15.getId()     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            com.ui.sso.api.provider.d$h r11 = r13.f42073f     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            com.ui.sso.api.provider.e$f r10 = r13.f42074g     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            Ii.J r15 = r13.f42069b     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            Wa.a r5 = r13.f42072e     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            com.ui.sso.api.provider.b$b r2 = new com.ui.sso.api.provider.b$b     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            r12 = 0
            r9 = 0
            r4 = r2
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            r0.f42087a = r14     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            r0.f42090d = r3     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            java.lang.Object r15 = Ii.AbstractC3059i.g(r15, r2, r0)     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            if (r15 != r1) goto L61
            return r1
        L61:
            kotlin.jvm.internal.AbstractC6492s.f(r15)     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            com.ui.sso.api.UiAccountApi$c r15 = (com.ui.sso.api.UiAccountApi.c) r15     // Catch: com.ui.sso.api.UiAccountApi.Error -> L2d
            return r15
        L67:
            com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException r0 = new com.ui.sso.api.UiAccountApiFactory$AccountApiUnavailableException
            java.lang.String r14 = r14.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UiAccountApi '"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = "' access FAILED"
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.b.b(com.ui.sso.api.provider.f, dh.e):java.lang.Object");
    }

    public final f c(String authority) {
        AbstractC6492s.i(authority, "authority");
        return f.b.f42152a.a().b(authority);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(Ii.N r19, com.ui.sso.api.provider.b.a r20, dh.InterfaceC5380e r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.ui.sso.api.provider.b.d
            if (r2 == 0) goto L17
            r2 = r1
            com.ui.sso.api.provider.b$d r2 = (com.ui.sso.api.provider.b.d) r2
            int r3 = r2.f42097g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f42097g = r3
            goto L1c
        L17:
            com.ui.sso.api.provider.b$d r2 = new com.ui.sso.api.provider.b$d
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f42095e
            java.lang.Object r3 = eh.AbstractC5467b.g()
            int r4 = r2.f42097g
            r5 = 1
            if (r4 == 0) goto L48
            if (r4 != r5) goto L3f
            java.lang.Object r3 = r2.f42094d
            com.ui.sso.api.provider.f r3 = (com.ui.sso.api.provider.f) r3
            java.lang.Object r4 = r2.f42093c
            com.ui.sso.api.provider.b$a r4 = (com.ui.sso.api.provider.b.a) r4
            java.lang.Object r5 = r2.f42092b
            Ii.N r5 = (Ii.N) r5
            java.lang.Object r2 = r2.f42091a
            com.ui.sso.api.provider.b r2 = (com.ui.sso.api.provider.b) r2
            Yg.v.b(r1)
            r8 = r3
            r14 = r5
            goto L6d
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L48:
            Yg.v.b(r1)
            java.lang.String r1 = r20.a()
            com.ui.sso.api.provider.f r1 = r0.c(r1)
            r2.f42091a = r0
            r4 = r19
            r2.f42092b = r4
            r6 = r20
            r2.f42093c = r6
            r2.f42094d = r1
            r2.f42097g = r5
            java.lang.Object r2 = r0.b(r1, r2)
            if (r2 != r3) goto L68
            return r3
        L68:
            r8 = r1
            r1 = r2
            r14 = r4
            r4 = r6
            r2 = r0
        L6d:
            r5 = r1
            com.ui.sso.api.UiAccountApi$c r5 = (com.ui.sso.api.UiAccountApi.c) r5
            android.content.ContentResolver r7 = r2.f42068a
            com.ui.sso.api.provider.d$h r10 = r2.f42073f
            com.ui.sso.api.provider.e$f r11 = r2.f42074g
            com.ui.sso.api.provider.c r12 = r2.f42075h
            com.ui.sso.api.provider.a$b$c r1 = r2.f42071d
            Wa.a r9 = r2.f42072e
            Ii.J r15 = r2.f42069b
            Ii.J r3 = r2.f42070c
            com.ui.sso.api.UiAccountApi$d r6 = r4.b()
            com.ui.sso.auth.b r13 = r2.f42076i
            com.ui.sso.api.provider.a r2 = new com.ui.sso.api.provider.a
            r4 = r2
            r16 = r3
            r17 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.sso.api.provider.b.d(Ii.N, com.ui.sso.api.provider.b$a, dh.e):java.lang.Object");
    }

    public /* synthetic */ b(ContentResolver contentResolver, J j10, J j11, a.b.c cVar, Wa.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentResolver, j10, j11, (i10 & 8) != 0 ? new a.c(j11) : cVar, (i10 & 16) != 0 ? Wa.a.f23740b.a() : aVar);
    }
}
