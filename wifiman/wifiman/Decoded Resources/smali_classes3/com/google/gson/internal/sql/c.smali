.class Lcom/google/gson/internal/sql/c;
.super Lcom/google/gson/p;
.source "SourceFile"


# static fields
.field static final b:Lcom/google/gson/q;


# instance fields
.field private final a:Lcom/google/gson/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/gson/internal/sql/c$a;

    invoke-direct {v0}, Lcom/google/gson/internal/sql/c$a;-><init>()V

    sput-object v0, Lcom/google/gson/internal/sql/c;->b:Lcom/google/gson/q;

    return-void
.end method

.method private constructor <init>(Lcom/google/gson/p;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/gson/internal/sql/c;->a:Lcom/google/gson/p;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/gson/p;Lcom/google/gson/internal/sql/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/gson/internal/sql/c;-><init>(Lcom/google/gson/p;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/sql/c;->e(Lw5/a;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/sql/c;->f(Lw5/c;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public e(Lw5/a;)Ljava/sql/Timestamp;
    .locals 3

    iget-object v0, p0, Lcom/google/gson/internal/sql/c;->a:Lcom/google/gson/p;

    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f(Lw5/c;Ljava/sql/Timestamp;)V
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/sql/c;->a:Lcom/google/gson/p;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    return-void
.end method
