.class public final synthetic Lmb/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lmb/B$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/B$a;

    invoke-direct {v0}, Lmb/B$a;-><init>()V

    sput-object v0, Lmb/B$a;->a:Lmb/B$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.devices.UcoreState"

    const/16 v3, 0x13

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "hostname"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "version"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "state"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "deviceState"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ip"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "mac"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "ipAddrs"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "controllers"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "apps"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "location"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "hardware"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "auth_token"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "timezone"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "features"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "directConnectDomain"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "firmwareUpdate"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "uidb"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "anonid"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lmb/B$a;->descriptor:LXi/f;

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

    sget-object v0, Lmb/B$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmb/B$a;->g(LYi/e;)Lmb/B;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 22

    invoke-static {}, Lmb/B;->a()[LVi/b;

    move-result-object v0

    sget-object v1, LZi/W0;->a:LZi/W0;

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    sget-object v4, Lmb/m$b;->f:Lmb/m$b;

    invoke-static {v4}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v4

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v5

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v6

    const/4 v7, 0x7

    aget-object v8, v0, v7

    invoke-static {v8}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v8

    const/16 v9, 0x8

    aget-object v10, v0, v9

    const/16 v11, 0x9

    aget-object v0, v0, v11

    sget-object v12, Lmb/h$a;->a:Lmb/h$a;

    invoke-static {v12}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v12

    sget-object v13, Lmb/p$a;->a:Lmb/p$a;

    invoke-static {v13}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v13

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v14

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v15

    sget-object v16, Lmb/f$a;->a:Lmb/f$a;

    invoke-static/range {v16 .. v16}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v16

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v17

    sget-object v18, Lmb/o$a;->a:Lmb/o$a;

    invoke-static/range {v18 .. v18}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v18

    sget-object v19, Lmb/C$a;->a:Lmb/C$a;

    invoke-static/range {v19 .. v19}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v19

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v20

    const/16 v11, 0x13

    new-array v11, v11, [LVi/b;

    const/16 v21, 0x0

    aput-object v2, v11, v21

    const/4 v2, 0x1

    aput-object v3, v11, v2

    const/4 v2, 0x2

    aput-object v1, v11, v2

    const/4 v2, 0x3

    aput-object v1, v11, v2

    const/4 v1, 0x4

    aput-object v4, v11, v1

    const/4 v1, 0x5

    aput-object v5, v11, v1

    const/4 v1, 0x6

    aput-object v6, v11, v1

    aput-object v8, v11, v7

    aput-object v10, v11, v9

    const/16 v1, 0x9

    aput-object v0, v11, v1

    const/16 v0, 0xa

    aput-object v12, v11, v0

    const/16 v0, 0xb

    aput-object v13, v11, v0

    const/16 v0, 0xc

    aput-object v14, v11, v0

    const/16 v0, 0xd

    aput-object v15, v11, v0

    const/16 v0, 0xe

    aput-object v16, v11, v0

    const/16 v0, 0xf

    aput-object v17, v11, v0

    const/16 v0, 0x10

    aput-object v18, v11, v0

    const/16 v0, 0x11

    aput-object v19, v11, v0

    const/16 v0, 0x12

    aput-object v20, v11, v0

    return-object v11
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmb/B;

    invoke-virtual {p0, p1, p2}, Lmb/B$a;->h(LYi/f;Lmb/B;)V

    return-void
.end method

.method public final g(LYi/e;)Lmb/B;
    .locals 61

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lmb/B$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, Lmb/B;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/16 v15, 0x9

    const/4 v6, 0x7

    const/16 v7, 0x8

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    sget-object v3, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v9, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v0, v1, v8, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v14}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v14

    sget-object v11, Lmb/m$b;->f:Lmb/m$b;

    invoke-interface {v0, v1, v4, v11, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmb/m;

    invoke-interface {v0, v1, v13, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v0, v1, v12, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    aget-object v13, v2, v6

    invoke-interface {v0, v1, v6, v13, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    aget-object v13, v2, v7

    invoke-interface {v0, v1, v7, v13, v10}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    aget-object v2, v2, v15

    invoke-interface {v0, v1, v15, v2, v10}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v13, Lmb/h$a;->a:Lmb/h$a;

    const/16 v15, 0xa

    invoke-interface {v0, v1, v15, v13, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lmb/h;

    sget-object v15, Lmb/p$a;->a:Lmb/p$a;

    move-object/from16 v22, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/p;

    const/16 v15, 0xc

    invoke-interface {v0, v1, v15, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v20, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    sget-object v2, Lmb/f$a;->a:Lmb/f$a;

    move-object/from16 v21, v4

    const/16 v4, 0xe

    invoke-interface {v0, v1, v4, v2, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/f;

    const/16 v4, 0xf

    invoke-interface {v0, v1, v4, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v17, v2

    sget-object v2, Lmb/o$a;->a:Lmb/o$a;

    move-object/from16 v18, v4

    const/16 v4, 0x10

    invoke-interface {v0, v1, v4, v2, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/o;

    sget-object v4, Lmb/C$a;->a:Lmb/C$a;

    move-object/from16 v16, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v4, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmb/C;

    const/16 v4, 0x12

    invoke-interface {v0, v1, v4, v3, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const v4, 0x7ffff

    move-object/from16 v58, v2

    move-object/from16 v59, v3

    move/from16 v40, v4

    move-object/from16 v43, v5

    move-object/from16 v48, v6

    move-object/from16 v49, v7

    move-object/from16 v42, v8

    move-object/from16 v41, v9

    move-object/from16 v46, v11

    move-object/from16 v47, v12

    move-object/from16 v51, v13

    move-object/from16 v44, v14

    move-object/from16 v53, v15

    move-object/from16 v57, v16

    move-object/from16 v55, v17

    move-object/from16 v56, v18

    move-object/from16 v54, v19

    move-object/from16 v52, v20

    move-object/from16 v45, v21

    move-object/from16 v50, v22

    goto/16 :goto_6

    :cond_0
    move/from16 v36, v8

    move v3, v9

    move-object v4, v10

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v23, v15

    move-object/from16 v24, v23

    move-object/from16 v31, v24

    move-object/from16 v32, v31

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    :goto_0
    if-eqz v36, :cond_1

    move-object/from16 v37, v14

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v14, LZi/W0;->a:LZi/W0;

    move-object/from16 v38, v4

    const/16 v4, 0x12

    invoke-interface {v0, v1, v4, v14, v5}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const/high16 v14, 0x40000

    :goto_1
    or-int/2addr v3, v14

    :goto_2
    move-object/from16 v14, v37

    move-object/from16 v4, v38

    goto :goto_0

    :pswitch_1
    move-object/from16 v38, v4

    const/16 v4, 0x12

    sget-object v14, Lmb/C$a;->a:Lmb/C$a;

    const/16 v4, 0x11

    invoke-interface {v0, v1, v4, v14, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lmb/C;

    const/high16 v14, 0x20000

    goto :goto_1

    :pswitch_2
    move-object/from16 v38, v4

    const/16 v4, 0x11

    sget-object v14, Lmb/o$a;->a:Lmb/o$a;

    const/16 v4, 0x10

    invoke-interface {v0, v1, v4, v14, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lmb/o;

    const/high16 v14, 0x10000

    goto :goto_1

    :pswitch_3
    move-object/from16 v38, v4

    const/16 v4, 0x10

    sget-object v14, LZi/W0;->a:LZi/W0;

    const/16 v4, 0xf

    invoke-interface {v0, v1, v4, v14, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const v14, 0x8000

    goto :goto_1

    :pswitch_4
    move-object/from16 v38, v4

    const/16 v4, 0xf

    sget-object v14, Lmb/f$a;->a:Lmb/f$a;

    const/16 v4, 0xe

    invoke-interface {v0, v1, v4, v14, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lmb/f;

    or-int/lit16 v3, v3, 0x4000

    goto :goto_2

    :pswitch_5
    move-object/from16 v38, v4

    const/16 v4, 0xe

    sget-object v14, LZi/W0;->a:LZi/W0;

    const/16 v4, 0xd

    invoke-interface {v0, v1, v4, v14, v15}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x2000

    goto :goto_2

    :pswitch_6
    move-object/from16 v38, v4

    const/16 v4, 0xd

    sget-object v14, LZi/W0;->a:LZi/W0;

    const/16 v4, 0xc

    invoke-interface {v0, v1, v4, v14, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x1000

    goto :goto_2

    :pswitch_7
    move-object/from16 v38, v4

    const/16 v4, 0xc

    sget-object v14, Lmb/p$a;->a:Lmb/p$a;

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v14, v6}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lmb/p;

    or-int/lit16 v3, v3, 0x800

    goto :goto_2

    :pswitch_8
    move-object/from16 v38, v4

    const/16 v4, 0xb

    sget-object v14, Lmb/h$a;->a:Lmb/h$a;

    const/16 v4, 0xa

    invoke-interface {v0, v1, v4, v14, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lmb/h;

    or-int/lit16 v3, v3, 0x400

    goto/16 :goto_2

    :pswitch_9
    move-object/from16 v38, v4

    const/16 v14, 0x9

    aget-object v4, v2, v14

    invoke-interface {v0, v1, v14, v4, v13}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/util/List;

    or-int/lit16 v3, v3, 0x200

    goto/16 :goto_2

    :pswitch_a
    move-object/from16 v38, v4

    const/16 v4, 0x8

    aget-object v14, v2, v4

    move-object/from16 v30, v5

    move-object/from16 v5, v38

    invoke-interface {v0, v1, v4, v14, v5}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    or-int/lit16 v3, v3, 0x100

    move-object v4, v5

    move-object/from16 v5, v30

    move-object/from16 v14, v37

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v30, v5

    const/4 v14, 0x7

    move-object v5, v4

    aget-object v4, v2, v14

    move-object/from16 v38, v2

    move-object/from16 v2, v37

    invoke-interface {v0, v1, v14, v4, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    or-int/lit16 v3, v3, 0x80

    move-object v14, v2

    move-object v4, v5

    :goto_3
    move-object/from16 v5, v30

    move-object/from16 v2, v38

    goto/16 :goto_0

    :pswitch_c
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v37

    const/4 v14, 0x7

    move-object v5, v4

    sget-object v4, LZi/W0;->a:LZi/W0;

    move-object/from16 v29, v2

    move-object/from16 v2, v35

    const/4 v14, 0x6

    invoke-interface {v0, v1, v14, v4, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x40

    :goto_4
    move-object v4, v5

    :goto_5
    move-object/from16 v14, v29

    goto :goto_3

    :pswitch_d
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v35

    move-object/from16 v29, v37

    const/4 v14, 0x6

    move-object v5, v4

    sget-object v4, LZi/W0;->a:LZi/W0;

    move-object/from16 v28, v2

    move-object/from16 v2, v34

    const/4 v14, 0x5

    invoke-interface {v0, v1, v14, v4, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v34, v2

    check-cast v34, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x20

    move-object v4, v5

    move-object/from16 v35, v28

    goto :goto_5

    :pswitch_e
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v34

    move-object/from16 v28, v35

    move-object/from16 v29, v37

    const/4 v14, 0x5

    move-object v5, v4

    sget-object v4, Lmb/m$b;->f:Lmb/m$b;

    move-object/from16 v27, v2

    move-object/from16 v2, v33

    const/4 v14, 0x4

    invoke-interface {v0, v1, v14, v4, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v33, v2

    check-cast v33, Lmb/m;

    or-int/lit8 v3, v3, 0x10

    move-object v4, v5

    move-object/from16 v34, v27

    goto :goto_5

    :pswitch_f
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v33

    move-object/from16 v27, v34

    move-object/from16 v28, v35

    move-object/from16 v29, v37

    const/4 v14, 0x4

    move-object v5, v4

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v3, v3, 0x8

    goto :goto_4

    :pswitch_10
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v33

    move-object/from16 v27, v34

    move-object/from16 v28, v35

    move-object/from16 v29, v37

    const/4 v14, 0x4

    move-object v5, v4

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v3, v3, 0x4

    goto :goto_4

    :pswitch_11
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v33

    move-object/from16 v27, v34

    move-object/from16 v28, v35

    move-object/from16 v29, v37

    const/4 v14, 0x4

    move-object v5, v4

    sget-object v4, LZi/W0;->a:LZi/W0;

    move-object/from16 v26, v2

    move-object/from16 v2, v32

    const/4 v14, 0x1

    invoke-interface {v0, v1, v14, v4, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v32, v2

    check-cast v32, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x2

    move-object v4, v5

    move-object/from16 v33, v26

    goto/16 :goto_5

    :pswitch_12
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v32

    move-object/from16 v26, v33

    move-object/from16 v27, v34

    move-object/from16 v28, v35

    move-object/from16 v29, v37

    const/4 v14, 0x1

    move-object v5, v4

    sget-object v4, LZi/W0;->a:LZi/W0;

    move-object/from16 v25, v2

    move-object/from16 v2, v31

    const/4 v14, 0x0

    invoke-interface {v0, v1, v14, v4, v2}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x1

    move-object v4, v5

    move-object/from16 v32, v25

    goto/16 :goto_5

    :pswitch_13
    move-object/from16 v38, v2

    move-object/from16 v30, v5

    move-object/from16 v2, v31

    move-object/from16 v25, v32

    move-object/from16 v26, v33

    move-object/from16 v27, v34

    move-object/from16 v28, v35

    move-object/from16 v29, v37

    const/4 v14, 0x0

    move-object v5, v4

    move/from16 v36, v14

    goto/16 :goto_5

    :cond_1
    move-object/from16 v30, v5

    move-object/from16 v29, v14

    move-object/from16 v2, v31

    move-object/from16 v25, v32

    move-object/from16 v26, v33

    move-object/from16 v27, v34

    move-object/from16 v28, v35

    move-object v5, v4

    move-object/from16 v41, v2

    move/from16 v40, v3

    move-object/from16 v49, v5

    move-object/from16 v52, v6

    move-object/from16 v53, v7

    move-object/from16 v58, v8

    move-object/from16 v57, v9

    move-object/from16 v55, v10

    move-object/from16 v56, v11

    move-object/from16 v51, v12

    move-object/from16 v50, v13

    move-object/from16 v54, v15

    move-object/from16 v43, v23

    move-object/from16 v44, v24

    move-object/from16 v42, v25

    move-object/from16 v45, v26

    move-object/from16 v46, v27

    move-object/from16 v47, v28

    move-object/from16 v48, v29

    move-object/from16 v59, v30

    :goto_6
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lmb/B;

    move-object/from16 v39, v0

    const/16 v60, 0x0

    invoke-direct/range {v39 .. v60}, Lmb/B;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmb/m;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lmb/h;Lmb/p;Ljava/lang/String;Ljava/lang/String;Lmb/f;Ljava/lang/String;Lmb/o;Lmb/C;Ljava/lang/String;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;Lmb/B;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb/B$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lmb/B;->u(Lmb/B;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
