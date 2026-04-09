.class final Li8/q$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;-><init>(LP8/f;Lnc/j;Lnc/a;Lcom/ubnt/usurvey/a$b;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Li8/q$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/q$d;

    invoke-direct {v0}, Li8/q$d;-><init>()V

    sput-object v0, Li8/q$d;->a:Li8/q$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Li8/q$b;

    check-cast p2, Li8/q$b;

    invoke-virtual {p0, p1, p2}, Li8/q$d;->b(Li8/q$b;Li8/q$b;)Z

    move-result p1

    return p1
.end method

.method public final b(Li8/q$b;Li8/q$b;)Z
    .locals 4

    const-string/jumbo v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Li8/q$b;->a()Li8/a$b;

    move-result-object v0

    invoke-virtual {p1}, Li8/q$b;->a()Li8/a$b;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Li8/q$b;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Li8/q$b;->b()J

    move-result-wide p1

    const-wide/16 v2, 0x3e8

    add-long/2addr p1, v2

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
