.class final LH8/i$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/i$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/i$f;

    invoke-direct {v0}, LH8/i$f;-><init>()V

    sput-object v0, LH8/i$f;->a:LH8/i$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Ls9/d;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LId/a;

    instance-of v0, p1, LId/a$a;

    if-nez v0, :cond_2

    instance-of v0, p1, LId/a$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LId/a$c;

    if-eqz v0, :cond_1

    check-cast p1, LId/a$c;

    invoke-static {p1}, LH8/o;->a(LId/a$c;)Ls9/d;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, Ls9/d$c;

    const-string v0, ""

    invoke-direct {p1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LH8/i$f;->a(LYg/s;)Ls9/d;

    move-result-object p1

    return-object p1
.end method
