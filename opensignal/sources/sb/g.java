package sb;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f21957i = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    public static final String[] j = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    public static final float[] k = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f21958l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f21959m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f21960a;

    /* renamed from: b, reason: collision with root package name */
    public b5.m f21961b;

    /* renamed from: c, reason: collision with root package name */
    public int f21962c;

    /* renamed from: d, reason: collision with root package name */
    public int f21963d;

    /* renamed from: e, reason: collision with root package name */
    public int f21964e;

    /* renamed from: f, reason: collision with root package name */
    public int f21965f;

    /* renamed from: g, reason: collision with root package name */
    public int f21966g;

    /* renamed from: h, reason: collision with root package name */
    public int f21967h;

    public static boolean a(f fVar) {
        e eVar = fVar.f21953a;
        e eVar2 = fVar.f21954b;
        b5.m[] mVarArr = eVar.f21952a;
        if (mVarArr.length == 1 && mVarArr[0].f2457a == 0) {
            b5.m[] mVarArr2 = eVar2.f21952a;
            if (mVarArr2.length == 1 && mVarArr2[0].f2457a == 0) {
                return true;
            }
        }
        return false;
    }
}
