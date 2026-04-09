.class final LD8/s$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/s;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/s$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/s$i;

    invoke-direct {v0}, LD8/s$i;-><init>()V

    sput-object v0, LD8/s$i;->a:LD8/s$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Ljava/util/Set;
    .locals 2

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lje/r$b$a$b;

    if-eqz v0, :cond_1

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    check-cast p1, Lje/r$b$a$b;

    invoke-virtual {p1}, Lje/r$b$a$b;->b()LS8/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lje/r$b$a$a;

    if-eqz v0, :cond_5

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    check-cast p1, Lje/r$b$a$a;

    invoke-virtual {p1}, Lje/r$b$a$a;->q()Lje/q;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lje/q;->c()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, Lje/r$b$a$a;->r()Lje/q;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lje/q;->c()LS8/c;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p1}, Lje/r$b$a$a;->s()Lje/q;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of v0, p1, Lje/r$b$b;

    if-nez v0, :cond_7

    instance-of p1, p1, Lje/r$a;

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, LD8/s$i;->a(Lje/r;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
