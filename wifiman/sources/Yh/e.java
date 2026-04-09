package Yh;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e extends Wh.a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f25043h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final e f25044i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f25045j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f25046k;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25047g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        e eVar = new e(2, 0, 0);
        f25044i = eVar;
        f25045j = eVar.m();
        f25046k = new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        AbstractC6492s.i(versionArray, "versionArray");
        this.f25047g = z10;
    }

    private final boolean i(e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean h(e metadataVersionFromLanguageVersion) {
        AbstractC6492s.i(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            e eVar = f25044i;
            if (eVar.a() == 1 && eVar.b() == 8) {
                return true;
            }
        }
        return i(metadataVersionFromLanguageVersion.k(this.f25047g));
    }

    public final boolean j() {
        return this.f25047g;
    }

    public final e k(boolean z10) {
        e eVar = z10 ? f25044i : f25045j;
        return eVar.l(this) ? eVar : this;
    }

    public final e m() {
        return (a() == 1 && b() == 9) ? new e(2, 0, 0) : new e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... numbers) {
        this(numbers, false);
        AbstractC6492s.i(numbers, "numbers");
    }
}
