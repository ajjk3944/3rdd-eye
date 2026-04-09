package za;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.N;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.content.SharedPreferences;
import bb.C4079a;
import bb.InterfaceC4080b;
import com.ui.uidb.UiDB;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import za.C8724b;

/* renamed from: za.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8724b implements za.d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f67229c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f67230a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4080b f67231b;

    /* renamed from: za.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: za.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2388b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67232a;

        static {
            int[] iArr = new int[UiDB.b.values().length];
            try {
                iArr[UiDB.b.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiDB.b.STAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f67232a = iArr;
        }
    }

    /* renamed from: za.b$c */
    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f67233a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t() {
            return "No environment info found in saved snapshot. Falling back to PRODUCTION";
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C8724b.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String string;
            AbstractC5467b.g();
            if (this.f67233a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            String string2 = C8724b.this.f67230a.getString("raw", null);
            String string3 = C8724b.this.f67230a.getString("env", null);
            UiDB.b bVarH = string3 != null ? C8724b.this.h(string3) : null;
            if (bVarH == null) {
                Aa.a.c(new InterfaceC6824a() { // from class: za.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return C8724b.c.t();
                    }
                }, null, 2, null);
            }
            if (bVarH == null) {
                bVarH = UiDB.b.PRODUCTION;
            }
            long j10 = C8724b.this.f67230a.getLong("created", -1L);
            if (j10 == -1) {
                return null;
            }
            String string4 = C8724b.this.f67230a.getString("etag", null);
            C4079a.C1151a c1151a = new C4079a.C1151a(j10, string4 != null ? Ya.a.f24826a.a(string4) : null);
            if (string2 == null || (string = C8724b.this.f67230a.getString("version", null)) == null) {
                return null;
            }
            try {
                return new UiDB.c(c1151a, new C4079a(C4079a.b.a(string), C8724b.this.f67231b.a(bVarH, string2).a(), null), string2, bVarH);
            } catch (UiDB.Error.ContentInvalid e10) {
                throw new UiDB.Error.ContentInvalid("Failed to deserialize snapshot from shared preferences", e10);
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: za.b$d */
    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f67235a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiDB.c f67237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(UiDB.c cVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f67237c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C8724b.this.new d(this.f67237c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zCommit;
            AbstractC5467b.g();
            if (this.f67235a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            SharedPreferences sharedPreferences = C8724b.this.f67230a;
            AbstractC6492s.h(sharedPreferences, "access$getPrefs$p(...)");
            C8724b c8724b = C8724b.this;
            UiDB.c cVar = this.f67237c;
            synchronized (sharedPreferences) {
                try {
                    SharedPreferences.Editor editorPutLong = c8724b.f67230a.edit().putInt("storage_version", 1).putLong("created", cVar.c().a());
                    Ya.a aVarB = cVar.c().b();
                    zCommit = editorPutLong.putString("etag", aVarB != null ? aVarB.c() : null).putString("version", cVar.d().b()).putString("raw", cVar.g()).putString("env", c8724b.g(cVar.a())).commit();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zCommit) {
                return J.f24997a;
            }
            throw new UiDB.Error.IO("Failed to store snapshot", null, 2, null);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public C8724b(Context context, String fileName) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(fileName, "fileName");
        this.f67230a = context.getSharedPreferences(fileName, 0);
        this.f67231b = InterfaceC4080b.f33095a.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiDB.b h(final String str) {
        if (AbstractC6492s.d(str, "production")) {
            return UiDB.b.PRODUCTION;
        }
        if (AbstractC6492s.d(str, "stage")) {
            return UiDB.b.STAGE;
        }
        Aa.a.c(new InterfaceC6824a() { // from class: za.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C8724b.i(str);
            }
        }, null, 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str) {
        return "Unkown environment '" + str + "'";
    }

    @Override // za.d
    public Object a(UiDB.c cVar, InterfaceC5380e interfaceC5380e) {
        Object objG = AbstractC3059i.g(C3048c0.b(), new d(cVar, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    @Override // za.d
    public Object c(InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new c(null), interfaceC5380e);
    }

    public final String g(UiDB.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        int i10 = C2388b.f67232a[bVar.ordinal()];
        if (i10 == 1) {
            return "production";
        }
        if (i10 == 2) {
            return "stage";
        }
        throw new NoWhenBranchMatchedException();
    }
}
