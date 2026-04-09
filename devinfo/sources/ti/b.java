package ti;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34660a;

    public final void a(d dVar, ZipFile zipFile) {
        switch (this.f34660a) {
            case 0:
                if (zipFile.getEntry("lib/arm64-v8a") == null) {
                    if (zipFile.getEntry("lib/armeabi-v7a") == null) {
                        if (zipFile.getEntry("lib/armeabi") == null) {
                            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                            if (enumerationEntries != null) {
                                HashSet hashSet = new HashSet();
                                while (enumerationEntries.hasMoreElements()) {
                                    String name = enumerationEntries.nextElement().getName();
                                    if (name != null && name.startsWith("lib/")) {
                                        if (name.startsWith("lib/arm64-v8a/")) {
                                            dVar.f34662a = 1;
                                            break;
                                        } else if (name.startsWith("lib/armeabi-v7a")) {
                                            hashSet.add(2);
                                        } else if (name.startsWith("lib/armeabi")) {
                                            hashSet.add(3);
                                        }
                                    }
                                }
                                if (!hashSet.contains(2)) {
                                    if (hashSet.contains(3)) {
                                        dVar.f34662a = 3;
                                        break;
                                    }
                                } else {
                                    dVar.f34662a = 2;
                                    break;
                                }
                            }
                            dVar.f34662a = 0;
                            break;
                        } else {
                            dVar.f34662a = 3;
                            break;
                        }
                    } else {
                        dVar.f34662a = 2;
                        break;
                    }
                } else {
                    dVar.f34662a = 1;
                    break;
                }
                break;
            case 1:
                dVar.f34663b = e.f(zipFile, "libreactnativejni.so");
                break;
            case 2:
                dVar.f34664c = e.f(zipFile, "libflutter.so");
                break;
            case 3:
                dVar.f34665d = e.f(zipFile, "libunity.so");
                break;
            default:
                dVar.f34666e = e.f(zipFile, "libUE4.so");
                break;
        }
    }
}
