package b7;

import ej.InterfaceC5482f;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class h implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Byte f32984g = (byte) 34;

    /* renamed from: h, reason: collision with root package name */
    private static final Byte f32985h = (byte) 60;

    /* renamed from: i, reason: collision with root package name */
    private static final Byte f32986i = (byte) 62;

    /* renamed from: j, reason: collision with root package name */
    private static final ej.h f32987j = ej.h.j("</");

    /* renamed from: k, reason: collision with root package name */
    private static final ej.h f32988k = ej.h.j("/>");

    /* renamed from: l, reason: collision with root package name */
    private static final ej.h f32989l = ej.h.j("=\"");

    /* renamed from: m, reason: collision with root package name */
    private static final ej.h f32990m = ej.h.j("<![CDATA[");

    /* renamed from: n, reason: collision with root package name */
    private static final ej.h f32991n = ej.h.j("]]>");

    /* renamed from: o, reason: collision with root package name */
    private static final ej.h f32992o = ej.h.j("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5482f f32993a;

    /* renamed from: c, reason: collision with root package name */
    private int[] f32995c;

    /* renamed from: b, reason: collision with root package name */
    private boolean f32994b = false;

    /* renamed from: e, reason: collision with root package name */
    private String[] f32997e = new String[32];

    /* renamed from: f, reason: collision with root package name */
    private int[] f32998f = new int[32];

    /* renamed from: d, reason: collision with root package name */
    private int f32996d = 1;

    private h(InterfaceC5482f interfaceC5482f) {
        int[] iArr = new int[32];
        this.f32995c = iArr;
        iArr[0] = 0;
        if (interfaceC5482f == null) {
            throw new NullPointerException("sink == null");
        }
        this.f32993a = interfaceC5482f;
    }

    public static h a(InterfaceC5482f interfaceC5482f) {
        return new h(interfaceC5482f);
    }

    private int g() {
        int i10 = this.f32996d;
        if (i10 != 0) {
            return this.f32995c[i10 - 1];
        }
        throw new IllegalStateException("XML Writer is closed.");
    }

    private IOException h(String str) throws IOException {
        throw new IOException(str + " at path " + g.a(this.f32996d, this.f32995c, this.f32997e, this.f32998f));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32993a.close();
        int i10 = this.f32996d;
        if (i10 <= 1 && (i10 != 1 || this.f32995c[i10 - 1] == 1)) {
            this.f32996d = 0;
            return;
        }
        throw new IOException("Incomplete document. Abrupt end at " + g.a(this.f32996d, this.f32995c, this.f32997e, this.f32998f) + " in scope " + g.b(this.f32996d, this.f32995c));
    }

    public h j() throws IOException {
        if (this.f32994b) {
            throw new IOException("Xml declaration " + f32992o.q0() + " has already been written in this xml document. Xml declaration can only be written once at the beginning of the document.");
        }
        if (g() == 0) {
            this.f32993a.R(f32992o);
            this.f32994b = true;
            return this;
        }
        throw h("Xml Declatraion " + f32992o.q0() + " can only be written at the beginning of a xml document! You are not at the beginning of a xml document: current xml scope is " + g.b(this.f32996d, this.f32995c));
    }
}
