package j3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import j3.b;
import j3.g;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.zip.GZIPInputStream;

/* compiled from: SVG.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public F f42716a;

    /* renamed from: b, reason: collision with root package name */
    public b.q f42717b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f42718c;

    /* compiled from: SVG.java */
    public static class A extends C5193z {
        @Override // j3.f.C5193z, j3.f.N
        public final String n() {
            return "polygon";
        }
    }

    /* compiled from: SVG.java */
    public static class B extends AbstractC5179l {

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42719o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42720p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42721q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42722r;

        /* renamed from: s, reason: collision with root package name */
        public C5183p f42723s;

        /* renamed from: t, reason: collision with root package name */
        public C5183p f42724t;

        @Override // j3.f.N
        public final String n() {
            return "rect";
        }
    }

    /* compiled from: SVG.java */
    public static class E implements Cloneable {

        /* renamed from: A, reason: collision with root package name */
        public String f42726A;

        /* renamed from: B, reason: collision with root package name */
        public Boolean f42727B;

        /* renamed from: C, reason: collision with root package name */
        public Boolean f42728C;

        /* renamed from: D, reason: collision with root package name */
        public O f42729D;

        /* renamed from: E, reason: collision with root package name */
        public Float f42730E;

        /* renamed from: F, reason: collision with root package name */
        public String f42731F;

        /* renamed from: G, reason: collision with root package name */
        public a f42732G;

        /* renamed from: H, reason: collision with root package name */
        public String f42733H;

        /* renamed from: I, reason: collision with root package name */
        public O f42734I;

        /* renamed from: J, reason: collision with root package name */
        public Float f42735J;

        /* renamed from: K, reason: collision with root package name */
        public O f42736K;

        /* renamed from: L, reason: collision with root package name */
        public Float f42737L;

        /* renamed from: M, reason: collision with root package name */
        public i f42738M;

        /* renamed from: N, reason: collision with root package name */
        public e f42739N;

        /* renamed from: b, reason: collision with root package name */
        public long f42740b = 0;

        /* renamed from: c, reason: collision with root package name */
        public O f42741c;

        /* renamed from: d, reason: collision with root package name */
        public a f42742d;

        /* renamed from: e, reason: collision with root package name */
        public Float f42743e;

        /* renamed from: f, reason: collision with root package name */
        public O f42744f;

        /* renamed from: g, reason: collision with root package name */
        public Float f42745g;

        /* renamed from: h, reason: collision with root package name */
        public C5183p f42746h;
        public c i;

        /* renamed from: j, reason: collision with root package name */
        public d f42747j;

        /* renamed from: k, reason: collision with root package name */
        public Float f42748k;

        /* renamed from: l, reason: collision with root package name */
        public C5183p[] f42749l;

        /* renamed from: m, reason: collision with root package name */
        public C5183p f42750m;

        /* renamed from: n, reason: collision with root package name */
        public Float f42751n;

        /* renamed from: o, reason: collision with root package name */
        public C0474f f42752o;

        /* renamed from: p, reason: collision with root package name */
        public ArrayList f42753p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42754q;

        /* renamed from: r, reason: collision with root package name */
        public Integer f42755r;

        /* renamed from: s, reason: collision with root package name */
        public b f42756s;

        /* renamed from: t, reason: collision with root package name */
        public g f42757t;

        /* renamed from: u, reason: collision with root package name */
        public h f42758u;

        /* renamed from: v, reason: collision with root package name */
        public EnumC0473f f42759v;

        /* renamed from: w, reason: collision with root package name */
        public Boolean f42760w;

        /* renamed from: x, reason: collision with root package name */
        public C5171c f42761x;

        /* renamed from: y, reason: collision with root package name */
        public String f42762y;

        /* renamed from: z, reason: collision with root package name */
        public String f42763z;

        /* compiled from: SVG.java */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* compiled from: SVG.java */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* compiled from: SVG.java */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* compiled from: SVG.java */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* compiled from: SVG.java */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* compiled from: SVG.java */
        /* renamed from: j3.f$E$f, reason: collision with other inner class name */
        public enum EnumC0473f {
            Start,
            Middle,
            End
        }

        /* compiled from: SVG.java */
        public enum g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* compiled from: SVG.java */
        public enum h {
            LTR,
            RTL
        }

        /* compiled from: SVG.java */
        public enum i {
            None,
            NonScalingStroke
        }

        public static E a() {
            E e4 = new E();
            e4.f42740b = -1L;
            C0474f c0474f = C0474f.f42825c;
            e4.f42741c = c0474f;
            a aVar = a.NonZero;
            e4.f42742d = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e4.f42743e = fValueOf;
            e4.f42744f = null;
            e4.f42745g = fValueOf;
            e4.f42746h = new C5183p(1.0f);
            e4.i = c.Butt;
            e4.f42747j = d.Miter;
            e4.f42748k = Float.valueOf(4.0f);
            e4.f42749l = null;
            e4.f42750m = new C5183p(0.0f);
            e4.f42751n = fValueOf;
            e4.f42752o = c0474f;
            e4.f42753p = null;
            e4.f42754q = new C5183p(12.0f, d0.pt);
            e4.f42755r = 400;
            e4.f42756s = b.Normal;
            e4.f42757t = g.None;
            e4.f42758u = h.LTR;
            e4.f42759v = EnumC0473f.Start;
            Boolean bool = Boolean.TRUE;
            e4.f42760w = bool;
            e4.f42761x = null;
            e4.f42762y = null;
            e4.f42763z = null;
            e4.f42726A = null;
            e4.f42727B = bool;
            e4.f42728C = bool;
            e4.f42729D = c0474f;
            e4.f42730E = fValueOf;
            e4.f42731F = null;
            e4.f42732G = aVar;
            e4.f42733H = null;
            e4.f42734I = null;
            e4.f42735J = fValueOf;
            e4.f42736K = null;
            e4.f42737L = fValueOf;
            e4.f42738M = i.None;
            e4.f42739N = e.auto;
            return e4;
        }

        public final Object clone() throws CloneNotSupportedException {
            E e4 = (E) super.clone();
            C5183p[] c5183pArr = this.f42749l;
            if (c5183pArr != null) {
                e4.f42749l = (C5183p[]) c5183pArr.clone();
            }
            return e4;
        }
    }

    /* compiled from: SVG.java */
    public static class F extends R {

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42764p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42765q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42766r;

        /* renamed from: s, reason: collision with root package name */
        public C5183p f42767s;

        @Override // j3.f.N
        public final String n() {
            return "svg";
        }
    }

    /* compiled from: SVG.java */
    public interface G {
        Set<String> c();

        String d();

        void f(HashSet hashSet);

        void g(HashSet hashSet);

        Set<String> getRequiredFeatures();

        void h(String str);

        void i(HashSet hashSet);

        void j(HashSet hashSet);

        Set<String> l();

        Set<String> m();
    }

    /* compiled from: SVG.java */
    public static abstract class I extends K implements G {
        public HashSet i;

        /* renamed from: j, reason: collision with root package name */
        public String f42772j;

        /* renamed from: k, reason: collision with root package name */
        public HashSet f42773k;

        /* renamed from: l, reason: collision with root package name */
        public HashSet f42774l;

        /* renamed from: m, reason: collision with root package name */
        public HashSet f42775m;

        @Override // j3.f.G
        public final Set<String> c() {
            return this.f42773k;
        }

        @Override // j3.f.G
        public final String d() {
            return this.f42772j;
        }

        @Override // j3.f.G
        public final void f(HashSet hashSet) {
            this.i = hashSet;
        }

        @Override // j3.f.G
        public final void g(HashSet hashSet) {
            this.f42775m = hashSet;
        }

        @Override // j3.f.G
        public final Set<String> getRequiredFeatures() {
            return this.i;
        }

        @Override // j3.f.G
        public final void h(String str) {
            this.f42772j = str;
        }

        @Override // j3.f.G
        public final void i(HashSet hashSet) {
            this.f42774l = hashSet;
        }

        @Override // j3.f.G
        public final void j(HashSet hashSet) {
            this.f42773k = hashSet;
        }

        @Override // j3.f.G
        public final Set<String> l() {
            return this.f42774l;
        }

        @Override // j3.f.G
        public final Set<String> m() {
            return this.f42775m;
        }
    }

    /* compiled from: SVG.java */
    public interface J {
        List<N> a();

        void b(N n9) throws h;
    }

    /* compiled from: SVG.java */
    public static abstract class K extends L {

        /* renamed from: h, reason: collision with root package name */
        public C5170b f42776h = null;
    }

    /* compiled from: SVG.java */
    public static abstract class L extends N {

        /* renamed from: c, reason: collision with root package name */
        public String f42777c = null;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f42778d = null;

        /* renamed from: e, reason: collision with root package name */
        public E f42779e = null;

        /* renamed from: f, reason: collision with root package name */
        public E f42780f = null;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f42781g = null;

        public final String toString() {
            return n();
        }
    }

    /* compiled from: SVG.java */
    public static class M extends AbstractC5177j {

        /* renamed from: m, reason: collision with root package name */
        public C5183p f42782m;

        /* renamed from: n, reason: collision with root package name */
        public C5183p f42783n;

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42784o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42785p;

        @Override // j3.f.N
        public final String n() {
            return "linearGradient";
        }
    }

    /* compiled from: SVG.java */
    public static class N {

        /* renamed from: a, reason: collision with root package name */
        public f f42786a;

        /* renamed from: b, reason: collision with root package name */
        public J f42787b;

        public String n() {
            return "";
        }
    }

    /* compiled from: SVG.java */
    public static abstract class O implements Cloneable {
    }

    /* compiled from: SVG.java */
    public static abstract class P extends H {

        /* renamed from: n, reason: collision with root package name */
        public e f42788n = null;
    }

    /* compiled from: SVG.java */
    public static class Q extends AbstractC5177j {

        /* renamed from: m, reason: collision with root package name */
        public C5183p f42789m;

        /* renamed from: n, reason: collision with root package name */
        public C5183p f42790n;

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42791o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42792p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42793q;

        @Override // j3.f.N
        public final String n() {
            return "radialGradient";
        }
    }

    /* compiled from: SVG.java */
    public static abstract class R extends P {

        /* renamed from: o, reason: collision with root package name */
        public C5170b f42794o;
    }

    /* compiled from: SVG.java */
    public static class S extends C5180m {
        @Override // j3.f.C5180m, j3.f.N
        public final String n() {
            return "switch";
        }
    }

    /* compiled from: SVG.java */
    public static class T extends R implements InterfaceC5187t {
        @Override // j3.f.N
        public final String n() {
            return "symbol";
        }
    }

    /* compiled from: SVG.java */
    public static class U extends Y implements X {

        /* renamed from: n, reason: collision with root package name */
        public String f42795n;

        /* renamed from: o, reason: collision with root package name */
        public b0 f42796o;

        @Override // j3.f.X
        public final b0 e() {
            return this.f42796o;
        }

        @Override // j3.f.N
        public final String n() {
            return "tref";
        }
    }

    /* compiled from: SVG.java */
    public static class V extends a0 implements X {

        /* renamed from: r, reason: collision with root package name */
        public b0 f42797r;

        @Override // j3.f.X
        public final b0 e() {
            return this.f42797r;
        }

        @Override // j3.f.N
        public final String n() {
            return "tspan";
        }
    }

    /* compiled from: SVG.java */
    public static class W extends a0 implements b0, InterfaceC5181n {

        /* renamed from: r, reason: collision with root package name */
        public Matrix f42798r;

        @Override // j3.f.InterfaceC5181n
        public final void k(Matrix matrix) {
            this.f42798r = matrix;
        }

        @Override // j3.f.N
        public final String n() {
            return "text";
        }
    }

    /* compiled from: SVG.java */
    public interface X {
        b0 e();
    }

    /* compiled from: SVG.java */
    public static abstract class Y extends H {
        @Override // j3.f.H, j3.f.J
        public final void b(N n9) throws h {
            if (n9 instanceof X) {
                this.i.add(n9);
                return;
            }
            throw new h("Text content elements cannot contain " + n9 + " elements.");
        }
    }

    /* compiled from: SVG.java */
    public static class Z extends Y implements X {

        /* renamed from: n, reason: collision with root package name */
        public String f42799n;

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42800o;

        /* renamed from: p, reason: collision with root package name */
        public b0 f42801p;

        @Override // j3.f.X
        public final b0 e() {
            return this.f42801p;
        }

        @Override // j3.f.N
        public final String n() {
            return "textPath";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$a, reason: case insensitive filesystem */
    public static /* synthetic */ class C5169a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42802a;

        static {
            int[] iArr = new int[d0.values().length];
            f42802a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42802a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42802a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42802a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42802a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42802a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42802a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42802a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42802a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: SVG.java */
    public static abstract class a0 extends Y {

        /* renamed from: n, reason: collision with root package name */
        public ArrayList f42803n;

        /* renamed from: o, reason: collision with root package name */
        public ArrayList f42804o;

        /* renamed from: p, reason: collision with root package name */
        public ArrayList f42805p;

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f42806q;
    }

    /* compiled from: SVG.java */
    public interface b0 {
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$c, reason: case insensitive filesystem */
    public static class C5171c {

        /* renamed from: a, reason: collision with root package name */
        public C5183p f42811a;

        /* renamed from: b, reason: collision with root package name */
        public C5183p f42812b;

        /* renamed from: c, reason: collision with root package name */
        public C5183p f42813c;

        /* renamed from: d, reason: collision with root package name */
        public C5183p f42814d;
    }

    /* compiled from: SVG.java */
    public static class c0 extends N implements X {

        /* renamed from: c, reason: collision with root package name */
        public String f42815c;

        @Override // j3.f.X
        public final b0 e() {
            return null;
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("TextChild: '"), this.f42815c, "'");
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$d, reason: case insensitive filesystem */
    public static class C5172d extends AbstractC5179l {

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42816o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42817p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42818q;

        @Override // j3.f.N
        public final String n() {
            return "circle";
        }
    }

    /* compiled from: SVG.java */
    public enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$e, reason: case insensitive filesystem */
    public static class C5173e extends C5180m implements InterfaceC5187t {

        /* renamed from: o, reason: collision with root package name */
        public Boolean f42819o;

        @Override // j3.f.C5180m, j3.f.N
        public final String n() {
            return "clipPath";
        }
    }

    /* compiled from: SVG.java */
    public static class e0 extends C5180m {

        /* renamed from: o, reason: collision with root package name */
        public String f42820o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42821p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42822q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42823r;

        /* renamed from: s, reason: collision with root package name */
        public C5183p f42824s;

        @Override // j3.f.C5180m, j3.f.N
        public final String n() {
            return "use";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$f, reason: collision with other inner class name */
    public static class C0474f extends O {

        /* renamed from: c, reason: collision with root package name */
        public static final C0474f f42825c = new C0474f(-16777216);

        /* renamed from: d, reason: collision with root package name */
        public static final C0474f f42826d = new C0474f(0);

        /* renamed from: b, reason: collision with root package name */
        public final int f42827b;

        public C0474f(int i) {
            this.f42827b = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.f42827b));
        }
    }

    /* compiled from: SVG.java */
    public static class f0 extends R implements InterfaceC5187t {
        @Override // j3.f.N
        public final String n() {
            return "view";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$g, reason: case insensitive filesystem */
    public static class C5174g extends O {

        /* renamed from: b, reason: collision with root package name */
        public static final C5174g f42828b = new C5174g();
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$h, reason: case insensitive filesystem */
    public static class C5175h extends C5180m implements InterfaceC5187t {
        @Override // j3.f.C5180m, j3.f.N
        public final String n() {
            return "defs";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$i, reason: case insensitive filesystem */
    public static class C5176i extends AbstractC5179l {

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42829o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42830p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42831q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42832r;

        @Override // j3.f.N
        public final String n() {
            return "ellipse";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$j, reason: case insensitive filesystem */
    public static abstract class AbstractC5177j extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f42833h = new ArrayList();
        public Boolean i;

        /* renamed from: j, reason: collision with root package name */
        public Matrix f42834j;

        /* renamed from: k, reason: collision with root package name */
        public EnumC5178k f42835k;

        /* renamed from: l, reason: collision with root package name */
        public String f42836l;

        @Override // j3.f.J
        public final List<N> a() {
            return this.f42833h;
        }

        @Override // j3.f.J
        public final void b(N n9) throws h {
            if (n9 instanceof D) {
                this.f42833h.add(n9);
                return;
            }
            throw new h("Gradient elements cannot contain " + n9 + " elements.");
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$k, reason: case insensitive filesystem */
    public enum EnumC5178k {
        pad,
        reflect,
        repeat
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$l, reason: case insensitive filesystem */
    public static abstract class AbstractC5179l extends I implements InterfaceC5181n {

        /* renamed from: n, reason: collision with root package name */
        public Matrix f42837n;

        public AbstractC5179l() {
            this.i = null;
            this.f42772j = null;
            this.f42773k = null;
            this.f42774l = null;
            this.f42775m = null;
        }

        @Override // j3.f.InterfaceC5181n
        public final void k(Matrix matrix) {
            this.f42837n = matrix;
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$m, reason: case insensitive filesystem */
    public static class C5180m extends H implements InterfaceC5181n {

        /* renamed from: n, reason: collision with root package name */
        public Matrix f42838n;

        @Override // j3.f.InterfaceC5181n
        public final void k(Matrix matrix) {
            this.f42838n = matrix;
        }

        @Override // j3.f.N
        public String n() {
            return "group";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$n, reason: case insensitive filesystem */
    public interface InterfaceC5181n {
        void k(Matrix matrix);
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$o, reason: case insensitive filesystem */
    public static class C5182o extends P implements InterfaceC5181n {

        /* renamed from: o, reason: collision with root package name */
        public String f42839o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42840p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42841q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42842r;

        /* renamed from: s, reason: collision with root package name */
        public C5183p f42843s;

        /* renamed from: t, reason: collision with root package name */
        public Matrix f42844t;

        @Override // j3.f.InterfaceC5181n
        public final void k(Matrix matrix) {
            this.f42844t = matrix;
        }

        @Override // j3.f.N
        public final String n() {
            return "image";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$q, reason: case insensitive filesystem */
    public static class C5184q extends AbstractC5179l {

        /* renamed from: o, reason: collision with root package name */
        public C5183p f42847o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42848p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42849q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42850r;

        @Override // j3.f.N
        public final String n() {
            return "line";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$r, reason: case insensitive filesystem */
    public static class C5185r extends R implements InterfaceC5187t {

        /* renamed from: p, reason: collision with root package name */
        public boolean f42851p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42852q;

        /* renamed from: r, reason: collision with root package name */
        public C5183p f42853r;

        /* renamed from: s, reason: collision with root package name */
        public C5183p f42854s;

        /* renamed from: t, reason: collision with root package name */
        public C5183p f42855t;

        /* renamed from: u, reason: collision with root package name */
        public Float f42856u;

        @Override // j3.f.N
        public final String n() {
            return "marker";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$s, reason: case insensitive filesystem */
    public static class C5186s extends H implements InterfaceC5187t {

        /* renamed from: n, reason: collision with root package name */
        public Boolean f42857n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f42858o;

        /* renamed from: p, reason: collision with root package name */
        public C5183p f42859p;

        /* renamed from: q, reason: collision with root package name */
        public C5183p f42860q;

        @Override // j3.f.N
        public final String n() {
            return "mask";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$t, reason: case insensitive filesystem */
    public interface InterfaceC5187t {
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$u, reason: case insensitive filesystem */
    public static class C5188u extends O {

        /* renamed from: b, reason: collision with root package name */
        public final String f42861b;

        /* renamed from: c, reason: collision with root package name */
        public final O f42862c;

        public C5188u(String str, O o10) {
            this.f42861b = str;
            this.f42862c = o10;
        }

        public final String toString() {
            return this.f42861b + " " + this.f42862c;
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$v, reason: case insensitive filesystem */
    public static class C5189v extends AbstractC5179l {

        /* renamed from: o, reason: collision with root package name */
        public C5190w f42863o;

        @Override // j3.f.N
        public final String n() {
            return "path";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$w, reason: case insensitive filesystem */
    public static class C5190w implements InterfaceC5191x {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f42864a;

        /* renamed from: b, reason: collision with root package name */
        public int f42865b;

        /* renamed from: c, reason: collision with root package name */
        public float[] f42866c;

        /* renamed from: d, reason: collision with root package name */
        public int f42867d;

        @Override // j3.f.InterfaceC5191x
        public final void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f42866c;
            int i = this.f42867d;
            int i10 = i + 1;
            this.f42867d = i10;
            fArr[i] = f10;
            int i11 = i + 2;
            this.f42867d = i11;
            fArr[i10] = f11;
            int i12 = i + 3;
            this.f42867d = i12;
            fArr[i11] = f12;
            this.f42867d = i + 4;
            fArr[i12] = f13;
        }

        @Override // j3.f.InterfaceC5191x
        public final void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f42866c;
            int i = this.f42867d;
            int i10 = i + 1;
            this.f42867d = i10;
            fArr[i] = f10;
            this.f42867d = i + 2;
            fArr[i10] = f11;
        }

        @Override // j3.f.InterfaceC5191x
        public final void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f42866c;
            int i = this.f42867d;
            int i10 = i + 1;
            this.f42867d = i10;
            fArr[i] = f10;
            int i11 = i + 2;
            this.f42867d = i11;
            fArr[i10] = f11;
            int i12 = i + 3;
            this.f42867d = i12;
            fArr[i11] = f12;
            int i13 = i + 4;
            this.f42867d = i13;
            fArr[i12] = f13;
            int i14 = i + 5;
            this.f42867d = i14;
            fArr[i13] = f14;
            this.f42867d = i + 6;
            fArr[i14] = f15;
        }

        @Override // j3.f.InterfaceC5191x
        public final void close() {
            f((byte) 8);
        }

        @Override // j3.f.InterfaceC5191x
        public final void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f42866c;
            int i = this.f42867d;
            int i10 = i + 1;
            this.f42867d = i10;
            fArr[i] = f10;
            int i11 = i + 2;
            this.f42867d = i11;
            fArr[i10] = f11;
            int i12 = i + 3;
            this.f42867d = i12;
            fArr[i11] = f12;
            int i13 = i + 4;
            this.f42867d = i13;
            fArr[i12] = f13;
            this.f42867d = i + 5;
            fArr[i13] = f14;
        }

        @Override // j3.f.InterfaceC5191x
        public final void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f42866c;
            int i = this.f42867d;
            int i10 = i + 1;
            this.f42867d = i10;
            fArr[i] = f10;
            this.f42867d = i + 2;
            fArr[i10] = f11;
        }

        public final void f(byte b10) {
            int i = this.f42865b;
            byte[] bArr = this.f42864a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f42864a = bArr2;
            }
            byte[] bArr3 = this.f42864a;
            int i10 = this.f42865b;
            this.f42865b = i10 + 1;
            bArr3[i10] = b10;
        }

        public final void g(int i) {
            float[] fArr = this.f42866c;
            if (fArr.length < this.f42867d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f42866c = fArr2;
            }
        }

        public final void h(InterfaceC5191x interfaceC5191x) {
            int i = 0;
            for (int i10 = 0; i10 < this.f42865b; i10++) {
                byte b10 = this.f42864a[i10];
                if (b10 == 0) {
                    float[] fArr = this.f42866c;
                    int i11 = i + 1;
                    float f10 = fArr[i];
                    i += 2;
                    interfaceC5191x.b(f10, fArr[i11]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f42866c;
                    int i12 = i + 1;
                    float f11 = fArr2[i];
                    i += 2;
                    interfaceC5191x.e(f11, fArr2[i12]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f42866c;
                    interfaceC5191x.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f42866c;
                    float f12 = fArr4[i];
                    float f13 = fArr4[i + 1];
                    int i13 = i + 3;
                    float f14 = fArr4[i + 2];
                    i += 4;
                    interfaceC5191x.a(f12, f13, f14, fArr4[i13]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f42866c;
                    interfaceC5191x.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z10, z11, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    interfaceC5191x.close();
                }
            }
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$x, reason: case insensitive filesystem */
    public interface InterfaceC5191x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void e(float f10, float f11);
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$y, reason: case insensitive filesystem */
    public static class C5192y extends R implements InterfaceC5187t {

        /* renamed from: p, reason: collision with root package name */
        public Boolean f42868p;

        /* renamed from: q, reason: collision with root package name */
        public Boolean f42869q;

        /* renamed from: r, reason: collision with root package name */
        public Matrix f42870r;

        /* renamed from: s, reason: collision with root package name */
        public C5183p f42871s;

        /* renamed from: t, reason: collision with root package name */
        public C5183p f42872t;

        /* renamed from: u, reason: collision with root package name */
        public C5183p f42873u;

        /* renamed from: v, reason: collision with root package name */
        public C5183p f42874v;

        /* renamed from: w, reason: collision with root package name */
        public String f42875w;

        @Override // j3.f.N
        public final String n() {
            return "pattern";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$z, reason: case insensitive filesystem */
    public static class C5193z extends AbstractC5179l {

        /* renamed from: o, reason: collision with root package name */
        public float[] f42876o;

        @Override // j3.f.N
        public String n() {
            return "polyline";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static L b(J j4, String str) {
        L lB;
        L l5 = (L) j4;
        if (str.equals(l5.f42777c)) {
            return l5;
        }
        for (Object obj : j4.a()) {
            if (obj instanceof L) {
                L l10 = (L) obj;
                if (str.equals(l10.f42777c)) {
                    return l10;
                }
                if ((obj instanceof J) && (lB = b((J) obj, str)) != null) {
                    return lB;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.BufferedInputStream] */
    public static f c(ByteArrayInputStream byteArrayInputStream) throws h {
        i iVar = new i();
        iVar.f42926a = null;
        iVar.f42927b = null;
        iVar.f42928c = false;
        iVar.f42930e = false;
        iVar.f42931f = null;
        iVar.f42932g = null;
        iVar.f42933h = false;
        iVar.i = null;
        if (!byteArrayInputStream.markSupported()) {
            byteArrayInputStream = new BufferedInputStream(byteArrayInputStream);
        }
        try {
            byteArrayInputStream.mark(3);
            int i = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8);
            byteArrayInputStream.reset();
            if (i == 35615) {
                byteArrayInputStream = new BufferedInputStream(new GZIPInputStream(byteArrayInputStream));
            }
        } catch (IOException unused) {
        }
        try {
            byteArrayInputStream.mark(4096);
            iVar.B(byteArrayInputStream);
            return iVar.f42926a;
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final C5170b a() {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fD;
        d0 d0Var5;
        F f10 = this.f42716a;
        C5183p c5183p = f10.f42766r;
        C5183p c5183p2 = f10.f42767s;
        if (c5183p == null || c5183p.h() || (d0Var2 = c5183p.f42846c) == (d0Var = d0.percent) || d0Var2 == (d0Var3 = d0.em) || d0Var2 == (d0Var4 = d0.ex)) {
            return new C5170b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fD2 = c5183p.d();
        if (c5183p2 == null) {
            C5170b c5170b = this.f42716a.f42794o;
            fD = c5170b != null ? (c5170b.f42810d * fD2) / c5170b.f42809c : fD2;
        } else {
            if (c5183p2.h() || (d0Var5 = c5183p2.f42846c) == d0Var || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C5170b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fD = c5183p2.d();
        }
        return new C5170b(0.0f, 0.0f, fD2, fD);
    }

    public final Picture d() {
        d0 d0Var;
        C5183p c5183p;
        F f10 = this.f42716a;
        C5170b c5170b = f10.f42794o;
        C5183p c5183p2 = f10.f42766r;
        if (c5183p2 != null && c5183p2.f42846c != (d0Var = d0.percent) && (c5183p = f10.f42767s) != null && c5183p.f42846c != d0Var) {
            return e((int) Math.ceil(c5183p2.d()), (int) Math.ceil(this.f42716a.f42767s.d()));
        }
        if (c5183p2 != null && c5170b != null) {
            return e((int) Math.ceil(c5183p2.d()), (int) Math.ceil((c5170b.f42810d * r0) / c5170b.f42809c));
        }
        C5183p c5183p3 = f10.f42767s;
        if (c5183p3 == null || c5170b == null) {
            return e(AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH);
        }
        return e((int) Math.ceil((c5170b.f42809c * r0) / c5170b.f42810d), (int) Math.ceil(c5183p3.d()));
    }

    public final Picture e(int i, int i10) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i10);
        C5170b c5170b = new C5170b(0.0f, 0.0f, i, i10);
        g gVar = new g();
        gVar.f42878a = canvasBeginRecording;
        gVar.f42879b = this;
        F f10 = this.f42716a;
        if (f10 == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
        } else {
            C5170b c5170b2 = f10.f42794o;
            e eVar = f10.f42788n;
            gVar.f42880c = new g.h();
            gVar.f42881d = new Stack<>();
            gVar.S(gVar.f42880c, E.a());
            g.h hVar = gVar.f42880c;
            hVar.f42917f = null;
            hVar.f42919h = false;
            gVar.f42881d.push(new g.h(hVar));
            gVar.f42883f = new Stack<>();
            gVar.f42882e = new Stack<>();
            Boolean bool = f10.f42778d;
            if (bool != null) {
                gVar.f42880c.f42919h = bool.booleanValue();
            }
            gVar.P();
            C5170b c5170b3 = new C5170b(c5170b);
            C5183p c5183p = f10.f42766r;
            if (c5183p != null) {
                c5170b3.f42809c = c5183p.b(gVar, c5170b3.f42809c);
            }
            C5183p c5183p2 = f10.f42767s;
            if (c5183p2 != null) {
                c5170b3.f42810d = c5183p2.b(gVar, c5170b3.f42810d);
            }
            gVar.G(f10, c5170b3, c5170b2, eVar);
            gVar.O();
        }
        picture.endRecording();
        return picture;
    }

    public final L f(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
        if (strReplace.length() <= 1 || !strReplace.startsWith("#") || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f42716a.f42777c)) {
            return this.f42716a;
        }
        HashMap map = this.f42718c;
        if (map.containsKey(strSubstring)) {
            return (L) map.get(strSubstring);
        }
        L lB = b(this.f42716a, strSubstring);
        map.put(strSubstring, lB);
        return lB;
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$p, reason: case insensitive filesystem */
    public static class C5183p implements Cloneable {

        /* renamed from: b, reason: collision with root package name */
        public final float f42845b;

        /* renamed from: c, reason: collision with root package name */
        public final d0 f42846c;

        public C5183p(float f10, d0 d0Var) {
            this.f42845b = f10;
            this.f42846c = d0Var;
        }

        public final float a(g gVar) {
            float fSqrt;
            if (this.f42846c != d0.percent) {
                return e(gVar);
            }
            g.h hVar = gVar.f42880c;
            C5170b c5170b = hVar.f42918g;
            if (c5170b == null) {
                c5170b = hVar.f42917f;
            }
            float f10 = this.f42845b;
            if (c5170b == null) {
                return f10;
            }
            float f11 = c5170b.f42809c;
            if (f11 == c5170b.f42810d) {
                fSqrt = f10 * f11;
            } else {
                fSqrt = f10 * ((float) (Math.sqrt((r0 * r0) + (f11 * f11)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public final float b(g gVar, float f10) {
            return this.f42846c == d0.percent ? (this.f42845b * f10) / 100.0f : e(gVar);
        }

        public final float d() {
            float f10;
            float f11;
            int i = C5169a.f42802a[this.f42846c.ordinal()];
            float f12 = this.f42845b;
            if (i == 1) {
                return f12;
            }
            switch (i) {
                case 4:
                    return f12 * 96.0f;
                case 5:
                    f10 = f12 * 96.0f;
                    f11 = 2.54f;
                    break;
                case 6:
                    f10 = f12 * 96.0f;
                    f11 = 25.4f;
                    break;
                case 7:
                    f10 = f12 * 96.0f;
                    f11 = 72.0f;
                    break;
                case 8:
                    f10 = f12 * 96.0f;
                    f11 = 6.0f;
                    break;
                default:
                    return f12;
            }
            return f10 / f11;
        }

        public final float e(g gVar) {
            float f10;
            float f11;
            int i = C5169a.f42802a[this.f42846c.ordinal()];
            float f12 = this.f42845b;
            switch (i) {
                case 2:
                    return gVar.f42880c.f42915d.getTextSize() * f12;
                case 3:
                    return (gVar.f42880c.f42915d.getTextSize() / 2.0f) * f12;
                case 4:
                    gVar.getClass();
                    return f12 * 96.0f;
                case 5:
                    gVar.getClass();
                    f10 = f12 * 96.0f;
                    f11 = 2.54f;
                    break;
                case 6:
                    gVar.getClass();
                    f10 = f12 * 96.0f;
                    f11 = 25.4f;
                    break;
                case 7:
                    gVar.getClass();
                    f10 = f12 * 96.0f;
                    f11 = 72.0f;
                    break;
                case 8:
                    gVar.getClass();
                    f10 = f12 * 96.0f;
                    f11 = 6.0f;
                    break;
                case 9:
                    g.h hVar = gVar.f42880c;
                    C5170b c5170b = hVar.f42918g;
                    if (c5170b == null) {
                        c5170b = hVar.f42917f;
                    }
                    if (c5170b != null) {
                        f10 = f12 * c5170b.f42809c;
                        f11 = 100.0f;
                        break;
                    }
                default:
                    return f12;
            }
            return f10 / f11;
        }

        public final float f(g gVar) {
            if (this.f42846c != d0.percent) {
                return e(gVar);
            }
            g.h hVar = gVar.f42880c;
            C5170b c5170b = hVar.f42918g;
            if (c5170b == null) {
                c5170b = hVar.f42917f;
            }
            float f10 = this.f42845b;
            return c5170b == null ? f10 : (f10 * c5170b.f42810d) / 100.0f;
        }

        public final boolean g() {
            return this.f42845b < 0.0f;
        }

        public final boolean h() {
            return this.f42845b == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.f42845b) + this.f42846c;
        }

        public C5183p(float f10) {
            this.f42845b = f10;
            this.f42846c = d0.px;
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: j3.f$b, reason: case insensitive filesystem */
    public static class C5170b {

        /* renamed from: a, reason: collision with root package name */
        public float f42807a;

        /* renamed from: b, reason: collision with root package name */
        public float f42808b;

        /* renamed from: c, reason: collision with root package name */
        public float f42809c;

        /* renamed from: d, reason: collision with root package name */
        public float f42810d;

        public C5170b(float f10, float f11, float f12, float f13) {
            this.f42807a = f10;
            this.f42808b = f11;
            this.f42809c = f12;
            this.f42810d = f13;
        }

        public final float a() {
            return this.f42807a + this.f42809c;
        }

        public final float b() {
            return this.f42808b + this.f42810d;
        }

        public final String toString() {
            return "[" + this.f42807a + " " + this.f42808b + " " + this.f42809c + " " + this.f42810d + "]";
        }

        public C5170b(C5170b c5170b) {
            this.f42807a = c5170b.f42807a;
            this.f42808b = c5170b.f42808b;
            this.f42809c = c5170b.f42809c;
            this.f42810d = c5170b.f42810d;
        }
    }

    /* compiled from: SVG.java */
    public static class C extends L implements J {
        @Override // j3.f.J
        public final List<N> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // j3.f.N
        public final String n() {
            return "solidColor";
        }

        @Override // j3.f.J
        public final void b(N n9) {
        }
    }

    /* compiled from: SVG.java */
    public static class D extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        public Float f42725h;

        @Override // j3.f.J
        public final List<N> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // j3.f.N
        public final String n() {
            return "stop";
        }

        @Override // j3.f.J
        public final void b(N n9) {
        }
    }

    /* compiled from: SVG.java */
    public static abstract class H extends K implements J, G {
        public ArrayList i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public HashSet f42768j = null;

        /* renamed from: k, reason: collision with root package name */
        public String f42769k = null;

        /* renamed from: l, reason: collision with root package name */
        public HashSet f42770l = null;

        /* renamed from: m, reason: collision with root package name */
        public HashSet f42771m = null;

        @Override // j3.f.J
        public final List<N> a() {
            return this.i;
        }

        @Override // j3.f.J
        public void b(N n9) throws h {
            this.i.add(n9);
        }

        @Override // j3.f.G
        public final Set<String> c() {
            return null;
        }

        @Override // j3.f.G
        public final String d() {
            return this.f42769k;
        }

        @Override // j3.f.G
        public final void f(HashSet hashSet) {
            this.f42768j = hashSet;
        }

        @Override // j3.f.G
        public final void g(HashSet hashSet) {
            this.f42771m = hashSet;
        }

        @Override // j3.f.G
        public final Set<String> getRequiredFeatures() {
            return this.f42768j;
        }

        @Override // j3.f.G
        public final void h(String str) {
            this.f42769k = str;
        }

        @Override // j3.f.G
        public final void i(HashSet hashSet) {
            this.f42770l = hashSet;
        }

        @Override // j3.f.G
        public final Set<String> l() {
            return this.f42770l;
        }

        @Override // j3.f.G
        public final Set<String> m() {
            return this.f42771m;
        }

        @Override // j3.f.G
        public final void j(HashSet hashSet) {
        }
    }
}
