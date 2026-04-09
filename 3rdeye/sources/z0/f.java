package Z0;

import Z0.e;
import androidx.datastore.preferences.protobuf.AbstractC1744w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.d0;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class f extends AbstractC1744w<f, a> implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y<f> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* compiled from: PreferencesProto.java */
    public static final class a extends AbstractC1744w.a<f, a> implements Q {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i) {
            this.value = i;
        }

        public static b forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1744w.j(f.class, fVar);
    }

    public static a B() {
        f fVar = DEFAULT_INSTANCE;
        fVar.getClass();
        return (a) ((AbstractC1744w.a) fVar.f(AbstractC1744w.f.NEW_BUILDER));
    }

    public static void k(f fVar, long j4) {
        fVar.valueCase_ = 4;
        fVar.value_ = Long.valueOf(j4);
    }

    public static void l(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.valueCase_ = 5;
        fVar.value_ = str;
    }

    public static void m(f fVar, e.a aVar) {
        fVar.getClass();
        fVar.value_ = aVar.d();
        fVar.valueCase_ = 6;
    }

    public static void n(f fVar, double d10) {
        fVar.valueCase_ = 7;
        fVar.value_ = Double.valueOf(d10);
    }

    public static void p(f fVar, boolean z10) {
        fVar.valueCase_ = 1;
        fVar.value_ = Boolean.valueOf(z10);
    }

    public static void q(f fVar, float f10) {
        fVar.valueCase_ = 2;
        fVar.value_ = Float.valueOf(f10);
    }

    public static void r(f fVar, int i) {
        fVar.valueCase_ = 3;
        fVar.value_ = Integer.valueOf(i);
    }

    public static f t() {
        return DEFAULT_INSTANCE;
    }

    public final b A() {
        return b.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1744w
    public final Object f(AbstractC1744w.f fVar) {
        Y bVar;
        switch (c.f13988a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a();
            case 3:
                return new d0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<f> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (f.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1744w.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean s() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double u() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float v() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int w() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long x() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String y() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final e z() {
        return this.valueCase_ == 6 ? (e) this.value_ : e.m();
    }
}
