.class public abstract LI/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LH/h;)Landroid/view/inputmethod/ExtractedText;
    .locals 0

    invoke-static {p0}, LI/a1;->b(LH/h;)Landroid/view/inputmethod/ExtractedText;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LH/h;)Landroid/view/inputmethod/ExtractedText;
    .locals 5

    new-instance v0, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v0}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    iput-object p0, v0, Landroid/view/inputmethod/ExtractedText;->text:Ljava/lang/CharSequence;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/inputmethod/ExtractedText;->startOffset:I

    invoke-virtual {p0}, LH/h;->length()I

    move-result v2

    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->partialEndOffset:I

    const/4 v2, -0x1

    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->partialStartOffset:I

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->l(J)I

    move-result v2

    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->selectionStart:I

    invoke-virtual {p0}, LH/h;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->k(J)I

    move-result v2

    iput v2, v0, Landroid/view/inputmethod/ExtractedText;->selectionEnd:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/16 v4, 0xa

    invoke-static {p0, v4, v1, v2, v3}, Lkotlin/text/t;->V(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    iput p0, v0, Landroid/view/inputmethod/ExtractedText;->flags:I

    return-object v0
.end method

.method public static final c(LI1/d;Landroid/os/Bundle;)Lt/c;
    .locals 10

    new-instance v0, Landroid/content/ClipData;

    invoke-virtual {p0}, LI1/d;->b()Landroid/content/ClipDescription;

    move-result-object v1

    new-instance v2, Landroid/content/ClipData$Item;

    invoke-virtual {p0}, LI1/d;->a()Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-direct {v0, v1, v2}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    invoke-static {v0}, Landroidx/compose/ui/platform/l;->c(Landroid/content/ClipData;)Landroidx/compose/ui/platform/f0;

    move-result-object v5

    sget-object v0, Lt/c$a;->a:Lt/c$a$a;

    invoke-virtual {v0}, Lt/c$a$a;->a()I

    move-result v7

    invoke-virtual {p0}, LI1/d;->b()Landroid/content/ClipDescription;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/l;->d(Landroid/content/ClipDescription;)Landroidx/compose/ui/platform/g0;

    move-result-object v6

    new-instance v8, Lt/b;

    invoke-virtual {p0}, LI1/d;->c()Landroid/net/Uri;

    move-result-object p0

    if-nez p1, :cond_0

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_0
    invoke-direct {v8, p0, p1}, Lt/b;-><init>(Landroid/net/Uri;Landroid/os/Bundle;)V

    new-instance p0, Lt/c;

    const/4 v9, 0x0

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, Lt/c;-><init>(Landroidx/compose/ui/platform/f0;Landroidx/compose/ui/platform/g0;ILt/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
