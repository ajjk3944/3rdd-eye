.class final Landroidx/compose/foundation/relocation/f$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f;->r1(LC0/r;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/relocation/f;

.field final synthetic b:LC0/r;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$c;->a:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$c;->b:LC0/r;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$c;->c:Lmh/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ll0/i;
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$c;->a:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$c;->b:LC0/r;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$c;->c:Lmh/a;

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/relocation/f;->D2(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$c;->a:Landroidx/compose/foundation/relocation/f;

    invoke-virtual {v1}, Landroidx/compose/foundation/relocation/f;->F2()LD/c;

    move-result-object v1

    invoke-interface {v1, v0}, LD/c;->w0(Ll0/i;)Ll0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/f$c;->a()Ll0/i;

    move-result-object v0

    return-object v0
.end method
