.class public final Lqg/H;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/H$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lgg/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/H$a;

    invoke-direct {v1, p1}, Lqg/H$a;-><init>(LDj/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
