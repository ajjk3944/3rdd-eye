.class public final Lqg/o0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/o0$a;
    }
.end annotation


# instance fields
.field final c:LDj/a;


# direct methods
.method public constructor <init>(Lgg/i;LDj/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/o0;->c:LDj/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    new-instance v0, Lqg/o0$a;

    invoke-direct {v0, p1}, Lqg/o0$a;-><init>(LDj/b;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/o0;->c:LDj/a;

    iget-object v1, v0, Lqg/o0$a;->d:Lqg/o0$a$a;

    invoke-interface {p1, v1}, LDj/a;->b(LDj/b;)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
