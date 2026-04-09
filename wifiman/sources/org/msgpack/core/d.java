package org.msgpack.core;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f56993a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final b f56994b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f56995c = new c();

    public static final class a {
        public static final boolean a(byte b10) {
            int i10 = b10 & 255;
            return i10 <= 127 || i10 >= 224;
        }

        public static final boolean b(byte b10) {
            return (b10 & (-32)) == -96;
        }

        public static final boolean c(byte b10) {
            return (b10 & (-16)) == -112;
        }

        public static final boolean d(byte b10) {
            return (b10 & (-16)) == -128;
        }

        public static final boolean e(byte b10) {
            return (b10 & (-32)) == -96;
        }

        public static final boolean f(byte b10) {
            return (b10 & (-32)) == -32;
        }

        public static final boolean g(byte b10) {
            return (b10 & (-128)) == 0;
        }
    }

    public static org.msgpack.core.b a() {
        return f56994b.f();
    }

    public static f b(byte[] bArr) {
        return f56995c.l(bArr);
    }

    public static class b implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private int f56996a;

        /* renamed from: b, reason: collision with root package name */
        private int f56997b;

        /* renamed from: c, reason: collision with root package name */
        private int f56998c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56999d;

        public b() {
            this.f56996a = 512;
            this.f56997b = 8192;
            this.f56998c = 8192;
            this.f56999d = true;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return new b(this);
        }

        public int c() {
            return this.f56997b;
        }

        public int d() {
            return this.f56996a;
        }

        public boolean e() {
            return this.f56999d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56996a == bVar.f56996a && this.f56997b == bVar.f56997b && this.f56998c == bVar.f56998c && this.f56999d == bVar.f56999d;
        }

        public org.msgpack.core.b f() {
            return new org.msgpack.core.b(this);
        }

        public int hashCode() {
            return (((((this.f56996a * 31) + this.f56997b) * 31) + this.f56998c) * 31) + (this.f56999d ? 1 : 0);
        }

        private b(b bVar) {
            this.f56996a = 512;
            this.f56997b = 8192;
            this.f56998c = 8192;
            this.f56999d = true;
            this.f56996a = bVar.f56996a;
            this.f56997b = bVar.f56997b;
            this.f56998c = bVar.f56998c;
            this.f56999d = bVar.f56999d;
        }
    }

    public static class c implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f57000a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f57001b;

        /* renamed from: c, reason: collision with root package name */
        private CodingErrorAction f57002c;

        /* renamed from: d, reason: collision with root package name */
        private CodingErrorAction f57003d;

        /* renamed from: e, reason: collision with root package name */
        private int f57004e;

        /* renamed from: f, reason: collision with root package name */
        private int f57005f;

        /* renamed from: g, reason: collision with root package name */
        private int f57006g;

        public c() {
            this.f57000a = true;
            this.f57001b = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f57002c = codingErrorAction;
            this.f57003d = codingErrorAction;
            this.f57004e = MPv3.MAX_MESSAGE_ID;
            this.f57005f = 8192;
            this.f57006g = 8192;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return new c(this);
        }

        public CodingErrorAction c() {
            return this.f57002c;
        }

        public CodingErrorAction d() {
            return this.f57003d;
        }

        public boolean e() {
            return this.f57001b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f57000a == cVar.f57000a && this.f57001b == cVar.f57001b && this.f57002c == cVar.f57002c && this.f57003d == cVar.f57003d && this.f57004e == cVar.f57004e && this.f57006g == cVar.f57006g && this.f57005f == cVar.f57005f;
        }

        public boolean f() {
            return this.f57000a;
        }

        public int h() {
            return this.f57006g;
        }

        public int hashCode() {
            int i10 = (((this.f57000a ? 1 : 0) * 31) + (this.f57001b ? 1 : 0)) * 31;
            CodingErrorAction codingErrorAction = this.f57002c;
            int iHashCode = (i10 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
            CodingErrorAction codingErrorAction2 = this.f57003d;
            return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.f57004e) * 31) + this.f57005f) * 31) + this.f57006g;
        }

        public int i() {
            return this.f57004e;
        }

        public f k(org.msgpack.core.buffer.d dVar) {
            return new f(dVar, this);
        }

        public f l(byte[] bArr) {
            return k(new org.msgpack.core.buffer.a(bArr));
        }

        private c(c cVar) {
            this.f57000a = true;
            this.f57001b = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f57002c = codingErrorAction;
            this.f57003d = codingErrorAction;
            this.f57004e = MPv3.MAX_MESSAGE_ID;
            this.f57005f = 8192;
            this.f57006g = 8192;
            this.f57000a = cVar.f57000a;
            this.f57001b = cVar.f57001b;
            this.f57002c = cVar.f57002c;
            this.f57003d = cVar.f57003d;
            this.f57004e = cVar.f57004e;
            this.f57005f = cVar.f57005f;
        }
    }
}
