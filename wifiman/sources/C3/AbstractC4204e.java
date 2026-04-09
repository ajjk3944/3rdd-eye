package c3;

import android.content.Context;
import c3.AbstractC4221v;
import d3.C5296j;
import d3.C5298l;
import e3.AbstractC5419d;
import e3.C5416a;
import e3.C5418c;
import e3.InterfaceC5417b;
import i3.C6068d;
import i3.C6071g;
import i3.C6073i;
import k3.C6373g;
import k3.C6374h;
import k3.C6375i;
import k3.C6376j;
import k3.InterfaceC6370d;
import k3.N;
import k3.X;
import m3.C6758c;
import m3.C6759d;

/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4204e {

    /* renamed from: c3.e$b */
    private static final class b implements AbstractC4221v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f33795a;

        private b() {
        }

        @Override // c3.AbstractC4221v.a
        public AbstractC4221v a() {
            AbstractC5419d.a(this.f33795a, Context.class);
            return new c(this.f33795a);
        }

        @Override // c3.AbstractC4221v.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f33795a = (Context) AbstractC5419d.b(context);
            return this;
        }
    }

    /* renamed from: c3.e$c */
    private static final class c extends AbstractC4221v {

        /* renamed from: a, reason: collision with root package name */
        private final c f33796a;

        /* renamed from: b, reason: collision with root package name */
        private Jg.a f33797b;

        /* renamed from: c, reason: collision with root package name */
        private Jg.a f33798c;

        /* renamed from: d, reason: collision with root package name */
        private Jg.a f33799d;

        /* renamed from: e, reason: collision with root package name */
        private Jg.a f33800e;

        /* renamed from: f, reason: collision with root package name */
        private Jg.a f33801f;

        /* renamed from: g, reason: collision with root package name */
        private Jg.a f33802g;

        /* renamed from: h, reason: collision with root package name */
        private Jg.a f33803h;

        /* renamed from: i, reason: collision with root package name */
        private Jg.a f33804i;

        /* renamed from: j, reason: collision with root package name */
        private Jg.a f33805j;

        /* renamed from: k, reason: collision with root package name */
        private Jg.a f33806k;

        /* renamed from: l, reason: collision with root package name */
        private Jg.a f33807l;

        /* renamed from: m, reason: collision with root package name */
        private Jg.a f33808m;

        /* renamed from: n, reason: collision with root package name */
        private Jg.a f33809n;

        private void h(Context context) {
            this.f33797b = C5416a.a(C4210k.a());
            InterfaceC5417b interfaceC5417bA = C5418c.a(context);
            this.f33798c = interfaceC5417bA;
            C5296j c5296jA = C5296j.a(interfaceC5417bA, C6758c.a(), C6759d.a());
            this.f33799d = c5296jA;
            this.f33800e = C5416a.a(C5298l.a(this.f33798c, c5296jA));
            this.f33801f = X.a(this.f33798c, C6373g.a(), C6375i.a());
            this.f33802g = C5416a.a(C6374h.a(this.f33798c));
            this.f33803h = C5416a.a(N.a(C6758c.a(), C6759d.a(), C6376j.a(), this.f33801f, this.f33802g));
            C6071g c6071gB = C6071g.b(C6758c.a());
            this.f33804i = c6071gB;
            C6073i c6073iA = C6073i.a(this.f33798c, this.f33803h, c6071gB, C6759d.a());
            this.f33805j = c6073iA;
            Jg.a aVar = this.f33797b;
            Jg.a aVar2 = this.f33800e;
            Jg.a aVar3 = this.f33803h;
            this.f33806k = C6068d.a(aVar, aVar2, c6073iA, aVar3, aVar3);
            Jg.a aVar4 = this.f33798c;
            Jg.a aVar5 = this.f33800e;
            Jg.a aVar6 = this.f33803h;
            this.f33807l = j3.s.a(aVar4, aVar5, aVar6, this.f33805j, this.f33797b, aVar6, C6758c.a(), C6759d.a(), this.f33803h);
            Jg.a aVar7 = this.f33797b;
            Jg.a aVar8 = this.f33803h;
            this.f33808m = j3.w.a(aVar7, aVar8, this.f33805j, aVar8);
            this.f33809n = C5416a.a(C4222w.a(C6758c.a(), C6759d.a(), this.f33806k, this.f33807l, this.f33808m));
        }

        @Override // c3.AbstractC4221v
        InterfaceC6370d a() {
            return (InterfaceC6370d) this.f33803h.get();
        }

        @Override // c3.AbstractC4221v
        C4220u g() {
            return (C4220u) this.f33809n.get();
        }

        private c(Context context) {
            this.f33796a = this;
            h(context);
        }
    }

    public static AbstractC4221v.a a() {
        return new b();
    }
}
