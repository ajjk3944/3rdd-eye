.class final LI/E0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/E0;->t(LI/o1;Landroid/view/inputmethod/RemoveSpaceGesture;LI/l1;Landroidx/compose/ui/platform/w1;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:Lkotlin/jvm/internal/L;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;)V
    .locals 0

    iput-object p1, p0, LI/E0$a;->a:Lkotlin/jvm/internal/L;

    iput-object p2, p0, LI/E0$a;->b:Lkotlin/jvm/internal/L;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 3

    iget-object v0, p0, LI/E0$a;->a:Lkotlin/jvm/internal/L;

    iget v1, v0, Lkotlin/jvm/internal/L;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-interface {p1}, Lkotlin/text/l;->d()Lsh/i;

    move-result-object v1

    invoke-virtual {v1}, Lsh/g;->i()I

    move-result v1

    iput v1, v0, Lkotlin/jvm/internal/L;->a:I

    :cond_0
    iget-object v0, p0, LI/E0$a;->b:Lkotlin/jvm/internal/L;

    invoke-interface {p1}, Lkotlin/text/l;->d()Lsh/i;

    move-result-object p1

    invoke-virtual {p1}, Lsh/g;->j()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Lkotlin/jvm/internal/L;->a:I

    const-string p1, ""

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/text/l;

    invoke-virtual {p0, p1}, LI/E0$a;->a(Lkotlin/text/l;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
