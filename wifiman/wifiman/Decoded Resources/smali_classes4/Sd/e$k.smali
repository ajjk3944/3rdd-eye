.class final LSd/e$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$k;

    invoke-direct {v0}, LSd/e$k;-><init>()V

    sput-object v0, LSd/e$k;->a:LSd/e$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/e$c;)LSd/d$a;
    .locals 3

    const-string v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSd/e$c$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LSd/d$a$a$b;

    check-cast p1, LSd/e$c$a;

    invoke-virtual {p1}, LSd/e$c$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v1}, LSd/d$a$a$b;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, LSd/e$c$b$d;

    if-eqz v0, :cond_1

    new-instance v0, LSd/d$a$a$a;

    check-cast p1, LSd/e$c$b$d;

    invoke-virtual {p1}, LSd/e$c$b$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LSd/e$c$b$d;->a()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, v2, p1, v1}, LSd/d$a$a$a;-><init>(Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, LSd/e$c$b$a;

    if-nez v0, :cond_3

    instance-of v0, p1, LSd/e$c$b$c;

    if-nez v0, :cond_3

    instance-of p1, p1, LSd/e$c$b$b;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object v0, LSd/d$a$b;->a:LSd/d$a$b;

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/e$c;

    invoke-virtual {p0, p1}, LSd/e$k;->a(LSd/e$c;)LSd/d$a;

    move-result-object p1

    return-object p1
.end method
