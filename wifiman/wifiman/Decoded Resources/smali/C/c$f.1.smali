.class final LC/c$f;
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

.field final synthetic b:LT/z1;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(LT/z1;LT/z1;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LC/c$f;->a:LT/z1;

    iput-object p2, p0, LC/c$f;->b:LT/z1;

    iput-object p3, p0, LC/c$f;->c:Lmh/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LC/p;
    .locals 4

    new-instance v0, LC/p;

    iget-object v1, p0, LC/c$f;->a:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmh/r;

    iget-object v2, p0, LC/c$f;->b:LT/z1;

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmh/l;

    iget-object v3, p0, LC/c$f;->c:Lmh/a;

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, LC/p;-><init>(Lmh/r;Lmh/l;I)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/c$f;->a()LC/p;

    move-result-object v0

    return-object v0
.end method
