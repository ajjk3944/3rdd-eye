.class final Li8/r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r;-><init>(Li8/a;Li8/s$d;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LN8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Li8/r$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/r$c;

    invoke-direct {v0}, Li8/r$c;-><init>()V

    sput-object v0, Li8/r$c;->a:Li8/r$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/a$a;)Lgg/r;
    .locals 2

    const-string/jumbo v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li8/a$a$e;

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v0, :cond_0

    new-instance p1, Li8/r$c$b;

    invoke-direct {p1}, Li8/r$c$b;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Li8/a$a$f;

    if-eqz v0, :cond_1

    new-instance v0, Li8/r$c$c;

    invoke-direct {v0, p1}, Li8/r$c$c;-><init>(Li8/a$a;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li8/r$c$a;->a:Li8/r$c$a;

    invoke-virtual {p1, v0}, Lgg/n;->p(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Li8/a$a$h;

    const-string/jumbo v1, "empty(...)"

    if-nez v0, :cond_3

    instance-of v0, p1, Li8/a$a$c;

    if-nez v0, :cond_3

    instance-of v0, p1, Li8/a$a$d;

    if-nez v0, :cond_3

    instance-of p1, p1, Li8/a$a$g;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/a$a;

    invoke-virtual {p0, p1}, Li8/r$c;->a(Li8/a$a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
