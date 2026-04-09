.class final LE8/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/n;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/n$d$a;
    }
.end annotation


# static fields
.field public static final a:LE8/n$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/n$d;

    invoke-direct {v0}, LE8/n$d;-><init>()V

    sput-object v0, LE8/n$d;->a:LE8/n$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;Lif/a;)Ls9/d;
    .locals 4

    const-string/jumbo v0, "networkConnectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lif/a;->a()Lff/b;

    move-result-object p2

    invoke-virtual {p1}, LZc/e;->f()LZc/e$b;

    move-result-object p1

    sget-object v0, LE8/n$d$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    const/4 v3, 0x4

    if-eq p1, v3, :cond_4

    const/4 v3, 0x5

    if-ne p1, v3, :cond_3

    sget-object p1, LE8/n$d$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const p2, 0x7f1102a0

    if-eq p1, v0, :cond_2

    if-eq p1, v1, :cond_1

    if-ne p1, v2, :cond_0

    new-instance p1, Ls9/d$b;

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ls9/d$b;

    const p2, 0x7f11029e

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance p1, Ls9/d$b;

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ls9/d$b;

    const p2, 0x7f11029d

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    check-cast p2, Lif/a;

    invoke-virtual {p0, p1, p2}, LE8/n$d;->a(LZc/e;Lif/a;)Ls9/d;

    move-result-object p1

    return-object p1
.end method
