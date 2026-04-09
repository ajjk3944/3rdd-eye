.class public final Lpg/w;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/w$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/f;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/w;->a:Lgg/f;

    iput-object p2, p0, Lpg/w;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    new-instance v0, Lpg/w$a;

    iget-object v1, p0, Lpg/w;->b:Lkg/n;

    invoke-direct {v0, p1, v1}, Lpg/w$a;-><init>(Lgg/d;Lkg/n;)V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    iget-object p1, p0, Lpg/w;->a:Lgg/f;

    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
