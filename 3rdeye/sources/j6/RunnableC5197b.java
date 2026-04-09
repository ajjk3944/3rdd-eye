package j6;

import C6.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.os.Handler;
import android.util.Base64;
import b9.C1992A;
import h7.C4421b;
import java.io.ByteArrayInputStream;
import p9.InterfaceC5480a;

/* compiled from: DecodeBase64ImageTask.kt */
/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5197b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final String f42985b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42986c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.m f42987d;

    /* compiled from: DecodeBase64ImageTask.kt */
    /* renamed from: j6.b$a */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C6.i f42989h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6.i iVar) {
            super(0);
            this.f42989h = iVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            RunnableC5197b.this.f42987d.invoke(this.f42989h);
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC5197b(String rawBase64string, boolean z10, p9.l<? super C6.i, C1992A> lVar) {
        kotlin.jvm.internal.l.f(rawBase64string, "rawBase64string");
        this.f42985b = rawBase64string;
        this.f42986c = z10;
        this.f42987d = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // java.lang.Runnable
    public final void run() {
        String strSubstring;
        Bitmap bitmapDecodeByteArray;
        String str = this.f42985b;
        if (y9.n.a0(str, "data:", false)) {
            strSubstring = str.substring(y9.q.f0(str, ',', 0, 6) + 1);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
        } else {
            strSubstring = str;
        }
        try {
            byte[] bytes = Base64.decode(strSubstring, 0);
            C6.i aVar = null;
            if (y9.n.a0(str, "data:image/svg", false)) {
                kotlin.jvm.internal.l.e(bytes, "bytes");
                PictureDrawable pictureDrawableV = new E.u(9).v(new ByteArrayInputStream(bytes));
                if (pictureDrawableV == null) {
                    pictureDrawableV = null;
                }
                if (pictureDrawableV != null) {
                    aVar = new i.b(pictureDrawableV);
                }
            } else {
                kotlin.jvm.internal.l.e(bytes, "bytes");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
                } catch (IllegalArgumentException unused) {
                    int i = C4421b.f38269a;
                    C4421b.a(C7.a.ERROR);
                    bitmapDecodeByteArray = null;
                }
                if (bitmapDecodeByteArray == null) {
                    bitmapDecodeByteArray = null;
                }
                if (bitmapDecodeByteArray != null) {
                    aVar = new i.a(bitmapDecodeByteArray);
                }
            }
            if (this.f42986c) {
                this.f42987d.invoke(aVar);
                return;
            }
            Handler handler = o7.d.f44878a;
            o7.d.f44878a.post(new C8.a(new a(aVar)));
        } catch (IllegalArgumentException unused2) {
            int i10 = C4421b.f38269a;
            C4421b.a(C7.a.ERROR);
        }
    }
}
