package yh;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.tests.TestesActivity;
import com.liuzh.deviceinfo.utilities.y;
import e4.a0;
import e4.m0;
import e4.v0;
import java.util.WeakHashMap;
import t.r;
import t7.m;
import xh.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h extends hg.d {
    public View Z;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        ((TestesActivity) context).setTitle(R.string.display_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        cg.a.f2848b.f(null, "screen_test_show");
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            final int i4 = 0;
            View viewInflate = layoutInflater.inflate(R.layout.fragment_screen_specific_test, viewGroup, false);
            this.Z = viewInflate;
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            dj.b.m((ScrollView) viewInflate, com.liuzh.deviceinfo.utilities.f.d());
            View viewFindViewById = this.Z.findViewById(R.id.card_gray);
            final int i10 = 1;
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                y.j(1.02f, viewFindViewById);
            }
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f37622b;

                {
                    this.f37622b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            h hVar = this.f37622b;
                            if (!hVar.c0()) {
                                TestesActivity.D(hVar.U(), d.class);
                                break;
                            }
                            break;
                        case 1:
                            h hVar2 = this.f37622b;
                            if (!hVar2.c0()) {
                                TestesActivity.D(hVar2.U(), b.class);
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.f37622b;
                            if (!hVar3.c0()) {
                                TestesActivity.D(hVar3.U(), p.class);
                                break;
                            }
                            break;
                        case 3:
                            h hVar4 = this.f37622b;
                            if (!hVar4.c0()) {
                                TestesActivity.D(hVar4.U(), c.class);
                                break;
                            }
                            break;
                        case 4:
                            h hVar5 = this.f37622b;
                            if (!hVar5.c0()) {
                                m mVar = new m(hVar5.W());
                                mVar.y(R.string.notice);
                                mVar.v(R.string.touch_sampling_notice_content);
                                mVar.x(R.string.str_continue, new r(5, hVar5));
                                mVar.A();
                                break;
                            }
                            break;
                        case 5:
                            h hVar6 = this.f37622b;
                            if (!hVar6.c0()) {
                                TestesActivity.D(hVar6.U(), f.class);
                                break;
                            }
                            break;
                        default:
                            h hVar7 = this.f37622b;
                            if (!hVar7.c0()) {
                                TestesActivity.D(hVar7.U(), a.class);
                                break;
                            }
                            break;
                    }
                }
            });
            View viewFindViewById2 = this.Z.findViewById(R.id.card_color);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                y.j(1.02f, viewFindViewById2);
            }
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f37622b;

                {
                    this.f37622b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            h hVar = this.f37622b;
                            if (!hVar.c0()) {
                                TestesActivity.D(hVar.U(), d.class);
                                break;
                            }
                            break;
                        case 1:
                            h hVar2 = this.f37622b;
                            if (!hVar2.c0()) {
                                TestesActivity.D(hVar2.U(), b.class);
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.f37622b;
                            if (!hVar3.c0()) {
                                TestesActivity.D(hVar3.U(), p.class);
                                break;
                            }
                            break;
                        case 3:
                            h hVar4 = this.f37622b;
                            if (!hVar4.c0()) {
                                TestesActivity.D(hVar4.U(), c.class);
                                break;
                            }
                            break;
                        case 4:
                            h hVar5 = this.f37622b;
                            if (!hVar5.c0()) {
                                m mVar = new m(hVar5.W());
                                mVar.y(R.string.notice);
                                mVar.v(R.string.touch_sampling_notice_content);
                                mVar.x(R.string.str_continue, new r(5, hVar5));
                                mVar.A();
                                break;
                            }
                            break;
                        case 5:
                            h hVar6 = this.f37622b;
                            if (!hVar6.c0()) {
                                TestesActivity.D(hVar6.U(), f.class);
                                break;
                            }
                            break;
                        default:
                            h hVar7 = this.f37622b;
                            if (!hVar7.c0()) {
                                TestesActivity.D(hVar7.U(), a.class);
                                break;
                            }
                            break;
                    }
                }
            });
            View viewFindViewById3 = this.Z.findViewById(R.id.card_multi_touch);
            View viewFindViewById4 = this.Z.findViewById(R.id.card_draw);
            View viewFindViewById5 = this.Z.findViewById(R.id.card_touch_sampling);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                viewFindViewById3.setVisibility(8);
                viewFindViewById4.setVisibility(8);
                viewFindViewById5.setVisibility(8);
            } else {
                final int i11 = 2;
                viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f37622b;

                    {
                        this.f37622b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                h hVar = this.f37622b;
                                if (!hVar.c0()) {
                                    TestesActivity.D(hVar.U(), d.class);
                                    break;
                                }
                                break;
                            case 1:
                                h hVar2 = this.f37622b;
                                if (!hVar2.c0()) {
                                    TestesActivity.D(hVar2.U(), b.class);
                                    break;
                                }
                                break;
                            case 2:
                                h hVar3 = this.f37622b;
                                if (!hVar3.c0()) {
                                    TestesActivity.D(hVar3.U(), p.class);
                                    break;
                                }
                                break;
                            case 3:
                                h hVar4 = this.f37622b;
                                if (!hVar4.c0()) {
                                    TestesActivity.D(hVar4.U(), c.class);
                                    break;
                                }
                                break;
                            case 4:
                                h hVar5 = this.f37622b;
                                if (!hVar5.c0()) {
                                    m mVar = new m(hVar5.W());
                                    mVar.y(R.string.notice);
                                    mVar.v(R.string.touch_sampling_notice_content);
                                    mVar.x(R.string.str_continue, new r(5, hVar5));
                                    mVar.A();
                                    break;
                                }
                                break;
                            case 5:
                                h hVar6 = this.f37622b;
                                if (!hVar6.c0()) {
                                    TestesActivity.D(hVar6.U(), f.class);
                                    break;
                                }
                                break;
                            default:
                                h hVar7 = this.f37622b;
                                if (!hVar7.c0()) {
                                    TestesActivity.D(hVar7.U(), a.class);
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i12 = 3;
                viewFindViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f37622b;

                    {
                        this.f37622b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                h hVar = this.f37622b;
                                if (!hVar.c0()) {
                                    TestesActivity.D(hVar.U(), d.class);
                                    break;
                                }
                                break;
                            case 1:
                                h hVar2 = this.f37622b;
                                if (!hVar2.c0()) {
                                    TestesActivity.D(hVar2.U(), b.class);
                                    break;
                                }
                                break;
                            case 2:
                                h hVar3 = this.f37622b;
                                if (!hVar3.c0()) {
                                    TestesActivity.D(hVar3.U(), p.class);
                                    break;
                                }
                                break;
                            case 3:
                                h hVar4 = this.f37622b;
                                if (!hVar4.c0()) {
                                    TestesActivity.D(hVar4.U(), c.class);
                                    break;
                                }
                                break;
                            case 4:
                                h hVar5 = this.f37622b;
                                if (!hVar5.c0()) {
                                    m mVar = new m(hVar5.W());
                                    mVar.y(R.string.notice);
                                    mVar.v(R.string.touch_sampling_notice_content);
                                    mVar.x(R.string.str_continue, new r(5, hVar5));
                                    mVar.A();
                                    break;
                                }
                                break;
                            case 5:
                                h hVar6 = this.f37622b;
                                if (!hVar6.c0()) {
                                    TestesActivity.D(hVar6.U(), f.class);
                                    break;
                                }
                                break;
                            default:
                                h hVar7 = this.f37622b;
                                if (!hVar7.c0()) {
                                    TestesActivity.D(hVar7.U(), a.class);
                                    break;
                                }
                                break;
                        }
                    }
                });
                final int i13 = 4;
                viewFindViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f37622b;

                    {
                        this.f37622b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                h hVar = this.f37622b;
                                if (!hVar.c0()) {
                                    TestesActivity.D(hVar.U(), d.class);
                                    break;
                                }
                                break;
                            case 1:
                                h hVar2 = this.f37622b;
                                if (!hVar2.c0()) {
                                    TestesActivity.D(hVar2.U(), b.class);
                                    break;
                                }
                                break;
                            case 2:
                                h hVar3 = this.f37622b;
                                if (!hVar3.c0()) {
                                    TestesActivity.D(hVar3.U(), p.class);
                                    break;
                                }
                                break;
                            case 3:
                                h hVar4 = this.f37622b;
                                if (!hVar4.c0()) {
                                    TestesActivity.D(hVar4.U(), c.class);
                                    break;
                                }
                                break;
                            case 4:
                                h hVar5 = this.f37622b;
                                if (!hVar5.c0()) {
                                    m mVar = new m(hVar5.W());
                                    mVar.y(R.string.notice);
                                    mVar.v(R.string.touch_sampling_notice_content);
                                    mVar.x(R.string.str_continue, new r(5, hVar5));
                                    mVar.A();
                                    break;
                                }
                                break;
                            case 5:
                                h hVar6 = this.f37622b;
                                if (!hVar6.c0()) {
                                    TestesActivity.D(hVar6.U(), f.class);
                                    break;
                                }
                                break;
                            default:
                                h hVar7 = this.f37622b;
                                if (!hVar7.c0()) {
                                    TestesActivity.D(hVar7.U(), a.class);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            View viewFindViewById6 = this.Z.findViewById(R.id.card_gray_black_white);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                y.j(1.02f, viewFindViewById6);
            }
            final int i14 = 5;
            viewFindViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f37622b;

                {
                    this.f37622b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            h hVar = this.f37622b;
                            if (!hVar.c0()) {
                                TestesActivity.D(hVar.U(), d.class);
                                break;
                            }
                            break;
                        case 1:
                            h hVar2 = this.f37622b;
                            if (!hVar2.c0()) {
                                TestesActivity.D(hVar2.U(), b.class);
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.f37622b;
                            if (!hVar3.c0()) {
                                TestesActivity.D(hVar3.U(), p.class);
                                break;
                            }
                            break;
                        case 3:
                            h hVar4 = this.f37622b;
                            if (!hVar4.c0()) {
                                TestesActivity.D(hVar4.U(), c.class);
                                break;
                            }
                            break;
                        case 4:
                            h hVar5 = this.f37622b;
                            if (!hVar5.c0()) {
                                m mVar = new m(hVar5.W());
                                mVar.y(R.string.notice);
                                mVar.v(R.string.touch_sampling_notice_content);
                                mVar.x(R.string.str_continue, new r(5, hVar5));
                                mVar.A();
                                break;
                            }
                            break;
                        case 5:
                            h hVar6 = this.f37622b;
                            if (!hVar6.c0()) {
                                TestesActivity.D(hVar6.U(), f.class);
                                break;
                            }
                            break;
                        default:
                            h hVar7 = this.f37622b;
                            if (!hVar7.c0()) {
                                TestesActivity.D(hVar7.U(), a.class);
                                break;
                            }
                            break;
                    }
                }
            });
            View viewFindViewById7 = this.Z.findViewById(R.id.card_black_white);
            if (com.liuzh.deviceinfo.utilities.d.k()) {
                y.j(1.02f, viewFindViewById7);
            }
            final int i15 = 6;
            viewFindViewById7.setOnClickListener(new View.OnClickListener(this) { // from class: yh.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f37622b;

                {
                    this.f37622b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            h hVar = this.f37622b;
                            if (!hVar.c0()) {
                                TestesActivity.D(hVar.U(), d.class);
                                break;
                            }
                            break;
                        case 1:
                            h hVar2 = this.f37622b;
                            if (!hVar2.c0()) {
                                TestesActivity.D(hVar2.U(), b.class);
                                break;
                            }
                            break;
                        case 2:
                            h hVar3 = this.f37622b;
                            if (!hVar3.c0()) {
                                TestesActivity.D(hVar3.U(), p.class);
                                break;
                            }
                            break;
                        case 3:
                            h hVar4 = this.f37622b;
                            if (!hVar4.c0()) {
                                TestesActivity.D(hVar4.U(), c.class);
                                break;
                            }
                            break;
                        case 4:
                            h hVar5 = this.f37622b;
                            if (!hVar5.c0()) {
                                m mVar = new m(hVar5.W());
                                mVar.y(R.string.notice);
                                mVar.v(R.string.touch_sampling_notice_content);
                                mVar.x(R.string.str_continue, new r(5, hVar5));
                                mVar.A();
                                break;
                            }
                            break;
                        case 5:
                            h hVar6 = this.f37622b;
                            if (!hVar6.c0()) {
                                TestesActivity.D(hVar6.U(), f.class);
                                break;
                            }
                            break;
                        default:
                            h hVar7 = this.f37622b;
                            if (!hVar7.c0()) {
                                TestesActivity.D(hVar7.U(), a.class);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return this.Z;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        a0 a0Var = new a0(3, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, a0Var);
    }
}
