.class public final Lrg/r;
.super Lrg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/r$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/r;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lrg/a;-><init>(Lgg/r;)V

    iput-object p2, p0, Lrg/r;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 3

    iget-object v0, p0, Lrg/a;->a:Lgg/r;

    new-instance v1, Lrg/r$a;

    iget-object v2, p0, Lrg/r;->b:Lkg/n;

    invoke-direct {v1, p1, v2}, Lrg/r$a;-><init>(Lgg/p;Lkg/n;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
