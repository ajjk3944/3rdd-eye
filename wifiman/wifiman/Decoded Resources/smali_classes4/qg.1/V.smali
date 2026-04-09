.class public final Lqg/V;
.super Lqg/b;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/V$a;
    }
.end annotation


# instance fields
.field final c:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    .line 2
    iput-object p0, p0, Lqg/V;->c:Lkg/f;

    return-void
.end method

.method public constructor <init>(Lgg/i;Lkg/f;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    .line 4
    iput-object p2, p0, Lqg/V;->c:Lkg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/V$a;

    iget-object v2, p0, Lqg/V;->c:Lkg/f;

    invoke-direct {v1, p1, v2}, Lqg/V$a;-><init>(LDj/b;Lkg/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
