.class public final synthetic LEb/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:LEb/m$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/m$a;

    invoke-direct {v0}, LEb/m$a;-><init>()V

    sput-object v0, LEb/m$a;->a:LEb/m$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.sso.models.PasswordStrengthResponse"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "is_acceptable_password"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "score"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "warning"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "suggestions"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, LEb/m$a;->descriptor:LXi/f;

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

    sget-object v0, LEb/m$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LEb/m$a;->g(LYi/e;)LEb/m;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 5

    invoke-static {}, LEb/m;->a()[LVi/b;

    move-result-object v0

    const/4 v1, 0x3

    aget-object v0, v0, v1

    const/4 v2, 0x4

    new-array v2, v2, [LVi/b;

    sget-object v3, LZi/i;->a:LZi/i;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, LZi/W;->a:LZi/W;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x2

    aput-object v3, v2, v4

    aput-object v0, v2, v1

    return-object v2
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LEb/m;

    invoke-virtual {p0, p1, p2}, LEb/m$a;->h(LYi/f;LEb/m;)V

    return-void
.end method

.method public final g(LYi/e;)LEb/m;
    .locals 20

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LEb/m$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, LEb/m;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v7}, LYi/c;->u(LXi/f;I)Z

    move-result v3

    invoke-interface {v0, v1, v6}, LYi/c;->i(LXi/f;I)I

    move-result v6

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    aget-object v2, v2, v5

    invoke-interface {v0, v1, v5, v2, v8}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v5, 0xf

    move-object/from16 v18, v2

    move v15, v3

    move-object/from16 v17, v4

    move v14, v5

    move/from16 v16, v6

    goto :goto_1

    :cond_0
    move v12, v6

    move v3, v7

    move v9, v3

    move-object v10, v8

    move-object v11, v10

    move v8, v9

    :goto_0
    if-eqz v12, :cond_6

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v13

    const/4 v14, -0x1

    if-eq v13, v14, :cond_5

    if-eqz v13, :cond_4

    if-eq v13, v6, :cond_3

    if-eq v13, v4, :cond_2

    if-ne v13, v5, :cond_1

    aget-object v13, v2, v5

    invoke-interface {v0, v1, v5, v13, v11}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    or-int/lit8 v8, v8, 0x8

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v8, v8, 0x4

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v6}, LYi/c;->i(LXi/f;I)I

    move-result v9

    or-int/lit8 v8, v8, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1, v7}, LYi/c;->u(LXi/f;I)Z

    move-result v3

    or-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_5
    move v12, v7

    goto :goto_0

    :cond_6
    move v15, v3

    move v14, v8

    move/from16 v16, v9

    move-object/from16 v17, v10

    move-object/from16 v18, v11

    :goto_1
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, LEb/m;

    const/16 v19, 0x0

    move-object v13, v0

    invoke-direct/range {v13 .. v19}, LEb/m;-><init>(IZILjava/lang/String;Ljava/util/List;LZi/R0;)V

    return-object v0
.end method

.method public final h(LYi/f;LEb/m;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LEb/m$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, LEb/m;->f(LEb/m;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
