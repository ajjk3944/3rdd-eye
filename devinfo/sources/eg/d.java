package eg;

import al.i1;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.Toast;
import b5.o0;
import b5.p0;
import b5.u0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;
import com.liuzh.deviceinfo.pro.account.register.RegisterActivity;
import com.liuzh.deviceinfo.provider.ContentFileProvider;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzho.lib.appinfo.AppInfoActivity;
import java.io.File;
import km.n;
import nk.s;
import th.q;
import ui.g0;
import ui.h0;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23455b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f23454a = i4;
        this.f23455b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        String strI;
        int i10 = this.f23454a;
        Object obj = this.f23455b;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setFlags(3);
                String str = iVar.f23465p0;
                if (str == null) {
                    nk.k.k("filePath");
                    throw null;
                }
                File file = new File(str);
                if (file.isDirectory()) {
                    strI = "vnd.android.document/directory";
                } else {
                    String name = file.getName();
                    nk.k.d(name, "getName(...)");
                    strI = wi.c.i(name);
                }
                intent.setDataAndType(ContentFileProvider.e(file), strI);
                try {
                    iVar.b0(intent);
                    return;
                } catch (Exception unused) {
                    Toast.makeText(iVar.W(), R.string.failed, 0).show();
                    return;
                }
            case 1:
                StorageAnalyzeActivity storageAnalyzeActivity = (StorageAnalyzeActivity) obj;
                int i11 = StorageAnalyzeActivity.C;
                storageAnalyzeActivity.getClass();
                n0 n0Var = wi.i.f36764a;
                nh.a.j(storageAnalyzeActivity, storageAnalyzeActivity.getPackageName());
                return;
            case 2:
                int i12 = BindEmailActivity.E;
                dialogInterface.dismiss();
                ((BindEmailActivity) obj).finish();
                return;
            case 3:
                o0 o0Var = RegisterActivity.B;
                ((RegisterActivity) obj).finish();
                return;
            case 4:
                zg.b bVar = (zg.b) obj;
                int i13 = SettingsActivity.J;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            case 5:
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                n nVar = (n) obj;
                com.liuzh.deviceinfo.utilities.f.k("double_battery_current", ((CheckBox) nVar.f28442b).isChecked());
                com.liuzh.deviceinfo.utilities.f.k("half_battery_voltage", ((CheckBox) nVar.f28443c).isChecked());
                return;
            case 6:
                Context contextW = ((rg.f) obj).W();
                n0 n0Var2 = wi.i.f36764a;
                nh.a.j(contextW, contextW.getPackageName());
                return;
            case 7:
                ((s) obj).f29984a = i4;
                return;
            case 8:
                dialogInterface.dismiss();
                q qVarH0 = ((th.f) obj).h0();
                qVarH0.getClass();
                th.l lVar = th.l.f34631a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        lVar = th.l.f34632b;
                    } else if (i4 == 2) {
                        lVar = th.l.f34633c;
                    } else if (i4 == 3) {
                        lVar = th.l.f34634d;
                    } else if (i4 == 4) {
                        lVar = th.l.f34635e;
                    } else if (i4 == 5) {
                        lVar = th.l.f34636f;
                    }
                }
                i1 i1Var = qVarH0.f34649c;
                i1Var.getClass();
                i1Var.j(null, lVar);
                return;
            case 9:
                ((AppInfoActivity.a) obj).f21398q0 = true;
                dialogInterface.dismiss();
                return;
            case 10:
                h0 h0Var = (h0) ((g0) obj).j.f25975k;
                nh.a.j(h0Var.W(), h0Var.Z.f35395a);
                dialogInterface.dismiss();
                return;
            case 11:
                xh.d dVar = (xh.d) obj;
                boolean z3 = com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_bluetooth_connect_permission", false);
                String[] strArr = zg.c.f38281c;
                if (!(!z3 ? true : wi.i.d(dVar, strArr))) {
                    nh.a.j(dVar.W(), "com.liuzh.deviceinfo");
                    return;
                }
                if (dVar.f1948v == null) {
                    throw new IllegalStateException("Fragment " + dVar + " not attached to Activity");
                }
                u0 u0VarS = dVar.s();
                if (u0VarS.F != null) {
                    u0VarS.G.addLast(new p0(dVar.f1934f, 1));
                    u0VarS.F.a(strArr);
                } else {
                    u0VarS.f1898x.getClass();
                }
                com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                com.liuzh.deviceinfo.utilities.f.k("already_request_bluetooth_connect_permission", true);
                return;
            case 12:
                nh.a.k((Context) obj, "com.liuzh.deviceinfo", false);
                return;
            case 13:
                ((yk.c) obj).run();
                return;
            default:
                ((f.b) obj).k(Boolean.FALSE);
                return;
        }
    }

    public /* synthetic */ d(n nVar) {
        this.f23454a = 5;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        this.f23455b = nVar;
    }
}
