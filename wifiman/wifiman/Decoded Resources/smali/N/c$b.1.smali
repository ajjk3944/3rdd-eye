.class final LN/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/c;->a(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:J

.field final synthetic e:Landroidx/compose/foundation/o;

.field final synthetic f:Landroidx/compose/ui/window/r;

.field final synthetic g:Lmh/q;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;II)V
    .locals 0

    iput-boolean p1, p0, LN/c$b;->a:Z

    iput-object p2, p0, LN/c$b;->b:Lmh/a;

    iput-object p3, p0, LN/c$b;->c:Landroidx/compose/ui/e;

    iput-wide p4, p0, LN/c$b;->d:J

    iput-object p6, p0, LN/c$b;->e:Landroidx/compose/foundation/o;

    iput-object p7, p0, LN/c$b;->f:Landroidx/compose/ui/window/r;

    iput-object p8, p0, LN/c$b;->g:Lmh/q;

    iput p9, p0, LN/c$b;->h:I

    iput p10, p0, LN/c$b;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    iget-boolean v0, p0, LN/c$b;->a:Z

    iget-object v1, p0, LN/c$b;->b:Lmh/a;

    iget-object v2, p0, LN/c$b;->c:Landroidx/compose/ui/e;

    iget-wide v3, p0, LN/c$b;->d:J

    iget-object v5, p0, LN/c$b;->e:Landroidx/compose/foundation/o;

    iget-object v6, p0, LN/c$b;->f:Landroidx/compose/ui/window/r;

    iget-object v7, p0, LN/c$b;->g:Lmh/q;

    iget p2, p0, LN/c$b;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v9

    iget v10, p0, LN/c$b;->i:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, LN/c;->a(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/c$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
