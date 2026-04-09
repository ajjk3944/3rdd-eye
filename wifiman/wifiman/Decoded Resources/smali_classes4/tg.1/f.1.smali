.class public final Ltg/f;
.super Lgg/z;
.source "SourceFile"

# interfaces
.implements Lng/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/f$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Ltg/f;->a:Lgg/v;

    return-void
.end method


# virtual methods
.method public N(Lgg/B;)V
    .locals 2

    iget-object v0, p0, Ltg/f;->a:Lgg/v;

    new-instance v1, Ltg/f$a;

    invoke-direct {v1, p1}, Ltg/f$a;-><init>(Lgg/B;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method

.method public b()Lgg/s;
    .locals 2

    new-instance v0, Ltg/e;

    iget-object v1, p0, Ltg/f;->a:Lgg/v;

    invoke-direct {v0, v1}, Ltg/e;-><init>(Lgg/v;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method
