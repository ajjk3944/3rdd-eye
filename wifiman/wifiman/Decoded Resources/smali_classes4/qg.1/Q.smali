.class public final Lqg/Q;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/Q$a;
    }
.end annotation


# instance fields
.field final c:Lgg/r;


# direct methods
.method public constructor <init>(Lgg/i;Lgg/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/Q;->c:Lgg/r;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 1

    new-instance v0, Lqg/Q$a;

    invoke-direct {v0, p1}, Lqg/Q$a;-><init>(LDj/b;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    iget-object p1, p0, Lqg/Q;->c:Lgg/r;

    iget-object v0, v0, Lqg/Q$a;->c:Lqg/Q$a$a;

    invoke-interface {p1, v0}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
