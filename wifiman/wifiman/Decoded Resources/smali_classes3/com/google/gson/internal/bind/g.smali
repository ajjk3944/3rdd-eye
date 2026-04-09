.class public final Lcom/google/gson/internal/bind/g;
.super Lcom/google/gson/p;
.source "SourceFile"


# static fields
.field private static final b:Lcom/google/gson/q;


# instance fields
.field private final a:Lcom/google/gson/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/gson/n;->LAZILY_PARSED_NUMBER:Lcom/google/gson/n;

    invoke-static {v0}, Lcom/google/gson/internal/bind/g;->f(Lcom/google/gson/o;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/g;->b:Lcom/google/gson/q;

    return-void
.end method

.method private constructor <init>(Lcom/google/gson/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/g;->a:Lcom/google/gson/o;

    return-void
.end method

.method public static e(Lcom/google/gson/o;)Lcom/google/gson/q;
    .locals 1

    sget-object v0, Lcom/google/gson/n;->LAZILY_PARSED_NUMBER:Lcom/google/gson/n;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/google/gson/internal/bind/g;->b:Lcom/google/gson/q;

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/google/gson/internal/bind/g;->f(Lcom/google/gson/o;)Lcom/google/gson/q;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lcom/google/gson/o;)Lcom/google/gson/q;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/g;

    invoke-direct {v0, p0}, Lcom/google/gson/internal/bind/g;-><init>(Lcom/google/gson/o;)V

    new-instance p0, Lcom/google/gson/internal/bind/g$a;

    invoke-direct {p0, v0}, Lcom/google/gson/internal/bind/g$a;-><init>(Lcom/google/gson/internal/bind/g;)V

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/g;->g(Lw5/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/g;->h(Lw5/c;Ljava/lang/Number;)V

    return-void
.end method

.method public g(Lw5/a;)Ljava/lang/Number;
    .locals 4

    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object v0

    sget-object v1, Lcom/google/gson/internal/bind/g$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Expecting number, got: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lw5/a;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/g;->a:Lcom/google/gson/o;

    invoke-interface {v0, p1}, Lcom/google/gson/o;->readNumber(Lw5/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lw5/a;->r0()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Lw5/c;Ljava/lang/Number;)V
    .locals 0

    invoke-virtual {p1, p2}, Lw5/c;->w0(Ljava/lang/Number;)Lw5/c;

    return-void
.end method
