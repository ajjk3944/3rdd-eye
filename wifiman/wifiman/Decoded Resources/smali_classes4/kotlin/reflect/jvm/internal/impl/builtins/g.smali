.class public final Lkotlin/reflect/jvm/internal/impl/builtins/g;
.super Lkotlin/reflect/jvm/internal/impl/builtins/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/builtins/g$a;
    }
.end annotation


# static fields
.field public static final h:Lkotlin/reflect/jvm/internal/impl/builtins/g$a;

.field private static final i:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/g;->h:Lkotlin/reflect/jvm/internal/impl/builtins/g$a;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/f;->a:Lkotlin/reflect/jvm/internal/impl/builtins/f;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/g;->i:LYg/m;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    new-instance v0, Loi/f;

    const-string v1, "DefaultBuiltIns"

    invoke-direct {v0, v1}, Loi/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;-><init>(Loi/n;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->f(Z)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/g;-><init>(Z)V

    return-void
.end method

.method private static final F0()Lkotlin/reflect/jvm/internal/impl/builtins/g;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/g;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lkotlin/reflect/jvm/internal/impl/builtins/g;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final synthetic G0()LYg/m;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/g;->i:LYg/m;

    return-object v0
.end method

.method static synthetic H0()Lkotlin/reflect/jvm/internal/impl/builtins/g;
    .locals 1

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/builtins/g;->F0()Lkotlin/reflect/jvm/internal/impl/builtins/g;

    move-result-object v0

    return-object v0
.end method
