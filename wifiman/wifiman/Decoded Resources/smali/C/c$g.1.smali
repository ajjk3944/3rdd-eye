.class final LC/c$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/c;->c(LC/C;Lmh/r;Lmh/l;Lmh/a;LT/l;I)Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:LC/C;


# direct methods
.method constructor <init>(LT/z1;LC/C;)V
    .locals 0

    iput-object p1, p0, LC/c$g;->a:LT/z1;

    iput-object p2, p0, LC/c$g;->b:LC/C;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC/r;
    .locals 4

    iget-object v0, p0, LC/c$g;->a:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/p;

    new-instance v1, LB/K;

    iget-object v2, p0, LC/c$g;->b:LC/C;

    invoke-virtual {v2}, LC/C;->E()Lsh/i;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LB/K;-><init>(Lsh/i;LB/o;)V

    new-instance v2, LC/r;

    iget-object v3, p0, LC/c$g;->b:LC/C;

    invoke-direct {v2, v3, v0, v1}, LC/r;-><init>(LC/C;LB/o;Landroidx/compose/foundation/lazy/layout/c;)V

    return-object v2
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/c$g;->a()LC/r;

    move-result-object v0

    return-object v0
.end method
