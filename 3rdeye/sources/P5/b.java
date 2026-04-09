package P5;

import com.zipoapps.premiumhelper.d;
import java.io.IOException;
import java.io.InputStream;
import ra.c;
import ra.h;
import ra.i;

/* compiled from: AssetsZoneRulesInitializer.java */
/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: c, reason: collision with root package name */
    public final d f10655c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10656d = "org/threeten/bp/TZDB.dat";

    public b(d dVar) {
        this.f10655c = dVar;
    }

    @Override // ra.h
    public final void a() throws IOException {
        String str = this.f10656d;
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.f10655c.getAssets().open(str);
                c cVar = new c(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                i.d(cVar);
            } catch (IOException e4) {
                throw new IllegalStateException(str + " missing from assets", e4);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
