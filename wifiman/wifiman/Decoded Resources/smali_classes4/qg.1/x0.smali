.class public final Lqg/x0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/x0$a;,
        Lqg/x0$b;,
        Lqg/x0$d;,
        Lqg/x0$c;
    }
.end annotation


# instance fields
.field final c:LDj/a;

.field final d:Lkg/n;

.field final e:LDj/a;


# direct methods
.method public constructor <init>(Lgg/i;LDj/a;Lkg/n;LDj/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/x0;->c:LDj/a;

    iput-object p3, p0, Lqg/x0;->d:Lkg/n;

    iput-object p4, p0, Lqg/x0;->e:LDj/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/x0;->e:LDj/a;

    if-nez v0, :cond_0

    new-instance v0, Lqg/x0$d;

    iget-object v1, p0, Lqg/x0;->d:Lkg/n;

    invoke-direct {v0, p1, v1}, Lqg/x0$d;-><init>(LDj/b;Lkg/n;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/x0;->c:LDj/a;

    invoke-virtual {v0, p1}, Lqg/x0$d;->c(LDj/a;)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lqg/x0$b;

    iget-object v1, p0, Lqg/x0;->d:Lkg/n;

    iget-object v2, p0, Lqg/x0;->e:LDj/a;

    invoke-direct {v0, p1, v1, v2}, Lqg/x0$b;-><init>(LDj/b;Lkg/n;LDj/a;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/x0;->c:LDj/a;

    invoke-virtual {v0, p1}, Lqg/x0$b;->s(LDj/a;)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
