package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.PortActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;
import com.phuongpn.whousemywifi.networkscanner.SettingsActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class y00 extends wb {
    @Override // defpackage.iw
    public final void C(View view, Bundle bundle) {
        i30.m(view, "view");
        final int i = 0;
        ((TextView) view.findViewById(R.id.btn_router_default_pss)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((TextView) view.findViewById(R.id.btn_ping)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i3 = 2;
        ((TextView) view.findViewById(R.id.btn_port)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i4 = 3;
        ((TextView) view.findViewById(R.id.btn_router_admin)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i5 = 4;
        ((TextView) view.findViewById(R.id.btn_settings)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i6 = 5;
        ((TextView) view.findViewById(R.id.btn_upgrade)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i7 = 6;
        ((TextView) view.findViewById(R.id.btn_share)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
        final int i8 = 7;
        ((TextView) view.findViewById(R.id.btn_other)).setOnClickListener(new View.OnClickListener(this) { // from class: w00
            public final /* synthetic */ y00 g;

            {
                this.g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        y00 y00Var = this.g;
                        y00Var.M(new Intent(y00Var.g(), (Class<?>) RouterPasswordActivity.class));
                        y00Var.R();
                        break;
                    case 1:
                        y00 y00Var2 = this.g;
                        y00Var2.M(new Intent(y00Var2.g(), (Class<?>) PingActivity.class));
                        y00Var2.R();
                        break;
                    case 2:
                        y00 y00Var3 = this.g;
                        y00Var3.M(new Intent(y00Var3.g(), (Class<?>) PortActivity.class));
                        y00Var3.R();
                        break;
                    case 3:
                        y00 y00Var4 = this.g;
                        y00Var4.M(new Intent(y00Var4.g(), (Class<?>) RouterAdminActivity.class));
                        y00Var4.R();
                        break;
                    case 4:
                        y00 y00Var5 = this.g;
                        y00Var5.M(new Intent(y00Var5.g(), (Class<?>) SettingsActivity.class));
                        y00Var5.R();
                        break;
                    case 5:
                        y00 y00Var6 = this.g;
                        Context contextG = y00Var6.G();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.phuongpn.whousemywifi.networkscanner.pro"));
                        try {
                            intent.addFlags(268435456);
                            contextG.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            e.printStackTrace();
                        }
                        y00Var6.R();
                        break;
                    case 6:
                        y00 y00Var7 = this.g;
                        Context contextG2 = y00Var7.G();
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.SUBJECT", contextG2.getString(R.string.txt_email_share_subject, contextG2.getString(R.string.app_name)));
                        intent2.putExtra("android.intent.extra.TEXT", contextG2.getString(R.string.txt_share_msg, contextG2.getString(R.string.app_name), "https://play.google.com/store/apps/details?id=" + contextG2.getPackageName()));
                        intent2.setType("text/plain");
                        try {
                            intent2.addFlags(268435456);
                            contextG2.startActivity(intent2);
                        } catch (ActivityNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        y00Var7.R();
                        break;
                    default:
                        y00 y00Var8 = this.g;
                        Context contextG3 = y00Var8.G();
                        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=9038809124293846666"));
                        intent3.setPackage("com.android.vending");
                        try {
                            intent3.addFlags(268435456);
                            contextG3.startActivity(intent3);
                        } catch (ActivityNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        y00Var8.R();
                        break;
                }
            }
        });
    }

    @Override // defpackage.wb, defpackage.k6, defpackage.xo
    public final Dialog O(Bundle bundle) {
        try {
            vb vbVar = (vb) super.O(bundle);
            vbVar.setOnShowListener(new x00(0));
            return vbVar;
        } catch (Exception unused) {
            return super.O(bundle);
        }
    }

    @Override // defpackage.iw
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        i30.m(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bottomsheet_home_menu, viewGroup, false);
    }
}
