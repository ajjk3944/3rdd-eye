package R3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import r1.C2872b;
import r1.n;
import r1.r;
import r1.s;
import r1.x;

/* loaded from: classes.dex */
public final class e implements G0.a, s, r1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3408a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3409b;

    public /* synthetic */ e(Context context, int i) {
        this.f3408a = i;
        this.f3409b = context;
    }

    @Override // r1.f
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // r1.f
    public Object c(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(i);
    }

    @Override // r1.s
    public r d(x xVar) {
        switch (this.f3408a) {
            case 2:
                return new C2872b(this.f3409b, this);
            case 3:
                return new n(this.f3409b, 0);
            default:
                return new C2872b(this.f3409b, xVar.c(Integer.class, AssetFileDescriptor.class));
        }
    }

    @Override // r1.f
    public void e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // G0.a
    public G0.b j(A1.s sVar) {
        String str = (String) sVar.f124c;
        C0.s sVar2 = (C0.s) sVar.f125d;
        q5.i.e(sVar2, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        A1.s sVar3 = new A1.s(this.f3409b, str, sVar2, true);
        return new H0.h((Context) sVar3.f123b, (String) sVar3.f124c, (C0.s) sVar3.f125d, sVar3.f122a);
    }
}
