.class public final Lqg/w;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/w$a;,
        Lqg/w$b;
    }
.end annotation


# instance fields
.field final c:Lkg/n;

.field final d:Z

.field final e:I

.field final f:I


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;ZII)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/w;->c:Lkg/n;

    iput-boolean p3, p0, Lqg/w;->d:Z

    iput p4, p0, Lqg/w;->e:I

    iput p5, p0, Lqg/w;->f:I

    return-void
.end method

.method public static h2(LDj/b;Lkg/n;ZII)Lgg/l;
    .locals 7

    new-instance v6, Lqg/w$b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lqg/w$b;-><init>(LDj/b;Lkg/n;ZII)V

    return-object v6
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    iget-object v1, p0, Lqg/w;->c:Lkg/n;

    invoke-static {v0, p1, v1}, Lqg/i0;->b(LDj/a;LDj/b;Lkg/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    iget-object v1, p0, Lqg/w;->c:Lkg/n;

    iget-boolean v2, p0, Lqg/w;->d:Z

    iget v3, p0, Lqg/w;->e:I

    iget v4, p0, Lqg/w;->f:I

    invoke-static {p1, v1, v2, v3, v4}, Lqg/w;->h2(LDj/b;Lkg/n;ZII)Lgg/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
