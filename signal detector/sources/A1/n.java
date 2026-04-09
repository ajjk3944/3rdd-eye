package A1;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.io.IOException;
import java.io.InputStream;
import r1.C2872b;

/* loaded from: classes.dex */
public final class n implements H1.i, r1.s, r1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f115b;

    public /* synthetic */ n(Context context, int i) {
        this.f114a = i;
        this.f115b = context;
    }

    @Override // r1.f
    public Class a() {
        return InputStream.class;
    }

    @Override // r1.f
    public Object c(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i);
    }

    @Override // r1.s
    public r1.r d(r1.x xVar) {
        switch (this.f114a) {
            case 2:
                return new C2872b(this.f115b, this);
            default:
                return new r1.n(this.f115b, 2);
        }
    }

    @Override // r1.f
    public void e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // H1.i
    public Object get() {
        return (ConnectivityManager) this.f115b.getSystemService("connectivity");
    }
}
