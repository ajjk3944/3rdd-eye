.class public final LE8/f$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f$d;->a(Ljava/util/List;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lgf/a;


# direct methods
.method public constructor <init>(Ljava/util/List;Lgf/a;)V
    .locals 0

    iput-object p1, p0, LE8/f$d$a;->a:Ljava/util/List;

    iput-object p2, p0, LE8/f$d$a;->b:Lgf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, LE8/f$d$a;->a:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v0, p0, LE8/f$d$a;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LE8/f$a;

    invoke-virtual {v3}, LE8/f$a;->d()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LE8/f$d$a;->b:Lgf/a;

    invoke-virtual {v4}, Lgf/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LE8/f$a;

    if-eqz v1, :cond_2

    new-instance v2, Lqd/a$a;

    invoke-virtual {v1}, LE8/f$a;->a()Lrd/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lrd/b$a;->b()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v1}, LE8/f$a;->a()Lrd/b$a;

    move-result-object v3

    invoke-virtual {v3}, Lrd/b$a;->e()I

    move-result v3

    invoke-virtual {v1}, LE8/f$a;->a()Lrd/b$a;

    move-result-object v4

    invoke-virtual {v4}, Lrd/b$a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, LE8/f$a;->a()Lrd/b$a;

    move-result-object v1

    invoke-virtual {v1}, Lrd/b$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v3, v4, v1}, Lqd/a$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-interface {p1, v2}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
