.class public final Lqg/v;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/v$a;,
        Lqg/v$b;
    }
.end annotation


# instance fields
.field final c:Lkg/p;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/v;->c:Lkg/p;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/v$a;

    check-cast p1, LDg/a;

    iget-object v2, p0, Lqg/v;->c:Lkg/p;

    invoke-direct {v1, p1, v2}, Lqg/v$a;-><init>(LDg/a;Lkg/p;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/v$b;

    iget-object v2, p0, Lqg/v;->c:Lkg/p;

    invoke-direct {v1, p1, v2}, Lqg/v$b;-><init>(LDj/b;Lkg/p;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
