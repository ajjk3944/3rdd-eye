.class public final Lpg/c;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/c$a;
    }
.end annotation


# instance fields
.field final a:[Lgg/f;


# direct methods
.method public constructor <init>([Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/c;->a:[Lgg/f;

    return-void
.end method


# virtual methods
.method public V(Lgg/d;)V
    .locals 2

    new-instance v0, Lpg/c$a;

    iget-object v1, p0, Lpg/c;->a:[Lgg/f;

    invoke-direct {v0, p1, v1}, Lpg/c$a;-><init>(Lgg/d;[Lgg/f;)V

    iget-object v1, v0, Lpg/c$a;->d:Llg/e;

    invoke-interface {p1, v1}, Lgg/d;->c(Lhg/c;)V

    invoke-virtual {v0}, Lpg/c$a;->d()V

    return-void
.end method
