package B2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.HelpIntro;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import y2.C5802d;

/* compiled from: PhotosFragment.java */
/* loaded from: classes.dex */
public class i extends ComponentCallbacksC1759l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f406b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView f407c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f408d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f409e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintLayout f410f;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.how) {
            startActivity(new Intent(this.f406b, (Class<?>) HelpIntro.class));
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_photos, viewGroup, false);
        Context context = getContext();
        this.f406b = context;
        context.getSharedPreferences("PRIVATE", 0);
        this.f407c = (RecyclerView) viewInflate.findViewById(R.id.recyclerViewPhotos);
        this.f410f = (ConstraintLayout) viewInflate.findViewById(R.id.not_found);
        viewInflate.findViewById(R.id.how).setOnClickListener(this);
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onResume() {
        super.onResume();
        this.f408d = new ArrayList();
        this.f409e = new ArrayList();
        this.f407c.setLayoutManager(new LinearLayoutManager(1));
        this.f407c.setAdapter(new C5802d(this.f406b, this.f409e, this));
        File[] fileArrListFiles = new File(I2.b.f2414b).listFiles();
        if (fileArrListFiles == null) {
            this.f410f.setVisibility(0);
            return;
        }
        Arrays.sort(fileArrListFiles, new h(0));
        Collections.addAll(this.f408d, fileArrListFiles);
        Iterator it = this.f408d.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!file.getName().contains(".nomedia")) {
                this.f409e.add(file);
            }
        }
        try {
            if (this.f409e.isEmpty()) {
                this.f410f.setVisibility(0);
            } else {
                this.f410f.setVisibility(8);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
