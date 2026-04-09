.class final LF/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/g;->a(LL0/d;Landroidx/compose/ui/e;LL0/U;Lmh/l;IZIILjava/util/Map;Lm0/y0;LT/l;II)V
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

    iput-object p1, p0, LF/g$b;->a:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/text/modifiers/b$a;)V
    .locals 2

    iget-object v0, p0, LF/g$b;->a:LT/q0;

    invoke-virtual {p1}, Landroidx/compose/foundation/text/modifiers/b$a;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/foundation/text/modifiers/b$a;->c()LL0/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/foundation/text/modifiers/b$a;->b()LL0/d;

    move-result-object p1

    :goto_0
    invoke-static {v0, p1}, LF/g;->f(LT/q0;LL0/d;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/text/modifiers/b$a;

    invoke-virtual {p0, p1}, LF/g$b;->a(Landroidx/compose/foundation/text/modifiers/b$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
