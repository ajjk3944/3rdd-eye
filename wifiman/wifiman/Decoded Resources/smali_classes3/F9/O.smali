.class public final synthetic LF9/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Landroidx/compose/foundation/o;

.field public final synthetic c:Lz/N;

.field public final synthetic d:Lmh/q;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/O;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LF9/O;->b:Landroidx/compose/foundation/o;

    iput-object p3, p0, LF9/O;->c:Lz/N;

    iput-object p4, p0, LF9/O;->d:Lmh/q;

    iput p5, p0, LF9/O;->e:I

    iput p6, p0, LF9/O;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LF9/O;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LF9/O;->b:Landroidx/compose/foundation/o;

    iget-object v2, p0, LF9/O;->c:Lz/N;

    iget-object v3, p0, LF9/O;->d:Lmh/q;

    iget v4, p0, LF9/O;->e:I

    iget v5, p0, LF9/O;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LF9/P;->a(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
