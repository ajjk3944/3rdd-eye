.class public abstract Lxe/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/s0;

    invoke-direct {v0}, Lxe/s0;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lxe/t0;->a:LT/H0;

    return-void
.end method

.method public static synthetic a()Lxe/r0;
    .locals 1

    invoke-static {}, Lxe/t0;->b()Lxe/r0;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lxe/r0;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No Navigation Analytics set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic c(LAe/p;)LP7/b;
    .locals 0

    invoke-static {p0}, Lxe/t0;->e(LAe/p;)LP7/b;

    move-result-object p0

    return-object p0
.end method

.method public static final d()LT/H0;
    .locals 1

    sget-object v0, Lxe/t0;->a:LT/H0;

    return-object v0
.end method

.method private static final e(LAe/p;)LP7/b;
    .locals 3

    instance-of v0, p0, Lxe/I;

    const/4 v1, 0x0

    if-eqz v0, :cond_2e

    instance-of v0, p0, Lxe/I$c;

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, Lxe/I$p;

    if-eqz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    instance-of v0, p0, Lxe/I$t;

    if-eqz v0, :cond_2

    sget-object v1, LP7/b;->SETTINGS:LP7/b;

    goto/16 :goto_0

    :cond_2
    instance-of v0, p0, Lxe/I$b;

    if-eqz v0, :cond_3

    sget-object v1, LP7/b;->APP_PREFERENCES:LP7/b;

    goto/16 :goto_0

    :cond_3
    instance-of v0, p0, Lxe/I$L;

    if-eqz v0, :cond_4

    sget-object v1, LP7/b;->APP_PREFERENCES_UNIT_SYSTEM:LP7/b;

    goto/16 :goto_0

    :cond_4
    instance-of v0, p0, Lxe/I$g;

    if-eqz v0, :cond_5

    sget-object v1, LP7/b;->APP_PREFERENCES_CONSOLE_DIRECT_CONNECTION_EXPLANATION:LP7/b;

    goto/16 :goto_0

    :cond_5
    instance-of v0, p0, Lxe/I$I;

    if-eqz v0, :cond_6

    sget-object v1, LP7/b;->APP_PREFERENCES_TELEPORT_QUICK_SETTINGS_EXPLANATION_ADD:LP7/b;

    goto/16 :goto_0

    :cond_6
    instance-of v0, p0, Lxe/I$J;

    if-eqz v0, :cond_7

    sget-object v1, LP7/b;->APP_PREFERENCES_TELEPORT_QUICK_SETTINGS_EXPLANATION_REMOVE:LP7/b;

    goto/16 :goto_0

    :cond_7
    instance-of v0, p0, Lxe/I$d;

    if-eqz v0, :cond_8

    sget-object v1, LP7/b;->DEV_PREFERENCES:LP7/b;

    goto/16 :goto_0

    :cond_8
    instance-of v0, p0, Lxe/I$a;

    if-eqz v0, :cond_9

    sget-object v1, LP7/b;->APP_FEEDBACK_FORM:LP7/b;

    goto/16 :goto_0

    :cond_9
    instance-of v0, p0, Lxe/I$s;

    if-eqz v0, :cond_a

    sget-object v1, LP7/b;->SSO_ACCOUNT_SETTINGS:LP7/b;

    goto/16 :goto_0

    :cond_a
    instance-of v0, p0, Lxe/I$r;

    if-eqz v0, :cond_b

    sget-object v1, LP7/b;->SSO_ACCOUNT_PICKER:LP7/b;

    goto/16 :goto_0

    :cond_b
    instance-of v0, p0, Lxe/I$q;

    if-eqz v0, :cond_c

    sget-object v1, LP7/b;->SSO_ACCOUNT_LOGOUT:LP7/b;

    goto/16 :goto_0

    :cond_c
    instance-of v0, p0, Lxe/I$e;

    if-eqz v0, :cond_d

    sget-object v1, LP7/b;->DEVICE_DETAIL:LP7/b;

    goto/16 :goto_0

    :cond_d
    instance-of v0, p0, Lxe/M;

    if-eqz v0, :cond_e

    sget-object v1, LP7/b;->DISCOVERY_DISPLAY_PREFS_BLUETOOTH:LP7/b;

    goto/16 :goto_0

    :cond_e
    instance-of v0, p0, Lxe/N;

    if-eqz v0, :cond_f

    sget-object v1, LP7/b;->DISCOVERY_DISPLAY_PREFS_LAN:LP7/b;

    goto/16 :goto_0

    :cond_f
    instance-of v0, p0, Lxe/I$f;

    if-eqz v0, :cond_10

    sget-object v1, LP7/b;->DEVICE_EDIT:LP7/b;

    goto/16 :goto_0

    :cond_10
    instance-of v0, p0, Lxe/I$R;

    if-eqz v0, :cond_11

    sget-object v1, LP7/b;->WIFI_SCAN_DISPLAY_PREFS_NETWORKS:LP7/b;

    goto/16 :goto_0

    :cond_11
    instance-of v0, p0, Lxe/I$Q;

    if-eqz v0, :cond_12

    sget-object v1, LP7/b;->WIFI_SCAN_DISPLAY_PREFS_QUALITY:LP7/b;

    goto/16 :goto_0

    :cond_12
    instance-of v0, p0, Lxe/I$O;

    if-eqz v0, :cond_13

    sget-object v1, LP7/b;->WIFI_NETWORK_DETAIL:LP7/b;

    goto/16 :goto_0

    :cond_13
    instance-of v0, p0, Lxe/I$P;

    if-eqz v0, :cond_14

    sget-object v1, LP7/b;->WIFI_NETWORK_DISPLAY_PREFS:LP7/b;

    goto/16 :goto_0

    :cond_14
    instance-of v0, p0, Lxe/I$M;

    if-eqz v0, :cond_15

    sget-object v1, LP7/b;->WIFI_SIGNAL_DETAIL:LP7/b;

    goto/16 :goto_0

    :cond_15
    instance-of v0, p0, Lxe/I$N;

    if-eqz v0, :cond_16

    sget-object v1, LP7/b;->WIFI_CHANNEL_DETAIL:LP7/b;

    goto/16 :goto_0

    :cond_16
    instance-of v0, p0, Lxe/I$K;

    if-eqz v0, :cond_17

    sget-object v1, LP7/b;->TELEPORT_VPN_PROFILE:LP7/b;

    goto/16 :goto_0

    :cond_17
    instance-of v0, p0, Lxe/I$G;

    if-eqz v0, :cond_18

    sget-object v1, LP7/b;->TELEPORT_INVITATION:LP7/b;

    goto/16 :goto_0

    :cond_18
    instance-of v0, p0, Lxe/I$H;

    if-eqz v0, :cond_19

    sget-object v1, LP7/b;->TELEPORT_INVITATION_PASTE_FAILED:LP7/b;

    goto/16 :goto_0

    :cond_19
    instance-of v0, p0, Lxe/I$E;

    if-eqz v0, :cond_1a

    sget-object v1, LP7/b;->TELEPORT_CONSOLE_DELETE:LP7/b;

    goto/16 :goto_0

    :cond_1a
    instance-of v0, p0, Lxe/I$F;

    if-eqz v0, :cond_1b

    sget-object v1, LP7/b;->TELEPORT_CONSOLE_UNAVAILABLE:LP7/b;

    goto/16 :goto_0

    :cond_1b
    instance-of v0, p0, Lxe/I$y;

    if-eqz v0, :cond_1c

    sget-object v1, LP7/b;->SPEEDTEST_TEST:LP7/b;

    goto/16 :goto_0

    :cond_1c
    instance-of v0, p0, Lxe/I$C;

    if-eqz v0, :cond_1d

    sget-object v1, LP7/b;->SPEEDTEST_RESULT_HISTORY:LP7/b;

    goto/16 :goto_0

    :cond_1d
    instance-of v0, p0, Lxe/I$B;

    if-eqz v0, :cond_1e

    sget-object v1, LP7/b;->SPEEDTEST_RESULT:LP7/b;

    goto/16 :goto_0

    :cond_1e
    instance-of v0, p0, Lxe/I$z;

    if-eqz v0, :cond_1f

    sget-object v1, LP7/b;->SPEEDTEST_TEST_ERROR:LP7/b;

    goto/16 :goto_0

    :cond_1f
    instance-of v0, p0, Lxe/I$A;

    if-eqz v0, :cond_20

    sget-object v1, LP7/b;->SPEEDTEST_FEEDBACK:LP7/b;

    goto/16 :goto_0

    :cond_20
    instance-of v0, p0, Lxe/I$D;

    if-eqz v0, :cond_21

    sget-object v1, LP7/b;->SPEEDTEST_SERVER_PICKER:LP7/b;

    goto/16 :goto_0

    :cond_21
    instance-of v0, p0, Lxe/I$l;

    if-eqz v0, :cond_22

    sget-object v1, LP7/b;->ISP_DETAIL:LP7/b;

    goto/16 :goto_0

    :cond_22
    instance-of v0, p0, Lxe/I$m;

    if-eqz v0, :cond_23

    sget-object v1, LP7/b;->NETWORK_LATENCY:LP7/b;

    goto/16 :goto_0

    :cond_23
    instance-of v0, p0, Lxe/I$n;

    if-eqz v0, :cond_24

    sget-object v1, LP7/b;->NETWORK_LATENCY_ADD:LP7/b;

    goto :goto_0

    :cond_24
    instance-of v0, p0, Lxe/I$x;

    if-eqz v0, :cond_25

    sget-object v1, LP7/b;->SPEED_FACTORS_EXPLANATION:LP7/b;

    goto :goto_0

    :cond_25
    instance-of v0, p0, Lxe/I$h;

    if-eqz v0, :cond_26

    sget-object v1, LP7/b;->FLOORPLAN:LP7/b;

    goto :goto_0

    :cond_26
    instance-of v0, p0, Lxe/I$k;

    if-eqz v0, :cond_27

    sget-object v1, LP7/b;->FLOORPLAN_SAVE:LP7/b;

    goto :goto_0

    :cond_27
    instance-of v0, p0, Lxe/I$i;

    if-eqz v0, :cond_28

    sget-object v1, LP7/b;->FLOORPLAN_DELETE:LP7/b;

    goto :goto_0

    :cond_28
    instance-of v0, p0, Lxe/I$j;

    if-eqz v0, :cond_29

    sget-object v1, LP7/b;->FLOORPLAN_DETAIL:LP7/b;

    goto :goto_0

    :cond_29
    instance-of v0, p0, Lxe/I$v;

    if-eqz v0, :cond_2a

    sget-object v1, LP7/b;->SIGNAL_PLACE_ADD:LP7/b;

    goto :goto_0

    :cond_2a
    instance-of v0, p0, Lxe/I$w;

    if-eqz v0, :cond_2b

    sget-object v1, LP7/b;->SIGNAL_PLACE_DETAIL:LP7/b;

    goto :goto_0

    :cond_2b
    instance-of v0, p0, Lxe/I$u;

    if-eqz v0, :cond_2c

    sget-object v1, LP7/b;->SIGNAL_AP_COMPARISON_CONFIG:LP7/b;

    goto :goto_0

    :cond_2c
    instance-of p0, p0, Lxe/I$o;

    if-eqz p0, :cond_2d

    sget-object v1, LP7/b;->PERMISSION_EXPLANATION:LP7/b;

    goto :goto_0

    :cond_2d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown nav destination type: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x6

    invoke-static {p0, v1, v1, v0, v1}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-object v1
.end method
