package m0;

import android.graphics.Shader;

/* renamed from: m0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6715m0 {

    /* renamed from: m0.m0$a */
    public static final class a extends e1 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Shader f52934e;

        a(Shader shader) {
            this.f52934e = shader;
        }

        @Override // m0.e1
        public Shader b(long j10) {
            return this.f52934e;
        }
    }

    public static final e1 a(Shader shader) {
        return new a(shader);
    }
}
