.class final Lqg/h0$a;
.super Lqg/f0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# direct methods
.method constructor <init>(LDj/b;LFg/b;LDj/c;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lqg/f0$c;-><init>(LDj/b;LFg/b;LDj/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqg/f0$c;->k:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    iget-object v0, p0, Lqg/f0$c;->i:LDj/b;

    invoke-interface {v0}, LDj/b;->a()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lqg/f0$c;->s(Ljava/lang/Object;)V

    return-void
.end method
