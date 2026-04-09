.class public final LD8/v$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/v$d;->a(Ljd/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljd/a;

.field final synthetic b:LD8/v;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljd/a;LD8/v;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LD8/v$d$a;->a:Ljd/a;

    iput-object p2, p0, LD8/v$d$a;->b:LD8/v;

    iput-object p3, p0, LD8/v$d$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, LD8/v$d$a;->a:Ljd/a;

    invoke-virtual {v0}, Ljd/a;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, LZg/v;->v()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    check-cast v4, Ljd/a$b;

    iget-object v6, p0, LD8/v$d$a;->b:LD8/v;

    invoke-static {v6, v4, v2}, LD8/v;->j(LD8/v;Ljd/a$b;I)Ljava/lang/String;

    move-result-object v2

    iget-object v6, p0, LD8/v$d$a;->c:Ljava/lang/String;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v3, v4

    :cond_1
    move v2, v5

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method
