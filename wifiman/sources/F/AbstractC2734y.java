package F;

import android.view.KeyEvent;
import mh.InterfaceC6835l;
import w0.AbstractC8250d;
import w0.C8247a;
import w0.C8248b;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2734y {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2733x f5633a = new c(a(new kotlin.jvm.internal.F() { // from class: F.y.b
        @Override // kotlin.jvm.internal.F, th.n
        public Object get(Object obj) {
            return Boolean.valueOf(AbstractC8250d.e(((C8248b) obj).f()));
        }
    }));

    /* renamed from: F.y$a */
    public static final class a implements InterfaceC2733x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f5634a;

        a(InterfaceC6835l interfaceC6835l) {
            this.f5634a = interfaceC6835l;
        }

        @Override // F.InterfaceC2733x
        public EnumC2731v a(KeyEvent keyEvent) {
            if (((Boolean) this.f5634a.invoke(C8248b.a(keyEvent))).booleanValue() && AbstractC8250d.f(keyEvent)) {
                if (C8247a.p(AbstractC8250d.a(keyEvent), I.f4888a.x())) {
                    return EnumC2731v.REDO;
                }
                return null;
            }
            if (((Boolean) this.f5634a.invoke(C8248b.a(keyEvent))).booleanValue()) {
                long jA = AbstractC8250d.a(keyEvent);
                I i10 = I.f4888a;
                if (C8247a.p(jA, i10.d()) ? true : C8247a.p(jA, i10.n())) {
                    return EnumC2731v.COPY;
                }
                if (C8247a.p(jA, i10.u())) {
                    return EnumC2731v.PASTE;
                }
                if (C8247a.p(jA, i10.v())) {
                    return EnumC2731v.CUT;
                }
                if (C8247a.p(jA, i10.a())) {
                    return EnumC2731v.SELECT_ALL;
                }
                if (C8247a.p(jA, i10.w())) {
                    return EnumC2731v.REDO;
                }
                if (C8247a.p(jA, i10.x())) {
                    return EnumC2731v.UNDO;
                }
                return null;
            }
            if (AbstractC8250d.e(keyEvent)) {
                return null;
            }
            if (AbstractC8250d.f(keyEvent)) {
                long jA2 = AbstractC8250d.a(keyEvent);
                I i11 = I.f4888a;
                if (C8247a.p(jA2, i11.i())) {
                    return EnumC2731v.SELECT_LEFT_CHAR;
                }
                if (C8247a.p(jA2, i11.j())) {
                    return EnumC2731v.SELECT_RIGHT_CHAR;
                }
                if (C8247a.p(jA2, i11.k())) {
                    return EnumC2731v.SELECT_UP;
                }
                if (C8247a.p(jA2, i11.h())) {
                    return EnumC2731v.SELECT_DOWN;
                }
                if (C8247a.p(jA2, i11.r())) {
                    return EnumC2731v.SELECT_PAGE_UP;
                }
                if (C8247a.p(jA2, i11.q())) {
                    return EnumC2731v.SELECT_PAGE_DOWN;
                }
                if (C8247a.p(jA2, i11.p())) {
                    return EnumC2731v.SELECT_LINE_START;
                }
                if (C8247a.p(jA2, i11.o())) {
                    return EnumC2731v.SELECT_LINE_END;
                }
                if (C8247a.p(jA2, i11.n())) {
                    return EnumC2731v.PASTE;
                }
                return null;
            }
            long jA3 = AbstractC8250d.a(keyEvent);
            I i12 = I.f4888a;
            if (C8247a.p(jA3, i12.i())) {
                return EnumC2731v.LEFT_CHAR;
            }
            if (C8247a.p(jA3, i12.j())) {
                return EnumC2731v.RIGHT_CHAR;
            }
            if (C8247a.p(jA3, i12.k())) {
                return EnumC2731v.UP;
            }
            if (C8247a.p(jA3, i12.h())) {
                return EnumC2731v.DOWN;
            }
            if (C8247a.p(jA3, i12.r())) {
                return EnumC2731v.PAGE_UP;
            }
            if (C8247a.p(jA3, i12.q())) {
                return EnumC2731v.PAGE_DOWN;
            }
            if (C8247a.p(jA3, i12.p())) {
                return EnumC2731v.LINE_START;
            }
            if (C8247a.p(jA3, i12.o())) {
                return EnumC2731v.LINE_END;
            }
            if (C8247a.p(jA3, i12.l())) {
                return EnumC2731v.NEW_LINE;
            }
            if (C8247a.p(jA3, i12.c())) {
                return EnumC2731v.DELETE_PREV_CHAR;
            }
            if (C8247a.p(jA3, i12.g())) {
                return EnumC2731v.DELETE_NEXT_CHAR;
            }
            if (C8247a.p(jA3, i12.s())) {
                return EnumC2731v.PASTE;
            }
            if (C8247a.p(jA3, i12.f())) {
                return EnumC2731v.CUT;
            }
            if (C8247a.p(jA3, i12.e())) {
                return EnumC2731v.COPY;
            }
            if (C8247a.p(jA3, i12.t())) {
                return EnumC2731v.TAB;
            }
            return null;
        }
    }

    /* renamed from: F.y$c */
    public static final class c implements InterfaceC2733x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2733x f5636a;

        c(InterfaceC2733x interfaceC2733x) {
            this.f5636a = interfaceC2733x;
        }

        @Override // F.InterfaceC2733x
        public EnumC2731v a(KeyEvent keyEvent) {
            EnumC2731v enumC2731v = null;
            if (AbstractC8250d.f(keyEvent) && AbstractC8250d.e(keyEvent)) {
                long jA = AbstractC8250d.a(keyEvent);
                I i10 = I.f4888a;
                if (C8247a.p(jA, i10.i())) {
                    enumC2731v = EnumC2731v.SELECT_LEFT_WORD;
                } else if (C8247a.p(jA, i10.j())) {
                    enumC2731v = EnumC2731v.SELECT_RIGHT_WORD;
                } else if (C8247a.p(jA, i10.k())) {
                    enumC2731v = EnumC2731v.SELECT_PREV_PARAGRAPH;
                } else if (C8247a.p(jA, i10.h())) {
                    enumC2731v = EnumC2731v.SELECT_NEXT_PARAGRAPH;
                }
            } else if (AbstractC8250d.e(keyEvent)) {
                long jA2 = AbstractC8250d.a(keyEvent);
                I i11 = I.f4888a;
                if (C8247a.p(jA2, i11.i())) {
                    enumC2731v = EnumC2731v.LEFT_WORD;
                } else if (C8247a.p(jA2, i11.j())) {
                    enumC2731v = EnumC2731v.RIGHT_WORD;
                } else if (C8247a.p(jA2, i11.k())) {
                    enumC2731v = EnumC2731v.PREV_PARAGRAPH;
                } else if (C8247a.p(jA2, i11.h())) {
                    enumC2731v = EnumC2731v.NEXT_PARAGRAPH;
                } else if (C8247a.p(jA2, i11.m())) {
                    enumC2731v = EnumC2731v.DELETE_PREV_CHAR;
                } else if (C8247a.p(jA2, i11.g())) {
                    enumC2731v = EnumC2731v.DELETE_NEXT_WORD;
                } else if (C8247a.p(jA2, i11.c())) {
                    enumC2731v = EnumC2731v.DELETE_PREV_WORD;
                } else if (C8247a.p(jA2, i11.b())) {
                    enumC2731v = EnumC2731v.DESELECT;
                }
            } else if (AbstractC8250d.f(keyEvent)) {
                long jA3 = AbstractC8250d.a(keyEvent);
                I i12 = I.f4888a;
                if (C8247a.p(jA3, i12.p())) {
                    enumC2731v = EnumC2731v.SELECT_LINE_LEFT;
                } else if (C8247a.p(jA3, i12.o())) {
                    enumC2731v = EnumC2731v.SELECT_LINE_RIGHT;
                }
            } else if (AbstractC8250d.d(keyEvent)) {
                long jA4 = AbstractC8250d.a(keyEvent);
                I i13 = I.f4888a;
                if (C8247a.p(jA4, i13.c())) {
                    enumC2731v = EnumC2731v.DELETE_FROM_LINE_START;
                } else if (C8247a.p(jA4, i13.g())) {
                    enumC2731v = EnumC2731v.DELETE_TO_LINE_END;
                }
            }
            return enumC2731v == null ? this.f5636a.a(keyEvent) : enumC2731v;
        }
    }

    public static final InterfaceC2733x a(InterfaceC6835l interfaceC6835l) {
        return new a(interfaceC6835l);
    }

    public static final InterfaceC2733x b() {
        return f5633a;
    }
}
