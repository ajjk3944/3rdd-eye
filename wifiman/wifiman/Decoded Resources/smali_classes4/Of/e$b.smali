.class final LOf/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOf/e;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LOf/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LOf/e$b;

    invoke-direct {v0}, LOf/e$b;-><init>()V

    sput-object v0, LOf/e$b;->a:LOf/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/ApiV1Settings;)LOf/a;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOf/a;

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Settings;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Settings;->c()Z

    move-result v2

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Settings;->a()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LOf/a;-><init>(Ljava/lang/String;ZJ)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1Settings;

    invoke-virtual {p0, p1}, LOf/e$b;->a(Lcom/ui/wmw/api/v1/ApiV1Settings;)LOf/a;

    move-result-object p1

    return-object p1
.end method
