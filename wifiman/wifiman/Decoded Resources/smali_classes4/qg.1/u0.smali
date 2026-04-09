.class public final Lqg/u0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/u0$a;
    }
.end annotation


# instance fields
.field final c:Lkg/p;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/u0;->c:Lkg/p;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/u0$a;

    iget-object v2, p0, Lqg/u0;->c:Lkg/p;

    invoke-direct {v1, p1, v2}, Lqg/u0$a;-><init>(LDj/b;Lkg/p;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
