.class final LF/g$j;
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

.field final synthetic b:LL0/d;


# direct methods
.method constructor <init>(LF/m0;LL0/d;)V
    .locals 0

    iput-object p1, p0, LF/g$j;->a:LF/m0;

    iput-object p2, p0, LF/g$j;->b:LL0/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LL0/d;
    .locals 1

    iget-object v0, p0, LF/g$j;->a:LF/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LF/m0;->i()LL0/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LF/g$j;->b:LL0/d;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/g$j;->a()LL0/d;

    move-result-object v0

    return-object v0
.end method
