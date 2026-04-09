.class public final Ln8/h;
.super Ln8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/h$a;
    }
.end annotation


# static fields
.field static final synthetic d0:[Lth/l;

.field public static final e0:I


# instance fields
.field private final S:LYg/m;

.field private final T:LYg/m;

.field private final U:Z

.field private final V:Z

.field private final W:Lgg/i;

.field private final X:Lgg/i;

.field private final Y:Lgg/i;

.field private final Z:Z

.field private final a0:Lgg/i;

.field private final b0:Lgg/i;

.field private final c0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Ln8/h;

    const-string/jumbo v2, "cellSignal"

    const-string/jumbo v3, "getCellSignal()Lcom/ui/wifiman/model/cellular/CellularSignalService;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "networkConnection"

    const-string/jumbo v5, "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ln8/h;->d0:[Lth/l;

    const/16 v0, 0x8

    sput v0, Ln8/h;->e0:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 5

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln8/h$a;

    invoke-direct {v0, p1}, Ln8/h$a;-><init>(Lorg/kodein/di/DI;)V

    invoke-direct {p0, p1, v0}, Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V

    new-instance v0, Lorg/kodein/type/d;

    new-instance v1, Ln8/h$e;

    invoke-direct {v1}, Ln8/h$e;-><init>()V

    invoke-virtual {v1}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v1

    const-string/jumbo v2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LBc/a;

    invoke-direct {v0, v1, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v0

    sget-object v3, Ln8/h;->d0:[Lth/l;

    const/4 v4, 0x0

    aget-object v4, v3, v4

    invoke-interface {v0, p0, v4}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Ln8/h;->S:LYg/m;

    new-instance v0, Lorg/kodein/type/d;

    new-instance v4, Ln8/h$f;

    invoke-direct {v4}, Ln8/h$f;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, LZc/f;

    invoke-direct {v0, v4, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p1, v0, v1}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v0, v3, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Ln8/h;->T:LYg/m;

    new-instance p1, Ll9/a;

    new-instance v0, Ls9/d$b;

    const v1, 0x7f1100b4

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/h;->W:Lgg/i;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/h;->X:Lgg/i;

    invoke-direct {p0}, Ln8/h;->J()LBc/a;

    move-result-object p1

    invoke-interface {p1}, LBc/a;->e()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, Ln8/h;->J()LBc/a;

    move-result-object v1

    invoke-interface {v1}, LBc/a;->d()Lgg/i;

    move-result-object v1

    new-instance v2, Ln8/h$b;

    invoke-direct {v2, p0}, Ln8/h$b;-><init>(Ln8/h;)V

    invoke-static {p1, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "distinctUntilChanged(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/h;->Y:Lgg/i;

    invoke-super {p0}, Ln8/a;->x()Lgg/i;

    move-result-object p1

    invoke-direct {p0}, Ln8/h;->K()LZc/f;

    move-result-object v2

    invoke-interface {v2}, LZc/f;->getState()Lgg/i;

    move-result-object v2

    sget-object v3, Ln8/h$c;->a:Ln8/h$c;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    new-instance v3, Ln8/h$d;

    invoke-direct {v3, p0}, Ln8/h$d;-><init>(Ln8/h;)V

    invoke-static {p1, v2, v3}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/h;->a0:Lgg/i;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln8/h;->b0:Lgg/i;

    return-void
.end method

.method private final J()LBc/a;
    .locals 1

    iget-object v0, p0, Ln8/h;->S:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBc/a;

    return-object v0
.end method

.method private final K()LZc/f;
    .locals 1

    iget-object v0, p0, Ln8/h;->T:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/f;

    return-object v0
.end method


# virtual methods
.method protected B()Z
    .locals 1

    iget-boolean v0, p0, Ln8/h;->Z:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Ln8/h;->c0:Z

    return v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/h;->W:Lgg/i;

    return-object v0
.end method

.method public f()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/h;->b0:Lgg/i;

    return-object v0
.end method

.method protected s()Z
    .locals 1

    iget-boolean v0, p0, Ln8/h;->V:Z

    return v0
.end method

.method public v()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/h;->X:Lgg/i;

    return-object v0
.end method

.method public w()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/h;->Y:Lgg/i;

    return-object v0
.end method

.method protected x()Lgg/i;
    .locals 1

    iget-object v0, p0, Ln8/h;->a0:Lgg/i;

    return-object v0
.end method

.method protected y()Z
    .locals 1

    iget-boolean v0, p0, Ln8/h;->U:Z

    return v0
.end method
