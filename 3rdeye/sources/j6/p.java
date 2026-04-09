package j6;

import android.content.Context;
import android.content.ContextWrapper;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import g0.C4356c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: DivKit.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f43037b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final D3.f f43038c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile p f43039d;

    /* renamed from: a, reason: collision with root package name */
    public final DivKitComponent f43040a;

    /* compiled from: DivKit.kt */
    public static final class a {
        public final p a(ContextWrapper context) {
            kotlin.jvm.internal.l.f(context, "context");
            p pVar = p.f43039d;
            if (pVar != null) {
                return pVar;
            }
            synchronized (this) {
                p pVar2 = p.f43039d;
                if (pVar2 != null) {
                    return pVar2;
                }
                p pVar3 = new p(context, p.f43038c);
                p.f43039d = pVar3;
                return pVar3;
            }
        }
    }

    static {
        androidx.work.s sVar = new androidx.work.s();
        C4356c c4356c = new C4356c(4);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.l.e(executorServiceNewSingleThreadExecutor, "executorService ?: Execu…newSingleThreadExecutor()");
        f43038c = new D3.f(executorServiceNewSingleThreadExecutor, sVar, c4356c);
    }

    public p(ContextWrapper contextWrapper, D3.f fVar) {
        DivKitComponent.Builder builder = Yatagan$DivKitComponent.builder();
        Context applicationContext = contextWrapper.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "context.applicationContext");
        DivKitComponent.Builder builderB = builder.b(applicationContext);
        builderB.a(fVar);
        this.f43040a = builderB.build();
    }
}
