.class public Landroidx/lifecycle/P;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/P$a;,
        Landroidx/lifecycle/P$b;,
        Landroidx/lifecycle/P$c;,
        Landroidx/lifecycle/P$d;,
        Landroidx/lifecycle/P$e;
    }
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/P$b;

.field public static final c:Lb2/a$b;


# instance fields
.field private final a:Lb2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/P$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/P$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/lifecycle/P;->b:Landroidx/lifecycle/P$b;

    sget-object v0, Ld2/g$a;->a:Ld2/g$a;

    sput-object v0, Landroidx/lifecycle/P;->c:Lb2/a$b;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;)V
    .locals 7

    .line 1
    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lb2/d;

    invoke-direct {v0, p1, p2, p3}, Lb2/d;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V

    invoke-direct {p0, v0}, Landroidx/lifecycle/P;-><init>(Lb2/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 4
    sget-object p3, Lb2/a$a;->b:Lb2/a$a;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-interface {p1}, Landroidx/lifecycle/S;->o()Landroidx/lifecycle/Q;

    move-result-object v0

    .line 8
    sget-object v1, Ld2/g;->a:Ld2/g;

    invoke-virtual {v1, p1}, Ld2/g;->a(Landroidx/lifecycle/S;)Lb2/a;

    move-result-object p1

    .line 9
    invoke-direct {p0, v0, p2, p1}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V

    return-void
.end method

.method private constructor <init>(Lb2/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/P;->a:Lb2/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/N;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Llh/a;->e(Ljava/lang/Class;)Lth/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/P;->d(Lth/d;)Landroidx/lifecycle/N;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/N;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/P;->a:Lb2/d;

    invoke-static {p2}, Llh/a;->e(Ljava/lang/Class;)Lth/d;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lb2/d;->a(Lth/d;Ljava/lang/String;)Landroidx/lifecycle/N;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Lth/d;)Landroidx/lifecycle/N;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/P;->a:Lb2/d;

    invoke-virtual {v0, p2, p1}, Lb2/d;->a(Lth/d;Ljava/lang/String;)Landroidx/lifecycle/N;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lth/d;)Landroidx/lifecycle/N;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/P;->a:Lb2/d;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lb2/d;->b(Lb2/d;Lth/d;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/N;

    move-result-object p1

    return-object p1
.end method
