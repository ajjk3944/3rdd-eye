package v8;

import A9.E;
import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import p9.p;

/* compiled from: ContactSupportManager.kt */
@e(c = "com.zipoapps.premiumhelper.support.ContactSupportManager$createInfoFile$2", f = "ContactSupportManager.kt", l = {187, 192}, m = "invokeSuspend")
/* renamed from: v8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5684a extends i implements p<E, InterfaceC4347e<? super File>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public File f47062l;

    /* renamed from: m, reason: collision with root package name */
    public Closeable f47063m;

    /* renamed from: n, reason: collision with root package name */
    public BufferedWriter f47064n;

    /* renamed from: o, reason: collision with root package name */
    public BufferedWriter f47065o;

    /* renamed from: p, reason: collision with root package name */
    public int f47066p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f47067q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f47068r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5684a(b bVar, Context context, InterfaceC4347e<? super C5684a> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47067q = bVar;
        this.f47068r = context;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5684a(this.f47067q, this.f47068r, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super File> interfaceC4347e) {
        return ((C5684a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146 A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:7:0x001e, B:27:0x0122, B:32:0x012f, B:34:0x0146, B:37:0x014e, B:14:0x0038, B:23:0x00ee), top: B:46:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.C5684a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
