.class final Lv/a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/a;->b(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv/i;

.field final synthetic b:Lmh/a;

.field final synthetic c:Lmh/l;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Z

.field final synthetic f:Lmh/p;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;II)V
    .locals 0

    iput-object p1, p0, Lv/a$c;->a:Lv/i;

    iput-object p2, p0, Lv/a$c;->b:Lmh/a;

    iput-object p3, p0, Lv/a$c;->c:Lmh/l;

    iput-object p4, p0, Lv/a$c;->d:Landroidx/compose/ui/e;

    iput-boolean p5, p0, Lv/a$c;->e:Z

    iput-object p6, p0, Lv/a$c;->f:Lmh/p;

    iput p7, p0, Lv/a$c;->g:I

    iput p8, p0, Lv/a$c;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget-object v0, p0, Lv/a$c;->a:Lv/i;

    iget-object v1, p0, Lv/a$c;->b:Lmh/a;

    iget-object v2, p0, Lv/a$c;->c:Lmh/l;

    iget-object v3, p0, Lv/a$c;->d:Landroidx/compose/ui/e;

    iget-boolean v4, p0, Lv/a$c;->e:Z

    iget-object v5, p0, Lv/a$c;->f:Lmh/p;

    iget p2, p0, Lv/a$c;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    iget v8, p0, Lv/a$c;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lv/a;->b(Lv/i;Lmh/a;Lmh/l;Landroidx/compose/ui/e;ZLmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/a$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
