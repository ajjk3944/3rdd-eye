.class final Landroidx/compose/foundation/gestures/f$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/p;

.field final synthetic b:Lw/A;


# direct methods
.method constructor <init>(Lw/p;Lw/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$b$a;->a:Lw/p;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/f$b$a;->b:Lw/A;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/gestures/a$b;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$b$a;->a:Lw/p;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$b$a;->b:Lw/A;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$b;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lw/A;->x(J)J

    move-result-wide v1

    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->b()I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Lw/p;->a(JI)J

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/f$b$a;->a(Landroidx/compose/foundation/gestures/a$b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
