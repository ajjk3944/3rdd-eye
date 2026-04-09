.class public final Lv8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field private final a:Lde/n;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LSd/d;Lde/n;)V
    .locals 1

    const-string/jumbo v0, "localConsole"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "visibilityManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv8/b;->a:Lde/n;

    invoke-interface {p1}, LSd/d;->c()Lgg/i;

    move-result-object p2

    sget-object v0, Lv8/b$e;->a:Lv8/b$e;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lv8/b;->b:Lgg/i;

    new-instance v0, Lv8/b$h;

    invoke-direct {v0, p0}, Lv8/b$h;-><init>(Lv8/b;)V

    invoke-virtual {p2, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string/jumbo v0, "switchMap(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lv8/b;->c:Lgg/i;

    invoke-interface {p1}, LSd/d;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Lv8/b$a;->a:Lv8/b$a;

    invoke-static {p1, p2, v0}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p2, Lv8/b$b;->a:Lv8/b$b;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lv8/b;->d:Lgg/i;

    return-void
.end method

.method public static final synthetic c(Lv8/b;)Lde/n;
    .locals 0

    iget-object p0, p0, Lv8/b;->a:Lde/n;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lv8/b;->d:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 2

    iget-object v0, p0, Lv8/b;->b:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lv8/b$f;->a:Lv8/b$f;

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Lv8/b$g;

    invoke-direct {v1, p0}, Lv8/b$g;-><init>(Lv8/b;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public dismiss()Lgg/b;
    .locals 2

    iget-object v0, p0, Lv8/b;->b:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lv8/b$c;->a:Lv8/b$c;

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object v0

    new-instance v1, Lv8/b$d;

    invoke-direct {v1, p0}, Lv8/b$d;-><init>(Lv8/b;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "flatMapCompletable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
