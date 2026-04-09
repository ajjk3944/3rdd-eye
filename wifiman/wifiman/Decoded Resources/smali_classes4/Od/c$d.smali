.class public final LOd/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/c;-><init>(LZc/f;Lfd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lfd/b;


# direct methods
.method public constructor <init>(Lfd/b;)V
    .locals 0

    iput-object p1, p0, LOd/c$d;->a:Lfd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    new-instance v0, LMj/x$b;

    invoke-direct {v0}, LMj/x$b;-><init>()V

    const-string v1, "https://status.ui.com"

    invoke-virtual {v0, v1}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object v0

    iget-object v1, p0, LOd/c$d;->a:Lfd/b;

    invoke-interface {v1}, Lfd/b;->a()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->g(Lokhttp3/OkHttpClient;)LMj/x$b;

    move-result-object v0

    invoke-static {}, LNj/g;->e()LNj/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object v0

    invoke-static {}, LPj/a;->f()LPj/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object v0

    invoke-virtual {v0}, LMj/x$b;->e()LMj/x;

    move-result-object v0

    const-class v1, LPd/d;

    invoke-virtual {v0, v1}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPd/d;

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
