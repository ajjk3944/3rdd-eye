package c0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4183l {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4182k f33637a = a(a.f33638a, b.f33639a);

    /* renamed from: c0.l$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33638a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4184m interfaceC4184m, Object obj) {
            return obj;
        }
    }

    /* renamed from: c0.l$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33639a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: c0.l$c */
    public static final class c implements InterfaceC4182k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f33640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f33641b;

        c(InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l) {
            this.f33640a = interfaceC6839p;
            this.f33641b = interfaceC6835l;
        }

        @Override // c0.InterfaceC4182k
        public Object a(Object obj) {
            return this.f33641b.invoke(obj);
        }

        @Override // c0.InterfaceC4182k
        public Object b(InterfaceC4184m interfaceC4184m, Object obj) {
            return this.f33640a.invoke(interfaceC4184m, obj);
        }
    }

    public static final InterfaceC4182k a(InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l) {
        return new c(interfaceC6839p, interfaceC6835l);
    }

    public static final InterfaceC4182k b() {
        InterfaceC4182k interfaceC4182k = f33637a;
        AbstractC6492s.g(interfaceC4182k, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return interfaceC4182k;
    }
}
