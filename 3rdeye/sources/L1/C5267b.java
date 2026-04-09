package l1;

import E.u;
import N7.G8;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.loader.content.b;
import j1.AbstractC5165a;
import j1.C5166b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import l1.AbstractC5266a;
import m0.j;

/* compiled from: LoaderManagerImpl.java */
/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5267b extends AbstractC5266a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f43675a;

    /* renamed from: b, reason: collision with root package name */
    public final c f43676b;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: l1.b$a */
    public static class a<D> extends E<D> implements b.InterfaceC0249b<D> {

        /* renamed from: l, reason: collision with root package name */
        public final androidx.loader.content.b<D> f43677l;

        /* renamed from: m, reason: collision with root package name */
        public Object f43678m;

        /* renamed from: n, reason: collision with root package name */
        public C0488b<D> f43679n;

        public a(androidx.loader.content.b bVar) {
            this.f43677l = bVar;
            bVar.registerListener(0, this);
        }

        @Override // androidx.lifecycle.C
        public final void g() {
            this.f43677l.startLoading();
        }

        @Override // androidx.lifecycle.C
        public final void h() {
            this.f43677l.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.C
        public final void i(F<? super D> f10) {
            super.i(f10);
            this.f43678m = null;
            this.f43679n = null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.x, java.lang.Object] */
        public final void l() {
            ?? r02 = this.f43678m;
            C0488b<D> c0488b = this.f43679n;
            if (r02 == 0 || c0488b == null) {
                return;
            }
            super.i(c0488b);
            e(r02, c0488b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            u.p(sb, this.f43677l);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: l1.b$b, reason: collision with other inner class name */
    public static class C0488b<D> implements F<D> {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.loader.content.b<D> f43680a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5266a.InterfaceC0487a<D> f43681b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f43682c = false;

        public C0488b(androidx.loader.content.b<D> bVar, AbstractC5266a.InterfaceC0487a<D> interfaceC0487a) {
            this.f43680a = bVar;
            this.f43681b = interfaceC0487a;
        }

        @Override // androidx.lifecycle.F
        public final void a(D d10) {
            this.f43681b.onLoadFinished(this.f43680a, d10);
            this.f43682c = true;
        }

        public final String toString() {
            return this.f43681b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: l1.b$c */
    public static class c extends b0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f43683d = new a();

        /* renamed from: b, reason: collision with root package name */
        public final j<a> f43684b = new j<>();

        /* renamed from: c, reason: collision with root package name */
        public boolean f43685c = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: l1.b$c$a */
        public static class a implements f0 {
            @Override // androidx.lifecycle.f0
            public final <T extends b0> T a(Class<T> cls) {
                return new c();
            }

            @Override // androidx.lifecycle.f0
            public final /* synthetic */ b0 b(e eVar, C5166b c5166b) {
                return G8.c(this, eVar, c5166b);
            }

            @Override // androidx.lifecycle.f0
            public final b0 c(Class cls, C5166b c5166b) {
                return a(cls);
            }
        }

        @Override // androidx.lifecycle.b0
        public final void d() {
            j<a> jVar = this.f43684b;
            int i = jVar.f44033d;
            for (int i10 = 0; i10 < i; i10++) {
                a aVar = (a) jVar.f44032c[i10];
                androidx.loader.content.b<D> bVar = aVar.f43677l;
                bVar.cancelLoad();
                bVar.abandon();
                C0488b<D> c0488b = aVar.f43679n;
                if (c0488b != 0) {
                    aVar.i(c0488b);
                    if (c0488b.f43682c) {
                        c0488b.f43681b.onLoaderReset(c0488b.f43680a);
                    }
                }
                bVar.unregisterListener(aVar);
                if (c0488b != 0) {
                    boolean z10 = c0488b.f43682c;
                }
                bVar.reset();
            }
            int i11 = jVar.f44033d;
            Object[] objArr = jVar.f44032c;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = null;
            }
            jVar.f44033d = 0;
        }
    }

    public C5267b(InterfaceC1790x interfaceC1790x, i0 store) {
        this.f43675a = interfaceC1790x;
        c.a aVar = c.f43683d;
        l.f(store, "store");
        AbstractC5165a.C0471a defaultCreationExtras = AbstractC5165a.C0471a.f42677b;
        l.f(defaultCreationExtras, "defaultCreationExtras");
        N5.c cVar = new N5.c(store, aVar, defaultCreationExtras);
        e eVarA = x.a(c.class);
        String strA = eVarA.a();
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f43676b = (c) cVar.f(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
    }

    @Deprecated
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        j<a> jVar = this.f43676b.f43684b;
        if (jVar.f44033d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < jVar.f44033d; i++) {
                a aVar = (a) jVar.f44032c[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(jVar.f44031b[i]);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                androidx.loader.content.b<D> bVar = aVar.f43677l;
                printWriter.println(bVar);
                bVar.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (aVar.f43679n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVar.f43679n);
                    C0488b<D> c0488b = aVar.f43679n;
                    c0488b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0488b.f43682c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(bVar.dataToString(aVar.d()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(aVar.f16025c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        u.p(sb, this.f43675a);
        sb.append("}}");
        return sb.toString();
    }
}
