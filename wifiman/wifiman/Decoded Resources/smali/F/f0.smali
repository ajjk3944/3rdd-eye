.class public final LF/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/f0$c;
    }
.end annotation


# static fields
.field public static final f:LF/f0$c;

.field private static final g:Lc0/k;


# instance fields
.field private final a:LT/m0;

.field private final b:LT/m0;

.field private c:Ll0/i;

.field private d:J

.field private final e:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF/f0$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF/f0$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/f0;->f:LF/f0$c;

    sget-object v0, LF/f0$a;->a:LF/f0$a;

    sget-object v1, LF/f0$b;->a:LF/f0$b;

    invoke-static {v0, v1}, Lc0/a;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, LF/f0;->g:Lc0/k;

    return-void
.end method

.method public constructor <init>(Lw/q;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, LT/C0;->a(F)LT/m0;

    move-result-object p2

    iput-object p2, p0, LF/f0;->a:LT/m0;

    const/4 p2, 0x0

    .line 3
    invoke-static {p2}, LT/C0;->a(F)LT/m0;

    move-result-object p2

    iput-object p2, p0, LF/f0;->b:LT/m0;

    .line 4
    sget-object p2, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {p2}, Ll0/i$a;->a()Ll0/i;

    move-result-object p2

    iput-object p2, p0, LF/f0;->c:Ll0/i;

    .line 5
    sget-object p2, LL0/S;->b:LL0/S$a;

    invoke-virtual {p2}, LL0/S$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LF/f0;->d:J

    .line 6
    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p2

    invoke-static {p1, p2}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LF/f0;->e:LT/q0;

    return-void
.end method

.method public synthetic constructor <init>(Lw/q;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, LF/f0;-><init>(Lw/q;F)V

    return-void
.end method

.method public static final synthetic a()Lc0/k;
    .locals 1

    sget-object v0, LF/f0;->g:Lc0/k;

    return-object v0
.end method

.method private final g(F)V
    .locals 1

    iget-object v0, p0, LF/f0;->b:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method


# virtual methods
.method public final b(FFI)V
    .locals 4

    invoke-virtual {p0}, LF/f0;->d()F

    move-result v0

    int-to-float p3, p3

    add-float v1, v0, p3

    cmpl-float v2, p2, v1

    if-lez v2, :cond_0

    :goto_0
    sub-float/2addr p2, v1

    goto :goto_1

    :cond_0
    cmpg-float v2, p1, v0

    if-gez v2, :cond_1

    sub-float v3, p2, p1

    cmpl-float v3, v3, p3

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    if-gez v2, :cond_2

    sub-float/2addr p2, p1

    cmpg-float p2, p2, p3

    if-gtz p2, :cond_2

    sub-float p2, p1, v0

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p0}, LF/f0;->d()F

    move-result p1

    add-float/2addr p1, p2

    invoke-virtual {p0, p1}, LF/f0;->h(F)V

    return-void
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, LF/f0;->b:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, LF/f0;->a:LT/m0;

    invoke-interface {v0}, LT/P;->c()F

    move-result v0

    return v0
.end method

.method public final e(J)I
    .locals 3

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result v0

    iget-wide v1, p0, LF/f0;->d:J

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, LL0/S;->n(J)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result v0

    iget-wide v1, p0, LF/f0;->d:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, LL0/S;->l(J)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final f()Lw/q;
    .locals 1

    iget-object v0, p0, LF/f0;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw/q;

    return-object v0
.end method

.method public final h(F)V
    .locals 1

    iget-object v0, p0, LF/f0;->a:LT/m0;

    invoke-interface {v0, p1}, LT/m0;->k(F)V

    return-void
.end method

.method public final i(J)V
    .locals 0

    iput-wide p1, p0, LF/f0;->d:J

    return-void
.end method

.method public final j(Lw/q;Ll0/i;II)V
    .locals 2

    sub-int/2addr p4, p3

    int-to-float p4, p4

    invoke-direct {p0, p4}, LF/f0;->g(F)V

    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v0

    iget-object v1, p0, LF/f0;->c:Ll0/i;

    invoke-virtual {v1}, Ll0/i;->k()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v0

    iget-object v1, p0, LF/f0;->c:Ll0/i;

    invoke-virtual {v1}, Ll0/i;->n()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    sget-object v0, Lw/q;->Vertical:Lw/q;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ll0/i;->n()F

    move-result v0

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ll0/i;->k()F

    move-result v0

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ll0/i;->e()F

    move-result p1

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Ll0/i;->l()F

    move-result p1

    :goto_2
    invoke-virtual {p0, v0, p1, p3}, LF/f0;->b(FFI)V

    iput-object p2, p0, LF/f0;->c:Ll0/i;

    :goto_3
    invoke-virtual {p0}, LF/f0;->d()F

    move-result p1

    const/4 p2, 0x0

    invoke-static {p1, p2, p4}, Lsh/m;->j(FFF)F

    move-result p1

    invoke-virtual {p0, p1}, LF/f0;->h(F)V

    return-void
.end method
