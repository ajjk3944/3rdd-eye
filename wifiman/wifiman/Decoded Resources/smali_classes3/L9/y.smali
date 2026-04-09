.class public final synthetic LL9/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ls9/b;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Lmh/a;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/y;->a:Ls9/b;

    iput-object p2, p0, LL9/y;->b:Landroidx/compose/ui/e;

    iput-wide p3, p0, LL9/y;->c:J

    iput-boolean p5, p0, LL9/y;->d:Z

    iput-object p6, p0, LL9/y;->e:Lmh/a;

    iput p7, p0, LL9/y;->f:I

    iput p8, p0, LL9/y;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LL9/y;->a:Ls9/b;

    iget-object v1, p0, LL9/y;->b:Landroidx/compose/ui/e;

    iget-wide v2, p0, LL9/y;->c:J

    iget-boolean v4, p0, LL9/y;->d:Z

    iget-object v5, p0, LL9/y;->e:Lmh/a;

    iget v6, p0, LL9/y;->f:I

    iget v7, p0, LL9/y;->g:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LL9/z;->a(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
