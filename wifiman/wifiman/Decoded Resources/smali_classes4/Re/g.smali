.class public final synthetic LRe/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/d;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/d;Lmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRe/g;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LRe/g;->b:Ls9/d;

    iput-object p3, p0, LRe/g;->c:Lmh/a;

    iput p4, p0, LRe/g;->d:I

    iput p5, p0, LRe/g;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LRe/g;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LRe/g;->b:Ls9/d;

    iget-object v2, p0, LRe/g;->c:Lmh/a;

    iget v3, p0, LRe/g;->d:I

    iget v4, p0, LRe/g;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LRe/h;->a(Landroidx/compose/ui/e;Ls9/d;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
