.class final Lh0/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:Lh0/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh0/b$b;

    invoke-direct {v0}, Lh0/b$b;-><init>()V

    sput-object v0, Lh0/b$b;->a:Lh0/b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lh0/b;Landroid/util/LongSparseArray;)V
    .locals 0

    invoke-static {p0, p1}, Lh0/b$b;->e(Lh0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method

.method private final b(Lh0/b;Landroid/util/LongSparseArray;)V
    .locals 10

    invoke-static {p2}, LE1/c;->a(Landroid/util/LongSparseArray;)LZg/S;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LZg/S;->d()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lh0/h;->a(Ljava/lang/Object;)Landroid/view/translation/ViewTranslationResponse;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, "android:text"

    invoke-static {v3, v4}, Lh0/i;->a(Landroid/view/translation/ViewTranslationResponse;Ljava/lang/String;)Landroid/view/translation/TranslationResponseValue;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lh0/j;->a(Landroid/view/translation/TranslationResponseValue;)Ljava/lang/CharSequence;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lh0/b;->k()Lo/m;

    move-result-object v4

    long-to-int v1, v1

    invoke-virtual {v4, v1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/platform/k1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    sget-object v2, LJ0/i;->a:LJ0/i;

    invoke-virtual {v2}, LJ0/i;->z()LJ0/v;

    move-result-object v2

    invoke-static {v1, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LJ0/a;->a()LYg/i;

    move-result-object v1

    check-cast v1, Lmh/l;

    if-eqz v1, :cond_0

    new-instance v2, LL0/d;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final e(Lh0/b;Landroid/util/LongSparseArray;)V
    .locals 1

    sget-object v0, Lh0/b$b;->a:Lh0/b$b;

    invoke-direct {v0, p0, p1}, Lh0/b$b;->b(Lh0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method


# virtual methods
.method public final c(Lh0/b;[J[ILjava/util/function/Consumer;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/b;",
            "[J[I",
            "Ljava/util/function/Consumer<",
            "Landroid/view/translation/ViewTranslationRequest;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p2

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-wide v3, v0, v2

    invoke-virtual/range {p1 .. p1}, Lh0/b;->k()Lo/m;

    move-result-object v5

    long-to-int v3, v3

    invoke-virtual {v5, v3}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/platform/k1;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {}, Lh0/g;->a()V

    invoke-virtual/range {p1 .. p1}, Lh0/b;->l()Landroidx/compose/ui/platform/r;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v4

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v5

    int-to-long v5, v5

    invoke-static {v4, v5, v6}, Lh0/f;->a(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    move-result-object v4

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v3

    sget-object v5, LJ0/q;->a:LJ0/q;

    invoke-virtual {v5}, LJ0/q;->D()LJ0/v;

    move-result-object v5

    invoke-static {v3, v5}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_0

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const-string v6, "\n"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_0

    new-instance v3, LL0/d;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object v14, v3

    invoke-direct/range {v14 .. v19}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v5, "android:text"

    invoke-static {v3}, Lh0/c;->a(Ljava/lang/CharSequence;)Landroid/view/translation/TranslationRequestValue;

    move-result-object v3

    invoke-static {v4, v5, v3}, Lh0/d;->a(Landroid/view/translation/ViewTranslationRequest$Builder;Ljava/lang/String;Landroid/view/translation/TranslationRequestValue;)Landroid/view/translation/ViewTranslationRequest$Builder;

    invoke-static {v4}, Lh0/e;->a(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

    move-result-object v3

    move-object/from16 v4, p4

    invoke-interface {v4, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    move-object/from16 v4, p4

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d(Lh0/b;Landroid/util/LongSparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/b;",
            "Landroid/util/LongSparseArray<",
            "Landroid/view/translation/ViewTranslationResponse;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, Lh0/b$b;->b(Lh0/b;Landroid/util/LongSparseArray;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lh0/b;->l()Landroidx/compose/ui/platform/r;

    move-result-object v0

    new-instance v1, Lh0/k;

    invoke-direct {v1, p1, p2}, Lh0/k;-><init>(Lh0/b;Landroid/util/LongSparseArray;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
