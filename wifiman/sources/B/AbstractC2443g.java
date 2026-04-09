package B;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import r.C7531h;
import r.C7536k;
import sh.AbstractC7978m;

/* renamed from: B.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2443g {

    /* renamed from: a, reason: collision with root package name */
    private static final float f941a = Y0.h.j(2500);

    /* renamed from: b, reason: collision with root package name */
    private static final float f942b = Y0.h.j(1500);

    /* renamed from: c, reason: collision with root package name */
    private static final float f943c = Y0.h.j(50);

    /* renamed from: B.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f944a;

        /* renamed from: b, reason: collision with root package name */
        Object f945b;

        /* renamed from: c, reason: collision with root package name */
        Object f946c;

        /* renamed from: d, reason: collision with root package name */
        float f947d;

        /* renamed from: e, reason: collision with root package name */
        float f948e;

        /* renamed from: f, reason: collision with root package name */
        float f949f;

        /* renamed from: g, reason: collision with root package name */
        int f950g;

        /* renamed from: h, reason: collision with root package name */
        int f951h;

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f952i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f953j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Y0.d f954k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC2444h f955l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f956m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f957n;

        /* renamed from: B.g$a$a, reason: collision with other inner class name */
        static final class C0035a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2444h f958a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f959b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f960c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f961d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w.v f962e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.J f963f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f964g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f965h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.L f966i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f967j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f968k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f969l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0035a(InterfaceC2444h interfaceC2444h, int i10, float f10, kotlin.jvm.internal.K k10, w.v vVar, kotlin.jvm.internal.J j10, boolean z10, float f11, kotlin.jvm.internal.L l10, int i11, int i12, kotlin.jvm.internal.N n10) {
                super(1);
                this.f958a = interfaceC2444h;
                this.f959b = i10;
                this.f960c = f10;
                this.f961d = k10;
                this.f962e = vVar;
                this.f963f = j10;
                this.f964g = z10;
                this.f965h = f11;
                this.f966i = l10;
                this.f967j = i11;
                this.f968k = i12;
                this.f969l = n10;
            }

            public final void a(C7531h c7531h) {
                if (!AbstractC2443g.e(this.f958a, this.f959b)) {
                    float f10 = (this.f960c > 0.0f ? AbstractC7978m.f(((Number) c7531h.e()).floatValue(), this.f960c) : AbstractC7978m.c(((Number) c7531h.e()).floatValue(), this.f960c)) - this.f961d.f51686a;
                    float fA = this.f962e.a(f10);
                    if (!AbstractC2443g.e(this.f958a, this.f959b) && !a.t(this.f964g, this.f958a, this.f959b, this.f968k)) {
                        if (f10 != fA) {
                            c7531h.a();
                            this.f963f.f51685a = false;
                            return;
                        }
                        this.f961d.f51686a += f10;
                        if (this.f964g) {
                            if (((Number) c7531h.e()).floatValue() > this.f965h) {
                                c7531h.a();
                            }
                        } else if (((Number) c7531h.e()).floatValue() < (-this.f965h)) {
                            c7531h.a();
                        }
                        if (this.f964g) {
                            if (this.f966i.f51687a >= 2) {
                                int iC = this.f959b - this.f958a.c();
                                int i10 = this.f967j;
                                if (iC > i10) {
                                    this.f958a.b(this.f962e, this.f959b - i10, 0);
                                }
                            }
                        } else if (this.f966i.f51687a >= 2) {
                            int iG = this.f958a.g();
                            int i11 = this.f959b;
                            int i12 = iG - i11;
                            int i13 = this.f967j;
                            if (i12 > i13) {
                                this.f958a.b(this.f962e, i11 + i13, 0);
                            }
                        }
                    }
                }
                if (!a.t(this.f964g, this.f958a, this.f959b, this.f968k)) {
                    if (AbstractC2443g.e(this.f958a, this.f959b)) {
                        throw new C2442f(AbstractC7137b.e(this.f958a.f(this.f959b)), (C7536k) this.f969l.f51689a);
                    }
                } else {
                    this.f958a.b(this.f962e, this.f959b, this.f968k);
                    this.f963f.f51685a = false;
                    c7531h.a();
                }
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7531h) obj);
                return Yg.J.f24997a;
            }
        }

        /* renamed from: B.g$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f970a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f971b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ w.v f972c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f10, kotlin.jvm.internal.K k10, w.v vVar) {
                super(1);
                this.f970a = f10;
                this.f971b = k10;
                this.f972c = vVar;
            }

            public final void a(C7531h c7531h) {
                float f10 = this.f970a;
                float fC = 0.0f;
                if (f10 > 0.0f) {
                    fC = AbstractC7978m.f(((Number) c7531h.e()).floatValue(), this.f970a);
                } else if (f10 < 0.0f) {
                    fC = AbstractC7978m.c(((Number) c7531h.e()).floatValue(), this.f970a);
                }
                float f11 = fC - this.f971b.f51686a;
                if (f11 != this.f972c.a(f11) || fC != ((Number) c7531h.e()).floatValue()) {
                    c7531h.a();
                }
                this.f971b.f51686a += f11;
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7531h) obj);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Y0.d dVar, InterfaceC2444h interfaceC2444h, int i11, int i12, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f953j = i10;
            this.f954k = dVar;
            this.f955l = interfaceC2444h;
            this.f956m = i11;
            this.f957n = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean t(boolean z10, InterfaceC2444h interfaceC2444h, int i10, int i11) {
            if (z10) {
                if (interfaceC2444h.g() <= i10 && (interfaceC2444h.g() != i10 || interfaceC2444h.e() <= i11)) {
                    return false;
                }
            } else if (interfaceC2444h.g() >= i10 && (interfaceC2444h.g() != i10 || interfaceC2444h.e() >= i11)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f953j, this.f954k, this.f955l, this.f956m, this.f957n, interfaceC5380e);
            aVar.f952i = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ce A[Catch: f -> 0x01bb, TryCatch #5 {f -> 0x01bb, blocks: (B:28:0x00ca, B:30:0x00ce, B:32:0x00d6, B:44:0x0105, B:48:0x0141, B:52:0x014e), top: B:102:0x00ca }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0199 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x023a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x019a -> B:96:0x01a2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B.AbstractC2443g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.v vVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(vVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final Object d(InterfaceC2444h interfaceC2444h, int i10, int i11, int i12, Y0.d dVar, InterfaceC5380e interfaceC5380e) {
        Object objD = interfaceC2444h.d(new a(i10, dVar, interfaceC2444h, i11, i12, null), interfaceC5380e);
        return objD == AbstractC5467b.g() ? objD : Yg.J.f24997a;
    }

    public static final boolean e(InterfaceC2444h interfaceC2444h, int i10) {
        return i10 <= interfaceC2444h.c() && interfaceC2444h.g() <= i10;
    }
}
