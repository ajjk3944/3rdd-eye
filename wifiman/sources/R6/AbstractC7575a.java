package r6;

import android.graphics.Shader;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC6492s;
import u6.InterfaceC8137b;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7575a implements InterfaceC7576b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f60127a = new HashMap(1);

    @Override // r6.InterfaceC7576b
    public Shader a(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        String strB = b(f10, f11, f12, f13);
        Shader shader = (Shader) this.f60127a.get(strB);
        if (shader != null) {
            return shader;
        }
        Shader shaderC = c(context, f10, f11, f12, f13);
        this.f60127a.clear();
        this.f60127a.put(strB, shaderC);
        return shaderC;
    }

    protected String b(float f10, float f11, float f12, float f13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f10);
        sb2.append(',');
        sb2.append(f11);
        sb2.append(',');
        sb2.append(f12);
        sb2.append(',');
        sb2.append(f13);
        return sb2.toString();
    }

    public abstract Shader c(InterfaceC8137b interfaceC8137b, float f10, float f11, float f12, float f13);
}
