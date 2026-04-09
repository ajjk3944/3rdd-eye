package a4;

import android.os.Handler;
import android.os.Looper;
import com.lefan.base.activity.LanguageActivity;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final k f4687a;

    /* renamed from: b, reason: collision with root package name */
    public final v f4688b;

    /* renamed from: c, reason: collision with root package name */
    public final s f4689c;

    /* renamed from: d, reason: collision with root package name */
    public final l f4690d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f4691e = new Handler(Looper.getMainLooper());

    public e(k kVar, v vVar, s sVar, l lVar) {
        this.f4687a = kVar;
        this.f4688b = vVar;
        this.f4689c = sVar;
        this.f4690d = lVar;
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((Locale) obj).toLanguageTag());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    @Override // a4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c3.j a(V2.h r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.e.a(V2.h):c3.j");
    }

    @Override // a4.b
    public final synchronized void b(LanguageActivity languageActivity) {
        this.f4688b.a(languageActivity);
    }

    @Override // a4.b
    public final synchronized void c(LanguageActivity languageActivity) {
        this.f4688b.b(languageActivity);
    }
}
