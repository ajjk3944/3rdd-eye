.class public final Lcom/ui/sso/api/provider/e$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/e$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/provider/e$h$a;

.field private static final synthetic descriptor:LZi/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/e$h$a;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/e$h$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/e$h$a;->a:Lcom/ui/sso/api/provider/e$h$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.sso.api.UiAccountApiResponse.StateV2"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "version"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "accountType"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isAccountOwner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "appPackage"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isAndroidStorageOwner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "isLocalStorageOwner"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/sso/api/provider/e$h$a;->descriptor:LZi/H0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    sget-object v0, Lcom/ui/sso/api/provider/e$h$a;->descriptor:LZi/H0;

    return-object v0
.end method

.method public b()[LVi/b;
    .locals 1

    invoke-static {p0}, LZi/M$a;->a(LZi/M;)[LVi/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/e$h$a;->g(LYi/e;)Lcom/ui/sso/api/provider/e$h;

    move-result-object p1

    return-object p1
.end method

.method public d()[LVi/b;
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [LVi/b;

    sget-object v1, LZi/W;->a:LZi/W;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, LZi/i;->a:LZi/i;

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v1, 0x4

    aput-object v2, v0, v1

    const/4 v1, 0x5

    aput-object v2, v0, v1

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/sso/api/provider/e$h;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/e$h$a;->h(LYi/f;Lcom/ui/sso/api/provider/e$h;)V

    return-void
.end method

.method public g(LYi/e;)Lcom/ui/sso/api/provider/e$h;
    .locals 25

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/ui/sso/api/provider/e$h$a;->a()LXi/f;

    move-result-object v1

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v8}, LYi/c;->i(LXi/f;I)I

    move-result v2

    invoke-interface {v0, v1, v7}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v6}, LYi/c;->u(LXi/f;I)Z

    move-result v6

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v5

    invoke-interface {v0, v1, v3}, LYi/c;->u(LXi/f;I)Z

    move-result v3

    const/16 v8, 0x3f

    move/from16 v18, v2

    move/from16 v23, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    move/from16 v20, v6

    move-object/from16 v19, v7

    move/from16 v17, v8

    goto/16 :goto_2

    :cond_0
    const/4 v2, 0x0

    move-object v10, v2

    move-object v13, v10

    move v15, v7

    move v2, v8

    move v9, v2

    move v11, v9

    move v12, v11

    move v14, v12

    :goto_0
    if-eqz v15, :cond_1

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, LYi/c;->u(LXi/f;I)Z

    move-result v9

    or-int/lit8 v14, v14, 0x20

    :goto_1
    const/4 v8, 0x0

    goto :goto_0

    :pswitch_1
    invoke-interface {v0, v1, v5}, LYi/c;->u(LXi/f;I)Z

    move-result v11

    or-int/lit8 v14, v14, 0x10

    goto :goto_1

    :pswitch_2
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v14, v14, 0x8

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v6}, LYi/c;->u(LXi/f;I)Z

    move-result v12

    or-int/lit8 v14, v14, 0x4

    goto :goto_1

    :pswitch_4
    invoke-interface {v0, v1, v7}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v13

    or-int/lit8 v14, v14, 0x2

    goto :goto_1

    :pswitch_5
    const/4 v8, 0x0

    invoke-interface {v0, v1, v8}, LYi/c;->i(LXi/f;I)I

    move-result v2

    or-int/lit8 v14, v14, 0x1

    goto :goto_0

    :pswitch_6
    const/4 v8, 0x0

    move v15, v8

    goto :goto_0

    :cond_1
    move/from16 v18, v2

    move/from16 v23, v9

    move-object/from16 v21, v10

    move/from16 v22, v11

    move/from16 v20, v12

    move-object/from16 v19, v13

    move/from16 v17, v14

    :goto_2
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lcom/ui/sso/api/provider/e$h;

    const/16 v24, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v24}, Lcom/ui/sso/api/provider/e$h;-><init>(IILjava/lang/String;ZLjava/lang/String;ZZLZi/R0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(LYi/f;Lcom/ui/sso/api/provider/e$h;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/e$h$a;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/sso/api/provider/e$h;->i(Lcom/ui/sso/api/provider/e$h;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
