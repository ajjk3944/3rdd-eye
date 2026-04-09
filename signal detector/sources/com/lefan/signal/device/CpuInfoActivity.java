package com.lefan.signal.device;

import A2.C0115c;
import B4.g;
import F4.d;
import a4.p;
import android.content.Intent;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0391p;
import com.apm.insight.R;
import com.google.android.material.appbar.AppBarLayout;
import d5.y;
import h.AbstractActivityC2349g;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import q5.i;

/* loaded from: classes.dex */
public final class CpuInfoActivity extends AbstractActivityC2349g {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f18845P = 0;

    /* renamed from: O, reason: collision with root package name */
    public C0115c f18846O;

    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        AbstractC0391p.a(this);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_cpu_info, (ViewGroup) null, false);
        int i = R.id.app_bar;
        AppBarLayout appBarLayout = (AppBarLayout) p.e(R.id.app_bar, viewInflate);
        if (appBarLayout != null) {
            i = R.id.bottom_layout;
            NestedScrollView nestedScrollView = (NestedScrollView) p.e(R.id.bottom_layout, viewInflate);
            if (nestedScrollView != null) {
                i = R.id.cpu_info_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) p.e(R.id.cpu_info_text, viewInflate);
                if (appCompatTextView != null) {
                    i = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) p.e(R.id.toolbar, viewInflate);
                    if (toolbar != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                        this.f18846O = new C0115c(linearLayoutCompat, appBarLayout, nestedScrollView, appCompatTextView, toolbar, 1);
                        setContentView(linearLayoutCompat);
                        C0115c c0115c = this.f18846O;
                        if (c0115c == null) {
                            i.g("binding");
                            throw null;
                        }
                        AppBarLayout appBarLayout2 = (AppBarLayout) c0115c.f236c;
                        if (c0115c == null) {
                            i.g("binding");
                            throw null;
                        }
                        d.a(appBarLayout2, (NestedScrollView) c0115c.f237d);
                        C0115c c0115c2 = this.f18846O;
                        if (c0115c2 == null) {
                            i.g("binding");
                            throw null;
                        }
                        Toolbar toolbar2 = (Toolbar) c0115c2.f239f;
                        B(toolbar2);
                        com.bumptech.glide.d dVarR = r();
                        if (dVarR != null) {
                            dVarR.S(true);
                        }
                        toolbar2.setNavigationOnClickListener(new g(9, this));
                        StringBuilder sb = new StringBuilder("===================\n");
                        sb.append(Build.MANUFACTURER);
                        sb.append(" ");
                        sb.append(Build.MODEL);
                        sb.append("\n===================\n\n===== CPU =====\n\n");
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                                sb.append("\n");
                            }
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        sb.append("\n===== ABI =====\n\n");
                        String[] strArr = Build.SUPPORTED_ABIS;
                        int length = strArr.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            sb.append("CPU ABI");
                            sb.append(i3);
                            sb.append(":");
                            sb.append(strArr[i3]);
                            sb.append("\n");
                        }
                        sb.append("\n===== Codecs =====\n\n");
                        int codecCount = MediaCodecList.getCodecCount();
                        for (int i6 = 0; i6 < codecCount; i6++) {
                            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i6);
                            String[] supportedTypes = codecInfoAt.getSupportedTypes();
                            i.e(supportedTypes, "array");
                            int i7 = 0;
                            while (true) {
                                if (i7 < supportedTypes.length) {
                                    int i8 = i7 + 1;
                                    try {
                                        sb.append(supportedTypes[i7]);
                                        sb.append("\n");
                                        sb.append(codecInfoAt.getName());
                                        sb.append("\n\n");
                                        i7 = i8;
                                    } catch (ArrayIndexOutOfBoundsException e6) {
                                        throw new NoSuchElementException(e6.getMessage());
                                    }
                                }
                            }
                        }
                        C0115c c0115c3 = this.f18846O;
                        if (c0115c3 != null) {
                            ((AppCompatTextView) c0115c3.f238e).setText(sb.toString());
                            return;
                        } else {
                            i.g("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_share_copy, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_copy) {
            C0115c c0115c = this.f18846O;
            if (c0115c == null) {
                i.g("binding");
                throw null;
            }
            y.i(this, ((AppCompatTextView) c0115c.f238e).getText().toString());
            d.b(this, getString(R.string.copy_success));
        } else if (itemId == R.id.action_share) {
            C0115c c0115c2 = this.f18846O;
            if (c0115c2 == null) {
                i.g("binding");
                throw null;
            }
            String string = ((AppCompatTextView) c0115c2.f238e).getText().toString();
            String string2 = getString(R.string.cpu_info);
            if (string != null && string.length() != 0) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", string);
                Intent intentCreateChooser = Intent.createChooser(intent, string2);
                if (intentCreateChooser.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentCreateChooser);
                } else {
                    d.b(this, getString(R.string.none_share_app));
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
