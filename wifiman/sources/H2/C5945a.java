package h2;

import Zg.AbstractC3689v;
import f2.AbstractC5496B;
import f2.AbstractC5504c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5945a {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f48396a;

    /* renamed from: b, reason: collision with root package name */
    private final String f48397b;

    /* renamed from: c, reason: collision with root package name */
    private String f48398c;

    /* renamed from: d, reason: collision with root package name */
    private String f48399d;

    /* renamed from: h2.a$a, reason: collision with other inner class name */
    private enum EnumC1788a {
        PATH,
        QUERY
    }

    /* renamed from: h2.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48400a;

        static {
            int[] iArr = new int[EnumC1788a.values().length];
            try {
                iArr[EnumC1788a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1788a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48400a = iArr;
        }
    }

    public C5945a(Vi.b serializer) {
        AbstractC6492s.i(serializer, "serializer");
        this.f48398c = "";
        this.f48399d = "";
        this.f48396a = serializer;
        this.f48397b = serializer.a().a();
    }

    private final void a(String str) {
        this.f48398c += '/' + str;
    }

    private final void b(String str, String str2) {
        this.f48399d += (this.f48399d.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    private final EnumC1788a e(int i10, AbstractC5496B abstractC5496B) {
        return ((abstractC5496B instanceof AbstractC5504c) || this.f48396a.a().j(i10)) ? EnumC1788a.QUERY : EnumC1788a.PATH;
    }

    public final void c(int i10, String name, AbstractC5496B type, List value) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(value, "value");
        int i11 = b.f48400a[e(i10, type).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            Iterator it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) AbstractC3689v.q0(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final String d() {
        return this.f48397b + this.f48398c + this.f48399d;
    }
}
