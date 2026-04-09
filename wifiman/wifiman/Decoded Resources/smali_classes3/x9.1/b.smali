.class final Lx9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx9/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx9/b$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J

.field private final h:J

.field private final i:J


# direct methods
.method private constructor <init>(JJJJJJJJJ)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    .line 3
    iput-wide v1, v0, Lx9/b;->a:J

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, Lx9/b;->b:J

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, Lx9/b;->c:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, Lx9/b;->d:J

    move-wide v1, p9

    .line 7
    iput-wide v1, v0, Lx9/b;->e:J

    move-wide v1, p11

    .line 8
    iput-wide v1, v0, Lx9/b;->f:J

    move-wide/from16 v1, p13

    .line 9
    iput-wide v1, v0, Lx9/b;->g:J

    move-wide/from16 v1, p15

    .line 10
    iput-wide v1, v0, Lx9/b;->h:J

    move-wide/from16 v1, p17

    .line 11
    iput-wide v1, v0, Lx9/b;->i:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p18}, Lx9/b;-><init>(JJJJJJJJJ)V

    return-void
.end method


# virtual methods
.method public a(ZLK0/a;LT/l;I)LT/z1;
    .locals 8

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x691a81b0

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.checkbox.DefaultColors.boxColor (UiCheckbox.kt:104)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    sget-object p1, Lx9/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_2

    if-eq p1, v0, :cond_2

    if-ne p1, p4, :cond_1

    iget-wide p1, p0, Lx9/b;->f:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-wide p1, p0, Lx9/b;->d:J

    goto :goto_0

    :cond_3
    sget-object p1, Lx9/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_5

    if-ne p1, p4, :cond_4

    iget-wide p1, p0, Lx9/b;->f:J

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide p1, p0, Lx9/b;->e:J

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    const/4 p2, 0x6

    const/16 p4, 0xc8

    const/4 v2, 0x0

    invoke-static {p4, p1, v2, p2, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v2

    const/16 v6, 0x1b0

    const/16 v7, 0x8

    const-string/jumbo v3, "box"

    const/4 v4, 0x0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p3}, LT/l;->J()V

    return-object p1
.end method

.method public b(ZLK0/a;LT/l;I)LT/z1;
    .locals 8

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7aa8ebf3

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.checkbox.DefaultColors.borderColor (UiCheckbox.kt:125)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    sget-object p1, Lx9/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_2

    if-eq p1, v0, :cond_2

    if-ne p1, p4, :cond_1

    iget-wide p1, p0, Lx9/b;->g:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-wide p1, p0, Lx9/b;->h:J

    goto :goto_0

    :cond_3
    sget-object p1, Lx9/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_5

    if-ne p1, p4, :cond_4

    iget-wide p1, p0, Lx9/b;->i:J

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide p1, p0, Lx9/b;->h:J

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    const/4 p2, 0x6

    const/16 p4, 0xc8

    const/4 v2, 0x0

    invoke-static {p4, p1, v2, p2, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v2

    const/16 v6, 0x1b0

    const/16 v7, 0x8

    const-string/jumbo v3, "border"

    const/4 v4, 0x0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p3}, LT/l;->J()V

    return-object p1
.end method

.method public c(ZLK0/a;LT/l;I)LT/z1;
    .locals 8

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x37857126

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.checkbox.DefaultColors.checkmarkColor (UiCheckbox.kt:83)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    sget-object p1, Lx9/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_2

    if-eq p1, v0, :cond_2

    if-ne p1, p4, :cond_1

    iget-wide p1, p0, Lx9/b;->b:J

    :goto_0
    move-wide v0, p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-wide p1, p0, Lx9/b;->a:J

    goto :goto_0

    :cond_3
    sget-object p1, Lx9/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_5

    if-ne p1, p4, :cond_4

    iget-wide p1, p0, Lx9/b;->b:J

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide p1, p0, Lx9/b;->c:J

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    const/4 p2, 0x6

    const/16 p4, 0xc8

    const/4 v2, 0x0

    invoke-static {p4, p1, v2, p2, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v2

    const/16 v6, 0x1b0

    const/16 v7, 0x8

    const-string/jumbo v3, "checkmark"

    const/4 v4, 0x0

    move-object v5, p3

    invoke-static/range {v0 .. v7}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p3}, LT/l;->J()V

    return-object p1
.end method
