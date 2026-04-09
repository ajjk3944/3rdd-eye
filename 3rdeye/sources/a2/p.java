package A2;

import android.content.Context;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.AppDatabase;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import java.util.List;
import w1.k;

/* compiled from: Repository.java */
/* loaded from: classes.dex */
public enum p {
    INSTANCE;

    private static final String DATABASE_NAME = "DATABASE_NAME";
    private static final String TAG = p.class.getName();
    private AppDatabase roomDB;

    public void ClearAllChat() {
        this.roomDB.s().j();
    }

    public int countTrackInfos() {
        return this.roomDB.s().i();
    }

    public void deleteTrack(Model model) {
        this.roomDB.s().e(model);
    }

    public List<Model> findAll() {
        return this.roomDB.s().k();
    }

    public List<Model> findPackageAll(String str) {
        return this.roomDB.s().h(str);
    }

    public void init(Context context) {
        k.a aVarA = w1.h.a(context, AppDatabase.class, DATABASE_NAME);
        aVarA.i = true;
        aVarA.f47256p = false;
        aVarA.f47257q = true;
        this.roomDB = (AppDatabase) aVarA.b();
    }

    public void saveTrack(List<Model> list) {
        this.roomDB.s().g(list);
    }

    public void updateTrack(Model model) {
        this.roomDB.s().d(model);
    }

    public void deleteTrack(String str) {
        this.roomDB.s().a(str);
    }

    public List<Model> findAll(String str) {
        return this.roomDB.s().f(str);
    }

    public void saveTrack(Model model) {
        this.roomDB.s().c(model);
    }

    public List<Model> findAll(String str, String str2) {
        return this.roomDB.s().b(str, str2);
    }
}
