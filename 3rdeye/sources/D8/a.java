package D8;

import A9.E;
import android.content.Context;
import b9.C1992A;
import c9.C2097r;
import c9.C2099t;
import f9.InterfaceC4347e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhLogsHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.PhLogsHelper$getLogs$2", f = "PhLogsHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super List<? extends G8.a>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f1080l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, InterfaceC4347e<? super a> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1080l = context;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new a(this.f1080l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super List<? extends G8.a>> interfaceC4347e) {
        return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        File[] fileArrListFiles = new File(this.f1080l.getFilesDir(), "ph_logs").listFiles();
        if (fileArrListFiles == null) {
            return C2099t.f18581b;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            kotlin.jvm.internal.l.e(name, "getName(...)");
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.l.e(absolutePath, "getAbsolutePath(...)");
            arrayList.add(new G8.a(name, absolutePath));
        }
        return C2097r.G0(arrayList);
    }
}
