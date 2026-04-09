.class public final Ld8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/a;


# instance fields
.field private final a:Lgg/b;

.field private final b:Lgg/b;

.field private final c:Lgg/b;

.field private final d:Lgg/b;

.field private final e:Lgg/b;

.field private final f:Lgg/b;

.field private final g:Lgg/b;

.field private final h:Lgg/b;

.field private final i:Lgg/b;

.field private final j:Lgg/b;

.field private final k:Lgg/b;

.field private final l:Lgg/b;

.field private final m:Lgg/b;

.field private final n:Lgg/b;

.field private final o:Lgg/b;

.field private final p:Lgg/b;

.field private final q:Lgg/b;

.field private final r:Lgg/b;

.field private final s:Lgg/b;

.field private final t:Lgg/b;

.field private final u:Lgg/b;

.field private final v:Lgg/b;

.field private final w:Lgg/b;

.field private final x:Lgg/b;

.field private final y:Lgg/b;

.field private final z:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lld/b;Lje/C;Lne/a$a;Lie/f;Lwc/b$a;LDc/e;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;Lkd/d;Lrd/a;Ljd/b;LBc/a;Lrc/b;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/WifimanWizard;LO8/a;LP8/f;Lre/a;LLd/f;LOd/a$a;Lcom/ubnt/usurvey/product/p;Lxa/o;LCc/n;Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;Lhd/a$c;LFd/C;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LSd/d;LFd/D;Lpc/a;)V
    .locals 26

    move-object/from16 v0, p0

    const-string/jumbo v1, "sessionManager"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifiConnectionTimelapseService"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifiSignalTimelapse"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifiAirQualityService"

    move-object/from16 v5, p4

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "bluetoothDeviceStatistics"

    move-object/from16 v6, p5

    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "networkDiscovery"

    move-object/from16 v7, p6

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "speedtestServerService"

    move-object/from16 v8, p7

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "publicIPService"

    move-object/from16 v9, p8

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "app2appSpeedtestServer"

    move-object/from16 v10, p9

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "topology"

    move-object/from16 v11, p10

    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "cellService"

    move-object/from16 v12, p11

    invoke-static {v12, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "appReviewOpertor"

    move-object/from16 v13, p12

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "uispController"

    move-object/from16 v14, p13

    invoke-static {v14, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "accountManager"

    move-object/from16 v15, p14

    invoke-static {v15, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanWizardDiscovery"

    move-object/from16 v2, p15

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanWizard"

    move-object/from16 v2, p16

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanWizardConnectionNotification"

    move-object/from16 v2, p17

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanWizardPopupController"

    move-object/from16 v2, p18

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanWizardApComparisonManager"

    move-object/from16 v2, p19

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "ubiquitiSsoAccountSessionService"

    move-object/from16 v2, p20

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "ubiquitiCloudStatus"

    move-object/from16 v2, p21

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "uidbSynchronizer"

    move-object/from16 v2, p22

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "productCatalog"

    move-object/from16 v2, p23

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanDeviceManager"

    move-object/from16 v2, p24

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "favoriteHostsManager"

    move-object/from16 v2, p25

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "apRoamingService"

    move-object/from16 v2, p26

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "teleportConsoleService"

    move-object/from16 v2, p27

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "teleportDeepLinkConsoleConnectProcessor"

    move-object/from16 v2, p28

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "localConsoleService"

    move-object/from16 v2, p29

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifimanTeleportTunnelManager"

    move-object/from16 v2, p30

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "locationService"

    move-object/from16 v2, p31

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-interface/range {p1 .. p1}, Lld/b;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->E0()Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "ignoreElements(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ld8/b;->a:Lgg/b;

    invoke-interface/range {p2 .. p2}, Lje/C;->a()Lgg/b;

    move-result-object v3

    iput-object v3, v0, Ld8/b;->b:Lgg/b;

    invoke-interface/range {p26 .. p26}, Lhd/a$c;->b()Lgg/b;

    move-result-object v4

    iput-object v4, v0, Ld8/b;->c:Lgg/b;

    invoke-interface/range {p3 .. p3}, Lge/b;->getAll()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Ld8/b;->d:Lgg/b;

    invoke-interface/range {p5 .. p5}, Lge/b;->getAll()Lgg/i;

    move-result-object v6

    invoke-virtual {v6}, Lgg/i;->E0()Lgg/b;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Ld8/b;->e:Lgg/b;

    const-wide/16 v7, 0x5dc

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v7, v8, v9}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v7

    invoke-interface/range {p6 .. p6}, LDc/e;->c()Lgg/b;

    move-result-object v8

    invoke-virtual {v7, v8}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v7

    const-string/jumbo v8, "andThen(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Ld8/b;->f:Lgg/b;

    invoke-interface/range {p7 .. p7}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->c()Lgg/i;

    move-result-object v8

    invoke-virtual {v8}, Lgg/i;->E0()Lgg/b;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v0, Ld8/b;->g:Lgg/b;

    invoke-interface/range {p7 .. p7}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->b()Lgg/i;

    move-result-object v9

    invoke-virtual {v9}, Lgg/i;->E0()Lgg/b;

    move-result-object v9

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, v0, Ld8/b;->h:Lgg/b;

    invoke-interface/range {p8 .. p8}, Lkd/d;->a()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Ld8/b;->i:Lgg/b;

    invoke-interface/range {p9 .. p9}, Lrd/a;->a()Lgg/b;

    move-result-object v11

    iput-object v11, v0, Ld8/b;->j:Lgg/b;

    invoke-interface/range {p10 .. p10}, Ljd/b;->a()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v0, Ld8/b;->k:Lgg/b;

    invoke-interface/range {p11 .. p11}, LBc/a;->b()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v13

    invoke-interface/range {p11 .. p11}, LBc/a;->c()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v14

    filled-new-array {v13, v14}, [Lgg/b;

    move-result-object v13

    invoke-static {v13}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    invoke-static {v13}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object v13

    const-string/jumbo v14, "merge(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ld8/b;->l:Lgg/b;

    invoke-interface/range {p12 .. p12}, Lrc/b;->c()Lgg/b;

    move-result-object v14

    iput-object v14, v0, Ld8/b;->m:Lgg/b;

    invoke-interface/range {p13 .. p13}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;->a()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v0, Ld8/b;->n:Lgg/b;

    invoke-interface/range {p14 .. p14}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->a()Lgg/i;

    move-result-object v16

    move-object/from16 p1, v15

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v15, v0, Ld8/b;->o:Lgg/b;

    move-object/from16 p2, v15

    invoke-interface/range {p30 .. p30}, LFd/D;->c()Lgg/b;

    move-result-object v15

    iput-object v15, v0, Ld8/b;->p:Lgg/b;

    invoke-interface/range {p15 .. p15}, Lcom/ui/wifiman/model/wmw/d;->a()Lgg/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lgg/i;->E0()Lgg/b;

    move-result-object v16

    invoke-interface/range {p16 .. p16}, Lcom/ui/wifiman/model/wmw/WifimanWizard;->c()Lgg/b;

    move-result-object v17

    invoke-interface/range {p17 .. p17}, LO8/a;->a()Lgg/b;

    move-result-object v18

    invoke-interface/range {p18 .. p18}, LP8/f;->d()Lgg/b;

    move-result-object v19

    move-object/from16 p3, v15

    invoke-interface/range {p19 .. p19}, Lre/a;->getState()Lgg/i;

    move-result-object v15

    move-object/from16 p11, v14

    sget-object v14, Ld8/b$c;->a:Ld8/b$c;

    invoke-virtual {v15, v14}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v14

    const/4 v15, 0x5

    move-object/from16 p26, v13

    new-array v13, v15, [Lgg/f;

    const/16 v20, 0x0

    aput-object v16, v13, v20

    const/16 v16, 0x1

    aput-object v17, v13, v16

    const/4 v15, 0x2

    aput-object v18, v13, v15

    const/16 v17, 0x3

    aput-object v19, v13, v17

    const/16 v18, 0x4

    aput-object v14, v13, v18

    invoke-static {v13}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object v13

    const-string/jumbo v14, "mergeArray(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ld8/b;->q:Lgg/b;

    invoke-interface/range {p20 .. p20}, LLd/f;->a()Lgg/i;

    move-result-object v15

    move-object/from16 p14, v13

    sget-object v13, Ld8/b$a;->a:Ld8/b$a;

    invoke-virtual {v15, v13}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v13

    const-string/jumbo v15, "switchMapCompletable(...)"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ld8/b;->r:Lgg/b;

    invoke-interface/range {p21 .. p21}, LOd/a$a;->a()Lgg/i;

    move-result-object v19

    move-object/from16 p15, v13

    invoke-virtual/range {v19 .. v19}, Lgg/i;->E0()Lgg/b;

    move-result-object v13

    invoke-static {v13, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ld8/b;->s:Lgg/b;

    invoke-interface/range {p23 .. p23}, Lxa/o;->b()Lgg/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lgg/i;->E0()Lgg/b;

    move-result-object v19

    const/16 v21, 0x2

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    move-object/from16 p5, p22

    move/from16 p6, v23

    move-wide/from16 p7, v24

    move/from16 p9, v21

    move-object/from16 p10, v22

    invoke-static/range {p5 .. p10}, Lcom/ubnt/usurvey/product/p$a;->a(Lcom/ubnt/usurvey/product/p;ZJILjava/lang/Object;)Lgg/b;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Lgg/b;->M()Lgg/b;

    move-result-object v21

    move-object/from16 p6, v12

    move-object/from16 p5, v13

    const/4 v13, 0x2

    new-array v12, v13, [Lgg/f;

    aput-object v19, v12, v20

    aput-object v21, v12, v16

    invoke-static {v12}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object v12

    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v0, Ld8/b;->t:Lgg/b;

    invoke-interface/range {p24 .. p24}, LCc/n;->a()Lgg/i;

    move-result-object v13

    invoke-virtual {v13}, Lgg/i;->E0()Lgg/b;

    move-result-object v13

    invoke-static {v13, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ld8/b;->u:Lgg/b;

    invoke-interface/range {p25 .. p25}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;->c()Lgg/i;

    move-result-object v14

    invoke-virtual {v14}, Lgg/i;->E0()Lgg/b;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v0, Ld8/b;->v:Lgg/b;

    invoke-interface/range {p4 .. p4}, Lie/f;->a()Lgg/i;

    move-result-object v19

    move-object/from16 p7, v14

    invoke-virtual/range {v19 .. v19}, Lgg/i;->E0()Lgg/b;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v0, Ld8/b;->w:Lgg/b;

    move-object/from16 p4, v14

    invoke-interface/range {p29 .. p29}, LSd/d;->b()Lgg/i;

    move-result-object v14

    move-object/from16 p8, v13

    sget-object v13, Ld8/b$b;->a:Ld8/b$b;

    invoke-virtual {v14, v13}, Lgg/i;->L1(Lkg/n;)Lgg/b;

    move-result-object v13

    invoke-static {v13, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v13, v0, Ld8/b;->x:Lgg/b;

    invoke-interface/range {p31 .. p31}, Lpc/a;->b()Lgg/i;

    move-result-object v14

    invoke-virtual {v14}, Lgg/i;->E0()Lgg/b;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v14, v0, Ld8/b;->y:Lgg/b;

    invoke-interface/range {p28 .. p28}, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;->a()Lgg/b;

    move-result-object v15

    invoke-interface/range {p27 .. p27}, LFd/C;->b()Lgg/b;

    move-result-object v19

    const/16 v0, 0x1b

    new-array v0, v0, [Lgg/f;

    aput-object v1, v0, v20

    aput-object v3, v0, v16

    const/4 v1, 0x2

    aput-object v4, v0, v1

    aput-object v5, v0, v17

    aput-object v6, v0, v18

    const/4 v1, 0x5

    aput-object v7, v0, v1

    const/4 v1, 0x6

    aput-object v8, v0, v1

    const/4 v1, 0x7

    aput-object v9, v0, v1

    const/16 v1, 0x8

    aput-object v10, v0, v1

    const/16 v1, 0x9

    aput-object v11, v0, v1

    const/16 v1, 0xa

    aput-object p6, v0, v1

    const/16 v1, 0xb

    aput-object p26, v0, v1

    const/16 v1, 0xc

    aput-object p11, v0, v1

    const/16 v1, 0xd

    aput-object p1, v0, v1

    const/16 v1, 0xe

    aput-object p2, v0, v1

    const/16 v1, 0xf

    aput-object p3, v0, v1

    const/16 v1, 0x10

    aput-object p14, v0, v1

    const/16 v1, 0x11

    aput-object p15, v0, v1

    const/16 v1, 0x12

    aput-object p5, v0, v1

    const/16 v1, 0x13

    aput-object v12, v0, v1

    const/16 v1, 0x14

    aput-object p8, v0, v1

    const/16 v1, 0x15

    aput-object p7, v0, v1

    const/16 v1, 0x16

    aput-object v15, v0, v1

    const/16 v1, 0x17

    aput-object v19, v0, v1

    const/16 v1, 0x18

    aput-object p4, v0, v1

    const/16 v1, 0x19

    aput-object v13, v0, v1

    const/16 v1, 0x1a

    aput-object v14, v0, v1

    invoke-static {v0}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-virtual {v0}, Lgg/b;->f0()Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->r0()LBg/a;

    move-result-object v0

    invoke-virtual {v0}, LBg/a;->l1()Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->f0()Lgg/b;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Ld8/b;->z:Lgg/b;

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, Ld8/b;->z:Lgg/b;

    return-object v0
.end method
