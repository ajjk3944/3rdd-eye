.class public final LE0/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/k0$a;
    }
.end annotation


# static fields
.field public static final c:LE0/k0$a;

.field public static final d:I


# instance fields
.field private final a:LV/b;

.field private b:[LE0/G;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE0/k0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0/k0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE0/k0;->c:LE0/k0$a;

    const/16 v0, 0x8

    sput v0, LE0/k0;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LE0/G;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LE0/k0;->a:LV/b;

    return-void
.end method

.method private final b(LE0/G;)V
    .locals 3

    invoke-virtual {p1}, LE0/G;->A()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LE0/G;->F1(Z)V

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v2, p1, v0

    check-cast v2, LE0/G;

    invoke-direct {p0, v2}, LE0/k0;->b(LE0/G;)V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v1, :cond_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LE0/k0;->a:LV/b;

    sget-object v1, LE0/k0$a$a;->a:LE0/k0$a$a;

    invoke-virtual {v0, v1}, LV/b;->F(Ljava/util/Comparator;)V

    iget-object v0, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    iget-object v1, p0, LE0/k0;->b:[LE0/G;

    if-eqz v1, :cond_0

    array-length v2, v1

    if-ge v2, v0, :cond_1

    :cond_0
    iget-object v1, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v1}, LV/b;->o()I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [LE0/G;

    :cond_1
    const/4 v2, 0x0

    iput-object v2, p0, LE0/k0;->b:[LE0/G;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v2, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v2}, LV/b;->h()V

    add-int/lit8 v0, v0, -0x1

    :goto_1
    const/4 v2, -0x1

    if-ge v2, v0, :cond_4

    aget-object v2, v1, v0

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, LE0/G;->j0()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0, v2}, LE0/k0;->b(LE0/G;)V

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_4
    iput-object v1, p0, LE0/k0;->b:[LE0/G;

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v0}, LV/b;->u()Z

    move-result v0

    return v0
.end method

.method public final d(LE0/G;)V
    .locals 1

    iget-object v0, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LE0/G;->F1(Z)V

    return-void
.end method

.method public final e(LE0/G;)V
    .locals 1

    iget-object v0, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    iget-object v0, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LE0/G;->F1(Z)V

    return-void
.end method

.method public final f(LE0/G;)V
    .locals 1

    iget-object v0, p0, LE0/k0;->a:LV/b;

    invoke-virtual {v0, p1}, LV/b;->x(Ljava/lang/Object;)Z

    return-void
.end method
