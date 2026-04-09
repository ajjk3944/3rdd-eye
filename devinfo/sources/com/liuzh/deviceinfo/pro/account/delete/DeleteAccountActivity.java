package com.liuzh.deviceinfo.pro.account.delete;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f1;
import b5.u0;
import b5.z;
import ca.b;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.delete.DeleteAccountActivity;
import dh.c;
import dh.g;
import e4.m0;
import e4.v0;
import hg.a;
import java.util.WeakHashMap;
import nk.k;
import nk.v;
import wb.e;
import yj.u;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class DeleteAccountActivity extends a {
    public static final /* synthetic */ int D = 0;
    public final f1 B = new f1(v.a(g.class), new c(this, 1), new c(this, 0), new c(this, 2));
    public f1 C;

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bh.c.b() == null) {
            finish();
            return;
        }
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_delete_account, (ViewGroup) null, false);
        int i10 = R.id.btn_confirm;
        MaterialButton materialButton = (MaterialButton) e.s(R.id.btn_confirm, viewInflate);
        if (materialButton != null) {
            i10 = R.id.checkbox;
            CheckBox checkBox = (CheckBox) e.s(R.id.checkbox, viewInflate);
            if (checkBox != null) {
                i10 = R.id.scroll_view;
                ScrollView scrollView = (ScrollView) e.s(R.id.scroll_view, viewInflate);
                if (scrollView != null) {
                    i10 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
                    if (toolbar != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        this.C = new f1(frameLayout, materialButton, checkBox, scrollView, toolbar, 19);
                        setContentView(frameLayout);
                        f1 f1Var = this.C;
                        if (f1Var == null) {
                            k.k("binding");
                            throw null;
                        }
                        z((Toolbar) f1Var.f1138f);
                        f1 f1Var2 = this.C;
                        if (f1Var2 == null) {
                            k.k("binding");
                            throw null;
                        }
                        i.e((Toolbar) f1Var2.f1138f);
                        A();
                        f1 f1Var3 = this.C;
                        if (f1Var3 == null) {
                            k.k("binding");
                            throw null;
                        }
                        ((CheckBox) f1Var3.f1136d).setOnCheckedChangeListener(new dh.a(0, this));
                        f1 f1Var4 = this.C;
                        if (f1Var4 == null) {
                            k.k("binding");
                            throw null;
                        }
                        final int i11 = 2;
                        ((MaterialButton) f1Var4.f1135c).setOnClickListener(new com.applovin.mediation.nativeAds.a(2, this));
                        f1 f1Var5 = this.B;
                        final int i12 = 1;
                        ((g) f1Var5.getValue()).f22267e.e(this, new bh.i(new mk.c(this) { // from class: dh.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ DeleteAccountActivity f22254b;

                            {
                                this.f22254b = this;
                            }

                            @Override // mk.c
                            public final Object invoke(Object obj) {
                                int i13 = i4;
                                u uVar = u.f37649a;
                                DeleteAccountActivity deleteAccountActivity = this.f22254b;
                                switch (i13) {
                                    case 0:
                                        String str = (String) obj;
                                        int i14 = DeleteAccountActivity.D;
                                        k.b(str);
                                        hg.a.C(deleteAccountActivity, str);
                                        break;
                                    case 1:
                                        int i15 = DeleteAccountActivity.D;
                                        if (!((ng.a) obj).f29942a) {
                                            u0 u0VarS = deleteAccountActivity.s();
                                            k.d(u0VarS, "getSupportFragmentManager(...)");
                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                            if (zVarD != null) {
                                                b5.a aVar = new b5.a(u0VarS);
                                                aVar.j(zVarD);
                                                aVar.g();
                                                break;
                                            }
                                        } else {
                                            rg.c.f32943p0.B(deleteAccountActivity, null);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i16 = DeleteAccountActivity.D;
                                        deleteAccountActivity.finish();
                                        break;
                                }
                                return uVar;
                            }
                        }, 1));
                        ((g) f1Var5.getValue()).f22265c.e(this, new bh.i(new mk.c(this) { // from class: dh.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ DeleteAccountActivity f22254b;

                            {
                                this.f22254b = this;
                            }

                            @Override // mk.c
                            public final Object invoke(Object obj) {
                                int i13 = i12;
                                u uVar = u.f37649a;
                                DeleteAccountActivity deleteAccountActivity = this.f22254b;
                                switch (i13) {
                                    case 0:
                                        String str = (String) obj;
                                        int i14 = DeleteAccountActivity.D;
                                        k.b(str);
                                        hg.a.C(deleteAccountActivity, str);
                                        break;
                                    case 1:
                                        int i15 = DeleteAccountActivity.D;
                                        if (!((ng.a) obj).f29942a) {
                                            u0 u0VarS = deleteAccountActivity.s();
                                            k.d(u0VarS, "getSupportFragmentManager(...)");
                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                            if (zVarD != null) {
                                                b5.a aVar = new b5.a(u0VarS);
                                                aVar.j(zVarD);
                                                aVar.g();
                                                break;
                                            }
                                        } else {
                                            rg.c.f32943p0.B(deleteAccountActivity, null);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i16 = DeleteAccountActivity.D;
                                        deleteAccountActivity.finish();
                                        break;
                                }
                                return uVar;
                            }
                        }, 1));
                        ((g) f1Var5.getValue()).g.e(this, new bh.i(new mk.c(this) { // from class: dh.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ DeleteAccountActivity f22254b;

                            {
                                this.f22254b = this;
                            }

                            @Override // mk.c
                            public final Object invoke(Object obj) {
                                int i13 = i11;
                                u uVar = u.f37649a;
                                DeleteAccountActivity deleteAccountActivity = this.f22254b;
                                switch (i13) {
                                    case 0:
                                        String str = (String) obj;
                                        int i14 = DeleteAccountActivity.D;
                                        k.b(str);
                                        hg.a.C(deleteAccountActivity, str);
                                        break;
                                    case 1:
                                        int i15 = DeleteAccountActivity.D;
                                        if (!((ng.a) obj).f29942a) {
                                            u0 u0VarS = deleteAccountActivity.s();
                                            k.d(u0VarS, "getSupportFragmentManager(...)");
                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                            if (zVarD != null) {
                                                b5.a aVar = new b5.a(u0VarS);
                                                aVar.j(zVarD);
                                                aVar.g();
                                                break;
                                            }
                                        } else {
                                            rg.c.f32943p0.B(deleteAccountActivity, null);
                                            break;
                                        }
                                        break;
                                    default:
                                        int i16 = DeleteAccountActivity.D;
                                        deleteAccountActivity.finish();
                                        break;
                                }
                                return uVar;
                            }
                        }, 1));
                        f1 f1Var6 = this.C;
                        if (f1Var6 == null) {
                            k.k("binding");
                            throw null;
                        }
                        FrameLayout frameLayout2 = (FrameLayout) f1Var6.f1134b;
                        b bVar = new b(7, this);
                        WeakHashMap weakHashMap = v0.f22405a;
                        m0.j(frameLayout2, bVar);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
