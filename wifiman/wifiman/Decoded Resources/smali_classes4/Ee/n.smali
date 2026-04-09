.class public final synthetic LEe/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lmh/p;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZZLmh/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe/n;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LEe/n;->b:Z

    iput-boolean p3, p0, LEe/n;->c:Z

    iput-object p4, p0, LEe/n;->d:Lmh/p;

    iput p5, p0, LEe/n;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LEe/n;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LEe/n;->b:Z

    iget-boolean v2, p0, LEe/n;->c:Z

    iget-object v3, p0, LEe/n;->d:Lmh/p;

    iget v4, p0, LEe/n;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LEe/z;->d(Landroidx/compose/ui/e;ZZLmh/p;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
