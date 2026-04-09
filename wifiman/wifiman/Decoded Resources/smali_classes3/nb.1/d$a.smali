.class public final synthetic Lnb/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lnb/d$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lnb/d$a;

    invoke-direct {v0}, Lnb/d$a;-><init>()V

    sput-object v0, Lnb/d$a;->a:Lnb/d$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.mqtt.IceServers"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "urls"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "username"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "credential"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lnb/d$a;->descriptor:LXi/f;

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

    sget-object v0, Lnb/d$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lnb/d$a;->g(LYi/e;)Lnb/d;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 5

    invoke-static {}, Lnb/d;->a()[LVi/b;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, LZi/W0;->a:LZi/W0;

    invoke-static {v2}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v3

    invoke-static {v2}, LWi/a;->u(LVi/b;)LVi/b;

    move-result-object v2

    const/4 v4, 0x3

    new-array v4, v4, [LVi/b;

    aput-object v0, v4, v1

    const/4 v0, 0x1

    aput-object v3, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    return-object v4
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lnb/d;

    invoke-virtual {p0, p1, p2}, Lnb/d$a;->h(LYi/f;Lnb/d;)V

    return-void
.end method

.method public final g(LYi/e;)Lnb/d;
    .locals 17

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lnb/d$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, Lnb/d;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    aget-object v2, v2, v6

    invoke-interface {v0, v1, v6, v2, v7}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v3, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v5, v3, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v0, v1, v4, v3, v7}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x7

    move-object v13, v2

    move-object v15, v3

    move v12, v4

    move-object v14, v5

    goto :goto_1

    :cond_0
    move v10, v5

    move v3, v6

    move-object v8, v7

    move-object v9, v8

    :goto_0
    if-eqz v10, :cond_5

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_4

    if-eqz v11, :cond_3

    if-eq v11, v5, :cond_2

    if-ne v11, v4, :cond_1

    sget-object v11, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v4, v11, v9}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x4

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    sget-object v11, LZi/W0;->a:LZi/W0;

    invoke-interface {v0, v1, v5, v11, v8}, LYi/c;->h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    or-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_3
    aget-object v11, v2, v6

    invoke-interface {v0, v1, v6, v11, v7}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    or-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    move v10, v6

    goto :goto_0

    :cond_5
    move v12, v3

    move-object v13, v7

    move-object v14, v8

    move-object v15, v9

    :goto_1
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lnb/d;

    const/16 v16, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, Lnb/d;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V

    return-object v0
.end method

.method public final h(LYi/f;Lnb/d;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnb/d$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lnb/d;->b(Lnb/d;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
