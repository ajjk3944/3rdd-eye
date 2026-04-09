.class public final Lnd/h$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h;-><init>(Landroid/content/Context;LWb/j;LCd/f;LCc/n;LZc/c;Lad/i;Lje/u;LBc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnd/h;


# direct methods
.method public constructor <init>(Lnd/h;)V
    .locals 0

    iput-object p1, p0, Lnd/h$l;->a:Lnd/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lnd/h$l;->a:Lnd/h;

    invoke-static {v0}, Lnd/h;->j(Lnd/h;)LWb/j;

    move-result-object v0

    invoke-interface {v0}, LWb/j;->h()I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lnd/h$b;->getEntries()Lfh/a;

    move-result-object v0

    invoke-static {v0}, LZg/v;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, LZg/v;->v()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    check-cast v2, Lnd/h$b;

    iget-object v4, p0, Lnd/h$l;->a:Lnd/h;

    invoke-static {v4}, Lnd/h;->j(Lnd/h;)LWb/j;

    move-result-object v4

    iget-object v5, p0, Lnd/h$l;->a:Lnd/h;

    int-to-long v6, v1

    invoke-static {v5, v2, v6, v7}, Lnd/h;->n(Lnd/h;Lnd/h$b;J)LWb/g;

    move-result-object v1

    invoke-interface {v4, v1}, LWb/j;->e(LWb/g;)J

    move v1, v3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnd/h$l;->a:Lnd/h;

    invoke-static {v0}, Lnd/h;->j(Lnd/h;)LWb/j;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
