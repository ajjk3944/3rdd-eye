.class public final Lpg/h;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/h$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lgg/y;


# direct methods
.method public constructor <init>(Lgg/f;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/h;->a:Lgg/f;

    iput-object p2, p0, Lpg/h;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 3

    iget-object v0, p0, Lpg/h;->a:Lgg/f;

    new-instance v1, Lpg/h$a;

    iget-object v2, p0, Lpg/h;->b:Lgg/y;

    invoke-direct {v1, p1, v2}, Lpg/h$a;-><init>(Lgg/d;Lgg/y;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
