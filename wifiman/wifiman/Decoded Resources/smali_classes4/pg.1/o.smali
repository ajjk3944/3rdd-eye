.class public final Lpg/o;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/o$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/o;->a:Lgg/D;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    iget-object v0, p0, Lpg/o;->a:Lgg/D;

    new-instance v1, Lpg/o$a;

    invoke-direct {v1, p1}, Lpg/o$a;-><init>(Lgg/d;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
