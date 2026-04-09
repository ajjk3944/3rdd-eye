package androidx.camera.extensions;

import C.InterfaceC0631s;
import C.S;
import androidx.camera.extensions.impl.InitializerImpl;
import o0.b;

/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15131a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static ExtensionsManager f15132b;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$1, reason: invalid class name */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ InterfaceC0631s val$cameraProvider;
        final /* synthetic */ b.a val$completer;

        public AnonymousClass1(b.a aVar, InterfaceC0631s interfaceC0631s) {
            this.val$completer = aVar;
            this.val$cameraProvider = interfaceC0631s;
        }

        public void onFailure(int i) {
            S.b("ExtensionsManager", "Failed to initialize extensions");
            b.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            aVar.b(ExtensionsManager.a());
        }

        public void onSuccess() {
            S.a("ExtensionsManager", "Successfully initialized extensions");
            b.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            aVar.b(ExtensionsManager.a());
        }
    }

    /* renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ b.a val$completer;

        public AnonymousClass2(b.a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i) {
            this.val$completer.d(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.b(null);
        }
    }

    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    public static ExtensionsManager a() {
        synchronized (f15131a) {
            try {
                ExtensionsManager extensionsManager = f15132b;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager();
                f15132b = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
