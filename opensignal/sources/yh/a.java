package yh;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.c0;
import com.squareup.picasso.f0;
import com.squareup.picasso.w;
import io.sentry.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a extends Handler {

    /* renamed from: b, reason: collision with root package name */
    public static a f26244b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile HandlerThread f26245c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26246a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Looper looper, int i10, boolean z10) {
        super(looper);
        this.f26246a = i10;
    }

    public static synchronized void a(t tVar) {
        try {
            try {
                try {
                    try {
                        if (f26245c == null || !f26245c.isAlive()) {
                            f26245c = tVar.l("TUSdk_16");
                            f26245c.setPriority(1);
                            f26245c.start();
                            f26244b = new a(f26245c.getLooper(), 0, false);
                        }
                    } catch (Exception e4) {
                        ch.n.d("TNAT_SDK_HandlerThread", "Exception while creating SDK thread.", e4);
                    }
                } catch (InternalError unused) {
                    ch.n.c("TNAT_SDK_HandlerThread", "InternalError while creating SDK thread.");
                }
            } catch (OutOfMemoryError unused2) {
                ch.n.c("TNAT_SDK_HandlerThread", "OOM while creating SDK thread.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.f26246a) {
            case 2:
                int i10 = message.what;
                if (i10 == 3) {
                    com.squareup.picasso.b bVar = (com.squareup.picasso.b) message.obj;
                    bVar.f5869a.a(bVar.d());
                    return;
                }
                if (i10 != 8) {
                    if (i10 != 13) {
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        com.squareup.picasso.b bVar2 = (com.squareup.picasso.b) list.get(i11);
                        f0 f0Var = bVar2.f5869a;
                        Bitmap bitmapE = w.shouldReadFromMemoryCache(0) ? f0Var.e(bVar2.f5873e) : null;
                        if (bitmapE != null) {
                            f0Var.b(bitmapE, c0.MEMORY, bVar2);
                        } else {
                            f0Var.c(bVar2);
                        }
                    }
                    return;
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    com.squareup.picasso.f fVar = (com.squareup.picasso.f) list2.get(i12);
                    f0 f0Var2 = fVar.f5883d;
                    f0Var2.getClass();
                    com.squareup.picasso.b bVar3 = fVar.F;
                    ArrayList arrayList = fVar.G;
                    boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                    if (bVar3 != null || z10) {
                        Uri uri = fVar.B.f5918b;
                        Bitmap bitmap = fVar.H;
                        c0 c0Var = fVar.J;
                        if (bVar3 != null) {
                            f0Var2.b(bitmap, c0Var, bVar3);
                        }
                        if (z10) {
                            int size3 = arrayList.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                f0Var2.b(bitmap, c0Var, (com.squareup.picasso.b) arrayList.get(i13));
                            }
                        }
                    }
                }
                return;
            case 3:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Looper looper, Handler.Callback callback, int i10) {
        super(looper, callback);
        this.f26246a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Looper looper, int i10) {
        super(looper);
        this.f26246a = i10;
        switch (i10) {
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            default:
                Looper.getMainLooper();
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
