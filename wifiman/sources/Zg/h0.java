package Zg;

import dh.InterfaceC5380e;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import zi.AbstractC8782l;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public abstract class h0 {

    static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        Object f25370b;

        /* renamed from: c, reason: collision with root package name */
        Object f25371c;

        /* renamed from: d, reason: collision with root package name */
        int f25372d;

        /* renamed from: e, reason: collision with root package name */
        int f25373e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f25374f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f25375g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f25376h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Iterator f25377i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f25378j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f25379k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, Iterator it, boolean z10, boolean z11, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f25375g = i10;
            this.f25376h = i11;
            this.f25377i = it;
            this.f25378j = z10;
            this.f25379k = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f25375g, this.f25376h, this.f25377i, this.f25378j, this.f25379k, interfaceC5380e);
            aVar.f25374f = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0117 -> B:59:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0145 -> B:72:0x0148). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Zg.h0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC8782l abstractC8782l, InterfaceC5380e interfaceC5380e) {
            return ((a) create(abstractC8782l, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator iterator, int i10, int i11, boolean z10, boolean z11) {
        AbstractC6492s.i(iterator, "iterator");
        return !iterator.hasNext() ? I.f25336a : AbstractC8783m.a(new a(i10, i11, iterator, z11, z10, null));
    }
}
