.class public final synthetic LA9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:LA9/k;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Z

.field public final synthetic d:Lmh/p;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LA9/k;Landroidx/compose/ui/e;ZLmh/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9/j;->a:LA9/k;

    iput-object p2, p0, LA9/j;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LA9/j;->c:Z

    iput-object p4, p0, LA9/j;->d:Lmh/p;

    iput p5, p0, LA9/j;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LA9/j;->a:LA9/k;

    iget-object v1, p0, LA9/j;->b:Landroidx/compose/ui/e;

    iget-boolean v2, p0, LA9/j;->c:Z

    iget-object v3, p0, LA9/j;->d:Lmh/p;

    iget v4, p0, LA9/j;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LA9/k;->b(LA9/k;Landroidx/compose/ui/e;ZLmh/p;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
