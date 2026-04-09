package t;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.liuzh.deviceinfo.tests.TestesActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import ya.f0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33852a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33853b;

    public /* synthetic */ r(int i4, Object obj) {
        this.f33852a = i4;
        this.f33853b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f33852a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f33853b;
                if (weakReference.get() != null) {
                    ((s) weakReference.get()).i(true);
                    break;
                }
                break;
            case 1:
                ((z) this.f33853b).f33880r0.i(true);
                break;
            case 2:
                ((AtomicInteger) this.f33853b).set(i4);
                break;
            case 3:
                ((ya.g) this.f33853b).b();
                break;
            case 4:
                f0 f0Var = ua.j.C.f35261c;
                f0.v((Context) this.f33853b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                break;
            default:
                TestesActivity.D(((yh.h) this.f33853b).U(), yh.i.class);
                break;
        }
    }

    public r(ya.i iVar, Context context) {
        this.f33852a = 4;
        this.f33853b = context;
    }

    public r(s sVar) {
        this.f33852a = 0;
        this.f33853b = new WeakReference(sVar);
    }
}
