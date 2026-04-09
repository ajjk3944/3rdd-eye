.class public final Lw8/A;
.super Lcom/ui/wifiman/ui/settings/preferences/o;
.source "SourceFile"


# static fields
.field static final synthetic j:[Lth/l;

.field public static final k:I


# instance fields
.field private final g:Lorg/kodein/di/DI;

.field private final h:LYg/m;

.field private final i:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lw8/A;

    const-string/jumbo v2, "viewRouter"

    const-string/jumbo v3, "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    const-string/jumbo v3, "context"

    const-string/jumbo v5, "getContext()Landroid/content/Context;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lw8/A;->j:[Lth/l;

    const/16 v0, 0x8

    sput v0, Lw8/A;->k:I

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;)V
    .locals 4

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/ui/settings/preferences/o;-><init>()V

    iput-object p1, p0, Lw8/A;->g:Lorg/kodein/di/DI;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v0, Lw8/A$a;

    invoke-direct {v0}, Lw8/A$a;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    const-string/jumbo v1, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Li8/a;

    invoke-direct {p1, v0, v2}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    sget-object v2, Lw8/A;->j:[Lth/l;

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-interface {p1, p0, v3}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/A;->h:LYg/m;

    new-instance p1, Lorg/kodein/type/d;

    new-instance v3, Lw8/A$b;

    invoke-direct {v3}, Lw8/A$b;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Landroid/content/Context;

    invoke-direct {p1, v3, v1}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-static {p0, p1, v0}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object p1

    const/4 v0, 0x1

    aget-object v0, v2, v0

    invoke-interface {p1, p0, v0}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lw8/A;->i:LYg/m;

    return-void
.end method

.method public static synthetic o0(Lw8/A;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lw8/A;->r0(Lw8/A;Ljava/lang/Integer;)V

    return-void
.end method

.method private final p0()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lw8/A;->i:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0
.end method

.method private final q0()Li8/a;
    .locals 1

    iget-object v0, p0, Lw8/A;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li8/a;

    return-object v0
.end method

.method private static final r0(Lw8/A;Ljava/lang/Integer;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v0, :cond_a

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v1, :cond_2

    goto :goto_7

    :cond_2
    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x3e8

    if-eq v1, v3, :cond_9

    :goto_2
    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x3e9

    if-eq v1, v3, :cond_9

    :goto_3
    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x3ea

    if-eq v1, v3, :cond_9

    :goto_4
    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x3eb

    if-eq v1, v3, :cond_9

    :goto_5
    if-nez p1, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x3ec

    if-eq v1, v3, :cond_9

    :goto_6
    if-nez p1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v3, 0x3ed

    if-ne v1, v3, :cond_b

    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Teleport Quick Action Explanation - failed to add tile because of : "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x6

    invoke-static {p1, v2, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_8

    :cond_a
    :goto_7
    const-string/jumbo p1, "Teleport Quick Action Explanation - tile added"

    invoke-static {p1, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_b
    :goto_8
    sget-object p1, Lye/d;->a:Lye/d;

    invoke-direct {p0}, Lw8/A;->q0()Li8/a;

    move-result-object v1

    new-array v0, v0, [Li8/a$b;

    sget-object v2, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-interface {v1, v0}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lye/d;->d(Lgg/b;Lye/g;)V

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    iget-object v0, p0, Lw8/A;->g:Lorg/kodein/di/DI;

    return-object v0
.end method

.method public n0()V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lw8/A;->p0()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lw8/v;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lw8/w;->a(Ljava/lang/Object;)Landroid/app/StatusBarManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    invoke-direct {p0}, Lw8/A;->p0()Landroid/content/Context;

    move-result-object v0

    const-class v3, Lcom/ui/wifiman/quicksettings/TeleportTileService;

    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-direct {p0}, Lw8/A;->p0()Landroid/content/Context;

    move-result-object v0

    const v3, 0x7f110300

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lw8/A;->p0()Landroid/content/Context;

    move-result-object v0

    const v4, 0x7f070396

    invoke-static {v0, v4}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v4

    invoke-direct {p0}, Lw8/A;->p0()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw8/x;->a(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v5

    new-instance v6, Lw8/z;

    invoke-direct {v6, p0}, Lw8/z;-><init>(Lw8/A;)V

    invoke-static/range {v1 .. v6}, Lw8/y;->a(Landroid/app/StatusBarManager;Landroid/content/ComponentName;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method
