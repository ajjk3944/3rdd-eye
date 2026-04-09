.class final LDc/p$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/p$j;->a(LYg/J;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDc/p$j$a$a;
    }
.end annotation


# static fields
.field public static final a:LDc/p$j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDc/p$j$a;

    invoke-direct {v0}, LDc/p$j$a;-><init>()V

    sput-object v0, LDc/p$j$a;->a:LDc/p$j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)LDc/p$b;
    .locals 9

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZc/e$a;->b()Linet/ipaddr/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v2

    sget-object v3, LDc/p$j$a$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v2, v8, :cond_3

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    move-object v2, v1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LZc/e$a;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_2
    if-eqz v0, :cond_4

    if-eqz v2, :cond_4

    sget-object v1, LWc/a;->c:LWc/a$a;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v0, v2}, LWc/a$a;->a(Linet/ipaddr/g;I)LWc/a;

    move-result-object v1

    :cond_4
    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-eq v0, v8, :cond_6

    if-eq v0, v7, :cond_6

    if-eq v0, v6, :cond_6

    if-eq v0, v5, :cond_6

    if-ne v0, v4, :cond_5

    const/4 v0, 0x0

    goto :goto_3

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    move v0, v8

    :goto_3
    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v8, :cond_9

    if-eq v2, v7, :cond_9

    if-eq v2, v6, :cond_9

    if-eq v2, v5, :cond_8

    if-ne v2, v4, :cond_7

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    goto :goto_4

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    sget-object v2, LEc/t$c;->GATEWAY:LEc/t$c;

    sget-object v3, LEc/t$c;->MYSELF:LEc/t$c;

    filled-new-array {v2, v3}, [LEc/t$c;

    move-result-object v2

    invoke-static {v2}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    goto :goto_4

    :cond_9
    sget-object v2, LDc/e;->a:LDc/e$a;

    invoke-virtual {v2}, LDc/e$a;->a()Ljava/util/Set;

    move-result-object v2

    :goto_4
    if-eqz v0, :cond_a

    new-instance v0, LDc/p$b$b;

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v1, v2}, LDc/p$b$b;-><init>(Ljava/lang/String;LWc/a;Ljava/util/Set;)V

    goto :goto_5

    :cond_a
    sget-object v0, LDc/p$b$a;->a:LDc/p$b$a;

    :goto_5
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, LDc/p$j$a;->a(LZc/e;)LDc/p$b;

    move-result-object p1

    return-object p1
.end method
