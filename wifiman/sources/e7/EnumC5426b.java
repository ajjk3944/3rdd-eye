package e7;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6469f;
import kg.n;
import kg.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5426b {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ EnumC5426b[] $VALUES;
    public static final a Companion;
    public static final EnumC5426b AVAILABLE = new EnumC5426b("AVAILABLE", 0);
    public static final EnumC5426b NOT_INSTALLED = new EnumC5426b("NOT_INSTALLED", 1);
    public static final EnumC5426b UNSUPPORTED = new EnumC5426b("UNSUPPORTED", 2);
    public static final EnumC5426b ERROR = new EnumC5426b("ERROR", 3);

    /* renamed from: e7.b$a */
    public static final class a {

        /* renamed from: e7.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1728a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f46215a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f46216b;

            static {
                int[] iArr = new int[ArCoreApk.Availability.values().length];
                try {
                    iArr[ArCoreApk.Availability.SUPPORTED_INSTALLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ArCoreApk.Availability.UNKNOWN_ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ArCoreApk.Availability.UNKNOWN_TIMED_OUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ArCoreApk.Availability.UNKNOWN_CHECKING.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f46215a = iArr;
                int[] iArr2 = new int[ArCoreApk.InstallStatus.values().length];
                try {
                    iArr2[ArCoreApk.InstallStatus.INSTALL_REQUESTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[ArCoreApk.InstallStatus.INSTALLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                f46216b = iArr2;
            }
        }

        /* renamed from: e7.b$a$b, reason: collision with other inner class name */
        public static final class C1729b implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f46217a;

            public C1729b(Context context) {
                this.f46217a = context;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(new C6556a(EnumC5426b.Companion.d(this.f46217a)));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        /* renamed from: e7.b$a$c */
        static final class c implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final c f46218a = new c();

            c() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(gg.i it) {
                AbstractC6492s.i(it, "it");
                return it.S(1000L, TimeUnit.MILLISECONDS, Gg.a.d());
            }
        }

        /* renamed from: e7.b$a$d */
        static final class d implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f46219a = new d();

            d() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof TimeoutException ? gg.i.K0(new C6556a(EnumC5426b.ERROR)) : gg.i.k0(error);
            }
        }

        /* renamed from: e7.b$a$e */
        static final class e implements p {

            /* renamed from: a, reason: collision with root package name */
            public static final e f46220a = new e();

            e() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final boolean test(C6556a it) {
                AbstractC6492s.i(it, "it");
                return !(it.b() == null);
            }
        }

        /* renamed from: e7.b$a$f */
        static final class f implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final f f46221a = new f();

            f() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EnumC5426b apply(C6556a it) {
                AbstractC6492s.i(it, "it");
                Object objB = it.b();
                AbstractC6492s.f(objB);
                return (EnumC5426b) objB;
            }
        }

        /* renamed from: e7.b$a$g */
        static final class g implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final g f46222a = new g();

            g() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(EnumC5426b it) {
                AbstractC6492s.i(it, "it");
                Z7.b.h("ArCore Availability state " + it, null, 2, null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ gg.i c(a aVar, Context context, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = 5000;
            }
            return aVar.b(context, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC5426b d(Context context) {
            if (Build.VERSION.SDK_INT < 28) {
                return EnumC5426b.UNSUPPORTED;
            }
            switch (C1728a.f46215a[ArCoreApk.getInstance().checkAvailability(context).ordinal()]) {
                case 1:
                    return EnumC5426b.AVAILABLE;
                case 2:
                case 3:
                    return EnumC5426b.NOT_INSTALLED;
                case 4:
                case 5:
                    return EnumC5426b.ERROR;
                case 6:
                    return EnumC5426b.UNSUPPORTED;
                case 7:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final gg.i b(Context context, long j10) {
            AbstractC6492s.i(context, "context");
            z zVarI = z.i(new C1729b(context));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            gg.i iVarQ = zVarI.K(c.f46218a).Z1(j10, TimeUnit.MILLISECONDS).f1(d.f46219a).F1(Gg.a.d()).m0(e.f46220a).N0(f.f46221a).f0(g.f46222a).Q(EnumC5426b.ERROR);
            AbstractC6492s.h(iVarQ, "defaultIfEmpty(...)");
            return iVarQ;
        }

        public final boolean e(Context context) {
            AbstractC6492s.i(context, "context");
            return d(context) == EnumC5426b.AVAILABLE;
        }

        public final EnumC5426b f(Activity activity) {
            AbstractC6492s.i(activity, "activity");
            try {
                int i10 = C1728a.f46216b[ArCoreApk.getInstance().requestInstall(activity, true, ArCoreApk.InstallBehavior.OPTIONAL, ArCoreApk.UserMessageType.USER_ALREADY_INFORMED).ordinal()];
                if (i10 == 1) {
                    return EnumC5426b.NOT_INSTALLED;
                }
                if (i10 == 2) {
                    return EnumC5426b.AVAILABLE;
                }
                throw new NoWhenBranchMatchedException();
            } catch (FatalException e10) {
                Z7.b.e("ARCore requestInstall", e10, null, 4, null);
                return EnumC5426b.ERROR;
            } catch (UnavailableDeviceNotCompatibleException e11) {
                Z7.b.e("ARCore device unsupported", e11, null, 4, null);
                return EnumC5426b.UNSUPPORTED;
            } catch (UnavailableUserDeclinedInstallationException e12) {
                Z7.b.e("ARCore declined by user", e12, null, 4, null);
                return EnumC5426b.ERROR;
            }
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC5426b[] $values() {
        return new EnumC5426b[]{AVAILABLE, NOT_INSTALLED, UNSUPPORTED, ERROR};
    }

    static {
        EnumC5426b[] enumC5426bArr$values = $values();
        $VALUES = enumC5426bArr$values;
        $ENTRIES = AbstractC5827b.a(enumC5426bArr$values);
        Companion = new a(null);
    }

    private EnumC5426b(String str, int i10) {
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5426b valueOf(String str) {
        return (EnumC5426b) Enum.valueOf(EnumC5426b.class, str);
    }

    public static EnumC5426b[] values() {
        return (EnumC5426b[]) $VALUES.clone();
    }
}
