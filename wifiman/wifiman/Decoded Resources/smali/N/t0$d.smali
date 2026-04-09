.class final LN/t0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/t0;->b(Landroidx/compose/ui/e;JFJILT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:J

.field final synthetic c:F

.field final synthetic d:J

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;JFJIII)V
    .locals 0

    iput-object p1, p0, LN/t0$d;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LN/t0$d;->b:J

    iput p4, p0, LN/t0$d;->c:F

    iput-wide p5, p0, LN/t0$d;->d:J

    iput p7, p0, LN/t0$d;->e:I

    iput p8, p0, LN/t0$d;->f:I

    iput p9, p0, LN/t0$d;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, LN/t0$d;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LN/t0$d;->b:J

    iget v3, p0, LN/t0$d;->c:F

    iget-wide v4, p0, LN/t0$d;->d:J

    iget v6, p0, LN/t0$d;->e:I

    iget p2, p0, LN/t0$d;->f:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    iget v9, p0, LN/t0$d;->g:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LN/t0;->b(Landroidx/compose/ui/e;JFJILT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/t0$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
