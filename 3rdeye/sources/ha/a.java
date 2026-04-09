package ha;

import U9.s;
import U9.u;

/* compiled from: HttpLoggingInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final b f38278a = b.f38280a;

    /* renamed from: b, reason: collision with root package name */
    public volatile EnumC0464a f38279b = EnumC0464a.NONE;

    /* compiled from: HttpLoggingInterceptor.kt */
    /* renamed from: ha.a$a, reason: collision with other inner class name */
    public enum EnumC0464a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final ha.b f38280a = new ha.b();

        void a(String str);
    }

    public final void a(s sVar, int i) {
        sVar.d(i);
        String strF = sVar.f(i);
        this.f38278a.a(sVar.d(i) + ": " + strF);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    @Override // U9.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U9.E intercept(U9.u.a r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.a.intercept(U9.u$a):U9.E");
    }
}
