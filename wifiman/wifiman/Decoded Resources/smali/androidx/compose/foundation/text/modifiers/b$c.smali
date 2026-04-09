.class final Landroidx/compose/foundation/text/modifiers/b$c;
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

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$c;->a:Landroidx/compose/foundation/text/modifiers/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/d;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/b$c;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {v0, p1}, Landroidx/compose/foundation/text/modifiers/b;->I2(Landroidx/compose/foundation/text/modifiers/b;LL0/d;)Z

    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/b$c;->a:Landroidx/compose/foundation/text/modifiers/b;

    invoke-static {p1}, Landroidx/compose/foundation/text/modifiers/b;->H2(Landroidx/compose/foundation/text/modifiers/b;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/d;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/b$c;->a(LL0/d;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
