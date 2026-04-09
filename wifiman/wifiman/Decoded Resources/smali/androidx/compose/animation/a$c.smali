.class final Landroidx/compose/animation/a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lf0/c;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lmh/r;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$c;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/compose/animation/a$c;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Landroidx/compose/animation/a$c;->c:Lmh/l;

    iput-object p4, p0, Landroidx/compose/animation/a$c;->d:Lf0/c;

    iput-object p5, p0, Landroidx/compose/animation/a$c;->e:Ljava/lang/String;

    iput-object p6, p0, Landroidx/compose/animation/a$c;->f:Lmh/l;

    iput-object p7, p0, Landroidx/compose/animation/a$c;->g:Lmh/r;

    iput p8, p0, Landroidx/compose/animation/a$c;->h:I

    iput p9, p0, Landroidx/compose/animation/a$c;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, Landroidx/compose/animation/a$c;->a:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$c;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Landroidx/compose/animation/a$c;->c:Lmh/l;

    iget-object v3, p0, Landroidx/compose/animation/a$c;->d:Lf0/c;

    iget-object v4, p0, Landroidx/compose/animation/a$c;->e:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/animation/a$c;->f:Lmh/l;

    iget-object v6, p0, Landroidx/compose/animation/a$c;->g:Lmh/r;

    iget p2, p0, Landroidx/compose/animation/a$c;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    iget v9, p0, Landroidx/compose/animation/a$c;->i:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
