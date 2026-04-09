package Q0;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import v1.h;

/* renamed from: Q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3425b {

    /* renamed from: Q0.b$a */
    public static final class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f19028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f19029b;

        a(InterfaceC3069n interfaceC3069n, N n10) {
            this.f19028a = interfaceC3069n;
            this.f19029b = n10;
        }

        @Override // v1.h.e
        /* renamed from: h */
        public void f(int i10) {
            this.f19028a.cancel(new IllegalStateException("Unable to load font " + this.f19029b + " (reason=" + i10 + ')'));
        }

        @Override // v1.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            this.f19028a.resumeWith(Yg.u.c(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(N n10, Context context) {
        Typeface typefaceG = v1.h.g(context, n10.d());
        AbstractC6492s.f(typefaceG);
        return typefaceG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(N n10, Context context, InterfaceC5380e interfaceC5380e) throws Resources.NotFoundException {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        v1.h.i(context, n10.d(), new a(c3073p, n10), null);
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }
}
