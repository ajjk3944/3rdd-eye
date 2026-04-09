.class public final synthetic Lu9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Lu9/a;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lu9/j;->b:Ljava/lang/String;

    iput p3, p0, Lu9/j;->c:I

    iput-boolean p4, p0, Lu9/j;->d:Z

    iput-boolean p5, p0, Lu9/j;->e:Z

    iput-wide p6, p0, Lu9/j;->f:J

    iput p8, p0, Lu9/j;->g:I

    iput-boolean p9, p0, Lu9/j;->h:Z

    iput-object p10, p0, Lu9/j;->i:Lu9/a;

    iput p11, p0, Lu9/j;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lu9/j;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lu9/j;->b:Ljava/lang/String;

    iget v2, p0, Lu9/j;->c:I

    iget-boolean v3, p0, Lu9/j;->d:Z

    iget-boolean v4, p0, Lu9/j;->e:Z

    iget-wide v5, p0, Lu9/j;->f:J

    iget v7, p0, Lu9/j;->g:I

    iget-boolean v8, p0, Lu9/j;->h:Z

    iget-object v9, p0, Lu9/j;->i:Lu9/a;

    iget v10, p0, Lu9/j;->j:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lu9/k;->e(Landroidx/compose/ui/e;Ljava/lang/String;IZZJIZLu9/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
