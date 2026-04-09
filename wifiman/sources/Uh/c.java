package Uh;

import Uh.q;
import Uh.t;
import Uh.w;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes4.dex */
public final class c extends h.d implements kotlin.reflect.jvm.internal.impl.protobuf.o {

    /* renamed from: N, reason: collision with root package name */
    private static final c f22523N;

    /* renamed from: X, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.p f22524X = new a();

    /* renamed from: A, reason: collision with root package name */
    private List f22525A;

    /* renamed from: B, reason: collision with root package name */
    private int f22526B;

    /* renamed from: C, reason: collision with root package name */
    private List f22527C;

    /* renamed from: D, reason: collision with root package name */
    private List f22528D;

    /* renamed from: E, reason: collision with root package name */
    private int f22529E;

    /* renamed from: F, reason: collision with root package name */
    private t f22530F;

    /* renamed from: G, reason: collision with root package name */
    private List f22531G;

    /* renamed from: H, reason: collision with root package name */
    private w f22532H;

    /* renamed from: I, reason: collision with root package name */
    private byte f22533I;

    /* renamed from: J, reason: collision with root package name */
    private int f22534J;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f22535c;

    /* renamed from: d, reason: collision with root package name */
    private int f22536d;

    /* renamed from: e, reason: collision with root package name */
    private int f22537e;

    /* renamed from: f, reason: collision with root package name */
    private int f22538f;

    /* renamed from: g, reason: collision with root package name */
    private int f22539g;

    /* renamed from: h, reason: collision with root package name */
    private List f22540h;

    /* renamed from: i, reason: collision with root package name */
    private List f22541i;

    /* renamed from: j, reason: collision with root package name */
    private List f22542j;

    /* renamed from: k, reason: collision with root package name */
    private int f22543k;

    /* renamed from: l, reason: collision with root package name */
    private List f22544l;

    /* renamed from: m, reason: collision with root package name */
    private int f22545m;

    /* renamed from: n, reason: collision with root package name */
    private List f22546n;

    /* renamed from: o, reason: collision with root package name */
    private List f22547o;

    /* renamed from: p, reason: collision with root package name */
    private int f22548p;

    /* renamed from: q, reason: collision with root package name */
    private List f22549q;

    /* renamed from: r, reason: collision with root package name */
    private List f22550r;

    /* renamed from: s, reason: collision with root package name */
    private List f22551s;

    /* renamed from: t, reason: collision with root package name */
    private List f22552t;

    /* renamed from: u, reason: collision with root package name */
    private List f22553u;

    /* renamed from: v, reason: collision with root package name */
    private List f22554v;

    /* renamed from: w, reason: collision with root package name */
    private int f22555w;

    /* renamed from: x, reason: collision with root package name */
    private int f22556x;

    /* renamed from: y, reason: collision with root package name */
    private q f22557y;

