package y5;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import b9.C2001h;
import b9.n;
import b9.p;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import org.json.JSONObject;
import w5.C5727b;

/* compiled from: RemoteSettings.kt */
/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5806a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4350h f48131a;

    /* renamed from: b, reason: collision with root package name */
    public final h5.c f48132b;

    /* renamed from: c, reason: collision with root package name */
    public final C5808c f48133c;

    /* renamed from: d, reason: collision with root package name */
    public final p f48134d;

    /* renamed from: e, reason: collision with root package name */
    public final K9.d f48135e = K9.f.a();

    /* compiled from: RemoteSettings.kt */
    @h9.e(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    /* renamed from: y5.a$a, reason: collision with other inner class name */
    public static final class C0557a extends h9.c {

        /* renamed from: l, reason: collision with root package name */
        public Object f48136l;

        /* renamed from: m, reason: collision with root package name */
        public K9.a f48137m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f48138n;

        /* renamed from: p, reason: collision with root package name */
        public int f48140p;

        public C0557a(h9.c cVar) {
            super(cVar);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f48138n = obj;
            this.f48140p |= RecyclerView.UNDEFINED_DURATION;
            return C5806a.this.d(this);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @h9.e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend")
    /* renamed from: y5.a$b */
    public static final class b extends h9.i implements p9.p<JSONObject, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public w f48141l;

        /* renamed from: m, reason: collision with root package name */
        public w f48142m;

        /* renamed from: n, reason: collision with root package name */
        public int f48143n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f48144o;

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            b bVar = C5806a.this.new b(interfaceC4347e);
            bVar.f48144o = obj;
            return bVar;
        }

        @Override // p9.p
        public final Object invoke(JSONObject jSONObject, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(jSONObject, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
        
            if (r15 == r4) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
        
            if (r15 == r4) goto L84;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
        /* JADX WARN: Type inference failed for: r15v13, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 464
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.C5806a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RemoteSettings.kt */
    @h9.e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    /* renamed from: y5.a$c */
    public static final class c extends h9.i implements p9.p<String, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f48146l;

        public c() {
            throw null;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            c cVar = new c(2, interfaceC4347e);
            cVar.f48146l = obj;
            return cVar;
        }

        @Override // p9.p
        public final Object invoke(String str, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((c) create(str, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f48146l));
            return C1992A.f18074a;
        }
    }

    public C5806a(InterfaceC4350h interfaceC4350h, h5.c cVar, C5727b c5727b, C5808c c5808c, X0.h hVar) {
        this.f48131a = interfaceC4350h;
        this.f48132b = cVar;
        this.f48133c = c5808c;
        this.f48134d = C2001h.b(new A6.h(hVar, 5));
    }

    public static String c(String str) {
        Pattern patternCompile = Pattern.compile("/");
        l.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        l.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final Boolean a() {
        C5809d c5809d = b().f48176b;
        if (c5809d != null) {
            return c5809d.f48155a;
        }
        l.l("sessionConfigs");
        throw null;
    }

    public final C5812g b() {
        return (C5812g) this.f48134d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:44:0x00ae, B:46:0x00ba, B:49:0x00c5, B:52:0x015a, B:36:0x0087, B:38:0x0091, B:41:0x009c), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:44:0x00ae, B:46:0x00ba, B:49:0x00c5, B:52:0x015a, B:36:0x0087, B:38:0x0091, B:41:0x009c), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(f9.InterfaceC4347e<? super b9.C1992A> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.C5806a.d(f9.e):java.lang.Object");
    }
}
