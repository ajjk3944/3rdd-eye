.class public final Lqg/O;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/O$a;,
        Lqg/O$b;
    }
.end annotation


# instance fields
.field final c:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/O;->c:Lkg/n;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/O$a;

    check-cast p1, LDg/a;

    iget-object v2, p0, Lqg/O;->c:Lkg/n;

    invoke-direct {v1, p1, v2}, Lqg/O$a;-><init>(LDg/a;Lkg/n;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/O$b;

    iget-object v2, p0, Lqg/O;->c:Lkg/n;

    invoke-direct {v1, p1, v2}, Lqg/O$b;-><init>(LDj/b;Lkg/n;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
