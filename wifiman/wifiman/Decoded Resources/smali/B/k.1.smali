.class public final LB/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/j;
.implements LC0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/k$b;,
        LB/k$c;
    }
.end annotation


# static fields
.field public static final f:LB/k$b;

.field private static final g:LB/k$a;


# instance fields
.field private final a:LB/m;

.field private final b:LB/j;

.field private final c:Z

.field private final d:LY0/t;

.field private final e:Lw/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB/k$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LB/k;->f:LB/k$b;

    new-instance v0, LB/k$a;

    invoke-direct {v0}, LB/k$a;-><init>()V

    sput-object v0, LB/k;->g:LB/k$a;

    return-void
.end method

.method public constructor <init>(LB/m;LB/j;ZLY0/t;Lw/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/k;->a:LB/m;

    iput-object p2, p0, LB/k;->b:LB/j;

    iput-boolean p3, p0, LB/k;->c:Z

    iput-object p4, p0, LB/k;->d:LY0/t;

    iput-object p5, p0, LB/k;->e:Lw/q;

    return-void
.end method

.method public static final synthetic c(LB/k;LB/j$a;I)Z
    .locals 0

    invoke-direct {p0, p1, p2}, LB/k;->f(LB/j$a;I)Z

    move-result p0

    return p0
.end method

.method private final d(LB/j$a;I)LB/j$a;
    .locals 1

    invoke-virtual {p1}, LB/j$a;->b()I

    move-result v0

    invoke-virtual {p1}, LB/j$a;->a()I

    move-result p1

    invoke-direct {p0, p2}, LB/k;->g(I)Z

    move-result p2

    if-eqz p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget-object p2, p0, LB/k;->b:LB/j;

    invoke-virtual {p2, v0, p1}, LB/j;->a(II)LB/j$a;

    move-result-object p1

    return-object p1
.end method

.method private final f(LB/j$a;I)Z
    .locals 2

    invoke-direct {p0, p2}, LB/k;->h(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p2}, LB/k;->g(I)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, LB/j$a;->a()I

    move-result p1

    iget-object p2, p0, LB/k;->a:LB/m;

    invoke-interface {p2}, LB/m;->a()I

    move-result p2

    sub-int/2addr p2, v0

    if-ge p1, p2, :cond_2

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LB/j$a;->b()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method private final g(I)Z
    .locals 5

    sget-object v0, LC0/e$b;->a:LC0/e$b$a;

    invoke-virtual {v0}, LC0/e$b$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, LC0/e$b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    :goto_0
    move v2, v3

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v0}, LC0/e$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v2, p0, LB/k;->c:Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LC0/e$b$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean p1, p0, LB/k;->c:Z

    if-nez p1, :cond_9

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LC0/e$b$a;->e()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    const/4 v4, 0x2

    if-eqz v1, :cond_6

    iget-object p1, p0, LB/k;->d:LY0/t;

    sget-object v0, LB/k$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_5

    if-ne p1, v4, :cond_4

    iget-boolean p1, p0, LB/k;->c:Z

    if-nez p1, :cond_9

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-boolean v2, p0, LB/k;->c:Z

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, LC0/e$b$a;->f()I

    move-result v0

    invoke-static {p1, v0}, LC0/e$b;->h(II)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, LB/k;->d:LY0/t;

    sget-object v0, LB/k$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_8

    if-ne p1, v4, :cond_7

    iget-boolean v2, p0, LB/k;->c:Z

    goto :goto_1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    iget-boolean p1, p0, LB/k;->c:Z

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    :goto_1
    return v2

    :cond_a
    invoke-static {}, LB/l;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method private final h(I)Z
    .locals 4

    sget-object v0, LC0/e$b;->a:LC0/e$b$a;

    invoke-virtual {v0}, LC0/e$b$a;->a()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LC0/e$b$a;->d()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object p1, p0, LB/k;->e:Lw/q;

    sget-object v0, Lw/q;->Horizontal:Lw/q;

    if-ne p1, v0, :cond_1

    goto :goto_4

    :cond_1
    :goto_1
    move v2, v3

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, LC0/e$b$a;->e()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, LC0/e$b$a;->f()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_4

    iget-object p1, p0, LB/k;->e:Lw/q;

    sget-object v0, Lw/q;->Vertical:Lw/q;

    if-ne p1, v0, :cond_1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, LC0/e$b$a;->c()I

    move-result v1

    invoke-static {p1, v1}, LC0/e$b;->h(II)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, LC0/e$b$a;->b()I

    move-result v0

    invoke-static {p1, v0}, LC0/e$b;->h(II)Z

    move-result v2

    :goto_3
    if-eqz v2, :cond_6

    goto :goto_1

    :goto_4
    return v2

    :cond_6
    invoke-static {}, LB/l;->a()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(ILmh/l;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LB/k;->a:LB/m;

    invoke-interface {v0}, LB/m;->a()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, LB/k;->a:LB/m;

    invoke-interface {v0}, LB/m;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, p1}, LB/k;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LB/k;->a:LB/m;

    invoke-interface {v0}, LB/m;->b()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LB/k;->a:LB/m;

    invoke-interface {v0}, LB/m;->e()I

    move-result v0

    :goto_0
    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object v2, p0, LB/k;->b:LB/j;

    invoke-virtual {v2, v0, v0}, LB/j;->a(II)LB/j$a;

    move-result-object v0

    iput-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    iget-object v2, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, LB/j$a;

    invoke-direct {p0, v2, p1}, LB/k;->f(LB/j$a;I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, LB/j$a;

    invoke-direct {p0, v0, p1}, LB/k;->d(LB/j$a;I)LB/j$a;

    move-result-object v0

    iget-object v2, p0, LB/k;->b:LB/j;

    iget-object v3, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, LB/j$a;

    invoke-virtual {v2, v3}, LB/j;->e(LB/j$a;)V

    iput-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v0, p0, LB/k;->a:LB/m;

    invoke-interface {v0}, LB/m;->c()V

    new-instance v0, LB/k$d;

    invoke-direct {v0, p0, v1, p1}, LB/k$d;-><init>(LB/k;Lkotlin/jvm/internal/N;I)V

    invoke-interface {p2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object p1, p0, LB/k;->b:LB/j;

    iget-object p2, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p2, LB/j$a;

    invoke-virtual {p1, p2}, LB/j;->e(LB/j$a;)V

    iget-object p1, p0, LB/k;->a:LB/m;

    invoke-interface {p1}, LB/m;->c()V

    return-object v0

    :cond_3
    :goto_2
    sget-object p1, LB/k;->g:LB/k$a;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e()LC0/e;
    .locals 0

    return-object p0
.end method

.method public getKey()LD0/l;
    .locals 1

    invoke-static {}, LC0/f;->a()LD0/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB/k;->e()LC0/e;

    move-result-object v0

    return-object v0
.end method
