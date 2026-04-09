.class public final Lpg/a;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/a$a;,
        Lpg/a$b;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/f;Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/a;->a:Lgg/f;

    iput-object p2, p0, Lpg/a;->b:Lgg/f;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 3

    iget-object v0, p0, Lpg/a;->a:Lgg/f;

    new-instance v1, Lpg/a$b;

    iget-object v2, p0, Lpg/a;->b:Lgg/f;

    invoke-direct {v1, p1, v2}, Lpg/a$b;-><init>(Lgg/d;Lgg/f;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
