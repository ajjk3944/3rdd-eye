.class final LMf/n$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMf/n;->b(LMf/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LMf/n$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMf/n$f;

    invoke-direct {v0}, LMf/n$f;-><init>()V

    sput-object v0, LMf/n$f;->a:LMf/n$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/d;)LMf/a$b;
    .locals 5

    const-string v0, "uploadStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, LMf/a$b$a;

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->b()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, LMf/a$b$a;-><init>(J)V

    goto :goto_0

    :cond_0
    new-instance v0, LMf/a$b$b;

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->b()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/d;->a()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LMf/a$b$b;-><init>(JJ)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/d;

    invoke-virtual {p0, p1}, LMf/n$f;->a(Lcom/ui/wmw/api/v1/d;)LMf/a$b;

    move-result-object p1

    return-object p1
.end method
