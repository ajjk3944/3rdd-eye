.class public abstract LM/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM/b$a;
    }
.end annotation


# static fields
.field public static final h:LM/b$a;

.field public static final i:I


# instance fields
.field private final a:LL0/d;

.field private final b:J

.field private final c:LL0/M;

.field private final d:LR0/H;

.field private final e:LM/J;

.field private f:J

.field private g:LL0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LM/b;->h:LM/b$a;

    const/16 v0, 0x8

    sput v0, LM/b;->i:I

    return-void
.end method

.method private constructor <init>(LL0/d;JLL0/M;LR0/H;LM/J;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LM/b;->a:LL0/d;

    .line 4
    iput-wide p2, p0, LM/b;->b:J

    .line 5
    iput-object p4, p0, LM/b;->c:LL0/M;

    .line 6
    iput-object p5, p0, LM/b;->d:LR0/H;

    .line 7
    iput-object p6, p0, LM/b;->e:LM/J;

    .line 8
    iput-wide p2, p0, LM/b;->f:J

    .line 9
    iput-object p1, p0, LM/b;->g:LL0/d;

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;JLL0/M;LR0/H;LM/J;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LM/b;-><init>(LL0/d;JLL0/M;LR0/H;LM/J;)V

    return-void
.end method

.method private final C()LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->l()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final E()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->m()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final F()LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final H()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->t()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final V()I
    .locals 3

    iget-object v0, p0, LM/b;->d:LR0/H;

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->b(I)I

    move-result v0

    return v0
.end method

.method private final W()I
    .locals 3

    iget-object v0, p0, LM/b;->d:LR0/H;

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->b(I)I

    move-result v0

    return v0
.end method

.method private final X()I
    .locals 3

    iget-object v0, p0, LM/b;->d:LR0/H;

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->b(I)I

    move-result v0

    return v0
.end method

.method private final a(I)I
    .locals 1

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lsh/m;->g(II)I

    move-result p1

    return p1
.end method

.method private final g(LL0/M;I)I
    .locals 2

    invoke-virtual {p1, p2}, LL0/M;->q(I)I

    move-result p2

    iget-object v0, p0, LM/b;->d:LR0/H;

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v1}, LL0/M;->o(IZ)I

    move-result p1

    invoke-interface {v0, p1}, LR0/H;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic h(LM/b;LL0/M;IILjava/lang/Object;)I
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LM/b;->W()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LM/b;->g(LL0/M;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final j(LL0/M;I)I
    .locals 1

    invoke-virtual {p1, p2}, LL0/M;->q(I)I

    move-result p2

    iget-object v0, p0, LM/b;->d:LR0/H;

    invoke-virtual {p1, p2}, LL0/M;->u(I)I

    move-result p1

    invoke-interface {v0, p1}, LR0/H;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic k(LM/b;LL0/M;IILjava/lang/Object;)I
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LM/b;->X()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LM/b;->j(LL0/M;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final n(LL0/M;I)I
    .locals 3

    :goto_0
    iget-object v0, p0, LM/b;->a:LL0/d;

    invoke-virtual {v0}, LL0/d;->length()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object p1, p0, LM/b;->a:LL0/d;

    invoke-virtual {p1}, LL0/d;->length()I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p2}, LM/b;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LL0/M;->C(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v2

    if-gt v2, p2, :cond_1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LM/b;->d:LR0/H;

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result p2

    invoke-interface {p1, p2}, LR0/H;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic o(LM/b;LL0/M;IILjava/lang/Object;)I
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LM/b;->V()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LM/b;->n(LL0/M;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final r(LL0/M;I)I
    .locals 3

    :goto_0
    if-gtz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p2}, LM/b;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LL0/M;->C(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v2

    if-lt v2, p2, :cond_1

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LM/b;->d:LR0/H;

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result p2

    invoke-interface {p1, p2}, LR0/H;->a(I)I

    move-result p1

    return p1
.end method

.method static synthetic s(LM/b;LL0/M;IILjava/lang/Object;)I
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-direct {p0}, LM/b;->V()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LM/b;->r(LL0/M;I)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getPrevWordOffset"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final x()Z
    .locals 2

    iget-object v0, p0, LM/b;->c:LL0/M;

    if-eqz v0, :cond_0

    invoke-direct {p0}, LM/b;->V()I

    move-result v1

    invoke-virtual {v0, v1}, LL0/M;->y(I)LW0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, LW0/i;->Rtl:LW0/i;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private final y(LL0/M;I)I
    .locals 5

    invoke-direct {p0}, LM/b;->V()I

    move-result v0

    iget-object v1, p0, LM/b;->e:LM/J;

    invoke-virtual {v1}, LM/J;->a()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, LM/b;->e:LM/J;

    invoke-virtual {p1, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v2

    invoke-virtual {v2}, Ll0/i;->k()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, LM/J;->c(Ljava/lang/Float;)V

    :cond_0
    invoke-virtual {p1, v0}, LL0/M;->q(I)I

    move-result v0

    add-int/2addr v0, p2

    if-gez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p1}, LL0/M;->n()I

    move-result p2

    if-lt v0, p2, :cond_2

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1, v0}, LL0/M;->m(I)F

    move-result p2

    const/4 v1, 0x1

    int-to-float v2, v1

    sub-float/2addr p2, v2

    iget-object v2, p0, LM/b;->e:LM/J;

    invoke-virtual {v2}, LM/J;->a()Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-direct {p0}, LM/b;->x()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v0}, LL0/M;->t(I)F

    move-result v4

    cmpl-float v4, v3, v4

    if-gez v4, :cond_4

    :cond_3
    invoke-direct {p0}, LM/b;->x()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p1, v0}, LL0/M;->s(I)F

    move-result v4

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_5

    :cond_4
    invoke-virtual {p1, v0, v1}, LL0/M;->o(IZ)I

    move-result p1

    return p1

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0, p2}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LL0/M;->x(J)I

    move-result p1

    iget-object p2, p0, LM/b;->d:LR0/H;

    invoke-interface {p2, p1}, LR0/H;->a(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final A()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LM/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LM/b;->F()LM/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LM/b;->C()LM/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LM/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LM/b;->H()LM/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LM/b;->E()LM/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final D()LM/b;
    .locals 3

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    invoke-static {v0, v1}, LF/M;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, LF/M;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final G()LM/b;
    .locals 3

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result v1

    invoke-static {v0, v1}, LF/M;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, -0x1

    invoke-static {v1, v0}, LF/M;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    :cond_0
    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_1
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final I()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LM/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LM/b;->C()LM/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LM/b;->F()LM/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final J()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LM/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LM/b;->E()LM/b;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LM/b;->H()LM/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final K()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final L()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final M()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->f()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final N()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LM/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LM/b;->P()LM/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LM/b;->M()LM/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final O()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LM/b;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LM/b;->M()LM/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LM/b;->P()LM/b;

    :cond_1
    :goto_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final P()LM/b;
    .locals 1

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->i()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final Q()LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LM/b;->c:LL0/M;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, LM/b;->y(LL0/M;I)I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final R()LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, LM/b;->U(II)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final S()LM/b;
    .locals 3

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LM/b;->b:J

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide v0

    iput-wide v0, p0, LM/b;->f:J

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method protected final T(I)V
    .locals 0

    invoke-virtual {p0, p1, p1}, LM/b;->U(II)V

    return-void
.end method

.method protected final U(II)V
    .locals 0

    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide p1

    iput-wide p1, p0, LM/b;->f:J

    return-void
.end method

.method public final b(Lmh/l;)LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LM/b;->x()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p1

    invoke-virtual {p0, p1}, LM/b;->T(I)V

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result p1

    invoke-virtual {p0, p1}, LM/b;->T(I)V

    :cond_2
    :goto_0
    const-string p1, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c(Lmh/l;)LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LM/b;->x()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result p1

    invoke-virtual {p0, p1}, LM/b;->T(I)V

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p1

    invoke-virtual {p0, p1}, LM/b;->T(I)V

    :cond_2
    :goto_0
    const-string p1, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final d()LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->v()LM/J;

    move-result-object v0

    invoke-virtual {v0}, LM/J;->b()V

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LM/b;->f:J

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final e()LL0/d;
    .locals 1

    iget-object v0, p0, LM/b;->g:LL0/d;

    return-object v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, LM/b;->c:LL0/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LM/b;->h(LM/b;LL0/M;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final i()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, LM/b;->c:LL0/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LM/b;->k(LM/b;LL0/M;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final l()I
    .locals 3

    iget-object v0, p0, LM/b;->g:LL0/d;

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LF/N;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final m()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, LM/b;->c:LL0/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LM/b;->o(LM/b;LL0/M;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final p()LR0/H;
    .locals 1

    iget-object v0, p0, LM/b;->d:LR0/H;

    return-object v0
.end method

.method public final q()I
    .locals 3

    iget-object v0, p0, LM/b;->g:LL0/d;

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, LM/b;->f:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LF/N;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final t()Ljava/lang/Integer;
    .locals 4

    iget-object v0, p0, LM/b;->c:LL0/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v0, v2, v3, v1}, LM/b;->s(LM/b;LL0/M;IILjava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public final u()J
    .locals 2

    iget-wide v0, p0, LM/b;->f:J

    return-wide v0
.end method

.method public final v()LM/J;
    .locals 1

    iget-object v0, p0, LM/b;->e:LM/J;

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM/b;->g:LL0/d;

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()LM/b;
    .locals 2

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LM/b;->c:LL0/M;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LM/b;->y(LL0/M;I)I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
