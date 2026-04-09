.class public final Ltg/g0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/g0$a;,
        Ltg/g0$b;
    }
.end annotation


# instance fields
.field final b:Lkg/n;

.field final c:I

.field final d:Z


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;IZ)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/g0;->b:Lkg/n;

    iput p3, p0, Ltg/g0;->c:I

    iput-boolean p4, p0, Ltg/g0;->d:Z

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 5

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    iget-object v1, p0, Ltg/g0;->b:Lkg/n;

    invoke-static {v0, p1, v1}, Ltg/a0;->b(Lgg/v;Lgg/x;Lkg/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/g0$b;

    iget-object v2, p0, Ltg/g0;->b:Lkg/n;

    iget v3, p0, Ltg/g0;->c:I

    iget-boolean v4, p0, Ltg/g0;->d:Z

    invoke-direct {v1, p1, v2, v3, v4}, Ltg/g0$b;-><init>(Lgg/x;Lkg/n;IZ)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
