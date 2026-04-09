package x9;

import kotlin.jvm.internal.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlinx.serialization.b;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.a1;
import kotlinx.serialization.internal.a2;
import kotlinx.serialization.internal.b0;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.c0;
import kotlinx.serialization.internal.d0;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.f2;
import kotlinx.serialization.internal.g0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.h;
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.h1;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.i2;
import kotlinx.serialization.internal.j2;
import kotlinx.serialization.internal.k;
import kotlinx.serialization.internal.l2;
import kotlinx.serialization.internal.m2;
import kotlinx.serialization.internal.o2;
import kotlinx.serialization.internal.p2;
import kotlinx.serialization.internal.q0;
import kotlinx.serialization.internal.q2;
import kotlinx.serialization.internal.r;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.u1;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.z1;
import r9.c;
import t9.b;
import y8.j;
import y8.l;
import y8.n;
import y8.q;
import y8.s;

/* loaded from: classes4.dex */
public abstract class a {
    public static final b A(v vVar) {
        p.e(vVar, "<this>");
        return a2.f22823a;
    }

    public static final b B(w wVar) {
        p.e(wVar, "<this>");
        return b2.f22828a;
    }

    public static final b C(b.a aVar) {
        p.e(aVar, "<this>");
        return d0.f22837a;
    }

    public static final kotlinx.serialization.b D(j.a aVar) {
        p.e(aVar, "<this>");
        return g2.f22859a;
    }

    public static final kotlinx.serialization.b E(l.a aVar) {
        p.e(aVar, "<this>");
        return j2.f22874a;
    }

    public static final kotlinx.serialization.b F(n.a aVar) {
        p.e(aVar, "<this>");
        return m2.f22886a;
    }

    public static final kotlinx.serialization.b G(q.a aVar) {
        p.e(aVar, "<this>");
        return p2.f22899a;
    }

    public static final kotlinx.serialization.b H(s sVar) {
        p.e(sVar, "<this>");
        return q2.f22904b;
    }

    public static final kotlinx.serialization.b a(c kClass, kotlinx.serialization.b elementSerializer) {
        p.e(kClass, "kClass");
        p.e(elementSerializer, "elementSerializer");
        return new u1(kClass, elementSerializer);
    }

    public static final kotlinx.serialization.b b() {
        return h.f22861c;
    }

    public static final kotlinx.serialization.b c() {
        return k.f22876c;
    }

    public static final kotlinx.serialization.b d() {
        return kotlinx.serialization.internal.q.f22901c;
    }

    public static final kotlinx.serialization.b e() {
        return b0.f22825c;
    }

    public static final kotlinx.serialization.b f() {
        return g0.f22856c;
    }

    public static final kotlinx.serialization.b g() {
        return q0.f22902c;
    }

    public static final kotlinx.serialization.b h(kotlinx.serialization.b elementSerializer) {
        p.e(elementSerializer, "elementSerializer");
        return new f(elementSerializer);
    }

    public static final kotlinx.serialization.b i() {
        return a1.f22822c;
    }

    public static final kotlinx.serialization.b j(kotlinx.serialization.b keySerializer, kotlinx.serialization.b valueSerializer) {
        p.e(keySerializer, "keySerializer");
        p.e(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    public static final kotlinx.serialization.b k(kotlinx.serialization.b keySerializer, kotlinx.serialization.b valueSerializer) {
        p.e(keySerializer, "keySerializer");
        p.e(valueSerializer, "valueSerializer");
        return new v0(keySerializer, valueSerializer);
    }

    public static final kotlinx.serialization.b l(kotlinx.serialization.b keySerializer, kotlinx.serialization.b valueSerializer) {
        p.e(keySerializer, "keySerializer");
        p.e(valueSerializer, "valueSerializer");
        return new PairSerializer(keySerializer, valueSerializer);
    }

    public static final kotlinx.serialization.b m() {
        return z1.f22939c;
    }

    public static final kotlinx.serialization.b n(kotlinx.serialization.b aSerializer, kotlinx.serialization.b bSerializer, kotlinx.serialization.b cSerializer) {
        p.e(aSerializer, "aSerializer");
        p.e(bSerializer, "bSerializer");
        p.e(cSerializer, "cSerializer");
        return new TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    public static final kotlinx.serialization.b o() {
        return f2.f22853c;
    }

    public static final kotlinx.serialization.b p() {
        return i2.f22871c;
    }

    public static final kotlinx.serialization.b q() {
        return l2.f22883c;
    }

    public static final kotlinx.serialization.b r() {
        return o2.f22894c;
    }

    public static final kotlinx.serialization.b s(kotlinx.serialization.b bVar) {
        p.e(bVar, "<this>");
        return bVar.getDescriptor().b() ? bVar : new h1(bVar);
    }

    public static final kotlinx.serialization.b t(kotlin.jvm.internal.c cVar) {
        p.e(cVar, "<this>");
        return i.f22868a;
    }

    public static final kotlinx.serialization.b u(d dVar) {
        p.e(dVar, "<this>");
        return kotlinx.serialization.internal.l.f22880a;
    }

    public static final kotlinx.serialization.b v(e eVar) {
        p.e(eVar, "<this>");
        return r.f22906a;
    }

    public static final kotlinx.serialization.b w(kotlin.jvm.internal.j jVar) {
        p.e(jVar, "<this>");
        return c0.f22830a;
    }

    public static final kotlinx.serialization.b x(kotlin.jvm.internal.k kVar) {
        p.e(kVar, "<this>");
        return h0.f22862a;
    }

    public static final kotlinx.serialization.b y(o oVar) {
        p.e(oVar, "<this>");
        return r0.f22908a;
    }

    public static final kotlinx.serialization.b z(kotlin.jvm.internal.r rVar) {
        p.e(rVar, "<this>");
        return b1.f22826a;
    }
}
