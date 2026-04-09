.class public final Lqg/Y;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/Y$a;
    }
.end annotation


# instance fields
.field final c:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/Y;->c:Lkg/n;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    new-instance v0, Lqg/Y$a;

    iget-object v1, p0, Lqg/Y;->c:Lkg/n;

    invoke-direct {v0, p1, v1}, Lqg/Y$a;-><init>(LDj/b;Lkg/n;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
