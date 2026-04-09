.class public final synthetic LE9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:LE9/e;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FLE9/e;FFIZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE9/c;->a:Landroidx/compose/ui/e;

    iput p2, p0, LE9/c;->b:F

    iput-object p3, p0, LE9/c;->c:LE9/e;

    iput p4, p0, LE9/c;->d:F

    iput p5, p0, LE9/c;->e:F

    iput p6, p0, LE9/c;->f:I

    iput-boolean p7, p0, LE9/c;->g:Z

    iput p8, p0, LE9/c;->h:I

    iput p9, p0, LE9/c;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LE9/c;->a:Landroidx/compose/ui/e;

    iget v1, p0, LE9/c;->b:F

    iget-object v2, p0, LE9/c;->c:LE9/e;

    iget v3, p0, LE9/c;->d:F

    iget v4, p0, LE9/c;->e:F

    iget v5, p0, LE9/c;->f:I

    iget-boolean v6, p0, LE9/c;->g:Z

    iget v7, p0, LE9/c;->h:I

    iget v8, p0, LE9/c;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, LE9/d;->b(Landroidx/compose/ui/e;FLE9/e;FFIZIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
