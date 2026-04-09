package bf;

import android.content.Context;
import androidx.lifecycle.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements cf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2154c;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.f2152a = i4;
        this.f2153b = obj;
        this.f2154c = obj2;
    }

    @Override // cf.b
    public final Object get() {
        switch (this.f2152a) {
            case 0:
                return new i((Context) this.f2153b, (String) this.f2154c);
            case 1:
                de.f fVar = (de.f) this.f2153b;
                de.a aVar = (de.a) this.f2154c;
                return aVar.f22194f.c(new f1(aVar, fVar));
            default:
                wd.f fVar2 = (wd.f) this.f2154c;
                Context context = (Context) this.f2153b;
                String strC = fVar2.c();
                return new hf.a(context, strC);
        }
    }

    public /* synthetic */ c(wd.f fVar, Context context) {
        this.f2152a = 2;
        this.f2154c = fVar;
        this.f2153b = context;
    }
}
