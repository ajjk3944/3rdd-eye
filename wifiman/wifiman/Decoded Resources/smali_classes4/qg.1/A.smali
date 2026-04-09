.class public final Lqg/A;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/A$a;
    }
.end annotation


# instance fields
.field final c:Lkg/n;

.field final d:Z

.field final e:I


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;ZI)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/A;->c:Lkg/n;

    iput-boolean p3, p0, Lqg/A;->d:Z

    iput p4, p0, Lqg/A;->e:I

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/A$a;

    iget-object v2, p0, Lqg/A;->c:Lkg/n;

    iget-boolean v3, p0, Lqg/A;->d:Z

    iget v4, p0, Lqg/A;->e:I

    invoke-direct {v1, p1, v2, v3, v4}, Lqg/A$a;-><init>(LDj/b;Lkg/n;ZI)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
