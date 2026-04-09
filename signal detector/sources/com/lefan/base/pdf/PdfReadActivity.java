package com.lefan.base.pdf;

import D4.a;
import D4.c;
import D4.f;
import F4.b;
import F4.d;
import R.F;
import R.O;
import T2.g;
import a.AbstractC0241a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.EK;
import e.AbstractC2286c;
import h.AbstractActivityC2349g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import q2.C2834o;
import q5.i;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class PdfReadActivity extends AbstractActivityC2349g {

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ int f18779T = 0;

    /* renamed from: P, reason: collision with root package name */
    public RecyclerView f18781P;

    /* renamed from: R, reason: collision with root package name */
    public String f18783R;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f18780O = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public final a f18782Q = new a(R.layout.item_pdf_page, 0);

    /* renamed from: S, reason: collision with root package name */
    public final C2834o f18784S = new C2834o(this);

    public final void C() throws IOException {
        FileInputStream fileInputStream;
        String str = this.f18783R;
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = this.f18783R;
        i.b(str2);
        File file = new File(str2);
        if (file.exists()) {
            int i = Build.VERSION.SDK_INT;
            String str3 = "application/octet-stream";
            if (i >= 29) {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getPath());
                if (fileExtensionFromUrl != null) {
                    Locale locale = Locale.getDefault();
                    i.d(locale, "getDefault(...)");
                    String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                    i.d(lowerCase, "toLowerCase(...)");
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    if (mimeTypeFromExtension != null) {
                        str3 = mimeTypeFromExtension;
                    }
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", file.getName());
                contentValues.put("mime_type", str3);
                contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                if (i >= 30) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                ContentResolver contentResolver = getContentResolver();
                Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert != null) {
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    try {
                        fileInputStream = new FileInputStream(file);
                        if (outputStreamOpenOutputStream == null) {
                            fileInputStream.close();
                            AbstractC0241a.a(outputStreamOpenOutputStream, null);
                        } else {
                            try {
                                g.f(fileInputStream, outputStreamOpenOutputStream);
                                fileInputStream.close();
                                outputStreamOpenOutputStream.close();
                                if (i >= 30) {
                                    contentValues.clear();
                                    contentValues.put("is_pending", (Integer) 0);
                                    contentResolver.update(uriInsert, contentValues, null, null);
                                }
                                if (str3.startsWith("image/")) {
                                    sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriInsert));
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC0241a.a(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                }
            } else {
                String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(file.getPath());
                if (fileExtensionFromUrl2 != null) {
                    Locale locale2 = Locale.getDefault();
                    i.d(locale2, "getDefault(...)");
                    String lowerCase2 = fileExtensionFromUrl2.toLowerCase(locale2);
                    i.d(lowerCase2, "toLowerCase(...)");
                    String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    if (mimeTypeFromExtension2 != null) {
                        str3 = mimeTypeFromExtension2;
                    }
                }
                File file2 = new File(str3.startsWith("image/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), file.getName());
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file.exists()) {
                    throw new n5.a(file, null, "The source file doesn't exist.");
                }
                if (file2.exists() && !file2.delete()) {
                    throw new n5.a(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                }
                if (!file.isDirectory()) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    fileInputStream = new FileInputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            g.f(fileInputStream, fileOutputStream);
                            fileOutputStream.close();
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } finally {
                        }
                    }
                } else if (!file2.mkdirs()) {
                    throw new EK(file, file2, "Failed to create target directory.");
                }
            }
            d.b(this, getString(R.string.save_file_success));
            return;
        }
        d.b(this, getString(R.string.save_file_failed));
    }

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.bumptech.glide.d dVarR;
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_pdf_read);
        this.f18781P = (RecyclerView) findViewById(R.id.pdf_recycler);
        View viewFindViewById = findViewById(R.id.appbar);
        i.d(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = this.f18781P;
        if (recyclerView == null) {
            i.g("pdfRecycler");
            throw null;
        }
        d.a(viewFindViewById, recyclerView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.pdf_toolbar);
        B(toolbar);
        String stringExtra = getIntent().getStringExtra("pdf_title");
        if (stringExtra != null && (dVarR = r()) != null) {
            dVarR.X(stringExtra);
        }
        com.bumptech.glide.d dVarR2 = r();
        int i = 1;
        if (dVarR2 != null) {
            dVarR2.S(true);
        }
        toolbar.setNavigationOnClickListener(new B4.g(4, this));
        RecyclerView recyclerView2 = this.f18781P;
        if (recyclerView2 == null) {
            i.g("pdfRecycler");
            throw null;
        }
        b bVar = new b(i);
        WeakHashMap weakHashMap = O.f3270a;
        F.k(recyclerView2, bVar);
        RecyclerView recyclerView3 = this.f18781P;
        if (recyclerView3 == null) {
            i.g("pdfRecycler");
            throw null;
        }
        recyclerView3.setAdapter(this.f18782Q);
        String stringExtra2 = getIntent().getStringExtra("pdf_path");
        this.f18783R = stringExtra2;
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            return;
        }
        AbstractC3046w.l(AbstractC3046w.b(), null, new f(this, stringExtra2, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.base_menu_pdf, menu);
        return true;
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f18780O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) throws IOException {
        i.e(menuItem, "item");
        String str = this.f18783R;
        if (str == null || str.length() == 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str2 = this.f18783R;
        i.b(str2);
        File file = new File(str2);
        int itemId = menuItem.getItemId();
        Uri uriFromFile = null;
        if (itemId == R.id.action_share) {
            I5.b.x(this, file, file.getName(), null, null);
        } else if (itemId == R.id.action_print) {
            if (!file.exists()) {
                d.b(this, getString(R.string.file_not_exist));
            }
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    uriFromFile = FileProvider.d(this, getPackageName() + ".fileProvider", file);
                } else {
                    uriFromFile = Uri.fromFile(file);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, "application/pdf");
            intent.addFlags(1);
            Intent intentCreateChooser = Intent.createChooser(intent, getString(R.string.choice_open_ways));
            if (intentCreateChooser.resolveActivity(getPackageManager()) != null) {
                startActivity(intentCreateChooser);
            } else {
                d.b(this, getString(R.string.none_app_to_open_file));
            }
        } else if (itemId == R.id.action_down) {
            if (Build.VERSION.SDK_INT < 29) {
                D4.b bVar = new D4.b(this, 0);
                C2834o c2834o = this.f18784S;
                c2834o.getClass();
                c2834o.f23253c = bVar;
                c2834o.f23254d = new c(0, this);
                c2834o.f23255e = "android.permission.WRITE_EXTERNAL_STORAGE";
                if (G.c.a((PdfReadActivity) c2834o.f23252b, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    D4.b bVar2 = (D4.b) c2834o.f23253c;
                    if (bVar2 != null) {
                        bVar2.f(Boolean.TRUE);
                    }
                } else {
                    ((AbstractC2286c) c2834o.f23256f).a("android.permission.WRITE_EXTERNAL_STORAGE");
                }
            } else {
                C();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
