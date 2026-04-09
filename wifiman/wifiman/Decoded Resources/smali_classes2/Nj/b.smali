.class final LNj/b;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNj/b$a;
    }
.end annotation


# instance fields
.field private final a:LMj/d;


# direct methods
.method constructor <init>(LMj/d;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, LNj/b;->a:LMj/d;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    iget-object v0, p0, LNj/b;->a:LMj/d;

    invoke-interface {v0}, LMj/d;->clone()LMj/d;

    move-result-object v0

    new-instance v1, LNj/b$a;

    invoke-direct {v1, v0, p1}, LNj/b$a;-><init>(LMj/d;Lgg/x;)V

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v1}, LNj/b$a;->isDisposed()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, LMj/d;->K0(LMj/f;)V

    :cond_0
    return-void
.end method