    /* renamed from: z, reason: collision with root package name */
    private int f22558z;

    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new c(eVar, fVar);
        }
    }

    public static final class b extends h.c implements kotlin.reflect.jvm.internal.impl.protobuf.o {

        /* renamed from: d, reason: collision with root package name */
        private int f22561d;

        /* renamed from: f, reason: collision with root package name */
        private int f22563f;

        /* renamed from: g, reason: collision with root package name */
        private int f22564g;

        /* renamed from: t, reason: collision with root package name */
        private int f22577t;

        /* renamed from: v, reason: collision with root package name */
        private int f22579v;

        /* renamed from: e, reason: collision with root package name */
        private int f22562e = 6;

        /* renamed from: h, reason: collision with root package name */
        private List f22565h = Collections.emptyList();

        /* renamed from: i, reason: collision with root package name */
        private List f22566i = Collections.emptyList();

        /* renamed from: j, reason: collision with root package name */
        private List f22567j = Collections.emptyList();

        /* renamed from: k, reason: collision with root package name */
        private List f22568k = Collections.emptyList();

        /* renamed from: l, reason: collision with root package name */
        private List f22569l = Collections.emptyList();

        /* renamed from: m, reason: collision with root package name */
        private List f22570m = Collections.emptyList();

        /* renamed from: n, reason: collision with root package name */
        private List f22571n = Collections.emptyList();

        /* renamed from: o, reason: collision with root package name */
        private List f22572o = Collections.emptyList();

        /* renamed from: p, reason: collision with root package name */
        private List f22573p = Collections.emptyList();

        /* renamed from: q, reason: collision with root package name */
        private List f22574q = Collections.emptyList();

        /* renamed from: r, reason: collision with root package name */
        private List f22575r = Collections.emptyList();

        /* renamed from: s, reason: collision with root package name */
        private List f22576s = Collections.emptyList();

        /* renamed from: u, reason: collision with root package name */
        private q f22578u = q.h1();

        /* renamed from: w, reason: collision with root package name */
        private List f22580w = Collections.emptyList();

        /* renamed from: x, reason: collision with root package name */
        private List f22581x = Collections.emptyList();

        /* renamed from: y, reason: collision with root package name */
        private List f22582y = Collections.emptyList();

        /* renamed from: z, reason: collision with root package name */
        private t f22583z = t.P();

        /* renamed from: A, reason: collision with root package name */
        private List f22559A = Collections.emptyList();

        /* renamed from: B, reason: collision with root package name */
        private w f22560B = w.J();

        private b() {
            R();
        }

        private void A() {
            if ((this.f22561d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.f22570m = new ArrayList(this.f22570m);
                this.f22561d |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        private void B() {
            if ((this.f22561d & 128) != 128) {
                this.f22569l = new ArrayList(this.f22569l);
                this.f22561d |= 128;
            }
        }

        private void D() {
            if ((this.f22561d & 8192) != 8192) {
                this.f22575r = new ArrayList(this.f22575r);
                this.f22561d |= 8192;
            }
        }

        private void E() {
            if ((this.f22561d & 1024) != 1024) {
                this.f22572o = new ArrayList(this.f22572o);
                this.f22561d |= 1024;
            }
        }

        private void F() {
            if ((this.f22561d & 262144) != 262144) {
                this.f22580w = new ArrayList(this.f22580w);
                this.f22561d |= 262144;
            }
        }

        private void G() {
            if ((this.f22561d & ImageMetadata.SHADING_MODE) != 1048576) {
                this.f22582y = new ArrayList(this.f22582y);
                this.f22561d |= ImageMetadata.SHADING_MODE;
            }
        }

        private void H() {
            if ((this.f22561d & ImageMetadata.LENS_APERTURE) != 524288) {
                this.f22581x = new ArrayList(this.f22581x);
                this.f22561d |= ImageMetadata.LENS_APERTURE;
            }
        }

        private void I() {
            if ((this.f22561d & 64) != 64) {
                this.f22568k = new ArrayList(this.f22568k);
                this.f22561d |= 64;
            }
        }

        private void K() {
            if ((this.f22561d & 2048) != 2048) {
                this.f22573p = new ArrayList(this.f22573p);
                this.f22561d |= 2048;
            }
        }

        private void L() {
            if ((this.f22561d & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 16384) {
                this.f22576s = new ArrayList(this.f22576s);
                this.f22561d |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
            }
        }

        private void M() {
            if ((this.f22561d & 32) != 32) {
                this.f22567j = new ArrayList(this.f22567j);
                this.f22561d |= 32;
            }
        }

        private void N() {
            if ((this.f22561d & 16) != 16) {
                this.f22566i = new ArrayList(this.f22566i);
                this.f22561d |= 16;
            }
        }

        private void O() {
            if ((this.f22561d & 4096) != 4096) {
                this.f22574q = new ArrayList(this.f22574q);
                this.f22561d |= 4096;
            }
        }

        private void P() {
            if ((this.f22561d & 8) != 8) {
                this.f22565h = new ArrayList(this.f22565h);
                this.f22561d |= 8;
            }
        }

        private void Q() {
            if ((this.f22561d & 4194304) != 4194304) {
                this.f22559A = new ArrayList(this.f22559A);
                this.f22561d |= 4194304;
            }
        }

        private void R() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b x() {
            return new b();
        }

        private void z() {
            if ((this.f22561d & 512) != 512) {
                this.f22571n = new ArrayList(this.f22571n);
                this.f22561d |= 512;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public b f(c cVar) {
            if (cVar == c.I1()) {
                return this;
            }
            if (cVar.v2()) {
                Z(cVar.N1());
            }
            if (cVar.w2()) {
                a0(cVar.O1());
            }
            if (cVar.u2()) {
                Y(cVar.A1());
            }
            if (!cVar.f22540h.isEmpty()) {
                if (this.f22565h.isEmpty()) {
                    this.f22565h = cVar.f22540h;
                    this.f22561d &= -9;
                } else {
                    P();
                    this.f22565h.addAll(cVar.f22540h);
                }
            }
            if (!cVar.f22541i.isEmpty()) {
                if (this.f22566i.isEmpty()) {
                    this.f22566i = cVar.f22541i;
                    this.f22561d &= -17;
                } else {
                    N();
                    this.f22566i.addAll(cVar.f22541i);
                }
            }
            if (!cVar.f22542j.isEmpty()) {
                if (this.f22567j.isEmpty()) {
                    this.f22567j = cVar.f22542j;
                    this.f22561d &= -33;
                } else {
                    M();
                    this.f22567j.addAll(cVar.f22542j);
                }
            }
            if (!cVar.f22544l.isEmpty()) {
                if (this.f22568k.isEmpty()) {
                    this.f22568k = cVar.f22544l;
                    this.f22561d &= -65;
                } else {
                    I();
                    this.f22568k.addAll(cVar.f22544l);
                }
            }
            if (!cVar.f22546n.isEmpty()) {
                if (this.f22569l.isEmpty()) {
                    this.f22569l = cVar.f22546n;
                    this.f22561d &= -129;
                } else {
                    B();
                    this.f22569l.addAll(cVar.f22546n);
                }
            }
            if (!cVar.f22547o.isEmpty()) {
                if (this.f22570m.isEmpty()) {
                    this.f22570m = cVar.f22547o;
                    this.f22561d &= -257;
                } else {
                    A();
                    this.f22570m.addAll(cVar.f22547o);
                }
            }
            if (!cVar.f22549q.isEmpty()) {
                if (this.f22571n.isEmpty()) {
                    this.f22571n = cVar.f22549q;
                    this.f22561d &= -513;
                } else {
                    z();
                    this.f22571n.addAll(cVar.f22549q);
                }
            }
            if (!cVar.f22550r.isEmpty()) {
                if (this.f22572o.isEmpty()) {
                    this.f22572o = cVar.f22550r;
                    this.f22561d &= -1025;
                } else {
                    E();
                    this.f22572o.addAll(cVar.f22550r);
                }
            }
            if (!cVar.f22551s.isEmpty()) {
                if (this.f22573p.isEmpty()) {
                    this.f22573p = cVar.f22551s;
                    this.f22561d &= -2049;
                } else {
                    K();
                    this.f22573p.addAll(cVar.f22551s);
                }
            }
            if (!cVar.f22552t.isEmpty()) {
                if (this.f22574q.isEmpty()) {
                    this.f22574q = cVar.f22552t;
                    this.f22561d &= -4097;
                } else {
                    O();
                    this.f22574q.addAll(cVar.f22552t);
                }
            }
            if (!cVar.f22553u.isEmpty()) {
                if (this.f22575r.isEmpty()) {
                    this.f22575r = cVar.f22553u;
                    this.f22561d &= -8193;
                } else {
                    D();
                    this.f22575r.addAll(cVar.f22553u);
                }
            }
            if (!cVar.f22554v.isEmpty()) {
                if (this.f22576s.isEmpty()) {
                    this.f22576s = cVar.f22554v;
                    this.f22561d &= -16385;
                } else {
                    L();
                    this.f22576s.addAll(cVar.f22554v);
                }
            }
            if (cVar.x2()) {
                c0(cVar.S1());
            }
            if (cVar.y2()) {
                V(cVar.T1());
            }
            if (cVar.z2()) {
                d0(cVar.U1());
            }
            if (!cVar.f22525A.isEmpty()) {
                if (this.f22580w.isEmpty()) {
                    this.f22580w = cVar.f22525A;
                    this.f22561d &= -262145;
                } else {
                    F();
                    this.f22580w.addAll(cVar.f22525A);
                }
            }
            if (!cVar.f22527C.isEmpty()) {
                if (this.f22581x.isEmpty()) {
                    this.f22581x = cVar.f22527C;
                    this.f22561d &= -524289;
                } else {
                    H();
                    this.f22581x.addAll(cVar.f22527C);
                }
            }
            if (!cVar.f22528D.isEmpty()) {
                if (this.f22582y.isEmpty()) {
                    this.f22582y = cVar.f22528D;
                    this.f22561d &= -1048577;
                } else {
                    G();
                    this.f22582y.addAll(cVar.f22528D);
                }
            }
            if (cVar.A2()) {
                W(cVar.r2());
            }
            if (!cVar.f22531G.isEmpty()) {
                if (this.f22559A.isEmpty()) {
                    this.f22559A = cVar.f22531G;
                    this.f22561d &= -4194305;
                } else {
                    Q();
                    this.f22559A.addAll(cVar.f22531G);
                }
            }
            if (cVar.B2()) {
                X(cVar.t2());
            }
            q(cVar);
            i(e().e(cVar.f22535c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Uh.c.b b0(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.p r1 = Uh.c.f22524X     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                Uh.c r3 = (Uh.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.f(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                Uh.c r4 = (Uh.c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.f(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Uh.c.b.b0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):Uh.c$b");
        }

        public b V(q qVar) {
            if ((this.f22561d & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 65536 || this.f22578u == q.h1()) {
                this.f22578u = qVar;
            } else {
                this.f22578u = q.I1(this.f22578u).f(qVar).u();
            }
            this.f22561d |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            return this;
        }

        public b W(t tVar) {
            if ((this.f22561d & 2097152) != 2097152 || this.f22583z == t.P()) {
                this.f22583z = tVar;
            } else {
                this.f22583z = t.G0(this.f22583z).f(tVar).p();
            }
            this.f22561d |= 2097152;
            return this;
        }

        public b X(w wVar) {
            if ((this.f22561d & 8388608) != 8388608 || this.f22560B == w.J()) {
                this.f22560B = wVar;
            } else {
                this.f22560B = w.d0(this.f22560B).f(wVar).p();
            }
            this.f22561d |= 8388608;
            return this;
        }

        public b Y(int i10) {
            this.f22561d |= 4;
            this.f22564g = i10;
            return this;
        }

        public b Z(int i10) {
            this.f22561d |= 1;
            this.f22562e = i10;
            return this;
        }

        public b a0(int i10) {
            this.f22561d |= 2;
            this.f22563f = i10;
            return this;
        }

        public b c0(int i10) {
            this.f22561d |= 32768;
            this.f22577t = i10;
            return this;
        }

        public b d0(int i10) {
            this.f22561d |= 131072;
            this.f22579v = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public c a() {
            c cVarU = u();
            if (cVarU.m()) {
                return cVarU;
            }
            throw a.AbstractC1921a.b(cVarU);
        }

        public c u() {
            c cVar = new c(this);
            int i10 = this.f22561d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            cVar.f22537e = this.f22562e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            cVar.f22538f = this.f22563f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            cVar.f22539g = this.f22564g;
            if ((this.f22561d & 8) == 8) {
                this.f22565h = Collections.unmodifiableList(this.f22565h);
                this.f22561d &= -9;
            }
            cVar.f22540h = this.f22565h;
            if ((this.f22561d & 16) == 16) {
                this.f22566i = Collections.unmodifiableList(this.f22566i);
                this.f22561d &= -17;
            }
            cVar.f22541i = this.f22566i;
            if ((this.f22561d & 32) == 32) {
                this.f22567j = Collections.unmodifiableList(this.f22567j);
                this.f22561d &= -33;
            }
            cVar.f22542j = this.f22567j;
            if ((this.f22561d & 64) == 64) {
                this.f22568k = Collections.unmodifiableList(this.f22568k);
                this.f22561d &= -65;
            }
            cVar.f22544l = this.f22568k;
            if ((this.f22561d & 128) == 128) {
                this.f22569l = Collections.unmodifiableList(this.f22569l);
                this.f22561d &= -129;
            }
            cVar.f22546n = this.f22569l;
            if ((this.f22561d & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.f22570m = Collections.unmodifiableList(this.f22570m);
                this.f22561d &= -257;
            }
            cVar.f22547o = this.f22570m;
            if ((this.f22561d & 512) == 512) {
                this.f22571n = Collections.unmodifiableList(this.f22571n);
                this.f22561d &= -513;
            }
            cVar.f22549q = this.f22571n;
            if ((this.f22561d & 1024) == 1024) {
                this.f22572o = Collections.unmodifiableList(this.f22572o);
                this.f22561d &= -1025;
            }
            cVar.f22550r = this.f22572o;
            if ((this.f22561d & 2048) == 2048) {
                this.f22573p = Collections.unmodifiableList(this.f22573p);
                this.f22561d &= -2049;
            }
            cVar.f22551s = this.f22573p;
            if ((this.f22561d & 4096) == 4096) {
                this.f22574q = Collections.unmodifiableList(this.f22574q);
                this.f22561d &= -4097;
            }
            cVar.f22552t = this.f22574q;
            if ((this.f22561d & 8192) == 8192) {
                this.f22575r = Collections.unmodifiableList(this.f22575r);
                this.f22561d &= -8193;
            }
            cVar.f22553u = this.f22575r;
            if ((this.f22561d & TLSTM.TLS_MAX_FRAGMENT_SIZE) == 16384) {
                this.f22576s = Collections.unmodifiableList(this.f22576s);
                this.f22561d &= -16385;
            }
            cVar.f22554v = this.f22576s;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            cVar.f22556x = this.f22577t;
            if ((i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 65536) {
                i11 |= 16;
            }
            cVar.f22557y = this.f22578u;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            cVar.f22558z = this.f22579v;
            if ((this.f22561d & 262144) == 262144) {
                this.f22580w = Collections.unmodifiableList(this.f22580w);
                this.f22561d &= -262145;
            }
            cVar.f22525A = this.f22580w;
            if ((this.f22561d & ImageMetadata.LENS_APERTURE) == 524288) {
                this.f22581x = Collections.unmodifiableList(this.f22581x);
                this.f22561d &= -524289;
            }
            cVar.f22527C = this.f22581x;
            if ((this.f22561d & ImageMetadata.SHADING_MODE) == 1048576) {
                this.f22582y = Collections.unmodifiableList(this.f22582y);
                this.f22561d &= -1048577;
            }
            cVar.f22528D = this.f22582y;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            cVar.f22530F = this.f22583z;
            if ((this.f22561d & 4194304) == 4194304) {
                this.f22559A = Collections.unmodifiableList(this.f22559A);
                this.f22561d &= -4194305;
            }
            cVar.f22531G = this.f22559A;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            cVar.f22532H = this.f22560B;
            cVar.f22536d = i11;
            return cVar;
        }

        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return x().f(u());
        }
    }

    /* renamed from: Uh.c$c, reason: collision with other inner class name */
    public enum EnumC0834c implements i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static i.b internalValueMap = new a();
        private final int value;

        /* renamed from: Uh.c$c$a */
        static class a implements i.b {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumC0834c a(int i10) {
                return EnumC0834c.valueOf(i10);
            }
        }

        EnumC0834c(int i10, int i11) {
            this.value = i11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int getNumber() {
            return this.value;
        }

        public static EnumC0834c valueOf(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    static {
        c cVar = new c(true);
        f22523N = cVar;
        cVar.C2();
    }

    private void C2() {
        this.f22537e = 6;
        this.f22538f = 0;
        this.f22539g = 0;
        this.f22540h = Collections.emptyList();
        this.f22541i = Collections.emptyList();
        this.f22542j = Collections.emptyList();
        this.f22544l = Collections.emptyList();
        this.f22546n = Collections.emptyList();
        this.f22547o = Collections.emptyList();
        this.f22549q = Collections.emptyList();
        this.f22550r = Collections.emptyList();
        this.f22551s = Collections.emptyList();
        this.f22552t = Collections.emptyList();
        this.f22553u = Collections.emptyList();
        this.f22554v = Collections.emptyList();
        this.f22556x = 0;
        this.f22557y = q.h1();
        this.f22558z = 0;
        this.f22525A = Collections.emptyList();
        this.f22527C = Collections.emptyList();
        this.f22528D = Collections.emptyList();
        this.f22530F = t.P();
        this.f22531G = Collections.emptyList();
        this.f22532H = w.J();
    }

    public static b D2() {
        return b.x();
    }

    public static b E2(c cVar) {
        return D2().f(cVar);
    }

    public static c G2(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return (c) f22524X.a(inputStream, fVar);
    }

    public static c I1() {
        return f22523N;
    }

    public int A1() {
        return this.f22539g;
    }

    public boolean A2() {
        return (this.f22536d & 64) == 64;
    }

    public d B1(int i10) {
        return (d) this.f22549q.get(i10);
    }

    public boolean B2() {
        return (this.f22536d & 128) == 128;
    }

    public int C1() {
        return this.f22549q.size();
    }

    public List D1() {
        return this.f22549q;
    }

    public q E1(int i10) {
        return (q) this.f22546n.get(i10);
    }

    public int F1() {
        return this.f22546n.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: F2, reason: merged with bridge method [inline-methods] */
    public b h() {
        return D2();
    }

    public List G1() {
        return this.f22547o;
    }

    public List H1() {
        return this.f22546n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    /* renamed from: H2, reason: merged with bridge method [inline-methods] */
    public b l() {
        return E2(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public c c() {
        return f22523N;
    }

    public g K1(int i10) {
        return (g) this.f22553u.get(i10);
    }

    public int L1() {
        return this.f22553u.size();
    }

    public List M1() {
        return this.f22553u;
    }

    public int N1() {
        return this.f22537e;
    }

    public int O1() {
        return this.f22538f;
    }

    public i P1(int i10) {
        return (i) this.f22550r.get(i10);
    }

    public int Q1() {
        return this.f22550r.size();
    }

    public List R1() {
        return this.f22550r;
    }

    public int S1() {
        return this.f22556x;
    }

    public q T1() {
        return this.f22557y;
    }

    public int U1() {
        return this.f22558z;
    }

    public int V1() {
        return this.f22525A.size();
    }

    public List W1() {
        return this.f22525A;
    }

    public q X1(int i10) {
        return (q) this.f22527C.get(i10);
    }

    public int Y1() {
        return this.f22527C.size();
    }

    public int Z1() {
        return this.f22528D.size();
    }

    public List a2() {
        return this.f22528D;
    }

    public List b2() {
        return this.f22527C;
    }

    public List c2() {
        return this.f22544l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int d() {
        int i10 = this.f22534J;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f22536d & 1) == 1 ? CodedOutputStream.o(1, this.f22537e) : 0;
        int iP = 0;
        for (int i11 = 0; i11 < this.f22542j.size(); i11++) {
            iP += CodedOutputStream.p(((Integer) this.f22542j.get(i11)).intValue());
        }
        int iR = iO + iP;
        if (!j2().isEmpty()) {
            iR = iR + 1 + CodedOutputStream.p(iP);
        }
        this.f22543k = iP;
        if ((this.f22536d & 2) == 2) {
            iR += CodedOutputStream.o(3, this.f22538f);
        }
        if ((this.f22536d & 4) == 4) {
            iR += CodedOutputStream.o(4, this.f22539g);
        }
        for (int i12 = 0; i12 < this.f22540h.size(); i12++) {
            iR += CodedOutputStream.r(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22540h.get(i12));
        }
        for (int i13 = 0; i13 < this.f22541i.size(); i13++) {
            iR += CodedOutputStream.r(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22541i.get(i13));
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f22544l.size(); i14++) {
            iP2 += CodedOutputStream.p(((Integer) this.f22544l.get(i14)).intValue());
        }
        int iR2 = iR + iP2;
        if (!c2().isEmpty()) {
            iR2 = iR2 + 1 + CodedOutputStream.p(iP2);
        }
        this.f22545m = iP2;
        for (int i15 = 0; i15 < this.f22549q.size(); i15++) {
            iR2 += CodedOutputStream.r(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22549q.get(i15));
        }
        for (int i16 = 0; i16 < this.f22550r.size(); i16++) {
            iR2 += CodedOutputStream.r(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22550r.get(i16));
        }
        for (int i17 = 0; i17 < this.f22551s.size(); i17++) {
            iR2 += CodedOutputStream.r(10, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22551s.get(i17));
        }
        for (int i18 = 0; i18 < this.f22552t.size(); i18++) {
            iR2 += CodedOutputStream.r(11, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22552t.get(i18));
        }
        for (int i19 = 0; i19 < this.f22553u.size(); i19++) {
            iR2 += CodedOutputStream.r(13, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22553u.get(i19));
        }
        int iP3 = 0;
        for (int i20 = 0; i20 < this.f22554v.size(); i20++) {
            iP3 += CodedOutputStream.p(((Integer) this.f22554v.get(i20)).intValue());
        }
        int iR3 = iR2 + iP3;
        if (!g2().isEmpty()) {
            iR3 = iR3 + 2 + CodedOutputStream.p(iP3);
        }
        this.f22555w = iP3;
        if ((this.f22536d & 8) == 8) {
            iR3 += CodedOutputStream.o(17, this.f22556x);
        }
        if ((this.f22536d & 16) == 16) {
            iR3 += CodedOutputStream.r(18, this.f22557y);
        }
        if ((this.f22536d & 32) == 32) {
            iR3 += CodedOutputStream.o(19, this.f22558z);
        }
        for (int i21 = 0; i21 < this.f22546n.size(); i21++) {
            iR3 += CodedOutputStream.r(20, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22546n.get(i21));
        }
        int iP4 = 0;
        for (int i22 = 0; i22 < this.f22547o.size(); i22++) {
            iP4 += CodedOutputStream.p(((Integer) this.f22547o.get(i22)).intValue());
        }
        int iP5 = iR3 + iP4;
        if (!G1().isEmpty()) {
            iP5 = iP5 + 2 + CodedOutputStream.p(iP4);
        }
        this.f22548p = iP4;
        int iP6 = 0;
        for (int i23 = 0; i23 < this.f22525A.size(); i23++) {
            iP6 += CodedOutputStream.p(((Integer) this.f22525A.get(i23)).intValue());
        }
        int iR4 = iP5 + iP6;
        if (!W1().isEmpty()) {
            iR4 = iR4 + 2 + CodedOutputStream.p(iP6);
        }
        this.f22526B = iP6;
        for (int i24 = 0; i24 < this.f22527C.size(); i24++) {
            iR4 += CodedOutputStream.r(23, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22527C.get(i24));
        }
        int iP7 = 0;
        for (int i25 = 0; i25 < this.f22528D.size(); i25++) {
            iP7 += CodedOutputStream.p(((Integer) this.f22528D.get(i25)).intValue());
        }
        int iR5 = iR4 + iP7;
        if (!a2().isEmpty()) {
            iR5 = iR5 + 2 + CodedOutputStream.p(iP7);
        }
        this.f22529E = iP7;
        if ((this.f22536d & 64) == 64) {
            iR5 += CodedOutputStream.r(30, this.f22530F);
        }
        int iP8 = 0;
        for (int i26 = 0; i26 < this.f22531G.size(); i26++) {
            iP8 += CodedOutputStream.p(((Integer) this.f22531G.get(i26)).intValue());
        }
        int size = iR5 + iP8 + (s2().size() * 2);
        if ((this.f22536d & 128) == 128) {
            size += CodedOutputStream.r(32, this.f22532H);
        }
        int iF = size + F() + this.f22535c.size();
        this.f22534J = iF;
        return iF;
    }

    public n d2(int i10) {
        return (n) this.f22551s.get(i10);
    }

    public int e2() {
        return this.f22551s.size();
    }

    public List f2() {
        return this.f22551s;
    }

    public List g2() {
        return this.f22554v;
    }

    public q h2(int i10) {
        return (q) this.f22541i.get(i10);
    }

    public int i2() {
        return this.f22541i.size();
    }

    public List j2() {
        return this.f22542j;
    }

    public List k2() {
        return this.f22541i;
    }

    public r l2(int i10) {
        return (r) this.f22552t.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public final boolean m() {
        byte b10 = this.f22533I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!w2()) {
            this.f22533I = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < p2(); i10++) {
            if (!o2(i10).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < i2(); i11++) {
            if (!h2(i11).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < F1(); i12++) {
            if (!E1(i12).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < C1(); i13++) {
            if (!B1(i13).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < Q1(); i14++) {
            if (!P1(i14).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < e2(); i15++) {
            if (!d2(i15).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < m2(); i16++) {
            if (!l2(i16).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < L1(); i17++) {
            if (!K1(i17).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        if (y2() && !T1().m()) {
            this.f22533I = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < Y1(); i18++) {
            if (!X1(i18).m()) {
                this.f22533I = (byte) 0;
                return false;
            }
        }
        if (A2() && !r2().m()) {
            this.f22533I = (byte) 0;
            return false;
        }
        if (E()) {
            this.f22533I = (byte) 1;
            return true;
        }
        this.f22533I = (byte) 0;
        return false;
    }

    public int m2() {
        return this.f22552t.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public void n(CodedOutputStream codedOutputStream) throws IOException {
        d();
        h.d.a aVarT = T();
        if ((this.f22536d & 1) == 1) {
            codedOutputStream.Z(1, this.f22537e);
        }
        if (j2().size() > 0) {
            codedOutputStream.n0(18);
            codedOutputStream.n0(this.f22543k);
        }
        for (int i10 = 0; i10 < this.f22542j.size(); i10++) {
            codedOutputStream.a0(((Integer) this.f22542j.get(i10)).intValue());
        }
        if ((this.f22536d & 2) == 2) {
            codedOutputStream.Z(3, this.f22538f);
        }
        if ((this.f22536d & 4) == 4) {
            codedOutputStream.Z(4, this.f22539g);
        }
        for (int i11 = 0; i11 < this.f22540h.size(); i11++) {
            codedOutputStream.c0(5, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22540h.get(i11));
        }
        for (int i12 = 0; i12 < this.f22541i.size(); i12++) {
            codedOutputStream.c0(6, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22541i.get(i12));
        }
        if (c2().size() > 0) {
            codedOutputStream.n0(58);
            codedOutputStream.n0(this.f22545m);
        }
        for (int i13 = 0; i13 < this.f22544l.size(); i13++) {
            codedOutputStream.a0(((Integer) this.f22544l.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f22549q.size(); i14++) {
            codedOutputStream.c0(8, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22549q.get(i14));
        }
        for (int i15 = 0; i15 < this.f22550r.size(); i15++) {
            codedOutputStream.c0(9, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22550r.get(i15));
        }
        for (int i16 = 0; i16 < this.f22551s.size(); i16++) {
            codedOutputStream.c0(10, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22551s.get(i16));
        }
        for (int i17 = 0; i17 < this.f22552t.size(); i17++) {
            codedOutputStream.c0(11, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22552t.get(i17));
        }
        for (int i18 = 0; i18 < this.f22553u.size(); i18++) {
            codedOutputStream.c0(13, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22553u.get(i18));
        }
        if (g2().size() > 0) {
            codedOutputStream.n0(130);
            codedOutputStream.n0(this.f22555w);
        }
        for (int i19 = 0; i19 < this.f22554v.size(); i19++) {
            codedOutputStream.a0(((Integer) this.f22554v.get(i19)).intValue());
        }
        if ((this.f22536d & 8) == 8) {
            codedOutputStream.Z(17, this.f22556x);
        }
        if ((this.f22536d & 16) == 16) {
            codedOutputStream.c0(18, this.f22557y);
        }
        if ((this.f22536d & 32) == 32) {
            codedOutputStream.Z(19, this.f22558z);
        }
        for (int i20 = 0; i20 < this.f22546n.size(); i20++) {
            codedOutputStream.c0(20, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22546n.get(i20));
        }
        if (G1().size() > 0) {
            codedOutputStream.n0(170);
            codedOutputStream.n0(this.f22548p);
        }
        for (int i21 = 0; i21 < this.f22547o.size(); i21++) {
            codedOutputStream.a0(((Integer) this.f22547o.get(i21)).intValue());
        }
        if (W1().size() > 0) {
            codedOutputStream.n0(178);
            codedOutputStream.n0(this.f22526B);
        }
        for (int i22 = 0; i22 < this.f22525A.size(); i22++) {
            codedOutputStream.a0(((Integer) this.f22525A.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f22527C.size(); i23++) {
            codedOutputStream.c0(23, (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f22527C.get(i23));
        }
        if (a2().size() > 0) {
            codedOutputStream.n0(194);
            codedOutputStream.n0(this.f22529E);
        }
        for (int i24 = 0; i24 < this.f22528D.size(); i24++) {
            codedOutputStream.a0(((Integer) this.f22528D.get(i24)).intValue());
        }
        if ((this.f22536d & 64) == 64) {
            codedOutputStream.c0(30, this.f22530F);
        }
        for (int i25 = 0; i25 < this.f22531G.size(); i25++) {
            codedOutputStream.Z(31, ((Integer) this.f22531G.get(i25)).intValue());
        }
        if ((this.f22536d & 128) == 128) {
            codedOutputStream.c0(32, this.f22532H);
        }
        aVarT.a(19000, codedOutputStream);
        codedOutputStream.h0(this.f22535c);
    }

    public List n2() {
        return this.f22552t;
    }

    public s o2(int i10) {
        return (s) this.f22540h.get(i10);
    }

    public int p2() {
        return this.f22540h.size();
    }

    public List q2() {
        return this.f22540h;
    }

    public t r2() {
        return this.f22530F;
    }

    public List s2() {
        return this.f22531G;
    }

    public w t2() {
        return this.f22532H;
    }

    public boolean u2() {
        return (this.f22536d & 4) == 4;
    }

    public boolean v2() {
        return (this.f22536d & 1) == 1;
    }

    public boolean w2() {
        return (this.f22536d & 2) == 2;
    }

    public boolean x2() {
        return (this.f22536d & 8) == 8;
    }

    public boolean y2() {
        return (this.f22536d & 16) == 16;
    }

    public boolean z2() {
        return (this.f22536d & 32) == 32;
    }

    private c(h.c cVar) {
        super(cVar);
        this.f22543k = -1;
        this.f22545m = -1;
        this.f22548p = -1;
        this.f22555w = -1;
        this.f22526B = -1;
        this.f22529E = -1;
        this.f22533I = (byte) -1;
        this.f22534J = -1;
        this.f22535c = cVar.e();
    }

    private c(boolean z10) {
        this.f22543k = -1;
        this.f22545m = -1;
        this.f22548p = -1;
        this.f22555w = -1;
        this.f22526B = -1;
        this.f22529E = -1;
        this.f22533I = (byte) -1;
        this.f22534J = -1;
        this.f22535c = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        boolean z10;
        this.f22543k = -1;
        this.f22545m = -1;
        this.f22548p = -1;
        this.f22555w = -1;
        this.f22526B = -1;
        this.f22529E = -1;
        this.f22533I = (byte) -1;
        this.f22534J = -1;
        C2();
        d.b bVarU = kotlin.reflect.jvm.internal.impl.protobuf.d.u();
        CodedOutputStream codedOutputStreamI = CodedOutputStream.I(bVarU, 1);
        boolean z11 = false;
        char c10 = 0;
        while (!z11) {
            try {
                try {
                    int iJ = eVar.J();
                    switch (iJ) {
                        case 0:
                            z10 = true;
                            z11 = true;
                            c10 = c10;
                        case 8:
                            z10 = true;
                            this.f22536d |= 1;
                            this.f22537e = eVar.r();
                            c10 = c10;
                        case 16:
                            int i10 = (c10 == true ? 1 : 0) & 32;
                            char c11 = c10;
                            if (i10 != 32) {
                                this.f22542j = new ArrayList();
                                c11 = (c10 == true ? 1 : 0) | ' ';
                            }
                            this.f22542j.add(Integer.valueOf(eVar.r()));
                            c10 = c11;
                            z10 = true;
                            c10 = c10;
                        case 18:
                            int i11 = eVar.i(eVar.z());
                            int i12 = (c10 == true ? 1 : 0) & 32;
                            char c12 = c10;
                            if (i12 != 32) {
                                c12 = c10;
                                if (eVar.e() > 0) {
                                    this.f22542j = new ArrayList();
                                    c12 = (c10 == true ? 1 : 0) | ' ';
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22542j.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                            c10 = c12;
                            z10 = true;
                            c10 = c10;
                        case 24:
                            this.f22536d |= 2;
                            this.f22538f = eVar.r();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 32:
                            this.f22536d |= 4;
                            this.f22539g = eVar.r();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 42:
                            int i13 = (c10 == true ? 1 : 0) & 8;
                            char c13 = c10;
                            if (i13 != 8) {
                                this.f22540h = new ArrayList();
                                c13 = (c10 == true ? 1 : 0) | '\b';
                            }
                            this.f22540h.add(eVar.t(s.f22857o, fVar));
                            c10 = c13;
                            z10 = true;
                            c10 = c10;
                        case 50:
                            int i14 = (c10 == true ? 1 : 0) & 16;
                            char c14 = c10;
                            if (i14 != 16) {
                                this.f22541i = new ArrayList();
                                c14 = (c10 == true ? 1 : 0) | 16;
                            }
                            this.f22541i.add(eVar.t(q.f22784v, fVar));
                            c10 = c14;
                            z10 = true;
                            c10 = c10;
                        case 56:
                            int i15 = (c10 == true ? 1 : 0) & 64;
                            char c15 = c10;
                            if (i15 != 64) {
                                this.f22544l = new ArrayList();
                                c15 = (c10 == true ? 1 : 0) | '@';
                            }
                            this.f22544l.add(Integer.valueOf(eVar.r()));
                            c10 = c15;
                            z10 = true;
                            c10 = c10;
                        case 58:
                            int i16 = eVar.i(eVar.z());
                            int i17 = (c10 == true ? 1 : 0) & 64;
                            char c16 = c10;
                            if (i17 != 64) {
                                c16 = c10;
                                if (eVar.e() > 0) {
                                    this.f22544l = new ArrayList();
                                    c16 = (c10 == true ? 1 : 0) | '@';
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22544l.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i16);
                            c10 = c16;
                            z10 = true;
                            c10 = c10;
                        case 66:
                            int i18 = (c10 == true ? 1 : 0) & 512;
                            char c17 = c10;
                            if (i18 != 512) {
                                this.f22549q = new ArrayList();
                                c17 = (c10 == true ? 1 : 0) | 512;
                            }
                            this.f22549q.add(eVar.t(d.f22585k, fVar));
                            c10 = c17;
                            z10 = true;
                            c10 = c10;
                        case 74:
                            int i19 = (c10 == true ? 1 : 0) & 1024;
                            char c18 = c10;
                            if (i19 != 1024) {
                                this.f22550r = new ArrayList();
                                c18 = (c10 == true ? 1 : 0) | 1024;
                            }
                            this.f22550r.add(eVar.t(i.f22651w, fVar));
                            c10 = c18;
                            z10 = true;
                            c10 = c10;
                        case 82:
                            int i20 = (c10 == true ? 1 : 0) & 2048;
                            char c19 = c10;
                            if (i20 != 2048) {
                                this.f22551s = new ArrayList();
                                c19 = (c10 == true ? 1 : 0) | 2048;
                            }
                            this.f22551s.add(eVar.t(n.f22719w, fVar));
                            c10 = c19;
                            z10 = true;
                            c10 = c10;
                        case 90:
                            int i21 = (c10 == true ? 1 : 0) & 4096;
                            char c20 = c10;
                            if (i21 != 4096) {
                                this.f22552t = new ArrayList();
                                c20 = (c10 == true ? 1 : 0) | 4096;
                            }
                            this.f22552t.add(eVar.t(r.f22832q, fVar));
                            c10 = c20;
                            z10 = true;
                            c10 = c10;
                        case 106:
                            int i22 = (c10 == true ? 1 : 0) & 8192;
                            char c21 = c10;
                            if (i22 != 8192) {
                                this.f22553u = new ArrayList();
                                c21 = (c10 == true ? 1 : 0) | 8192;
                            }
                            this.f22553u.add(eVar.t(g.f22621i, fVar));
                            c10 = c21;
                            z10 = true;
                            c10 = c10;
                        case 128:
                            int i23 = (c10 == true ? 1 : 0) & TLSTM.TLS_MAX_FRAGMENT_SIZE;
                            char c22 = c10;
                            if (i23 != 16384) {
                                this.f22554v = new ArrayList();
                                c22 = (c10 == true ? 1 : 0) | 16384;
                            }
                            this.f22554v.add(Integer.valueOf(eVar.r()));
                            c10 = c22;
                            z10 = true;
                            c10 = c10;
                        case 130:
                            int i24 = eVar.i(eVar.z());
                            int i25 = (c10 == true ? 1 : 0) & TLSTM.TLS_MAX_FRAGMENT_SIZE;
                            char c23 = c10;
                            if (i25 != 16384) {
                                c23 = c10;
                                if (eVar.e() > 0) {
                                    this.f22554v = new ArrayList();
                                    c23 = (c10 == true ? 1 : 0) | 16384;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22554v.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i24);
                            c10 = c23;
                            z10 = true;
                            c10 = c10;
                        case 136:
                            this.f22536d |= 8;
                            this.f22556x = eVar.r();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 146:
                            q.c cVarK1 = (this.f22536d & 16) == 16 ? this.f22557y.l() : null;
                            q qVar = (q) eVar.t(q.f22784v, fVar);
                            this.f22557y = qVar;
                            if (cVarK1 != null) {
                                cVarK1.f(qVar);
                                this.f22557y = cVarK1.u();
                            }
                            this.f22536d |= 16;
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 152:
                            this.f22536d |= 32;
                            this.f22558z = eVar.r();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case SnmpConstants.DEFAULT_NOTIFICATION_RECEIVER_PORT /* 162 */:
                            int i26 = (c10 == true ? 1 : 0) & 128;
                            char c24 = c10;
                            if (i26 != 128) {
                                this.f22546n = new ArrayList();
                                c24 = (c10 == true ? 1 : 0) | 128;
                            }
                            this.f22546n.add(eVar.t(q.f22784v, fVar));
                            c10 = c24;
                            z10 = true;
                            c10 = c10;
                        case 168:
                            int i27 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            char c25 = c10;
                            if (i27 != 256) {
                                this.f22547o = new ArrayList();
                                c25 = (c10 == true ? 1 : 0) | 256;
                            }
                            this.f22547o.add(Integer.valueOf(eVar.r()));
                            c10 = c25;
                            z10 = true;
                            c10 = c10;
                        case 170:
                            int i28 = eVar.i(eVar.z());
                            int i29 = (c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            char c26 = c10;
                            if (i29 != 256) {
                                c26 = c10;
                                if (eVar.e() > 0) {
                                    this.f22547o = new ArrayList();
                                    c26 = (c10 == true ? 1 : 0) | 256;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22547o.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i28);
                            c10 = c26;
                            z10 = true;
                            c10 = c10;
                        case 176:
                            int i30 = (c10 == true ? 1 : 0) & 262144;
                            char c27 = c10;
                            if (i30 != 262144) {
                                this.f22525A = new ArrayList();
                                c27 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f22525A.add(Integer.valueOf(eVar.r()));
                            c10 = c27;
                            z10 = true;
                            c10 = c10;
                        case 178:
                            int i31 = eVar.i(eVar.z());
                            int i32 = (c10 == true ? 1 : 0) & 262144;
                            char c28 = c10;
                            if (i32 != 262144) {
                                c28 = c10;
                                if (eVar.e() > 0) {
                                    this.f22525A = new ArrayList();
                                    c28 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22525A.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i31);
                            c10 = c28;
                            z10 = true;
                            c10 = c10;
                        case 186:
                            int i33 = (c10 == true ? 1 : 0) & ImageMetadata.LENS_APERTURE;
                            char c29 = c10;
                            if (i33 != 524288) {
                                this.f22527C = new ArrayList();
                                c29 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f22527C.add(eVar.t(q.f22784v, fVar));
                            c10 = c29;
                            z10 = true;
                            c10 = c10;
                        case 192:
                            int i34 = (c10 == true ? 1 : 0) & ImageMetadata.SHADING_MODE;
                            char c30 = c10;
                            if (i34 != 1048576) {
                                this.f22528D = new ArrayList();
                                c30 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f22528D.add(Integer.valueOf(eVar.r()));
                            c10 = c30;
                            z10 = true;
                            c10 = c10;
                        case 194:
                            int i35 = eVar.i(eVar.z());
                            int i36 = (c10 == true ? 1 : 0) & ImageMetadata.SHADING_MODE;
                            char c31 = c10;
                            if (i36 != 1048576) {
                                c31 = c10;
                                if (eVar.e() > 0) {
                                    this.f22528D = new ArrayList();
                                    c31 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22528D.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i35);
                            c10 = c31;
                            z10 = true;
                            c10 = c10;
                        case 242:
                            t.b bVarM0 = (this.f22536d & 64) == 64 ? this.f22530F.l() : null;
                            t tVar = (t) eVar.t(t.f22877i, fVar);
                            this.f22530F = tVar;
                            if (bVarM0 != null) {
                                bVarM0.f(tVar);
                                this.f22530F = bVarM0.p();
                            }
                            this.f22536d |= 64;
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 248:
                            int i37 = (c10 == true ? 1 : 0) & 4194304;
                            char c32 = c10;
                            if (i37 != 4194304) {
                                this.f22531G = new ArrayList();
                                c32 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f22531G.add(Integer.valueOf(eVar.r()));
                            c10 = c32;
                            z10 = true;
                            c10 = c10;
                        case SQLiteDatabase.MAX_SQL_CACHE_SIZE /* 250 */:
                            int i38 = eVar.i(eVar.z());
                            int i39 = (c10 == true ? 1 : 0) & 4194304;
                            char c33 = c10;
                            if (i39 != 4194304) {
                                c33 = c10;
                                if (eVar.e() > 0) {
                                    this.f22531G = new ArrayList();
                                    c33 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f22531G.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i38);
                            c10 = c33;
                            z10 = true;
                            c10 = c10;
                        case 258:
                            w.b bVarQ0 = (this.f22536d & 128) == 128 ? this.f22532H.l() : null;
                            w wVar = (w) eVar.t(w.f22926g, fVar);
                            this.f22532H = wVar;
                            if (bVarQ0 != null) {
                                bVarQ0.f(wVar);
                                this.f22532H = bVarQ0.p();
                            }
                            this.f22536d |= 128;
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        default:
                            c10 = c10;
                            if (!y(eVar, codedOutputStreamI, fVar, iJ)) {
                                z11 = true;
                                c10 = c10;
                            }
                            z10 = true;
                            c10 = c10;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.n(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).n(this);
                }
            } catch (Throwable th2) {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f22542j = Collections.unmodifiableList(this.f22542j);
                }
                if (((c10 == true ? 1 : 0) & 8) == 8) {
                    this.f22540h = Collections.unmodifiableList(this.f22540h);
                }
                if (((c10 == true ? 1 : 0) & 16) == 16) {
                    this.f22541i = Collections.unmodifiableList(this.f22541i);
                }
                if (((c10 == true ? 1 : 0) & 64) == 64) {
                    this.f22544l = Collections.unmodifiableList(this.f22544l);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f22549q = Collections.unmodifiableList(this.f22549q);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f22550r = Collections.unmodifiableList(this.f22550r);
                }
                if (((c10 == true ? 1 : 0) & 2048) == 2048) {
                    this.f22551s = Collections.unmodifiableList(this.f22551s);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f22552t = Collections.unmodifiableList(this.f22552t);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f22553u = Collections.unmodifiableList(this.f22553u);
                }
                if (((c10 == true ? 1 : 0) & TLSTM.TLS_MAX_FRAGMENT_SIZE) == 16384) {
                    this.f22554v = Collections.unmodifiableList(this.f22554v);
                }
                if (((c10 == true ? 1 : 0) & 128) == 128) {
                    this.f22546n = Collections.unmodifiableList(this.f22546n);
                }
                if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f22547o = Collections.unmodifiableList(this.f22547o);
                }
                if (((c10 == true ? 1 : 0) & 262144) == 262144) {
                    this.f22525A = Collections.unmodifiableList(this.f22525A);
                }
                if (((c10 == true ? 1 : 0) & ImageMetadata.LENS_APERTURE) == 524288) {
                    this.f22527C = Collections.unmodifiableList(this.f22527C);
                }
                if (((c10 == true ? 1 : 0) & ImageMetadata.SHADING_MODE) == 1048576) {
                    this.f22528D = Collections.unmodifiableList(this.f22528D);
                }
                if (((c10 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f22531G = Collections.unmodifiableList(this.f22531G);
                }
                try {
                    codedOutputStreamI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f22535c = bVarU.p();
                    throw th3;
                }
                this.f22535c = bVarU.p();
                s();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & 32) == 32) {
            this.f22542j = Collections.unmodifiableList(this.f22542j);
        }
        if (((c10 == true ? 1 : 0) & 8) == 8) {
            this.f22540h = Collections.unmodifiableList(this.f22540h);
        }
        if (((c10 == true ? 1 : 0) & 16) == 16) {
            this.f22541i = Collections.unmodifiableList(this.f22541i);
        }
        if (((c10 == true ? 1 : 0) & 64) == 64) {
            this.f22544l = Collections.unmodifiableList(this.f22544l);
        }
        if (((c10 == true ? 1 : 0) & 512) == 512) {
            this.f22549q = Collections.unmodifiableList(this.f22549q);
        }
        if (((c10 == true ? 1 : 0) & 1024) == 1024) {
            this.f22550r = Collections.unmodifiableList(this.f22550r);
        }
        if (((c10 == true ? 1 : 0) & 2048) == 2048) {
            this.f22551s = Collections.unmodifiableList(this.f22551s);
        }
        if (((c10 == true ? 1 : 0) & 4096) == 4096) {
            this.f22552t = Collections.unmodifiableList(this.f22552t);
        }
        if (((c10 == true ? 1 : 0) & 8192) == 8192) {
            this.f22553u = Collections.unmodifiableList(this.f22553u);
        }
        if (((c10 == true ? 1 : 0) & TLSTM.TLS_MAX_FRAGMENT_SIZE) == 16384) {
            this.f22554v = Collections.unmodifiableList(this.f22554v);
        }
        if (((c10 == true ? 1 : 0) & 128) == 128) {
            this.f22546n = Collections.unmodifiableList(this.f22546n);
        }
        if (((c10 == true ? 1 : 0) & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f22547o = Collections.unmodifiableList(this.f22547o);
        }
        if (((c10 == true ? 1 : 0) & 262144) == 262144) {
            this.f22525A = Collections.unmodifiableList(this.f22525A);
        }
        if (((c10 == true ? 1 : 0) & ImageMetadata.LENS_APERTURE) == 524288) {
            this.f22527C = Collections.unmodifiableList(this.f22527C);
        }
        if (((c10 == true ? 1 : 0) & ImageMetadata.SHADING_MODE) == 1048576) {
            this.f22528D = Collections.unmodifiableList(this.f22528D);
        }
        if (((c10 == true ? 1 : 0) & 4194304) == 4194304) {
            this.f22531G = Collections.unmodifiableList(this.f22531G);
        }
        try {
            codedOutputStreamI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f22535c = bVarU.p();
            throw th4;
        }
        this.f22535c = bVarU.p();
        s();
    }
}
