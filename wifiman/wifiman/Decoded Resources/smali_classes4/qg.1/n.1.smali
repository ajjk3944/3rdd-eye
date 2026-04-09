.class public final Lqg/n;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/n$a;,
        Lqg/n$b;
    }
.end annotation


# instance fields
.field final c:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/n;->c:Lkg/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/n$a;

    check-cast p1, LDg/a;

    iget-object v2, p0, Lqg/n;->c:Lkg/a;

    invoke-direct {v1, p1, v2}, Lqg/n$a;-><init>(LDg/a;Lkg/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/n$b;

    iget-object v2, p0, Lqg/n;->c:Lkg/a;

    invoke-direct {v1, p1, v2}, Lqg/n$b;-><init>(LDj/b;Lkg/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
