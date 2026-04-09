.class public final Lqg/r0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/r0$a;,
        Lqg/r0$b;
    }
.end annotation


# instance fields
.field final c:Lkg/n;

.field final d:I

.field final e:Z


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;IZ)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/r0;->c:Lkg/n;

    iput p3, p0, Lqg/r0;->d:I

    iput-boolean p4, p0, Lqg/r0;->e:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    iget-object v1, p0, Lqg/r0;->c:Lkg/n;

    invoke-static {v0, p1, v1}, Lqg/i0;->b(LDj/a;LDj/b;Lkg/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/r0$b;

    iget-object v2, p0, Lqg/r0;->c:Lkg/n;

    iget v3, p0, Lqg/r0;->d:I

    iget-boolean v4, p0, Lqg/r0;->e:Z

    invoke-direct {v1, p1, v2, v3, v4}, Lqg/r0$b;-><init>(LDj/b;Lkg/n;IZ)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
