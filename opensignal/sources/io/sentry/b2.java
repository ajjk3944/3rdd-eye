package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b2 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12070a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12071d;

    public b2(Reader reader) {
        this.f12071d = new io.sentry.vendor.gson.stream.a(reader);
    }

    public final double G() throws IOException {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).Y();
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return ((Number) objV0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    public final Double L() throws IOException {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Double.valueOf(aVar.Y());
                }
                aVar.o0();
                return null;
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return Double.valueOf(((Number) objV0).doubleValue());
                }
                return null;
        }
    }

    public final float R() throws IOException {
        switch (this.f12070a) {
            case 0:
                return (float) ((io.sentry.vendor.gson.stream.a) this.f12071d).Y();
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return ((Number) objV0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    public final Float V() throws IOException {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Float.valueOf(R());
                }
                aVar.o0();
                return null;
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return Float.valueOf(((Number) objV0).floatValue());
                }
                return null;
        }
    }

    public final int Y() throws IOException {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).Z();
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return ((Number) objV0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    public final Integer Z() throws IOException {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Integer.valueOf(aVar.Z());
                }
                aVar.o0();
                return null;
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return Integer.valueOf(((Number) objV0).intValue());
                }
                return null;
        }
    }

    public final void b() throws IOException {
        switch (this.f12070a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f12071d).b();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof List)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
                List list = (List) value;
                for (int size = list.size() - 1; size >= 0; size--) {
                    arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
                }
                return;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12070a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f12071d).close();
                break;
            default:
                ((ArrayDeque) this.f12071d).clear();
                break;
        }
    }

    public final void f() throws IOException {
        switch (this.f12070a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f12071d).f();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    public final ArrayList f0(u0 u0Var, s1 s1Var) throws IOException {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.o0();
                    return null;
                }
                aVar.b();
                ArrayList arrayList = new ArrayList();
                if (aVar.G()) {
                    do {
                        try {
                            arrayList.add(s1Var.a(this, u0Var));
                        } catch (Exception e4) {
                            u0Var.g(b5.WARNING, "Failed to deserialize object in list.", e4);
                        }
                    } while (aVar.s0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                }
                aVar.q();
                return arrayList;
            default:
                if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
                    if (v0() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + w0());
                }
                try {
                    b();
                    ArrayList arrayList2 = new ArrayList();
                    if (q()) {
                        do {
                            try {
                                arrayList2.add(s1Var.a(this, u0Var));
                            } catch (Exception e10) {
                                u0Var.g(b5.WARNING, "Failed to deserialize object in list.", e10);
                            }
                        } while (w0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                    }
                    h();
                    return arrayList2;
                } catch (Exception e11) {
                    throw new IOException(e11);
                }
        }
    }

    public final void h() {
        switch (this.f12070a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f12071d).q();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                    break;
                }
                break;
        }
    }

    public final void i() {
        switch (this.f12070a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f12071d).w();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                    break;
                }
                break;
        }
    }

    public final long i0() throws IOException {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).f0();
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return ((Number) objV0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    public final Long n0() throws IOException {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Long.valueOf(aVar.f0());
                }
                aVar.o0();
                return null;
            default:
                Object objV0 = v0();
                if (objV0 instanceof Number) {
                    return Long.valueOf(((Number) objV0).longValue());
                }
                return null;
        }
    }

    public final HashMap o0(u0 u0Var, s1 s1Var) throws IOException {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.o0();
                    return null;
                }
                aVar.f();
                HashMap map = new HashMap();
                if (aVar.G()) {
                    while (true) {
                        try {
                            map.put(aVar.i0(), s1Var.a(this, u0Var));
                        } catch (Exception e4) {
                            u0Var.g(b5.WARNING, "Failed to deserialize object in map.", e4);
                        }
                        if (aVar.s0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                    }
                }
                aVar.w();
                return map;
            default:
                if (w0() == io.sentry.vendor.gson.stream.b.NULL) {
                    if (v0() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + w0());
                }
                try {
                    f();
                    HashMap map2 = new HashMap();
                    if (q()) {
                        while (true) {
                            try {
                                map2.put(p0(), s1Var.a(this, u0Var));
                            } catch (Exception e10) {
                                u0Var.g(b5.WARNING, "Failed to deserialize object in map.", e10);
                            }
                            if (w0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || w0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                        }
                    }
                    i();
                    return map2;
                } catch (Exception e11) {
                    throw new IOException(e11);
                }
        }
    }

    public final String p0() throws IOException {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).i0();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.f12071d).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + w0());
        }
    }

    public final boolean q() {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).G();
            default:
                return !((ArrayDeque) this.f12071d).isEmpty();
        }
    }

    public final Object q0() {
        switch (this.f12070a) {
            case 0:
                br.a0 a0Var = new br.a0(1, false);
                a0Var.h(this);
                w1 w1VarD = a0Var.d();
                if (w1VarD != null) {
                    return w1VarD.getValue();
                }
                return null;
            default:
                return v0();
        }
    }

    public final Object r0(u0 u0Var, s1 s1Var) {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return s1Var.a(this, u0Var);
                }
                aVar.o0();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (u0Var != null) {
                    return s1Var.a(this, u0Var);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    public final String s0() throws IOException {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).q0();
            default:
                String str = (String) v0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    public final String t0() {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return aVar.q0();
                }
                aVar.o0();
                return null;
            default:
                return (String) v0();
        }
    }

    public final void u0(u0 u0Var, AbstractMap abstractMap, String str) {
        switch (this.f12070a) {
            case 0:
                try {
                    abstractMap.put(str, q0());
                    break;
                } catch (Exception e4) {
                    u0Var.f(b5.ERROR, e4, "Error deserializing unknown key: %s", str);
                    return;
                }
            default:
                try {
                    abstractMap.put(str, v0());
                    break;
                } catch (Exception e10) {
                    u0Var.f(b5.ERROR, e10, "Error deserializing unknown key: %s", str);
                }
        }
    }

    public Object v0() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e4) {
            throw new IOException(e4);
        }
    }

    public final Boolean w() {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Boolean.valueOf(aVar.V());
                }
                aVar.o0();
                return null;
            default:
                return (Boolean) v0();
        }
    }

    public final io.sentry.vendor.gson.stream.b w0() {
        switch (this.f12070a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.f12071d).s0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f12071d;
                if (arrayDeque.isEmpty()) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return io.sentry.vendor.gson.stream.b.NAME;
                }
                Object value = entry.getValue();
                return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
    }

    public final void x0(boolean z10) {
        switch (this.f12070a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.f12071d).f12839d = z10;
                break;
        }
    }

    public final Date y(u0 u0Var) {
        switch (this.f12070a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.f12071d;
                if (aVar.s0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.o0();
                    break;
                } else {
                    String strQ0 = aVar.q0();
                    if (strQ0 != null) {
                        try {
                            try {
                                break;
                            } catch (Exception e4) {
                                u0Var.g(b5.ERROR, "Error when deserializing millis timestamp format.", e4);
                                return null;
                            }
                        } catch (Exception unused) {
                            return dr.a.t(strQ0);
                        }
                    }
                }
                break;
            default:
                String str = (String) v0();
                if (str != null) {
                    try {
                        try {
                            break;
                        } catch (Exception unused2) {
                            return dr.a.t(str);
                        }
                    } catch (Exception e10) {
                        u0Var.g(b5.ERROR, "Error when deserializing millis timestamp format.", e10);
                        return null;
                    }
                }
                break;
        }
        return null;
    }

    public b2(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12071d = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private final void z0() {
    }

    private final void y0(boolean z10) {
    }
}
