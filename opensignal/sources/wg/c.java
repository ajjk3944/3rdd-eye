package wg;

import com.google.android.gms.internal.measurement.y3;
import tg.e1;

/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: g, reason: collision with root package name */
    public static final int f24491g;

    /* renamed from: h, reason: collision with root package name */
    public static final tt.k f24492h;

    /* renamed from: a, reason: collision with root package name */
    public final e1 f24493a;

    /* renamed from: b, reason: collision with root package name */
    public final fg.e f24494b;

    /* renamed from: c, reason: collision with root package name */
    public final tg.b f24495c;

    /* renamed from: d, reason: collision with root package name */
    public final e f24496d;

    /* renamed from: e, reason: collision with root package name */
    public final o f24497e;

    /* renamed from: f, reason: collision with root package name */
    public final eu.d f24498f;

    static {
        int i10 = ut.a.f23695r;
        f24491g = (int) ut.a.h(y3.P(24, ut.c.HOURS), ut.c.SECONDS);
        f24492h = new tt.k("/");
    }

    public c(e1 e1Var, fg.e eVar, tg.b bVar, e eVar2, o oVar) {
        br.l.e(e1Var, "timeProvider");
        br.l.e(eVar, "firebaseInstallationsApi");
        br.l.e(bVar, "appInfo");
        br.l.e(eVar2, "configsFetcher");
        br.l.e(oVar, "settingsCache");
        this.f24493a = e1Var;
        this.f24494b = eVar;
        this.f24495c = bVar;
        this.f24496d = eVar2;
        this.f24497e = oVar;
        this.f24498f = eu.e.a();
    }

    @Override // wg.p
    public final Boolean a() {
        return this.f24497e.a().f24504a;
    }

    @Override // wg.p
    public final ut.a b() {
        Integer num = this.f24497e.a().f24506c;
        if (num == null) {
            return null;
        }
        int i10 = ut.a.f23695r;
        return new ut.a(y3.P(num.intValue(), ut.c.SECONDS));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:42:0x00a4, B:44:0x00ae, B:47:0x00bb, B:35:0x0084, B:39:0x0092), top: B:58:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:42:0x00a4, B:44:0x00ae, B:47:0x00bb, B:35:0x0084, B:39:0x0092), top: B:58:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // wg.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(pq.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.c.c(pq.c):java.lang.Object");
    }

    @Override // wg.p
    public final Double d() {
        return this.f24497e.a().f24505b;
    }
}
