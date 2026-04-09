package y2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.fragment.app.ActivityC1762o;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.zipoapps.premiumhelper.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import z0.C5849b;

/* compiled from: GalleryAdapter.java */
/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5799a extends RecyclerView.h<RecyclerView.F> {

    /* renamed from: j, reason: collision with root package name */
    public final ActivityC1762o f48007j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f48008k;

    /* renamed from: l, reason: collision with root package name */
    public File f48009l;

    /* compiled from: GalleryAdapter.java */
    /* renamed from: y2.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0556a extends RecyclerView.F implements View.OnClickListener {

        /* renamed from: l, reason: collision with root package name */
        public final ImageView f48010l;

        /* renamed from: m, reason: collision with root package name */
        public final TextView f48011m;

        /* renamed from: n, reason: collision with root package name */
        public final TextView f48012n;

        public ViewOnClickListenerC0556a(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            this.f48010l = imageView;
            this.f48011m = (TextView) view.findViewById(R.id.name);
            this.f48012n = (TextView) view.findViewById(R.id.date);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.delete);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.share);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bottom_lay);
            imageView.setOnClickListener(this);
            imageView2.setOnClickListener(this);
            imageView3.setOnClickListener(this);
            linearLayout.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            C5799a c5799a = C5799a.this;
            switch (id) {
                case R.id.bottom_lay /* 2131362007 */:
                case R.id.image /* 2131362289 */:
                    File file = (File) c5799a.f48008k.get(getAdapterPosition());
                    c5799a.f48009l = file;
                    String path = file.getPath();
                    ActivityC1762o activityC1762o = c5799a.f48007j;
                    Uri uriForFile = Build.VERSION.SDK_INT >= 30 ? C5849b.getUriForFile(activityC1762o, "com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.provider", new File(path)) : Uri.parse(path);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriForFile, "video/*");
                    intent.addFlags(1);
                    try {
                        activityC1762o.startActivity(intent);
                        break;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        Toast.makeText(activityC1762o, activityC1762o.getResources().getString(R.string.app_not_found), 0).show();
                        return;
                    }
                case R.id.delete /* 2131362116 */:
                    d.a aVar = new d.a(c5799a.f48007j);
                    AlertController.b bVar = aVar.f14344a;
                    bVar.f14319f = bVar.f14314a.getText(R.string.are_you_sure_delete);
                    aVar.b(c5799a.f48007j.getResources().getString(R.string.yes_text), new C2.b(this, 1));
                    bVar.i = bVar.f14314a.getText(R.string.no);
                    bVar.f14322j = null;
                    aVar.a().show();
                    break;
                case R.id.share /* 2131362692 */:
                    String path2 = c5799a.f48009l.getPath();
                    ActivityC1762o activityC1762o2 = c5799a.f48007j;
                    Uri uriForFile2 = Build.VERSION.SDK_INT >= 30 ? C5849b.getUriForFile(activityC1762o2, "com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.provider", new File(path2)) : Uri.parse(path2);
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("video/*");
                    intent2.putExtra("android.intent.extra.STREAM", uriForFile2);
                    try {
                        com.zipoapps.premiumhelper.e.f37006D.getClass();
                        e.a.a().f();
                        activityC1762o2.startActivity(intent2);
                        break;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Toast.makeText(activityC1762o2, activityC1762o2.getResources().getString(R.string.app_not_found), 0).show();
                        return;
                    }
            }
        }
    }

    public C5799a(ActivityC1762o activityC1762o, ArrayList arrayList) {
        this.f48007j = activityC1762o;
        this.f48008k = arrayList;
        activityC1762o.getSharedPreferences("PRIVATE", 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f48008k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        ViewOnClickListenerC0556a viewOnClickListenerC0556a = (ViewOnClickListenerC0556a) f10;
        File file = (File) this.f48008k.get(i);
        this.f48009l = file;
        if (file.getName().contains(".mp4")) {
            String string = DateFormat.format("hh:mm aa dd/MM/yyyy", new Date(this.f48009l.lastModified())).toString();
            l lVarD = com.bumptech.glide.b.d(this.f48007j.getApplicationContext());
            String path = this.f48009l.getPath();
            lVarD.getClass();
            new k(lVarD.f22280b, lVarD, Drawable.class, lVarD.f22281c).x(path).v(viewOnClickListenerC0556a.f48010l);
            viewOnClickListenerC0556a.f48011m.setText(this.f48009l.getName());
            viewOnClickListenerC0556a.f48012n.setText(string);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC0556a(LayoutInflater.from(this.f48007j).inflate(R.layout.gallery_item, viewGroup, false));
    }
}
