.class final Ltg/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/x;

.field b:Z

.field c:Lhg/c;

.field d:J


# direct methods
.method constructor <init>(Lgg/x;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/h0$a;->a:Lgg/x;

    iput-wide p2, p0, Ltg/h0$a;->d:J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/h0$a;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/h0$a;->b:Z

    iget-object v0, p0, Ltg/h0$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/h0$a;->a:Lgg/x;

    invoke-interface {v0}, Lgg/x;->a()V

    :cond_0
    return-void
.end method

.method public c(Lhg/c;)V
    .locals 4

    iget-object v0, p0, Ltg/h0$a;->c:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Ltg/h0$a;->c:Lhg/c;

    iget-wide v0, p0, Ltg/h0$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/h0$a;->b:Z

    invoke-interface {p1}, Lhg/c;->dispose()V

    iget-object p1, p0, Ltg/h0$a;->a:Lgg/x;

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ltg/h0$a;->a:Lgg/x;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Ltg/h0$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Ltg/h0$a;->b:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Ltg/h0$a;->d:J

    const-wide/16 v2, 0x1

    sub-long v2, v0, v2

    iput-wide v2, p0, Ltg/h0$a;->d:J

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ltg/h0$a;->a:Lgg/x;

    invoke-interface {v1, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ltg/h0$a;->a()V

    :cond_1
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Ltg/h0$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/h0$a;->b:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/h0$a;->b:Z

    iget-object v0, p0, Ltg/h0$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltg/h0$a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
