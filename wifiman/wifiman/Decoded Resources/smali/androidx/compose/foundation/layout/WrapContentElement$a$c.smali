.class final Landroidx/compose/foundation/layout/WrapContentElement$a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/WrapContentElement$a;->c(Lf0/c$b;Z)Landroidx/compose/foundation/layout/WrapContentElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf0/c$b;


# direct methods
.method constructor <init>(Lf0/c$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/WrapContentElement$a$c;->a:Lf0/c$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JLY0/t;)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/WrapContentElement$a$c;->a:Lf0/c$b;

    invoke-static {p1, p2}, LY0/r;->g(J)I

    move-result p1

    const/4 p2, 0x0

    invoke-interface {v0, p2, p1, p3}, Lf0/c$b;->a(IILY0/t;)I

    move-result p1

    invoke-static {p1, p2}, LY0/o;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/r;

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    check-cast p2, LY0/t;

    invoke-virtual {p0, v0, v1, p2}, Landroidx/compose/foundation/layout/WrapContentElement$a$c;->a(JLY0/t;)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/n;->b(J)LY0/n;

    move-result-object p1

    return-object p1
.end method
