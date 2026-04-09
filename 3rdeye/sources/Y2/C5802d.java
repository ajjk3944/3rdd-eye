package y2;

import B2.i;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1762o;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.ImagePagerActivity;
import com.bumptech.glide.k;
import com.zipoapps.premiumhelper.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.l;

/* compiled from: PhotosAdapter.java */
/* renamed from: y2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5802d extends RecyclerView.h<RecyclerView.F> {

    /* renamed from: j, reason: collision with root package name */
    public final Context f48020j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f48021k;

    /* renamed from: l, reason: collision with root package name */
    public final i f48022l;

    /* compiled from: PhotosAdapter.java */
    /* renamed from: y2.d$a */
    public class a extends RecyclerView.F implements View.OnClickListener {

        /* renamed from: l, reason: collision with root package name */
        public final ImageView f48023l;

        /* renamed from: m, reason: collision with root package name */
        public final TextView f48024m;

        /* renamed from: n, reason: collision with root package name */
        public final TextView f48025n;

        /* renamed from: o, reason: collision with root package name */
        public final TextView f48026o;

        public a(View view) {
            super(view);
            this.f48023l = (ImageView) view.findViewById(R.id.imageViewSelfie);
            this.f48024m = (TextView) view.findViewById(R.id.date);
            this.f48026o = (TextView) view.findViewById(R.id.name);
            this.f48025n = (TextView) view.findViewById(R.id.time);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5802d c5802d = C5802d.this;
            int adapterPosition = getAdapterPosition();
            i iVar = c5802d.f48022l;
            int size = iVar.f409e.size();
            if (adapterPosition == size - 1 || adapterPosition == size - 2) {
                Intent intent = new Intent(iVar.f406b, (Class<?>) ImagePagerActivity.class);
                intent.putExtra("position", adapterPosition);
                iVar.startActivity(intent);
                return;
            }
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            if (e.a.a().i.j()) {
                Intent intent2 = new Intent(iVar.f406b, (Class<?>) ImagePagerActivity.class);
                intent2.putExtra("position", adapterPosition);
                iVar.startActivity(intent2);
            } else {
                ActivityC1762o activity = iVar.getActivity();
                l.f(activity, "activity");
                e.a.a();
                com.zipoapps.premiumhelper.e.j(activity, "photos_fragment");
            }
        }
    }

    public C5802d(Context context, ArrayList arrayList, i iVar) {
        this.f48020j = context;
        this.f48021k = arrayList;
        this.f48022l = iVar;
        context.getSharedPreferences("PRIVATE", 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f48021k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        return 13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        a aVar = (a) f10;
        ArrayList arrayList = this.f48021k;
        long jLastModified = ((File) arrayList.get(i)).lastModified();
        String string = DateFormat.format("dd/MM/yyyy", new Date(jLastModified)).toString();
        String string2 = DateFormat.format("hh:mm aa", new Date(jLastModified)).toString();
        aVar.f48024m.setText(string);
        aVar.f48025n.setText(string2);
        String name = ((File) arrayList.get(i)).getName();
        TextView textView = aVar.f48026o;
        textView.setText(name);
        textView.setText(name.substring(0, 21));
        int size = arrayList.size();
        int i10 = size - 1;
        ImageView imageView = aVar.f48023l;
        Context context = this.f48020j;
        if (i == i10 || i == size - 2) {
            com.bumptech.glide.l lVarD = com.bumptech.glide.b.d(context);
            File file = (File) arrayList.get(i);
            lVarD.getClass();
            new k(lVarD.f22280b, lVarD, Drawable.class, lVarD.f22281c).x(file).v(imageView);
            return;
        }
        com.bumptech.glide.l lVarD2 = com.bumptech.glide.b.d(context);
        File file2 = (File) arrayList.get(i);
        lVarD2.getClass();
        new k(lVarD2.f22280b, lVarD2, Drawable.class, lVarD2.f22281c).x(file2).i(13, 13).v(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_intruder_selfie, viewGroup, false));
    }
}
