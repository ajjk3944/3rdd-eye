.class public final Li7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/f$a;
    }
.end annotation


# instance fields
.field private a:Le7/f;

.field private b:Lmh/l;

.field private c:Le7/g;

.field private d:Lmh/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le7/f$b;->a:Le7/f$b;

    iput-object v0, p0, Li7/f;->a:Le7/f;

    new-instance v0, Li7/d;

    invoke-direct {v0}, Li7/d;-><init>()V

    iput-object v0, p0, Li7/f;->b:Lmh/l;

    sget-object v0, Le7/g$a;->a:Le7/g$a;

    iput-object v0, p0, Li7/f;->c:Le7/g;

    new-instance v0, Li7/e;

    invoke-direct {v0}, Li7/e;-><init>()V

    iput-object v0, p0, Li7/f;->d:Lmh/l;

    return-void
.end method

.method public static synthetic c(Le7/f;)LYg/J;
    .locals 0

    invoke-static {p0}, Li7/f;->g(Le7/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Le7/g;)LYg/J;
    .locals 0

    invoke-static {p0}, Li7/f;->j(Le7/g;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Le7/f;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private h(Le7/f;)V
    .locals 1

    iput-object p1, p0, Li7/f;->a:Le7/f;

    invoke-virtual {p0}, Li7/f;->e()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private i(Le7/g;)V
    .locals 1

    iput-object p1, p0, Li7/f;->c:Le7/g;

    invoke-virtual {p0}, Li7/f;->f()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final j(Le7/g;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a(Lmh/l;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li7/f;->d:Lmh/l;

    return-void
.end method

.method public b(Lmh/l;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li7/f;->b:Lmh/l;

    return-void
.end method

.method public e()Lmh/l;
    .locals 1

    iget-object v0, p0, Li7/f;->b:Lmh/l;

    return-object v0
.end method

.method public f()Lmh/l;
    .locals 1

    iget-object v0, p0, Li7/f;->d:Lmh/l;

    return-object v0
.end method

.method public final k(Le7/f;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li7/f;->h(Le7/f;)V

    return-void
.end method

.method public final l(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)V
    .locals 1

    const-string/jumbo v0, "trackingState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "failureReason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li7/f$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Li7/f$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Le7/g$b$a$d;->a:Le7/g$b$a$d;

    goto :goto_0

    :pswitch_1
    sget-object p1, Le7/g$b$a$c;->a:Le7/g$b$a$c;

    goto :goto_0

    :pswitch_2
    sget-object p1, Le7/g$b$a$b;->a:Le7/g$b$a$b;

    goto :goto_0

    :pswitch_3
    sget-object p1, Le7/g$b$a$a;->a:Le7/g$b$a$a;

    goto :goto_0

    :pswitch_4
    sget-object p1, Le7/g$b$a$e;->a:Le7/g$b$a$e;

    goto :goto_0

    :pswitch_5
    sget-object p1, Le7/g$b$b;->a:Le7/g$b$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Le7/g$b$c;->a:Le7/g$b$c;

    goto :goto_0

    :cond_2
    sget-object p1, Le7/g$a;->a:Le7/g$a;

    :goto_0
    invoke-direct {p0, p1}, Li7/f;->i(Le7/g;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
