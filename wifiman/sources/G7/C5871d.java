package g7;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: g7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5871d {

    /* renamed from: a, reason: collision with root package name */
    public static final C5871d f47726a = new C5871d();

    private C5871d() {
    }

    public final int a(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Z7.b.e("Error compiling shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader), null, null, 6, null);
                GLES20.glDeleteShader(iGlCreateShader);
                iGlCreateShader = 0;
            }
        }
        if (iGlCreateShader != 0) {
            return iGlCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    public final String b(Context context, int i10) throws Resources.NotFoundException, IOException {
        AbstractC6492s.i(context, "context");
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
        AbstractC6492s.h(inputStreamOpenRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                sb2.append(line);
                sb2.append('\n');
            } catch (IOException unused) {
                return null;
            }
        }
    }
}
