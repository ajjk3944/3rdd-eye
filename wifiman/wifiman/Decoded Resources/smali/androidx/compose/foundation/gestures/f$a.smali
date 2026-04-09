.class final Landroidx/compose/foundation/gestures/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;-><init>(Lw/y;Ls/S;Lw/n;Lw/q;ZZLy/m;Lw/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/gestures/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$a;->a:Landroidx/compose/foundation/gestures/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/r;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$a;->a:Landroidx/compose/foundation/gestures/f;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/f;->e3(Landroidx/compose/foundation/gestures/f;)Lw/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw/f;->X2(LC0/r;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC0/r;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/f$a;->a(LC0/r;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
