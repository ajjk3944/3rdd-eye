.class public final Le9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT8/d;

.field private final b:Le9/c;

.field private final c:Lgg/s;

.field private final d:Lgg/s;


# direct methods
.method public constructor <init>(LT8/d;Le9/c;)V
    .locals 1

    const-string/jumbo v0, "btleSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packeter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/d;->a:LT8/d;

    iput-object p2, p0, Le9/d;->b:Le9/c;

    new-instance p2, Le9/d$a;

    invoke-direct {p2, p0}, Le9/d$a;-><init>(Le9/d;)V

    invoke-static {p2}, Lf9/a;->b(Lmh/a;)V

    invoke-interface {p1}, LT8/d;->a()Lgg/s;

    move-result-object p1

    new-instance p2, Le9/d$b;

    invoke-direct {p2, p0}, Le9/d$b;-><init>(Le9/d;)V

    invoke-virtual {p1, p2}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string/jumbo v0, "btleSession.receive\n    \u2026)\n            .refCount()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le9/d;->c:Lgg/s;

    sget-object v0, Le9/d$c;->a:Le9/d$c;

    invoke-virtual {p1, v0}, Lgg/s;->W(Lkg/n;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string/jumbo p2, "incomingPackets\n        \u2026)\n            .refCount()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le9/d;->d:Lgg/s;

    return-void
.end method

.method public static final synthetic a(Le9/d;)Le9/c;
    .locals 0

    iget-object p0, p0, Le9/d;->b:Le9/c;

    return-object p0
.end method

.method public static final synthetic b(Le9/d;Le9/c$a$b;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Le9/d;->f(Le9/c$a$b;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final f(Le9/c$a$b;)Lgg/z;
    .locals 2

    iget-object v0, p0, Le9/d;->c:Lgg/s;

    new-instance v1, Le9/d$f;

    invoke-direct {v1, p1}, Le9/d$f;-><init>(Le9/c$a$b;)V

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "UiCommunicationPacketer.\u2026          .firstOrError()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final c()LT8/d;
    .locals 1

    iget-object v0, p0, Le9/d;->a:LT8/d;

    return-object v0
.end method

.method public d()Lgg/s;
    .locals 1

    iget-object v0, p0, Le9/d;->d:Lgg/s;

    return-object v0
.end method

.method public e(Le9/a;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/d$d;

    invoke-direct {v0, p0, p1}, Le9/d$d;-><init>(Le9/d;Le9/a;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le9/d$e;

    invoke-direct {v0, p0}, Le9/d$e;-><init>(Le9/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "Msg : UiCommunication.Me\u2026          )\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "UiCommunicationSession["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
