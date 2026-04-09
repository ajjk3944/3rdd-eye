.class public final Ltg/j0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/j0$a;
    }
.end annotation


# instance fields
.field final b:Lkg/p;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/p;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/j0;->b:Lkg/p;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 3

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/j0$a;

    iget-object v2, p0, Ltg/j0;->b:Lkg/p;

    invoke-direct {v1, p1, v2}, Ltg/j0$a;-><init>(Lgg/x;Lkg/p;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
