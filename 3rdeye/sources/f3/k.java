package F3;

import C.C;
import F3.m;
import a9.InterfaceC1676a;
import android.app.Activity;
import android.database.Cursor;
import com.applovin.impl.g4;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentInformation;
import java.util.Collections;
import java.util.Map;
import o0.b;
import v.RunnableC5655j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements m.a, InterfaceC1676a, b.c, g4.a, ConsentInformation.OnConsentInfoUpdateSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1616d;

    public /* synthetic */ k(N.j jVar, C c10) {
        Map map = Collections.EMPTY_MAP;
        this.f1614b = jVar;
        this.f1615c = c10;
        this.f1616d = map;
    }

    @Override // com.applovin.impl.g4.a
    public void a(Object obj) {
        ((MediationServiceImpl) this.f1614b).a((com.applovin.impl.mediation.h) this.f1615c, (g4) this.f1616d, (String) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r5
  0x002e: PHI (r5v11 B3.c$a) = (r5v4 B3.c$a), (r5v5 B3.c$a), (r5v6 B3.c$a), (r5v7 B3.c$a), (r5v8 B3.c$a), (r5v9 B3.c$a) binds: [B:9:0x002c, B:12:0x0036, B:15:0x003f, B:18:0x0048, B:21:0x0051, B:24:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // F3.m.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.k.apply(java.lang.Object):java.lang.Object");
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        H7.c this$0 = (H7.c) this.f1614b;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Cursor cursorV = this$0.f2288b.V((String) this.f1615c, (String[]) this.f1616d);
        this$0.f2290d.add(cursorV);
        return cursorV;
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        N.j jVar = (N.j) this.f1614b;
        jVar.getClass();
        Map map = Collections.EMPTY_MAP;
        jVar.e(new N.i(jVar, (C) this.f1615c, aVar), new RunnableC5655j(0));
        return "Init GlRenderer";
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        ((com.applovin.impl.privacy.cmp.a) this.f1614b).a((Activity) this.f1615c, (a.InterfaceC0315a) this.f1616d);
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3) {
        this.f1614b = obj;
        this.f1615c = obj2;
        this.f1616d = obj3;
    }
}
