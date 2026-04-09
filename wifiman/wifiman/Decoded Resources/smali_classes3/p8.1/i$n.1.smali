.class final Lp8/i$n;
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
.field public static final a:Lp8/i$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$n;

    invoke-direct {v0}, Lp8/i$n;-><init>()V

    sput-object v0, Lp8/i$n;->a:Lp8/i$n;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp8/i$b;)LLe/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lp8/i$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lp8/i$b$a;

    invoke-virtual {p1}, Lp8/i$b$a;->a()LLe/a$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lp8/i$b$b;

    if-eqz v0, :cond_1

    sget-object p1, LLe/a$b;->a:LLe/a$b;

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lp8/i$b$c;

    if-eqz p1, :cond_2

    sget-object p1, LLe/a$c;->a:LLe/a$c;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp8/i$b;

    invoke-virtual {p0, p1}, Lp8/i$n;->a(Lp8/i$b;)LLe/a;

    move-result-object p1

    return-object p1
.end method
