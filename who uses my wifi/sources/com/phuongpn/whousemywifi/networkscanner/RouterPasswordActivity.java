package com.phuongpn.whousemywifi.networkscanner;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3;
import defpackage.a30;
import defpackage.b3;
import defpackage.fr0;
import defpackage.g30;
import defpackage.gm0;
import defpackage.hr0;
import defpackage.i30;
import defpackage.i5;
import defpackage.jr0;
import defpackage.k52;
import defpackage.m54;
import defpackage.pt0;
import defpackage.qw;
import defpackage.sy0;
import defpackage.wk0;
import defpackage.xb4;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class RouterPasswordActivity extends i5 implements pt0 {
    public static final /* synthetic */ int H = 0;
    public xb4 C;
    public jr0 D;
    public ArrayList E;
    public SharedPreferences F;
    public k52 G;

    public final void hidePrompt(View view) {
        i30.m(view, "v");
        xb4 xb4Var = this.C;
        if (xb4Var == null) {
            i30.S("binding");
            throw null;
        }
        ((LinearLayout) xb4Var.g).setVisibility(8);
        try {
            SharedPreferences sharedPreferences = this.F;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putBoolean("rtpss_promt", false).apply();
            } else {
                i30.S("prefs");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Activity, android.content.Context, b60, ch, com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity, i5] */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
    @Override // defpackage.i5, defpackage.ch, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        String string;
        super.onCreate(bundle);
        String str2 = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_router_password, (ViewGroup) null, false);
        int i = R.id.routerPasswordInfoLayout;
        LinearLayout linearLayout = (LinearLayout) a30.e(viewInflate, R.id.routerPasswordInfoLayout);
        if (linearLayout != null) {
            i = R.id.rvRouterPassword;
            RecyclerView recyclerView = (RecyclerView) a30.e(viewInflate, R.id.rvRouterPassword);
            if (recyclerView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) a30.e(viewInflate, R.id.toolbar);
                if (toolbar != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                    this.C = new xb4(coordinatorLayout, linearLayout, recyclerView, toolbar);
                    i30.l(coordinatorLayout, "getRoot(...)");
                    setContentView(coordinatorLayout);
                    xb4 xb4Var = this.C;
                    if (xb4Var == null) {
                        i30.S("binding");
                        throw null;
                    }
                    w((Toolbar) xb4Var.i);
                    m54 m54VarN = n();
                    if (m54VarN != null) {
                        m54VarN.y(true);
                    }
                    g30.a(this, getString(R.string.ads_interstitial), new b3(new a3(1)), new fr0(this, 1));
                    this.E = new ArrayList();
                    TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.routersData);
                    i30.l(typedArrayObtainTypedArray, "obtainTypedArray(...)");
                    int length = typedArrayObtainTypedArray.length();
                    String[][] strArr = new String[length][];
                    ArrayList arrayList = this.E;
                    if (arrayList == null) {
                        i30.S("routers");
                        throw null;
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = this.E;
                        if (arrayList2 == null) {
                            i30.S("routers");
                            throw null;
                        }
                        arrayList2.clear();
                    }
                    int i2 = 0;
                    while (i2 < length) {
                        int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                        if (resourceId > 0) {
                            String[] stringArray = getResources().getStringArray(resourceId);
                            strArr[i2] = stringArray;
                            String string2 = "";
                            if ((stringArray != null ? stringArray[2] : str2) != null) {
                                string = sy0.J(String.valueOf(stringArray != null ? stringArray[2] : str2)).toString();
                            } else {
                                string = "";
                            }
                            String[] strArr2 = strArr[i2];
                            if ((strArr2 != null ? strArr2[3] : str2) != null) {
                                string2 = sy0.J(String.valueOf(strArr2 != null ? strArr2[3] : str2)).toString();
                            }
                            ArrayList arrayList3 = this.E;
                            if (arrayList3 == null) {
                                ?? r17 = str2;
                                i30.S("routers");
                                throw r17;
                            }
                            String[] strArr3 = strArr[i2];
                            String strValueOf = String.valueOf(strArr3 != null ? strArr3[0] : str2);
                            String[] strArr4 = strArr[i2];
                            String strValueOf2 = String.valueOf(strArr4 != null ? strArr4[1] : str2);
                            str = str2;
                            i30.m(string, "username");
                            i30.m(string2, "password");
                            hr0 hr0Var = new hr0();
                            hr0Var.a = strValueOf;
                            hr0Var.b = strValueOf2;
                            hr0Var.c = string;
                            hr0Var.d = string2;
                            arrayList3.add(hr0Var);
                        } else {
                            str = str2;
                        }
                        i2++;
                        str2 = str;
                    }
                    ?? r172 = str2;
                    typedArrayObtainTypedArray.recycle();
                    ArrayList arrayList4 = this.E;
                    if (arrayList4 == null) {
                        i30.S("routers");
                        throw r172;
                    }
                    this.D = new jr0(arrayList4, new wk0(2));
                    xb4 xb4Var2 = this.C;
                    if (xb4Var2 == null) {
                        i30.S("binding");
                        throw r172;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) xb4Var2.h;
                    recyclerView2.setHasFixedSize(true);
                    recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                    jr0 jr0Var = this.D;
                    if (jr0Var == null) {
                        i30.S("routerAdapter");
                        throw r172;
                    }
                    recyclerView2.setAdapter(jr0Var);
                    Context applicationContext = getApplicationContext();
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(gm0.a(applicationContext), 0);
                    i30.l(sharedPreferences, "getDefaultSharedPreferences(...)");
                    this.F = sharedPreferences;
                    if (!sharedPreferences.getBoolean("rtpss_promt", true)) {
                        xb4 xb4Var3 = this.C;
                        if (xb4Var3 == null) {
                            i30.S("binding");
                            throw r172;
                        }
                        ((LinearLayout) xb4Var3.g).setVisibility(8);
                    }
                    i().a(this, new qw(this, 2));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i30.m(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_router_password, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_search);
        i30.l(menuItemFindItem, "findItem(...)");
        menuItemFindItem.setShowAsActionFlags(10);
        View actionView = menuItemFindItem.getActionView();
        i30.k(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setQueryHint(getString(R.string.txt_router_password_keyword));
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i30.m(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_help) {
            startActivity(new Intent(this, (Class<?>) HelpActivity.class));
        } else if (menuItem.getItemId() == 16908332) {
            i().c();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
