.class public final Lkb/t;
.super Lkb/m;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/m;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/String;)Lkb/q;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/t;->h(Ljava/lang/String;)Lkb/u;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;)Lkb/u;
    .locals 2

    const-string/jumbo v0, "headerString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lub/c;->a:Lub/c;

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->a()Lcj/e;

    sget-object v1, Lkb/u;->Companion:Lkb/u$b;

    invoke-virtual {v1}, Lkb/u$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Laj/b;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkb/u;

    return-object p1
.end method
