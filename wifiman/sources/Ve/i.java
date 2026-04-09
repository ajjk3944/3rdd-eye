package ve;

import Ii.AbstractC3063k;
import Ii.AbstractC3074p0;
import Ii.AbstractC3077r0;
import Ii.M;
import Ii.N;
import Ii.O;
import Ii.S0;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import android.content.Context;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jh.AbstractC6331d;
import kg.n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final b f63574e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f63575a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3074p0 f63576b;

    /* renamed from: c, reason: collision with root package name */
    private final N f63577c;

    /* renamed from: d, reason: collision with root package name */
    private int f63578d;

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63579a;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f63579a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                i.this.m();
                i iVar = i.this;
                iVar.f63578d = AbstractC6331d.i(iVar.l("log_0"), null, 1, null).size();
            } catch (Exception e10) {
                Z7.b.e("FileLog init error", e10, null, 4, null);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63581a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f63583c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f63584d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f63585e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, String str, String str2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63583c = i10;
            this.f63584d = str;
            this.f63585e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return i.this.new c(this.f63583c, this.f63584d, this.f63585e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f63581a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            try {
                i.this.f63578d++;
                if (i.this.f63578d >= 100000) {
                    i.this.n();
                    i.this.f63578d = 0;
                }
                AbstractC6331d.c(i.this.l("log_0"), i.this.j() + " " + this.f63583c + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f63584d + ": " + this.f63585e + "\n", null, 2, null);
            } catch (Exception unused) {
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5910A f63587b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f63588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC5910A interfaceC5910A, i iVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63587b = interfaceC5910A;
            this.f63588c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f63587b, this.f63588c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f63586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            StringBuilder sb2 = new StringBuilder();
            try {
                List listO = AbstractC3689v.o("log_1", "log_0");
                i iVar = this.f63588c;
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    File fileL = iVar.l((String) it.next());
                    if (fileL.exists()) {
                        sb2.append(AbstractC6331d.l(fileL, null, 1, null));
                    }
                }
            } catch (Exception e10) {
                Z7.b.e("Error while reading logs", e10, null, 4, null);
            }
            this.f63587b.onSuccess(sb2.toString());
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f63589a = new e();

        public static final class a implements C {
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess("");
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            z zVarI = z.i(new a());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    public i(Context applicationContext) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        this.f63575a = applicationContext;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC6492s.h(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        AbstractC3074p0 abstractC3074p0B = AbstractC3077r0.b(executorServiceNewSingleThreadExecutor);
        this.f63576b = abstractC3074p0B;
        N nA = O.a(abstractC3074p0B.plus(S0.b(null, 1, null)).plus(new M("FileLog")));
        this.f63577c = nA;
        AbstractC3063k.d(nA, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j() {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(Calendar.getInstance().getTime());
        AbstractC6492s.h(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(i iVar, InterfaceC5910A it) {
        AbstractC6492s.i(it, "it");
        AbstractC3063k.d(iVar.f63577c, null, null, new d(it, iVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File l(String str) {
        return new File(this.f63575a.getCacheDir(), "logs/" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() throws IOException {
        File fileL = l("log_0");
        File parentFile = fileL.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (fileL.exists()) {
            return;
        }
        fileL.createNewFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() throws IOException {
        File fileL = l("log_0");
        File fileL2 = l("log_1");
        if (fileL2.exists()) {
            fileL2.delete();
        }
        fileL.renameTo(fileL2);
        m();
    }

    @Override // ve.g
    public void a(int i10, String str, String message) {
        AbstractC6492s.i(message, "message");
        AbstractC3063k.d(this.f63577c, null, null, new c(i10, str, message, null), 3, null);
    }

    @Override // ve.g
    public z b() {
        z zVarF = z.i(new C() { // from class: ve.h
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                i.k(this.f63573a, interfaceC5910A);
            }
        }).F(e.f63589a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }
}
