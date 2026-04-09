.class final LSd/e$A;
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
.field public static final a:LSd/e$A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$A;

    invoke-direct {v0}, LSd/e$A;-><init>()V

    sput-object v0, LSd/e$A;->a:LSd/e$A;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/e$c;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "directConnState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSd/e$c$b$a;

    if-nez v0, :cond_3

    instance-of v0, p1, LSd/e$c$a;

    if-nez v0, :cond_3

    instance-of v0, p1, LSd/e$c$b$c;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LSd/e$c$b$b;

    if-nez v0, :cond_2

    instance-of p1, p1, LSd/e$c$b$d;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/e$c;

    invoke-virtual {p0, p1}, LSd/e$A;->a(LSd/e$c;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
