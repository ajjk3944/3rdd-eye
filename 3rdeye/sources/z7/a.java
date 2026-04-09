package Z7;

import A9.C0575f;
import A9.E;
import A9.F;
import A9.U;
import K9.d;
import K9.f;
import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: AdsErrorReporter.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14051a = f.a();

    /* compiled from: AdsErrorReporter.kt */
    @e(c = "com.zipoapps.ads.utils.AdsErrorReporter$reportAdErrorAsync$1", f = "AdsErrorReporter.kt", l = {68, 28, 36}, m = "invokeSuspend")
    /* renamed from: Z7.a$a, reason: collision with other inner class name */
    public static final class C0208a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public K9.a f14052l;

        /* renamed from: m, reason: collision with root package name */
        public Context f14053m;

        /* renamed from: n, reason: collision with root package name */
        public String f14054n;

        /* renamed from: o, reason: collision with root package name */
        public String f14055o;

        /* renamed from: p, reason: collision with root package name */
        public String f14056p;

        /* renamed from: q, reason: collision with root package name */
        public String f14057q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f14058r;

        /* renamed from: s, reason: collision with root package name */
        public int f14059s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Context f14060t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f14061u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f14062v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0208a(Context context, String str, String str2, InterfaceC4347e<? super C0208a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f14060t = context;
            this.f14061u = str;
            this.f14062v = str2;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new C0208a(this.f14060t, this.f14061u, this.f14062v, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((C0208a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00d2 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:8:0x0023, B:44:0x0126, B:48:0x0137, B:15:0x0041, B:30:0x00c1, B:31:0x00cc, B:33:0x00d2, B:35:0x00e0, B:36:0x00e4, B:38:0x00f5, B:40:0x00fd, B:22:0x0079, B:27:0x00a1, B:25:0x0099), top: B:53:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fd A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:8:0x0023, B:44:0x0126, B:48:0x0137, B:15:0x0041, B:30:0x00c1, B:31:0x00cc, B:33:0x00d2, B:35:0x00e0, B:36:0x00e4, B:38:0x00f5, B:40:0x00fd, B:22:0x0079, B:27:0x00a1, B:25:0x0099), top: B:53:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 507
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Z7.a.C0208a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static void a(Context context, String str, String str2) {
        l.f(context, "context");
        C0575f.e(F.a(U.f212b), null, null, new C0208a(context, str2, str, null), 3);
    }
}
