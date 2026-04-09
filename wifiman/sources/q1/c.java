package Q1;

import Ii.N;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import th.l;

/* loaded from: classes.dex */
public final class c implements ph.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19113a;

    /* renamed from: b, reason: collision with root package name */
    private final P1.b f19114b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f19115c;

    /* renamed from: d, reason: collision with root package name */
    private final N f19116d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19117e;

    /* renamed from: f, reason: collision with root package name */
    private volatile O1.e f19118f;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19119a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f19120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f19119a = context;
            this.f19120b = cVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f19119a;
            AbstractC6492s.h(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f19120b.f19113a);
        }
    }

    public c(String name, P1.b bVar, InterfaceC6835l produceMigrations, N scope) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(produceMigrations, "produceMigrations");
        AbstractC6492s.i(scope, "scope");
        this.f19113a = name;
        this.f19114b = bVar;
        this.f19115c = produceMigrations;
        this.f19116d = scope;
        this.f19117e = new Object();
    }

    @Override // ph.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public O1.e a(Context thisRef, l property) {
        O1.e eVar;
        AbstractC6492s.i(thisRef, "thisRef");
        AbstractC6492s.i(property, "property");
        O1.e eVar2 = this.f19118f;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (this.f19117e) {
            try {
                if (this.f19118f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    R1.c cVar = R1.c.f19547a;
                    P1.b bVar = this.f19114b;
                    InterfaceC6835l interfaceC6835l = this.f19115c;
                    AbstractC6492s.h(applicationContext, "applicationContext");
                    this.f19118f = cVar.a(bVar, (List) interfaceC6835l.invoke(applicationContext), this.f19116d, new a(applicationContext, this));
                }
                eVar = this.f19118f;
                AbstractC6492s.f(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }
}
