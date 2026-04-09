.class final Lqg/N$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/p;

.field b:LDj/c;

.field c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lgg/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/N$a;->a:Lgg/p;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/N$a;->b:LDj/c;

    iget-object v0, p0, Lqg/N$a;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lqg/N$a;->c:Ljava/lang/Object;

    iget-object v1, p0, Lqg/N$a;->a:Lgg/p;

    invoke-interface {v1, v0}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/N$a;->a:Lgg/p;

    invoke-interface {v0}, Lgg/p;->a()V

    :goto_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lqg/N$a;->b:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/N$a;->b:LDj/c;

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lqg/N$a;->c:Ljava/lang/Object;

    return-void
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lqg/N$a;->b:LDj/c;

    sget-object v1, Lyg/g;->CANCELLED:Lyg/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(LDj/c;)V
    .locals 2

    iget-object v0, p0, Lqg/N$a;->b:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/N$a;->b:LDj/c;

    iget-object v0, p0, Lqg/N$a;->a:Lgg/p;

    invoke-interface {v0, p0}, Lgg/p;->c(Lhg/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/N$a;->b:LDj/c;

    const/4 v0, 0x0

    iput-object v0, p0, Lqg/N$a;->c:Ljava/lang/Object;

    iget-object v0, p0, Lqg/N$a;->a:Lgg/p;

    invoke-interface {v0, p1}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
