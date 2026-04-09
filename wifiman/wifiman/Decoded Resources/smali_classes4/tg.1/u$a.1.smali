.class final Ltg/u$a;
.super Log/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final f:Lkg/p;


# direct methods
.method constructor <init>(Lgg/x;Lkg/p;)V
    .locals 0

    invoke-direct {p0, p1}, Log/a;-><init>(Lgg/x;)V

    iput-object p2, p0, Ltg/u$a;->f:Lkg/p;

    return-void
.end method


# virtual methods
.method public h(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Log/a;->e:I

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Ltg/u$a;->f:Lkg/p;

    invoke-interface {v0, p1}, Lkg/p;->test(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    iget-object v0, p0, Log/a;->a:Lgg/x;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Log/a;->e(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object p1, p0, Log/a;->a:Lgg/x;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 2

    :cond_0
    iget-object v0, p0, Log/a;->c:LDg/b;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ltg/u$a;->f:Lkg/p;

    invoke-interface {v1, v0}, Lkg/p;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return-object v0
.end method

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Log/a;->f(I)I

    move-result p1

    return p1
.end method
