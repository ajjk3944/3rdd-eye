package B2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC1762o;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y2.C5799a;

/* compiled from: FolderFragment.java */
/* loaded from: classes.dex */
public class e extends ComponentCallbacksC1759l {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f396b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f397c;

    /* renamed from: d, reason: collision with root package name */
    public RelativeLayout f398d;

    /* renamed from: e, reason: collision with root package name */
    public ActivityC1762o f399e;

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_folder, viewGroup, false);
        this.f399e = getActivity();
        this.f398d = (RelativeLayout) viewInflate.findViewById(R.id.not_found);
        this.f397c = new ArrayList();
        this.f396b = (RecyclerView) viewInflate.findViewById(R.id.gallery_recycler);
        this.f397c.clear();
        File[] fileArrListFiles = new File(I2.b.f2413a).listFiles();
        if (fileArrListFiles == null) {
            this.f398d.setVisibility(0);
            return viewInflate;
        }
        Arrays.sort(fileArrListFiles, new d(0));
        Collections.addAll(this.f397c, fileArrListFiles);
        try {
            if (this.f397c.isEmpty()) {
                this.f398d.setVisibility(0);
            } else {
                this.f398d.setVisibility(8);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f396b.setLayoutManager(new LinearLayoutManager(1));
        this.f396b.setAdapter(new C5799a(this.f399e, this.f397c));
        return viewInflate;
    }
}
