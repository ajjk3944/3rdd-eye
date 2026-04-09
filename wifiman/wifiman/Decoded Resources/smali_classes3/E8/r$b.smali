.class final LE8/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/r$b$a;
    }
.end annotation


# static fields
.field public static final a:LE8/r$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/r$b;

    invoke-direct {v0}, LE8/r$b;-><init>()V

    sput-object v0, LE8/r$b;->a:LE8/r$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;LZc/e;)Llf/k;
    .locals 1

    const-string/jumbo v0, "serversFetch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "networkConnection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LZc/e;->f()LZc/e$b;

    move-result-object p2

    sget-object v0, LE8/r$b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_8

    const/4 v0, 0x2

    if-eq p2, v0, :cond_8

    const/4 v0, 0x3

    if-eq p2, v0, :cond_7

    const/4 v0, 0x4

    if-eq p2, v0, :cond_6

    const/4 v0, 0x5

    if-ne p2, v0, :cond_5

    instance-of p2, p1, LWc/b$b;

    if-eqz p2, :cond_1

    check-cast p1, LWc/b$b;

    invoke-virtual {p1}, LWc/b$b;->b()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p1, Llf/k$a;->a:Llf/k$a;

    goto :goto_1

    :cond_0
    sget-object p1, Llf/k$c;->a:Llf/k$c;

    goto :goto_1

    :cond_1
    instance-of p2, p1, LWc/b$a$a;

    if-eqz p2, :cond_2

    sget-object p1, Llf/k$b$a;->a:Llf/k$b$a;

    goto :goto_1

    :cond_2
    instance-of p2, p1, LWc/b$c;

    if-nez p2, :cond_4

    instance-of p1, p1, LWc/b$a$b;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    sget-object p1, Llf/k$a;->a:Llf/k$a;

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    sget-object p1, Llf/k$c;->a:Llf/k$c;

    goto :goto_1

    :cond_7
    sget-object p1, Llf/k$c;->a:Llf/k$c;

    goto :goto_1

    :cond_8
    sget-object p1, Llf/k$b$b;->a:Llf/k$b$b;

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, LZc/e;

    invoke-virtual {p0, p1, p2}, LE8/r$b;->a(LWc/b;LZc/e;)Llf/k;

    move-result-object p1

    return-object p1
.end method
