.class final LSd/e$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$i;

    invoke-direct {v0}, LSd/e$i;-><init>()V

    sput-object v0, LSd/e$i;->a:LSd/e$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/e$c;Ll9/a;)Ll9/a;
    .locals 1

    const-string v0, "directConnState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webRtcSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSd/e$c$b$a;

    if-eqz v0, :cond_0

    new-instance p2, Ll9/a;

    const/4 p1, 0x0

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LSd/e$c$a;

    if-eqz v0, :cond_1

    new-instance p2, Ll9/a;

    check-cast p1, LSd/e$c$a;

    invoke-virtual {p1}, LSd/e$c$a;->b()LTd/a;

    move-result-object p1

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LSd/e$c$b$d;

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
    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/e$c;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LSd/e$i;->a(LSd/e$c;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
