.class public final Lsd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsd/b$a;
    }
.end annotation


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method public constructor <init>(Ljd/b;LSd/d;)V
    .locals 3

    const-string v0, "topologyService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localConsoleService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ljd/b;->d()Lgg/i;

    move-result-object p1

    sget-object v0, Lsd/b$g;->a:Lsd/b$g;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsd/b;->a:Lgg/i;

    sget-object v0, Lsd/b$f;->a:Lsd/b$f;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const-string v1, "distinctUntilChanged(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lsd/b;->b:Lgg/i;

    sget-object v0, Lsd/b$e;->a:Lsd/b$e;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsd/b;->c:Lgg/i;

    invoke-interface {p2}, LSd/d;->b()Lgg/i;

    move-result-object v0

    new-instance v2, Lsd/b$d;

    invoke-direct {v2, p0}, Lsd/b$d;-><init>(Lsd/b;)V

    invoke-virtual {v0, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lsd/b;->d:Lgg/i;

    invoke-interface {p2}, LSd/d;->b()Lgg/i;

    move-result-object p2

    sget-object v2, Lsd/b$h;->a:Lsd/b$h;

    invoke-virtual {p2, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lsd/b;->e:Lgg/i;

    sget-object v1, Lsd/b$b;->a:Lsd/b$b;

    invoke-static {p1, v0, p2, v1}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p2, Lsd/b$c;->a:Lsd/b$c;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lsd/b;->f:Lgg/i;

    return-void
.end method

.method public static final synthetic b(Lsd/b;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lsd/b;->b:Lgg/i;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lsd/b;->f:Lgg/i;

    return-object v0
.end method
