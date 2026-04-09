.class public final synthetic LL9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:Lmh/q;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JJFFLmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/o;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, LL9/o;->b:J

    iput-wide p4, p0, LL9/o;->c:J

    iput p6, p0, LL9/o;->d:F

    iput p7, p0, LL9/o;->e:F

    iput-object p8, p0, LL9/o;->f:Lmh/q;

    iput p9, p0, LL9/o;->g:I

    iput p10, p0, LL9/o;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LL9/o;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, LL9/o;->b:J

    iget-wide v3, p0, LL9/o;->c:J

    iget v5, p0, LL9/o;->d:F

    iget v6, p0, LL9/o;->e:F

    iget-object v7, p0, LL9/o;->f:Lmh/q;

    iget v8, p0, LL9/o;->g:I

    iget v9, p0, LL9/o;->h:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LL9/q;->e(Landroidx/compose/ui/e;JJFFLmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
