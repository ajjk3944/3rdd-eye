.class public final Lnb/g;
.super Laj/h;
.source "SourceFile"


# static fields
.field public static final c:Lnb/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/g;

    invoke-direct {v0}, Lnb/g;-><init>()V

    sput-object v0, Lnb/g;->c:Lnb/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-class v0, Lnb/f;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-direct {p0, v0}, Laj/h;-><init>(Lth/d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic g(Laj/j;)LVi/a;
    .locals 0

    invoke-virtual {p0, p1}, Lnb/g;->i(Laj/j;)LVi/b;

    move-result-object p1

    return-object p1
.end method

.method protected i(Laj/j;)LVi/b;
    .locals 2

    const-string/jumbo v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/k;->h(Laj/j;)Laj/E;

    move-result-object p1

    const-string/jumbo v0, "event"

    invoke-virtual {p1, v0}, Laj/E;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laj/j;

    if-eqz p1, :cond_0

    invoke-static {p1}, Laj/k;->i(Laj/j;)Laj/G;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Laj/G;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x5435c042

    if-eq v0, v1, :cond_5

    const v1, 0x9a23e78

    if-eq v0, v1, :cond_3

    const v1, 0x3b992b58

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const-string/jumbo v0, "icecandidate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lnb/c;->Companion:Lnb/c$b;

    invoke-virtual {p1}, Lnb/c$b;->serializer()LVi/b;

    move-result-object p1

    goto :goto_2

    :cond_3
    const-string/jumbo v0, "sdpcomplete"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    sget-object p1, Lnb/i;->Companion:Lnb/i$b;

    invoke-virtual {p1}, Lnb/i$b;->serializer()LVi/b;

    move-result-object p1

    goto :goto_2

    :cond_5
    const-string/jumbo v0, "answer"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    sget-object p1, Lnb/a;->Companion:Lnb/a$b;

    invoke-virtual {p1}, Lnb/a$b;->serializer()LVi/b;

    move-result-object p1

    goto :goto_2

    :cond_7
    :goto_1
    sget-object p1, Lnb/f;->Companion:Lnb/f$b;

    invoke-virtual {p1}, Lnb/f$b;->serializer()LVi/b;

    move-result-object p1

    :goto_2
    return-object p1
.end method
