.class final LSd/e$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e$h;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$h$a;

    invoke-direct {v0}, LSd/e$h$a;-><init>()V

    sput-object v0, LSd/e$h$a;->a:LSd/e$h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/e$c;)LDj/a;
    .locals 2

    const-string v0, "webRtcConnState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LSd/e$c$a;

    const-string v1, "just(...)"

    if-eqz v0, :cond_0

    new-instance v0, Ll9/a;

    check-cast p1, LSd/e$c$a;

    invoke-virtual {p1}, LSd/e$c$a;->b()LTd/a;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, LSd/e$c$b$d;

    if-nez v0, :cond_2

    instance-of p1, p1, LSd/e$c$b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/e$c;

    invoke-virtual {p0, p1}, LSd/e$h$a;->a(LSd/e$c;)LDj/a;

    move-result-object p1

    return-object p1
.end method
