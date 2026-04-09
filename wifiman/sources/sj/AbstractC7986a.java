package sj;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import org.kodein.di.DI;

/* renamed from: sj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7986a {

    /* renamed from: sj.a$a, reason: collision with other inner class name */
    static final class C2164a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f61645a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2164a(Context context) {
            super(0);
            this.f61645a = context;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            return this.f61645a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DI b(Object obj, Context context) {
        Object baseContext = context;
        while (true) {
            if (baseContext == null) {
                Object applicationContext = context.getApplicationContext();
                org.kodein.di.c cVar = applicationContext instanceof org.kodein.di.c ? (org.kodein.di.c) applicationContext : null;
                if (cVar != null) {
                    return cVar.d();
                }
                throw new IllegalStateException("Trying to find closest DI, but no DI container was found at all. Your Application should be DIAware.");
            }
            if (!AbstractC6492s.d(baseContext, obj) && (baseContext instanceof org.kodein.di.c)) {
                return ((org.kodein.di.c) baseContext).d();
            }
            baseContext = baseContext instanceof ContextWrapper ? ((ContextWrapper) baseContext).getBaseContext() : null;
        }
    }

    public static final InterfaceC7990c c() {
        return new C7988b();
    }

    public static final C7992d d(Context context) {
        AbstractC6492s.i(context, "context");
        return new C7992d(new C2164a(context));
    }
}
