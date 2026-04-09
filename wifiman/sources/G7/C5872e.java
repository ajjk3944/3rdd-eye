package g7;

import Yg.s;
import Yg.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: g7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5872e {

    /* renamed from: a, reason: collision with root package name */
    public static final C5872e f47727a = new C5872e();

    /* renamed from: g7.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f47728a;

        /* renamed from: b, reason: collision with root package name */
        private final int f47729b;

        /* renamed from: c, reason: collision with root package name */
        private final int f47730c;

        public a(int i10, int i11, int i12) {
            this.f47728a = i10;
            this.f47729b = i11;
            this.f47730c = i12;
        }

        public final int a() {
            return this.f47728a;
        }

        public final int b() {
            return this.f47730c;
        }

        public final int c() {
            return this.f47729b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47728a == aVar.f47728a && this.f47729b == aVar.f47729b && this.f47730c == aVar.f47730c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f47728a) * 31) + Integer.hashCode(this.f47729b)) * 31) + Integer.hashCode(this.f47730c);
        }

        public String toString() {
            return "TextureHandle(handle=" + this.f47728a + ", width=" + this.f47729b + ", height=" + this.f47730c + ")";
        }
    }

    private C5872e() {
    }

    private final int a(BitmapFactory.Options options, int i10, int i11) {
        s sVarA = z.a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) sVarA.a()).intValue();
        int iIntValue2 = ((Number) sVarA.c()).intValue();
        int i12 = 1;
        if (iIntValue > i11 || iIntValue2 > i10) {
            int i13 = iIntValue / 2;
            int i14 = iIntValue2 / 2;
            while (i13 / i12 >= i11 && i14 / i12 >= i10) {
                i12 *= 2;
            }
        }
        return i12;
    }

    public final Bitmap b(Resources res, int i10, int i11, int i12) {
        AbstractC6492s.i(res, "res");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, i10, options);
        options.inSampleSize = f47727a.a(options, i11, i12);
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(res, i10, options);
        AbstractC6492s.h(bitmapDecodeResource, "run(...)");
        return bitmapDecodeResource;
    }

    public final a c(Context context, int i10, Integer num) {
        Bitmap bitmapDecodeResource;
        AbstractC6492s.i(context, "context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] == 0) {
            throw new RuntimeException("Error generating texture name.");
        }
        if (num != null) {
            Resources resources = context.getResources();
            AbstractC6492s.h(resources, "getResources(...)");
            bitmapDecodeResource = b(resources, i10, num.intValue(), num.intValue());
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i10, options);
        }
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
        a aVar = new a(iArr[0], bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        bitmapDecodeResource.recycle();
        return aVar;
    }
}
