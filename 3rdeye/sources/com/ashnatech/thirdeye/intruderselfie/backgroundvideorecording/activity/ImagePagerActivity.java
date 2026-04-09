package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity;

import I2.b;
import O4.C1463i;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import x2.AbstractActivityC5757a;
import x2.g;
import y2.C5803e;
import z0.C5849b;

/* loaded from: classes.dex */
public class ImagePagerActivity extends AbstractActivityC5757a implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f22079k = 0;

    /* renamed from: e, reason: collision with root package name */
    public ViewPager f22080e;

    /* renamed from: f, reason: collision with root package name */
    public C5803e f22081f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f22082g;

    /* renamed from: h, reason: collision with root package name */
    public int f22083h;
    public Dialog i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f22084j;

    @Override // x2.AbstractActivityC5757a
    public final int k() {
        return R.layout.activity_image_pager;
    }

    @Override // x2.AbstractActivityC5757a
    public final void l() throws Resources.NotFoundException {
        getSharedPreferences("PRIVATE", 0);
        this.f22082g = new ArrayList();
        this.f22084j = new ArrayList();
        findViewById(R.id.delete).setOnClickListener(this);
        findViewById(R.id.share).setOnClickListener(this);
        findViewById(R.id.back).setOnClickListener(this);
        this.f22083h = getIntent().getIntExtra("position", -1);
        File[] fileArrListFiles = new File(b.f2414b).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, new C1463i(1));
        Collections.addAll(this.f22082g, fileArrListFiles);
        Iterator it = this.f22082g.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!file.getName().contains(".nomedia")) {
                this.f22084j.add(file);
            }
        }
        this.f22080e = (ViewPager) findViewById(R.id.view_pager);
        C5803e c5803e = new C5803e(this, this.f22084j);
        this.f22081f = c5803e;
        this.f22080e.setAdapter(c5803e);
        this.f22080e.setCurrentItem(this.f22083h);
        this.f22080e.setOnTouchListener(new g());
        Dialog dialog = new Dialog(this, R.style.Theme_Dialog);
        this.i = dialog;
        dialog.setContentView(R.layout.delete_layout);
        this.i.findViewById(R.id.yes).setOnClickListener(this);
        this.i.findViewById(R.id.no).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back /* 2131361972 */:
                finish();
                break;
            case R.id.delete /* 2131362116 */:
                this.i.show();
                break;
            case R.id.no /* 2131362512 */:
                this.i.dismiss();
                break;
            case R.id.share /* 2131362692 */:
                Uri uriForFile = C5849b.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", new File(((File) this.f22082g.get(this.f22080e.getCurrentItem())).getPath()));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.addFlags(1);
                intent.setType("image/*");
                intent.putExtra("android.intent.extra.STREAM", uriForFile);
                try {
                    e.f37006D.getClass();
                    e.a.a().f();
                    startActivity(intent);
                    break;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    Toast.makeText(this, getResources().getString(R.string.app_not_found), 0).show();
                    return;
                }
            case R.id.yes /* 2131362916 */:
                this.i.dismiss();
                try {
                    int currentItem = this.f22080e.getCurrentItem();
                    Log.i("TAG", "itempos : " + currentItem);
                    ((File) this.f22084j.get(currentItem)).delete();
                    this.f22084j.remove(currentItem);
                    C5803e c5803e = new C5803e(this, this.f22084j);
                    this.f22081f = c5803e;
                    this.f22080e.setAdapter(c5803e);
                    this.f22081f.notifyDataSetChanged();
                    this.f22080e.setCurrentItem(currentItem);
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
