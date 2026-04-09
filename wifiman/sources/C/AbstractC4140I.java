package c;

import androidx.lifecycle.InterfaceC4017o;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: c.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4140I {

    /* renamed from: c.I$a */
    public static final class a extends AbstractC4137F {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f33513d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, InterfaceC6835l interfaceC6835l) {
            super(z10);
            this.f33513d = interfaceC6835l;
        }

        @Override // c.AbstractC4137F
        public void d() {
            this.f33513d.invoke(this);
        }
    }

    public static final AbstractC4137F a(C4138G c4138g, InterfaceC4017o interfaceC4017o, boolean z10, InterfaceC6835l onBackPressed) {
        AbstractC6492s.i(c4138g, "<this>");
        AbstractC6492s.i(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (interfaceC4017o != null) {
            c4138g.h(interfaceC4017o, aVar);
        } else {
            c4138g.i(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ AbstractC4137F b(C4138G c4138g, InterfaceC4017o interfaceC4017o, boolean z10, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4017o = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(c4138g, interfaceC4017o, z10, interfaceC6835l);
    }
}
