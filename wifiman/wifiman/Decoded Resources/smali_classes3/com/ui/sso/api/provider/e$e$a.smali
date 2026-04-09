.class public final Lcom/ui/sso/api/provider/e$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/provider/e$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/sso/api/provider/e$e$a;

.field private static final synthetic descriptor:LZi/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/sso/api/provider/e$e$a;

    invoke-direct {v0}, Lcom/ui/sso/api/provider/e$e$a;-><init>()V

    sput-object v0, Lcom/ui/sso/api/provider/e$e$a;->a:Lcom/ui/sso/api/provider/e$e$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.sso.api.UiAccountApiResponse.DeviceIdentifiers"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "id"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "name"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "model"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/sso/api/provider/e$e$a;->descriptor:LZi/H0;

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

    sget-object v0, Lcom/ui/sso/api/provider/e$e$a;->descriptor:LZi/H0;

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

    invoke-virtual {p0, p1}, Lcom/ui/sso/api/provider/e$e$a;->g(LYi/e;)Lcom/ui/sso/api/provider/e$e;

    move-result-object p1

    return-object p1
.end method

.method public d()[LVi/b;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [LVi/b;

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/sso/api/provider/e$e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/sso/api/provider/e$e$a;->h(LYi/f;Lcom/ui/sso/api/provider/e$e;)V

    return-void
.end method

.method public g(LYi/e;)Lcom/ui/sso/api/provider/e$e;
    .locals 16

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/ui/sso/api/provider/e$e$a;->a()LXi/f;

    move-result-object v1

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x7

    move-object v12, v2

    move-object v14, v3

    move-object v13, v4

    move v11, v5

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    move-object v6, v2

    move-object v7, v6

    move v9, v4

    move v8, v5

    :goto_0
    if-eqz v9, :cond_5

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_4

    if-eqz v10, :cond_3

    if-eq v10, v4, :cond_2

    if-ne v10, v3, :cond_1

    invoke-interface {v0, v1, v3}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v6

    or-int/lit8 v8, v8, 0x4

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v10}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v7

    or-int/lit8 v8, v8, 0x2

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    or-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    move v9, v5

    goto :goto_0

    :cond_5
    move-object v12, v2

    move-object v14, v6

    move-object v13, v7

    move v11, v8

    :goto_1
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lcom/ui/sso/api/provider/e$e;

    const/4 v15, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v15}, Lcom/ui/sso/api/provider/e$e;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V

    return-object v0
.end method

.method public h(LYi/f;Lcom/ui/sso/api/provider/e$e;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/e$e$a;->a()LXi/f;

    move-result-object v0

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/sso/api/provider/e$e;->f(Lcom/ui/sso/api/provider/e$e;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
