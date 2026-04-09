.class final LP8/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g;->l(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/g$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/g$d;

    invoke-direct {v0}, LP8/g$d;-><init>()V

    sput-object v0, LP8/g$d;->a:LP8/g$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/r;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIf/a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    const-string/jumbo v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-lez p1, :cond_0

    new-instance p1, LP8/g$d$a;

    invoke-direct {p1, v0}, LP8/g$d$a;-><init>(LIf/a;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v0}, Lgg/n;->d(JLjava/util/concurrent/TimeUnit;)Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, LP8/g$d$b;

    invoke-direct {p1, v0}, LP8/g$d$b;-><init>(LIf/a;)V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LP8/g$d;->a(LYg/s;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
