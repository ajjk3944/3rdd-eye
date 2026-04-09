.class final Landroidx/compose/foundation/text/modifiers/b$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/modifiers/b;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/modifiers/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b;->O2()Landroidx/compose/foundation/text/modifiers/b$a;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v0}, Landroidx/compose/foundation/text/modifiers/b;->E2(Landroidx/compose/foundation/text/modifiers/b;)Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v1}, Landroidx/compose/foundation/text/modifiers/b;->O2()Landroidx/compose/foundation/text/modifiers/b$a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/b;->O2()Landroidx/compose/foundation/text/modifiers/b$a;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/b$a;->f(Z)V

    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$d;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {p1}, Landroidx/compose/foundation/text/modifiers/b;->H2(Landroidx/compose/foundation/text/modifiers/b;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b$d;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
