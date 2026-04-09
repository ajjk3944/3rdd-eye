.class public final synthetic LZ9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/l;

.field public final synthetic d:LZ9/a;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLmh/l;LZ9/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ9/d;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LZ9/d;->b:Z

    iput-object p3, p0, LZ9/d;->c:Lmh/l;

    iput-object p4, p0, LZ9/d;->d:LZ9/a;

    iput p5, p0, LZ9/d;->e:I

    iput p6, p0, LZ9/d;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LZ9/d;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LZ9/d;->b:Z

    iget-object v2, p0, LZ9/d;->c:Lmh/l;

    iget-object v3, p0, LZ9/d;->d:LZ9/a;

    iget v4, p0, LZ9/d;->e:I

    iget v5, p0, LZ9/d;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LZ9/e;->b(Landroidx/compose/ui/e;ZLmh/l;LZ9/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
