.class final LN/l$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/l;->b(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LK0/a;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:LN/j;

.field final synthetic e:I


# direct methods
.method constructor <init>(ZLK0/a;Landroidx/compose/ui/e;LN/j;I)V
    .locals 0

    iput-boolean p1, p0, LN/l$d;->a:Z

    iput-object p2, p0, LN/l$d;->b:LK0/a;

    iput-object p3, p0, LN/l$d;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, LN/l$d;->d:LN/j;

    iput p5, p0, LN/l$d;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-boolean v0, p0, LN/l$d;->a:Z

    iget-object v1, p0, LN/l$d;->b:LK0/a;

    iget-object v2, p0, LN/l$d;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, LN/l$d;->d:LN/j;

    iget p2, p0, LN/l$d;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, LN/l;->i(ZLK0/a;Landroidx/compose/ui/e;LN/j;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/l$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
