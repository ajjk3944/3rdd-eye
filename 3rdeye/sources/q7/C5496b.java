package q7;

import A9.C0575f;
import A9.F;
import A9.U;
import E.u;
import F9.C0663f;
import R9.C1568e;
import R9.s;
import R9.t;
import S9.C;
import S9.C1576h;
import S9.C1577i;
import S9.C1579k;
import S9.C1583o;
import S9.D;
import S9.M;
import S9.N;
import S9.T;
import X0.e;
import X0.h;
import X0.o;
import android.content.Context;
import b9.C1992A;
import b9.m;
import b9.n;
import c9.C2099t;
import h7.C4421b;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import p7.C5477i;
import p9.InterfaceC5480a;
import y9.C5819a;

/* compiled from: ViewPreCreationProfileRepository.kt */
/* renamed from: q7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5496b {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<String, h<C5477i>> f45446c = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final Context f45447a;

    /* renamed from: b, reason: collision with root package name */
    public final C5477i f45448b;

    /* compiled from: ViewPreCreationProfileRepository.kt */
    /* renamed from: q7.b$a */
    public static final class a {

        /* compiled from: ViewPreCreationProfileRepository.kt */
        /* renamed from: q7.b$a$a, reason: collision with other inner class name */
        public static final class C0515a extends m implements InterfaceC5480a<File> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Context f45449g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f45450h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0515a(Context context, String str) {
                super(0);
                this.f45449g = context;
                this.f45450h = str;
            }

            @Override // p9.InterfaceC5480a
            public final File invoke() {
                return new File(this.f45449g.getFilesDir(), String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{this.f45450h}, 1)));
            }
        }

        public static h a(Context context, String id) {
            l.f(context, "<this>");
            l.f(id, "id");
            WeakHashMap<String, h<C5477i>> weakHashMap = C5496b.f45446c;
            h<C5477i> hVar = weakHashMap.get(id);
            if (hVar == null) {
                C0516b serializer = C0516b.f45451a;
                C0515a c0515a = new C0515a(context, id);
                C2099t c2099t = C2099t.f18581b;
                C0663f c0663fA = F.a(U.f212b.plus(C0575f.a()));
                l.f(serializer, "serializer");
                o oVar = new o(c0515a, serializer, u.G(new e(c2099t, null)), new Y0.a(), c0663fA);
                weakHashMap.put(id, oVar);
                hVar = oVar;
            }
            return hVar;
        }
    }

    /* compiled from: ViewPreCreationProfileRepository.kt */
    /* renamed from: q7.b$b, reason: collision with other inner class name */
    public static final class C0516b implements X0.l<C5477i> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0516b f45451a = new C0516b();

        /* renamed from: b, reason: collision with root package name */
        public static final s f45452b = t.a(a.f45453g);

        /* compiled from: ViewPreCreationProfileRepository.kt */
        /* renamed from: q7.b$b$a */
        public static final class a extends m implements p9.l<C1568e, C1992A> {

            /* renamed from: g, reason: collision with root package name */
            public static final a f45453g = new a(1);

            @Override // p9.l
            public final C1992A invoke(C1568e c1568e) {
                C1568e Json = c1568e;
                l.f(Json, "$this$Json");
                Json.f11791a = false;
                return C1992A.f18074a;
            }
        }

        @Override // X0.l
        public final C1992A a(Object obj, o.b bVar) {
            Object objA;
            C5477i c5477i = (C5477i) obj;
            try {
                s sVar = f45452b;
                T9.a aVar = sVar.f11782b;
                kotlin.jvm.internal.e eVarA = x.a(C5477i.class);
                List list = Collections.EMPTY_LIST;
                x.f43661a.getClass();
                M9.b bVarL = u.L(aVar, new A(eVarA, list, true));
                D d10 = new D(bVar);
                byte[] array = d10.f12013b;
                try {
                    C.a(sVar, d10, bVarL, c5477i);
                    d10.f();
                    C1579k c1579k = C1579k.f12090c;
                    char[] array2 = d10.f12014c;
                    c1579k.getClass();
                    l.f(array2, "array");
                    c1579k.a(array2);
                    C1577i c1577i = C1577i.f12087c;
                    c1577i.getClass();
                    l.f(array, "array");
                    c1577i.e(array);
                    objA = C1992A.f18074a;
                } catch (Throwable th) {
                    d10.f();
                    C1579k c1579k2 = C1579k.f12090c;
                    char[] array3 = d10.f12014c;
                    c1579k2.getClass();
                    l.f(array3, "array");
                    c1579k2.a(array3);
                    C1577i c1577i2 = C1577i.f12087c;
                    c1577i2.getClass();
                    l.f(array, "array");
                    c1577i2.e(array);
                    throw th;
                }
            } catch (Throwable th2) {
                objA = n.a(th2);
            }
            if (b9.m.a(objA) != null) {
                int i = C4421b.f38269a;
                C4421b.a(C7.a.ERROR);
            }
            return C1992A.f18074a;
        }

        @Override // X0.l
        public final /* bridge */ /* synthetic */ C5477i b() {
            return null;
        }

        @Override // X0.l
        public final Object c(FileInputStream fileInputStream) {
            Object objA;
            try {
                s sVar = f45452b;
                T9.a aVar = sVar.f11782b;
                kotlin.jvm.internal.e eVarA = x.a(C5477i.class);
                List list = Collections.EMPTY_LIST;
                x.f43661a.getClass();
                M9.b bVarL = u.L(aVar, new A(eVarA, list, true));
                H7.e eVar = new H7.e();
                eVar.f2291b = new C1583o(fileInputStream, C5819a.f48359b);
                C1583o c1583o = (C1583o) eVar.f2291b;
                try {
                    M m10 = new M(eVar);
                    try {
                        Object objB = new N(sVar, T.OBJ, m10, bVarL.getDescriptor(), null).B(bVarL);
                        m10.q();
                        c1583o.getClass();
                        C1576h c1576h = C1576h.f12086c;
                        byte[] bArrArray = c1583o.f12098c.array();
                        l.e(bArrArray, "byteBuffer.array()");
                        c1576h.getClass();
                        c1576h.e(bArrArray);
                        objA = (C5477i) objB;
                    } finally {
                        m10.D();
                    }
                } catch (Throwable th) {
                    c1583o.getClass();
                    C1576h c1576h2 = C1576h.f12086c;
                    byte[] bArrArray2 = c1583o.f12098c.array();
                    l.e(bArrArray2, "byteBuffer.array()");
                    c1576h2.getClass();
                    c1576h2.e(bArrArray2);
                    throw th;
                }
            } catch (Throwable th2) {
                objA = n.a(th2);
            }
            if (b9.m.a(objA) != null) {
                int i = C4421b.f38269a;
                C4421b.a(C7.a.ERROR);
            }
            if (objA instanceof m.a) {
                return null;
            }
            return objA;
        }
    }

    public C5496b(Context context, C5477i defaultProfile) {
        l.f(context, "context");
        l.f(defaultProfile, "defaultProfile");
        this.f45447a = context;
        this.f45448b = defaultProfile;
    }
}
