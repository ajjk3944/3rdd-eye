package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import u1.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0488c f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4059c;

    /* renamed from: d, reason: collision with root package name */
    public final RoomDatabase.c f4060d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4061e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4062f;

    /* renamed from: g, reason: collision with root package name */
    public final RoomDatabase.JournalMode f4063g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f4064h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4065i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4066j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4067k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4068l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f4069m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4070n;

    /* renamed from: o, reason: collision with root package name */
    public final File f4071o;

    public a(Context context, String str, c.InterfaceC0488c interfaceC0488c, RoomDatabase.c cVar, List list, boolean z10, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set set, String str2, File file) {
        this.f4057a = interfaceC0488c;
        this.f4058b = context;
        this.f4059c = str;
        this.f4060d = cVar;
        this.f4061e = list;
        this.f4062f = z10;
        this.f4063g = journalMode;
        this.f4064h = executor;
        this.f4065i = executor2;
        this.f4066j = z11;
        this.f4067k = z12;
        this.f4068l = z13;
        this.f4069m = set;
        this.f4070n = str2;
        this.f4071o = file;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f4068l) && this.f4067k && ((set = this.f4069m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
