.class public final LW0/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LW0/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW0/n$a;

    invoke-direct {v0}, LW0/n$a;-><init>()V

    sput-object v0, LW0/n$a;->a:LW0/n$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm0/l0;F)LW0/n;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, LW0/n$b;->b:LW0/n$b;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lm0/j1;

    if-eqz v0, :cond_1

    check-cast p1, Lm0/j1;

    invoke-virtual {p1}, Lm0/j1;->b()J

    move-result-wide v0

    invoke-static {v0, v1, p2}, LW0/m;->c(JF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LW0/n$a;->b(J)LW0/n;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lm0/e1;

    if-eqz v0, :cond_2

    new-instance v0, LW0/c;

    check-cast p1, Lm0/e1;

    invoke-direct {v0, p1, p2}, LW0/c;-><init>(Lm0/e1;F)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(J)LW0/n;
    .locals 2

    const-wide/16 v0, 0x10

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, LW0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LW0/d;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    sget-object v0, LW0/n$b;->b:LW0/n$b;

    :goto_0
    return-object v0
.end method
