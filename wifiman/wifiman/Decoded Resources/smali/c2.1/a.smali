.class public final Lc2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc2/a;

.field private static final b:LT/H0;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc2/a;

    invoke-direct {v0}, Lc2/a;-><init>()V

    sput-object v0, Lc2/a;->a:Lc2/a;

    sget-object v0, Lc2/a$a;->a:Lc2/a$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, Lc2/a;->b:LT/H0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Landroidx/lifecycle/S;
    .locals 3

    const v0, -0x22d19e38

    invoke-interface {p1, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lc2/a;->b:LT/H0;

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/lifecycle/S;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lc2/b;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object p2

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->P()V

    return-object p2
.end method

.method public final b(Landroidx/lifecycle/S;)LT/I0;
    .locals 1

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc2/a;->b:LT/H0;

    invoke-virtual {v0, p1}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p1

    return-object p1
.end method
