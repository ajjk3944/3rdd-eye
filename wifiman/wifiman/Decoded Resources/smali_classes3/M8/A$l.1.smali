.class final LM8/A$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/A$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/A$l;

    invoke-direct {v0}, LM8/A$l;-><init>()V

    sput-object v0, LM8/A$l;->a:LM8/A$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM8/A$b;)LFf/d;
    .locals 1

    const-string/jumbo v0, "cnt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LM8/A$b$a;

    if-eqz v0, :cond_0

    check-cast p1, LM8/A$b$a;

    invoke-virtual {p1}, LM8/A$b$a;->a()LFf/d$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LM8/A$b$b;

    if-eqz v0, :cond_1

    sget-object p1, LFf/d$b;->a:LFf/d$b;

    goto :goto_0

    :cond_1
    instance-of p1, p1, LM8/A$b$c;

    if-eqz p1, :cond_2

    sget-object p1, LFf/d$c;->a:LFf/d$c;

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM8/A$b;

    invoke-virtual {p0, p1}, LM8/A$l;->a(LM8/A$b;)LFf/d;

    move-result-object p1

    return-object p1
.end method
