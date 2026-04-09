package D8;

import A9.E;
import N7.C1154e9;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PhLogsHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.PhLogsHelper$initPHLogs$1", f = "PhLogsHelper.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.d f1082m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.zipoapps.premiumhelper.d dVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1082m = dVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new b(this.f1082m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws IOException {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f1081l;
        com.zipoapps.premiumhelper.d dVar = this.f1082m;
        if (i == 0) {
            b9.n.b(obj);
            o8.f fVar = o8.f.f44891a;
            this.f1081l = 1;
            obj = fVar.a(dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            File file = new File(dVar.getFilesDir(), "ph_logs");
            if (file.exists() && file.listFiles() != null) {
                File[] fileArrListFiles = file.listFiles();
                if ((fileArrListFiles != null ? fileArrListFiles.length : 0) >= 3) {
                    File[] fileArrListFiles2 = file.listFiles();
                    kotlin.jvm.internal.l.c(fileArrListFiles2);
                    for (File file2 : fileArrListFiles2) {
                        file2.delete();
                    }
                }
            }
            String strI = C1154e9.i("log_", new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss", Locale.getDefault()).format(new Date()), ".txt");
            File file3 = new File(dVar.getFilesDir(), "ph_logs");
            if (!file3.exists()) {
                file3.mkdirs();
            }
            try {
                Runtime.getRuntime().exec("logcat -f " + new File(file3, strI).getAbsolutePath());
            } catch (Exception e4) {
                K4.e.a().b(e4);
                e4.printStackTrace();
                C1992A c1992a = C1992A.f18074a;
            }
        }
        return C1992A.f18074a;
    }
}
