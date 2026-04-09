.class public final synthetic Lib/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lib/a$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lib/a$a;

    invoke-direct {v0}, Lib/a$a;-><init>()V

    sput-object v0, Lib/a$a;->a:Lib/a$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.client.webrtc.log.UploadUrlRequest"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "anonymous_device_id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "anonymous_controller_id"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "version"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "model"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "bomrev"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "kernel_version"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "architecture"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "crash_log"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "product_line"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "type"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "upload"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "system_time"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lib/a$a;->descriptor:LXi/f;

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

    sget-object v0, Lib/a$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lib/a$a;->g(LYi/e;)Lib/a;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 4

    const/16 v0, 0xc

    new-array v0, v0, [LVi/b;

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v2, LZi/i;->a:LZi/i;

    const/16 v3, 0xa

    aput-object v2, v0, v3

    const/16 v2, 0xb

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lib/a;

    invoke-virtual {p0, p1, p2}, Lib/a$a;->h(LYi/f;Lib/a;)V

    return-void
.end method

.method public final g(LYi/e;)Lib/a;
    .locals 42

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lib/a$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/16 v3, 0xb

    const/16 v4, 0xa

    const/16 v5, 0x9

    const/4 v6, 0x7

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v9, 0x3

    const/16 v10, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v14}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v12}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v1, v11}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v7}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v10}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v4}, LYi/c;->u(LXi/f;I)Z

    move-result v4

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    const/16 v14, 0xfff

    move-object/from16 v29, v2

    move-object/from16 v40, v3

    move/from16 v39, v4

    move-object/from16 v38, v5

    move-object/from16 v36, v6

    move-object/from16 v35, v7

    move-object/from16 v34, v8

    move-object/from16 v32, v9

    move-object/from16 v37, v10

    move-object/from16 v33, v11

    move-object/from16 v31, v12

    move-object/from16 v30, v13

    move/from16 v28, v14

    goto/16 :goto_2

    :cond_0
    const/4 v2, 0x0

    move-object v15, v2

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move/from16 v26, v13

    move/from16 v16, v14

    :goto_0
    if-eqz v26, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit16 v14, v14, 0x800

    :goto_1
    const/4 v13, 0x1

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v4}, LYi/c;->u(LXi/f;I)Z

    move-result v16

    or-int/lit16 v14, v14, 0x400

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit16 v14, v14, 0x200

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v10}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit16 v14, v14, 0x100

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit16 v14, v14, 0x80

    goto :goto_1

    :pswitch_5
    invoke-interface {v0, v1, v7}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v14, v14, 0x40

    goto :goto_1

    :pswitch_6
    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v14, v14, 0x20

    goto :goto_1

    :pswitch_7
    invoke-interface {v0, v1, v11}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v23

    or-int/lit8 v14, v14, 0x10

    goto :goto_1

    :pswitch_8
    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v14, v14, 0x8

    goto :goto_1

    :pswitch_9
    invoke-interface {v0, v1, v12}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v24

    or-int/lit8 v14, v14, 0x4

    goto :goto_1

    :pswitch_a
    const/4 v13, 0x1

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit8 v14, v14, 0x2

    goto :goto_0

    :pswitch_b
    const/4 v2, 0x0

    const/4 v13, 0x1

    invoke-interface {v0, v1, v2}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v27

    or-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v27

    goto :goto_0

    :pswitch_c
    const/16 v26, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v29, v2

    move/from16 v28, v14

    move-object/from16 v40, v15

    move/from16 v39, v16

    move-object/from16 v38, v17

    move-object/from16 v36, v18

    move-object/from16 v35, v19

    move-object/from16 v34, v20

    move-object/from16 v32, v21

    move-object/from16 v37, v22

    move-object/from16 v33, v23

    move-object/from16 v31, v24

    move-object/from16 v30, v25

    :goto_2
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lib/a;

    const/16 v41, 0x0

    move-object/from16 v27, v0

    invoke-direct/range {v27 .. v41}, Lib/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;Lib/a;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lib/a$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lib/a;->a(Lib/a;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
