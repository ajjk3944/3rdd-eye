.class public final Lqg/P;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/P$a;
    }
.end annotation


# instance fields
.field final c:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/i;Lgg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/P;->c:Lgg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 1

    new-instance v0, Lqg/P$a;

    invoke-direct {v0, p1}, Lqg/P$a;-><init>(LDj/b;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    iget-object p1, p0, Lqg/P;->c:Lgg/f;

    iget-object v0, v0, Lqg/P$a;->c:Lqg/P$a$a;

    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
