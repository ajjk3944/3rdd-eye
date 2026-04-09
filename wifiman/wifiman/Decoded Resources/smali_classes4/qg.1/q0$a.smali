.class final Lqg/q0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:LDj/a;

.field final c:Lyg/f;

.field d:Z


# direct methods
.method constructor <init>(LDj/b;LDj/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/q0$a;->a:LDj/b;

    iput-object p2, p0, Lqg/q0$a;->b:LDj/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqg/q0$a;->d:Z

    new-instance p1, Lyg/f;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lyg/f;-><init>(Z)V

    iput-object p1, p0, Lqg/q0$a;->c:Lyg/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lqg/q0$a;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqg/q0$a;->d:Z

    iget-object v0, p0, Lqg/q0$a;->b:LDj/a;

    invoke-interface {v0, p0}, LDj/a;->b(LDj/b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/q0$a;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    :goto_0
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lqg/q0$a;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqg/q0$a;->d:Z

    :cond_0
    iget-object v0, p0, Lqg/q0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 1

    iget-object v0, p0, Lqg/q0$a;->c:Lyg/f;

    invoke-virtual {v0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqg/q0$a;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
