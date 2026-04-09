.class public final synthetic Lz9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;JFFFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz9/a;->a:Landroidx/compose/ui/e;

    iput-wide p2, p0, Lz9/a;->b:J

    iput p4, p0, Lz9/a;->c:F

    iput p5, p0, Lz9/a;->d:F

    iput p6, p0, Lz9/a;->e:F

    iput p7, p0, Lz9/a;->f:I

    iput p8, p0, Lz9/a;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lz9/a;->a:Landroidx/compose/ui/e;

    iget-wide v1, p0, Lz9/a;->b:J

    iget v3, p0, Lz9/a;->c:F

    iget v4, p0, Lz9/a;->d:F

    iget v5, p0, Lz9/a;->e:F

    iget v6, p0, Lz9/a;->f:I

    iget v7, p0, Lz9/a;->g:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lz9/b;->a(Landroidx/compose/ui/e;JFFFIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
