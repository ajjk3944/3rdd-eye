.class final Lp8/i$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$q;

    invoke-direct {v0}, Lp8/i$q;-><init>()V

    sput-object v0, Lp8/i$q;->a:Lp8/i$q;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDc/e$b;)LLe/b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LDc/e$b$a$b;

    if-eqz v0, :cond_0

    new-instance v0, LLe/b$b$b;

    check-cast p1, LDc/e$b$a$b;

    invoke-virtual {p1}, LDc/e$b$a$b;->a()F

    move-result p1

    invoke-direct {v0, p1}, LLe/b$b$b;-><init>(F)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, LDc/e$b$a$a;

    if-eqz p1, :cond_1

    sget-object v0, LLe/b$b$a;->a:LLe/b$b$a;

    :goto_0
    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDc/e$b;

    invoke-virtual {p0, p1}, Lp8/i$q;->a(LDc/e$b;)LLe/b;

    move-result-object p1

    return-object p1
.end method
