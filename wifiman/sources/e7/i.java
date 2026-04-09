package e7;

import Yg.m;
import Yg.n;
import android.content.Context;
import android.opengl.GLES20;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Frame;
import g7.C5870c;
import g7.C5871d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final a f46240k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final String f46241l = i.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f46242m = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private FloatBuffer f46243a;

    /* renamed from: b, reason: collision with root package name */
    private FloatBuffer f46244b;

    /* renamed from: c, reason: collision with root package name */
    private int f46245c;

    /* renamed from: d, reason: collision with root package name */
    private int f46246d;

    /* renamed from: e, reason: collision with root package name */
    private int f46247e;

    /* renamed from: f, reason: collision with root package name */
    private int f46248f;

    /* renamed from: g, reason: collision with root package name */
    private int f46249g;

    /* renamed from: h, reason: collision with root package name */
    private int f46250h = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46251i = true;

    /* renamed from: j, reason: collision with root package name */
    private final m f46252j = n.b(new InterfaceC6824a() { // from class: e7.h
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return i.b();
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] b() {
        return new float[]{0.0f, 0.0f, 0.0f, 0.6f};
    }

    private final void d() {
        FloatBuffer floatBuffer = this.f46244b;
        AbstractC6492s.f(floatBuffer);
        floatBuffer.position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f46250h);
        GLES20.glUseProgram(this.f46245c);
        GLES20.glUniform1i(this.f46248f, 0);
        GLES20.glUniform4fv(this.f46249g, 1, f(), 0);
        GLES20.glVertexAttribPointer(this.f46246d, 2, 5126, false, 0, (Buffer) this.f46243a);
        GLES20.glVertexAttribPointer(this.f46247e, 2, 5126, false, 0, (Buffer) this.f46244b);
        GLES20.glEnableVertexAttribArray(this.f46246d);
        GLES20.glEnableVertexAttribArray(this.f46247e);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f46246d);
        GLES20.glDisableVertexAttribArray(this.f46247e);
        String TAG = f46241l;
        AbstractC6492s.h(TAG, "TAG");
        C5870c.c(TAG, "BackgroundRendererDraw");
    }

    private final float[] f() {
        return (float[]) this.f46252j.getValue();
    }

    public final void c(Context context) {
        AbstractC6492s.i(context, "context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i10 = iArr[0];
        this.f46250h = i10;
        GLES20.glBindTexture(36197, i10);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        float[] fArr = f46242m;
        if (4 != fArr.length / 2) {
            throw new RuntimeException("Unexpected number of vertices in BackgroundRenderer.");
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f46243a = floatBufferAsFloatBuffer;
        AbstractC6492s.f(floatBufferAsFloatBuffer);
        floatBufferAsFloatBuffer.put(fArr);
        FloatBuffer floatBuffer = this.f46243a;
        AbstractC6492s.f(floatBuffer);
        floatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.f46244b = byteBufferAllocateDirect2.asFloatBuffer();
        C5871d c5871d = C5871d.f47726a;
        int iA = c5871d.a(35633, c5871d.b(context, h7.k.f48501b));
        int iA2 = c5871d.a(35632, c5871d.b(context, h7.k.f48500a));
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f46245c = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iA);
        GLES20.glAttachShader(this.f46245c, iA2);
        GLES20.glLinkProgram(this.f46245c);
        GLES20.glUseProgram(this.f46245c);
        this.f46246d = GLES20.glGetAttribLocation(this.f46245c, "a_Position");
        this.f46247e = GLES20.glGetAttribLocation(this.f46245c, "a_TexCoord");
        String TAG = f46241l;
        AbstractC6492s.h(TAG, "TAG");
        C5870c.c(TAG, "Program creation");
        this.f46248f = GLES20.glGetUniformLocation(this.f46245c, "sTexture");
        this.f46249g = GLES20.glGetUniformLocation(this.f46245c, "u_OverlayColor");
        AbstractC6492s.h(TAG, "TAG");
        C5870c.c(TAG, "Program parameters");
    }

    public final void e(Frame frame) {
        AbstractC6492s.i(frame, "frame");
        if (frame.hasDisplayGeometryChanged()) {
            frame.transformCoordinates2d(Coordinates2d.OPENGL_NORMALIZED_DEVICE_COORDINATES, this.f46243a, Coordinates2d.TEXTURE_NORMALIZED, this.f46244b);
        }
        if (frame.getTimestamp() == 0 && this.f46251i) {
            return;
        }
        d();
    }

    public final int g() {
        return this.f46250h;
    }
}
