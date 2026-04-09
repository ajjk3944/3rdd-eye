.class public final LP8/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/b$b;->a(Ljava/util/Set;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:LP8/b;

.field final synthetic c:LIf/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;LP8/b;LIf/c;)V
    .locals 0

    iput-object p1, p0, LP8/b$b$a;->a:Ljava/util/Set;

    iput-object p2, p0, LP8/b$b$a;->b:LP8/b;

    iput-object p3, p0, LP8/b$b$a;->c:LIf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, LP8/b$b$a;->a:Ljava/util/Set;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v0, p0, LP8/b$b$a;->a:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/wmw/d$a;

    iget-object v3, p0, LP8/b$b$a;->b:LP8/b;

    invoke-static {v3, v2}, LP8/b;->p0(LP8/b;Lcom/ui/wifiman/model/wmw/d$a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LP8/b$b$a;->c:LIf/c;

    invoke-virtual {v3}, LIf/c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/ui/wifiman/model/wmw/d$a;

    if-eqz v1, :cond_2

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
