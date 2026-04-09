.class public final Lc8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc8/c;-><init>(Lc8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc8/a;

.field final synthetic b:Lc8/c;


# direct methods
.method public constructor <init>(Lc8/a;Lc8/c;)V
    .locals 0

    iput-object p1, p0, Lc8/c$a;->a:Lc8/a;

    iput-object p2, p0, Lc8/c$a;->b:Lc8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    new-instance v0, LMj/x$b;

    invoke-direct {v0}, LMj/x$b;-><init>()V

    iget-object v1, p0, Lc8/c$a;->a:Lc8/a;

    invoke-virtual {v1}, Lc8/a;->getBaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object v0

    invoke-static {}, LNj/g;->e()LNj/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object v0

    iget-object v1, p0, Lc8/c$a;->b:Lc8/c;

    invoke-static {v1}, Lc8/c;->a(Lc8/c;)LY6/r;

    move-result-object v1

    invoke-static {v1}, LPj/a;->g(LY6/r;)LPj/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object v0

    invoke-virtual {v0}, LMj/x$b;->e()LMj/x;

    move-result-object v0

    const-class v1, Lc8/b;

    invoke-virtual {v0, v1}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc8/b;

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
