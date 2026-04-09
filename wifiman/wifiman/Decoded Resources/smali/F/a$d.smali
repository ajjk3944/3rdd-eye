.class final LF/a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a;->b(Landroidx/compose/ui/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:I

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;II)V
    .locals 0

    iput-object p1, p0, LF/a$d;->a:Landroidx/compose/ui/e;

    iput p2, p0, LF/a$d;->b:I

    iput p3, p0, LF/a$d;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 2

    iget-object p2, p0, LF/a$d;->a:Landroidx/compose/ui/e;

    iget v0, p0, LF/a$d;->b:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v0

    iget v1, p0, LF/a$d;->c:I

    invoke-static {p2, p1, v0, v1}, LF/a;->c(Landroidx/compose/ui/e;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/a$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
