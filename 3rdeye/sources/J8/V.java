package J8;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: Zip.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.Zip$zipFiles$2", f = "Zip.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class V extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<String> f2852m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(String str, List<String> list, InterfaceC4347e<? super V> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2851l = str;
        this.f2852m = list;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new V(this.f2851l, this.f2852m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((V) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws IOException {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(this.f2851l));
        try {
            byte[] bArr = new byte[8192];
            for (String str : this.f2852m) {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    String strSubstring = str.substring(y9.q.j0(6, str, "/") + 1);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                    zipOutputStream.putNextEntry(new ZipEntry(strSubstring));
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        C1992A c1992a = C1992A.f18074a;
                        if (-1 == i) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                    zipOutputStream.flush();
                    zipOutputStream.closeEntry();
                    fileInputStream.close();
                } finally {
                }
            }
            zipOutputStream.finish();
            zipOutputStream.flush();
            zipOutputStream.close();
            C1992A c1992a2 = C1992A.f18074a;
            zipOutputStream.close();
            return C1992A.f18074a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                A9.I.o(zipOutputStream, th);
                throw th2;
            }
        }
    }
}
