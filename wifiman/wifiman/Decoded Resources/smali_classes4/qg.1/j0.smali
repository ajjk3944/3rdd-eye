.class public final Lqg/j0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/j0$a;
    }
.end annotation


# instance fields
.field final c:Lkg/b;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/j0;->c:Lkg/b;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/j0$a;

    iget-object v2, p0, Lqg/j0;->c:Lkg/b;

    invoke-direct {v1, p1, v2}, Lqg/j0$a;-><init>(LDj/b;Lkg/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
