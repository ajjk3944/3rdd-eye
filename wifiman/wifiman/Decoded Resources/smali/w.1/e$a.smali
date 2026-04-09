.class final Lw/e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/e$a;

    invoke-direct {v0}, Lw/e$a;-><init>()V

    sput-object v0, Lw/e$a;->a:Lw/e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/v;)Lw/d;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/v;->m(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "android.software.leanback"

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lw/d;->a:Lw/d$a;

    invoke-virtual {p1}, Lw/d$a;->b()Lw/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lw/e;->b()Lw/d;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/v;

    invoke-virtual {p0, p1}, Lw/e$a;->a(LT/v;)Lw/d;

    move-result-object p1

    return-object p1
.end method
