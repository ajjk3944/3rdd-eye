package io.sentry.android.replay;

import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final b f11844g;

    /* renamed from: r, reason: collision with root package name */
    public static final b f11845r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11846d;

    static {
        int i10 = 1;
        f11844g = new b(i10, 0);
        f11845r = new b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f11846d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f11846d) {
            case 0:
                tt.j jVar = (tt.j) obj;
                br.l.e(jVar, "it");
                String strGroup = jVar.f23004a.group();
                br.l.d(strGroup, "group(...)");
                String upperCase = String.valueOf(tt.l.E0(strGroup)).toUpperCase(Locale.ROOT);
                br.l.d(upperCase, "toUpperCase(...)");
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                br.l.e(entry, "<name for destructuring parameter 0>");
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
