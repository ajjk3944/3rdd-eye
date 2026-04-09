.class public final Lrg/t;
.super Lrg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/t$a;
    }
.end annotation


# instance fields
.field final b:Lgg/r;


# direct methods
.method public constructor <init>(Lgg/r;Lgg/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lrg/a;-><init>(Lgg/r;)V

    iput-object p2, p0, Lrg/t;->b:Lgg/r;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 3

    iget-object v0, p0, Lrg/a;->a:Lgg/r;

    new-instance v1, Lrg/t$a;

    iget-object v2, p0, Lrg/t;->b:Lgg/r;

    invoke-direct {v1, p1, v2}, Lrg/t$a;-><init>(Lgg/p;Lgg/r;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
