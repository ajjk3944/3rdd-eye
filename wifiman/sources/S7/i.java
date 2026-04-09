package S7;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.InterfaceC6518l;
import kotlin.text.p;
import kotlin.text.t;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    private final p f20351a = new p("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");

    /* renamed from: b, reason: collision with root package name */
    private final p f20352b = new p("(?:[0-9]{1,3}\\.){3}[0-9]{1,3}");

    /* renamed from: c, reason: collision with root package name */
    private final p f20353c = new p("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(InterfaceC6518l matchResult) {
        AbstractC6492s.i(matchResult, "matchResult");
        return "**:**:**:**:" + t.y1(matchResult.getValue(), 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(InterfaceC6518l matchResult) {
        AbstractC6492s.i(matchResult, "matchResult");
        return "***.***.***." + t.y1(matchResult.getValue(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(InterfaceC6518l matchResult) {
        AbstractC6492s.i(matchResult, "matchResult");
        return t.u1(matchResult.getValue()) + "****@*" + t.y1(matchResult.getValue(), 5);
    }

    @Override // S7.e
    public String a(String message) {
        AbstractC6492s.i(message, "message");
        return this.f20353c.o(this.f20352b.o(this.f20351a.o(message, new InterfaceC6835l() { // from class: S7.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.e((InterfaceC6518l) obj);
            }
        }), new InterfaceC6835l() { // from class: S7.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.f((InterfaceC6518l) obj);
            }
        }), new InterfaceC6835l() { // from class: S7.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.g((InterfaceC6518l) obj);
            }
        });
    }
}
