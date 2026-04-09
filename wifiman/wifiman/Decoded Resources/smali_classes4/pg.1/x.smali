.class public final Lpg/x;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/x$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lgg/y;


# direct methods
.method public constructor <init>(Lgg/f;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/x;->a:Lgg/f;

    iput-object p2, p0, Lpg/x;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    new-instance v0, Lpg/x$a;

    iget-object v1, p0, Lpg/x;->a:Lgg/f;

    invoke-direct {v0, p1, v1}, Lpg/x$a;-><init>(Lgg/d;Lgg/f;)V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    iget-object p1, p0, Lpg/x;->b:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    iget-object v0, v0, Lpg/x$a;->b:Llg/e;

    invoke-virtual {v0, p1}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method
