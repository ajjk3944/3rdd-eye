.class public final Lld/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lld/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lld/c$a;
    }
.end annotation


# instance fields
.field private final a:LP7/a;

.field private final b:LQ7/a;

.field private final c:Lcom/ui/wifiman/model/support/a;

.field private final d:Lld/c$a;

.field private final e:Lgg/i;

.field private final f:Lgg/s;

.field private final g:Lgg/s;

.field private final h:Ljava/util/List;

.field private final i:Lgg/b;


# direct methods
.method public constructor <init>(LUb/a;Lmd/b;LP7/a;LQ7/a;Lcom/ui/wifiman/model/support/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporting"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportFileDataCollector"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lld/c;->a:LP7/a;

    iput-object p4, p0, Lld/c;->b:LQ7/a;

    iput-object p5, p0, Lld/c;->c:Lcom/ui/wifiman/model/support/a;

    new-instance p3, Lld/c$a;

    invoke-direct {p3, p1}, Lld/c$a;-><init>(LUb/a;)V

    iput-object p3, p0, Lld/c;->d:Lld/c$a;

    invoke-virtual {p3}, Lcom/ui/wifiman/db/RoomPersistentInstance;->b()Lgg/i;

    move-result-object p1

    new-instance p4, Lld/c$e;

    invoke-direct {p4, p0}, Lld/c$e;-><init>(Lld/c;)V

    invoke-virtual {p1, p4}, Lgg/i;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p4, Lld/c$f;

    invoke-direct {p4, p0}, Lld/c$f;-><init>(Lld/c;)V

    invoke-virtual {p1, p4}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p4, 0x1

    invoke-virtual {p1, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p4, "refCount(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lld/c;->e:Lgg/i;

    invoke-virtual {p3}, Lcom/ui/wifiman/db/RoomPersistentInstance;->b()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    sget-object p3, Lld/b$a;->DB:Lld/b$a;

    invoke-static {p3}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p3

    invoke-virtual {p1, p3}, Lgg/b;->R(Lgg/v;)Lgg/s;

    move-result-object p1

    const-string p3, "startWith(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lld/c;->f:Lgg/s;

    invoke-interface {p2}, Lee/c;->b()Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->o0()Lgg/z;

    move-result-object p2

    new-instance p4, Lld/c$d;

    invoke-direct {p4, p0}, Lld/c$d;-><init>(Lld/c;)V

    invoke-virtual {p2, p4}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p2

    sget-object p4, Lld/b$a;->LOGGING_START:Lld/b$a;

    invoke-static {p4}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p4

    invoke-virtual {p2, p4}, Lgg/b;->R(Lgg/v;)Lgg/s;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lld/c;->g:Lgg/s;

    sget-object p3, Lld/b$a;->INIT:Lld/b$a;

    invoke-static {p3}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p3

    sget-object p4, Lld/b$a;->FINISHED:Lld/b$a;

    invoke-static {p4}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p4

    filled-new-array {p3, p1, p2, p4}, [Lgg/s;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lld/c;->h:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lgg/s;->j(Ljava/lang/Iterable;)Lgg/s;

    move-result-object p1

    sget-object p2, Lld/c$b;->a:Lld/c$b;

    invoke-virtual {p1, p2}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    sget-object p2, Lld/c$c;->a:Lld/c$c;

    invoke-virtual {p1, p2}, Lgg/s;->D(Lkg/f;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->l()Lgg/b;

    move-result-object p1

    const-string p2, "cache(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lld/c;->i:Lgg/b;

    return-void
.end method

.method public static final synthetic c(Lld/c;)LP7/a;
    .locals 0

    iget-object p0, p0, Lld/c;->a:LP7/a;

    return-object p0
.end method

.method public static final synthetic d(Lld/c;)LQ7/a;
    .locals 0

    iget-object p0, p0, Lld/c;->b:LQ7/a;

    return-object p0
.end method

.method public static final synthetic e(Lld/c;)Lcom/ui/wifiman/model/support/a;
    .locals 0

    iget-object p0, p0, Lld/c;->c:Lcom/ui/wifiman/model/support/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lld/c;->e:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 1

    iget-object v0, p0, Lld/c;->i:Lgg/b;

    return-object v0
.end method
