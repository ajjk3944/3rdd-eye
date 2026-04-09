.class public final Lrg/u;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/u$a;
    }
.end annotation


# instance fields
.field final a:Lgg/r;

.field final b:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/r;Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lrg/u;->a:Lgg/r;

    iput-object p2, p0, Lrg/u;->b:Lgg/D;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lrg/u;->a:Lgg/r;

    new-instance v1, Lrg/u$a;

    iget-object v2, p0, Lrg/u;->b:Lgg/D;

    invoke-direct {v1, p1, v2}, Lrg/u$a;-><init>(Lgg/B;Lgg/D;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
