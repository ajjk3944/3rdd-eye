.class final Lv/k$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/k;->b(Ljava/lang/String;ZLv/b;Landroidx/compose/ui/e;Lmh/q;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Lv/b;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Lmh/q;

.field final synthetic f:Lmh/a;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Ljava/lang/String;ZLv/b;Landroidx/compose/ui/e;Lmh/q;Lmh/a;II)V
    .locals 0

    iput-object p1, p0, Lv/k$c;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lv/k$c;->b:Z

    iput-object p3, p0, Lv/k$c;->c:Lv/b;

    iput-object p4, p0, Lv/k$c;->d:Landroidx/compose/ui/e;

    iput-object p5, p0, Lv/k$c;->e:Lmh/q;

    iput-object p6, p0, Lv/k$c;->f:Lmh/a;

    iput p7, p0, Lv/k$c;->g:I

    iput p8, p0, Lv/k$c;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget-object v0, p0, Lv/k$c;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lv/k$c;->b:Z

    iget-object v2, p0, Lv/k$c;->c:Lv/b;

    iget-object v3, p0, Lv/k$c;->d:Landroidx/compose/ui/e;

    iget-object v4, p0, Lv/k$c;->e:Lmh/q;

    iget-object v5, p0, Lv/k$c;->f:Lmh/a;

    iget p2, p0, Lv/k$c;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    iget v8, p0, Lv/k$c;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lv/k;->b(Ljava/lang/String;ZLv/b;Landroidx/compose/ui/e;Lmh/q;Lmh/a;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/k$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
