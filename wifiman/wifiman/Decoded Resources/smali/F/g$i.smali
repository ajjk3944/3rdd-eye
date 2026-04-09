.class final LF/g$i;
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
.field final synthetic a:LT/q0;


# direct methods
.method constructor <init>(LT/q0;)V
    .locals 0

    iput-object p1, p0, LF/g$i;->a:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, LF/g$i;->a:LT/q0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LF/g$i;->a(Ljava/util/List;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
