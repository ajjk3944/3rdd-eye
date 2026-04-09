.class final LF/g$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/g;->e(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V
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

    iput-object p1, p0, LF/g$d;->a:LF/m0;

    iput-object p2, p0, LF/g$d;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/M;)V
    .locals 1

    iget-object v0, p0, LF/g$d;->a:LF/m0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LF/m0;->r(LL0/M;)V

    :goto_0
    iget-object v0, p0, LF/g$d;->b:Lmh/l;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/M;

    invoke-virtual {p0, p1}, LF/g$d;->a(LL0/M;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
