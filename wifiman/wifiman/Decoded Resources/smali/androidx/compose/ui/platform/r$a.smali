.class public final Landroidx/compose/ui/platform/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/platform/r$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/ui/platform/r$a;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r$a;->b()Z

    move-result p0

    return p0
.end method

.method private final b()Z
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Landroidx/compose/ui/platform/r;->P()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "android.os.SystemProperties"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/r;->Z(Ljava/lang/Class;)V

    invoke-static {}, Landroidx/compose/ui/platform/r;->P()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v3, "getBoolean"

    const-class v4, Ljava/lang/String;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Landroidx/compose/ui/platform/r;->W(Ljava/lang/reflect/Method;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/r;->L()Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v3, "debug.layout"

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    return v0
.end method
