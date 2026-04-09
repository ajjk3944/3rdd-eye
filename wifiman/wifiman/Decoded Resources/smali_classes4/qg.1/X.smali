.class public final Lqg/X;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/X$a;
    }
.end annotation


# instance fields
.field final c:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/X;->c:Lkg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/X$a;

    iget-object v2, p0, Lqg/X;->c:Lkg/f;

    invoke-direct {v1, p1, v2}, Lqg/X$a;-><init>(LDj/b;Lkg/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
