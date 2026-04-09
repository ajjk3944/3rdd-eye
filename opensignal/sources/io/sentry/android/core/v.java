package io.sentry.android.core;

import android.content.Context;
import io.sentry.b5;
import io.sentry.x5;

/* loaded from: classes.dex */
public final class v implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11780a;

    /* renamed from: d, reason: collision with root package name */
    public final SentryAndroidOptions f11781d;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f11782g;

    /* renamed from: r, reason: collision with root package name */
    public final h7.h0 f11783r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.cache.f f11784x;

    public v(Context context, f0 f0Var, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f11780a = applicationContext != null ? applicationContext : context;
        this.f11781d = sentryAndroidOptions;
        this.f11782g = f0Var;
        this.f11784x = sentryAndroidOptions.findPersistingScopeObserver();
        this.f11783r = new h7.h0(new i.g0(sentryAndroidOptions));
    }

    public static boolean c(io.sentry.hints.b bVar) {
        if (bVar instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) bVar).e());
        }
        return false;
    }

    public final String a() {
        SentryAndroidOptions sentryAndroidOptions = this.f11781d;
        try {
            return (String) sentryAndroidOptions.getRuntimeManager().c(new bf.a(23, this));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().g(b5.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    public final Object d(x5 x5Var, String str, Class cls) {
        io.sentry.cache.f fVar = this.f11784x;
        if (fVar == null) {
            return null;
        }
        return fVar.c(x5Var, str, cls);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(63:70|(1:72)|73|(1:75)|76|(2:79|(1:81)(3:82|(4:85|(3:298|87|301)(1:300)|299|83)|297))|88|(2:91|(1:93)(1:94))|95|(2:98|(1:100)(3:101|(4:104|(2:106|303)(1:304)|107|102)|302))|108|(3:111|(3:114|(4:307|119|(3:308|121|312)(1:311)|309)(2:310|309)|112)|305)|122|(1:124)|125|(2:(1:128)(1:129)|130)|131|(4:(1:134)(1:135)|136|(1:138)(1:139)|140)|141|(1:143)|144|(1:151)|152|(40:154|(1:160)(3:287|157|(2:159|160)(2:163|(4:165|(3:167|(2:176|320)(2:175|321)|177)|319|178)(1:179)))|185|(1:187)|188|(3:190|(1:193)|194)|195|(1:197)|198|(2:283|202)|205|(1:207)|208|(1:210)|211|(3:213|(1:215)|216)|217|(1:219)|220|(1:222)|223|(1:225)|226|(1:229)|(3:231|281|232)|289|235|(2:237|(1:239))|243|(2:246|(1:248)(3:249|(4:252|(3:314|254|317)(1:316)|315|250)|313))|255|(1:257)|258|(1:260)|261|(1:265)|279|266|(5:268|(1:270)|271|(2:274|272)|318)|278)(1:181)|(1:184)|185|(0)|188|(0)|195|(0)|198|(3:200|283|202)|205|(0)|208|(0)|211|(0)|217|(0)|220|(0)|223|(0)|226|(0)|(0)|289|235|(0)|243|(0)|255|(0)|258|(0)|261|(2:263|265)|279|266|(0)|278) */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x054f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0550, code lost:
    
        r5.getLogger().g(io.sentry.b5.ERROR, "Error getting split apks info.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0610, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0611, code lost:
    
        r5.getLogger().g(io.sentry.b5.ERROR, "Error getting side loaded info.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x053a A[Catch: all -> 0x054f, TryCatch #5 {all -> 0x054f, blocks: (B:235:0x0532, B:237:0x053a, B:239:0x0548), top: B:289:0x0532 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d3 A[Catch: all -> 0x0610, TryCatch #0 {all -> 0x0610, blocks: (B:266:0x05cb, B:268:0x05d3, B:270:0x05e7, B:271:0x05ec, B:272:0x05f4, B:274:0x05fa), top: B:279:0x05cb }] */
    @Override // io.sentry.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.t4 f(io.sentry.t4 r26, io.sentry.h0 r27) {
        /*
            Method dump skipped, instructions count: 1565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.v.f(io.sentry.t4, io.sentry.h0):io.sentry.t4");
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, io.sentry.h0 h0Var) {
        return a0Var;
    }
}
