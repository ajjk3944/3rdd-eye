.class final LF/g$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


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


# direct methods
.method constructor <init>(LF/m0;)V
    .locals 0

    iput-object p1, p0, LF/g$e;->a:LF/m0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LF/g$e;->a:LF/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/m0;->l()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/g$e;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
