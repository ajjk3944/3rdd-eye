package t2;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2920d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23602b;

    public /* synthetic */ DialogInterfaceOnClickListenerC2920d(int i, Object obj) {
        this.f23601a = i;
        this.f23602b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f23601a) {
            case 0:
                ((AtomicInteger) this.f23602b).set(i);
                break;
            case 1:
                ((C2925i) this.f23602b).b();
                break;
            default:
                C2911G c2911g = p2.j.f22785C.f22790c;
                C2911G.v((Context) this.f23602b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
        }
    }

    public DialogInterfaceOnClickListenerC2920d(RunnableC2927k runnableC2927k, Context context) {
        this.f23601a = 2;
        this.f23602b = context;
    }
}
