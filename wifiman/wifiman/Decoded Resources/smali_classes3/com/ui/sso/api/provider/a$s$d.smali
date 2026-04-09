.class final Lcom/ui/sso/api/provider/a$s$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/sso/api/provider/a;

.field final synthetic b:LIi/y0;

.field final synthetic c:Landroid/database/ContentObserver;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/provider/a;LIi/y0;Landroid/database/ContentObserver;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$s$d;->a:Lcom/ui/sso/api/provider/a;

    iput-object p2, p0, Lcom/ui/sso/api/provider/a$s$d;->b:LIi/y0;

    iput-object p3, p0, Lcom/ui/sso/api/provider/a$s$d;->c:Landroid/database/ContentObserver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$s$d;->a:Lcom/ui/sso/api/provider/a;

    invoke-static {v0}, Lcom/ui/sso/api/provider/a;->n(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/a$b$c;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/sso/api/provider/a$b$c;->stop()V

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$s$d;->b:LIi/y0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/sso/api/provider/a$s$d;->a:Lcom/ui/sso/api/provider/a;

    invoke-static {v0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/sso/api/provider/a$s$d;->c:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/ui/sso/api/provider/a$s$d$a;->a:Lcom/ui/sso/api/provider/a$s$d$a;

    invoke-static {v1, v0}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    :goto_0
    sget-object v0, Lcom/ui/sso/api/provider/a$s$d$b;->a:Lcom/ui/sso/api/provider/a$s$d$b;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a$s$d;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
