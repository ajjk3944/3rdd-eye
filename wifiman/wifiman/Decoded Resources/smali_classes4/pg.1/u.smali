.class public final Lpg/u;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/u$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lkg/p;


# direct methods
.method public constructor <init>(Lgg/f;Lkg/p;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/u;->a:Lgg/f;

    iput-object p2, p0, Lpg/u;->b:Lkg/p;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 3

    iget-object v0, p0, Lpg/u;->a:Lgg/f;

    new-instance v1, Lpg/u$a;

    iget-object v2, p0, Lpg/u;->b:Lkg/p;

    invoke-direct {v1, p1, v2}, Lpg/u$a;-><init>(Lgg/d;Lkg/p;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
