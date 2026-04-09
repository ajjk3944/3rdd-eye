.class public final synthetic LI9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/l;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLmh/l;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI9/c;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LI9/c;->b:Z

    iput-object p3, p0, LI9/c;->c:Lmh/l;

    iput-boolean p4, p0, LI9/c;->d:Z

    iput p5, p0, LI9/c;->e:I

    iput p6, p0, LI9/c;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LI9/c;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LI9/c;->b:Z

    iget-object v2, p0, LI9/c;->c:Lmh/l;

    iget-boolean v3, p0, LI9/c;->d:Z

    iget v4, p0, LI9/c;->e:I

    iget v5, p0, LI9/c;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LI9/d;->b(Landroidx/compose/ui/e;ZLmh/l;ZIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
