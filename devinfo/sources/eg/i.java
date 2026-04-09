package eg;

import android.app.Dialog;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.p;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.view.CircleColorView;
import i.y;
import java.io.File;
import java.util.Locale;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends y {

    /* renamed from: p0, reason: collision with root package name */
    public String f23465p0;

    /* renamed from: q0, reason: collision with root package name */
    public qg.f f23466q0;

    @Override // b5.s, b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        String string = V().getString("file_path");
        nk.k.b(string);
        this.f23465p0 = string;
    }

    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        Object cVar;
        String string;
        String strValueOf;
        View viewInflate = q().inflate(R.layout.dialog_file_detail, (ViewGroup) null, false);
        int i4 = R.id.apk_details;
        LinearLayout linearLayout = (LinearLayout) wb.e.s(R.id.apk_details, viewInflate);
        if (linearLayout != null) {
            i4 = R.id.apk_installed_version;
            AppCompatTextView appCompatTextView = (AppCompatTextView) wb.e.s(R.id.apk_installed_version, viewInflate);
            if (appCompatTextView != null) {
                i4 = R.id.apk_name;
                TextView textView = (TextView) wb.e.s(R.id.apk_name, viewInflate);
                if (textView != null) {
                    i4 = R.id.apk_package;
                    TextView textView2 = (TextView) wb.e.s(R.id.apk_package, viewInflate);
                    if (textView2 != null) {
                        i4 = R.id.apk_version;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) wb.e.s(R.id.apk_version, viewInflate);
                        if (appCompatTextView2 != null) {
                            i4 = R.id.contents;
                            TextView textView3 = (TextView) wb.e.s(R.id.contents, viewInflate);
                            if (textView3 != null) {
                                i4 = R.id.contents_layout;
                                LinearLayout linearLayout2 = (LinearLayout) wb.e.s(R.id.contents_layout, viewInflate);
                                if (linearLayout2 != null) {
                                    i4 = R.id.divider_apk;
                                    View viewS = wb.e.s(R.id.divider_apk, viewInflate);
                                    if (viewS != null) {
                                        i4 = R.id.icon_mime;
                                        ImageView imageView = (ImageView) wb.e.s(R.id.icon_mime, viewInflate);
                                        if (imageView != null) {
                                            i4 = R.id.icon_mime_background;
                                            CircleColorView circleColorView = (CircleColorView) wb.e.s(R.id.icon_mime_background, viewInflate);
                                            if (circleColorView != null) {
                                                i4 = R.id.icon_thumb;
                                                ImageView imageView2 = (ImageView) wb.e.s(R.id.icon_thumb, viewInflate);
                                                if (imageView2 != null) {
                                                    i4 = R.id.installed_info_layout;
                                                    LinearLayout linearLayout3 = (LinearLayout) wb.e.s(R.id.installed_info_layout, viewInflate);
                                                    if (linearLayout3 != null) {
                                                        i4 = R.id.label_apk_name;
                                                        TextView textView4 = (TextView) wb.e.s(R.id.label_apk_name, viewInflate);
                                                        if (textView4 != null) {
                                                            i4 = R.id.label_apk_version;
                                                            TextView textView5 = (TextView) wb.e.s(R.id.label_apk_version, viewInflate);
                                                            if (textView5 != null) {
                                                                i4 = R.id.label_installed_version;
                                                                TextView textView6 = (TextView) wb.e.s(R.id.label_installed_version, viewInflate);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.label_package;
                                                                    TextView textView7 = (TextView) wb.e.s(R.id.label_package, viewInflate);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.label_type;
                                                                        if (((TextView) wb.e.s(R.id.label_type, viewInflate)) != null) {
                                                                            i4 = R.id.modified;
                                                                            TextView textView8 = (TextView) wb.e.s(R.id.modified, viewInflate);
                                                                            if (textView8 != null) {
                                                                                i4 = R.id.name;
                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) wb.e.s(R.id.name, viewInflate);
                                                                                if (appCompatTextView3 != null) {
                                                                                    i4 = R.id.path;
                                                                                    TextView textView9 = (TextView) wb.e.s(R.id.path, viewInflate);
                                                                                    if (textView9 != null) {
                                                                                        i4 = R.id.path_layout;
                                                                                        if (((LinearLayout) wb.e.s(R.id.path_layout, viewInflate)) != null) {
                                                                                            i4 = R.id.resolution;
                                                                                            TextView textView10 = (TextView) wb.e.s(R.id.resolution, viewInflate);
                                                                                            if (textView10 != null) {
                                                                                                i4 = R.id.resolution_layout;
                                                                                                LinearLayout linearLayout4 = (LinearLayout) wb.e.s(R.id.resolution_layout, viewInflate);
                                                                                                if (linearLayout4 != null) {
                                                                                                    i4 = R.id.size;
                                                                                                    TextView textView11 = (TextView) wb.e.s(R.id.size, viewInflate);
                                                                                                    if (textView11 != null) {
                                                                                                        i4 = R.id.size_layout;
                                                                                                        if (((LinearLayout) wb.e.s(R.id.size_layout, viewInflate)) != null) {
                                                                                                            i4 = R.id.type;
                                                                                                            TextView textView12 = (TextView) wb.e.s(R.id.type, viewInflate);
                                                                                                            if (textView12 != null) {
                                                                                                                this.f23466q0 = new qg.f((ScrollView) viewInflate, linearLayout, appCompatTextView, textView, textView2, appCompatTextView2, textView3, linearLayout2, viewS, imageView, circleColorView, imageView2, linearLayout3, textView4, textView5, textView6, textView7, textView8, appCompatTextView3, textView9, textView10, linearLayout4, textView11, textView12);
                                                                                                                String str = this.f23465p0;
                                                                                                                if (str == null) {
                                                                                                                    nk.k.k("filePath");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                final File file = new File(str);
                                                                                                                String name = file.getName();
                                                                                                                nk.k.d(name, "getName(...)");
                                                                                                                String strI = wi.c.i(name);
                                                                                                                String strB = wi.g.b(strI);
                                                                                                                nk.k.d(strB, "getTypeNameFromMimeType(...)");
                                                                                                                Locale locale = Locale.ROOT;
                                                                                                                String lowerCase = strB.toLowerCase(locale);
                                                                                                                nk.k.d(lowerCase, "toLowerCase(...)");
                                                                                                                qg.f fVar = this.f23466q0;
                                                                                                                if (fVar == null) {
                                                                                                                    nk.k.k("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                ImageView imageView3 = fVar.f32369l;
                                                                                                                View view = fVar.f32367i;
                                                                                                                LinearLayout linearLayout5 = fVar.f32361b;
                                                                                                                LinearLayout linearLayout6 = fVar.f32366h;
                                                                                                                TextView textView13 = fVar.f32381x;
                                                                                                                TextView textView14 = fVar.f32380w;
                                                                                                                TextView textView15 = fVar.f32371n;
                                                                                                                textView15.setText(((Object) textView15.getText()) + ":");
                                                                                                                TextView textView16 = fVar.f32372o;
                                                                                                                textView16.setText(((Object) textView16.getText()) + ":");
                                                                                                                TextView textView17 = fVar.f32373p;
                                                                                                                textView17.setText(((Object) textView17.getText()) + ":");
                                                                                                                TextView textView18 = fVar.f32374q;
                                                                                                                textView18.setText(((Object) textView18.getText()) + ":");
                                                                                                                fVar.f32376s.setText(file.getName());
                                                                                                                fVar.f32368k.setColor(cm.g.l(android.R.attr.colorPrimary, W()));
                                                                                                                fVar.f32377t.setText(file.getParent());
                                                                                                                if (lowerCase.equals("apk")) {
                                                                                                                    linearLayout5.setVisibility(0);
                                                                                                                    view.setVisibility(0);
                                                                                                                    final int i10 = 1;
                                                                                                                    bi.d.c(new Runnable() { // from class: eg.f
                                                                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                                                                        /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
                                                                                                                        /* JADX WARN: Type inference failed for: r6v1, types: [com.liuzh.deviceinfo.utilities.a] */
                                                                                                                        @Override // java.lang.Runnable
                                                                                                                        /*
                                                                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                                                                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                                                                                        */
                                                                                                                        public final void run() throws android.content.pm.PackageManager.NameNotFoundException {
                                                                                                                            /*
                                                                                                                                Method dump skipped, instructions count: 240
                                                                                                                                To view this dump change 'Code comments level' option to 'DEBUG'
                                                                                                                            */
                                                                                                                            throw new UnsupportedOperationException("Method not decompiled: eg.f.run():void");
                                                                                                                        }
                                                                                                                    });
                                                                                                                } else {
                                                                                                                    linearLayout5.setVisibility(8);
                                                                                                                    view.setVisibility(8);
                                                                                                                }
                                                                                                                fVar.f32375r.setText(wi.c.h(file.lastModified(), false, true));
                                                                                                                if (file.isFile()) {
                                                                                                                    textView14.setText(wi.c.e(file.length()));
                                                                                                                    if (lowerCase.length() > 0) {
                                                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                                                        char cCharAt = lowerCase.charAt(0);
                                                                                                                        if (Character.isLowerCase(cCharAt)) {
                                                                                                                            String strValueOf2 = String.valueOf(cCharAt);
                                                                                                                            nk.k.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                                                                                                                            strValueOf = strValueOf2.toUpperCase(locale);
                                                                                                                            nk.k.d(strValueOf, "toUpperCase(...)");
                                                                                                                        } else {
                                                                                                                            strValueOf = String.valueOf(cCharAt);
                                                                                                                        }
                                                                                                                        sb2.append((Object) strValueOf);
                                                                                                                        String strSubstring = lowerCase.substring(1);
                                                                                                                        nk.k.d(strSubstring, "substring(...)");
                                                                                                                        sb2.append(strSubstring);
                                                                                                                        string = sb2.toString();
                                                                                                                    } else {
                                                                                                                        string = lowerCase;
                                                                                                                    }
                                                                                                                    textView13.setText(string);
                                                                                                                    linearLayout6.setVisibility(8);
                                                                                                                } else if (file.isDirectory()) {
                                                                                                                    linearLayout6.setVisibility(0);
                                                                                                                    textView14.setText(R.string.fa_calculating);
                                                                                                                    textView13.setText(R.string.folder);
                                                                                                                } else {
                                                                                                                    linearLayout6.setVisibility(8);
                                                                                                                    textView14.setText("0");
                                                                                                                    textView13.setText(R.string.unknown);
                                                                                                                }
                                                                                                                fVar.j.setImageResource(wi.g.c(strI));
                                                                                                                p pVarD = com.bumptech.glide.b.d(imageView3);
                                                                                                                if (lowerCase.equals("apk")) {
                                                                                                                    String path = file.getPath();
                                                                                                                    nk.k.d(path, "getPath(...)");
                                                                                                                    cVar = new ei.c(path);
                                                                                                                } else {
                                                                                                                    cVar = file;
                                                                                                                }
                                                                                                                pVarD.i(Drawable.class).C(cVar).v(new h(fVar)).z(imageView3);
                                                                                                                if (lowerCase.equals("video") || lowerCase.equals("image")) {
                                                                                                                    qg.f fVar2 = this.f23466q0;
                                                                                                                    if (fVar2 == null) {
                                                                                                                        nk.k.k("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    fVar2.f32379v.setVisibility(0);
                                                                                                                    bi.d.c(new g(lowerCase, this));
                                                                                                                } else {
                                                                                                                    qg.f fVar3 = this.f23466q0;
                                                                                                                    if (fVar3 == null) {
                                                                                                                        nk.k.k("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    fVar3.f32379v.setVisibility(8);
                                                                                                                }
                                                                                                                if (!file.isFile()) {
                                                                                                                    final int i11 = 0;
                                                                                                                    bi.d.c(new Runnable() { // from class: eg.f
                                                                                                                        @Override // java.lang.Runnable
                                                                                                                        public final void run() throws PackageManager.NameNotFoundException {
                                                                                                                            /*
                                                                                                                                Method dump skipped, instructions count: 240
                                                                                                                                To view this dump change 'Code comments level' option to 'DEBUG'
                                                                                                                            */
                                                                                                                            throw new UnsupportedOperationException("Method not decompiled: eg.f.run():void");
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                                m mVar = new m(W());
                                                                                                                mVar.y(R.string.properties);
                                                                                                                qg.f fVar4 = this.f23466q0;
                                                                                                                if (fVar4 == null) {
                                                                                                                    nk.k.k("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                mVar.z(fVar4.f32360a);
                                                                                                                mVar.x(R.string.action_open, new d(0, this));
                                                                                                                mVar.w(android.R.string.cancel, null);
                                                                                                                i.e eVarF = mVar.f();
                                                                                                                eVarF.setOnShowListener(new e(eVarF, 0));
                                                                                                                return eVarF;
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
