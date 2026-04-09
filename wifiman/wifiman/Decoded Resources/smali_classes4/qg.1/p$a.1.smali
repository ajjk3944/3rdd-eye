.class final Lqg/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lkg/f;

.field final c:Lkg/o;

.field final d:Lkg/a;

.field e:LDj/c;


# direct methods
.method constructor <init>(LDj/b;Lkg/f;Lkg/o;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/p$a;->a:LDj/b;

    iput-object p2, p0, Lqg/p$a;->b:Lkg/f;

    iput-object p4, p0, Lqg/p$a;->d:Lkg/a;

    iput-object p3, p0, Lqg/p$a;->c:Lkg/o;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqg/p$a;->e:LDj/c;

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lqg/p$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 2

    iget-object v0, p0, Lqg/p$a;->e:LDj/c;

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, Lqg/p$a;->e:LDj/c;

    :try_start_0
    iget-object v1, p0, Lqg/p$a;->d:Lkg/a;

    invoke-interface {v1}, Lkg/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    invoke-interface {v0}, LDj/c;->cancel()V

    :cond_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lqg/p$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lqg/p$a;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqg/p$a;->e:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/p$a;->e:LDj/c;

    iget-object p1, p0, Lqg/p$a;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, LDj/c;->cancel()V

    sget-object p1, Lyg/g;->CANCELLED:Lyg/g;

    iput-object p1, p0, Lqg/p$a;->e:LDj/c;

    iget-object p1, p0, Lqg/p$a;->a:LDj/b;

    invoke-static {v0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqg/p$a;->e:LDj/c;

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lqg/p$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public request(J)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lqg/p$a;->c:Lkg/o;

    invoke-interface {v0, p1, p2}, Lkg/o;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lqg/p$a;->e:LDj/c;

    invoke-interface {v0, p1, p2}, LDj/c;->request(J)V

    return-void
.end method
