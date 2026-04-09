package C0;

import android.os.Looper;
import java.util.Set;
import p.C2767b;

/* loaded from: classes.dex */
public final class v extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String[] strArr, w wVar) {
        super(strArr);
        this.f1115b = wVar;
    }

    @Override // C0.h
    public final void a(Set set) {
        q5.i.e(set, "tables");
        C2767b c2767bF = C2767b.F();
        u uVar = this.f1115b.f1124t;
        c2767bF.i.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            uVar.run();
        } else {
            c2767bF.G(uVar);
        }
    }
}
