.class LC1/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:I

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Z

.field private g:LC1/c$d;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC1/c$b;->a:Landroid/app/Activity;

    new-instance p1, LC1/d;

    invoke-direct {p1}, LC1/d;-><init>()V

    iput-object p1, p0, LC1/c$b;->g:LC1/c$d;

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    invoke-static {}, LC1/c$b;->i()Z

    move-result v0

    return v0
.end method

.method public static final synthetic b(LC1/c$b;)LC1/j;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final c()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, LC1/c$b;->a:Landroid/app/Activity;

    return-object v0
.end method

.method public final d()LC1/c$d;
    .locals 1

    iget-object v0, p0, LC1/c$b;->g:LC1/c$d;

    return-object v0
.end method

.method public e()V
    .locals 5

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, LC1/c$b;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, LC1/a;->d:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, LC1/c$b;->c:Ljava/lang/Integer;

    iget v2, v0, Landroid/util/TypedValue;->data:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, LC1/c$b;->d:Ljava/lang/Integer;

    :cond_0
    sget v2, LC1/a;->c:I

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, LC1/c$b;->e:Landroid/graphics/drawable/Drawable;

    :cond_1
    sget v2, LC1/a;->b:I

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    sget v4, LC1/b;->a:I

    if-ne v2, v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, p0, LC1/c$b;->f:Z

    :cond_3
    const-string v2, "currentTheme"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, LC1/c$b;->g(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V

    return-void
.end method

.method public f(LC1/c$d;)V
    .locals 2

    const-string v0, "keepOnScreenCondition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC1/c$b;->g:LC1/c$d;

    iget-object p1, p0, LC1/c$b;->a:Landroid/app/Activity;

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, LC1/c$b$a;

    invoke-direct {v1, p0, p1}, LC1/c$b$a;-><init>(LC1/c$b;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method protected final g(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V
    .locals 2

    const-string v0, "currentTheme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typedValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LC1/a;->a:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p2, Landroid/util/TypedValue;->resourceId:I

    iput p1, p0, LC1/c$b;->b:I

    if-eqz p1, :cond_0

    iget-object p2, p0, LC1/c$b;->a:Landroid/app/Activity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->setTheme(I)V

    :cond_0
    return-void
.end method

.method public final h(LC1/c$d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LC1/c$b;->g:LC1/c$d;

    return-void
.end method
