.class final Lp8/i$A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;->w0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$A;

    invoke-direct {v0}, Lp8/i$A;-><init>()V

    sput-object v0, Lp8/i$A;->a:Lp8/i$A;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp8/i$b;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lp8/i$b$c;

    if-nez v0, :cond_4

    instance-of v0, p1, Lp8/i$b$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lp8/i$b$a;

    if-eqz v0, :cond_3

    check-cast p1, Lp8/i$b$a;

    invoke-virtual {p1}, Lp8/i$b$a;->a()LLe/a$a;

    move-result-object p1

    instance-of v0, p1, LLe/a$a$f;

    if-nez v0, :cond_2

    instance-of v0, p1, LLe/a$a$e;

    if-nez v0, :cond_2

    instance-of v0, p1, LLe/a$a$g;

    if-nez v0, :cond_2

    instance-of v0, p1, LLe/a$a$a;

    if-nez v0, :cond_2

    instance-of v0, p1, LLe/a$a$d;

    if-nez v0, :cond_2

    instance-of v0, p1, LLe/a$a$b;

    if-nez v0, :cond_2

    instance-of p1, p1, LLe/a$a$c;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp8/i$b;

    invoke-virtual {p0, p1}, Lp8/i$A;->a(Lp8/i$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
