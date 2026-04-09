.class public final synthetic LD9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LD9/o;

.field public final synthetic b:Landroidx/compose/ui/window/r;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Lmh/p;

.field public final synthetic e:J

.field public final synthetic f:Lm0/i1;

.field public final synthetic g:F

.field public final synthetic h:Lmh/p;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/e;->a:LD9/o;

    iput-object p2, p0, LD9/e;->b:Landroidx/compose/ui/window/r;

    iput-object p3, p0, LD9/e;->c:Lmh/a;

    iput-object p4, p0, LD9/e;->d:Lmh/p;

    iput-wide p5, p0, LD9/e;->e:J

    iput-object p7, p0, LD9/e;->f:Lm0/i1;

    iput p8, p0, LD9/e;->g:F

    iput-object p9, p0, LD9/e;->h:Lmh/p;

    iput p10, p0, LD9/e;->i:I

    iput p11, p0, LD9/e;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, LD9/e;->a:LD9/o;

    iget-object v1, p0, LD9/e;->b:Landroidx/compose/ui/window/r;

    iget-object v2, p0, LD9/e;->c:Lmh/a;

    iget-object v3, p0, LD9/e;->d:Lmh/p;

    iget-wide v4, p0, LD9/e;->e:J

    iget-object v6, p0, LD9/e;->f:Lm0/i1;

    iget v7, p0, LD9/e;->g:F

    iget-object v8, p0, LD9/e;->h:Lmh/p;

    iget v9, p0, LD9/e;->i:I

    iget v10, p0, LD9/e;->j:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, LD9/k;->g(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
