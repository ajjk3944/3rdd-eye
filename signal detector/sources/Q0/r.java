package q0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f23009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Bundle bundle) {
        super(1);
        this.f23008b = i;
        this.f23009c = bundle;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        switch (this.f23008b) {
            case 0:
                q5.i.e((String) obj, "argName");
                return Boolean.valueOf(!this.f23009c.containsKey(r2));
            default:
                q5.i.e((String) obj, "key");
                return Boolean.valueOf(!this.f23009c.containsKey(r2));
        }
    }
}
