.class final synthetic Landroidx/compose/foundation/relocation/f$b$a$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/relocation/f;

.field final synthetic b:LC0/r;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)V
    .locals 6

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->a:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->b:LC0/r;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->c:Lmh/a;

    const-string v4, "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lkotlin/jvm/internal/s$a;

    const-string v3, "localRect"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()Ll0/i;
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->a:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->b:LC0/r;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->c:Lmh/a;

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/relocation/f;->D2(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;)Ll0/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/f$b$a$a;->a()Ll0/i;

    move-result-object v0

    return-object v0
.end method
