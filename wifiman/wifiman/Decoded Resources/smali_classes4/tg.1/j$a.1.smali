.class final Ltg/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/j$a$a;,
        Ltg/j$a$b;,
        Ltg/j$a$c;
    }
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y$c;

.field final e:Z

.field f:Lhg/c;


# direct methods
.method constructor <init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/j$a;->a:Lgg/x;

    iput-wide p2, p0, Ltg/j$a;->b:J

    iput-object p4, p0, Ltg/j$a;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Ltg/j$a;->d:Lgg/y$c;

    iput-boolean p6, p0, Ltg/j$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Ltg/j$a;->d:Lgg/y$c;

    new-instance v1, Ltg/j$a$a;

    invoke-direct {v1, p0}, Ltg/j$a$a;-><init>(Ltg/j$a;)V

    iget-wide v2, p0, Ltg/j$a;->b:J

    iget-object v4, p0, Ltg/j$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/j$a;->f:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/j$a;->f:Lhg/c;

    iget-object p1, p0, Ltg/j$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/j$a;->f:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/j$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ltg/j$a;->d:Lgg/y$c;

    new-instance v1, Ltg/j$a$c;

    invoke-direct {v1, p0, p1}, Ltg/j$a$c;-><init>(Ltg/j$a;Ljava/lang/Object;)V

    iget-wide v2, p0, Ltg/j$a;->b:J

    iget-object p1, p0, Ltg/j$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/j$a;->d:Lgg/y$c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Ltg/j$a;->d:Lgg/y$c;

    new-instance v1, Ltg/j$a$b;

    invoke-direct {v1, p0, p1}, Ltg/j$a$b;-><init>(Ltg/j$a;Ljava/lang/Throwable;)V

    iget-boolean p1, p0, Ltg/j$a;->e:Z

    if-eqz p1, :cond_0

    iget-wide v2, p0, Ltg/j$a;->b:J

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    iget-object p1, p0, Ltg/j$a;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, p1}, Lgg/y$c;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    return-void
.end method
