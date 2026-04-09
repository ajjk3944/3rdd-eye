.class public final synthetic LA9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lmh/p;

.field public final synthetic c:Lmh/q;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/p;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9/e;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LA9/e;->b:Lmh/p;

    iput-object p3, p0, LA9/e;->c:Lmh/q;

    iput p4, p0, LA9/e;->d:I

    iput p5, p0, LA9/e;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LA9/e;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LA9/e;->b:Lmh/p;

    iget-object v2, p0, LA9/e;->c:Lmh/q;

    iget v3, p0, LA9/e;->d:I

    iget v4, p0, LA9/e;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LA9/h;->b(Landroidx/compose/ui/e;Lmh/p;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
