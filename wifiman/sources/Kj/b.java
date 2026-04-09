package Kj;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10895a = "b";

    class a implements InterfaceC0436b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f10896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AssetFileDescriptor f10897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f10898c;

        a(c cVar, AssetFileDescriptor assetFileDescriptor, Object obj) {
            this.f10896a = cVar;
            this.f10897b = assetFileDescriptor;
            this.f10898c = obj;
        }

        @Override // Kj.b.InterfaceC0436b
        public long a() {
            return this.f10896a.a(this.f10897b.getParcelFileDescriptor().getFd(), this.f10897b.getLength(), this.f10897b.getStartOffset(), this.f10898c);
        }
    }

    /* renamed from: Kj.b$b, reason: collision with other inner class name */
    public interface InterfaceC0436b {
        long a();
    }

    public interface c {
        long a(int i10, long j10, long j11, Object obj);
    }

    public static long a(Context context, c cVar, String str, String str2, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str2);
        try {
            long jB = b(new a(cVar, assetFileDescriptorOpenFd, obj), str);
            if (assetFileDescriptorOpenFd != null) {
                assetFileDescriptorOpenFd.close();
            }
            return jB;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static long b(InterfaceC0436b interfaceC0436b, String str) {
        c(str);
        try {
            return interfaceC0436b.a();
        } catch (RuntimeException e10) {
            String str2 = "Error getting native address of native library: " + str;
            Log.e(f10895a, str2, e10);
            throw new IllegalStateException(str2, e10);
        }
    }

    public static void c(String str) {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e10) {
            String str2 = "Error loading native library: " + str;
            Log.e(f10895a, str2, e10);
            throw new UnsatisfiedLinkError(str2);
        }
    }
}
