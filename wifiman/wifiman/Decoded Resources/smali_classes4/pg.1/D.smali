.class public final Lpg/D;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/D$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lkg/q;

.field final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/f;Lkg/q;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lpg/D;->a:Lgg/f;

    iput-object p3, p0, Lpg/D;->c:Ljava/lang/Object;

    iput-object p2, p0, Lpg/D;->b:Lkg/q;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 2

    iget-object v0, p0, Lpg/D;->a:Lgg/f;

    new-instance v1, Lpg/D$a;

    invoke-direct {v1, p0, p1}, Lpg/D$a;-><init>(Lpg/D;Lgg/B;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
