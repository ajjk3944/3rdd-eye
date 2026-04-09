.class public final synthetic Lnb/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lnb/b$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lnb/b$a;

    invoke-direct {v0}, Lnb/b$a;-><init>()V

    sput-object v0, Lnb/b$a;->a:Lnb/b$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.mqtt.CandidateRequest"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "candidate"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "mid"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "mline_index"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "client"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "clientVersion"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "os"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "event"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lnb/b$a;->descriptor:LXi/f;

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

    sget-object v0, Lnb/b$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lnb/b$a;->g(LYi/e;)Lnb/b;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 5

    sget-object v0, LZi/W0;->a:LZi/W0;

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v1

    sget-object v2, LZi/W;->a:LZi/W;

    invoke-static {v2}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    const/4 v3, 0x7

    new-array v3, v3, [LVi/b;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    aput-object v2, v3, v1

    const/4 v1, 0x3

    aput-object v0, v3, v1

    const/4 v1, 0x4

    aput-object v0, v3, v1

    const/4 v1, 0x5

    aput-object v0, v3, v1

    const/4 v1, 0x6

    aput-object v0, v3, v1

    return-object v3
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lnb/b;

    invoke-virtual {p0, p1, p2}, Lnb/b$a;->h(LYi/f;Lnb/b;)V

    return-void
.end method

.method public final g(LYi/e;)Lnb/b;
    .locals 28

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lnb/b$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    sget-object v9, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v8, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    sget-object v9, LZi/W;->a:LZi/W;

    invoke-interface {v0, v1, v7, v9, v10}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    const/16 v9, 0x7f

    move-object/from16 v20, v2

    move-object/from16 v26, v3

    move-object/from16 v25, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v22, v7

    move-object/from16 v21, v8

    move/from16 v19, v9

    goto/16 :goto_2

    :cond_0
    move/from16 v17, v8

    move v2, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    :goto_0
    if-eqz v17, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v2, v2, 0x40

    :goto_1
    const/4 v9, 0x0

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v2, v2, 0x20

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v14

    or-int/lit8 v2, v2, 0x10

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v13

    or-int/lit8 v2, v2, 0x8

    goto :goto_1

    :pswitch_4
    sget-object v9, LZi/W;->a:LZi/W;

    invoke-interface {v0, v1, v7, v9, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Ljava/lang/Integer;

    or-int/lit8 v2, v2, 0x4

    goto :goto_1

    :pswitch_5
    sget-object v9, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v8, v9, v11}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Ljava/lang/String;

    or-int/lit8 v2, v2, 0x2

    goto :goto_1

    :pswitch_6
    const/4 v9, 0x0

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v2, v2, 0x1

    goto :goto_0

    :pswitch_7
    const/4 v9, 0x0

    move/from16 v17, v9

    goto :goto_0

    :cond_1
    move/from16 v19, v2

    move-object/from16 v20, v10

    move-object/from16 v21, v11

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    move-object/from16 v24, v14

    move-object/from16 v25, v15

    move-object/from16 v26, v16

    :goto_2
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lnb/b;

    const/16 v27, 0x0

    move-object/from16 v18, v0

    invoke-direct/range {v18 .. v27}, Lnb/b;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;Lnb/b;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnb/b$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lnb/b;->e(Lnb/b;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
