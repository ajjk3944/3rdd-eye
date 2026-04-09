package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.loader.app.a;
import com.google.android.gms.tasks.Task;
import e2.AbstractC5414b;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class OssLicensesMenuActivity extends androidx.appcompat.app.c implements a.InterfaceC1112a {

    /* renamed from: J, reason: collision with root package name */
    private static String f36926J;

    /* renamed from: D, reason: collision with root package name */
    private ListView f36927D;

    /* renamed from: E, reason: collision with root package name */
    private ArrayAdapter f36928E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f36929F;

    /* renamed from: G, reason: collision with root package name */
    private a f36930G;

    /* renamed from: H, reason: collision with root package name */
    private Task f36931H;

    /* renamed from: I, reason: collision with root package name */
    private b f36932I;

    static boolean T0(Context context, String str) throws IOException {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = context.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(K3.a.f10270a)));
            boolean z10 = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z10;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    public static void V0(String str) {
        f36926J = str;
    }

    @Override // androidx.loader.app.a.InterfaceC1112a
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public void F(AbstractC5414b abstractC5414b, List list) {
        this.f36928E.clear();
        this.f36928E.addAll(list);
        this.f36928E.notifyDataSetChanged();
    }

    @Override // androidx.loader.app.a.InterfaceC1112a
    public AbstractC5414b n(int i10, Bundle bundle) {
        if (this.f36929F) {
            return new k(this, b.b(this));
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f36932I = b.b(this);
        boolean z10 = false;
        if (T0(this, "third_party_licenses") && T0(this, "third_party_license_metadata")) {
            z10 = true;
        }
        this.f36929F = z10;
        if (f36926J == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                f36926J = intent.getStringExtra("title");
                Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = f36926J;
        if (str != null) {
            setTitle(str);
        }
        if (H0() != null) {
            H0().s(true);
        }
        if (!this.f36929F) {
            setContentView(K3.b.f10272b);
            return;
        }
        j jVarC = b.b(this).c();
        this.f36931H = jVarC.g(new g(jVarC, getPackageName()));
        w0().d(54321, null, this);
        this.f36931H.addOnCompleteListener(new m(this));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.AbstractActivityC3999j, android.app.Activity
    public void onDestroy() {
        w0().a(54321);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // androidx.loader.app.a.InterfaceC1112a
    public void p(AbstractC5414b abstractC5414b) {
        this.f36928E.clear();
        this.f36928E.notifyDataSetChanged();
    }
}
