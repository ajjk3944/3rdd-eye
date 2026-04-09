.class public final Ltg/z;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/z$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;

.field final c:Z


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/z;->b:Lkg/n;

    iput-boolean p3, p0, Ltg/z;->c:Z

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 4

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/z$a;

    iget-object v2, p0, Ltg/z;->b:Lkg/n;

    iget-boolean v3, p0, Ltg/z;->c:Z

    invoke-direct {v1, p1, v2, v3}, Ltg/z$a;-><init>(Lgg/x;Lkg/n;Z)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
