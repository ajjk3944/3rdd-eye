.class final LM8/d$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/d$l$a;
    }
.end annotation


# instance fields
.field final synthetic a:LM8/d;


# direct methods
.method constructor <init>(LM8/d;)V
    .locals 0

    iput-object p1, p0, LM8/d$l;->a:LM8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lzf/a;)LDj/a;
    .locals 1

    const-string/jumbo v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LM8/d$l$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LM8/d$l;->a:LM8/d;

    invoke-static {p1}, LM8/d;->v0(LM8/d;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, LM8/d$l;->a:LM8/d;

    invoke-static {p1}, LM8/d;->u0(LM8/d;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzf/a;

    invoke-virtual {p0, p1}, LM8/d$l;->a(Lzf/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
