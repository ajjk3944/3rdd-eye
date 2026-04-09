.class public final synthetic LRe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LRe/a;

.field public final synthetic c:Lof/a$c;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LRe/a;Lof/a$c;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRe/b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LRe/b;->b:LRe/a;

    iput-object p3, p0, LRe/b;->c:Lof/a$c;

    iput p4, p0, LRe/b;->d:I

    iput p5, p0, LRe/b;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LRe/b;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LRe/b;->b:LRe/a;

    iget-object v2, p0, LRe/b;->c:Lof/a$c;

    iget v3, p0, LRe/b;->d:I

    iget v4, p0, LRe/b;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, LRe/e;->b(Landroidx/compose/ui/e;LRe/a;Lof/a$c;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
