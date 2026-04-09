.class public final synthetic Llb/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Llb/b$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llb/b$a;

    invoke-direct {v0}, Llb/b$a;-><init>()V

    sput-object v0, Llb/b$a;->a:Llb/b$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.CloudCredentials"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "accessKeyId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "secretKey"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "identityId"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "roles"

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "sessionToken"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "expiration"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "region"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "turnCredentials"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "token"

    invoke-virtual {v1, v0, v3}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Llb/b$a;->descriptor:LXi/f;

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

    sget-object v0, Llb/b$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Llb/b$a;->g(LYi/e;)Llb/b;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 6

    invoke-static {}, Llb/b;->a()[LVi/b;

    move-result-object v0

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-static {v0}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v0

    invoke-static {v1}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    const/16 v4, 0x9

    new-array v4, v4, [LVi/b;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    aput-object v0, v4, v2

    const/4 v0, 0x4

    aput-object v1, v4, v0

    sget-object v0, LZi/h0;->a:LZi/h0;

    const/4 v2, 0x5

    aput-object v0, v4, v2

    const/4 v0, 0x6

    aput-object v1, v4, v0

    sget-object v0, Llb/n$a;->a:Llb/n$a;

    const/4 v1, 0x7

    aput-object v0, v4, v1

    const/16 v0, 0x8

    aput-object v3, v4, v0

    return-object v4
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Llb/b;

    invoke-virtual {p0, p1, p2}, Llb/b$a;->h(LYi/f;Llb/b;)V

    return-void
.end method

.method public final g(LYi/e;)Llb/b;
    .locals 36

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llb/b$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, Llb/b;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/16 v7, 0x8

    const/4 v8, 0x4

    const/4 v9, 0x2

    const/4 v10, 0x3

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v12}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v11}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v0, v1, v9}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v9

    aget-object v2, v2, v10

    invoke-interface {v0, v1, v10, v2, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v1, v6}, LYi/c;->q(LXi/f;I)J

    move-result-wide v14

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Llb/n$a;->a:Llb/n$a;

    invoke-interface {v0, v1, v4, v6, v13}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb/n;

    sget-object v6, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v7, v6, v13}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const/16 v7, 0x1ff

    move-object/from16 v28, v2

    move-object/from16 v25, v3

    move-object/from16 v33, v4

    move-object/from16 v32, v5

    move-object/from16 v34, v6

    move/from16 v24, v7

    move-object/from16 v29, v8

    move-object/from16 v27, v9

    move-object/from16 v26, v11

    move-wide/from16 v30, v14

    goto/16 :goto_3

    :cond_0
    const-wide/16 v14, 0x0

    move/from16 v22, v11

    move v3, v12

    move-object v9, v13

    move-object v11, v9

    move-object v12, v11

    move-object/from16 v16, v12

    move-object/from16 v17, v16

    move-wide/from16 v20, v14

    move-object/from16 v14, v17

    move-object v15, v14

    :goto_0
    if-eqz v22, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    sget-object v10, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v7, v10, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    or-int/lit16 v3, v3, 0x100

    :goto_1
    const/4 v10, 0x3

    goto :goto_0

    :pswitch_1
    sget-object v10, Llb/n$a;->a:Llb/n$a;

    invoke-interface {v0, v1, v4, v10, v11}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Llb/n;

    or-int/lit16 v3, v3, 0x80

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v17

    or-int/lit8 v3, v3, 0x40

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v6}, LYi/c;->q(LXi/f;I)J

    move-result-wide v20

    or-int/lit8 v3, v3, 0x20

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v16

    or-int/lit8 v3, v3, 0x10

    goto :goto_1

    :pswitch_5
    const/4 v10, 0x3

    aget-object v4, v2, v10

    invoke-interface {v0, v1, v10, v4, v12}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/util/List;

    or-int/lit8 v3, v3, 0x8

    :goto_2
    const/4 v4, 0x7

    goto :goto_0

    :pswitch_6
    const/4 v4, 0x2

    const/4 v10, 0x3

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v15

    or-int/lit8 v3, v3, 0x4

    goto :goto_2

    :pswitch_7
    const/4 v4, 0x2

    const/4 v10, 0x3

    const/4 v14, 0x1

    invoke-interface {v0, v1, v14}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v18

    or-int/lit8 v3, v3, 0x2

    move-object/from16 v14, v18

    goto :goto_2

    :pswitch_8
    const/4 v4, 0x2

    const/4 v10, 0x3

    const/4 v13, 0x0

    const/16 v18, 0x1

    invoke-interface {v0, v1, v13}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v3, v3, 0x1

    move-object/from16 v13, v19

    goto :goto_2

    :pswitch_9
    const/4 v4, 0x2

    const/4 v10, 0x3

    const/16 v18, 0x1

    const/16 v19, 0x0

    move/from16 v22, v19

    goto :goto_2

    :cond_1
    move/from16 v24, v3

    move-object/from16 v34, v9

    move-object/from16 v33, v11

    move-object/from16 v28, v12

    move-object/from16 v25, v13

    move-object/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v29, v16

    move-object/from16 v32, v17

    move-wide/from16 v30, v20

    :goto_3
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Llb/b;

    const/16 v35, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v23 .. v35}, Llb/b;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Llb/n;Ljava/lang/String;LZi/R0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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

.method public final h(LYi/f;Llb/b;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb/b$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Llb/b;->h(Llb/b;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
