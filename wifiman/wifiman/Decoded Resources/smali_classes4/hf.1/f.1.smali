.class public final synthetic Lhf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:Lff/a;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FLff/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/f;->a:Landroidx/compose/ui/e;

    iput p2, p0, Lhf/f;->b:F

    iput-object p3, p0, Lhf/f;->c:Lff/a;

    iput p4, p0, Lhf/f;->d:I

    iput p5, p0, Lhf/f;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lhf/f;->a:Landroidx/compose/ui/e;

    iget v1, p0, Lhf/f;->b:F

    iget-object v2, p0, Lhf/f;->c:Lff/a;

    iget v3, p0, Lhf/f;->d:I

    iget v4, p0, Lhf/f;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lhf/g;->b(Landroidx/compose/ui/e;FLff/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
