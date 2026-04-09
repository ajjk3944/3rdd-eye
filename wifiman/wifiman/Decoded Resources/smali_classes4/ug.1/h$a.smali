.class final Lug/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lug/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/B;

.field final b:Lkg/f;

.field c:Z


# direct methods
.method constructor <init>(Lgg/B;Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug/h$a;->a:Lgg/B;

    iput-object p2, p0, Lug/h$a;->b:Lkg/f;

    return-void
.end method


# virtual methods
.method public c(Lhg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lug/h$a;->b:Lkg/f;

    invoke-interface {v0, p1}, Lkg/f;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lug/h$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->c(Lhg/c;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lig/a;->b(Ljava/lang/Throwable;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lug/h$a;->c:Z

    invoke-interface {p1}, Lhg/c;->dispose()V

    iget-object p1, p0, Lug/h$a;->a:Lgg/B;

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/B;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lug/h$a;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lug/h$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lug/h$a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lug/h$a;->a:Lgg/B;

    invoke-interface {v0, p1}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
