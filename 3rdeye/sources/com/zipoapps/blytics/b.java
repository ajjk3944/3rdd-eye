package com.zipoapps.blytics;

import A9.E;
import A9.O;
import android.content.pm.PackageManager;
import b9.C1992A;
import b9.n;
import com.zipoapps.blytics.SessionManager;
import com.zipoapps.premiumhelper.d;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import i8.C4461a;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: SessionManager.kt */
@e(c = "com.zipoapps.blytics.SessionManager$onSessionStartEvent$1$1", f = "SessionManager.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f36986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SessionManager.SessionData f36987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SessionManager.SessionData sessionData, InterfaceC4347e<? super b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f36987m = sessionData;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new b(this.f36987m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        String str;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f36986l;
        if (i == 0) {
            n.b(obj);
            this.f36986l = 1;
            if (O.a(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        SessionManager.SessionData sessionData = this.f36987m;
        String sessionId = sessionData.getSessionId();
        long timestamp = sessionData.getTimestamp();
        C4461a c4461a = eVarA.f37021k;
        c4461a.getClass();
        l.f(sessionId, "sessionId");
        b9.l lVar = new b9.l("session_id", sessionId);
        b9.l lVar2 = new b9.l("timestamp", Long.valueOf(timestamp));
        d dVar = c4461a.f38483a;
        b9.l lVar3 = new b9.l("application_id", dVar.getPackageName());
        try {
            str = dVar.getPackageManager().getPackageInfo(dVar.getPackageName(), 0).versionName;
            if (str == null) {
                str = "unknown";
            }
        } catch (PackageManager.NameNotFoundException e4) {
            va.a.f47104a.d(e4);
            str = "NameNotFound";
        }
        c4461a.r(c4461a.c("toto_session_start", false, G0.d.a(lVar, lVar2, lVar3, new b9.l("application_version", str))));
        return C1992A.f18074a;
    }
}
