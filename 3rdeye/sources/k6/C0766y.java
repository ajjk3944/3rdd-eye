package K6;

import H6.C0675l;
import K6.C0762w;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import w6.C5738b;

/* compiled from: DivBackgroundBinder.kt */
/* renamed from: K6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766y extends j6.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j7.c f3713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0762w.a.c f3714b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0766y(C0675l c0675l, j7.c cVar, C0762w.a.c cVar2) {
        super(c0675l);
        this.f3713a = cVar;
        this.f3714b = cVar2;
    }

    @Override // w6.C5739c
    public final void c(C5738b c5738b) {
        NinePatch ninePatch;
        Rect rect = this.f3714b.f3687b;
        int i = rect.bottom;
        j7.c cVar = this.f3713a;
        cVar.f43085a = i;
        cVar.invalidateSelf();
        cVar.f43086b = rect.left;
        cVar.invalidateSelf();
        cVar.f43087c = rect.right;
        cVar.invalidateSelf();
        cVar.f43088d = rect.top;
        cVar.invalidateSelf();
        Bitmap bitmap = c5738b.f47495a;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = cVar.f43085a;
            int i11 = cVar.f43086b;
            int i12 = cVar.f43087c;
            int i13 = cVar.f43088d;
            int i14 = height - i10;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.put((byte) 2);
            byteBufferOrder.put((byte) 2);
            byteBufferOrder.put((byte) 9);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(0);
            byteBufferOrder.putInt(i11);
            byteBufferOrder.putInt(width - i12);
            byteBufferOrder.putInt(i13);
            byteBufferOrder.putInt(i14);
            for (int i15 = 0; i15 < 9; i15++) {
                byteBufferOrder.putInt(1);
            }
            byte[] bArrArray = byteBufferOrder.array();
            kotlin.jvm.internal.l.e(bArrArray, "allocate(allocationSize)…   }\n            .array()");
            ninePatch = new NinePatch(bitmap, bArrArray);
        } else {
            ninePatch = null;
        }
        cVar.f43089e = ninePatch;
        cVar.invalidateSelf();
    }
}
