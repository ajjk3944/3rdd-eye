package kb;

import Zg.U;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6420a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6420a f51349a = new C6420a();

    /* renamed from: kb.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1900a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51350a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.COMMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.GET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f51350a = iArr;
        }
    }

    private C6420a() {
    }

    public static /* synthetic */ j b(C6420a c6420a, int i10, o oVar, String str, String str2, Map map, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i11 & 32) != 0) {
            z10 = false;
        }
        return c6420a.a(i10, oVar, str, str3, map, z10);
    }

    public final j a(int i10, o method, String path, String str, Map headers, boolean z10) {
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(headers, "headers");
        switch (C1900a.f51350a[method.ordinal()]) {
            case 2:
            case 3:
            case 4:
                if (str == null) {
                }
                return c(i10, method, path, "application/json", kotlin.text.t.z(str), headers, z10);
            case 1:
                str = "{}";
                return c(i10, method, path, "application/json", kotlin.text.t.z(str), headers, z10);
            case 5:
            case 6:
                str = "";
                return c(i10, method, path, "application/json", kotlin.text.t.z(str), headers, z10);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final j c(int i10, o method, String path, String str, byte[] bArr, Map headers, boolean z10) {
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(headers, "headers");
        Map mapX = U.x(headers);
        if (bArr != null) {
            mapX.put("Content-Length", aj.k.a(Integer.valueOf(bArr.length)));
        }
        if (str != null) {
            mapX.put("Content-Type", aj.k.b(str));
        }
        f dVar = C1900a.f51350a[method.ordinal()] == 1 ? new CommandHeader(path) : new RequestHeader(path, method.name(), i10, mapX);
        Sj.a.f20830a.a("REQ: %s %s\nheaders: %s", method, path, dVar);
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new j(dVar, bArr, z10);
    }
}
