.class final LM8/A$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/A$u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/A$u;

    invoke-direct {v0}, LM8/A$u;-><init>()V

    sput-object v0, LM8/A$u;->a:LM8/A$u;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM8/A$b;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LM8/A$b$c;

    if-nez v0, :cond_4

    instance-of v0, p1, LM8/A$b$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LM8/A$b$a;

    if-eqz v0, :cond_3

    check-cast p1, LM8/A$b$a;

    invoke-virtual {p1}, LM8/A$b$a;->a()LFf/d$a;

    move-result-object p1

    instance-of v0, p1, LFf/d$a$a;

    if-nez v0, :cond_2

    instance-of v0, p1, LFf/d$a$b;

    if-nez v0, :cond_2

    instance-of p1, p1, LFf/d$a$c;

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

    check-cast p1, LM8/A$b;

    invoke-virtual {p0, p1}, LM8/A$u;->a(LM8/A$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
