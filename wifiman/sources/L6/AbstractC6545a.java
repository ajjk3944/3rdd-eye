package l6;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import ph.d;
import th.l;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6545a {

    /* renamed from: l6.a$a, reason: collision with other inner class name */
    public static final class C1934a implements d {

        /* renamed from: a, reason: collision with root package name */
        private Y5.d f52388a;

        /* renamed from: l6.a$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1935a extends C6490p implements InterfaceC6835l {
            C1935a(Object obj) {
                super(1, obj, ArrayList.class, "remove", "remove(Ljava/lang/Object;)Z", 0);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Y5.d p02) {
                AbstractC6492s.i(p02, "p0");
                return Boolean.valueOf(((ArrayList) this.receiver).remove(p02));
            }
        }

        /* renamed from: l6.a$a$b */
        /* synthetic */ class b extends C6490p implements InterfaceC6835l {
            b(Object obj) {
                super(1, obj, ArrayList.class, "add", "add(Ljava/lang/Object;)Z", 0);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Y5.d p02) {
                AbstractC6492s.i(p02, "p0");
                return Boolean.valueOf(((ArrayList) this.receiver).add(p02));
            }
        }

        C1934a() {
        }

        @Override // ph.d, ph.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Y5.d a(Y5.b thisRef, l property) {
            AbstractC6492s.i(thisRef, "thisRef");
            AbstractC6492s.i(property, "property");
            return this.f52388a;
        }

        @Override // ph.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Y5.b thisRef, l property, Y5.d dVar) {
            AbstractC6492s.i(thisRef, "thisRef");
            AbstractC6492s.i(property, "property");
            if (AbstractC6492s.d(this.f52388a, dVar)) {
                return;
            }
            Y5.d dVar2 = this.f52388a;
            if (dVar2 != null) {
            }
            this.f52388a = dVar;
            if (dVar != null) {
            }
        }
    }

    public static final d a() {
        return new C1934a();
    }
}
