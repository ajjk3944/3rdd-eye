.class final Lrg/w$a;
.super Lyg/c;
.source "SourceFile"

# interfaces
.implements Lgg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field c:Lhg/c;


# direct methods
.method constructor <init>(LDj/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lyg/c;-><init>(LDj/b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 1

    iget-object v0, p0, Lrg/w$a;->c:Lhg/c;

    invoke-static {v0, p1}, Llg/b;->validate(Lhg/c;Lhg/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lrg/w$a;->c:Lhg/c;

    iget-object p1, p0, Lyg/c;->a:LDj/b;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lyg/c;->cancel()V

    iget-object v0, p0, Lrg/w$a;->c:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lyg/c;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lyg/c;->d(Ljava/lang/Object;)V

    return-void
.end method
