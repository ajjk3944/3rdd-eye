.class final LE8/n$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


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
        LE8/n$e$a;
    }
.end annotation


# static fields
.field public static final a:LE8/n$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/n$e;

    invoke-direct {v0}, LE8/n$e;-><init>()V

    sput-object v0, LE8/n$e;->a:LE8/n$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lif/a;)Ls9/d$b;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lif/a;->a()Lff/b;

    move-result-object p1

    sget-object v0, LE8/n$e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    new-instance p1, Ls9/d$b;

    const v0, 0x7f11029f

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lif/a;

    invoke-virtual {p0, p1}, LE8/n$e;->a(Lif/a;)Ls9/d$b;

    move-result-object p1

    return-object p1
.end method
