package y0;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class z implements Iterable<Intent> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<Intent> f47919b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatActivity f47920c;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public z(AppCompatActivity appCompatActivity) {
        this.f47920c = appCompatActivity;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f47919b.iterator();
    }
}
