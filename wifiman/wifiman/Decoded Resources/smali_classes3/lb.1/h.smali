.class public abstract Llb/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
    with = Llb/h$c;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb/h$a;,
        Llb/h$b;,
        Llb/h$c;,
        Llb/h$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000f*\u0006\u0008\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0010\u000e\n\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J-\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\u0008\u0001\u0010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000bJ3\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\u0008\u0001\u0010\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00000\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000b\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Llb/h;",
        "T",
        "",
        "<init>",
        "()V",
        "c",
        "()Ljava/lang/Object;",
        "U",
        "Lkotlin/Function1;",
        "mapper",
        "d",
        "(Lmh/l;)Llb/h;",
        "",
        "f",
        "b",
        "Companion",
        "a",
        "Llb/h$b;",
        "Llb/h$d;",
        "unificore_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llb/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llb/h;->Companion:Llb/h$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llb/h;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Llb/h;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Llb/h;->e(Lmh/l;Llb/h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lmh/l;Llb/h;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/h$d;

    invoke-virtual {p1}, Llb/h$d;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lmh/l;)Llb/h;
    .locals 1

    const-string/jumbo v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb/h$d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Llb/h$d;

    invoke-virtual {v0}, Llb/h$d;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb/h;

    goto :goto_0

    :cond_0
    instance-of p1, p0, Llb/h$b;

    if-eqz p1, :cond_1

    move-object p1, p0

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Llb/h$d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Llb/h$d;

    invoke-virtual {v0}, Llb/h$d;->g()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Llb/h$b;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final d(Lmh/l;)Llb/h;
    .locals 2

    const-string/jumbo v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb/h$d;

    if-eqz v0, :cond_0

    sget-object v0, Llb/h;->Companion:Llb/h$a;

    new-instance v1, Llb/g;

    invoke-direct {v1, p1, p0}, Llb/g;-><init>(Lmh/l;Llb/h;)V

    invoke-virtual {v0, v1}, Llb/h$a;->a(Lmh/a;)Llb/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p0, Llb/h$b;

    if-eqz p1, :cond_1

    move-object p1, p0

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final f(Lmh/l;)Llb/h;
    .locals 2

    const-string/jumbo v0, "mapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb/h$d;

    if-eqz v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Llb/h$b;

    if-eqz v0, :cond_1

    sget-object v0, Llb/h;->Companion:Llb/h$a;

    move-object v1, p0

    check-cast v1, Llb/h$b;

    invoke-virtual {v1}, Llb/h$b;->g()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {p1, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Llb/h$a;->b(Ljava/lang/Throwable;)Llb/h$b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
