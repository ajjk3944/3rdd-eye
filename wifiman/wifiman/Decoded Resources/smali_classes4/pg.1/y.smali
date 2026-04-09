.class public final Lpg/y;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/y$a;
    }
.end annotation


# instance fields
.field final a:Lgg/b;

.field final b:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/b;Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/y;->a:Lgg/b;

    iput-object p2, p0, Lpg/y;->b:Lgg/f;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    new-instance v0, Lpg/y$a;

    invoke-direct {v0, p1}, Lpg/y$a;-><init>(Lgg/d;)V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    iget-object p1, p0, Lpg/y;->b:Lgg/f;

    iget-object v1, v0, Lpg/y$a;->b:Lpg/y$a$a;

    invoke-interface {p1, v1}, Lgg/f;->e(Lgg/d;)V

    iget-object p1, p0, Lpg/y;->a:Lgg/b;

    invoke-virtual {p1, v0}, Lgg/b;->e(Lgg/d;)V

    return-void
.end method
