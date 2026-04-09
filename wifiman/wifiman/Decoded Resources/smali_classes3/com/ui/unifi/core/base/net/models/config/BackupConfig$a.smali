.class public final synthetic Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZi/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/unifi/core/base/net/models/config/BackupConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;

.field private static final descriptor:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;

    invoke-direct {v0}, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;-><init>()V

    sput-object v0, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->a:Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;

    new-instance v1, LZi/H0;

    const-string/jumbo v2, "com.ui.unifi.core.base.net.models.config.BackupConfig"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, LZi/H0;-><init>(Ljava/lang/String;LZi/M;I)V

    const-string/jumbo v0, "fileKey"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "filename"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "size"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    const-string/jumbo v0, "time"

    invoke-virtual {v1, v0, v2}, LZi/H0;->p(Ljava/lang/String;Z)V

    sput-object v1, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->descriptor:LXi/f;

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

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->descriptor:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/BackupConfig;

    move-result-object p1

    return-object p1
.end method

.method public final d()[LVi/b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LVi/b;

    sget-object v1, LZi/W0;->a:LZi/W0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LZi/W;->a:LZi/W;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LZi/h0;->a:LZi/h0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/unifi/core/base/net/models/config/BackupConfig;

    invoke-virtual {p0, p1, p2}, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/BackupConfig;)V

    return-void
.end method

.method public final g(LYi/e;)Lcom/ui/unifi/core/base/net/models/config/BackupConfig;
    .locals 21

    move-object/from16 v0, p1

    const-string/jumbo v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->descriptor:LXi/f;

    invoke-interface {v0, v1}, LYi/e;->c(LXi/f;)LYi/c;

    move-result-object v0

    invoke-interface {v0}, LYi/c;->B()Z

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v1, v4}, LYi/c;->i(LXi/f;I)I

    move-result v4

    invoke-interface {v0, v1, v3}, LYi/c;->q(LXi/f;I)J

    move-result-wide v6

    const/16 v3, 0xf

    move-object v15, v2

    move v14, v3

    move/from16 v17, v4

    move-object/from16 v16, v5

    move-wide/from16 v18, v6

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    const-wide/16 v7, 0x0

    move-object v9, v2

    move v12, v5

    move-wide v10, v7

    move v7, v6

    move v8, v7

    :goto_0
    if-eqz v12, :cond_6

    invoke-interface {v0, v1}, LYi/c;->k(LXi/f;)I

    move-result v13

    const/4 v14, -0x1

    if-eq v13, v14, :cond_5

    if-eqz v13, :cond_4

    if-eq v13, v5, :cond_3

    if-eq v13, v4, :cond_2

    if-ne v13, v3, :cond_1

    invoke-interface {v0, v1, v3}, LYi/c;->q(LXi/f;I)J

    move-result-wide v10

    or-int/lit8 v7, v7, 0x8

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v13}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, LYi/c;->i(LXi/f;I)I

    move-result v8

    or-int/lit8 v7, v7, 0x4

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v5}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v7, v7, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1, v6}, LYi/c;->w(LXi/f;I)Ljava/lang/String;

    move-result-object v2

    or-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    move v12, v6

    goto :goto_0

    :cond_6
    move-object v15, v2

    move v14, v7

    move/from16 v17, v8

    move-object/from16 v16, v9

    move-wide/from16 v18, v10

    :goto_1
    invoke-interface {v0, v1}, LYi/c;->b(LXi/f;)V

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/BackupConfig;

    const/16 v20, 0x0

    move-object v13, v0

    invoke-direct/range {v13 .. v20}, Lcom/ui/unifi/core/base/net/models/config/BackupConfig;-><init>(ILjava/lang/String;Ljava/lang/String;IJLZi/R0;)V

    return-object v0
.end method

.method public final h(LYi/f;Lcom/ui/unifi/core/base/net/models/config/BackupConfig;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/unifi/core/base/net/models/config/BackupConfig$a;->descriptor:LXi/f;

    invoke-interface {p1, v0}, LYi/f;->c(LXi/f;)LYi/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/ui/unifi/core/base/net/models/config/BackupConfig;->write$Self$unificore_release(Lcom/ui/unifi/core/base/net/models/config/BackupConfig;LYi/d;LXi/f;)V

    invoke-interface {p1, v0}, LYi/d;->b(LXi/f;)V

    return-void
.end method
