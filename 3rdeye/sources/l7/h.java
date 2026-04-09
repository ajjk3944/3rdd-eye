package l7;

import android.net.Uri;
import d7.C4278a;
import d7.C4280c;
import kotlin.jvm.internal.m;

/* compiled from: ParsingConverters.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final c f43880a = c.f43889g;

    /* renamed from: b, reason: collision with root package name */
    public static final f f43881b = f.f43892g;

    /* renamed from: c, reason: collision with root package name */
    public static final g f43882c = g.f43893g;

    /* renamed from: d, reason: collision with root package name */
    public static final b f43883d = b.f43888g;

    /* renamed from: e, reason: collision with root package name */
    public static final a f43884e = a.f43887g;

    /* renamed from: f, reason: collision with root package name */
    public static final d f43885f = d.f43890g;

    /* renamed from: g, reason: collision with root package name */
    public static final e f43886g = e.f43891g;

    /* compiled from: ParsingConverters.kt */
    public static final class a extends m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f43887g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (value instanceof Boolean) {
                return (Boolean) value;
            }
            if (!(value instanceof Number)) {
                throw new ClassCastException("Received value of wrong type");
            }
            Number number = (Number) value;
            if (number instanceof Double) {
                double dDoubleValue = number.doubleValue();
                if (dDoubleValue == 0.0d) {
                    return Boolean.FALSE;
                }
                if (dDoubleValue == 1.0d) {
                    return Boolean.TRUE;
                }
                return null;
            }
            int iIntValue = number.intValue();
            if (iIntValue == 0) {
                return Boolean.FALSE;
            }
            if (iIntValue != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: ParsingConverters.kt */
    public static final class b extends m implements p9.l<Object, Uri> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f43888g = new b(1);

        @Override // p9.l
        public final Uri invoke(Object value) {
            kotlin.jvm.internal.l.f(value, "value");
            if (value instanceof String) {
                Uri uri = Uri.parse((String) value);
                kotlin.jvm.internal.l.e(uri, "parse(value)");
                return uri;
            }
            if (!(value instanceof C4280c)) {
                throw new ClassCastException("Received value of wrong type");
            }
            Uri uri2 = Uri.parse(((C4280c) value).f37533a);
            kotlin.jvm.internal.l.e(uri2, "parse(value.value)");
            return uri2;
        }
    }

    /* compiled from: ParsingConverters.kt */
    public static final class c extends m implements p9.l<Integer, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f43889g = new c(1);

        @Override // p9.l
        public final String invoke(Integer num) {
            return C4278a.a(num.intValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    public static final class d extends m implements p9.l<Number, Double> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f43890g = new d(1);

        @Override // p9.l
        public final Double invoke(Number number) {
            Number n9 = number;
            kotlin.jvm.internal.l.f(n9, "n");
            return Double.valueOf(n9.doubleValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    public static final class e extends m implements p9.l<Number, Long> {

        /* renamed from: g, reason: collision with root package name */
        public static final e f43891g = new e(1);

        @Override // p9.l
        public final Long invoke(Number number) {
            Number n9 = number;
            kotlin.jvm.internal.l.f(n9, "n");
            return Long.valueOf(n9.longValue());
        }
    }

    /* compiled from: ParsingConverters.kt */
    public static final class f extends m implements p9.l<Object, Integer> {

        /* renamed from: g, reason: collision with root package name */
        public static final f f43892g = new f(1);

        @Override // p9.l
        public final Integer invoke(Object obj) {
            if (obj instanceof String) {
                return Integer.valueOf(C4278a.C0440a.a((String) obj));
            }
            if (obj instanceof C4278a) {
                return Integer.valueOf(((C4278a) obj).f37526a);
            }
            if (obj == null) {
                return null;
            }
            throw new ClassCastException("Received value of wrong type");
        }
    }

    /* compiled from: ParsingConverters.kt */
    public static final class g extends m implements p9.l<Uri, String> {

        /* renamed from: g, reason: collision with root package name */
        public static final g f43893g = new g(1);

        @Override // p9.l
        public final String invoke(Uri uri) {
            Uri uri2 = uri;
            kotlin.jvm.internal.l.f(uri2, "uri");
            String string = uri2.toString();
            kotlin.jvm.internal.l.e(string, "uri.toString()");
            return string;
        }
    }
}
