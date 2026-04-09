package t2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.E4;
import com.google.android.gms.internal.ads.F4;
import java.io.IOException;
import o1.InterfaceC2753a;
import u1.C2944B;
import x.AbstractC2984e;
import x.C2983d;
import x.C2985f;

/* loaded from: classes.dex */
public final class q implements E4, u1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23647a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23648b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23649c;

    public /* synthetic */ q(Object obj, int i, Object obj2) {
        this.f23647a = i;
        this.f23648b = obj;
        this.f23649c = obj2;
    }

    public static C2944B d(ImageDecoder.Source source, int i, int i3, l1.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new t1.b(i, i3, hVar));
        if (w1.a.d(drawableDecodeDrawable)) {
            return new C2944B(2, w1.a.b(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    @Override // com.google.android.gms.internal.ads.E4
    public void a(F4 f42) {
        String str = (String) this.f23648b;
        String string = f42.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        u2.k.h(sb.toString());
        ((s) this.f23649c).b(null);
    }

    @Override // u1.o
    public void b(Bitmap bitmap, InterfaceC2753a interfaceC2753a) throws IOException {
        IOException iOException = ((H1.e) this.f23649c).f1761b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC2753a.e(bitmap);
            throw iOException;
        }
    }

    @Override // u1.o
    public void c() {
        u1.y yVar = (u1.y) this.f23648b;
        synchronized (yVar) {
            yVar.f23780c = yVar.f23778a.length;
        }
    }

    public String toString() {
        switch (this.f23647a) {
            case 3:
                String string = "[ ";
                if (((C2985f) this.f23648b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbA = AbstractC2984e.a(string);
                        sbA.append(((C2985f) this.f23648b).f24027h[i]);
                        sbA.append(" ");
                        string = sbA.toString();
                    }
                }
                StringBuilder sbB = AbstractC2984e.b(string, "] ");
                sbB.append((C2985f) this.f23648b);
                return sbB.toString();
            default:
                return super.toString();
        }
    }

    public q(u uVar, String str, s sVar) {
        this.f23647a = 0;
        this.f23648b = str;
        this.f23649c = sVar;
    }

    public q(C2983d c2983d) {
        this.f23647a = 3;
        this.f23649c = c2983d;
    }
}
