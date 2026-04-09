package u4;

import A4.C;
import A4.t;
import B4.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import o4.q;

/* renamed from: u4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8134d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f62699a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62700b;

    public C8134d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f62700b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f62699a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f62699a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // o4.q
    public void a(C c10) throws IOException {
        if (!this.f62699a.putString(this.f62700b, k.b(c10.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // o4.q
    public void b(t tVar) throws IOException {
        if (!this.f62699a.putString(this.f62700b, k.b(tVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
