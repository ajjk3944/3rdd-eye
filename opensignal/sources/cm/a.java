package cm;

import android.content.SharedPreferences;
import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3996a;

    public a(SharedPreferences sharedPreferences) {
        l.e(sharedPreferences, "sharedPreferences");
        this.f3996a = sharedPreferences;
    }

    public final boolean a() {
        return this.f3996a.getInt("key_data_collection_method", 0) == 2;
    }

    public final void b(boolean z10) {
        int i10 = z10 ? 2 : 0;
        SharedPreferences.Editor editorEdit = this.f3996a.edit();
        editorEdit.putInt("key_data_collection_method", i10);
        editorEdit.apply();
    }
}
