package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import com.yandex.mobile.ads.impl.bm1;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes3.dex */
final class dm1 {
    private static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f26255j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f26256k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f26257a;

    /* renamed from: b, reason: collision with root package name */
    private a f26258b;

    /* renamed from: c, reason: collision with root package name */
    private je0 f26259c;

    /* renamed from: d, reason: collision with root package name */
    private int f26260d;

    /* renamed from: e, reason: collision with root package name */
    private int f26261e;

    /* renamed from: f, reason: collision with root package name */
    private int f26262f;

    /* renamed from: g, reason: collision with root package name */
    private int f26263g;

    /* renamed from: h, reason: collision with root package name */
    private int f26264h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f26265a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f26266b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f26267c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26268d;

        public a(bm1.b bVar) {
            this.f26265a = bVar.a();
            this.f26266b = ke0.a(bVar.f25332c);
            this.f26267c = ke0.a(bVar.f25333d);
            int i = bVar.f25331b;
            if (i == 1) {
                this.f26268d = 5;
            } else if (i != 2) {
                this.f26268d = 4;
            } else {
                this.f26268d = 6;
            }
        }
    }

    public final void a(int i10, float[] fArr) {
        a aVar = this.f26258b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f26257a;
        GLES20.glUniformMatrix3fv(this.f26261e, 1, false, i11 == 1 ? f26255j : i11 == 2 ? f26256k : i, 0);
        GLES20.glUniformMatrix4fv(this.f26260d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f26264h, 0);
        ke0.a();
        GLES20.glVertexAttribPointer(this.f26262f, 3, 5126, false, 12, (Buffer) aVar.f26266b);
        ke0.a();
        GLES20.glVertexAttribPointer(this.f26263g, 2, 5126, false, 8, (Buffer) aVar.f26267c);
        ke0.a();
        GLES20.glDrawArrays(aVar.f26268d, 0, aVar.f26265a);
        ke0.a();
    }

    public final void a() {
        je0 je0Var = new je0();
        this.f26259c = je0Var;
        this.f26260d = je0Var.b("uMvpMatrix");
        this.f26261e = this.f26259c.b("uTexMatrix");
        this.f26262f = this.f26259c.a("aPosition");
        this.f26263g = this.f26259c.a("aTexCoords");
        this.f26264h = this.f26259c.b("uTexture");
    }

    public final void a(bm1 bm1Var) {
        bm1.a aVar = bm1Var.f25325a;
        bm1.a aVar2 = bm1Var.f25326b;
        if (aVar.b() == 1 && aVar.a().f25330a == 0 && aVar2.b() == 1 && aVar2.a().f25330a == 0) {
            this.f26257a = bm1Var.f25327c;
            this.f26258b = new a(bm1Var.f25325a.a());
            if (bm1Var.f25328d) {
                return;
            }
            new a(bm1Var.f25326b.a());
        }
    }
}
