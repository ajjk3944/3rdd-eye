.class public final Ltg/H;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/H$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lgg/v;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/H$a;

    invoke-direct {v1, p1}, Ltg/H$a;-><init>(Lgg/x;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
