.class public final LS7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS7/e;


# instance fields
.field private final a:Lkotlin/text/p;

.field private final b:Lkotlin/text/p;

.field private final c:Lkotlin/text/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkotlin/text/p;

    const-string v1, "([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LS7/i;->a:Lkotlin/text/p;

    new-instance v0, Lkotlin/text/p;

    const-string v1, "(?:[0-9]{1,3}\\.){3}[0-9]{1,3}"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LS7/i;->b:Lkotlin/text/p;

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, LS7/i;->c:Lkotlin/text/p;

    return-void
.end method

.method public static synthetic b(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, LS7/i;->f(Lkotlin/text/l;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, LS7/i;->e(Lkotlin/text/l;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, LS7/i;->g(Lkotlin/text/l;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 2

    const-string/jumbo v0, "matchResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/text/l;->getValue()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x5

    invoke-static {p0, v0}, Lkotlin/text/t;->y1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "**:**:**:**:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 2

    const-string/jumbo v0, "matchResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/text/l;->getValue()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x3

    invoke-static {p0, v0}, Lkotlin/text/t;->y1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "***.***.***."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 2

    const-string/jumbo v0, "matchResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lkotlin/text/l;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/t;->u1(Ljava/lang/CharSequence;)C

    move-result v0

    invoke-interface {p0}, Lkotlin/text/l;->getValue()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x5

    invoke-static {p0, v1}, Lkotlin/text/t;->y1(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "****@*"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS7/i;->a:Lkotlin/text/p;

    new-instance v1, LS7/f;

    invoke-direct {v1}, LS7/f;-><init>()V

    invoke-virtual {v0, p1, v1}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LS7/i;->b:Lkotlin/text/p;

    new-instance v1, LS7/g;

    invoke-direct {v1}, LS7/g;-><init>()V

    invoke-virtual {v0, p1, v1}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LS7/i;->c:Lkotlin/text/p;

    new-instance v1, LS7/h;

    invoke-direct {v1}, LS7/h;-><init>()V

    invoke-virtual {v0, p1, v1}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
