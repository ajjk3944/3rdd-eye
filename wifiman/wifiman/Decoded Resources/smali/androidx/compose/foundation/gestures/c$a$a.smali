.class final Landroidx/compose/foundation/gestures/c$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/k;

.field final synthetic b:Landroidx/compose/foundation/gestures/c;


# direct methods
.method constructor <init>(Lw/k;Landroidx/compose/foundation/gestures/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/c$a$a;->a:Lw/k;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/c$a$a;->b:Landroidx/compose/foundation/gestures/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/gestures/a$b;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c$a$a;->a:Lw/k;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$a$a;->b:Landroidx/compose/foundation/gestures/c;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$b;->a()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/gestures/c;->i3(Landroidx/compose/foundation/gestures/c;J)J

    move-result-wide v1

    iget-object p1, p0, Landroidx/compose/foundation/gestures/c$a$a;->b:Landroidx/compose/foundation/gestures/c;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/c;->g3(Landroidx/compose/foundation/gestures/c;)Lw/q;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lw/l;->d(JLw/q;)F

    move-result p1

    invoke-interface {v0, p1}, Lw/k;->a(F)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/c$a$a;->a(Landroidx/compose/foundation/gestures/a$b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
