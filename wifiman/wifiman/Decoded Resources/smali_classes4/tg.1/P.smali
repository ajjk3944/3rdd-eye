.class public final Ltg/P;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/P$a;
    }
.end annotation


# instance fields
.field final b:Lgg/y;

.field final c:Z

.field final d:I


# direct methods
.method public constructor <init>(Lgg/v;Lgg/y;ZI)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/P;->b:Lgg/y;

    iput-boolean p3, p0, Ltg/P;->c:Z

    iput p4, p0, Ltg/P;->d:I

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 5

    iget-object v0, p0, Ltg/P;->b:Lgg/y;

    instance-of v1, v0, Lwg/p;

    if-eqz v1, :cond_0

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {v0, p1}, Lgg/v;->d(Lgg/x;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v0

    iget-object v1, p0, Ltg/a;->a:Lgg/v;

    new-instance v2, Ltg/P$a;

    iget-boolean v3, p0, Ltg/P;->c:Z

    iget v4, p0, Ltg/P;->d:I

    invoke-direct {v2, p1, v0, v3, v4}, Ltg/P$a;-><init>(Lgg/x;Lgg/y$c;ZI)V

    invoke-interface {v1, v2}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return-void
.end method
