.class final Lp8/i$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$s;

    invoke-direct {v0}, Lp8/i$s;-><init>()V

    sput-object v0, Lp8/i$s;->a:Lp8/i$s;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLe/b;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLe/b;

    instance-of v1, p1, LLe/b$b$a;

    const-string/jumbo v2, "just(...)"

    if-eqz v1, :cond_3

    instance-of v1, v0, LLe/b$b$a;

    if-nez v1, :cond_2

    instance-of v1, v0, LLe/b$b$b;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, v0, LLe/b$a;

    if-eqz p1, :cond_1

    sget-object p1, LLe/b$a;->a:LLe/b$a;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const-wide/16 v0, 0x7d0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    sget-object v1, Lp8/i$s$a;->a:Lp8/i$s$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    instance-of v0, p1, LLe/b$b$b;

    if-nez v0, :cond_5

    instance-of v0, p1, LLe/b$a;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lp8/i$s;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
