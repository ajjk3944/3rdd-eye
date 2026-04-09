package hj;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import com.liuzh.deviceinfo.R;
import java.io.File;
import ua.j;
import ya.f0;
import ya.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25158c;

    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        this.f25156a = i4;
        this.f25157b = obj;
        this.f25158c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f25156a) {
            case 0:
                Context context = (Context) this.f25157b;
                nh.a.d(context, ((File) this.f25158c).getAbsolutePath());
                Toast.makeText(context, R.string.fa_copied_to_clipboard, 0).show();
                break;
            default:
                g gVar = (g) this.f25157b;
                String str = (String) this.f25158c;
                gVar.getClass();
                f0 f0Var = j.C.f35261c;
                f0.u(gVar.f37450a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
                break;
        }
    }
}
