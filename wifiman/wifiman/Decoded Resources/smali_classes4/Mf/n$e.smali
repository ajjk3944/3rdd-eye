.class final LMf/n$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMf/n;->b(LMf/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LMf/n$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMf/n$e;

    invoke-direct {v0}, LMf/n$e;-><init>()V

    sput-object v0, LMf/n$e;->a:LMf/n$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/d;)Z
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->a()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/d;

    invoke-virtual {p0, p1}, LMf/n$e;->a(Lcom/ui/wmw/api/v1/d;)Z

    move-result p1

    return p1
.end method
