.class public final Lrg/n;
.super Lrg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/n$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lgg/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lrg/a;-><init>(Lgg/r;)V

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 2

    iget-object v0, p0, Lrg/a;->a:Lgg/r;

    new-instance v1, Lrg/n$a;

    invoke-direct {v1, p1}, Lrg/n$a;-><init>(Lgg/p;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
