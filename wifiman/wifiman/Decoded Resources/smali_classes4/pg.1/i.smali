.class public final Lpg/i;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/i$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/f;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/i;->a:Lgg/f;

    iput-object p2, p0, Lpg/i;->b:Lkg/a;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 3

    iget-object v0, p0, Lpg/i;->a:Lgg/f;

    new-instance v1, Lpg/i$a;

    iget-object v2, p0, Lpg/i;->b:Lkg/a;

    invoke-direct {v1, p1, v2}, Lpg/i$a;-><init>(Lgg/d;Lkg/a;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
