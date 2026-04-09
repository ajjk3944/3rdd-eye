package jj;

import android.app.usage.UsageStatsManager;
import h9.r2;

/* loaded from: classes.dex */
public final class b extends ik.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13719b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.o f13720c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f13721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(aVar);
        this.f13719b = 3;
        br.l.e(aVar, "dataSource");
        this.f13720c = aVar;
        this.f13721d = o0.APP_ACTIVE_OR_SCREEN_UNLOCKED;
    }

    @Override // ik.a
    public final o0 a() {
        switch (this.f13719b) {
        }
        return this.f13721d;
    }

    @Override // ik.a
    public final boolean b(hk.h hVar) {
        switch (this.f13719b) {
            case 0:
                br.l.e(hVar, "task");
                StringBuilder sb2 = new StringBuilder("shouldExecute: will return: ");
                e eVar = (e) this.f13720c;
                sb2.append(!eVar.f13731g.f25314d);
                ch.n.b("AppBackgroundTrigger", sb2.toString());
                return !eVar.f13731g.f25314d;
            case 1:
                br.l.e(hVar, "task");
                StringBuilder sb3 = new StringBuilder("shouldExecute: will return: ");
                e eVar2 = (e) this.f13720c;
                sb3.append(eVar2.f13731g.f25314d);
                ch.n.b("AppForegroundTrigger", sb3.toString());
                return eVar2.f13731g.f25314d;
            case 2:
                br.l.e(hVar, "task");
                xi.a aVar = ((e) this.f13720c).f13731g;
                return aVar.f25312b || aVar.f25313c;
            default:
                br.l.e(hVar, "task");
                StringBuilder sb4 = new StringBuilder("shouldExecute: will return: ");
                a aVar2 = (a) this.f13720c;
                r2 r2Var = aVar2.f13715g;
                io.sentry.internal.debugmeta.c cVar = aVar2.f13716r;
                Boolean boolValueOf = null;
                sb4.append(!((((UsageStatsManager) r2Var.f10472g) == null || !((ch.f) r2Var.f10475y).a()) ? null : Boolean.valueOf(r3.isAppInactive((String) r2Var.f10474x))).booleanValue());
                sb4.append(", ");
                sb4.append(!cVar.s().booleanValue());
                ch.n.b("AppActiveOrScreenUnlockedTrigger", sb4.toString());
                r2 r2Var2 = aVar2.f13715g;
                UsageStatsManager usageStatsManager = (UsageStatsManager) r2Var2.f10472g;
                if (usageStatsManager != null && ((ch.f) r2Var2.f10475y).a()) {
                    boolValueOf = Boolean.valueOf(usageStatsManager.isAppInactive((String) r2Var2.f10474x));
                }
                return (boolValueOf.booleanValue() && cVar.s().booleanValue()) ? false : true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i10) {
        super(eVar);
        this.f13719b = i10;
        switch (i10) {
            case 1:
                super(eVar);
                this.f13720c = eVar;
                this.f13721d = o0.APP_FOREGROUND;
                break;
            case 2:
                super(eVar);
                this.f13720c = eVar;
                this.f13721d = o0.APP_LIFECYCLE;
                break;
            default:
                this.f13720c = eVar;
                this.f13721d = o0.APP_BACKGROUND;
                break;
        }
    }
}
