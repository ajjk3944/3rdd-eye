.class final Ltg/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field final b:J

.field final c:Ljava/lang/Object;

.field final d:Z

.field e:Lhg/c;

.field f:J

.field g:Z


# direct methods
.method constructor <init>(Lgg/x;JLjava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/p$a;->a:Lgg/x;

    iput-wide p2, p0, Ltg/p$a;->b:J

    iput-object p4, p0, Ltg/p$a;->c:Ljava/lang/Object;

    iput-boolean p5, p0, Ltg/p$a;->d:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Ltg/p$a;->g:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p$a;->g:Z

    iget-object v0, p0, Ltg/p$a;->c:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-boolean v1, p0, Ltg/p$a;->d:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Ltg/p$a;->a:Lgg/x;

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    invoke-interface {v0, v1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Ltg/p$a;->a:Lgg/x;

    invoke-interface {v1, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Ltg/p$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    :cond_2
    :goto_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Ltg/p$a;->e:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Ltg/p$a;->e:Lhg/c;

    iget-object p1, p0, Ltg/p$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/p$a;->e:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Ltg/p$a;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Ltg/p$a;->f:J

    iget-wide v2, p0, Ltg/p$a;->b:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p$a;->g:Z

    iget-object v0, p0, Ltg/p$a;->e:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/p$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Ltg/p$a;->a:Lgg/x;

    invoke-interface {p1}, Lgg/x;->a()V

    return-void

    :cond_1
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ltg/p$a;->f:J

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/p$a;->e:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/p$a;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p$a;->g:Z

    iget-object v0, p0, Ltg/p$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
