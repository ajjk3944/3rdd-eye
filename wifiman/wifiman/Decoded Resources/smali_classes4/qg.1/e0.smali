.class public final Lqg/e0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/e0$a;
    }
.end annotation


# instance fields
.field final c:Lkg/d;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/e0;->c:Lkg/d;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 4

    new-instance v0, Lyg/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyg/f;-><init>(Z)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    new-instance v1, Lqg/e0$a;

    iget-object v2, p0, Lqg/e0;->c:Lkg/d;

    iget-object v3, p0, Lqg/b;->b:Lgg/i;

    invoke-direct {v1, p1, v2, v0, v3}, Lqg/e0$a;-><init>(LDj/b;Lkg/d;Lyg/f;LDj/a;)V

    invoke-virtual {v1}, Lqg/e0$a;->c()V

    return-void
.end method
