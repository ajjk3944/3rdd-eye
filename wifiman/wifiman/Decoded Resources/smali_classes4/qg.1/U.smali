.class public final Lqg/U;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/U$a;
    }
.end annotation


# instance fields
.field final c:I

.field final d:Z

.field final e:Z

.field final f:Lkg/a;

.field final g:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/i;IZZLkg/a;Lkg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput p2, p0, Lqg/U;->c:I

    iput-boolean p3, p0, Lqg/U;->d:Z

    iput-boolean p4, p0, Lqg/U;->e:Z

    iput-object p5, p0, Lqg/U;->f:Lkg/a;

    iput-object p6, p0, Lqg/U;->g:Lkg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 9

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v8, Lqg/U$a;

    iget v3, p0, Lqg/U;->c:I

    iget-boolean v4, p0, Lqg/U;->d:Z

    iget-boolean v5, p0, Lqg/U;->e:Z

    iget-object v6, p0, Lqg/U;->f:Lkg/a;

    iget-object v7, p0, Lqg/U;->g:Lkg/f;

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lqg/U$a;-><init>(LDj/b;IZZLkg/a;Lkg/f;)V

    invoke-virtual {v0, v8}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
