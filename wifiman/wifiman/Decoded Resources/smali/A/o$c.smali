.class final LA/o$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/o;->a(LA/B;Lmh/l;LT/l;I)Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:LA/B;

.field final synthetic c:LA/d;


# direct methods
.method constructor <init>(LT/z1;LA/B;LA/d;)V
    .locals 0

    iput-object p1, p0, LA/o$c;->a:LT/z1;

    iput-object p2, p0, LA/o$c;->b:LA/B;

    iput-object p3, p0, LA/o$c;->c:LA/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LA/n;
    .locals 5

    iget-object v0, p0, LA/o$c;->a:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/k;

    new-instance v1, LB/K;

    iget-object v2, p0, LA/o$c;->b:LA/B;

    invoke-virtual {v2}, LA/B;->y()Lsh/i;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LB/K;-><init>(Lsh/i;LB/o;)V

    new-instance v2, LA/n;

    iget-object v3, p0, LA/o$c;->b:LA/B;

    iget-object v4, p0, LA/o$c;->c:LA/d;

    invoke-direct {v2, v3, v0, v4, v1}, LA/n;-><init>(LA/B;LA/k;LA/d;Landroidx/compose/foundation/lazy/layout/c;)V

    return-object v2
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LA/o$c;->a()LA/n;

    move-result-object v0

    return-object v0
.end method
