.class public final Lqg/m;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/m$a;,
        Lqg/m$b;
    }
.end annotation


# instance fields
.field final c:Lkg/n;

.field final d:Lkg/c;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;Lkg/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/m;->c:Lkg/n;

    iput-object p3, p0, Lqg/m;->d:Lkg/c;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    check-cast p1, LDg/a;

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/m$a;

    iget-object v2, p0, Lqg/m;->c:Lkg/n;

    iget-object v3, p0, Lqg/m;->d:Lkg/c;

    invoke-direct {v1, p1, v2, v3}, Lqg/m$a;-><init>(LDg/a;Lkg/n;Lkg/c;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/m$b;

    iget-object v2, p0, Lqg/m;->c:Lkg/n;

    iget-object v3, p0, Lqg/m;->d:Lkg/c;

    invoke-direct {v1, p1, v2, v3}, Lqg/m$b;-><init>(LDj/b;Lkg/n;Lkg/c;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
