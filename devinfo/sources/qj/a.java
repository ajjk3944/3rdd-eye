package qj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import b7.u;
import cm.g;
import com.google.android.gms.internal.consent_sdk.d;
import com.liuzh.deviceinfo.R;
import e4.c2;
import ec.z;
import ej.i;
import ej.m;
import java.util.ArrayList;
import kj.f;
import kj.h;
import nj.b;
import nk.k;
import t6.i0;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: b, reason: collision with root package name */
    public final m f32440b;

    /* renamed from: c, reason: collision with root package name */
    public final d f32441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, i iVar, m mVar) {
        super(context);
        k.e(context, "context");
        k.e(mVar, "viewModel");
        this.f32440b = mVar;
        int i4 = R.id.analyze_item;
        CardView cardView = (CardView) e.s(R.id.analyze_item, this);
        if (cardView != null) {
            i4 = R.id.clear_btn;
            Button button = (Button) e.s(R.id.clear_btn, this);
            if (button != null) {
                i4 = R.id.empty_file;
                TextView textView = (TextView) e.s(R.id.empty_file, this);
                if (textView != null) {
                    i4 = R.id.empty_file_title;
                    if (((AppCompatTextView) e.s(R.id.empty_file_title, this)) != null) {
                        i4 = R.id.empty_folder;
                        TextView textView2 = (TextView) e.s(R.id.empty_folder, this);
                        if (textView2 != null) {
                            i4 = R.id.empty_folder_title;
                            if (((AppCompatTextView) e.s(R.id.empty_folder_title, this)) != null) {
                                i4 = R.id.head_icon;
                                if (((ImageView) e.s(R.id.head_icon, this)) != null) {
                                    i4 = R.id.info_card;
                                    CardView cardView2 = (CardView) e.s(R.id.info_card, this);
                                    if (cardView2 != null) {
                                        i4 = R.id.log_file;
                                        TextView textView3 = (TextView) e.s(R.id.log_file, this);
                                        if (textView3 != null) {
                                            i4 = R.id.log_file_title;
                                            if (((AppCompatTextView) e.s(R.id.log_file_title, this)) != null) {
                                                i4 = R.id.progressbar;
                                                if (((ProgressBar) e.s(R.id.progressbar, this)) != null) {
                                                    i4 = R.id.status_text;
                                                    TextView textView4 = (TextView) e.s(R.id.status_text, this);
                                                    if (textView4 != null) {
                                                        i4 = R.id.tmp_file;
                                                        TextView textView5 = (TextView) e.s(R.id.tmp_file, this);
                                                        if (textView5 != null) {
                                                            i4 = R.id.tmp_file_title;
                                                            if (((AppCompatTextView) e.s(R.id.tmp_file_title, this)) != null) {
                                                                i4 = R.id.tv_size;
                                                                TextView textView6 = (TextView) e.s(R.id.tv_size, this);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.tv_summary;
                                                                    TextView textView7 = (TextView) e.s(R.id.tv_summary, this);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.tv_title;
                                                                        TextView textView8 = (TextView) e.s(R.id.tv_title, this);
                                                                        if (textView8 != null) {
                                                                            d dVar = new d();
                                                                            dVar.f19295a = button;
                                                                            dVar.f19296b = textView;
                                                                            dVar.f19297c = textView2;
                                                                            dVar.f19298d = textView3;
                                                                            dVar.f19299e = textView4;
                                                                            dVar.f19300f = textView5;
                                                                            dVar.g = textView6;
                                                                            dVar.f19301h = textView7;
                                                                            dVar.f19302i = textView8;
                                                                            this.f32441c = dVar;
                                                                            Drawable background = button.getBackground();
                                                                            k.d(background, "getBackground(...)");
                                                                            button.setBackground(e.M(background, jm.a.z().b(context)));
                                                                            button.setOnClickListener(new com.applovin.mediation.nativeAds.a(19, this));
                                                                            setNextFocusDownId(cardView.getId());
                                                                            if (i0.k()) {
                                                                                cardView.setFocusable(true);
                                                                                cardView.setForeground(g.o(context));
                                                                                cardView2.setForeground(g.o(context));
                                                                            }
                                                                            mVar.g.e(iVar, new bh.i(new u(17, this), 14));
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001b A[PHI: r1
  0x001b: PHI (r1v5 long) = (r1v1 long), (r1v4 long) binds: [B:3:0x0019, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.widget.TextView r4, int r5, int r6, java.lang.Runnable r7) {
        /*
            r0 = 0
            r4.setVisibility(r0)
            int[] r0 = new int[]{r5, r6}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            int r6 = r6 - r5
            int r5 = java.lang.Math.abs(r6)
            long r5 = (long) r5
            r1 = 20
            long r5 = r5 * r1
            r1 = 2000(0x7d0, double:9.88E-321)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1d
        L1b:
            r5 = r1
            goto L2d
        L1d:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L26
            r5 = 200(0xc8, double:9.9E-322)
            goto L2d
        L26:
            r1 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2d
            goto L1b
        L2d:
            r0.setDuration(r5)
            eh.a r5 = new eh.a
            r6 = 7
            r5.<init>(r6, r4)
            r0.addUpdateListener(r5)
            ad.g r4 = new ad.g
            r5 = 14
            r4.<init>(r5, r7)
            r0.addListener(r4)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.a.g(android.widget.TextView, int, int, java.lang.Runnable):void");
    }

    @Override // nj.b
    public final void a(c2 c2Var) {
        k.e(c2Var, "insets");
        v3.b bVarG = c2Var.f22315a.g(647);
        k.d(bVarG, "getInsets(...)");
        setPadding(bVarG.f35793a, getPaddingTop(), bVarG.f35795c, bVarG.f35796d);
    }

    @Override // nj.b
    public int getLayoutId() {
        return R.layout.fa_floating_redundant_clear_view;
    }

    public final void h() {
        ArrayList arrayList;
        Object obj;
        f fVar = (f) this.f32440b.g.d();
        if (fVar == null || (arrayList = fVar.f28363c) == null) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((h) obj).f28371d == 1) {
                break;
            }
        }
        h hVar = (h) obj;
        if (hVar == null) {
            return;
        }
        d dVar = this.f32441c;
        ((TextView) dVar.f19301h).setText(hVar.f28370c);
        ((TextView) dVar.f19302i).setText(hVar.f28368a);
        ((TextView) dVar.g).setText(hVar.f28369b.getSize());
        ((z) jm.a.f27720a.f1138f).getClass();
    }
}
