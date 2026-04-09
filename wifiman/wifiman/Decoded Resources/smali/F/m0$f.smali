.class final LF/m0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->c([Ljava/lang/Object;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LF/m0;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LF/m0$f;->a:LF/m0;

    iput-object p2, p0, LF/m0$f;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, LF/m0$f;->a:LF/m0;

    invoke-static {p1}, LF/m0;->e(LF/m0;)Landroidx/compose/runtime/snapshots/k;

    move-result-object p1

    iget-object v0, p0, LF/m0$f;->b:Lmh/l;

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LF/m0$f;->a:LF/m0;

    iget-object v0, p0, LF/m0$f;->b:Lmh/l;

    new-instance v1, LF/m0$f$a;

    invoke-direct {v1, p1, v0}, LF/m0$f$a;-><init>(LF/m0;Lmh/l;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, LF/m0$f;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
