.class public final synthetic Lmb/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lmb/l$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/l$a;

    invoke-direct {v0}, Lmb/l$a;-><init>()V

    sput-object v0, Lmb/l$a;->a:Lmb/l$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.devices.Device"

    const/16 v3, 0x18

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "id"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "owner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "lastConnectionStateChange"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "hardwareId"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "mac"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ip"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "addresses"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "hostname"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "directConnectDomain"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "version"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isConnected"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isUpdating"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "controllers"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "apps"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "location"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "hardware"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ncaToken"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "availableControllers"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "timezone"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "features"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "latestAvailableVersion"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "uidb"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "anonid"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lmb/l$a;->descriptor:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LXi/f;
    .locals 1

    sget-object v0, Lmb/l$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmb/l$a;->g(LYi/e;)Lmb/l;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 24

    invoke-static {}, Lmb/l;->a()[LVi/b;

    move-result-object v0

    sget-object v1, LZi/W0;->a:LZi/W0;

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v4

    const/4 v5, 0x7

    aget-object v6, v0, v5

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v7

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v8

    const/16 v9, 0xd

    aget-object v10, v0, v9

    const/16 v11, 0xe

    aget-object v0, v0, v11

    sget-object v12, Lmb/h$a;->a:Lmb/h$a;

    invoke-static {v12}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v12

    sget-object v13, Lmb/p$a;->a:Lmb/p$a;

    invoke-static {v13}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v13

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v14

    sget-object v15, Lmb/c$a;->a:Lmb/c$a;

    invoke-static {v15}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v15

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v16

    sget-object v17, Lmb/f$a;->a:Lmb/f$a;

    invoke-static/range {v17 .. v17}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v17

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v18

    sget-object v19, Lmb/C$a;->a:Lmb/C$a;

    invoke-static/range {v19 .. v19}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v19

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v20

    const/16 v11, 0x18

    new-array v11, v11, [LVi/b;

    const/16 v21, 0x0

    aput-object v1, v11, v21

    sget-object v21, LZi/i;->a:LZi/i;

    const/16 v22, 0x1

    aput-object v21, v11, v22

    sget-object v22, LZi/h0;->a:LZi/h0;

    const/16 v23, 0x2

    aput-object v22, v11, v23

    const/16 v22, 0x3

    aput-object v1, v11, v22

    const/16 v22, 0x4

    aput-object v2, v11, v22

    const/4 v2, 0x5

    aput-object v3, v11, v2

    const/4 v2, 0x6

    aput-object v4, v11, v2

    aput-object v6, v11, v5

    const/16 v2, 0x8

    aput-object v7, v11, v2

    const/16 v2, 0x9

    aput-object v8, v11, v2

    const/16 v2, 0xa

    aput-object v1, v11, v2

    const/16 v1, 0xb

    aput-object v21, v11, v1

    const/16 v1, 0xc

    aput-object v21, v11, v1

    aput-object v10, v11, v9

    const/16 v1, 0xe

    aput-object v0, v11, v1

    const/16 v0, 0xf

    aput-object v12, v11, v0

    const/16 v0, 0x10

    aput-object v13, v11, v0

    const/16 v0, 0x11

    aput-object v14, v11, v0

    const/16 v0, 0x12

    aput-object v15, v11, v0

    const/16 v0, 0x13

    aput-object v16, v11, v0

    const/16 v0, 0x14

    aput-object v17, v11, v0

    const/16 v0, 0x15

    aput-object v18, v11, v0

    const/16 v0, 0x16

    aput-object v19, v11, v0

    const/16 v0, 0x17

    aput-object v20, v11, v0

    return-object v11
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmb/l;

    invoke-virtual {p0, p1, p2}, Lmb/l$a;->h(LYi/f;Lmb/l;)V

    return-void
.end method

.method public final g(LYi/e;)Lmb/l;
    .locals 75

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmb/l$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, Lmb/l;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/16 v11, 0xa

    const/16 v12, 0x9

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 v5, 0x8

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v4, 0x7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v8}, LYi/c;->u(LXi/f;I)Z

    move-result v8

    invoke-interface {v0, v1, v7}, LYi/c;->q(LXi/f;I)J

    move-result-wide v25

    invoke-interface {v0, v1, v15}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v7

    sget-object v9, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v6, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v0, v1, v14, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-interface {v0, v1, v13, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    aget-object v15, v2, v4

    invoke-interface {v0, v1, v4, v15, v10}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v0, v1, v5, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-interface {v0, v1, v11}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0xb

    invoke-interface {v0, v1, v15}, LYi/c;->u(LXi/f;I)Z

    move-result v15

    const/16 v10, 0xc

    invoke-interface {v0, v1, v10}, LYi/c;->u(LXi/f;I)Z

    move-result v10

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    const/16 v3, 0xd

    aget-object v4, v2, v3

    move/from16 v24, v8

    const/4 v8, 0x0

    invoke-interface {v0, v1, v3, v4, v8}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/16 v4, 0xe

    aget-object v2, v2, v4

    invoke-interface {v0, v1, v4, v2, v8}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v4, Lmb/h$a;->a:Lmb/h$a;

    move-object/from16 v21, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v4, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/h;

    sget-object v4, Lmb/p$a;->a:Lmb/p$a;

    move-object/from16 v20, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v4, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/p;

    const/16 v4, 0x11

    invoke-interface {v0, v1, v4, v9, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v18, v2

    sget-object v2, Lmb/c$a;->a:Lmb/c$a;

    move-object/from16 v19, v3

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v2, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/c;

    const/16 v3, 0x13

    invoke-interface {v0, v1, v3, v9, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v16, v2

    sget-object v2, Lmb/f$a;->a:Lmb/f$a;

    move-object/from16 v17, v3

    const/16 v3, 0x14

    invoke-interface {v0, v1, v3, v2, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/f;

    const/16 v3, 0x15

    invoke-interface {v0, v1, v3, v9, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 p1, v2

    const/16 v2, 0x16

    move-object/from16 v27, v3

    sget-object v3, Lmb/C$a;->a:Lmb/C$a;

    invoke-interface {v0, v1, v2, v3, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/C;

    const/16 v3, 0x17

    invoke-interface {v0, v1, v3, v9, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const v8, 0xffffff

    move-object/from16 v70, p1

    move-object/from16 v72, v2

    move-object/from16 v73, v3

    move-object/from16 v67, v4

    move-object/from16 v58, v5

    move-object/from16 v54, v6

    move-object/from16 v53, v7

    move/from16 v48, v8

    move/from16 v62, v10

    move-object/from16 v60, v11

    move-object/from16 v59, v12

    move-object/from16 v56, v13

    move-object/from16 v55, v14

    move/from16 v61, v15

    move-object/from16 v68, v16

    move-object/from16 v69, v17

    move-object/from16 v66, v18

    move-object/from16 v63, v19

    move-object/from16 v65, v20

    move-object/from16 v64, v21

    move-object/from16 v57, v22

    move-object/from16 v49, v23

    move/from16 v50, v24

    move-wide/from16 v51, v25

    move-object/from16 v71, v27

    goto/16 :goto_7

    :cond_0
    move v3, v8

    move-object v8, v10

    const-wide/16 v25, 0x0

    move/from16 v44, v3

    move-object v3, v8

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v10, v7

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v30, v15

    move-object/from16 v36, v30

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move/from16 v31, v9

    move/from16 v35, v31

    move/from16 v41, v35

    move-wide/from16 v42, v25

    move-object/from16 v25, v40

    move-object/from16 v26, v25

    move/from16 v8, v41

    move-object/from16 v9, v26

    :goto_0
    if-eqz v44, :cond_1

    move-object/from16 v45, v14

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v14, 0x17

    move-object/from16 v46, v13

    sget-object v13, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v14, v13, v6}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/high16 v13, 0x800000

    :goto_1
    or-int/2addr v8, v13

    :goto_2
    move-object/from16 v14, v45

    move-object/from16 v13, v46

    goto :goto_0

    :pswitch_1
    move-object/from16 v46, v13

    const/16 v13, 0x16

    sget-object v14, Lmb/C$a;->a:Lmb/C$a;

    invoke-interface {v0, v1, v13, v14, v15}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Lmb/C;

    const/high16 v13, 0x400000

    goto :goto_1

    :pswitch_2
    move-object/from16 v46, v13

    const/16 v13, 0x15

    sget-object v14, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v13, v14, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/high16 v13, 0x200000

    goto :goto_1

    :pswitch_3
    move-object/from16 v46, v13

    sget-object v13, Lmb/f$a;->a:Lmb/f$a;

    const/16 v14, 0x14

    invoke-interface {v0, v1, v14, v13, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmb/f;

    const/high16 v13, 0x100000

    goto :goto_1

    :pswitch_4
    move-object/from16 v46, v13

    const/16 v14, 0x14

    sget-object v13, LZi/W0;->a:LZi/W0;

    const/16 v14, 0x13

    invoke-interface {v0, v1, v14, v13, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const/high16 v13, 0x80000

    goto :goto_1

    :pswitch_5
    move-object/from16 v46, v13

    const/16 v14, 0x13

    sget-object v13, Lmb/c$a;->a:Lmb/c$a;

    const/16 v14, 0x12

    invoke-interface {v0, v1, v14, v13, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lmb/c;

    const/high16 v13, 0x40000

    goto :goto_1

    :pswitch_6
    move-object/from16 v46, v13

    const/16 v14, 0x12

    sget-object v13, LZi/W0;->a:LZi/W0;

    const/16 v14, 0x11

    invoke-interface {v0, v1, v14, v13, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const/high16 v13, 0x20000

    goto :goto_1

    :pswitch_7
    move-object/from16 v46, v13

    const/16 v14, 0x11

    sget-object v13, Lmb/p$a;->a:Lmb/p$a;

    const/16 v14, 0x10

    invoke-interface {v0, v1, v14, v13, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lmb/p;

    const/high16 v13, 0x10000

    goto :goto_1

    :pswitch_8
    move-object/from16 v46, v13

    const/16 v14, 0x10

    sget-object v13, Lmb/h$a;->a:Lmb/h$a;

    const/16 v14, 0xf

    invoke-interface {v0, v1, v14, v13, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lmb/h;

    const v13, 0x8000

    goto/16 :goto_1

    :pswitch_9
    move-object/from16 v46, v13

    const/16 v13, 0xe

    aget-object v14, v2, v13

    invoke-interface {v0, v1, v13, v14, v4}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v46, v13

    const/16 v14, 0xd

    aget-object v13, v2, v14

    move-object/from16 v22, v3

    move-object/from16 v3, v46

    invoke-interface {v0, v1, v14, v13, v3}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/List;

    or-int/lit16 v8, v8, 0x2000

    :goto_3
    move-object/from16 v3, v22

    move-object/from16 v14, v45

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v22, v3

    move-object v3, v13

    const/16 v13, 0xc

    const/16 v14, 0xd

    invoke-interface {v0, v1, v13}, LYi/c;->u(LXi/f;I)Z

    move-result v31

    or-int/lit16 v8, v8, 0x1000

    :goto_4
    move-object v13, v3

    goto :goto_3

    :pswitch_c
    move-object/from16 v22, v3

    move-object v3, v13

    const/16 v13, 0xb

    const/16 v14, 0xd

    invoke-interface {v0, v1, v13}, LYi/c;->u(LXi/f;I)Z

    move-result v41

    or-int/lit16 v8, v8, 0x800

    goto :goto_4

    :pswitch_d
    move-object/from16 v22, v3

    move-object v3, v13

    const/16 v13, 0xa

    const/16 v14, 0xd

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit16 v8, v8, 0x400

    goto :goto_4

    :pswitch_e
    move-object/from16 v22, v3

    move-object v3, v13

    const/16 v14, 0xd

    sget-object v13, LZi/W0;->a:LZi/W0;

    move-object/from16 v34, v3

    move-object/from16 v3, v45

    const/16 v14, 0x9

    invoke-interface {v0, v1, v14, v13, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x200

    move-object v14, v3

    move-object/from16 v3, v22

    :goto_5
    move-object/from16 v13, v34

    goto/16 :goto_0

    :pswitch_f
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v3, v45

    const/16 v14, 0x9

    sget-object v13, LZi/W0;->a:LZi/W0;

    move-object/from16 v33, v3

    move-object/from16 v3, v40

    const/16 v14, 0x8

    invoke-interface {v0, v1, v14, v13, v3}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v40, v3

    check-cast v40, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x100

    move-object/from16 v3, v22

    move-object/from16 v14, v33

    goto :goto_5

    :pswitch_10
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x7

    aget-object v14, v2, v13

    move-object/from16 v40, v2

    move-object/from16 v2, v39

    invoke-interface {v0, v1, v13, v14, v2}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v39, v2

    check-cast v39, Ljava/util/List;

    or-int/lit16 v8, v8, 0x80

    :goto_6
    move-object/from16 v14, v33

    move-object/from16 v13, v34

    move-object/from16 v2, v40

    move-object/from16 v40, v3

    move-object/from16 v3, v22

    goto/16 :goto_0

    :pswitch_11
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x7

    move-object/from16 v40, v2

    move-object/from16 v2, v39

    sget-object v14, LZi/W0;->a:LZi/W0;

    move-object/from16 v32, v2

    move-object/from16 v2, v38

    const/4 v13, 0x6

    invoke-interface {v0, v1, v13, v14, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v38, v2

    check-cast v38, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x40

    move-object/from16 v39, v32

    goto :goto_6

    :pswitch_12
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x6

    move-object/from16 v40, v2

    move-object/from16 v2, v38

    sget-object v14, LZi/W0;->a:LZi/W0;

    move-object/from16 v29, v2

    move-object/from16 v2, v37

    const/4 v13, 0x5

    invoke-interface {v0, v1, v13, v14, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v37, v2

    check-cast v37, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x20

    move-object/from16 v38, v29

    goto :goto_6

    :pswitch_13
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x5

    move-object/from16 v40, v2

    move-object/from16 v2, v37

    sget-object v14, LZi/W0;->a:LZi/W0;

    move-object/from16 v28, v2

    move-object/from16 v2, v36

    const/4 v13, 0x4

    invoke-interface {v0, v1, v13, v14, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v36, v2

    check-cast v36, Ljava/lang/String;

    or-int/lit8 v8, v8, 0x10

    move-object/from16 v37, v28

    goto :goto_6

    :pswitch_14
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x4

    const/4 v14, 0x3

    move-object/from16 v40, v2

    move-object/from16 v2, v36

    invoke-interface {v0, v1, v14}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v8, v8, 0x8

    goto/16 :goto_6

    :pswitch_15
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x2

    const/4 v14, 0x3

    move-object/from16 v40, v2

    move-object/from16 v2, v36

    invoke-interface {v0, v1, v13}, LYi/c;->q(LXi/f;I)J

    move-result-wide v42

    or-int/lit8 v8, v8, 0x4

    goto/16 :goto_6

    :pswitch_16
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x1

    const/4 v14, 0x3

    move-object/from16 v40, v2

    move-object/from16 v2, v36

    invoke-interface {v0, v1, v13}, LYi/c;->u(LXi/f;I)Z

    move-result v35

    or-int/lit8 v8, v8, 0x2

    goto/16 :goto_6

    :pswitch_17
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x0

    const/4 v14, 0x3

    move-object/from16 v40, v2

    move-object/from16 v2, v36

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit8 v8, v8, 0x1

    goto/16 :goto_6

    :pswitch_18
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v33, v45

    const/4 v13, 0x0

    const/4 v14, 0x3

    move-object/from16 v40, v2

    move-object/from16 v2, v36

    move/from16 v44, v13

    goto/16 :goto_6

    :cond_1
    move-object/from16 v22, v3

    move-object/from16 v34, v13

    move-object/from16 v33, v14

    move-object/from16 v2, v36

    move-object/from16 v28, v37

    move-object/from16 v29, v38

    move-object/from16 v32, v39

    move-object/from16 v3, v40

    move-object/from16 v54, v2

    move-object/from16 v58, v3

    move-object/from16 v64, v4

    move-object/from16 v65, v5

    move-object/from16 v73, v6

    move-object/from16 v71, v7

    move/from16 v48, v8

    move-object/from16 v69, v9

    move-object/from16 v68, v10

    move-object/from16 v67, v11

    move-object/from16 v66, v12

    move-object/from16 v72, v15

    move-object/from16 v70, v22

    move-object/from16 v49, v25

    move-object/from16 v53, v26

    move-object/from16 v55, v28

    move-object/from16 v56, v29

    move-object/from16 v60, v30

    move/from16 v62, v31

    move-object/from16 v57, v32

    move-object/from16 v59, v33

    move-object/from16 v63, v34

    move/from16 v50, v35

    move/from16 v61, v41

    move-wide/from16 v51, v42

    :goto_7
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lmb/l;

    move-object/from16 v47, v0

    const/16 v74, 0x0

    invoke-direct/range {v47 .. v74}, Lmb/l;-><init>(ILjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Lmb/c;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/C;Ljava/lang/String;LZi/R0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(LYi/f;Lmb/l;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb/l$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lmb/l;->n(Lmb/l;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
