package r1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2874d implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23341a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23342b;

    public /* synthetic */ C2874d(int i, Object obj) {
        this.f23341a = i;
        this.f23342b = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f23341a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f23342b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f23341a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        switch (this.f23341a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f23341a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) {
        switch (this.f23341a) {
            case 0:
                try {
                    cVar.f(H1.b.a((File) this.f23342b));
                    break;
                } catch (IOException e6) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e6);
                    }
                    cVar.d(e6);
                    return;
                }
            default:
                cVar.f(this.f23342b);
                break;
        }
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
