package rb;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class h implements GLSurfaceView.Renderer {
    public static final String[] D = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer E = qb.b.p(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final i f21484a;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f21485d = new int[3];

    /* renamed from: g, reason: collision with root package name */
    public final int[] f21486g = new int[3];

    /* renamed from: r, reason: collision with root package name */
    public final int[] f21487r = new int[3];

    /* renamed from: x, reason: collision with root package name */
    public final int[] f21488x = new int[3];

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f21489y = new AtomicReference();

    public h(i iVar) {
        this.f21484a = iVar;
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = this.f21487r;
            this.f21488x[i10] = -1;
            iArr[i10] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f21489y.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int iO = qb.b.o("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
        this.B = iO;
        GLES20.glUseProgram(iO);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.B, "in_pos");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) E);
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.B, "in_tc_y");
        int[] iArr = this.f21486g;
        iArr[0] = iGlGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        int iGlGetAttribLocation3 = GLES20.glGetAttribLocation(this.B, "in_tc_u");
        iArr[1] = iGlGetAttribLocation3;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation3);
        int iGlGetAttribLocation4 = GLES20.glGetAttribLocation(this.B, "in_tc_v");
        iArr[2] = iGlGetAttribLocation4;
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation4);
        qb.b.h();
        GLES20.glGetUniformLocation(this.B, "mColorConversion");
        qb.b.h();
        int[] iArr2 = this.f21485d;
        GLES20.glGenTextures(3, iArr2, 0);
        for (int i10 = 0; i10 < 3; i10++) {
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.B, D[i10]), i10);
            GLES20.glActiveTexture(33984 + i10);
            GLES20.glBindTexture(3553, iArr2[i10]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        qb.b.h();
        qb.b.h();
    }
}
