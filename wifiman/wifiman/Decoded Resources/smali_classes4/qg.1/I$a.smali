.class final Lqg/I$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/l;
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lgg/d;

.field b:LDj/c;


# direct methods
.method constructor <init>(Lgg/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/I$a;->a:Lgg/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/I$a;->b:LDj/c;

    iget-object v0, p0, Lqg/I$a;->a:Lgg/d;

    invoke-interface {v0}, Lgg/d;->a()V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lqg/I$a;->b:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/I$a;->b:LDj/c;

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public isDisposed()Z
    .locals 2

    iget-object v0, p0, Lqg/I$a;->b:LDj/c;

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

    iget-object v0, p0, Lqg/I$a;->b:LDj/c;

    invoke-static {v0, p1}, Lyg/g;->validate(LDj/c;LDj/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqg/I$a;->b:LDj/c;

    iget-object v0, p0, Lqg/I$a;->a:Lgg/d;

    invoke-interface {v0, p0}, Lgg/d;->c(Lhg/c;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    :cond_0
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lyg/g;->CANCELLED:Lyg/g;

    iput-object v0, p0, Lqg/I$a;->b:LDj/c;

    iget-object v0, p0, Lqg/I$a;->a:Lgg/d;

    invoke-interface {v0, p1}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
