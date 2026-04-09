package M7;

import A9.C0575f;
import A9.E;
import A9.L0;
import A9.U;
import E.u;
import F3.f;
import F9.C0663f;
import F9.q;
import U9.F;
import U9.x;
import U9.z;
import android.graphics.drawable.PictureDrawable;
import b9.C1992A;
import b9.m;
import b9.n;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import h9.e;
import h9.i;
import j6.t;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import p9.p;
import w6.C5739c;
import w6.InterfaceC5740d;

/* compiled from: SvgDivImageLoader.kt */
/* loaded from: classes.dex */
public final class c implements InterfaceC5740d {

    /* renamed from: b, reason: collision with root package name */
    public final x f4328b = new x(new x.a());

    /* renamed from: c, reason: collision with root package name */
    public final C0663f f4329c;

    /* renamed from: d, reason: collision with root package name */
    public final u f4330d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4331e;

    /* compiled from: SvgDivImageLoader.kt */
    @e(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f4332l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C5739c f4333m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ c f4334n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f4335o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y9.e f4336p;

        /* compiled from: SvgDivImageLoader.kt */
        @e(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
        /* renamed from: M7.c$a$a, reason: collision with other inner class name */
        public static final class C0077a extends i implements p<E, InterfaceC4347e<? super PictureDrawable>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f4337l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ c f4338m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f4339n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Y9.e f4340o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0077a(c cVar, String str, Y9.e eVar, InterfaceC4347e interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f4338m = cVar;
                this.f4339n = str;
                this.f4340o = eVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0077a c0077a = new C0077a(this.f4338m, this.f4339n, this.f4340o, interfaceC4347e);
                c0077a.f4337l = obj;
                return c0077a;
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super PictureDrawable> interfaceC4347e) {
                return ((C0077a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                n.b(obj);
                try {
                    F f10 = this.f4340o.execute().f12568h;
                    objA = f10 != null ? f10.bytes() : null;
                } catch (Throwable th) {
                    objA = n.a(th);
                }
                if (objA instanceof m.a) {
                    objA = null;
                }
                byte[] bArr = (byte[]) objA;
                if (bArr != null) {
                    c cVar = this.f4338m;
                    PictureDrawable pictureDrawableV = cVar.f4330d.v(new ByteArrayInputStream(bArr));
                    if (pictureDrawableV != null) {
                        f fVar = cVar.f4331e;
                        fVar.getClass();
                        String imageUrl = this.f4339n;
                        l.f(imageUrl, "imageUrl");
                        ((WeakHashMap) fVar.f1607b).put(imageUrl, pictureDrawableV);
                        return pictureDrawableV;
                    }
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5739c c5739c, c cVar, String str, Y9.e eVar, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f4333m = c5739c;
            this.f4334n = cVar;
            this.f4335o = str;
            this.f4336p = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f4333m, this.f4334n, this.f4335o, this.f4336p, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f4332l;
            C1992A c1992a = null;
            if (i == 0) {
                n.b(obj);
                I9.b bVar = U.f212b;
                C0077a c0077a = new C0077a(this.f4334n, this.f4335o, this.f4336p, null);
                this.f4332l = 1;
                obj = C0575f.h(bVar, c0077a, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            PictureDrawable pictureDrawable = (PictureDrawable) obj;
            C5739c c5739c = this.f4333m;
            if (pictureDrawable != null) {
                c5739c.b(pictureDrawable);
                c1992a = C1992A.f18074a;
            }
            if (c1992a == null) {
                c5739c.a();
            }
            return C1992A.f18074a;
        }
    }

    public c() {
        L0 l0A = C0575f.a();
        I9.c cVar = U.f211a;
        this.f4329c = new C0663f(InterfaceC4350h.a.C0456a.d(l0A, q.f1782a));
        this.f4330d = new u(9);
        this.f4331e = new f(2, false);
    }

    @Override // w6.InterfaceC5740d
    public final Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // w6.InterfaceC5740d
    public final w6.e loadImage(String imageUrl, C5739c c5739c) {
        l.f(imageUrl, "imageUrl");
        z.a aVar = new z.a();
        aVar.f(imageUrl);
        z zVarB = aVar.b();
        x xVar = this.f4328b;
        xVar.getClass();
        final Y9.e eVar = new Y9.e(xVar, zVarB);
        f fVar = this.f4331e;
        fVar.getClass();
        PictureDrawable pictureDrawable = (PictureDrawable) ((WeakHashMap) fVar.f1607b).get(imageUrl);
        if (pictureDrawable != null) {
            c5739c.b(pictureDrawable);
            return new t();
        }
        C0575f.e(this.f4329c, null, null, new a(c5739c, this, imageUrl, eVar, null), 3);
        return new w6.e() { // from class: M7.a
            @Override // w6.e
            public final void cancel() throws IOException {
                eVar.cancel();
            }
        };
    }

    @Override // w6.InterfaceC5740d
    public final w6.e loadImageBytes(final String imageUrl, final C5739c c5739c) {
        l.f(imageUrl, "imageUrl");
        return new w6.e() { // from class: M7.b
            @Override // w6.e
            public final void cancel() {
                c this$0 = this.f4325a;
                l.f(this$0, "this$0");
                String imageUrl2 = imageUrl;
                l.f(imageUrl2, "$imageUrl");
                C5739c callback = c5739c;
                l.f(callback, "$callback");
                this$0.loadImage(imageUrl2, callback);
            }
        };
    }
}
