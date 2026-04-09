package c;

import c.ActivityC2008f;
import com.yandex.mobile.ads.impl.nr0;
import e.AbstractC4294e;
import e.InterfaceC4291b;
import f.AbstractC4328a;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2009g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18287e;

    public /* synthetic */ RunnableC2009g(Object obj, int i, int i10, Object obj2) {
        this.f18284b = i10;
        this.f18286d = obj;
        this.f18285c = i;
        this.f18287e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18284b) {
            case 0:
                ActivityC2008f.g this$0 = (ActivityC2008f.g) this.f18286d;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                Serializable serializable = ((AbstractC4328a.C0451a) this.f18287e).f37792a;
                String str = (String) this$0.f37608a.get(Integer.valueOf(this.f18285c));
                if (str != null) {
                    AbstractC4294e.a aVar = (AbstractC4294e.a) this$0.f37612e.get(str);
                    if ((aVar != null ? aVar.f37615a : null) != null) {
                        InterfaceC4291b<O> interfaceC4291b = aVar.f37615a;
                        kotlin.jvm.internal.l.d(interfaceC4291b, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (this$0.f37611d.remove(str)) {
                            interfaceC4291b.onActivityResult(serializable);
                            break;
                        }
                    } else {
                        this$0.f37614g.remove(str);
                        this$0.f37613f.put(str, serializable);
                        break;
                    }
                }
                break;
            default:
                nr0.a((CopyOnWriteArraySet) this.f18286d, this.f18285c, (nr0.a) this.f18287e);
                break;
        }
    }
}
