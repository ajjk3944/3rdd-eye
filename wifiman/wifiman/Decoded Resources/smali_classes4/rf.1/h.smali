.class public final synthetic Lrf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lrf/f;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lrf/f;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/h;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lrf/h;->b:Lrf/f;

    iput-wide p3, p0, Lrf/h;->c:J

    iput p5, p0, Lrf/h;->d:I

    iput p6, p0, Lrf/h;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lrf/h;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lrf/h;->b:Lrf/f;

    iget-wide v2, p0, Lrf/h;->c:J

    iget v4, p0, Lrf/h;->d:I

    iget v5, p0, Lrf/h;->e:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lrf/j;->c(Landroidx/compose/ui/e;Lrf/f;JIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
