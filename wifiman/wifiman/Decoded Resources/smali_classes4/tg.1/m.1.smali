.class public final Ltg/m;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/m$a;
    }
.end annotation


# instance fields
.field final b:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/m;->b:Lkg/a;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 3

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/m$a;

    iget-object v2, p0, Ltg/m;->b:Lkg/a;

    invoke-direct {v1, p1, v2}, Ltg/m$a;-><init>(Lgg/x;Lkg/a;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
