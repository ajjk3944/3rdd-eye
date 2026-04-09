.class public final synthetic LEb/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:LEb/d$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/d$a;

    invoke-direct {v0}, LEb/d$a;-><init>()V

    sput-object v0, LEb/d$a;->a:LEb/d$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.sso.models.CredentialRequestOptions"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "challenge"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "rpId"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "timeout"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "userVerification"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "allowCredentials"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, LEb/d$a;->descriptor:LXi/f;

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

    sget-object v0, LEb/d$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LEb/d$a;->g(LYi/e;)LEb/d;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 6

    invoke-static {}, LEb/d;->a()[LVi/b;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v0, v0, v1

    const/4 v2, 0x5

    new-array v2, v2, [LVi/b;

    sget-object v3, LZi/W0;->a:LZi/W0;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v4, LZi/h0;->a:LZi/h0;

    const/4 v5, 0x2

    aput-object v4, v2, v5

    const/4 v4, 0x3

    aput-object v3, v2, v4

    aput-object v0, v2, v1

    return-object v2
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LEb/d;

    invoke-virtual {p0, p1, p2}, LEb/d$a;->h(LYi/f;LEb/d;)V

    return-void
.end method

.method public final g(LYi/e;)LEb/d;
    .locals 25

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LEb/d$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-static {}, LEb/d;->a()[LVi/b;

    move-result-object v2

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x4

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v7}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v5}, LYi/c;->q(LXi/f;I)J

    move-result-wide v10

    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v4

    aget-object v2, v2, v6

    invoke-interface {v0, v1, v6, v2, v9}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v5, 0x1f

    move-object/from16 v23, v2

    move-object/from16 v18, v3

    move-object/from16 v22, v4

    move/from16 v17, v5

    move-object/from16 v19, v7

    move-wide/from16 v20, v10

    goto/16 :goto_2

    :cond_0
    const-wide/16 v10, 0x0

    move v15, v7

    move v3, v8

    move-object v12, v9

    move-wide v13, v10

    move-object v10, v12

    move-object v11, v10

    :goto_0
    if-eqz v15, :cond_7

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v8

    const/4 v6, -0x1

    if-eq v8, v6, :cond_6

    if-eqz v8, :cond_5

    if-eq v8, v7, :cond_4

    const/4 v6, 0x4

    if-eq v8, v5, :cond_3

    if-eq v8, v4, :cond_2

    if-ne v8, v6, :cond_1

    aget-object v8, v2, v6

    invoke-interface {v0, v1, v6, v8, v12}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Ljava/util/List;

    or-int/lit8 v3, v3, 0x10

    :goto_1
    const/4 v8, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v11

    or-int/lit8 v3, v3, 0x8

    goto :goto_1

    :cond_3
    invoke-interface {v0, v1, v5}, LYi/c;->q(LXi/f;I)J

    move-result-wide v13

    or-int/lit8 v3, v3, 0x4

    goto :goto_1

    :cond_4
    const/4 v6, 0x4

    invoke-interface {v0, v1, v7}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v10

    or-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_5
    const/4 v6, 0x4

    const/4 v8, 0x0

    invoke-interface {v0, v1, v8}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    const/4 v8, 0x0

    move v15, v8

    const/4 v6, 0x4

    goto :goto_0

    :cond_7
    move/from16 v17, v3

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v22, v11

    move-object/from16 v23, v12

    move-wide/from16 v20, v13

    :goto_2
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, LEb/d;

    const/16 v24, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v24}, LEb/d;-><init>(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;LZi/R0;)V

    return-object v0
.end method

.method public final h(LYi/f;LEb/d;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LEb/d$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, LEb/d;->b(LEb/d;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
