.class public final Lqg/o;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/o$a;,
        Lqg/o$b;
    }
.end annotation


# instance fields
.field final c:Lkg/f;

.field final d:Lkg/f;

.field final e:Lkg/a;

.field final f:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/o;->c:Lkg/f;

    iput-object p3, p0, Lqg/o;->d:Lkg/f;

    iput-object p4, p0, Lqg/o;->e:Lkg/a;

    iput-object p5, p0, Lqg/o;->f:Lkg/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 8

    instance-of v0, p1, LDg/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v7, Lqg/o$a;

    move-object v2, p1

    check-cast v2, LDg/a;

    iget-object v3, p0, Lqg/o;->c:Lkg/f;

    iget-object v4, p0, Lqg/o;->d:Lkg/f;

    iget-object v5, p0, Lqg/o;->e:Lkg/a;

    iget-object v6, p0, Lqg/o;->f:Lkg/a;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lqg/o$a;-><init>(LDg/a;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V

    invoke-virtual {v0, v7}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v7, Lqg/o$b;

    iget-object v3, p0, Lqg/o;->c:Lkg/f;

    iget-object v4, p0, Lqg/o;->d:Lkg/f;

    iget-object v5, p0, Lqg/o;->e:Lkg/a;

    iget-object v6, p0, Lqg/o;->f:Lkg/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lqg/o$b;-><init>(LDj/b;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V

    invoke-virtual {v0, v7}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
